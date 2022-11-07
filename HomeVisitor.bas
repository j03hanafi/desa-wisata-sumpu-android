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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private LabelHeader As Label
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
	Private BtnLogin As Button
	Private BtnRG As Button
	Private LabelEV As Label
	Private LabelLogin As Label
	Private LabelRG As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("HomeVisitor")
	PanelHome.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text="Home Visitor"
	BtnBack.Visible = False
	
End Sub

Sub Activity_Resume
	Log("HomeVisitor loaded")
	LabelName.Text = "Hello, Visitor"
	LabelUsername.Text = ""
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnRG_Click
	Log("Redirect to MapsRG Activity")
	StartActivity(MapsRG)
End Sub

Private Sub BtnLogin_Click
	Log("Redirect to Main Activity")
	
	Main.manager.SetBoolean("is_login", False)
	Main.manager.SetBoolean("visitor", False)
	Main.manager.SetBoolean("user", False)
	Activity.Finish
	StartActivity(Main)
End Sub

Private Sub BtnEV_Click
	Log("Redirect to MapsEV Activity")
	StartActivity(MapsEV)
End Sub