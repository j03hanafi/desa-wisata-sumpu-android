
package b4a.DesaWisataSumpu;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class homeuser implements IRemote{
	public static homeuser mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homeuser() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homeuser"), "b4a.DesaWisataSumpu.homeuser");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, homeuser.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _email = RemoteObject.createImmutable("");
public static RemoteObject _first_name = RemoteObject.createImmutable("");
public static RemoteObject _last_name = RemoteObject.createImmutable("");
public static RemoteObject _avatar = RemoteObject.createImmutable("");
public static RemoteObject _address = RemoteObject.createImmutable("");
public static RemoteObject _phone = RemoteObject.createImmutable("");
public static RemoteObject _status = RemoteObject.createImmutable(0);
public static RemoteObject _labelheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labellogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelbanner = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelprofile = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _profileavatar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnev = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnlogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelev = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSumpu.main _main = null;
public static b4a.DesaWisataSumpu.starter _starter = null;
public static b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSumpu.listrg _listrg = null;
public static b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public static b4a.DesaWisataSumpu.mapsev _mapsev = null;
public static b4a.DesaWisataSumpu.core _core = null;
public static b4a.DesaWisataSumpu.detailev _detailev = null;
public static b4a.DesaWisataSumpu.detailrg _detailrg = null;
public static b4a.DesaWisataSumpu.listev _listev = null;
public static b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",homeuser.mostCurrent._activity,"address",homeuser._address,"avatar",homeuser._avatar,"B4XCollections",Debug.moduleToString(b4a.DesaWisataSumpu.b4xcollections.class),"BtnBack",homeuser.mostCurrent._btnback,"BtnEV",homeuser.mostCurrent._btnev,"BtnLogout",homeuser.mostCurrent._btnlogout,"BtnRG",homeuser.mostCurrent._btnrg,"Core",Debug.moduleToString(b4a.DesaWisataSumpu.core.class),"data",homeuser._data,"DateUtils",homeuser.mostCurrent._dateutils,"DetailEV",Debug.moduleToString(b4a.DesaWisataSumpu.detailev.class),"DetailRG",Debug.moduleToString(b4a.DesaWisataSumpu.detailrg.class),"email",homeuser._email,"first_name",homeuser._first_name,"HomeVisitor",Debug.moduleToString(b4a.DesaWisataSumpu.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.DesaWisataSumpu.httputils2service.class),"id",homeuser._id,"LabelEV",homeuser.mostCurrent._labelev,"LabelHeader",homeuser.mostCurrent._labelheader,"LabelLogout",homeuser.mostCurrent._labellogout,"LabelName",homeuser.mostCurrent._labelname,"LabelRG",homeuser.mostCurrent._labelrg,"LabelUsername",homeuser.mostCurrent._labelusername,"last_name",homeuser._last_name,"ListEV",Debug.moduleToString(b4a.DesaWisataSumpu.listev.class),"ListRG",Debug.moduleToString(b4a.DesaWisataSumpu.listrg.class),"Main",Debug.moduleToString(b4a.DesaWisataSumpu.main.class),"MainScroll",homeuser.mostCurrent._mainscroll,"MapsEV",Debug.moduleToString(b4a.DesaWisataSumpu.mapsev.class),"MapsRG",Debug.moduleToString(b4a.DesaWisataSumpu.mapsrg.class),"Navbar",homeuser.mostCurrent._navbar,"PanelBanner",homeuser.mostCurrent._panelbanner,"PanelHome",homeuser.mostCurrent._panelhome,"PanelMenu",homeuser.mostCurrent._panelmenu,"PanelProfile",homeuser.mostCurrent._panelprofile,"phone",homeuser._phone,"ProfileAvatar",homeuser.mostCurrent._profileavatar,"Starter",Debug.moduleToString(b4a.DesaWisataSumpu.starter.class),"status",homeuser._status,"TitleNavbar",homeuser.mostCurrent._titlenavbar,"username",homeuser._username,"XUIViewsUtils",Debug.moduleToString(b4a.DesaWisataSumpu.xuiviewsutils.class)};
}
}