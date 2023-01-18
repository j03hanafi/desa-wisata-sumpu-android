package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homeuser_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(256);
homeuser.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeUser\")";
Debug.ShouldStop(512);
homeuser.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeUser")),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="PanelHome.Height = MainScroll.Height";
Debug.ShouldStop(1024);
homeuser.mostCurrent._panelhome.runMethod(true,"setHeight",homeuser.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 44;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(2048);
homeuser.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",homeuser.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 45;BA.debugLine="TitleNavbar.Text=\"Home User\"";
Debug.ShouldStop(4096);
homeuser.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("Home User"));
 BA.debugLineNum = 46;BA.debugLine="BtnBack.Visible = False";
Debug.ShouldStop(8192);
homeuser.mostCurrent._btnback.runMethod(true,"setVisible",homeuser.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,55);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Log(\"HomeUser loaded\")";
Debug.ShouldStop(262144);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56291457",RemoteObject.createImmutable("HomeUser loaded"),0);
 BA.debugLineNum = 52;BA.debugLine="Core.ExecuteUrl(Main.API&\"profile\", \"id=\"&Main.ma";
Debug.ShouldStop(524288);
homeuser.mostCurrent._core.runVoidMethod ("_executeurl" /*RemoteObject*/ ,homeuser.mostCurrent.activityBA,(Object)(RemoteObject.concat(homeuser.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("profile"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("id="),homeuser.mostCurrent._main._manager /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id"))))),(Object)(BA.ObjectToString("Profile")),(Object)(homeuser.getObject()));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnev_click() throws Exception{
try {
		Debug.PushSubsStack("BtnEV_Click (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,141);
if (RapidSub.canDelegate("btnev_click")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","btnev_click");}
 BA.debugLineNum = 141;BA.debugLine="Private Sub BtnEV_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Log(\"Redirect to MapsEV Activity\")";
Debug.ShouldStop(8192);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56619137",RemoteObject.createImmutable("Redirect to MapsEV Activity"),0);
 BA.debugLineNum = 143;BA.debugLine="StartActivity(MapsEV)";
Debug.ShouldStop(16384);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._mapsev.getObject())));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogout_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogout_Click (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,135);
if (RapidSub.canDelegate("btnlogout_click")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","btnlogout_click");}
 BA.debugLineNum = 135;BA.debugLine="Private Sub BtnLogout_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Log(\"Redirect to Main Activity\")";
Debug.ShouldStop(128);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56553601",RemoteObject.createImmutable("Redirect to Main Activity"),0);
 BA.debugLineNum = 138;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"logout\", \"Logout\", M";
Debug.ShouldStop(512);
homeuser.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,homeuser.mostCurrent.activityBA,(Object)(RemoteObject.concat(homeuser.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("logout"))),(Object)(BA.ObjectToString("Logout")),(Object)(homeuser.getObject()));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrg_click() throws Exception{
try {
		Debug.PushSubsStack("BtnRG_Click (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,130);
if (RapidSub.canDelegate("btnrg_click")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","btnrg_click");}
 BA.debugLineNum = 130;BA.debugLine="Private Sub BtnRG_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Log(\"Redirect to MapsRG Activity\")";
Debug.ShouldStop(4);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56488065",RemoteObject.createImmutable("Redirect to MapsRG Activity"),0);
 BA.debugLineNum = 132;BA.debugLine="StartActivity(MapsRG)";
Debug.ShouldStop(8);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._mapsrg.getObject())));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private LabelHeader As Label";
homeuser.mostCurrent._labelheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelLogout As Label";
homeuser.mostCurrent._labellogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LabelName As Label";
homeuser.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelUsername As Label";
homeuser.mostCurrent._labelusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelBanner As Panel";
homeuser.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelHome As Panel";
homeuser.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PanelMenu As Panel";
homeuser.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelProfile As Panel";
homeuser.mostCurrent._panelprofile = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ProfileAvatar As ImageView";
homeuser.mostCurrent._profileavatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BtnBack As Button";
homeuser.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private MainScroll As ScrollView";
homeuser.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Navbar As Panel";
homeuser.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private TitleNavbar As Label";
homeuser.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnEV As Button";
homeuser.mostCurrent._btnev = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnLogout As Button";
homeuser.mostCurrent._btnlogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private BtnRG As Button";
homeuser.mostCurrent._btnrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LabelEV As Label";
homeuser.mostCurrent._labelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LabelRG As Label";
homeuser.mostCurrent._labelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homeuser) ","homeuser",9,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,59);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSumpu.homeuser.remoteMe.runUserSub(false, "homeuser","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _avatarmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _avatarpath = RemoteObject.createImmutable("");
RemoteObject _errorparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 59;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(134217728);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56422529",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 61;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(268435456);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="Dim res As String";
Debug.ShouldStop(536870912);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 63;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(1073741824);
_res = _job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 64;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 65;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 66;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(2);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56422535",RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res),0);
 BA.debugLineNum = 67;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("Profile"),BA.ObjectToString("Logout"))) {
case 0: {
 BA.debugLineNum = 69;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 71;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 72;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(128);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 73;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(256);
homeuser._data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));
 BA.debugLineNum = 74;BA.debugLine="id = data.Get(\"id\")";
Debug.ShouldStop(512);
homeuser._id = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 75;BA.debugLine="email = data.Get(\"email\")";
Debug.ShouldStop(1024);
homeuser._email = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));
 BA.debugLineNum = 76;BA.debugLine="username = data.Get(\"username\")";
Debug.ShouldStop(2048);
homeuser._username = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 77;BA.debugLine="first_name = data.Get(\"first_name\")";
Debug.ShouldStop(4096);
homeuser._first_name = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("first_name")))));
 BA.debugLineNum = 78;BA.debugLine="last_name = data.Get(\"last_name\")";
Debug.ShouldStop(8192);
homeuser._last_name = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("last_name")))));
 BA.debugLineNum = 79;BA.debugLine="avatar = data.Get(\"avatar\")";
Debug.ShouldStop(16384);
homeuser._avatar = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));
 BA.debugLineNum = 80;BA.debugLine="address = data.Get(\"address\")";
Debug.ShouldStop(32768);
homeuser._address = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));
 BA.debugLineNum = 81;BA.debugLine="phone = data.Get(\"phone\")";
Debug.ShouldStop(65536);
homeuser._phone = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))));
 BA.debugLineNum = 83;BA.debugLine="LabelName.Text = first_name&\" \"&last_name";
Debug.ShouldStop(262144);
homeuser.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(homeuser._first_name,RemoteObject.createImmutable(" "),homeuser._last_name)));
 BA.debugLineNum = 84;BA.debugLine="LabelUsername.Text = \"@\"&username";
Debug.ShouldStop(524288);
homeuser.mostCurrent._labelusername.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("@"),homeuser._username)));
 BA.debugLineNum = 86;BA.debugLine="Dim avatarMap As Map";
Debug.ShouldStop(2097152);
_avatarmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("avatarMap", _avatarmap);
 BA.debugLineNum = 87;BA.debugLine="Dim avatarPath As String";
Debug.ShouldStop(4194304);
_avatarpath = RemoteObject.createImmutable("");Debug.locals.put("avatarPath", _avatarpath);
 BA.debugLineNum = 88;BA.debugLine="avatarPath = Main.server & \"media/photos/\" &a";
Debug.ShouldStop(8388608);
_avatarpath = RemoteObject.concat(homeuser.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("media/photos/"),homeuser._avatar);Debug.locals.put("avatarPath", _avatarpath);
 BA.debugLineNum = 89;BA.debugLine="avatarMap.Initialize";
Debug.ShouldStop(16777216);
_avatarmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 90;BA.debugLine="avatarMap.Put(ProfileAvatar, avatarPath)";
Debug.ShouldStop(33554432);
_avatarmap.runVoidMethod ("Put",(Object)((homeuser.mostCurrent._profileavatar.getObject())),(Object)((_avatarpath)));
 BA.debugLineNum = 91;BA.debugLine="CallSubDelayed2(Starter, \"Download\", avatarMa";
Debug.ShouldStop(67108864);
homeuser.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",homeuser.processBA,(Object)((homeuser.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_avatarmap)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e31) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeuser.processBA, e31.toString()); BA.debugLineNum = 93;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56422562",BA.ObjectToString(homeuser.mostCurrent.__c.runMethod(false,"LastException",homeuser.mostCurrent.activityBA)),0);
 };
 break; }
case 1: {
 BA.debugLineNum = 97;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 98;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 99;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(4);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 100;BA.debugLine="status = map.Get(\"status\")";
Debug.ShouldStop(8);
homeuser._status = BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));
 BA.debugLineNum = 101;BA.debugLine="If status == 200 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",homeuser._status,BA.numberCast(double.class, 200))) { 
 BA.debugLineNum = 102;BA.debugLine="Msgbox(\"Successfully logged out\", \"Log Out\")";
Debug.ShouldStop(32);
homeuser.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Successfully logged out")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Log Out"))),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 103;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(64);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 104;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(128);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 105;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(256);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 106;BA.debugLine="Log(\"Successfully logged out\")";
Debug.ShouldStop(512);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56422575",RemoteObject.createImmutable("Successfully logged out"),0);
 BA.debugLineNum = 107;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
homeuser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 108;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(2048);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._main.getObject())));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e48) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeuser.processBA, e48.toString()); BA.debugLineNum = 111;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56422580",BA.ObjectToString(homeuser.mostCurrent.__c.runMethod(false,"LastException",homeuser.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 116;BA.debugLine="Dim errorParser As JSONParser";
Debug.ShouldStop(524288);
_errorparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("errorParser", _errorparser);
 BA.debugLineNum = 117;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
Debug.ShouldStop(1048576);
_errorparser.runVoidMethod ("Initialize",(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 119;BA.debugLine="Dim errorMap As Map";
Debug.ShouldStop(4194304);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 120;BA.debugLine="errorMap = errorParser.NextObject";
Debug.ShouldStop(8388608);
_errormap = _errorparser.runMethod(false,"NextObject");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 121;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","56422590",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 123;BA.debugLine="Dim error As String";
Debug.ShouldStop(67108864);
_error = RemoteObject.createImmutable("");Debug.locals.put("error", _error);
 BA.debugLineNum = 124;BA.debugLine="error = errorMap.Get(\"message\")";
Debug.ShouldStop(134217728);
_error = BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("error", _error);
 BA.debugLineNum = 125;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
Debug.ShouldStop(268435456);
homeuser.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_error))),(Object)(homeuser.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 127;BA.debugLine="Job.Release";
Debug.ShouldStop(1073741824);
_job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public data As Map";
homeuser._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Public id, username, email, first_name, last_name";
homeuser._id = RemoteObject.createImmutable("");
homeuser._username = RemoteObject.createImmutable("");
homeuser._email = RemoteObject.createImmutable("");
homeuser._first_name = RemoteObject.createImmutable("");
homeuser._last_name = RemoteObject.createImmutable("");
homeuser._avatar = RemoteObject.createImmutable("");
homeuser._address = RemoteObject.createImmutable("");
homeuser._phone = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public status As Int";
homeuser._status = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}