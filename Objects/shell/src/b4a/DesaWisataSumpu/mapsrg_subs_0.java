package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsrg_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 42;BA.debugLine="Starter.mapStatus = \"RG\"";
Debug.ShouldStop(512);
mapsrg.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("RG");
 BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1024);
mapsrg.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsrg.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsRG\")";
Debug.ShouldStop(2048);
mapsrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsRG")),mapsrg.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(4096);
mapsrg.mostCurrent._navbar.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",mapsrg.mostCurrent._navbar.runMethod(true,"getVisible"),mapsrg.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 47;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(16384);
mapsrg.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsrg.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsrg.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 48;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(32768);
mapsrg.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsrg.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 50;BA.debugLine="WebViewRG.Height = MainScroll.Height";
Debug.ShouldStop(131072);
mapsrg.mostCurrent._webviewrg.runMethod(true,"setHeight",mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 51;BA.debugLine="PanelRG.Height = MainScroll.Height";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._panelrg.runMethod(true,"setHeight",mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 52;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(524288);
mapsrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 54;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewRG, \"We";
Debug.ShouldStop(2097152);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsrg.mostCurrent.activityBA,(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(RemoteObject.createImmutable("WebViewRG")));
 BA.debugLineNum = 55;BA.debugLine="WebViewRG.JavaScriptEnabled = True";
Debug.ShouldStop(4194304);
mapsrg.mostCurrent._webviewrg.runMethod(true,"setJavaScriptEnabled",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="WebViewRG.LoadUrl(Main.server&\"web/rumahGadang/ma";
Debug.ShouldStop(8388608);
mapsrg.mostCurrent._webviewrg.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsrg.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("web/rumahGadang/maps"))));
 BA.debugLineNum = 58;BA.debugLine="PanelSearch.Visible = False";
Debug.ShouldStop(33554432);
mapsrg.mostCurrent._panelsearch.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="btnObj.Visible = False";
Debug.ShouldStop(67108864);
mapsrg.mostCurrent._btnobj.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="btnUserLoc.Visible = False";
Debug.ShouldStop(134217728);
mapsrg.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="btnList.Visible = False";
Debug.ShouldStop(268435456);
mapsrg.mostCurrent._btnlist.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="PanelRating.Visible = False";
Debug.ShouldStop(536870912);
mapsrg.mostCurrent._panelrating.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="PanelFacility.Visible = False";
Debug.ShouldStop(1073741824);
mapsrg.mostCurrent._panelfacility.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 64;BA.debugLine="PanelCategory.Visible = False";
Debug.ShouldStop(-2147483648);
mapsrg.mostCurrent._panelcategory.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(2);
mapsrg.mostCurrent._spinrating.runMethod(true,"setDropdownBackgroundColor",mapsrg.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 67;BA.debugLine="spinFacility.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(4);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setDropdownBackgroundColor",mapsrg.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 68;BA.debugLine="spinCategory.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(8);
mapsrg.mostCurrent._spincategory.runMethod(true,"setDropdownBackgroundColor",mapsrg.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
Debug.ShouldStop(32);
mapsrg.mostCurrent._spinrating.runVoidMethod ("AddAll",(Object)(mapsrg.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("Rating..."),BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),RemoteObject.createImmutable("5")})))));
 BA.debugLineNum = 71;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"facility\", \"LoadFaci";
Debug.ShouldStop(64);
mapsrg.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,mapsrg.mostCurrent.activityBA,(Object)(RemoteObject.concat(mapsrg.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("facility"))),(Object)(BA.ObjectToString("LoadFacility")),(Object)(mapsrg.getObject()));
 BA.debugLineNum = 72;BA.debugLine="spinCategory.AddAll(Array As String(\"Category...\"";
Debug.ShouldStop(128);
mapsrg.mostCurrent._spincategory.runVoidMethod ("AddAll",(Object)(mapsrg.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Category..."),BA.ObjectToString("Homestay"),RemoteObject.createImmutable("Tidak Homestay")})))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,92);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(268435456);
mapsrg.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsrg.processBA,(Object)((mapsrg.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,75);
if (RapidSub.canDelegate("activity_resume")) { b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsrg parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapsrg parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 76;BA.debugLine="Log(\"MapsRG Loaded\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","52949121",RemoteObject.createImmutable("MapsRG Loaded"),0);
 BA.debugLineNum = 77;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 78;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsrg.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 81;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapsrg.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 82;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsrg.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsrg", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 83;BA.debugLine="If Result Then";
Debug.ShouldStop(262144);
if (true) break;

case 6:
//if
this.state = 11;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 84;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsrg.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 86;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this appliation")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 87;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,96);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnback_click");}
 BA.debugLineNum = 96;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(1);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53080193",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 98;BA.debugLine="Starter.mapStatus = \"\"";
Debug.ShouldStop(2);
mapsrg.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 99;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
mapsrg.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,201);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnlist_click");}
 BA.debugLineNum = 201;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Log(\"Redirect to ListRG activity\")";
Debug.ShouldStop(512);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53670017",RemoteObject.createImmutable("Redirect to ListRG activity"),0);
 BA.debugLineNum = 203;BA.debugLine="StartActivity(ListRG)";
Debug.ShouldStop(1024);
mapsrg.mostCurrent.__c.runVoidMethod ("StartActivity",mapsrg.processBA,(Object)((mapsrg.mostCurrent._listrg.getObject())));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnobj_click() throws Exception{
try {
		Debug.PushSubsStack("btnObj_Click (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,134);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnobj_click");}
RemoteObject _boundtoobject = RemoteObject.createImmutable("");
 BA.debugLineNum = 134;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Log(\"Pan to Rumah Gadang\")";
Debug.ShouldStop(64);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53342337",RemoteObject.createImmutable("Pan to Rumah Gadang"),0);
 BA.debugLineNum = 136;BA.debugLine="Dim boundToObject As String";
Debug.ShouldStop(128);
_boundtoobject = RemoteObject.createImmutable("");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 137;BA.debugLine="If isFiltered Then";
Debug.ShouldStop(256);
if (mapsrg._isfiltered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="boundToObject = \"findRG('')\"";
Debug.ShouldStop(512);
_boundtoobject = BA.ObjectToString("findRG('')");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 139;BA.debugLine="isFiltered = False";
Debug.ShouldStop(1024);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 140;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(2048);
mapsrg.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 141;BA.debugLine="spinFacility.SelectedIndex = 0";
Debug.ShouldStop(4096);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 142;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(8192);
mapsrg.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 143;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(16384);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 145;BA.debugLine="boundToObject = \"boundToObject(false)\"";
Debug.ShouldStop(65536);
_boundtoobject = BA.ObjectToString("boundToObject(false)");Debug.locals.put("boundToObject", _boundtoobject);
 };
 BA.debugLineNum = 147;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, boun";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_boundtoobject));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnuserloc_click() throws Exception{
try {
		Debug.PushSubsStack("btnUserLoc_Click (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,127);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","btnuserloc_click");}
RemoteObject _pantouser = RemoteObject.createImmutable("");
 BA.debugLineNum = 127;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(-2147483648);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53276801",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 129;BA.debugLine="UpdateLocation";
Debug.ShouldStop(1);
_updatelocation();
 BA.debugLineNum = 130;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
Debug.ShouldStop(2);
_pantouser = BA.ObjectToString("panToUser()");Debug.locals.put("panToUser", _pantouser);Debug.locals.put("panToUser", _pantouser);
 BA.debugLineNum = 131;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, panT";
Debug.ShouldStop(4);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_pantouser));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edtsearchrg_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("edtSearchRG_EnterPressed (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,150);
if (RapidSub.canDelegate("edtsearchrg_enterpressed")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","edtsearchrg_enterpressed");}
 BA.debugLineNum = 150;BA.debugLine="Private Sub edtSearchRG_EnterPressed";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="nameRG = edtSearchRG.Text";
Debug.ShouldStop(4194304);
mapsrg._namerg = mapsrg.mostCurrent._edtsearchrg.runMethod(true,"getText");
 BA.debugLineNum = 152;BA.debugLine="FindRG";
Debug.ShouldStop(8388608);
_findrg();
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findrg() throws Exception{
try {
		Debug.PushSubsStack("FindRG (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,155);
if (RapidSub.canDelegate("findrg")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","findrg");}
RemoteObject _searchrg = RemoteObject.createImmutable("");
 BA.debugLineNum = 155;BA.debugLine="Sub FindRG";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(134217728);
mapsrg.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 157;BA.debugLine="spinFacility.SelectedIndex = 0";
Debug.ShouldStop(268435456);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 158;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(536870912);
mapsrg.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 159;BA.debugLine="isFiltered = True";
Debug.ShouldStop(1073741824);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 161;BA.debugLine="Log(\"Searching '\"&nameRG&\"' on maps\")";
Debug.ShouldStop(1);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53473414",RemoteObject.concat(RemoteObject.createImmutable("Searching '"),mapsrg._namerg,RemoteObject.createImmutable("' on maps")),0);
 BA.debugLineNum = 162;BA.debugLine="Dim searchRG As String";
Debug.ShouldStop(2);
_searchrg = RemoteObject.createImmutable("");Debug.locals.put("searchRG", _searchrg);
 BA.debugLineNum = 163;BA.debugLine="searchRG = \"findRG('\"&nameRG&\"')\"";
Debug.ShouldStop(4);
_searchrg = RemoteObject.concat(RemoteObject.createImmutable("findRG('"),mapsrg._namerg,RemoteObject.createImmutable("')"));Debug.locals.put("searchRG", _searchrg);
 BA.debugLineNum = 164;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, sear";
Debug.ShouldStop(8);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_searchrg));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 18;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsrg.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mapsrg.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelRG As Panel";
mapsrg.mostCurrent._panelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private WebViewRG As WebView";
mapsrg.mostCurrent._webviewrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private BtnBack As Button";
mapsrg.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Navbar As Panel";
mapsrg.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private MainScroll As ScrollView";
mapsrg.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnUserLoc As Button";
mapsrg.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnObj As Button";
mapsrg.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private edtSearchRG As EditText";
mapsrg.mostCurrent._edtsearchrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelSearch As Panel";
mapsrg.mostCurrent._panelsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnList As Button";
mapsrg.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelRating As Panel";
mapsrg.mostCurrent._panelrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private spinRating As Spinner";
mapsrg.mostCurrent._spinrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelFacility As Panel";
mapsrg.mostCurrent._panelfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private spinFacility As Spinner";
mapsrg.mostCurrent._spinfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private PanelCategory As Panel";
mapsrg.mostCurrent._panelcategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private spinCategory As Spinner";
mapsrg.mostCurrent._spincategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,167);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _facility = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 167;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(128);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53538945",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 169;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(256);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 170;BA.debugLine="Dim res As String";
Debug.ShouldStop(512);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 171;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(1024);
_res = _job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 172;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 173;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 175;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("LoadFacility"))) {
case 0: {
 BA.debugLineNum = 177;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 178;BA.debugLine="Dim map As Map";
Debug.ShouldStop(131072);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 179;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(262144);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 180;BA.debugLine="Dim data As List";
Debug.ShouldStop(524288);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 181;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(1048576);
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 182;BA.debugLine="facilityMap.Initialize";
Debug.ShouldStop(2097152);
mapsrg._facilitymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 183;BA.debugLine="spinFacility.Add(\"Facility...\")";
Debug.ShouldStop(4194304);
mapsrg.mostCurrent._spinfacility.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Facility...")));
 BA.debugLineNum = 184;BA.debugLine="For i = 0 To data.Size - 1";
Debug.ShouldStop(8388608);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 185;BA.debugLine="Dim facility As Map";
Debug.ShouldStop(16777216);
_facility = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("facility", _facility);
 BA.debugLineNum = 186;BA.debugLine="facility = data.Get(i)";
Debug.ShouldStop(33554432);
_facility = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("facility", _facility);
 BA.debugLineNum = 187;BA.debugLine="facilityMap.Put(facility.Get(\"facility\"), fa";
Debug.ShouldStop(67108864);
mapsrg._facilitymap.runVoidMethod ("Put",(Object)(_facility.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility"))))),(Object)(_facility.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 188;BA.debugLine="spinFacility.Add(facility.Get(\"facility\"))";
Debug.ShouldStop(134217728);
mapsrg.mostCurrent._spinfacility.runVoidMethod ("Add",(Object)(BA.ObjectToString(_facility.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility")))))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",mapsrg.processBA, e23.toString()); BA.debugLineNum = 191;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53538968",BA.ObjectToString(mapsrg.mostCurrent.__c.runMethod(false,"LastException",mapsrg.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim nameRG As String";
mapsrg._namerg = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim facilityMap As Map";
mapsrg._facilitymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spincategory_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinCategory_ItemClick (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,252);
if (RapidSub.canDelegate("spincategory_itemclick")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","spincategory_itemclick", _position, _value);}
RemoteObject _findbycategoryrg = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 252;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="Dim findByCategoryRG As String";
Debug.ShouldStop(268435456);
_findbycategoryrg = RemoteObject.createImmutable("");Debug.locals.put("findByCategoryRG", _findbycategoryrg);
 BA.debugLineNum = 254;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 255;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
Debug.ShouldStop(1073741824);
mapsrg.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose category")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Category"))),mapsrg.processBA);
 BA.debugLineNum = 256;BA.debugLine="isFiltered = False";
Debug.ShouldStop(-2147483648);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 257;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(1);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 258;BA.debugLine="spinFacility.SelectedIndex = 0";
Debug.ShouldStop(2);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 259;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(4);
mapsrg.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 261;BA.debugLine="findByCategoryRG = \"findRG('')\"";
Debug.ShouldStop(16);
_findbycategoryrg = BA.ObjectToString("findRG('')");Debug.locals.put("findByCategoryRG", _findbycategoryrg);
 BA.debugLineNum = 262;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
Debug.ShouldStop(32);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_findbycategoryrg));
 }else {
 BA.debugLineNum = 264;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(128);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 265;BA.debugLine="spinFacility.SelectedIndex = 0";
Debug.ShouldStop(256);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 266;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(512);
mapsrg.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 267;BA.debugLine="isFiltered = True";
Debug.ShouldStop(1024);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 269;BA.debugLine="Log(\"Searching RG with category: \"&Value)";
Debug.ShouldStop(4096);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53866641",RemoteObject.concat(RemoteObject.createImmutable("Searching RG with category: "),_value),0);
 BA.debugLineNum = 270;BA.debugLine="findByCategoryRG = \"findByCategoryRG('\"&Value&\"'";
Debug.ShouldStop(8192);
_findbycategoryrg = RemoteObject.concat(RemoteObject.createImmutable("findByCategoryRG('"),_value,RemoteObject.createImmutable("')"));Debug.locals.put("findByCategoryRG", _findbycategoryrg);
 BA.debugLineNum = 271;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
Debug.ShouldStop(16384);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_findbycategoryrg));
 };
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinfacility_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinFacility_ItemClick (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,229);
if (RapidSub.canDelegate("spinfacility_itemclick")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","spinfacility_itemclick", _position, _value);}
RemoteObject _findbyfacilityrg = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 229;BA.debugLine="Private Sub spinFacility_ItemClick (Position As In";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="Dim findByFacilityRG As String";
Debug.ShouldStop(32);
_findbyfacilityrg = RemoteObject.createImmutable("");Debug.locals.put("findByFacilityRG", _findbyfacilityrg);
 BA.debugLineNum = 231;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 232;BA.debugLine="MsgboxAsync(\"Please choose facility\", \"Search by";
Debug.ShouldStop(128);
mapsrg.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose facility")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Facility"))),mapsrg.processBA);
 BA.debugLineNum = 233;BA.debugLine="isFiltered = False";
Debug.ShouldStop(256);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 234;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(512);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 235;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(1024);
mapsrg.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 236;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(2048);
mapsrg.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 238;BA.debugLine="findByFacilityRG = \"findRG('')\"";
Debug.ShouldStop(8192);
_findbyfacilityrg = BA.ObjectToString("findRG('')");Debug.locals.put("findByFacilityRG", _findbyfacilityrg);
 BA.debugLineNum = 239;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
Debug.ShouldStop(16384);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_findbyfacilityrg));
 }else {
 BA.debugLineNum = 241;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(65536);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 242;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(131072);
mapsrg.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 243;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 244;BA.debugLine="isFiltered = True";
Debug.ShouldStop(524288);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 246;BA.debugLine="Log(\"Searching RG with facility: \"&Value)";
Debug.ShouldStop(2097152);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53801105",RemoteObject.concat(RemoteObject.createImmutable("Searching RG with facility: "),_value),0);
 BA.debugLineNum = 247;BA.debugLine="findByFacilityRG = \"findByFacilityRG('\"&facility";
Debug.ShouldStop(4194304);
_findbyfacilityrg = RemoteObject.concat(RemoteObject.createImmutable("findByFacilityRG('"),mapsrg._facilitymap.runMethod(false,"Get",(Object)(_value)),RemoteObject.createImmutable("')"));Debug.locals.put("findByFacilityRG", _findbyfacilityrg);
 BA.debugLineNum = 248;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
Debug.ShouldStop(8388608);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_findbyfacilityrg));
 };
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinrating_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinRating_ItemClick (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,206);
if (RapidSub.canDelegate("spinrating_itemclick")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","spinrating_itemclick", _position, _value);}
RemoteObject _findbyratingrg = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 206;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="Dim findByRatingRG As String";
Debug.ShouldStop(16384);
_findbyratingrg = RemoteObject.createImmutable("");Debug.locals.put("findByRatingRG", _findbyratingrg);
 BA.debugLineNum = 208;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 209;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
Debug.ShouldStop(65536);
mapsrg.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose rating from 1-5")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Rating"))),mapsrg.processBA);
 BA.debugLineNum = 210;BA.debugLine="isFiltered = False";
Debug.ShouldStop(131072);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 211;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 212;BA.debugLine="spinFacility.SelectedIndex = 0";
Debug.ShouldStop(524288);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 213;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(1048576);
mapsrg.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 215;BA.debugLine="findByRatingRG = \"findRG('')\"";
Debug.ShouldStop(4194304);
_findbyratingrg = BA.ObjectToString("findRG('')");Debug.locals.put("findByRatingRG", _findbyratingrg);
 BA.debugLineNum = 216;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
Debug.ShouldStop(8388608);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_findbyratingrg));
 }else {
 BA.debugLineNum = 218;BA.debugLine="edtSearchRG.Text = \"\"";
Debug.ShouldStop(33554432);
mapsrg.mostCurrent._edtsearchrg.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 219;BA.debugLine="spinFacility.SelectedIndex = 0";
Debug.ShouldStop(67108864);
mapsrg.mostCurrent._spinfacility.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 220;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(134217728);
mapsrg.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 221;BA.debugLine="isFiltered = True";
Debug.ShouldStop(268435456);
mapsrg._isfiltered = mapsrg.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 223;BA.debugLine="Log(\"Searching RG with \"&Value&\" rating\")";
Debug.ShouldStop(1073741824);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53735569",RemoteObject.concat(RemoteObject.createImmutable("Searching RG with "),_value,RemoteObject.createImmutable(" rating")),0);
 BA.debugLineNum = 224;BA.debugLine="findByRatingRG = \"findByRatingRG('\"&Value&\"')\"";
Debug.ShouldStop(-2147483648);
_findbyratingrg = RemoteObject.concat(RemoteObject.createImmutable("findByRatingRG('"),_value,RemoteObject.createImmutable("')"));Debug.locals.put("findByRatingRG", _findbyratingrg);
 BA.debugLineNum = 225;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
Debug.ShouldStop(1);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_findbyratingrg));
 };
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatelocation() throws Exception{
try {
		Debug.PushSubsStack("UpdateLocation (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,102);
if (RapidSub.canDelegate("updatelocation")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","updatelocation");}
RemoteObject _userposition = RemoteObject.createImmutable("");
 BA.debugLineNum = 102;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Log(\"Update user position on Maps Rumah Gadang\")";
Debug.ShouldStop(64);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53145729",RemoteObject.createImmutable("Update user position on Maps Rumah Gadang"),0);
 BA.debugLineNum = 104;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(128);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53145730",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapsrg.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapsrg.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 105;BA.debugLine="Dim userPosition As String";
Debug.ShouldStop(256);
_userposition = RemoteObject.createImmutable("");Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 106;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
Debug.ShouldStop(512);
_userposition = RemoteObject.concat(RemoteObject.createImmutable("userPositionAPI("),mapsrg.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(", "),mapsrg.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable(")"));Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 107;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, user";
Debug.ShouldStop(1024);
mapsrg.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsrg.mostCurrent._webviewrg.getObject())),(Object)(_userposition));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewrg_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewRG_PageFinished (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,197);
if (RapidSub.canDelegate("webviewrg_pagefinished")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","webviewrg_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 197;BA.debugLine="Private Sub WebViewRG_PageFinished (Url As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewrg_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewRG_ProgressChanged (mapsrg) ","mapsrg",4,mapsrg.mostCurrent.activityBA,mapsrg.mostCurrent,110);
if (RapidSub.canDelegate("webviewrg_progresschanged")) { return b4a.DesaWisataSumpu.mapsrg.remoteMe.runUserSub(false, "mapsrg","webviewrg_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 110;BA.debugLine="Sub WebViewRG_ProgressChanged(loading As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 112;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(32768);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53211266",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 113;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(65536);
mapsrg.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 BA.debugLineNum = 114;BA.debugLine="PanelSearch.Visible = True";
Debug.ShouldStop(131072);
mapsrg.mostCurrent._panelsearch.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="btnObj.Visible = True";
Debug.ShouldStop(262144);
mapsrg.mostCurrent._btnobj.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="btnUserLoc.Visible = True";
Debug.ShouldStop(524288);
mapsrg.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="btnList.Visible = True";
Debug.ShouldStop(1048576);
mapsrg.mostCurrent._btnlist.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 118;BA.debugLine="PanelRating.Visible = True";
Debug.ShouldStop(2097152);
mapsrg.mostCurrent._panelrating.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 119;BA.debugLine="PanelFacility.Visible = True";
Debug.ShouldStop(4194304);
mapsrg.mostCurrent._panelfacility.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="PanelCategory.Visible = True";
Debug.ShouldStop(8388608);
mapsrg.mostCurrent._panelcategory.runMethod(true,"setVisible",mapsrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="UpdateLocation";
Debug.ShouldStop(16777216);
_updatelocation();
 }else {
 BA.debugLineNum = 123;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(67108864);
mapsrg.mostCurrent.__c.runVoidMethod ("LogImpl","53211277",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
 };
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}