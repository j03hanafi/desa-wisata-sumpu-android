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
	Public data As Map
	Public id, username, email, first_name, last_name, avatar, address, phone As String
	Public status As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private LabelHeader As Label
	Private LabelLogout As Label
	Private LabelName As Label
	Private LabelUsername As Label
	Private PanelBanner As Panel
	Private PanelHome As Panel
	Private PanelMenu As Panel
	Private PanelProfile As Panel
	Private ProfileAvatar As ImageView
	Private BtnBack As Button
	Private MainScroll As ScrollView
	Private Navbar As Panel
	Private TitleNavbar As Label
	Private BtnEV As Button
	Private BtnLogout As Button
	Private BtnRG As Button
	Private LabelEV As Label
	Private LabelRG As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("HomeUser")
	PanelHome.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text="Home User"
	BtnBack.Visible = False

End Sub

Sub Activity_Resume
	Log("HomeUser loaded")
	Core.ExecuteUrl(Main.API&"profile", "id="&Main.manager.GetString("user_id"), "Profile", Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		Log("Response from server :"&res)
		Select Job.JobName
			Case "Profile"
				Try
					
					Dim map As Map
					map = parser.NextObject
					data = map.Get("data")
					id = data.Get("id")
					email = data.Get("email")
					username = data.Get("username")
					first_name = data.Get("first_name")
					last_name = data.Get("last_name")
					avatar = data.Get("avatar")
					address = data.Get("address")
					phone = data.Get("phone")
			
					LabelName.Text = first_name&" "&last_name
					LabelUsername.Text = "@"&username
			
					Dim avatarMap As Map
					Dim avatarPath As String
					avatarPath = Main.server & "media/photos/" &avatar
					avatarMap.Initialize
					avatarMap.Put(ProfileAvatar, avatarPath)
					CallSubDelayed2(Starter, "Download", avatarMap)
				Catch
					Log(LastException)
				End Try
				
			Case "Logout"
				Try
					Dim map As Map
					map = parser.NextObject
					status = map.Get("status")
					If status == 200 Then
						Msgbox("Successfully logged out", "Log Out")
						Main.manager.SetBoolean("is_login", False)
						Main.manager.SetBoolean("visitor", False)
						Main.manager.SetBoolean("user", False)
						Log("Successfully logged out")
						Activity.Finish
						StartActivity(Main)
					End If
				Catch
					Log(LastException)
				End Try
		End Select
		
	Else
		Dim errorParser As JSONParser
		errorParser.Initialize(Job.ErrorMessage)
		
		Dim errorMap As Map
		errorMap = errorParser.NextObject
		Log("Error: " & Job.ErrorMessage)
		
		Dim error As String
		error = errorMap.Get("message")
		ToastMessageShow("Error: " & error, True)
	End If
	Job.Release
End Sub

Private Sub BtnRG_Click
	Log("Redirect to MapsRG Activity")
	StartActivity(MapsRG)
End Sub

Private Sub BtnLogout_Click
	Log("Redirect to Main Activity")
	
	Core.ExecuteUrlGet(Main.API&"logout", "Logout", Me)
End Sub

Private Sub BtnEV_Click
	Log("Redirect to MapsEV Activity")
	StartActivity(MapsEV)
End Sub