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
	Dim nameRG As String
	Dim facilityMap As Map
	Dim isFiltered As Boolean = False
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private PanelRG As Panel
	Private WebViewRG As WebView
	Private BtnBack As Button
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnUserLoc As Button
	Private btnObj As Button
	Private edtSearchRG As EditText
	Private PanelSearch As Panel
	Private btnList As Button
	Private PanelRating As Panel
	Private spinRating As Spinner
	Private PanelFacility As Panel
	Private spinFacility As Spinner
	Private PanelCategory As Panel
	Private spinCategory As Spinner
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	Starter.mapStatus = "RG"
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsRG")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewRG.Height = MainScroll.Height
	PanelRG.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	MyWebViewExtras.addWebChromeClient(WebViewRG, "WebViewRG")
	WebViewRG.JavaScriptEnabled = True
	WebViewRG.LoadUrl(Main.server&"web/rumahGadang/maps")
	
	PanelSearch.Visible = False
	btnObj.Visible = False
	btnUserLoc.Visible = False
	btnList.Visible = False
	PanelRating.Visible = False
	PanelFacility.Visible = False
	PanelCategory.Visible = False
	
	spinRating.DropdownBackgroundColor = Colors.White
	spinFacility.DropdownBackgroundColor = Colors.White
	spinCategory.DropdownBackgroundColor = Colors.White
	
	spinRating.AddAll(Array As String("Rating...", "1", "2", "3", "4", "5"))
	Core.ExecuteUrlGet(Main.API&"facility", "LoadFacility", Me)
	spinCategory.AddAll(Array As String("Category...", "Homestay", "Tidak Homestay"))
End Sub

Sub Activity_Resume
	Log("MapsRG Loaded")	
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
	Log("Update user position on Maps Rumah Gadang")
	Log("Lat: "&Starter.lat&"; Long: "&Starter.lng)
	Dim userPosition As String
	userPosition = "userPositionAPI("&Starter.lat&", "&Starter.lng&")"
	MyWebViewExtras.executeJavascript(WebViewRG, userPosition)
End Sub

Sub WebViewRG_ProgressChanged(loading As Int)
	If loading == 100 Then
		Log("Webview loaded")
		Starter.webviewLoading = loading
		PanelSearch.Visible = True
		btnObj.Visible = True
		btnUserLoc.Visible = True
		btnList.Visible = True
		PanelRating.Visible = True
		PanelFacility.Visible = True
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
	MyWebViewExtras.executeJavascript(WebViewRG, panToUser)
End Sub

Private Sub btnObj_Click
	Log("Pan to Rumah Gadang")
	Dim boundToObject As String
	If isFiltered Then
		boundToObject = "findRG('')"
		isFiltered = False
		spinRating.SelectedIndex = 0
		spinFacility.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		edtSearchRG.Text = ""
	Else
		boundToObject = "boundToObject(false)"
	End If
	MyWebViewExtras.executeJavascript(WebViewRG, boundToObject)
End Sub

Private Sub edtSearchRG_EnterPressed
	nameRG = edtSearchRG.Text
	FindRG
End Sub

Sub FindRG
	spinRating.SelectedIndex = 0
	spinFacility.SelectedIndex = 0
	spinCategory.SelectedIndex = 0
	isFiltered = True
	
	Log("Searching '"&nameRG&"' on maps")
	Dim searchRG As String
	searchRG = "findRG('"&nameRG&"')"
	MyWebViewExtras.executeJavascript(WebViewRG, searchRG)
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		
		Select Job.JobName
			Case "LoadFacility"
				Try
					Dim map As Map
					map = parser.NextObject
					Dim data As List
					data = map.Get("data")
					facilityMap.Initialize
					spinFacility.Add("Facility...")
					For i = 0 To data.Size - 1
						Dim facility As Map
						facility = data.Get(i)
						facilityMap.Put(facility.Get("facility"), facility.Get("id"))
						spinFacility.Add(facility.Get("facility"))
					Next
				Catch
					Log(LastException)
				End Try
		End Select
	End If
End Sub

Private Sub WebViewRG_PageFinished (Url As String)
	
End Sub

Private Sub btnList_Click
	Log("Redirect to ListRG activity")
	StartActivity(ListRG)
End Sub

Private Sub spinRating_ItemClick (Position As Int, Value As Object)
	Dim findByRatingRG As String
	If Position == 0 Then
		MsgboxAsync("Please choose rating from 1-5", "Search by Rating")
		isFiltered = False
		edtSearchRG.Text = ""
		spinFacility.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		
		findByRatingRG = "findRG('')"
		MyWebViewExtras.executeJavascript(WebViewRG, findByRatingRG)
	Else
		edtSearchRG.Text = ""
		spinFacility.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		isFiltered = True
		
		Log("Searching RG with "&Value&" rating")
		findByRatingRG = "findByRatingRG('"&Value&"')"
		MyWebViewExtras.executeJavascript(WebViewRG, findByRatingRG)
	End If
End Sub

Private Sub spinFacility_ItemClick (Position As Int, Value As Object)
	Dim findByFacilityRG As String
	If Position == 0 Then
		MsgboxAsync("Please choose facility", "Search by Facility")
		isFiltered = False
		edtSearchRG.Text = ""
		spinRating.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		
		findByFacilityRG = "findRG('')"
		MyWebViewExtras.executeJavascript(WebViewRG, findByFacilityRG)
	Else
		edtSearchRG.Text = ""
		spinRating.SelectedIndex = 0
		spinCategory.SelectedIndex = 0
		isFiltered = True
		
		Log("Searching RG with facility: "&Value)
		findByFacilityRG = "findByFacilityRG('"&facilityMap.Get(Value)&"')"
		MyWebViewExtras.executeJavascript(WebViewRG, findByFacilityRG)
	End If
End Sub

Private Sub spinCategory_ItemClick (Position As Int, Value As Object)
	Dim findByCategoryRG As String
	If Position == 0 Then
		MsgboxAsync("Please choose category", "Search by Category")
		isFiltered = False
		edtSearchRG.Text = ""
		spinFacility.SelectedIndex = 0
		spinRating.SelectedIndex = 0
		
		findByCategoryRG = "findRG('')"
		MyWebViewExtras.executeJavascript(WebViewRG, findByCategoryRG)
	Else
		edtSearchRG.Text = ""
		spinFacility.SelectedIndex = 0
		spinRating.SelectedIndex = 0
		isFiltered = True
		
		Log("Searching RG with category: "&Value)
		findByCategoryRG = "findByCategoryRG('"&Value&"')"
		MyWebViewExtras.executeJavascript(WebViewRG, findByCategoryRG)
	End If
End Sub