package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsev_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,41);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 45;BA.debugLine="Starter.mapStatus = \"EV\"";
Debug.ShouldStop(4096);
mapsev.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("EV");
 BA.debugLineNum = 46;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(8192);
mapsev.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
Debug.ShouldStop(16384);
mapsev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsEV")),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(32768);
mapsev.mostCurrent._navbar.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",mapsev.mostCurrent._navbar.runMethod(true,"getVisible"),mapsev.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 50;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(131072);
mapsev.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsev.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsev.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 51;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(262144);
mapsev.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsev.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 53;BA.debugLine="WebViewEV.Height = MainScroll.Height";
Debug.ShouldStop(1048576);
mapsev.mostCurrent._webviewev.runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 54;BA.debugLine="PanelEV.Height = MainScroll.Height";
Debug.ShouldStop(2097152);
mapsev.mostCurrent._panelev.runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 55;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(4194304);
mapsev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 57;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsev.mostCurrent.activityBA,(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(RemoteObject.createImmutable("WebViewEV")));
 BA.debugLineNum = 58;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
Debug.ShouldStop(33554432);
mapsev.mostCurrent._webviewev.runMethod(true,"setJavaScriptEnabled",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="WebViewEV.LoadUrl(Main.server&\"web/event/maps\")";
Debug.ShouldStop(67108864);
mapsev.mostCurrent._webviewev.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsev.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("web/event/maps"))));
 BA.debugLineNum = 61;BA.debugLine="PanelSearch.Visible = False";
Debug.ShouldStop(268435456);
mapsev.mostCurrent._panelsearch.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="btnObj.Visible = False";
Debug.ShouldStop(536870912);
mapsev.mostCurrent._btnobj.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="btnUserLoc.Visible = False";
Debug.ShouldStop(1073741824);
mapsev.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 64;BA.debugLine="btnList.Visible = False";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent._btnlist.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="PanelRating.Visible = False";
Debug.ShouldStop(1);
mapsev.mostCurrent._panelrating.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="PanelDate.Visible = False";
Debug.ShouldStop(2);
mapsev.mostCurrent._paneldate.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="PanelCategory.Visible = False";
Debug.ShouldStop(4);
mapsev.mostCurrent._panelcategory.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(16);
mapsev.mostCurrent._spinrating.runMethod(true,"setDropdownBackgroundColor",mapsev.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="spinCategory.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(32);
mapsev.mostCurrent._spincategory.runMethod(true,"setDropdownBackgroundColor",mapsev.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 72;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
Debug.ShouldStop(128);
mapsev.mostCurrent._spinrating.runVoidMethod ("AddAll",(Object)(mapsev.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("Rating..."),BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),RemoteObject.createImmutable("5")})))));
 BA.debugLineNum = 73;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"event/category\", \"Lo";
Debug.ShouldStop(256);
mapsev.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA,(Object)(RemoteObject.concat(mapsev.mostCurrent._main._api /*RemoteObject*/ ,RemoteObject.createImmutable("event/category"))),(Object)(BA.ObjectToString("LoadCategory")),(Object)(mapsev.getObject()));
 BA.debugLineNum = 74;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(512);
mapsev.mostCurrent._dialog.runClassMethod (b4a.DesaWisataSumpu.b4xdialog.class, "_initialize" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mapsev.mostCurrent._activity.getObject()));
 BA.debugLineNum = 75;BA.debugLine="Dialog.Title = \"Select Date...\"";
Debug.ShouldStop(1024);
mapsev.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Select Date...")));
 BA.debugLineNum = 76;BA.debugLine="DateTemplate.Initialize";
Debug.ShouldStop(2048);
mapsev.mostCurrent._datetemplate.runClassMethod (b4a.DesaWisataSumpu.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 77;BA.debugLine="DateTemplate.MinYear = 2000";
Debug.ShouldStop(4096);
mapsev.mostCurrent._datetemplate.setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2000));
 BA.debugLineNum = 78;BA.debugLine="DateTemplate.MaxYear = 2050";
Debug.ShouldStop(8192);
mapsev.mostCurrent._datetemplate.setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2050));
 BA.debugLineNum = 79;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(16384);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,99);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(8);
mapsev.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsev.processBA,(Object)((mapsev.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) { b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","activity_resume"); return;}
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
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsev parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapsev parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,82);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 83;BA.debugLine="Log(\"MapsEV Loaded\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","54128769",RemoteObject.createImmutable("MapsEV Loaded"),0);
 BA.debugLineNum = 84;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 85;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 86;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsev.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 88;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapsev.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 89;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsev.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsev", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 90;BA.debugLine="If Result Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsev.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 93;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this appliation")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("BtnBack_Click (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,103);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnback_click");}
 BA.debugLineNum = 103;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(128);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54259841",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 105;BA.debugLine="Starter.mapStatus = \"\"";
Debug.ShouldStop(256);
mapsev.mostCurrent._starter._mapstatus /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 106;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
mapsev.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndate_click() throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,262);
if (RapidSub.canDelegate("btndate_click")) { b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btndate_click"); return;}
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4a.DesaWisataSumpu.mapsev parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.DesaWisataSumpu.mapsev parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _selecteddate = RemoteObject.createImmutable("");
RemoteObject _findbydateev = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,262);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 263;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mapsev.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsev", "btndate_click"), parent.mostCurrent._dialog.runClassMethod (b4a.DesaWisataSumpu.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._datetemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 264;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 265;BA.debugLine="Dim selectedDate As String";
Debug.ShouldStop(256);
_selecteddate = RemoteObject.createImmutable("");Debug.locals.put("selectedDate", _selecteddate);
 BA.debugLineNum = 266;BA.debugLine="Dim findByDateEV As String";
Debug.ShouldStop(512);
_findbydateev = RemoteObject.createImmutable("");Debug.locals.put("findByDateEV", _findbydateev);
 BA.debugLineNum = 267;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 268;BA.debugLine="selectedDate = DateTime.Date(DateTemplate.Date)";
Debug.ShouldStop(2048);
_selecteddate = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent._datetemplate.runClassMethod (b4a.DesaWisataSumpu.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("selectedDate", _selecteddate);
 BA.debugLineNum = 269;BA.debugLine="btnDate.xLBL.Text = selectedDate";
Debug.ShouldStop(4096);
parent.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_selecteddate));
 BA.debugLineNum = 271;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(16384);
parent.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 272;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(32768);
parent.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 273;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(65536);
parent.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 274;BA.debugLine="isFiltered = True";
Debug.ShouldStop(131072);
parent._isfiltered = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 276;BA.debugLine="Log(\"Searching EV with date: \"&selectedDate)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","55046286",RemoteObject.concat(RemoteObject.createImmutable("Searching EV with date: "),_selecteddate),0);
 BA.debugLineNum = 277;BA.debugLine="findByDateEV = \"findByDateEV('\"&selectedDate&\"')";
Debug.ShouldStop(1048576);
_findbydateev = RemoteObject.concat(RemoteObject.createImmutable("findByDateEV('"),_selecteddate,RemoteObject.createImmutable("')"));Debug.locals.put("findByDateEV", _findbydateev);
 BA.debugLineNum = 278;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
Debug.ShouldStop(2097152);
parent.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((parent.mostCurrent._webviewev.getObject())),(Object)(_findbydateev));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,209);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnlist_click");}
 BA.debugLineNum = 209;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Log(\"Redirect to ListEV activity\")";
Debug.ShouldStop(131072);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54849665",RemoteObject.createImmutable("Redirect to ListEV activity"),0);
 BA.debugLineNum = 211;BA.debugLine="StartActivity(ListEV)";
Debug.ShouldStop(262144);
mapsev.mostCurrent.__c.runVoidMethod ("StartActivity",mapsev.processBA,(Object)((mapsev.mostCurrent._listev.getObject())));
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnObj_Click (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,141);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnobj_click");}
RemoteObject _boundtoobject = RemoteObject.createImmutable("");
 BA.debugLineNum = 141;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Log(\"Pan to Event\")";
Debug.ShouldStop(8192);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54521985",RemoteObject.createImmutable("Pan to Event"),0);
 BA.debugLineNum = 143;BA.debugLine="Dim boundToObject As String";
Debug.ShouldStop(16384);
_boundtoobject = RemoteObject.createImmutable("");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 144;BA.debugLine="If isFiltered Then";
Debug.ShouldStop(32768);
if (mapsev._isfiltered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 145;BA.debugLine="boundToObject = \"findEV('')\"";
Debug.ShouldStop(65536);
_boundtoobject = BA.ObjectToString("findEV('')");Debug.locals.put("boundToObject", _boundtoobject);
 BA.debugLineNum = 146;BA.debugLine="isFiltered = False";
Debug.ShouldStop(131072);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 147;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(262144);
mapsev.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 148;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(524288);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 149;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(1048576);
mapsev.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 150;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(2097152);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 }else {
 BA.debugLineNum = 152;BA.debugLine="boundToObject = \"boundToObject(false)\"";
Debug.ShouldStop(8388608);
_boundtoobject = BA.ObjectToString("boundToObject(false)");Debug.locals.put("boundToObject", _boundtoobject);
 };
 BA.debugLineNum = 154;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, boun";
Debug.ShouldStop(33554432);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_boundtoobject));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btnUserLoc_Click (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,134);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","btnuserloc_click");}
RemoteObject _pantouser = RemoteObject.createImmutable("");
 BA.debugLineNum = 134;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(64);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54456449",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 136;BA.debugLine="UpdateLocation";
Debug.ShouldStop(128);
_updatelocation();
 BA.debugLineNum = 137;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
Debug.ShouldStop(256);
_pantouser = BA.ObjectToString("panToUser()");Debug.locals.put("panToUser", _pantouser);Debug.locals.put("panToUser", _pantouser);
 BA.debugLineNum = 138;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, panT";
Debug.ShouldStop(512);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_pantouser));
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
public static RemoteObject  _edtsearchev_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("edtSearchEV_EnterPressed (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,158);
if (RapidSub.canDelegate("edtsearchev_enterpressed")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","edtsearchev_enterpressed");}
 BA.debugLineNum = 158;BA.debugLine="Private Sub edtSearchEV_EnterPressed";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="nameEV = edtSearchEV.Text";
Debug.ShouldStop(1073741824);
mapsev._nameev = mapsev.mostCurrent._edtsearchev.runMethod(true,"getText");
 BA.debugLineNum = 160;BA.debugLine="FindEV";
Debug.ShouldStop(-2147483648);
_findev();
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findev() throws Exception{
try {
		Debug.PushSubsStack("FindEV (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,163);
if (RapidSub.canDelegate("findev")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","findev");}
RemoteObject _searchrg = RemoteObject.createImmutable("");
 BA.debugLineNum = 163;BA.debugLine="Sub FindEV";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(8);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 165;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(16);
mapsev.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 166;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(32);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 BA.debugLineNum = 167;BA.debugLine="isFiltered = True";
Debug.ShouldStop(64);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 169;BA.debugLine="Log(\"Searching '\"&nameEV&\"' on maps\")";
Debug.ShouldStop(256);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54653062",RemoteObject.concat(RemoteObject.createImmutable("Searching '"),mapsev._nameev,RemoteObject.createImmutable("' on maps")),0);
 BA.debugLineNum = 170;BA.debugLine="Dim searchRG As String";
Debug.ShouldStop(512);
_searchrg = RemoteObject.createImmutable("");Debug.locals.put("searchRG", _searchrg);
 BA.debugLineNum = 171;BA.debugLine="searchRG = \"findEV('\"&nameEV&\"')\"";
Debug.ShouldStop(1024);
_searchrg = RemoteObject.concat(RemoteObject.createImmutable("findEV('"),mapsev._nameev,RemoteObject.createImmutable("')"));Debug.locals.put("searchRG", _searchrg);
 BA.debugLineNum = 172;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, sear";
Debug.ShouldStop(2048);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_searchrg));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsev.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 20;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mapsev.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelEV As Panel";
mapsev.mostCurrent._panelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private WebViewEV As WebView";
mapsev.mostCurrent._webviewev = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BtnBack As Button";
mapsev.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Navbar As Panel";
mapsev.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private MainScroll As ScrollView";
mapsev.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnUserLoc As Button";
mapsev.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnObj As Button";
mapsev.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private edtSearchEV As EditText";
mapsev.mostCurrent._edtsearchev = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelSearch As Panel";
mapsev.mostCurrent._panelsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnList As Button";
mapsev.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelCategory As Panel";
mapsev.mostCurrent._panelcategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelDate As Panel";
mapsev.mostCurrent._paneldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelRating As Panel";
mapsev.mostCurrent._panelrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private spinCategory As Spinner";
mapsev.mostCurrent._spincategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private spinRating As Spinner";
mapsev.mostCurrent._spinrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private btnDate As SwiftButton";
mapsev.mostCurrent._btndate = RemoteObject.createNew ("b4a.DesaWisataSumpu.swiftbutton");
 //BA.debugLineNum = 37;BA.debugLine="Private DateTemplate As B4XDateTemplate";
mapsev.mostCurrent._datetemplate = RemoteObject.createNew ("b4a.DesaWisataSumpu.b4xdatetemplate");
 //BA.debugLineNum = 38;BA.debugLine="Private Dialog As B4XDialog";
mapsev.mostCurrent._dialog = RemoteObject.createNew ("b4a.DesaWisataSumpu.b4xdialog");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,175);
if (RapidSub.canDelegate("jobdone")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _category = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 175;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(32768);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54718593",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 177;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(65536);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 178;BA.debugLine="Dim res As String";
Debug.ShouldStop(131072);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 179;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(262144);
_res = _job.runClassMethod (b4a.DesaWisataSumpu.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 180;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 181;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 183;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("LoadCategory"))) {
case 0: {
 BA.debugLineNum = 185;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 186;BA.debugLine="Dim map As Map";
Debug.ShouldStop(33554432);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 187;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(67108864);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 188;BA.debugLine="Dim data As List";
Debug.ShouldStop(134217728);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 189;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(268435456);
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 190;BA.debugLine="categoryMap.Initialize";
Debug.ShouldStop(536870912);
mapsev._categorymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="spinCategory.Add(\"Category...\")";
Debug.ShouldStop(1073741824);
mapsev.mostCurrent._spincategory.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Category...")));
 BA.debugLineNum = 192;BA.debugLine="For i = 0 To data.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 193;BA.debugLine="Dim category As Map";
Debug.ShouldStop(1);
_category = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("category", _category);
 BA.debugLineNum = 194;BA.debugLine="category = data.Get(i)";
Debug.ShouldStop(2);
_category = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("category", _category);
 BA.debugLineNum = 195;BA.debugLine="categoryMap.Put(category.Get(\"category\"), ca";
Debug.ShouldStop(4);
mapsev._categorymap.runVoidMethod ("Put",(Object)(_category.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("category"))))),(Object)(_category.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 196;BA.debugLine="spinCategory.Add(category.Get(\"category\"))";
Debug.ShouldStop(8);
mapsev.mostCurrent._spincategory.runVoidMethod ("Add",(Object)(BA.ObjectToString(_category.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("category")))))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",mapsev.processBA, e23.toString()); BA.debugLineNum = 199;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54718616",BA.ObjectToString(mapsev.mostCurrent.__c.runMethod(false,"LastException",mapsev.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim nameEV As String";
mapsev._nameev = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim categoryMap As Map";
mapsev._categorymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 12;BA.debugLine="Private XUI as XUI";
mapsev._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spincategory_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinCategory_ItemClick (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,239);
if (RapidSub.canDelegate("spincategory_itemclick")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","spincategory_itemclick", _position, _value);}
RemoteObject _findbycategoryev = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 239;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim findByCategoryEV As String";
Debug.ShouldStop(32768);
_findbycategoryev = RemoteObject.createImmutable("");Debug.locals.put("findByCategoryEV", _findbycategoryev);
 BA.debugLineNum = 241;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 242;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
Debug.ShouldStop(131072);
mapsev.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose category")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Category"))),mapsev.processBA);
 BA.debugLineNum = 243;BA.debugLine="isFiltered = False";
Debug.ShouldStop(262144);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 244;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(524288);
mapsev.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 245;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(1048576);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 246;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(2097152);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 BA.debugLineNum = 248;BA.debugLine="findByCategoryEV = \"findEV('')\"";
Debug.ShouldStop(8388608);
_findbycategoryev = BA.ObjectToString("findEV('')");Debug.locals.put("findByCategoryEV", _findbycategoryev);
 BA.debugLineNum = 249;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_findbycategoryev));
 }else {
 BA.debugLineNum = 251;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(67108864);
mapsev.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 252;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(134217728);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 253;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(268435456);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 BA.debugLineNum = 254;BA.debugLine="isFiltered = True";
Debug.ShouldStop(536870912);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 256;BA.debugLine="Log(\"Searching EV with category: \"&Value)";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54980753",RemoteObject.concat(RemoteObject.createImmutable("Searching EV with category: "),_value),0);
 BA.debugLineNum = 257;BA.debugLine="findByCategoryEV = \"findByCategoryEV('\"&category";
Debug.ShouldStop(1);
_findbycategoryev = RemoteObject.concat(RemoteObject.createImmutable("findByCategoryEV('"),mapsev._categorymap.runMethod(false,"Get",(Object)(_value)),RemoteObject.createImmutable("')"));Debug.locals.put("findByCategoryEV", _findbycategoryev);
 BA.debugLineNum = 258;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
Debug.ShouldStop(2);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_findbycategoryev));
 };
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("spinRating_ItemClick (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,216);
if (RapidSub.canDelegate("spinrating_itemclick")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","spinrating_itemclick", _position, _value);}
RemoteObject _findbyratingev = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 216;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim findByRatingEV As String";
Debug.ShouldStop(16777216);
_findbyratingev = RemoteObject.createImmutable("");Debug.locals.put("findByRatingEV", _findbyratingev);
 BA.debugLineNum = 218;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 219;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
Debug.ShouldStop(67108864);
mapsev.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose rating from 1-5")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Rating"))),mapsev.processBA);
 BA.debugLineNum = 220;BA.debugLine="isFiltered = False";
Debug.ShouldStop(134217728);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 221;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(268435456);
mapsev.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 222;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(536870912);
mapsev.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 223;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(1073741824);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 BA.debugLineNum = 225;BA.debugLine="findByRatingEV = \"findEV('')\"";
Debug.ShouldStop(1);
_findbyratingev = BA.ObjectToString("findEV('')");Debug.locals.put("findByRatingEV", _findbyratingev);
 BA.debugLineNum = 226;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
Debug.ShouldStop(2);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_findbyratingev));
 }else {
 BA.debugLineNum = 228;BA.debugLine="edtSearchEV.Text = \"\"";
Debug.ShouldStop(8);
mapsev.mostCurrent._edtsearchev.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 229;BA.debugLine="spinCategory.SelectedIndex = 0";
Debug.ShouldStop(16);
mapsev.mostCurrent._spincategory.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 230;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
Debug.ShouldStop(32);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Date..."));
 BA.debugLineNum = 231;BA.debugLine="isFiltered = True";
Debug.ShouldStop(64);
mapsev._isfiltered = mapsev.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 233;BA.debugLine="Log(\"Searching EV with \"&Value&\" rating\")";
Debug.ShouldStop(256);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54915217",RemoteObject.concat(RemoteObject.createImmutable("Searching EV with "),_value,RemoteObject.createImmutable(" rating")),0);
 BA.debugLineNum = 234;BA.debugLine="findByRatingEV = \"findByRatingEV('\"&Value&\"')\"";
Debug.ShouldStop(512);
_findbyratingev = RemoteObject.concat(RemoteObject.createImmutable("findByRatingEV('"),_value,RemoteObject.createImmutable("')"));Debug.locals.put("findByRatingEV", _findbyratingev);
 BA.debugLineNum = 235;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
Debug.ShouldStop(1024);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_findbyratingev));
 };
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("UpdateLocation (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,109);
if (RapidSub.canDelegate("updatelocation")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","updatelocation");}
RemoteObject _userposition = RemoteObject.createImmutable("");
 BA.debugLineNum = 109;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Log(\"Update user position on Maps Event\")";
Debug.ShouldStop(8192);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54325377",RemoteObject.createImmutable("Update user position on Maps Event"),0);
 BA.debugLineNum = 111;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(16384);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54325378",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapsev.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapsev.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 112;BA.debugLine="Dim userPosition As String";
Debug.ShouldStop(32768);
_userposition = RemoteObject.createImmutable("");Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 113;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
Debug.ShouldStop(65536);
_userposition = RemoteObject.concat(RemoteObject.createImmutable("userPositionAPI("),mapsev.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(", "),mapsev.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable(")"));Debug.locals.put("userPosition", _userposition);
 BA.debugLineNum = 114;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, user";
Debug.ShouldStop(131072);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_userposition));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewev_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewEV_PageFinished (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,205);
if (RapidSub.canDelegate("webviewev_pagefinished")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","webviewev_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 205;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewev_progresschanged(RemoteObject _loading) throws Exception{
try {
		Debug.PushSubsStack("WebViewEV_ProgressChanged (mapsev) ","mapsev",5,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,117);
if (RapidSub.canDelegate("webviewev_progresschanged")) { return b4a.DesaWisataSumpu.mapsev.remoteMe.runUserSub(false, "mapsev","webviewev_progresschanged", _loading);}
Debug.locals.put("loading", _loading);
 BA.debugLineNum = 117;BA.debugLine="Sub WebViewEV_ProgressChanged(loading As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="If loading == 100 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_loading,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 119;BA.debugLine="Log(\"Webview loaded\")";
Debug.ShouldStop(4194304);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54390914",RemoteObject.createImmutable("Webview loaded"),0);
 BA.debugLineNum = 120;BA.debugLine="Starter.webviewLoading = loading";
Debug.ShouldStop(8388608);
mapsev.mostCurrent._starter._webviewloading /*RemoteObject*/  = _loading;
 BA.debugLineNum = 121;BA.debugLine="PanelSearch.Visible = True";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._panelsearch.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 122;BA.debugLine="btnObj.Visible = True";
Debug.ShouldStop(33554432);
mapsev.mostCurrent._btnobj.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 123;BA.debugLine="btnUserLoc.Visible = True";
Debug.ShouldStop(67108864);
mapsev.mostCurrent._btnuserloc.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 124;BA.debugLine="btnList.Visible = True";
Debug.ShouldStop(134217728);
mapsev.mostCurrent._btnlist.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 125;BA.debugLine="PanelRating.Visible = True";
Debug.ShouldStop(268435456);
mapsev.mostCurrent._panelrating.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 126;BA.debugLine="PanelDate.Visible = True";
Debug.ShouldStop(536870912);
mapsev.mostCurrent._paneldate.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="PanelCategory.Visible = True";
Debug.ShouldStop(1073741824);
mapsev.mostCurrent._panelcategory.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 128;BA.debugLine="UpdateLocation";
Debug.ShouldStop(-2147483648);
_updatelocation();
 }else {
 BA.debugLineNum = 130;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
Debug.ShouldStop(2);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","54390925",RemoteObject.concat(RemoteObject.createImmutable("Webview loading at "),_loading,RemoteObject.createImmutable("% ....")),0);
 };
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
}