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

public class listev extends Activity implements B4AActivity{
	public static listev mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.listev");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (listev).");
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
		activityBA = new BA(this, layout, processBA, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.listev");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.listev", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (listev) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (listev) Resume **");
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
		return listev.class;
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
            BA.LogInfo("** Activity (listev) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (listev) Pause event (activity is not paused). **");
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
            listev mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (listev) Resume **");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static boolean _isdownloadready = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlenavbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrefresh = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _loadrefresh = null;
public b4a.example3.customlistview _clv = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellistitem = null;
public anywheresoftware.b4a.objects.LabelWrapper _idev = null;
public anywheresoftware.b4a.objects.LabelWrapper _categoryev = null;
public anywheresoftware.b4a.objects.LabelWrapper _nameev = null;
public anywheresoftware.b4a.objects.LabelWrapper _dateev = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivev = null;
public anywheresoftware.b4a.objects.collections.Map _imgmap = null;
public b4a.DesaWisataSumpu.simplemediamanager _mediamanager = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public b4a.DesaWisataSumpu.mapsev _mapsev = null;
public b4a.DesaWisataSumpu.core _core = null;
public b4a.DesaWisataSumpu.detailev _detailev = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homeuser _homeuser = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
mostCurrent._mainscroll.getPanel().LoadLayout("List",mostCurrent.activityBA);
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="PanelList.Height = MainScroll.Height";
mostCurrent._panellist.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="TitleNavbar.Text = \"List Event\"";
mostCurrent._titlenavbar.setText(BA.ObjectToCharSequence("List Event"));
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="btnRefresh.Visible = False";
mostCurrent._btnrefresh.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="loadRefresh.Visible = True";
mostCurrent._loadrefresh.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="imgMap.Initialize";
mostCurrent._imgmap.Initialize();
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="MediaManager.Initialize";
mostCurrent._mediamanager._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="CLV.Clear";
mostCurrent._clv._clear();
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="imgMap.Clear";
mostCurrent._imgmap.Clear();
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"event\", \"LoadEV\", Me";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"event","LoadEV",listev.getObject());
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="listev";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
anywheresoftware.b4a.objects.collections.Map _extra = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Log(\"ListEV loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("56881281","ListEV loaded",0);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim extra As Map = CreateMap(MediaManager.REQUEST";
_extra = new anywheresoftware.b4a.objects.collections.Map();
_extra = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(mostCurrent._mediamanager._request_resize_mode /*String*/ ),(Object)("FILL_NO_DISTORTIONS")});
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="DownloadImg(imgMap, isDownloadReady, extra)";
_downloadimg(mostCurrent._imgmap,_isdownloadready,_extra);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="End Sub";
return "";
}
public static String  _downloadimg(anywheresoftware.b4a.objects.collections.Map _imagemap,boolean _readytodownload,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadimg", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "downloadimg", new Object[] {_imagemap,_readytodownload,_extra}));}
int _i = 0;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub DownloadImg (ImageMap As Map, readyToDownload";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="If readyToDownload Then";
if (_readytodownload) { 
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="If extra.Size > 0 Then";
if (_extra.getSize()>0) { 
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="For i = 0 To ImageMap.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_imagemap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="Log(\"Getting \"&ImageMap.GetValueAt(i)&\"@\"&Imag";
anywheresoftware.b4a.keywords.Common.LogImpl("57405572","Getting "+BA.ObjectToString(_imagemap.GetValueAt(_i))+"@"+BA.ObjectToString(_imagemap.GetKeyAt(_i)),0);
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="MediaManager.SetMediaWithExtra(ImageMap.GetKey";
mostCurrent._mediamanager._setmediawithextra /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imagemap.GetKeyAt(_i))),BA.ObjectToString(_imagemap.GetValueAt(_i)),"",_extra);
 }
};
 };
 };
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="End Sub";
return "";
}
public static String  _btnback_click() throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnback_click", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub BtnBack_Click";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57012353","Going back to previous activity",0);
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="End Sub";
return "";
}
public static String  _btnrefresh_click() throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrefresh_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnrefresh_click", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub btnRefresh_Click";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Log(\"Refreshing ListEV...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57340033","Refreshing ListEV...",0);
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="btnRefresh.Visible = False";
mostCurrent._btnrefresh.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="loadRefresh.Visible = True";
mostCurrent._loadrefresh.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Core.ExecuteUrlGet(Main.API&\"event\", \"LoadEV\", Me";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._api /*String*/ +"event","LoadEV",listev.getObject());
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="End Sub";
return "";
}
public static String  _clv_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clv_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub CLV_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createitem(String _id,String _category,String _name,String _date,String _img) throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_id,_category,_name,_date,_img}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _imgpath = "";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub CreateItem (id As String, category As";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x, 160dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (160)));
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="p.LoadLayout(\"itemEV\")";
_p.LoadLayout("itemEV",mostCurrent.activityBA);
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="idEV.Text = id";
mostCurrent._idev.setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="categoryEV.Text = category";
mostCurrent._categoryev.setText(BA.ObjectToCharSequence(_category));
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="nameEV.Text = name";
mostCurrent._nameev.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="dateEV.Text = date";
mostCurrent._dateev.setText(BA.ObjectToCharSequence(_date));
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Dim imgPath As String = Main.server & \"media/phot";
_imgpath = mostCurrent._main._server /*String*/ +"media/photos/"+_img;
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="imgMap.Put(ivEV, imgPath)";
mostCurrent._imgmap.Put((Object)(mostCurrent._ivev.getObject()),(Object)(_imgpath));
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="End Sub";
return null;
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _ev = null;
anywheresoftware.b4a.objects.collections.Map _extra = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("57274497","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadEV")) {
case 0: {
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="Try";
try {RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="If data.Size-1 > 0 Then";
if (_data.getSize()-1>0) { 
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="CLV.Clear";
mostCurrent._clv._clear();
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="imgMap.Clear";
mostCurrent._imgmap.Clear();
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="For i = 0 To data.Size-1";
{
final int step17 = 1;
final int limit17 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Dim ev As Map";
_ev = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="ev = data.Get(i)";
_ev = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="CLV.Add(CreateItem(ev.Get(\"id\"), ev.Get(\"ca";
mostCurrent._clv._add(_createitem(BA.ObjectToString(_ev.Get((Object)("id"))),BA.ObjectToString(_ev.Get((Object)("category"))),BA.ObjectToString(_ev.Get((Object)("name"))),BA.ObjectToString(_ev.Get((Object)("date_next"))),BA.ObjectToString(_ev.Get((Object)("gallery")))),(Object)(""));
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="CLV.AsView.Height = PanelListItem.Height *";
mostCurrent._clv._asview().setHeight((int) (mostCurrent._panellistitem.getHeight()*mostCurrent._clv._getsize()));
 }
};
RDebugUtils.currentLine=7274520;
 //BA.debugLineNum = 7274520;BA.debugLine="isDownloadReady = True";
_isdownloadready = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="Dim extra As Map = CreateMap(MediaManager.RE";
_extra = new anywheresoftware.b4a.objects.collections.Map();
_extra = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)(mostCurrent._mediamanager._request_resize_mode /*String*/ ),(Object)("FILL_NO_DISTORTIONS")});
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="DownloadImg(imgMap, isDownloadReady, extra)";
_downloadimg(mostCurrent._imgmap,_isdownloadready,_extra);
RDebugUtils.currentLine=7274523;
 //BA.debugLineNum = 7274523;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
mostCurrent._clv._sv.setHeight(mostCurrent._clv._asview().getHeight());
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="PanelList.Height = CLV.AsView.Height";
mostCurrent._panellist.setHeight(mostCurrent._clv._asview().getHeight());
RDebugUtils.currentLine=7274525;
 //BA.debugLineNum = 7274525;BA.debugLine="MainScroll.Panel.Height = CLV.AsView.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._clv._asview().getHeight());
 };
RDebugUtils.currentLine=7274527;
 //BA.debugLineNum = 7274527;BA.debugLine="btnRefresh.Visible = True";
mostCurrent._btnrefresh.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7274528;
 //BA.debugLineNum = 7274528;BA.debugLine="loadRefresh.Visible = False";
mostCurrent._loadrefresh.setVisible(anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e33) {
			processBA.setLastException(e33);RDebugUtils.currentLine=7274530;
 //BA.debugLineNum = 7274530;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("57274530",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=7274534;
 //BA.debugLineNum = 7274534;BA.debugLine="End Sub";
return "";
}
public static String  _panellistitem_click() throws Exception{
RDebugUtils.currentModule="listev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panellistitem_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panellistitem_click", null));}
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub PanelListItem_Click";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
_item = mostCurrent._clv._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="p = CLV.GetPanel(item)";
_p = mostCurrent._clv._getpanel(_item);
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="Starter.selectedObj.Initialize";
mostCurrent._starter._selectedobj /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Starter.selectedObj.Put(\"id\", a.GetView(0).GetVie";
mostCurrent._starter._selectedobj /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(_a.GetView((int) (0)).GetView((int) (0)).getText()));
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Starter.selectedObj.Put(\"name\", a.GetView(0).GetV";
mostCurrent._starter._selectedobj /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("name"),(Object)(_a.GetView((int) (0)).GetView((int) (4)).getText()));
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Log(\"Redirect to DetailEV Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("57143435","Redirect to DetailEV Activity",0);
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="StartActivity(DetailEV)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._detailev.getObject()));
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="End Sub";
return "";
}
}