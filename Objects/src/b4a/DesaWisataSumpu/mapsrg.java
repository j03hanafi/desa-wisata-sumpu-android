package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class mapsrg extends Activity implements B4AActivity{
	public static mapsrg mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.mapsrg");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsrg).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.mapsrg");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.mapsrg", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsrg) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsrg) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return mapsrg.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (mapsrg) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mapsrg) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            mapsrg mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mapsrg) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static String _namerg = "";
public static anywheresoftware.b4a.objects.collections.Map _facilitymap = null;
public static boolean _isfiltered = false;
public uk.co.martinpearman.b4a.webviewextras.WebViewExtras _mywebviewextras = null;
public uk.co.martinpearman.b4a.webviewsettings.WebViewSettings _mywebviewsettings = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrg = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewrg = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnuserloc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnobj = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtsearchrg = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrating = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinrating = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfacility = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcategory = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spincategory = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsev _mapsev = null;
public b4a.DesaWisataSumpu.core _core = null;
public b4a.DesaWisataSumpu.detailev _detailev = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homeuser _homeuser = null;
public b4a.DesaWisataSumpu.listev _listev = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 42;BA.debugLine="Starter.mapStatus = \"RG\"";
mostCurrent._starter._mapstatus /*String*/  = "RG";
 //BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsRG\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsRG",mostCurrent.activityBA);
 //BA.debugLineNum = 45;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 46;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 47;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
 //BA.debugLineNum = 48;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
 //BA.debugLineNum = 50;BA.debugLine="WebViewRG.Height = MainScroll.Height";
mostCurrent._webviewrg.setHeight(mostCurrent._mainscroll.getHeight());
 //BA.debugLineNum = 51;BA.debugLine="PanelRG.Height = MainScroll.Height";
mostCurrent._panelrg.setHeight(mostCurrent._mainscroll.getHeight());
 //BA.debugLineNum = 52;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
 //BA.debugLineNum = 54;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewRG, \"We";
mostCurrent._mywebviewextras.addWebChromeClient(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webviewrg.getObject()),"WebViewRG");
 //BA.debugLineNum = 55;BA.debugLine="WebViewRG.JavaScriptEnabled = True";
mostCurrent._webviewrg.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 56;BA.debugLine="WebViewRG.LoadUrl(Main.server&\"web/rumahGadang/ma";
mostCurrent._webviewrg.LoadUrl(mostCurrent._main._server /*String*/ +"web/rumahGadang/maps");
 //BA.debugLineNum = 58;BA.debugLine="PanelSearch.Visible = False";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 59;BA.debugLine="btnObj.Visible = False";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 60;BA.debugLine="btnUserLoc.Visible = False";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 61;BA.debugLine="btnList.Visible = False";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 62;BA.debugLine="PanelRating.Visible = False";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 63;BA.debugLine="PanelFacility.Visible = False";
mostCurrent._panelfacility.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 64;BA.debugLine="PanelCategory.Visible = False";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 66;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
mostCurrent._spinrating.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 67;BA.debugLine="spinFacility.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spinfacility.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 68;BA.debugLine="spinCategory.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spincategory.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 70;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
mostCurrent._spinrating.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Rating...","1","2","3","4","5"}));
 //BA.debugLineNum = 71;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"facility\", \"LoadFaci";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"facility","LoadFacility",mapsrg.getObject());
 //BA.debugLineNum = 72;BA.debugLine="spinCategory.AddAll(Array As String(\"Category...\"";
mostCurrent._spincategory.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Category...","Homestay","Tidak Homestay"}));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 93;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StopGPS");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsrg parent) {
this.parent = parent;
}
b4a.DesaWisataSumpu.mapsrg parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 76;BA.debugLine="Log(\"MapsRG Loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42949121","MapsRG Loaded",0);
 //BA.debugLineNum = 77;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 //BA.debugLineNum = 78;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 79;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 81;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
 //BA.debugLineNum = 82;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 83;BA.debugLine="If Result Then";
if (true) break;

case 6:
//if
this.state = 11;
if (_result) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 //BA.debugLineNum = 84;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 86;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please allow GPS to run this appliation"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 87;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
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
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static String  _btnback_click() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Private Sub BtnBack_Click";
 //BA.debugLineNum = 97;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43080193","Going back to previous activity",0);
 //BA.debugLineNum = 98;BA.debugLine="Starter.mapStatus = \"\"";
mostCurrent._starter._mapstatus /*String*/  = "";
 //BA.debugLineNum = 99;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _btnlist_click() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Private Sub btnList_Click";
 //BA.debugLineNum = 202;BA.debugLine="Log(\"Redirect to ListRG activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43670017","Redirect to ListRG activity",0);
 //BA.debugLineNum = 203;BA.debugLine="StartActivity(ListRG)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listrg.getObject()));
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public static String  _btnobj_click() throws Exception{
String _boundtoobject = "";
 //BA.debugLineNum = 134;BA.debugLine="Private Sub btnObj_Click";
 //BA.debugLineNum = 135;BA.debugLine="Log(\"Pan to Rumah Gadang\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43342337","Pan to Rumah Gadang",0);
 //BA.debugLineNum = 136;BA.debugLine="Dim boundToObject As String";
_boundtoobject = "";
 //BA.debugLineNum = 137;BA.debugLine="If isFiltered Then";
if (_isfiltered) { 
 //BA.debugLineNum = 138;BA.debugLine="boundToObject = \"findRG('')\"";
_boundtoobject = "findRG('')";
 //BA.debugLineNum = 139;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 140;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 141;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
 //BA.debugLineNum = 142;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 143;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 145;BA.debugLine="boundToObject = \"boundToObject(false)\"";
_boundtoobject = "boundToObject(false)";
 };
 //BA.debugLineNum = 147;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, boun";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_boundtoobject);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public static String  _btnuserloc_click() throws Exception{
String _pantouser = "";
 //BA.debugLineNum = 127;BA.debugLine="Private Sub btnUserLoc_Click";
 //BA.debugLineNum = 128;BA.debugLine="Log(\"Panning to user location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43276801","Panning to user location",0);
 //BA.debugLineNum = 129;BA.debugLine="UpdateLocation";
_updatelocation();
 //BA.debugLineNum = 130;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
_pantouser = "panToUser()";
 //BA.debugLineNum = 131;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, panT";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_pantouser);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _edtsearchrg_enterpressed() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Private Sub edtSearchRG_EnterPressed";
 //BA.debugLineNum = 151;BA.debugLine="nameRG = edtSearchRG.Text";
_namerg = mostCurrent._edtsearchrg.getText();
 //BA.debugLineNum = 152;BA.debugLine="FindRG";
_findrg();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public static String  _findrg() throws Exception{
String _searchrg = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub FindRG";
 //BA.debugLineNum = 156;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 157;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
 //BA.debugLineNum = 158;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 159;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 161;BA.debugLine="Log(\"Searching '\"&nameRG&\"' on maps\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43473414","Searching '"+_namerg+"' on maps",0);
 //BA.debugLineNum = 162;BA.debugLine="Dim searchRG As String";
_searchrg = "";
 //BA.debugLineNum = 163;BA.debugLine="searchRG = \"findRG('\"&nameRG&\"')\"";
_searchrg = "findRG('"+_namerg+"')";
 //BA.debugLineNum = 164;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, sear";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_searchrg);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mostCurrent._mywebviewextras = new uk.co.martinpearman.b4a.webviewextras.WebViewExtras();
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mostCurrent._mywebviewsettings = new uk.co.martinpearman.b4a.webviewsettings.WebViewSettings();
 //BA.debugLineNum = 20;BA.debugLine="Private PanelRG As Panel";
mostCurrent._panelrg = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private WebViewRG As WebView";
mostCurrent._webviewrg = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private BtnBack As Button";
mostCurrent._btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Navbar As Panel";
mostCurrent._navbar = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private MainScroll As ScrollView";
mostCurrent._mainscroll = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private btnUserLoc As Button";
mostCurrent._btnuserloc = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private btnObj As Button";
mostCurrent._btnobj = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private edtSearchRG As EditText";
mostCurrent._edtsearchrg = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private PanelSearch As Panel";
mostCurrent._panelsearch = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private btnList As Button";
mostCurrent._btnlist = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private PanelRating As Panel";
mostCurrent._panelrating = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private spinRating As Spinner";
mostCurrent._spinrating = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private PanelFacility As Panel";
mostCurrent._panelfacility = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private spinFacility As Spinner";
mostCurrent._spinfacility = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private PanelCategory As Panel";
mostCurrent._panelcategory = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private spinCategory As Spinner";
mostCurrent._spincategory = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _facility = null;
 //BA.debugLineNum = 167;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 168;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("43538945","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 169;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 170;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 171;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ ();
 //BA.debugLineNum = 172;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 173;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 175;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadFacility")) {
case 0: {
 //BA.debugLineNum = 177;BA.debugLine="Try";
try { //BA.debugLineNum = 178;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 179;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
 //BA.debugLineNum = 180;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 181;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
 //BA.debugLineNum = 182;BA.debugLine="facilityMap.Initialize";
_facilitymap.Initialize();
 //BA.debugLineNum = 183;BA.debugLine="spinFacility.Add(\"Facility...\")";
mostCurrent._spinfacility.Add("Facility...");
 //BA.debugLineNum = 184;BA.debugLine="For i = 0 To data.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 185;BA.debugLine="Dim facility As Map";
_facility = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 186;BA.debugLine="facility = data.Get(i)";
_facility = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
 //BA.debugLineNum = 187;BA.debugLine="facilityMap.Put(facility.Get(\"facility\"), fa";
_facilitymap.Put(_facility.Get((Object)("facility")),_facility.Get((Object)("id")));
 //BA.debugLineNum = 188;BA.debugLine="spinFacility.Add(facility.Get(\"facility\"))";
mostCurrent._spinfacility.Add(BA.ObjectToString(_facility.Get((Object)("facility"))));
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23); //BA.debugLineNum = 191;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("43538968",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim nameRG As String";
_namerg = "";
 //BA.debugLineNum = 10;BA.debugLine="Dim facilityMap As Map";
_facilitymap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _spincategory_itemclick(int _position,Object _value) throws Exception{
String _findbycategoryrg = "";
 //BA.debugLineNum = 252;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
 //BA.debugLineNum = 253;BA.debugLine="Dim findByCategoryRG As String";
_findbycategoryrg = "";
 //BA.debugLineNum = 254;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
 //BA.debugLineNum = 255;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose category"),BA.ObjectToCharSequence("Search by Category"),processBA);
 //BA.debugLineNum = 256;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 257;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 258;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
 //BA.debugLineNum = 259;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 261;BA.debugLine="findByCategoryRG = \"findRG('')\"";
_findbycategoryrg = "findRG('')";
 //BA.debugLineNum = 262;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbycategoryrg);
 }else {
 //BA.debugLineNum = 264;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 265;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
 //BA.debugLineNum = 266;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 267;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 269;BA.debugLine="Log(\"Searching RG with category: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("43866641","Searching RG with category: "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 270;BA.debugLine="findByCategoryRG = \"findByCategoryRG('\"&Value&\"'";
_findbycategoryrg = "findByCategoryRG('"+BA.ObjectToString(_value)+"')";
 //BA.debugLineNum = 271;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbycategoryrg);
 };
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public static String  _spinfacility_itemclick(int _position,Object _value) throws Exception{
String _findbyfacilityrg = "";
 //BA.debugLineNum = 229;BA.debugLine="Private Sub spinFacility_ItemClick (Position As In";
 //BA.debugLineNum = 230;BA.debugLine="Dim findByFacilityRG As String";
_findbyfacilityrg = "";
 //BA.debugLineNum = 231;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
 //BA.debugLineNum = 232;BA.debugLine="MsgboxAsync(\"Please choose facility\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose facility"),BA.ObjectToCharSequence("Search by Facility"),processBA);
 //BA.debugLineNum = 233;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 234;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 235;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 236;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 238;BA.debugLine="findByFacilityRG = \"findRG('')\"";
_findbyfacilityrg = "findRG('')";
 //BA.debugLineNum = 239;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyfacilityrg);
 }else {
 //BA.debugLineNum = 241;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 242;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 243;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 244;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 246;BA.debugLine="Log(\"Searching RG with facility: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("43801105","Searching RG with facility: "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 247;BA.debugLine="findByFacilityRG = \"findByFacilityRG('\"&facility";
_findbyfacilityrg = "findByFacilityRG('"+BA.ObjectToString(_facilitymap.Get(_value))+"')";
 //BA.debugLineNum = 248;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyfacilityrg);
 };
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _spinrating_itemclick(int _position,Object _value) throws Exception{
String _findbyratingrg = "";
 //BA.debugLineNum = 206;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
 //BA.debugLineNum = 207;BA.debugLine="Dim findByRatingRG As String";
_findbyratingrg = "";
 //BA.debugLineNum = 208;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
 //BA.debugLineNum = 209;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose rating from 1-5"),BA.ObjectToCharSequence("Search by Rating"),processBA);
 //BA.debugLineNum = 210;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 211;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 212;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
 //BA.debugLineNum = 213;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 215;BA.debugLine="findByRatingRG = \"findRG('')\"";
_findbyratingrg = "findRG('')";
 //BA.debugLineNum = 216;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyratingrg);
 }else {
 //BA.debugLineNum = 218;BA.debugLine="edtSearchRG.Text = \"\"";
mostCurrent._edtsearchrg.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 219;BA.debugLine="spinFacility.SelectedIndex = 0";
mostCurrent._spinfacility.setSelectedIndex((int) (0));
 //BA.debugLineNum = 220;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 221;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 223;BA.debugLine="Log(\"Searching RG with \"&Value&\" rating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43735569","Searching RG with "+BA.ObjectToString(_value)+" rating",0);
 //BA.debugLineNum = 224;BA.debugLine="findByRatingRG = \"findByRatingRG('\"&Value&\"')\"";
_findbyratingrg = "findByRatingRG('"+BA.ObjectToString(_value)+"')";
 //BA.debugLineNum = 225;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_findbyratingrg);
 };
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public static String  _updatelocation() throws Exception{
String _userposition = "";
 //BA.debugLineNum = 102;BA.debugLine="Public Sub UpdateLocation";
 //BA.debugLineNum = 103;BA.debugLine="Log(\"Update user position on Maps Rumah Gadang\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43145729","Update user position on Maps Rumah Gadang",0);
 //BA.debugLineNum = 104;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("43145730","Lat: "+mostCurrent._starter._lat /*String*/ +"; Long: "+mostCurrent._starter._lng /*String*/ ,0);
 //BA.debugLineNum = 105;BA.debugLine="Dim userPosition As String";
_userposition = "";
 //BA.debugLineNum = 106;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
_userposition = "userPositionAPI("+mostCurrent._starter._lat /*String*/ +", "+mostCurrent._starter._lng /*String*/ +")";
 //BA.debugLineNum = 107;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, user";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewrg.getObject()),_userposition);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public static String  _webviewrg_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Private Sub WebViewRG_PageFinished (Url As String)";
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public static String  _webviewrg_progresschanged(int _loading) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub WebViewRG_ProgressChanged(loading As Int)";
 //BA.debugLineNum = 111;BA.debugLine="If loading == 100 Then";
if (_loading==100) { 
 //BA.debugLineNum = 112;BA.debugLine="Log(\"Webview loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43211266","Webview loaded",0);
 //BA.debugLineNum = 113;BA.debugLine="Starter.webviewLoading = loading";
mostCurrent._starter._webviewloading /*int*/  = _loading;
 //BA.debugLineNum = 114;BA.debugLine="PanelSearch.Visible = True";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 115;BA.debugLine="btnObj.Visible = True";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 116;BA.debugLine="btnUserLoc.Visible = True";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 117;BA.debugLine="btnList.Visible = True";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 118;BA.debugLine="PanelRating.Visible = True";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 119;BA.debugLine="PanelFacility.Visible = True";
mostCurrent._panelfacility.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 120;BA.debugLine="PanelCategory.Visible = True";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 121;BA.debugLine="UpdateLocation";
_updatelocation();
 }else {
 //BA.debugLineNum = 123;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
anywheresoftware.b4a.keywords.Common.LogImpl("43211277","Webview loading at "+BA.NumberToString(_loading)+"% ....",0);
 };
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
}
