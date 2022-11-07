package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class simplemediamanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.DesaWisataSumpu.simplemediamanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.simplemediamanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _state_loading = 0;
public int _state_error = 0;
public int _state_ready = 0;
public anywheresoftware.b4a.objects.collections.Map _metacache = null;
public b4a.DesaWisataSumpu.b4xorderedmap _mediacache = null;
public int _maxmediacachesize = 0;
public anywheresoftware.b4a.objects.collections.Map _viewsrequestset = null;
public b4a.DesaWisataSumpu.bitmapsasync _imagesloader = null;
public b4a.DesaWisataSumpu.httpjob _jobempty = null;
public String _key_default_loading = "";
public String _key_default_error = "";
public String _mime_unknown = "";
public int _maximagesize = 0;
public int _defaultfadeanimationduration = 0;
public String _defaultresizemode = "";
public int _defaultbackgroundcolor = 0;
public int _defaultforegroundcolor = 0;
public b4a.DesaWisataSumpu.smmviews _viewsmanager = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _defaultloadingrequest = null;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _defaulterrorrequest = null;
public String _request_roundimage = "";
public String _request_background = "";
public String _request_resize_mode = "";
public String _request_fade_animation_duration = "";
public String _request_foreground = "";
public String _request_callback = "";
public String _request_zoomimageview = "";
public String _request_file = "";
public String _request_dir = "";
public long _lasttrimcache = 0L;
public long _mintimebetweentrims = 0L;
public long _sleepdurationbeforedownload = 0L;
public b4a.DesaWisataSumpu.requestsmanager _httprequestsmanager = null;
public int _b4asdkversion = 0;
public int _defaultrequesttimeout = 0;
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
public b4a.DesaWisataSumpu.listev _listev = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static class _smmediameta{
public boolean IsInitialized;
public String Mime;
public int MediaType;
public String Key;
public int MetaState;
public b4a.DesaWisataSumpu.httpjob Job;
public boolean Permanent;
public b4a.DesaWisataSumpu.b4xset WaitingRequestsSets;
public String FirstUrl;
public String Dir;
public String FileName;
public void Initialize() {
IsInitialized = true;
Mime = "";
MediaType = 0;
Key = "";
MetaState = 0;
Job = new b4a.DesaWisataSumpu.httpjob();
Permanent = false;
WaitingRequestsSets = new b4a.DesaWisataSumpu.b4xset();
FirstUrl = "";
Dir = "";
FileName = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmedia{
public boolean IsInitialized;
public Object Media;
public b4a.DesaWisataSumpu.simplemediamanager._smmediameta Meta;
public b4a.DesaWisataSumpu.b4xset UsedBy;
public int MediaState;
public b4a.DesaWisataSumpu.b4xset WaitingRequestsSets;
public b4a.DesaWisataSumpu.httpjob Job;
public void Initialize() {
IsInitialized = true;
Media = new Object();
Meta = new b4a.DesaWisataSumpu.simplemediamanager._smmediameta();
UsedBy = new b4a.DesaWisataSumpu.b4xset();
MediaState = 0;
WaitingRequestsSets = new b4a.DesaWisataSumpu.b4xset();
Job = new b4a.DesaWisataSumpu.httpjob();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmediarequest{
public boolean IsInitialized;
public String Key;
public String Url;
public String Mime;
public anywheresoftware.b4a.objects.collections.Map Extra;
public void Initialize() {
IsInitialized = true;
Key = "";
Url = "";
Mime = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _smmediarequestset{
public boolean IsInitialized;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest Loading;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest MainMedia;
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest Error;
public anywheresoftware.b4a.objects.B4XViewWrapper Target;
public int NumberOfAncestors;
public int RequestState;
public Object Callback;
public void Initialize() {
IsInitialized = true;
Loading = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
MainMedia = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
Error = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
Target = new anywheresoftware.b4a.objects.B4XViewWrapper();
NumberOfAncestors = 0;
RequestState = 0;
Callback = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4a.DesaWisataSumpu.simplemediamanager._smmedia  _addlocalmedia(String _key,Object _media,String _mime) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _smedia = null;
 //BA.debugLineNum = 71;BA.debugLine="Public Sub AddLocalMedia (Key As String, Media As";
 //BA.debugLineNum = 72;BA.debugLine="Dim meta As SMMediaMeta = CreateSMMediaMeta(Mime,";
_meta = _createsmmediameta(_mime,_key,_state_ready,__c.True);
 //BA.debugLineNum = 73;BA.debugLine="Dim smedia As SMMedia = CreateSMMedia(Media, meta";
_smedia = _createsmmedia(_media,_meta,_state_ready);
 //BA.debugLineNum = 74;BA.debugLine="MetaCache.Put(meta.Key, meta)";
_metacache.Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
 //BA.debugLineNum = 75;BA.debugLine="MediaCache.Put(meta.Key, smedia)";
_mediacache._put /*String*/ ((Object)(_meta.Key /*String*/ ),(Object)(_smedia));
 //BA.debugLineNum = 76;BA.debugLine="Return smedia";
if (true) return _smedia;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _canceldisconnectedtargets(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
b4a.DesaWisataSumpu.b4xset _set = null;
int _i = 0;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset = null;
 //BA.debugLineNum = 466;BA.debugLine="Private Sub CancelDisconnectedTargets (Media As SM";
 //BA.debugLineNum = 467;BA.debugLine="For Each set As B4XSet In Array(Media.UsedBy, Med";
{
final Object[] group1 = new Object[]{(Object)(_media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ),(Object)(_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ )};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_set = (b4a.DesaWisataSumpu.b4xset)(group1[index1]);
 //BA.debugLineNum = 468;BA.debugLine="For i = set.Size - 1 To 0 Step - 1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_set._getsize /*int*/ ()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 469;BA.debugLine="Dim RequestSet As SMMediaRequestSet = set.AsLis";
_requestset = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(_set._aslist /*anywheresoftware.b4a.objects.collections.List*/ ().Get(_i));
 //BA.debugLineNum = 470;BA.debugLine="If RequestSet.NumberOfAncestors > CountAncestor";
if (_requestset.NumberOfAncestors /*int*/ >_countancestors(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
 //BA.debugLineNum = 474;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
_viewsmanager._cancelrequest /*String*/ (_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 //BA.debugLineNum = 475;BA.debugLine="set.Remove(RequestSet)";
_set._remove /*String*/ ((Object)(_requestset));
 };
 }
};
 }
};
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return "";
}
public String  _cancelrequest(b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
 //BA.debugLineNum = 392;BA.debugLine="Private Sub CancelRequest (RequestSet As SMMediaRe";
 //BA.debugLineNum = 396;BA.debugLine="ViewsRequestSet.Remove(RequestSet.Target)";
_viewsrequestset.Remove((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
 //BA.debugLineNum = 397;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
_viewsmanager._cancelrequest /*String*/ (_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 //BA.debugLineNum = 398;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(RequestSe";
_meta = (b4a.DesaWisataSumpu.simplemediamanager._smmediameta)(_metacache.Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
 //BA.debugLineNum = 399;BA.debugLine="If meta <> Null Then";
if (_meta!= null) { 
 //BA.debugLineNum = 400;BA.debugLine="meta.WaitingRequestsSets.Remove(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 401;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(_mediacache._get /*Object*/ ((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
 //BA.debugLineNum = 402;BA.debugLine="If media <> Null Then";
if (_media!= null) { 
 //BA.debugLineNum = 403;BA.debugLine="media.WaitingRequestsSets.Remove(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 404;BA.debugLine="media.UsedBy.Remove(RequestSet)";
_media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._remove /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 405;BA.debugLine="CancelDisconnectedTargets(media)";
_canceldisconnectedtargets(_media);
 };
 };
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type SMMediaMeta (Mime As String, MediaType As In";
;
 //BA.debugLineNum = 4;BA.debugLine="Type SMMedia (Media As Object, Meta As SMMediaMet";
;
 //BA.debugLineNum = 5;BA.debugLine="Type SMMediaRequest (Key As String, Url As String";
;
 //BA.debugLineNum = 6;BA.debugLine="Type SMMediaRequestSet (Loading As SMMediaRequest";
;
 //BA.debugLineNum = 8;BA.debugLine="Public Const STATE_LOADING = 1, STATE_ERROR = 2,";
_state_loading = (int) (1);
_state_error = (int) (2);
_state_ready = (int) (3);
 //BA.debugLineNum = 9;BA.debugLine="Private MetaCache As Map";
_metacache = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private MediaCache As B4XOrderedMap";
_mediacache = new b4a.DesaWisataSumpu.b4xorderedmap();
 //BA.debugLineNum = 11;BA.debugLine="Public MaxMediaCacheSize As Int = 40";
_maxmediacachesize = (int) (40);
 //BA.debugLineNum = 12;BA.debugLine="Private ViewsRequestSet As Map";
_viewsrequestset = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Private ImagesLoader As BitmapsAsync";
_imagesloader = new b4a.DesaWisataSumpu.bitmapsasync();
 //BA.debugLineNum = 14;BA.debugLine="Private JobEmpty As HttpJob";
_jobempty = new b4a.DesaWisataSumpu.httpjob();
 //BA.debugLineNum = 15;BA.debugLine="Public const KEY_DEFAULT_LOADING = \"~loading\", KE";
_key_default_loading = "~loading";
_key_default_error = "~error";
 //BA.debugLineNum = 16;BA.debugLine="Public const MIME_UNKNOWN As String = \"~unknown\"";
_mime_unknown = "~unknown";
 //BA.debugLineNum = 17;BA.debugLine="Public MaxImageSize = 1000 As Int";
_maximagesize = (int) (1000);
 //BA.debugLineNum = 18;BA.debugLine="Public DefaultFadeAnimationDuration As Int = 300";
_defaultfadeanimationduration = (int) (300);
 //BA.debugLineNum = 19;BA.debugLine="Public DefaultResizeMode As String = \"FIT\"";
_defaultresizemode = "FIT";
 //BA.debugLineNum = 20;BA.debugLine="Public DefaultBackgroundColor As Int = xui.Color_";
_defaultbackgroundcolor = _xui.Color_White;
 //BA.debugLineNum = 21;BA.debugLine="Public DefaultForegroundColor As Int = xui.Color_";
_defaultforegroundcolor = _xui.Color_Black;
 //BA.debugLineNum = 22;BA.debugLine="Public ViewsManager As SMMViews";
_viewsmanager = new b4a.DesaWisataSumpu.smmviews();
 //BA.debugLineNum = 23;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 24;BA.debugLine="Public DefaultLoadingRequest, DefaultErrorRequest";
_defaultloadingrequest = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
_defaulterrorrequest = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
 //BA.debugLineNum = 25;BA.debugLine="Public Const REQUEST_ROUNDIMAGE = \"round_image\",";
_request_roundimage = "round_image";
_request_background = "background";
_request_resize_mode = "resize_mode";
_request_fade_animation_duration = "fade_animation";
 //BA.debugLineNum = 26;BA.debugLine="Public Const REQUEST_FOREGROUND = \"foreground\" As";
_request_foreground = "foreground";
 //BA.debugLineNum = 27;BA.debugLine="Public Const REQUEST_CALLBACK = \"callback\" As Str";
_request_callback = "callback";
 //BA.debugLineNum = 28;BA.debugLine="Public Const REQUEST_ZOOMIMAGEVIEW = \"zoomimagevi";
_request_zoomimageview = "zoomimageview";
 //BA.debugLineNum = 29;BA.debugLine="Private Const REQUEST_FILE = \"file\", REQUEST_DIR";
_request_file = "file";
_request_dir = "dir";
 //BA.debugLineNum = 30;BA.debugLine="Private LastTrimCache As Long";
_lasttrimcache = 0L;
 //BA.debugLineNum = 31;BA.debugLine="Public MinTimeBetweenTrims As Long = 2000";
_mintimebetweentrims = (long) (2000);
 //BA.debugLineNum = 32;BA.debugLine="Public SleepDurationBeforeDownload As Long = 50";
_sleepdurationbeforedownload = (long) (50);
 //BA.debugLineNum = 33;BA.debugLine="Private HttpRequestsManager As RequestsManager";
_httprequestsmanager = new b4a.DesaWisataSumpu.requestsmanager();
 //BA.debugLineNum = 34;BA.debugLine="Public B4ASdkVersion As Int";
_b4asdkversion = 0;
 //BA.debugLineNum = 35;BA.debugLine="Public DefaultRequestTimeout As Int = 30000";
_defaultrequesttimeout = (int) (30000);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _clearmedia(anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Public Sub ClearMedia(Target As B4XView)";
 //BA.debugLineNum = 386;BA.debugLine="If ViewsRequestSet.ContainsKey(Target) Then";
if (_viewsrequestset.ContainsKey((Object)(_target.getObject()))) { 
 //BA.debugLineNum = 387;BA.debugLine="CancelRequest(ViewsRequestSet.Get(Target))";
_cancelrequest((b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(_viewsrequestset.Get((Object)(_target.getObject()))));
 };
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _clonerequest(b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _req = null;
String _k = "";
 //BA.debugLineNum = 523;BA.debugLine="Public Sub CloneRequest(Request As SMMediaRequest)";
 //BA.debugLineNum = 524;BA.debugLine="Dim req As SMMediaRequest = CreateSMMRequest(Requ";
_req = _createsmmrequest(_request.Key /*String*/ ,_request.Url /*String*/ ,_request.Mime /*String*/ );
 //BA.debugLineNum = 525;BA.debugLine="For Each k As String In Request.Extra.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 526;BA.debugLine="req.Extra.Put(k, Request.Extra.Get(k))";
_req.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
 //BA.debugLineNum = 528;BA.debugLine="Return req";
if (true) return _req;
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return null;
}
public int  _countancestors(anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _count = 0;
 //BA.debugLineNum = 569;BA.debugLine="Private Sub CountAncestors(Target As B4XView) As I";
 //BA.debugLineNum = 570;BA.debugLine="Dim p As B4XView = Target";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _target;
 //BA.debugLineNum = 571;BA.debugLine="Dim count As Int";
_count = 0;
 //BA.debugLineNum = 573;BA.debugLine="Do While p.Parent Is View";
while (_p.getParent().getObjectOrNull() instanceof android.view.View) {
 //BA.debugLineNum = 577;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 //BA.debugLineNum = 578;BA.debugLine="p = p.Parent";
_p = _p.getParent();
 }
;
 //BA.debugLineNum = 580;BA.debugLine="Return count";
if (true) return _count;
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return 0;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _createrequest(String _url,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
 //BA.debugLineNum = 499;BA.debugLine="Public Sub CreateRequest (Url As String, Extra As";
 //BA.debugLineNum = 500;BA.debugLine="Return CreateSMMRequest2(Url, Url, MIME_UNKNOWN,";
if (true) return _createsmmrequest2(_url,_url,_mime_unknown,_extra);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmedia  _createsmmedia(Object _media,b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta,int _mediastate) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmedia _t1 = null;
 //BA.debugLineNum = 543;BA.debugLine="Public Sub CreateSMMedia (Media As Object, Meta As";
 //BA.debugLineNum = 544;BA.debugLine="Dim t1 As SMMedia";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmedia();
 //BA.debugLineNum = 545;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 546;BA.debugLine="t1.Media = Media";
_t1.Media /*Object*/  = _media;
 //BA.debugLineNum = 547;BA.debugLine="t1.Meta = Meta";
_t1.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/  = _meta;
 //BA.debugLineNum = 548;BA.debugLine="t1.MediaState = MediaState";
_t1.MediaState /*int*/  = _mediastate;
 //BA.debugLineNum = 549;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (ba);
 //BA.debugLineNum = 550;BA.debugLine="t1.UsedBy.Initialize";
_t1.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (ba);
 //BA.debugLineNum = 551;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediameta  _createsmmediameta(String _mime,String _key,int _metastate,boolean _permanent) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _t1 = null;
 //BA.debugLineNum = 531;BA.debugLine="Private Sub CreateSMMediaMeta (Mime As String, Key";
 //BA.debugLineNum = 532;BA.debugLine="Dim t1 As SMMediaMeta";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediameta();
 //BA.debugLineNum = 533;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 534;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
 //BA.debugLineNum = 535;BA.debugLine="t1.MediaType = ViewsManager.MimeToMediaType(Mime)";
_t1.MediaType /*int*/  = _viewsmanager._mimetomediatype /*int*/ (_mime);
 //BA.debugLineNum = 536;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
 //BA.debugLineNum = 537;BA.debugLine="t1.MetaState = MetaState";
_t1.MetaState /*int*/  = _metastate;
 //BA.debugLineNum = 538;BA.debugLine="t1.Permanent = Permanent";
_t1.Permanent /*boolean*/  = _permanent;
 //BA.debugLineNum = 539;BA.debugLine="t1.WaitingRequestsSets.Initialize";
_t1.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._initialize /*String*/ (ba);
 //BA.debugLineNum = 540;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset  _createsmmediarequestset(b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _loading,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _mainmedia,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _error,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _t1 = null;
 //BA.debugLineNum = 554;BA.debugLine="Public Sub CreateSMMediaRequestSet (Loading As SMM";
 //BA.debugLineNum = 555;BA.debugLine="Dim t1 As SMMediaRequestSet";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset();
 //BA.debugLineNum = 556;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 557;BA.debugLine="t1.Loading = Loading";
_t1.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = _loading;
 //BA.debugLineNum = 558;BA.debugLine="t1.MainMedia = MainMedia";
_t1.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = _mainmedia;
 //BA.debugLineNum = 559;BA.debugLine="t1.Error = Error";
_t1.Error /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/  = _error;
 //BA.debugLineNum = 560;BA.debugLine="t1.Target = Target";
_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _target;
 //BA.debugLineNum = 561;BA.debugLine="t1.NumberOfAncestors = CountAncestors(t1.Target)";
_t1.NumberOfAncestors /*int*/  = _countancestors(_t1.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 //BA.debugLineNum = 562;BA.debugLine="t1.Callback = Null";
_t1.Callback /*Object*/  = __c.Null;
 //BA.debugLineNum = 563;BA.debugLine="If t1.NumberOfAncestors = 0 Then";
if (_t1.NumberOfAncestors /*int*/ ==0) { 
 //BA.debugLineNum = 564;BA.debugLine="Log(\"Target is not in the views tree!\")";
__c.LogImpl("911796490","Target is not in the views tree!",0);
 };
 //BA.debugLineNum = 566;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _createsmmrequest(String _key,String _url,String _mime) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _t1 = null;
 //BA.debugLineNum = 503;BA.debugLine="Private Sub CreateSMMRequest (Key As String, Url A";
 //BA.debugLineNum = 504;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
 //BA.debugLineNum = 505;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 506;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
 //BA.debugLineNum = 507;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
 //BA.debugLineNum = 508;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
 //BA.debugLineNum = 509;BA.debugLine="t1.Extra.Initialize";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 510;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _createsmmrequest2(String _key,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _t1 = null;
 //BA.debugLineNum = 513;BA.debugLine="Private Sub CreateSMMRequest2 (Key As String, Url";
 //BA.debugLineNum = 514;BA.debugLine="Dim t1 As SMMediaRequest";
_t1 = new b4a.DesaWisataSumpu.simplemediamanager._smmediarequest();
 //BA.debugLineNum = 515;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 516;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
 //BA.debugLineNum = 517;BA.debugLine="t1.Url = Url";
_t1.Url /*String*/  = _url;
 //BA.debugLineNum = 518;BA.debugLine="t1.Mime = Mime";
_t1.Mime /*String*/  = _mime;
 //BA.debugLineNum = 519;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
 //BA.debugLineNum = 520;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public String  _deletemedia(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 436;BA.debugLine="Private Sub DeleteMedia (Media As SMMedia)";
 //BA.debugLineNum = 440;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==_state_ready) { 
 //BA.debugLineNum = 441;BA.debugLine="Select Media.Meta.MediaType";
switch (BA.switchObjectToInt(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,_viewsmanager._media_type_image /*int*/ ,_viewsmanager._media_type_html /*int*/ )) {
case 0: {
 //BA.debugLineNum = 444;BA.debugLine="Dim jo As JavaObject = Media.Media 'B4XBitmap";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_media.Media /*Object*/ ));
 //BA.debugLineNum = 445;BA.debugLine="jo.RunMethod(\"recycle\", Null)";
_jo.RunMethod("recycle",(Object[])(__c.Null));
 break; }
case 1: {
 //BA.debugLineNum = 448;BA.debugLine="MetaCache.Remove(Media.Meta.Key)";
_metacache.Remove((Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 break; }
}
;
 }else if(_media.MediaState /*int*/ ==_state_loading) { 
 //BA.debugLineNum = 454;BA.debugLine="If Media.Job.IsInitialized Then";
if (_media.Job /*b4a.DesaWisataSumpu.httpjob*/ .IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 455;BA.debugLine="HttpRequestsManager.CancelRequest(Media.Meta.Fi";
_httprequestsmanager._cancelrequest /*String*/ (_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ ,_media.Job /*b4a.DesaWisataSumpu.httpjob*/ );
 };
 };
 //BA.debugLineNum = 458;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
_mediacache._remove /*String*/ ((Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return "";
}
public String  _designersetmedia(anywheresoftware.b4a.keywords.DesignerArgs _designerargs) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
String _url = "";
 //BA.debugLineNum = 80;BA.debugLine="Private Sub DesignerSetMedia(DesignerArgs As Desig";
 //BA.debugLineNum = 81;BA.debugLine="Dim Target As B4XView = DesignerArgs.GetViewFromA";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_designerargs.GetViewFromArgs((int) (0))));
 //BA.debugLineNum = 82;BA.debugLine="Dim url As String = DesignerArgs.Arguments.Get(1)";
_url = BA.ObjectToString(_designerargs.getArguments().Get((int) (1)));
 //BA.debugLineNum = 83;BA.debugLine="If DesignerArgs.FirstRun Then";
if (_designerargs.getFirstRun()) { 
 //BA.debugLineNum = 84;BA.debugLine="SetMedia(Target, url)";
_setmedia(_target,_url);
 }else {
 //BA.debugLineNum = 86;BA.debugLine="PanelResized(Target)";
_panelresized(_target);
 };
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public void  _downloadimagemedia(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
ResumableSub_DownloadImageMedia rsub = new ResumableSub_DownloadImageMedia(this,_media);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImageMedia extends BA.ResumableSub {
public ResumableSub_DownloadImageMedia(b4a.DesaWisataSumpu.simplemediamanager parent,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) {
this.parent = parent;
this._media = _media;
}
b4a.DesaWisataSumpu.simplemediamanager parent;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media;
b4a.DesaWisataSumpu.httpjob _job = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 251;BA.debugLine="If Media.Meta.MetaState = STATE_READY Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MetaState /*int*/ ==parent._state_ready) { 
this.state = 3;
}else {
this.state = 24;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 252;BA.debugLine="If SleepDurationBeforeDownload > 0 Then";
if (true) break;

case 4:
//if
this.state = 11;
if (parent._sleepdurationbeforedownload>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 253;BA.debugLine="Sleep(SleepDurationBeforeDownload)";
parent.__c.Sleep(ba,this,(int) (parent._sleepdurationbeforedownload));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 //BA.debugLineNum = 254;BA.debugLine="CancelDisconnectedTargets(Media)";
parent._canceldisconnectedtargets(_media);
 //BA.debugLineNum = 255;BA.debugLine="If IsMediaStillRelevant(Media) = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._ismediastillrelevant(_media)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 259;BA.debugLine="DeleteMedia(Media) 'media is loading state. Re";
parent._deletemedia(_media);
 //BA.debugLineNum = 260;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
 //BA.debugLineNum = 263;BA.debugLine="If Media.Meta.Dir = \"\" Then";

case 11:
//if
this.state = 22;
if ((_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Dir /*String*/ ).equals("")) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 264;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
 //BA.debugLineNum = 265;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 266;BA.debugLine="job.Download(Media.Meta.FirstUrl)";
_job._download /*String*/ (_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .FirstUrl /*String*/ );
 //BA.debugLineNum = 267;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout(parent._defaultrequesttimeout);
 //BA.debugLineNum = 271;BA.debugLine="Media.Job = job";
_media.Job /*b4a.DesaWisataSumpu.httpjob*/  = _job;
 //BA.debugLineNum = 272;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 27;
return;
case 27:
//C
this.state = 14;
_job = (b4a.DesaWisataSumpu.httpjob) result[0];
;
 //BA.debugLineNum = 273;BA.debugLine="Media.Job = JobEmpty";
_media.Job /*b4a.DesaWisataSumpu.httpjob*/  = parent._jobempty;
 //BA.debugLineNum = 278;BA.debugLine="If job.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_job._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 //BA.debugLineNum = 279;BA.debugLine="Wait For (PrepareMedia(Media, job, \"\", \"\", Fal";
parent.__c.WaitFor("complete", ba, this, parent._preparemedia(_media,_job,"","",parent.__c.False));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 280;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, ST";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(parent._state_ready)) : ((Object)(parent._state_error)))));
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 282;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = parent._state_error;
 if (true) break;

case 19:
//C
this.state = 22;
;
 //BA.debugLineNum = 284;BA.debugLine="job.Release";
_job._release /*String*/ ();
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 289;BA.debugLine="Wait For (PrepareMedia(Media, Null, Media.Meta.";
parent.__c.WaitFor("complete", ba, this, parent._preparemedia(_media,(b4a.DesaWisataSumpu.httpjob)(parent.__c.Null),_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Dir /*String*/ ,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .FileName /*String*/ ,parent.__c.True));
this.state = 29;
return;
case 29:
//C
this.state = 22;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 290;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, STA";
_media.MediaState /*int*/  = (int)(BA.ObjectToNumber(((_media.Media /*Object*/ != null) ? ((Object)(parent._state_ready)) : ((Object)(parent._state_error)))));
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 294;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = parent._state_error;
 if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 296;BA.debugLine="MediaIsReady(Media)";
parent._mediaisready(_media);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.DesaWisataSumpu.httpjob _job) throws Exception{
}
public void  _complete(boolean _unused) throws Exception{
}
public int  _getmediacachesize() throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Public Sub getMediaCacheSize As Int";
 //BA.debugLineNum = 484;BA.debugLine="Return MediaCache.Size";
if (true) return _mediacache._getsize /*int*/ ();
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return 0;
}
public b4a.DesaWisataSumpu.simplemediamanager._smmediarequest  _getrequestfromrequestset(b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _rs) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Private Sub GetRequestFromRequestSet(rs As SMMedia";
 //BA.debugLineNum = 490;BA.debugLine="If rs.RequestState = STATE_LOADING Then";
if (_rs.RequestState /*int*/ ==_state_loading) { 
 //BA.debugLineNum = 491;BA.debugLine="Return rs.Loading";
if (true) return _rs.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ;
 }else if(_rs.RequestState /*int*/ ==_state_error) { 
 //BA.debugLineNum = 493;BA.debugLine="Return rs.Error";
if (true) return _rs.Error /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ;
 }else {
 //BA.debugLineNum = 495;BA.debugLine="Return rs.MainMedia";
if (true) return _rs.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ ;
 };
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _build = null;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 42;BA.debugLine="ImagesLoader.Initialize";
_imagesloader._initialize /*String*/ (ba);
 //BA.debugLineNum = 43;BA.debugLine="ImagesLoader.MaxFileSize = 8 * 1024 * 1024";
_imagesloader._maxfilesize /*long*/  = (long) (8*1024*1024);
 //BA.debugLineNum = 44;BA.debugLine="MetaCache.Initialize";
_metacache.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="MediaCache.Initialize";
_mediacache._initialize /*String*/ (ba);
 //BA.debugLineNum = 46;BA.debugLine="ViewsRequestSet.Initialize";
_viewsrequestset.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="ViewsManager.Initialize (Me)";
_viewsmanager._initialize /*String*/ (ba,(b4a.DesaWisataSumpu.simplemediamanager)(this));
 //BA.debugLineNum = 49;BA.debugLine="Dim build As JavaObject";
_build = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 50;BA.debugLine="B4ASdkVersion =  build.InitializeStatic(\"android.";
_b4asdkversion = (int)(BA.ObjectToNumber(_build.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
 //BA.debugLineNum = 52;BA.debugLine="AddLocalMedia(KEY_DEFAULT_ERROR, Null, \"none\")";
_addlocalmedia(_key_default_error,__c.Null,"none");
 //BA.debugLineNum = 53;BA.debugLine="DefaultLoadingRequest = CreateSMMRequest(KEY_DEFA";
_defaultloadingrequest = _createsmmrequest(_key_default_loading,"",_mime_unknown);
 //BA.debugLineNum = 54;BA.debugLine="DefaultLoadingRequest.Extra.Put(REQUEST_BACKGROUN";
_defaultloadingrequest.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_request_background),(Object)(_xui.Color_White));
 //BA.debugLineNum = 55;BA.debugLine="DefaultErrorRequest = CreateSMMRequest(KEY_DEFAUL";
_defaulterrorrequest = _createsmmrequest(_key_default_error,"",_mime_unknown);
 //BA.debugLineNum = 56;BA.debugLine="DefaultErrorRequest.Extra.Put(REQUEST_BACKGROUND,";
_defaulterrorrequest.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_request_background),(Object)(((int)0xff6a6a6a)));
 //BA.debugLineNum = 57;BA.debugLine="AddLocalMedia(KEY_DEFAULT_LOADING, Null, \"none\")";
_addlocalmedia(_key_default_loading,__c.Null,"none");
 //BA.debugLineNum = 58;BA.debugLine="LastTrimCache = DateTime.Now";
_lasttrimcache = __c.DateTime.getNow();
 //BA.debugLineNum = 59;BA.debugLine="HttpRequestsManager.Initialize";
_httprequestsmanager._initialize /*String*/ (ba);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public boolean  _ismediastillrelevant(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Private Sub IsMediaStillRelevant (Media As SMMedia";
 //BA.debugLineNum = 463;BA.debugLine="Return Media.Meta.Permanent Or (Media.MediaState";
if (true) return _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Permanent /*boolean*/  || (_media.MediaState /*int*/ ==_state_loading && _media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._getsize /*int*/ ()>0) || (_media.MediaState /*int*/ !=_state_loading && _media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._getsize /*int*/ ()>0);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return false;
}
public boolean  _iswebpanimated(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Public Sub IsWebPAnimated(Media As SMMedia) As Boo";
 //BA.debugLineNum = 348;BA.debugLine="Return B4ASdkVersion >= 28 And Media.Meta.MediaTy";
if (true) return _b4asdkversion>=28 && _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ==_viewsmanager._media_type_webp /*int*/ ;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return false;
}
public String  _mediaisready(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _req = null;
 //BA.debugLineNum = 354;BA.debugLine="Private Sub MediaIsReady (Media As SMMedia)";
 //BA.debugLineNum = 355;BA.debugLine="CancelDisconnectedTargets(Media)";
_canceldisconnectedtargets(_media);
 //BA.debugLineNum = 356;BA.debugLine="For Each req As SMMediaRequestSet In Media.Waitin";
{
final anywheresoftware.b4a.BA.IterableList group2 = _media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_req = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(group2.Get(index2));
 //BA.debugLineNum = 357;BA.debugLine="req.RequestState = Media.MediaState";
_req.RequestState /*int*/  = _media.MediaState /*int*/ ;
 //BA.debugLineNum = 358;BA.debugLine="If Media.MediaState = STATE_READY Then";
if (_media.MediaState /*int*/ ==_state_ready) { 
 //BA.debugLineNum = 359;BA.debugLine="Media.UsedBy.Add(req)";
_media.UsedBy /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ ((Object)(_req));
 //BA.debugLineNum = 360;BA.debugLine="ViewsManager.AddMedia(req, Media, GetRequestFro";
_viewsmanager._addmedia /*void*/ (_req,_media,_getrequestfromrequestset(_req));
 }else if(_media.MediaState /*int*/ ==_state_error) { 
 //BA.debugLineNum = 362;BA.debugLine="ViewsManager.AddMedia(req, MediaCache.Get(req.E";
_viewsmanager._addmedia /*void*/ (_req,(b4a.DesaWisataSumpu.simplemediamanager._smmedia)(_mediacache._get /*Object*/ ((Object)(_req.Error /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),_getrequestfromrequestset(_req));
 }else {
 //BA.debugLineNum = 364;BA.debugLine="Log(\"MediaIsReady Unexpected state!\")";
__c.LogImpl("910682378","MediaIsReady Unexpected state!",0);
 };
 }
};
 //BA.debugLineNum = 367;BA.debugLine="Media.WaitingRequestsSets.Clear";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._clear /*String*/ ();
 //BA.debugLineNum = 368;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==_state_error) { 
 //BA.debugLineNum = 372;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
_mediacache._remove /*String*/ ((Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ));
 };
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public String  _metaisready(b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset = null;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
int _mediatype = 0;
 //BA.debugLineNum = 202;BA.debugLine="Private Sub MetaIsReady (Meta As SMMediaMeta)";
 //BA.debugLineNum = 203;BA.debugLine="For Each RequestSet As SMMediaRequestSet In Meta.";
{
final anywheresoftware.b4a.BA.IterableList group1 = _meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_requestset = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(group1.Get(index1));
 //BA.debugLineNum = 207;BA.debugLine="If MediaCache.ContainsKey(Meta.Key) Then";
if (_mediacache._containskey /*boolean*/ ((Object)(_meta.Key /*String*/ ))) { 
 //BA.debugLineNum = 208;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(Meta.Key)";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(_mediacache._get /*Object*/ ((Object)(_meta.Key /*String*/ )));
 //BA.debugLineNum = 210;BA.debugLine="MediaCache.Remove(Meta.Key)";
_mediacache._remove /*String*/ ((Object)(_meta.Key /*String*/ ));
 //BA.debugLineNum = 211;BA.debugLine="MediaCache.Put(Meta.Key, Media)";
_mediacache._put /*String*/ ((Object)(_meta.Key /*String*/ ),(Object)(_media));
 //BA.debugLineNum = 212;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 213;BA.debugLine="If Media.MediaState <> STATE_LOADING Then";
if (_media.MediaState /*int*/ !=_state_loading) { 
 //BA.debugLineNum = 214;BA.debugLine="MediaIsReady(Media)";
_mediaisready(_media);
 };
 }else {
 //BA.debugLineNum = 217;BA.debugLine="Media = CreateSMMedia(Null, Meta, IIf(Meta.Meta";
_media = _createsmmedia(__c.Null,_meta,(int)(BA.ObjectToNumber(((_meta.MetaState /*int*/ ==_state_ready) ? ((Object)(_state_loading)) : ((Object)(_state_error))))));
 //BA.debugLineNum = 218;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 219;BA.debugLine="MediaCache.Put(Media.Meta.Key, Media)";
_mediacache._put /*String*/ ((Object)(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ ),(Object)(_media));
 //BA.debugLineNum = 220;BA.debugLine="TrimMediaCacheImpl";
_trimmediacacheimpl();
 //BA.debugLineNum = 221;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
if (_media.MediaState /*int*/ ==_state_error) { 
 //BA.debugLineNum = 222;BA.debugLine="MediaIsReady(Media)";
_mediaisready(_media);
 }else {
 //BA.debugLineNum = 224;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
 //BA.debugLineNum = 225;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,_viewsmanager._media_type_gif /*int*/ ,_viewsmanager._media_type_image /*int*/ ,_viewsmanager._media_type_webp /*int*/ ,_viewsmanager._media_type_video /*int*/ ,_viewsmanager._media_type_html /*int*/ ,_viewsmanager._media_type_none /*int*/ )) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 227;BA.debugLine="DownloadImageMedia(Media)";
_downloadimagemedia(_media);
 break; }
case 3: 
case 4: {
 //BA.debugLineNum = 229;BA.debugLine="Media.MediaState = STATE_READY";
_media.MediaState /*int*/  = _state_ready;
 //BA.debugLineNum = 230;BA.debugLine="Media.Media = Meta.FirstUrl";
_media.Media /*Object*/  = (Object)(_meta.FirstUrl /*String*/ );
 //BA.debugLineNum = 231;BA.debugLine="MediaIsReady(Media)";
_mediaisready(_media);
 break; }
case 5: {
 //BA.debugLineNum = 233;BA.debugLine="Log(\"Unexpected mime: \" & Media.Meta.Mime)";
__c.LogImpl("910420255","Unexpected mime: "+_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Mime /*String*/ ,0);
 //BA.debugLineNum = 234;BA.debugLine="Media.MediaState = STATE_ERROR";
_media.MediaState /*int*/  = _state_error;
 //BA.debugLineNum = 235;BA.debugLine="MediaIsReady(Media)";
_mediaisready(_media);
 break; }
}
;
 };
 };
 }
};
 //BA.debugLineNum = 240;BA.debugLine="Meta.WaitingRequestsSets.Clear";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._clear /*String*/ ();
 //BA.debugLineNum = 241;BA.debugLine="If Meta.MetaState = STATE_ERROR Then";
if (_meta.MetaState /*int*/ ==_state_error) { 
 //BA.debugLineNum = 245;BA.debugLine="MetaCache.Remove(Meta)";
_metacache.Remove((Object)(_meta));
 };
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return "";
}
public String  _panelresized(anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _set = null;
 //BA.debugLineNum = 377;BA.debugLine="Public Sub PanelResized (Target As B4XView)";
 //BA.debugLineNum = 378;BA.debugLine="Dim set As SMMediaRequestSet = ViewsRequestSet.Ge";
_set = (b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset)(_viewsrequestset.Get((Object)(_target.getObject())));
 //BA.debugLineNum = 379;BA.debugLine="If set <> Null Then";
if (_set!= null) { 
 //BA.debugLineNum = 380;BA.debugLine="ViewsManager.ParentResized(Target)";
_viewsmanager._parentresized /*String*/ (_target);
 };
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparemedia(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.httpjob _job,String _dir,String _filename,boolean _fromfile) throws Exception{
ResumableSub_PrepareMedia rsub = new ResumableSub_PrepareMedia(this,_media,_job,_dir,_filename,_fromfile);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareMedia extends BA.ResumableSub {
public ResumableSub_PrepareMedia(b4a.DesaWisataSumpu.simplemediamanager parent,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.httpjob _job,String _dir,String _filename,boolean _fromfile) {
this.parent = parent;
this._media = _media;
this._job = _job;
this._dir = _dir;
this._filename = _filename;
this._fromfile = _fromfile;
}
b4a.DesaWisataSumpu.simplemediamanager parent;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media;
b4a.DesaWisataSumpu.httpjob _job;
String _dir;
String _filename;
boolean _fromfile;
int _mediatype = 0;
boolean _skipregularimageloading = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 300;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
_mediatype = _media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ;
 //BA.debugLineNum = 301;BA.debugLine="If MediaType = ViewsManager.MEDIA_TYPE_IMAGE Then";
if (true) break;

case 1:
//if
this.state = 25;
if (_mediatype==parent._viewsmanager._media_type_image /*int*/ ) { 
this.state = 3;
}else {
this.state = 18;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 302;BA.debugLine="Dim SkipRegularImageLoading As Boolean 'ignore";
_skipregularimageloading = false;
 //BA.debugLineNum = 309;BA.debugLine="If SkipRegularImageLoading = False Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_skipregularimageloading==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 310;BA.debugLine="If FromFile Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_fromfile) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 311;BA.debugLine="Wait For (ImagesLoader.LoadFromFile(Dir, FileN";
parent.__c.WaitFor("complete", ba, this, parent._imagesloader._loadfromfile /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_dir,_filename,parent._maximagesize,parent._maximagesize));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[0];
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 313;BA.debugLine="Wait For (ImagesLoader.LoadFromHttpJob(job, Ma";
parent.__c.WaitFor("complete", ba, this, parent._imagesloader._loadfromhttpjob /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_job,parent._maximagesize,parent._maximagesize));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[0];
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 315;BA.debugLine="Media.Media = IIf(bmp.IsInitialized, bmp, Null)";
_media.Media /*Object*/  = ((_bmp.IsInitialized()) ? ((Object)(_bmp.getObject())) : (parent.__c.Null));
 if (true) break;
;
 //BA.debugLineNum = 317;BA.debugLine="If (xui.IsB4A Or xui.IsB4J) And Media.Meta.Mime";

case 13:
//if
this.state = 16;
if ((parent._xui.getIsB4A() || parent._xui.getIsB4J()) && (_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") && _media.Media /*Object*/ != null) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 318;BA.debugLine="PreprocessExif(Media, IIf(FromFile, File.OpenIn";
parent._preprocessexif(_media,(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()))))));
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 321;BA.debugLine="Dim in As InputStream = IIf(FromFile, File.OpenI";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(((_fromfile) ? ((Object)(parent.__c.File.OpenInput(_dir,_filename).getObject())) : ((Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject())))));
 //BA.debugLineNum = 322;BA.debugLine="Select MediaType";
if (true) break;

case 19:
//select
this.state = 24;
switch (BA.switchObjectToInt(_mediatype,parent._viewsmanager._media_type_gif /*int*/ ,parent._viewsmanager._media_type_webp /*int*/ )) {
case 0: {
this.state = 21;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 21:
//C
this.state = 24;
 //BA.debugLineNum = 324;BA.debugLine="Media.Media = Bit.InputStreamToBytes(in)";
_media.Media /*Object*/  = (Object)(parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_in.getObject())));
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 343;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _preprocessexif(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
anywheresoftware.b4j.object.JavaObject _exifinterface = null;
int _orientation = 0;
 //BA.debugLineNum = 584;BA.debugLine="Public Sub PreprocessExif (Media As SMMedia, In As";
 //BA.debugLineNum = 588;BA.debugLine="If Media.Meta.Mime <> \"image/jpeg\" Then";
if ((_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Mime /*String*/ ).equals("image/jpeg") == false) { 
 //BA.debugLineNum = 589;BA.debugLine="Log(\"image/jpeg mime expected!\")";
__c.LogImpl("911927557","image/jpeg mime expected!",0);
 //BA.debugLineNum = 590;BA.debugLine="In.Close";
_in.Close();
 //BA.debugLineNum = 591;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 594;BA.debugLine="If B4ASdkVersion >= 24 Then";
if (_b4asdkversion>=24) { 
 //BA.debugLineNum = 595;BA.debugLine="Dim ExifInterface As JavaObject";
_exifinterface = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 596;BA.debugLine="ExifInterface.InitializeNewInstance(\"android.med";
_exifinterface.InitializeNewInstance("android.media.ExifInterface",new Object[]{(Object)(_in.getObject())});
 //BA.debugLineNum = 597;BA.debugLine="Dim orientation As Int = ExifInterface.RunMethod";
_orientation = (int)(BA.ObjectToNumber(_exifinterface.RunMethod("getAttribute",new Object[]{(Object)("Orientation")})));
 //BA.debugLineNum = 598;BA.debugLine="Media.Media = RotateBitmapBasedOnOrientation(Med";
_media.Media /*Object*/  = (Object)(_rotatebitmapbasedonorientation((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ )),_orientation).getObject());
 };
 //BA.debugLineNum = 600;BA.debugLine="In.Close";
_in.Close();
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return "";
}
public void  _registerformeta(b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) throws Exception{
ResumableSub_RegisterForMeta rsub = new ResumableSub_RegisterForMeta(this,_requestset);
rsub.resume(ba, null);
}
public static class ResumableSub_RegisterForMeta extends BA.ResumableSub {
public ResumableSub_RegisterForMeta(b4a.DesaWisataSumpu.simplemediamanager parent,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) {
this.parent = parent;
this._requestset = _requestset;
}
b4a.DesaWisataSumpu.simplemediamanager parent;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
b4a.DesaWisataSumpu.simplemediamanager._smmediameta _meta = null;
b4a.DesaWisataSumpu.httpjob _job = null;
Object _o = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 149;BA.debugLine="ClearMedia(RequestSet.Target)";
parent._clearmedia(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 //BA.debugLineNum = 150;BA.debugLine="ViewsRequestSet.Put(RequestSet.Target, RequestSet";
parent._viewsrequestset.Put((Object)(_requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_requestset));
 //BA.debugLineNum = 151;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet.";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(parent._mediacache._get /*Object*/ ((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
 //BA.debugLineNum = 154;BA.debugLine="If media <> Null And media.MediaState = STATE_REA";
if (true) break;

case 1:
//if
this.state = 30;
if (_media!= null && _media.MediaState /*int*/ ==parent._state_ready) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 30;
 //BA.debugLineNum = 155;BA.debugLine="media.WaitingRequestsSets.Add(RequestSet)";
_media.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 156;BA.debugLine="MediaIsReady(media)";
parent._mediaisready(_media);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 158;BA.debugLine="If media <> Null And media.MediaState = STATE_ER";
if (true) break;

case 6:
//if
this.state = 9;
if (_media!= null && _media.MediaState /*int*/ ==parent._state_error) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 159;BA.debugLine="Log(\"Unexpected state:  media.MediaState = STAT";
parent.__c.LogImpl("910354702","Unexpected state:  media.MediaState = STATE_ERROR",0);
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 161;BA.debugLine="RequestSet.RequestState = STATE_LOADING";
_requestset.RequestState /*int*/  = parent._state_loading;
 //BA.debugLineNum = 162;BA.debugLine="ViewsManager.AddMedia(RequestSet, MediaCache.Get";
parent._viewsmanager._addmedia /*void*/ (_requestset,(b4a.DesaWisataSumpu.simplemediamanager._smmedia)(parent._mediacache._get /*Object*/ ((Object)(_requestset.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))),_requestset.Loading /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ );
 //BA.debugLineNum = 163;BA.debugLine="If MetaCache.ContainsKey(RequestSet.MainMedia.Ke";
if (true) break;

case 10:
//if
this.state = 29;
if (parent._metacache.ContainsKey((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ))) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 164;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(Request";
_meta = (b4a.DesaWisataSumpu.simplemediamanager._smmediameta)(parent._metacache.Get((Object)(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ )));
 //BA.debugLineNum = 165;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 166;BA.debugLine="If meta.MetaState <> STATE_LOADING Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_meta.MetaState /*int*/ !=parent._state_loading) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 167;BA.debugLine="MetaIsReady(meta)";
parent._metaisready(_meta);
 if (true) break;

case 16:
//C
this.state = 29;
;
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 170;BA.debugLine="meta = CreateSMMediaMeta(RequestSet.MainMedia.M";
_meta = parent._createsmmediameta(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ,_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Key /*String*/ ,(int)(BA.ObjectToNumber((((_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Mime /*String*/ ).equals(parent._mime_unknown)) ? ((Object)(parent._state_loading)) : ((Object)(parent._state_ready))))),parent.__c.False);
 //BA.debugLineNum = 171;BA.debugLine="meta.FirstUrl = RequestSet.MainMedia.Url";
_meta.FirstUrl /*String*/  = _requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Url /*String*/ ;
 //BA.debugLineNum = 172;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
_meta.WaitingRequestsSets /*b4a.DesaWisataSumpu.b4xset*/ ._add /*String*/ ((Object)(_requestset));
 //BA.debugLineNum = 173;BA.debugLine="meta.Dir = RequestSet.MainMedia.Extra.GetDefaul";
_meta.Dir /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(parent._request_dir),(Object)("")));
 //BA.debugLineNum = 174;BA.debugLine="meta.FileName = RequestSet.MainMedia.Extra.GetD";
_meta.FileName /*String*/  = BA.ObjectToString(_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(parent._request_file),(Object)("")));
 //BA.debugLineNum = 175;BA.debugLine="MetaCache.Put(meta.Key, meta)";
parent._metacache.Put((Object)(_meta.Key /*String*/ ),(Object)(_meta));
 //BA.debugLineNum = 176;BA.debugLine="If meta.MetaState = STATE_LOADING Then";
if (true) break;

case 19:
//if
this.state = 28;
if (_meta.MetaState /*int*/ ==parent._state_loading) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 177;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
 //BA.debugLineNum = 178;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 179;BA.debugLine="job.Head(RequestSet.MainMedia.Url)";
_job._head /*String*/ (_requestset.MainMedia /*b4a.DesaWisataSumpu.simplemediamanager._smmediarequest*/ .Url /*String*/ );
 //BA.debugLineNum = 180;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout(parent._defaultrequesttimeout);
 //BA.debugLineNum = 181;BA.debugLine="meta.Job = job";
_meta.Job /*b4a.DesaWisataSumpu.httpjob*/  = _job;
 //BA.debugLineNum = 182;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_job = (b4a.DesaWisataSumpu.httpjob) result[0];
;
 //BA.debugLineNum = 183;BA.debugLine="meta.Job = JobEmpty";
_meta.Job /*b4a.DesaWisataSumpu.httpjob*/  = parent._jobempty;
 //BA.debugLineNum = 184;BA.debugLine="If job.Success Then";
if (true) break;

case 22:
//if
this.state = 27;
if (_job._success /*boolean*/ ) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 //BA.debugLineNum = 185;BA.debugLine="Dim o As Object = job.Response.ContentType";
_o = (Object)(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentType());
 //BA.debugLineNum = 186;BA.debugLine="meta.Mime = IIf(o = Null, \"\", o).As(String)";
_meta.Mime /*String*/  = (((_o== null) ? ("") : (BA.ObjectToString(_o))));
 //BA.debugLineNum = 187;BA.debugLine="meta.MediaType = ViewsManager.MimeToMediaType";
_meta.MediaType /*int*/  = parent._viewsmanager._mimetomediatype /*int*/ (_meta.Mime /*String*/ );
 //BA.debugLineNum = 188;BA.debugLine="meta.MetaState = STATE_READY";
_meta.MetaState /*int*/  = parent._state_ready;
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 190;BA.debugLine="meta.MetaState = STATE_ERROR";
_meta.MetaState /*int*/  = parent._state_error;
 if (true) break;

case 27:
//C
this.state = 28;
;
 //BA.debugLineNum = 192;BA.debugLine="job.Release";
_job._release /*String*/ ();
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 195;BA.debugLine="MetaIsReady(meta)";
parent._metaisready(_meta);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _rotatebitmapbasedonorientation(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _orientation) throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Private Sub RotateBitmapBasedOnOrientation (bmp As";
 //BA.debugLineNum = 623;BA.debugLine="Select orientation";
switch (_orientation) {
case 3: {
 //BA.debugLineNum = 625;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 break; }
case 6: {
 //BA.debugLineNum = 627;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 break; }
case 8: {
 //BA.debugLineNum = 629;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 break; }
}
;
 //BA.debugLineNum = 631;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 632;BA.debugLine="End Sub";
return null;
}
public String  _setmedia(anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub SetMedia(Target As B4XView, Url As Stri";
 //BA.debugLineNum = 92;BA.debugLine="SetMediaWithExtra(Target, Url, MIME_UNKNOWN, Crea";
_setmediawithextra(_target,_url,_mime_unknown,__c.createMap(new Object[] {}));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setmediafromfile(anywheresoftware.b4a.objects.B4XViewWrapper _target,String _dir,String _filename,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub SetMediaFromFile(Target As B4XView, Dir";
 //BA.debugLineNum = 125;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 126;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 127;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
 //BA.debugLineNum = 129;BA.debugLine="Extra.Put(REQUEST_DIR, IIf(Dir = \"\", FileName, Di";
_extra.Put((Object)(_request_dir),(((_dir).equals("")) ? ((Object)(_filename)) : ((Object)(_dir))));
 //BA.debugLineNum = 130;BA.debugLine="Extra.Put(REQUEST_FILE, IIf(Dir = \"\", \"\", FileNam";
_extra.Put((Object)(_request_file),(((_dir).equals("")) ? ((Object)("")) : ((Object)(_filename))));
 //BA.debugLineNum = 131;BA.debugLine="If ViewsManager.MimeToMediaType(Mime) = ViewsMana";
if (_viewsmanager._mimetomediatype /*int*/ (_mime)==_viewsmanager._media_type_none /*int*/ ) { 
 //BA.debugLineNum = 132;BA.debugLine="Log(\"Invalid mime!\")";
__c.LogImpl("910223624","Invalid mime!",0);
 //BA.debugLineNum = 133;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 135;BA.debugLine="SetMediaWithExtra(Target, xui.FileUri(Dir, FileNa";
_setmediawithextra(_target,_xui.FileUri(_dir,_filename),_mime,_extra);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithextra(anywheresoftware.b4a.objects.B4XViewWrapper _target,String _url,String _mime,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request = null;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _rs = null;
 //BA.debugLineNum = 107;BA.debugLine="Public Sub SetMediaWithExtra (Target As B4XView, U";
 //BA.debugLineNum = 108;BA.debugLine="If Mime = \"\" Then Mime = MIME_UNKNOWN";
if ((_mime).equals("")) { 
_mime = _mime_unknown;};
 //BA.debugLineNum = 109;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
if (_extra== null || _extra.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 110;BA.debugLine="Dim Extra As Map";
_extra = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 111;BA.debugLine="Extra.Initialize";
_extra.Initialize();
 };
 //BA.debugLineNum = 113;BA.debugLine="Dim Request As SMMediaRequest = CreateSMMRequest2";
_request = _createsmmrequest2(_url,_url,_mime,_extra);
 //BA.debugLineNum = 114;BA.debugLine="Dim rs As SMMediaRequestSet = CreateSMMediaReques";
_rs = _createsmmediarequestset(_clonerequest(_defaultloadingrequest),_request,_clonerequest(_defaulterrorrequest),_target);
 //BA.debugLineNum = 117;BA.debugLine="If Extra.ContainsKey(REQUEST_CALLBACK) Then rs.Ca";
if (_extra.ContainsKey((Object)(_request_callback))) { 
_rs.Callback /*Object*/  = _extra.Get((Object)(_request_callback));};
 //BA.debugLineNum = 118;BA.debugLine="SetMediaWithRequestSet(rs)";
_setmediawithrequestset(_rs);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _setmediawithrequestset(b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub SetMediaWithRequestSet (RequestSet As S";
 //BA.debugLineNum = 142;BA.debugLine="RegisterForMeta(RequestSet)";
_registerformeta(_requestset);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacache() throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Public Sub TrimMediaCache";
 //BA.debugLineNum = 412;BA.debugLine="LastTrimCache = 0";
_lasttrimcache = (long) (0);
 //BA.debugLineNum = 413;BA.debugLine="TrimMediaCacheImpl";
_trimmediacacheimpl();
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public String  _trimmediacacheimpl() throws Exception{
boolean _onlylookfordisconnectedtargets = false;
int _i = 0;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media = null;
 //BA.debugLineNum = 416;BA.debugLine="Private Sub TrimMediaCacheImpl";
 //BA.debugLineNum = 417;BA.debugLine="If DateTime.Now > LastTrimCache + MinTimeBetweenT";
if (__c.DateTime.getNow()>_lasttrimcache+_mintimebetweentrims) { 
 //BA.debugLineNum = 418;BA.debugLine="Dim OnlyLookForDisconnectedTargets As Boolean =";
_onlylookfordisconnectedtargets = _mediacache._getsize /*int*/ ()<_maxmediacachesize;
 //BA.debugLineNum = 419;BA.debugLine="LastTrimCache = DateTime.Now";
_lasttrimcache = __c.DateTime.getNow();
 //BA.debugLineNum = 423;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 424;BA.debugLine="Do While i < MediaCache.Size";
while (_i<_mediacache._getsize /*int*/ ()) {
 //BA.debugLineNum = 425;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(MediaCach";
_media = (b4a.DesaWisataSumpu.simplemediamanager._smmedia)(_mediacache._get /*Object*/ (_mediacache._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Get(_i)));
 //BA.debugLineNum = 426;BA.debugLine="CancelDisconnectedTargets(Media)";
_canceldisconnectedtargets(_media);
 //BA.debugLineNum = 427;BA.debugLine="If OnlyLookForDisconnectedTargets = False And M";
if (_onlylookfordisconnectedtargets==__c.False && _mediacache._getsize /*int*/ ()>_maxmediacachesize/(double)2 && _ismediastillrelevant(_media)==__c.False) { 
 //BA.debugLineNum = 428;BA.debugLine="DeleteMedia(Media)";
_deletemedia(_media);
 //BA.debugLineNum = 429;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 };
 //BA.debugLineNum = 431;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 };
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
