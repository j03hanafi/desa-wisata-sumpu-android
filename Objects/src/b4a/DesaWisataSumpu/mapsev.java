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

public class mapsev extends Activity implements B4AActivity{
	public static mapsev mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.mapsev");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsev).");
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
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.mapsev");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.mapsev", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsev) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsev) Resume **");
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
		return mapsev.class;
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
            BA.LogInfo("** Activity (mapsev) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mapsev) Pause event (activity is not paused). **");
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
            mapsev mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mapsev) Resume **");
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
public static String _nameev = "";
public static anywheresoftware.b4a.objects.collections.Map _categorymap = null;
public static boolean _isfiltered = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public uk.co.martinpearman.b4a.webviewextras.WebViewExtras _mywebviewextras = null;
public uk.co.martinpearman.b4a.webviewsettings.WebViewSettings _mywebviewsettings = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelev = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewev = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnuserloc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnobj = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtsearchev = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcategory = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldate = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrating = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spincategory = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinrating = null;
public b4a.DesaWisataSumpu.swiftbutton _btndate = null;
public b4a.DesaWisataSumpu.b4xdatetemplate _datetemplate = null;
public b4a.DesaWisataSumpu.b4xdialog _dialog = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
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
 //BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 45;BA.debugLine="Starter.mapStatus = \"EV\"";
mostCurrent._starter._mapstatus /*String*/  = "EV";
 //BA.debugLineNum = 46;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 47;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsEV",mostCurrent.activityBA);
 //BA.debugLineNum = 48;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 49;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 50;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
 //BA.debugLineNum = 51;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
 //BA.debugLineNum = 53;BA.debugLine="WebViewEV.Height = MainScroll.Height";
mostCurrent._webviewev.setHeight(mostCurrent._mainscroll.getHeight());
 //BA.debugLineNum = 54;BA.debugLine="PanelEV.Height = MainScroll.Height";
mostCurrent._panelev.setHeight(mostCurrent._mainscroll.getHeight());
 //BA.debugLineNum = 55;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
 //BA.debugLineNum = 57;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
mostCurrent._mywebviewextras.addWebChromeClient(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webviewev.getObject()),"WebViewEV");
 //BA.debugLineNum = 58;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
mostCurrent._webviewev.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 59;BA.debugLine="WebViewEV.LoadUrl(Main.server&\"web/event/maps\")";
mostCurrent._webviewev.LoadUrl(mostCurrent._main._server /*String*/ +"web/event/maps");
 //BA.debugLineNum = 61;BA.debugLine="PanelSearch.Visible = False";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 62;BA.debugLine="btnObj.Visible = False";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 63;BA.debugLine="btnUserLoc.Visible = False";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 64;BA.debugLine="btnList.Visible = False";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 65;BA.debugLine="PanelRating.Visible = False";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 66;BA.debugLine="PanelDate.Visible = False";
mostCurrent._paneldate.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 67;BA.debugLine="PanelCategory.Visible = False";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 69;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
mostCurrent._spinrating.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 70;BA.debugLine="spinCategory.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spincategory.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 72;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
mostCurrent._spinrating.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Rating...","1","2","3","4","5"}));
 //BA.debugLineNum = 73;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"event/category\", \"Lo";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"event/category","LoadCategory",mapsev.getObject());
 //BA.debugLineNum = 74;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
 //BA.debugLineNum = 75;BA.debugLine="Dialog.Title = \"Select Date...\"";
mostCurrent._dialog._title /*Object*/  = (Object)("Select Date...");
 //BA.debugLineNum = 76;BA.debugLine="DateTemplate.Initialize";
mostCurrent._datetemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 77;BA.debugLine="DateTemplate.MinYear = 2000";
mostCurrent._datetemplate._minyear /*int*/  = (int) (2000);
 //BA.debugLineNum = 78;BA.debugLine="DateTemplate.MaxYear = 2050";
mostCurrent._datetemplate._maxyear /*int*/  = (int) (2050);
 //BA.debugLineNum = 79;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 100;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StopGPS");
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.DesaWisataSumpu.mapsev parent) {
this.parent = parent;
}
b4a.DesaWisataSumpu.mapsev parent;
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
 //BA.debugLineNum = 83;BA.debugLine="Log(\"MapsEV Loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44128769","MapsEV Loaded",0);
 //BA.debugLineNum = 84;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
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
 //BA.debugLineNum = 85;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 86;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1 /*anywheresoftware.b4a.gps.GPS*/ .getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 88;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
 //BA.debugLineNum = 89;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 90;BA.debugLine="If Result Then";
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
 //BA.debugLineNum = 91;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 93;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please allow GPS to run this appliation"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
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
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static String  _btnback_click() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Private Sub BtnBack_Click";
 //BA.debugLineNum = 104;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44259841","Going back to previous activity",0);
 //BA.debugLineNum = 105;BA.debugLine="Starter.mapStatus = \"\"";
mostCurrent._starter._mapstatus /*String*/  = "";
 //BA.debugLineNum = 106;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static void  _btndate_click() throws Exception{
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4a.DesaWisataSumpu.mapsev parent) {
this.parent = parent;
}
b4a.DesaWisataSumpu.mapsev parent;
int _result = 0;
String _selecteddate = "";
String _findbydateev = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 263;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("Cancel")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 264;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 265;BA.debugLine="Dim selectedDate As String";
_selecteddate = "";
 //BA.debugLineNum = 266;BA.debugLine="Dim findByDateEV As String";
_findbydateev = "";
 //BA.debugLineNum = 267;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 268;BA.debugLine="selectedDate = DateTime.Date(DateTemplate.Date)";
_selecteddate = anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplate._getdate /*long*/ ());
 //BA.debugLineNum = 269;BA.debugLine="btnDate.xLBL.Text = selectedDate";
parent.mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_selecteddate));
 //BA.debugLineNum = 271;BA.debugLine="edtSearchEV.Text = \"\"";
parent.mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 272;BA.debugLine="spinRating.SelectedIndex = 0";
parent.mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 273;BA.debugLine="spinCategory.SelectedIndex = 0";
parent.mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 274;BA.debugLine="isFiltered = True";
parent._isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 276;BA.debugLine="Log(\"Searching EV with date: \"&selectedDate)";
anywheresoftware.b4a.keywords.Common.LogImpl("45046286","Searching EV with date: "+_selecteddate,0);
 //BA.debugLineNum = 277;BA.debugLine="findByDateEV = \"findByDateEV('\"&selectedDate&\"')";
_findbydateev = "findByDateEV('"+_selecteddate+"')";
 //BA.debugLineNum = 278;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
parent.mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(parent.mostCurrent._webviewev.getObject()),_findbydateev);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static String  _btnlist_click() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Private Sub btnList_Click";
 //BA.debugLineNum = 210;BA.debugLine="Log(\"Redirect to ListEV activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44849665","Redirect to ListEV activity",0);
 //BA.debugLineNum = 211;BA.debugLine="StartActivity(ListEV)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listev.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static String  _btnobj_click() throws Exception{
String _boundtoobject = "";
 //BA.debugLineNum = 141;BA.debugLine="Private Sub btnObj_Click";
 //BA.debugLineNum = 142;BA.debugLine="Log(\"Pan to Event\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44521985","Pan to Event",0);
 //BA.debugLineNum = 143;BA.debugLine="Dim boundToObject As String";
_boundtoobject = "";
 //BA.debugLineNum = 144;BA.debugLine="If isFiltered Then";
if (_isfiltered) { 
 //BA.debugLineNum = 145;BA.debugLine="boundToObject = \"findEV('')\"";
_boundtoobject = "findEV('')";
 //BA.debugLineNum = 146;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 147;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 148;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 149;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 150;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 }else {
 //BA.debugLineNum = 152;BA.debugLine="boundToObject = \"boundToObject(false)\"";
_boundtoobject = "boundToObject(false)";
 };
 //BA.debugLineNum = 154;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, boun";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_boundtoobject);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _btnuserloc_click() throws Exception{
String _pantouser = "";
 //BA.debugLineNum = 134;BA.debugLine="Private Sub btnUserLoc_Click";
 //BA.debugLineNum = 135;BA.debugLine="Log(\"Panning to user location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44456449","Panning to user location",0);
 //BA.debugLineNum = 136;BA.debugLine="UpdateLocation";
_updatelocation();
 //BA.debugLineNum = 137;BA.debugLine="Dim panToUser As String = \"panToUser()\"";
_pantouser = "panToUser()";
 //BA.debugLineNum = 138;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, panT";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_pantouser);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _edtsearchev_enterpressed() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Private Sub edtSearchEV_EnterPressed";
 //BA.debugLineNum = 159;BA.debugLine="nameEV = edtSearchEV.Text";
_nameev = mostCurrent._edtsearchev.getText();
 //BA.debugLineNum = 160;BA.debugLine="FindEV";
_findev();
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static String  _findev() throws Exception{
String _searchrg = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub FindEV";
 //BA.debugLineNum = 164;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 165;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 166;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 //BA.debugLineNum = 167;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 169;BA.debugLine="Log(\"Searching '\"&nameEV&\"' on maps\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44653062","Searching '"+_nameev+"' on maps",0);
 //BA.debugLineNum = 170;BA.debugLine="Dim searchRG As String";
_searchrg = "";
 //BA.debugLineNum = 171;BA.debugLine="searchRG = \"findEV('\"&nameEV&\"')\"";
_searchrg = "findEV('"+_nameev+"')";
 //BA.debugLineNum = 172;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, sear";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_searchrg);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mostCurrent._mywebviewextras = new uk.co.martinpearman.b4a.webviewextras.WebViewExtras();
 //BA.debugLineNum = 20;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
mostCurrent._mywebviewsettings = new uk.co.martinpearman.b4a.webviewsettings.WebViewSettings();
 //BA.debugLineNum = 21;BA.debugLine="Private PanelEV As Panel";
mostCurrent._panelev = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private WebViewEV As WebView";
mostCurrent._webviewev = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private BtnBack As Button";
mostCurrent._btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Navbar As Panel";
mostCurrent._navbar = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private MainScroll As ScrollView";
mostCurrent._mainscroll = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private btnUserLoc As Button";
mostCurrent._btnuserloc = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private btnObj As Button";
mostCurrent._btnobj = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private edtSearchEV As EditText";
mostCurrent._edtsearchev = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private PanelSearch As Panel";
mostCurrent._panelsearch = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private btnList As Button";
mostCurrent._btnlist = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private PanelCategory As Panel";
mostCurrent._panelcategory = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private PanelDate As Panel";
mostCurrent._paneldate = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private PanelRating As Panel";
mostCurrent._panelrating = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private spinCategory As Spinner";
mostCurrent._spincategory = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private spinRating As Spinner";
mostCurrent._spinrating = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private btnDate As SwiftButton";
mostCurrent._btndate = new b4a.DesaWisataSumpu.swiftbutton();
 //BA.debugLineNum = 37;BA.debugLine="Private DateTemplate As B4XDateTemplate";
mostCurrent._datetemplate = new b4a.DesaWisataSumpu.b4xdatetemplate();
 //BA.debugLineNum = 38;BA.debugLine="Private Dialog As B4XDialog";
mostCurrent._dialog = new b4a.DesaWisataSumpu.b4xdialog();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _category = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 176;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("44718593","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 177;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 178;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 179;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ ();
 //BA.debugLineNum = 180;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 181;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 183;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadCategory")) {
case 0: {
 //BA.debugLineNum = 185;BA.debugLine="Try";
try { //BA.debugLineNum = 186;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 187;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
 //BA.debugLineNum = 188;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 189;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
 //BA.debugLineNum = 190;BA.debugLine="categoryMap.Initialize";
_categorymap.Initialize();
 //BA.debugLineNum = 191;BA.debugLine="spinCategory.Add(\"Category...\")";
mostCurrent._spincategory.Add("Category...");
 //BA.debugLineNum = 192;BA.debugLine="For i = 0 To data.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 193;BA.debugLine="Dim category As Map";
_category = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 194;BA.debugLine="category = data.Get(i)";
_category = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
 //BA.debugLineNum = 195;BA.debugLine="categoryMap.Put(category.Get(\"category\"), ca";
_categorymap.Put(_category.Get((Object)("category")),_category.Get((Object)("id")));
 //BA.debugLineNum = 196;BA.debugLine="spinCategory.Add(category.Get(\"category\"))";
mostCurrent._spincategory.Add(BA.ObjectToString(_category.Get((Object)("category"))));
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23); //BA.debugLineNum = 199;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("44718616",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim nameEV As String";
_nameev = "";
 //BA.debugLineNum = 10;BA.debugLine="Dim categoryMap As Map";
_categorymap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Dim isFiltered As Boolean = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 12;BA.debugLine="Private XUI as XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _spincategory_itemclick(int _position,Object _value) throws Exception{
String _findbycategoryev = "";
 //BA.debugLineNum = 239;BA.debugLine="Private Sub spinCategory_ItemClick (Position As In";
 //BA.debugLineNum = 240;BA.debugLine="Dim findByCategoryEV As String";
_findbycategoryev = "";
 //BA.debugLineNum = 241;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
 //BA.debugLineNum = 242;BA.debugLine="MsgboxAsync(\"Please choose category\", \"Search by";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose category"),BA.ObjectToCharSequence("Search by Category"),processBA);
 //BA.debugLineNum = 243;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 244;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 245;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 246;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 //BA.debugLineNum = 248;BA.debugLine="findByCategoryEV = \"findEV('')\"";
_findbycategoryev = "findEV('')";
 //BA.debugLineNum = 249;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbycategoryev);
 }else {
 //BA.debugLineNum = 251;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 252;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
 //BA.debugLineNum = 253;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 //BA.debugLineNum = 254;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 256;BA.debugLine="Log(\"Searching EV with category: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("44980753","Searching EV with category: "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 257;BA.debugLine="findByCategoryEV = \"findByCategoryEV('\"&category";
_findbycategoryev = "findByCategoryEV('"+BA.ObjectToString(_categorymap.Get(_value))+"')";
 //BA.debugLineNum = 258;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbycategoryev);
 };
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public static String  _spinrating_itemclick(int _position,Object _value) throws Exception{
String _findbyratingev = "";
 //BA.debugLineNum = 216;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
 //BA.debugLineNum = 217;BA.debugLine="Dim findByRatingEV As String";
_findbyratingev = "";
 //BA.debugLineNum = 218;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
 //BA.debugLineNum = 219;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose rating from 1-5"),BA.ObjectToCharSequence("Search by Rating"),processBA);
 //BA.debugLineNum = 220;BA.debugLine="isFiltered = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 221;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 222;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 223;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 //BA.debugLineNum = 225;BA.debugLine="findByRatingEV = \"findEV('')\"";
_findbyratingev = "findEV('')";
 //BA.debugLineNum = 226;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbyratingev);
 }else {
 //BA.debugLineNum = 228;BA.debugLine="edtSearchEV.Text = \"\"";
mostCurrent._edtsearchev.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 229;BA.debugLine="spinCategory.SelectedIndex = 0";
mostCurrent._spincategory.setSelectedIndex((int) (0));
 //BA.debugLineNum = 230;BA.debugLine="btnDate.xLBL.Text = \"Date...\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Date..."));
 //BA.debugLineNum = 231;BA.debugLine="isFiltered = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 233;BA.debugLine="Log(\"Searching EV with \"&Value&\" rating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44915217","Searching EV with "+BA.ObjectToString(_value)+" rating",0);
 //BA.debugLineNum = 234;BA.debugLine="findByRatingEV = \"findByRatingEV('\"&Value&\"')\"";
_findbyratingev = "findByRatingEV('"+BA.ObjectToString(_value)+"')";
 //BA.debugLineNum = 235;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, fin";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_findbyratingev);
 };
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public static String  _updatelocation() throws Exception{
String _userposition = "";
 //BA.debugLineNum = 109;BA.debugLine="Public Sub UpdateLocation";
 //BA.debugLineNum = 110;BA.debugLine="Log(\"Update user position on Maps Event\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44325377","Update user position on Maps Event",0);
 //BA.debugLineNum = 111;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("44325378","Lat: "+mostCurrent._starter._lat /*String*/ +"; Long: "+mostCurrent._starter._lng /*String*/ ,0);
 //BA.debugLineNum = 112;BA.debugLine="Dim userPosition As String";
_userposition = "";
 //BA.debugLineNum = 113;BA.debugLine="userPosition = \"userPositionAPI(\"&Starter.lat&\",";
_userposition = "userPositionAPI("+mostCurrent._starter._lat /*String*/ +", "+mostCurrent._starter._lng /*String*/ +")";
 //BA.debugLineNum = 114;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, user";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_userposition);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_progresschanged(int _loading) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub WebViewEV_ProgressChanged(loading As Int)";
 //BA.debugLineNum = 118;BA.debugLine="If loading == 100 Then";
if (_loading==100) { 
 //BA.debugLineNum = 119;BA.debugLine="Log(\"Webview loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44390914","Webview loaded",0);
 //BA.debugLineNum = 120;BA.debugLine="Starter.webviewLoading = loading";
mostCurrent._starter._webviewloading /*int*/  = _loading;
 //BA.debugLineNum = 121;BA.debugLine="PanelSearch.Visible = True";
mostCurrent._panelsearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 122;BA.debugLine="btnObj.Visible = True";
mostCurrent._btnobj.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 123;BA.debugLine="btnUserLoc.Visible = True";
mostCurrent._btnuserloc.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 124;BA.debugLine="btnList.Visible = True";
mostCurrent._btnlist.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 125;BA.debugLine="PanelRating.Visible = True";
mostCurrent._panelrating.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 126;BA.debugLine="PanelDate.Visible = True";
mostCurrent._paneldate.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 127;BA.debugLine="PanelCategory.Visible = True";
mostCurrent._panelcategory.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 128;BA.debugLine="UpdateLocation";
_updatelocation();
 }else {
 //BA.debugLineNum = 130;BA.debugLine="Log(\"Webview loading at \"&loading&\"% ....\")";
anywheresoftware.b4a.keywords.Common.LogImpl("44390925","Webview loading at "+BA.NumberToString(_loading)+"% ....",0);
 };
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
}
