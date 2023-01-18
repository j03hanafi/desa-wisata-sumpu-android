package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class detailrg_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (detailrg) ","detailrg",8,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.DesaWisataSumpu.detailrg.remoteMe.runUserSub(false, "detailrg","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(67108864);
detailrg.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),detailrg.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="MainScroll.Panel.LoadLayout(\"Detail\")";
Debug.ShouldStop(134217728);
detailrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Detail")),detailrg.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="wvDetail.Height = MainScroll.Height";
Debug.ShouldStop(268435456);
detailrg.mostCurrent._wvdetail.runMethod(true,"setHeight",detailrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(536870912);
detailrg.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",detailrg.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 31;BA.debugLine="TitleNavbar.Text = Starter.selectedObj.Get(\"name\"";
Debug.ShouldStop(1073741824);
detailrg.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence(detailrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 33;BA.debugLine="MyWebViewExtras.addWebChromeClient(wvDetail, \"wvD";
Debug.ShouldStop(1);
detailrg.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",detailrg.mostCurrent.activityBA,(Object)((detailrg.mostCurrent._wvdetail.getObject())),(Object)(RemoteObject.createImmutable("wvDetail")));
 BA.debugLineNum = 34;BA.debugLine="wvDetail.JavaScriptEnabled = True";
Debug.ShouldStop(2);
detailrg.mostCurrent._wvdetail.runMethod(true,"setJavaScriptEnabled",detailrg.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="wvDetail.LoadUrl(Main.server&\"web/rumahGadang/det";
Debug.ShouldStop(4);
detailrg.mostCurrent._wvdetail.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(detailrg.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("web/rumahGadang/detail/"),detailrg.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (detailrg) ","detailrg",8,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) { return b4a.DesaWisataSumpu.detailrg.remoteMe.runUserSub(false, "detailrg","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (detailrg) ","detailrg",8,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return b4a.DesaWisataSumpu.detailrg.remoteMe.runUserSub(false, "detailrg","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log(\"DetailRG loaded\")";
Debug.ShouldStop(64);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","55898241",RemoteObject.createImmutable("DetailRG loaded"),0);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (detailrg) ","detailrg",8,detailrg.mostCurrent.activityBA,detailrg.mostCurrent,47);
if (RapidSub.canDelegate("btnback_click")) { return b4a.DesaWisataSumpu.detailrg.remoteMe.runUserSub(false, "detailrg","btnback_click");}
 BA.debugLineNum = 47;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(32768);
detailrg.mostCurrent.__c.runVoidMethod ("LogImpl","56029313",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 49;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
detailrg.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
detailrg.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
detailrg.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
detailrg.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
detailrg.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Navbar As Panel";
detailrg.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleNavbar As Label";
detailrg.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private wvDetail As WebView";
detailrg.mostCurrent._wvdetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}