package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.DesaWisataSumpu", "b4a.DesaWisataSumpu.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.DesaWisataSumpu.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _tasks = null;
public static anywheresoftware.b4a.objects.collections.Map _cache = null;
public static anywheresoftware.b4a.objects.collections.Map _ongoingtasks = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static boolean _gpsstarted = false;
public static String _lat = "";
public static String _lng = "";
public static String _mapstatus = "";
public static int _webviewloading = 0;
public static anywheresoftware.b4a.objects.collections.Map _selectedobj = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public b4a.DesaWisataSumpu.mapsev _mapsev = null;
public b4a.DesaWisataSumpu.core _core = null;
public b4a.DesaWisataSumpu.detailev _detailev = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homeuser _homeuser = null;
public b4a.DesaWisataSumpu.listev _listev = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 39;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper  _createbitmap() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _path = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
float _x = 0f;
float _y = 0f;
float _radius = 0f;
 //BA.debugLineNum = 100;BA.debugLine="Sub CreateBitmap As Canvas";
 //BA.debugLineNum = 101;BA.debugLine="Public bmp  As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 102;BA.debugLine="bmp.InitializeMutable(200dip, 200dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
 //BA.debugLineNum = 103;BA.debugLine="Public cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 104;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 105;BA.debugLine="Public rect As Rect";
_rect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 106;BA.debugLine="rect.Initialize(0, 0, bmp.Width, bmp.Height)";
_rect.Initialize((int) (0),(int) (0),_bmp.getWidth(),_bmp.getHeight());
 //BA.debugLineNum = 107;BA.debugLine="cvs.DrawRect(rect, Colors.Transparent, True, 0)";
_cvs.DrawRect((android.graphics.Rect)(_rect.getObject()),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.True,(float) (0));
 //BA.debugLineNum = 108;BA.debugLine="Public path As Path";
_path = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
 //BA.debugLineNum = 109;BA.debugLine="path.Initialize(0, 0)";
_path.Initialize((float) (0),(float) (0));
 //BA.debugLineNum = 110;BA.debugLine="Public jo As JavaObject = path";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_path.getObject()));
 //BA.debugLineNum = 111;BA.debugLine="Public x = 100dip, y = 100dip, radius = 100dip As";
_x = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_y = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_radius = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
 //BA.debugLineNum = 112;BA.debugLine="jo.RunMethod(\"addCircle\", Array As Object(x, y, r";
_jo.RunMethod("addCircle",new Object[]{(Object)(_x),(Object)(_y),(Object)(_radius),(Object)("CW")});
 //BA.debugLineNum = 113;BA.debugLine="cvs.ClipPath(path)";
_cvs.ClipPath((android.graphics.Path)(_path.getObject()));
 //BA.debugLineNum = 114;BA.debugLine="Return cvs";
if (true) return _cvs;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imagemap) throws Exception{
int _i = 0;
String _path = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
b4a.DesaWisataSumpu.httpjob _job = null;
 //BA.debugLineNum = 62;BA.debugLine="Sub Download (ImageMap As Map)";
 //BA.debugLineNum = 63;BA.debugLine="For i = 0 To ImageMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imagemap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 64;BA.debugLine="tasks.Put(ImageMap.GetKeyAt(i), ImageMap.GetValu";
_tasks.Put(_imagemap.GetKeyAt(_i),_imagemap.GetValueAt(_i));
 //BA.debugLineNum = 65;BA.debugLine="Public path As String = ImageMap.GetValueAt(i)";
_path = BA.ObjectToString(_imagemap.GetValueAt(_i));
 //BA.debugLineNum = 66;BA.debugLine="If cache.ContainsKey(path) Then";
if (_cache.ContainsKey((Object)(_path))) { 
 //BA.debugLineNum = 67;BA.debugLine="Public iv As ImageView = ImageMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imagemap.GetKeyAt(_i)));
 //BA.debugLineNum = 68;BA.debugLine="iv.SetBackgroundImage(cache.Get(path))";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cache.Get((Object)(_path))));
 }else if(_ongoingtasks.ContainsKey((Object)(_path))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 70;BA.debugLine="ongoingTasks.Put(path, \"\")";
_ongoingtasks.Put((Object)(_path),(Object)(""));
 //BA.debugLineNum = 71;BA.debugLine="Public Job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
 //BA.debugLineNum = 72;BA.debugLine="Job.Initialize(path, Me)";
_job._initialize /*String*/ (processBA,_path,starter.getObject());
 //BA.debugLineNum = 73;BA.debugLine="Job.Download(path)";
_job._download /*String*/ (_path);
 };
 }
};
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _drawroundbitmap(anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)";
 //BA.debugLineNum = 118;BA.debugLine="Public r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 119;BA.debugLine="r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.H";
_r.Initialize((int) (0),(int) (0),_cvs.getBitmap().getWidth(),_cvs.getBitmap().getHeight());
 //BA.debugLineNum = 120;BA.debugLine="cvs.DrawBitmap(bmp, Null, r)";
_cvs.DrawBitmap((android.graphics.Bitmap)(_bmp.getObject()),(android.graphics.Rect)(anywheresoftware.b4a.keywords.Common.Null),(android.graphics.Rect)(_r.getObject()));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
String _currentlat = "";
String _currentlng = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub GPS_LocationChanged(Location1 As Location)";
 //BA.debugLineNum = 124;BA.debugLine="Dim currentLat, currentLng As String";
_currentlat = "";
_currentlng = "";
 //BA.debugLineNum = 125;BA.debugLine="currentLat = Location1.Latitude";
_currentlat = BA.NumberToString(_location1.getLatitude());
 //BA.debugLineNum = 126;BA.debugLine="currentLng = Location1.Longitude";
_currentlng = BA.NumberToString(_location1.getLongitude());
 //BA.debugLineNum = 127;BA.debugLine="If currentLat <> lat And currentLng <> lng Then";
if ((_currentlat).equals(_lat) == false && (_currentlng).equals(_lng) == false) { 
 //BA.debugLineNum = 128;BA.debugLine="lat = currentLat";
_lat = _currentlat;
 //BA.debugLineNum = 129;BA.debugLine="lng = currentLng";
_lng = _currentlng;
 //BA.debugLineNum = 130;BA.debugLine="Log(\"Current Location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41376263","Current Location",0);
 //BA.debugLineNum = 131;BA.debugLine="Log(\"Lat = \" & lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("41376264","Lat = "+_lat,0);
 //BA.debugLineNum = 132;BA.debugLine="Log(\"Lng = \" & lng)";
anywheresoftware.b4a.keywords.Common.LogImpl("41376265","Lng = "+_lng,0);
 //BA.debugLineNum = 133;BA.debugLine="If webviewLoading == 100 Then";
if (_webviewloading==100) { 
 //BA.debugLineNum = 134;BA.debugLine="If mapStatus == \"RG\" Then";
if ((_mapstatus).equals("RG")) { 
 //BA.debugLineNum = 135;BA.debugLine="CallSub(MapsRG, \"UpdateLocation\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._mapsrg.getObject()),"UpdateLocation");
 }else if((_mapstatus).equals("EV")) { 
 //BA.debugLineNum = 137;BA.debugLine="CallSub(MapsEV, \"UpdateLocation\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._mapsev.getObject()),"UpdateLocation");
 };
 };
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
String _path = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 79;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
_ongoingtasks.Remove((Object)(_job._jobname /*String*/ ));
 //BA.debugLineNum = 80;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 81;BA.debugLine="Public bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ();
 //BA.debugLineNum = 82;BA.debugLine="If tasks.IsInitialized Then";
if (_tasks.IsInitialized()) { 
 //BA.debugLineNum = 83;BA.debugLine="For i = 0 To tasks.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tasks.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 84;BA.debugLine="Public path As String = tasks.GetValueAt(i)";
_path = BA.ObjectToString(_tasks.GetValueAt(_i));
 //BA.debugLineNum = 85;BA.debugLine="If path = Job.JobName Then";
if ((_path).equals(_job._jobname /*String*/ )) { 
 //BA.debugLineNum = 86;BA.debugLine="Public iv As ImageView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_tasks.GetKeyAt(_i)));
 //BA.debugLineNum = 87;BA.debugLine="Public canvas As Canvas = CreateBitmap";
_canvas = _createbitmap();
 //BA.debugLineNum = 88;BA.debugLine="DrawRoundBitmap(canvas, bmp)";
_drawroundbitmap(_canvas,_bmp);
 //BA.debugLineNum = 89;BA.debugLine="iv.SetBackgroundImage(canvas.Bitmap)";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_canvas.getBitmap().getObject()));
 //BA.debugLineNum = 90;BA.debugLine="cache.Put(Job.JobName, canvas.Bitmap)";
_cache.Put((Object)(_job._jobname /*String*/ ),(Object)(_canvas.getBitmap().getObject()));
 };
 }
};
 };
 }else {
 //BA.debugLineNum = 95;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.LogImpl("41179665","Error downloading image: "+_job._jobname /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage /*String*/ ,0);
 };
 //BA.debugLineNum = 97;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private tasks As Map";
_tasks = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private cache As Map";
_cache = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private ongoingTasks As Map";
_ongoingtasks = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Public GPS1 As GPS";
_gps1 = new anywheresoftware.b4a.gps.GPS();
 //BA.debugLineNum = 13;BA.debugLine="Public rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 14;BA.debugLine="Private gpsStarted As Boolean";
_gpsstarted = false;
 //BA.debugLineNum = 15;BA.debugLine="Public lat, lng, mapStatus As String";
_lat = "";
_lng = "";
_mapstatus = "";
 //BA.debugLineNum = 16;BA.debugLine="Public webviewLoading As Int";
_webviewloading = 0;
 //BA.debugLineNum = 17;BA.debugLine="Public selectedObj As Map";
_selectedobj = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 23;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="cache.Initialize";
_cache.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="GPS1.Initialize(\"GPS\")";
_gps1.Initialize("GPS");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 30;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _startgps() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub StartGPS";
 //BA.debugLineNum = 47;BA.debugLine="If gpsStarted = False Then";
if (_gpsstarted==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 48;BA.debugLine="GPS1.Start(0, 0)";
_gps1.Start(processBA,(long) (0),(float) (0));
 //BA.debugLineNum = 49;BA.debugLine="gpsStarted = True";
_gpsstarted = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 50;BA.debugLine="Log(\"GPS is started\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4983044","GPS is started",0);
 };
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _stopgps() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub StopGPS";
 //BA.debugLineNum = 55;BA.debugLine="If gpsStarted Then";
if (_gpsstarted) { 
 //BA.debugLineNum = 56;BA.debugLine="GPS1.Stop";
_gps1.Stop();
 //BA.debugLineNum = 57;BA.debugLine="gpsStarted = False";
_gpsstarted = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 58;BA.debugLine="Log(\"GPS is stopped\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41048580","GPS is stopped",0);
 };
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
}
