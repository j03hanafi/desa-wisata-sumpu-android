B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim nameEV As String
	Dim categoryMap As Map
	Dim isFiltered As Boolean = False
	Private XUI as XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private PanelEV As Panel
	Private WebViewEV As WebView
	Private BtnBack As Button
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnUserLoc As Button
	Private btnObj As Button
	Private edtSearchEV As EditText
	Private PanelSearch As Panel
	Private btnList As Button
	Private PanelCategory As Panel
	Private PanelDate As Panel
	Private PanelRating As Panel
	Private spinCategory As Spinner
	Private spinRating As Spinner
	Private btnDate As SwiftButton
	Private DateTemplate As B4XDateTemplate
	Private Dialog As B4XDialog
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Starter.mapStatus = "EV"
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsEV")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewEV.Height = MainScroll.Height
	PanelEV.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	MyWebViewExtras.addWebChromeClient(WebViewEV, "WebViewEV")
	WebViewEV.JavaScriptEnabled = True
	WebViewEV.LoadUrl(Main.server&"web/event/maps")
	
	PanelSearch.Visible = False
	btnObj.Visible = False
	btnUserLoc.Visible = False
	btnList.Visible = False
	PanelRating.Visible = False
	PanelDate.Visible = False
	PanelCategory.Visible = False
	
	spinRating.DropdownBackgroundColor = Colors.White
	spinCategory.DropdownBackgroundColor = Colors.White
	
	spinRating.AddAll(Array As String("Rating...", "1", "2", "3", "4", "5"))
	Core.ExecuteUrlGet(Main.API&"event/category", "LoadCategory", Me)
	Dialog.Initialize (Activity)
	Dialog.Title = "Select Date..."
	DateTemplate.Initialize
	DateTemplate.MinYear = 2000
	DateTemplate.MaxYear = 2050
	btnDate.xLBL.Text = "Date..."
End Sub

Sub Activity_Resume
	Log("MapsEV Loaded")
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent)
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then
			CallSubDelayed(Starter, "StartGPS")
		Else
			ToastMessageShow("Please allow GPS to run this appliation", True)
			Activity.Finish
		End If
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSubDelayed(Starter, "StopGPS")
End Sub

Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Starter.mapStatus = ""
	Activity.Finish
End Sub

Public Sub UpdateLocation
	Log("Update user position on Maps Event")
	Log("Lat: "&Starter.lat&"; Long: "&Starter.lng)
	Dim userPosition As String
	userPosition = "userPositionAPI("&Starter.lat&", "&Starter.lng&")"
	MyWebViewExtras.executeJavascript(WebViewEV, userPosition)
End Sub

Sub WebViewEV_ProgressChanged(loading As Int)
	If loading == 100 Then
		Log("Webview loaded")
		Starter.webviewLoading = loading
		PanelSearch.Visible = True
		btnObj.Visible = True
		btnUserLoc.Visible = True
		btnList.Visible = True
		PanelRating.Visible = True
		PanelDate.Visible = True
		PanelCategory.Visible = True
		UpdateLocation
	Else 
		Log("Webview loading at "&loading&"% ....")
	End If
End Sub

Private Sub btnUserLoc_Click
	Log("Panning to user location")
	UpdateLocation
	Dim panToUser As String = "panToUser()"
	MyWebViewExtras.executeJavascript(WebViewEV, panToUser)
End Sub

Private Sub btnObj_Click
	Log("Pan to Event")
	Dim boundToObject As String
	If isFiltered Then
		boundToObject = "findEV('')"
		isFiltered = False
		edtSearchEV.Text = ""
		spinRating.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		btnDate.xLBL.Text = "Date..."
	Else
		boundToObject = "boundToObject(false)"
	End If
	MyWebViewExtras.executeJavascript(WebViewEV, boundToObject)
End Sub


Private Sub edtSearchEV_EnterPressed
	nameEV = edtSearchEV.Text
	FindEV
End Sub

Sub FindEV
	spinRating.SelectedIndex = 0
	spinCategory.SelectedIndex = 0
	btnDate.xLBL.Text = "Date..."
	isFiltered = True
	
	Log("Searching '"&nameEV&"' on maps")
	Dim searchRG As String
	searchRG = "findEV('"&nameEV&"')"
	MyWebViewExtras.executeJavascript(WebViewEV, searchRG)
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		
		Select Job.JobName
			Case "LoadCategory"'
				Try
					Dim map As Map
					map = parser.NextObject
					Dim data As List
					data = map.Get("data")
					categoryMap.Initialize
					spinCategory.Add("Category...")
					For i = 0 To data.Size - 1
						Dim category As Map
						category = data.Get(i)
						categoryMap.Put(category.Get("category"), category.Get("id"))
						spinCategory.Add(category.Get("category"))
					Next
				Catch
					Log(LastException)
				End Try
		End Select
	End If
End Sub

Private Sub WebViewEV_PageFinished (Url As String)
	
End Sub

Private Sub btnList_Click
	Log("Redirect to ListEV activity")
	StartActivity(ListEV)
End Sub



Private Sub spinRating_ItemClick (Position As Int, Value As Object)
	Dim findByRatingEV As String
	If Position == 0 Then
		MsgboxAsync("Please choose rating from 1-5", "Search by Rating")
		isFiltered = False
		edtSearchEV.Text = ""
		spinCategory.SelectedIndex = 0
		btnDate.xLBL.Text = "Date..."
		
		findByRatingEV = "findEV('')"
		MyWebViewExtras.executeJavascript(WebViewEV, findByRatingEV)
	Else
		edtSearchEV.Text = ""
		spinCategory.SelectedIndex = 0
		btnDate.xLBL.Text = "Date..."
		isFiltered = True
		
		Log("Searching EV with "&Value&" rating")
		findByRatingEV = "findByRatingEV('"&Value&"')"
		MyWebViewExtras.executeJavascript(WebViewEV, findByRatingEV)
	End If
End Sub

Private Sub spinCategory_ItemClick (Position As Int, Value As Object)
	Dim findByCategoryEV As String
	If Position == 0 Then
		MsgboxAsync("Please choose category", "Search by Category")
		isFiltered = False
		edtSearchEV.Text = ""
		spinRating.SelectedIndex = 0
		btnDate.xLBL.Text = "Date..."
		
		findByCategoryEV = "findEV('')"
		MyWebViewExtras.executeJavascript(WebViewEV, findByCategoryEV)
	Else
		edtSearchEV.Text = ""
		spinRating.SelectedIndex = 0
		btnDate.xLBL.Text = "Date..."
		isFiltered = True
		
		Log("Searching EV with category: "&Value)
		findByCategoryEV = "findByCategoryEV('"&categoryMap.Get(Value)&"')"
		MyWebViewExtras.executeJavascript(WebViewEV, findByCategoryEV)
	End If
End Sub

Private Sub btnDate_Click
	Wait For (Dialog.ShowTemplate(DateTemplate, "", "", "Cancel")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Dim selectedDate As String
		Dim findByDateEV As String
		DateTime.DateFormat = "yyyy-MM-dd"
		selectedDate = DateTime.Date(DateTemplate.Date)
		btnDate.xLBL.Text = selectedDate
		
		edtSearchEV.Text = ""
		spinRating.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		isFiltered = True
		
		Log("Searching EV with date: "&selectedDate)
		findByDateEV = "findByDateEV('"&selectedDate&"')"
		MyWebViewExtras.executeJavascript(WebViewEV, findByDateEV)
	End If
End Sub