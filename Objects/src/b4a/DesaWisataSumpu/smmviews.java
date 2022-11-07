package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class smmviews extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.DesaWisataSumpu.smmviews");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.smmviews.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _targettosmmviews = null;
public int _view_type_b4ximageview = 0;
public int _view_type_gifview = 0;
public int _view_type_videoplayer = 0;
public int _view_type_none = 0;
public int _view_type_webview = 0;
public int _view_type_zoomimageview = 0;
public int _media_type_image = 0;
public int _media_type_gif = 0;
public int _media_type_video = 0;
public int _media_type_none = 0;
public int _media_type_webp = 0;
public int _media_type_html = 0;
public b4a.DesaWisataSumpu.b4xset _unusedviews = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
public boolean _gif_supported = false;
public boolean _video_supported = false;
public boolean _webp_supported = false;
public b4a.DesaWisataSumpu.simplemediamanager _mmanager = null;
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
public static class _smmview{
public boolean IsInitialized;
public Object CustomView;
public anywheresoftware.b4a.objects.B4XViewWrapper mBase;
public int ViewType;
public String Key;
public void Initialize() {
IsInitialized = true;
CustomView = new Object();
mBase = new anywheresoftware.b4a.objects.B4XViewWrapper();
ViewType = 0;
Key = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public void  _addmedia(b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) throws Exception{
ResumableSub_AddMedia rsub = new ResumableSub_AddMedia(this,_requestset,_media,_request);
rsub.resume(ba, null);
}
public static class ResumableSub_AddMedia extends BA.ResumableSub {
public ResumableSub_AddMedia(b4a.DesaWisataSumpu.smmviews parent,b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset,b4a.DesaWisataSumpu.simplemediamanager._smmedia _media,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) {
this.parent = parent;
this._requestset = _requestset;
this._media = _media;
this._request = _request;
}
b4a.DesaWisataSumpu.smmviews parent;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequestset _requestset;
b4a.DesaWisataSumpu.simplemediamanager._smmedia _media;
b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request;
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
int _viewtype = 0;
b4a.DesaWisataSumpu.smmviews._smmview _sm = null;
int _fadeanimation = 0;
b4a.DesaWisataSumpu.b4ximageview _x = null;
anywheresoftware.b4j.object.JavaObject _decoder = null;
anywheresoftware.b4j.object.JavaObject _drawable = null;
Object[] _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 51;BA.debugLine="Dim Target As B4XView = RequestSet.Target";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = _requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 //BA.debugLineNum = 52;BA.debugLine="CancelRequest(Target)";
parent._cancelrequest(_target);
 //BA.debugLineNum = 53;BA.debugLine="Dim ViewType As Int = MediaTypeToViewType(MEDIA.M";
_viewtype = parent._mediatypetoviewtype(_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,_request);
 //BA.debugLineNum = 54;BA.debugLine="Dim sm As SMMView = GetView(ViewType, MEDIA.Meta.";
_sm = parent._getview(_viewtype,_media.Meta /*b4a.DesaWisataSumpu.simplemediamanager._smmediameta*/ .Key /*String*/ );
 //BA.debugLineNum = 55;BA.debugLine="Target.Color = Request.Extra.GetDefault(mManager.";
_target.setColor((int)(BA.ObjectToNumber(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(parent._mmanager._request_background /*String*/ ),(Object)(parent._mmanager._defaultbackgroundcolor /*int*/ )))));
 //BA.debugLineNum = 56;BA.debugLine="TargetToSMMViews.Put(Target, sm)";
parent._targettosmmviews.Put((Object)(_target.getObject()),(Object)(_sm));
 //BA.debugLineNum = 57;BA.debugLine="Target.AddView(sm.mBase, 0, 0, Target.Width, Targ";
_target.AddView((android.view.View)(_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
 //BA.debugLineNum = 58;BA.debugLine="Dim FadeAnimation As Int = Request.Extra.GetDefau";
_fadeanimation = (int)(BA.ObjectToNumber(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(parent._mmanager._request_fade_animation_duration /*String*/ ),(Object)(parent._mmanager._defaultfadeanimationduration /*int*/ ))));
 //BA.debugLineNum = 59;BA.debugLine="If FadeAnimation > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_fadeanimation>0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 60;BA.debugLine="sm.mBase.Visible = False";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
 //BA.debugLineNum = 61;BA.debugLine="sm.mBase.SetVisibleAnimated(FadeAnimation, True)";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(_fadeanimation,parent.__c.True);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 63;BA.debugLine="sm.mBase.Visible = True";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;
;
 //BA.debugLineNum = 65;BA.debugLine="Select ViewType";

case 6:
//select
this.state = 25;
switch (BA.switchObjectToInt(_viewtype,parent._view_type_b4ximageview,parent._view_type_gifview,parent._view_type_zoomimageview,parent._view_type_videoplayer,parent._view_type_webview)) {
case 0: {
this.state = 8;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 67;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
_x = (b4a.DesaWisataSumpu.b4ximageview)(_sm.CustomView /*Object*/ );
 //BA.debugLineNum = 68;BA.debugLine="x.RoundedImage = Request.Extra.GetDefault(mMana";
_x._setroundedimage /*boolean*/ (BA.ObjectToBoolean(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(parent._mmanager._request_roundimage /*String*/ ),(Object)(parent.__c.False))));
 //BA.debugLineNum = 69;BA.debugLine="x.ResizeMode = Request.Extra.GetDefault(mManage";
_x._setresizemode /*String*/ (BA.ObjectToString(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(parent._mmanager._request_resize_mode /*String*/ ),(Object)(parent._mmanager._defaultresizemode /*String*/ ))));
 //BA.debugLineNum = 70;BA.debugLine="x.Bitmap = MediaToBitmap(MEDIA)";
_x._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (parent._mediatobitmap(_media));
 //BA.debugLineNum = 72;BA.debugLine="If mManager.IsWebPAnimated (MEDIA) Then";
if (true) break;

case 9:
//if
this.state = 16;
if (parent._mmanager._iswebpanimated /*boolean*/ (_media)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 73;BA.debugLine="Dim decoder As JavaObject";
_decoder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 74;BA.debugLine="Dim Drawable As JavaObject = decoder.Initializ";
_drawable = new anywheresoftware.b4j.object.JavaObject();
_drawable = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_decoder.InitializeStatic("android.graphics.ImageDecoder").RunMethod("decodeDrawable",new Object[]{_media.Media /*Object*/ })));
 //BA.debugLineNum = 75;BA.debugLine="x.mBase.GetView(0).As(View).Background = Drawa";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_x._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getObject()))).setBackground((android.graphics.drawable.Drawable)(_drawable.getObject()));
 //BA.debugLineNum = 76;BA.debugLine="If GetType(Drawable) = \"android.graphics.drawa";
if (true) break;

case 12:
//if
this.state = 15;
if ((parent.__c.GetType((Object)(_drawable.getObject()))).equals("android.graphics.drawable.AnimatedImageDrawable")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 77;BA.debugLine="Drawable.RunMethod(\"start\", Null)";
_drawable.RunMethod("start",(Object[])(parent.__c.Null));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 25;
 if (true) break;

case 20:
//C
this.state = 25;
 if (true) break;

case 22:
//C
this.state = 25;
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 115;BA.debugLine="ParentResized(Target)";
parent._parentresized(_target);
 //BA.debugLineNum = 116;BA.debugLine="sm.CustomView.As(WebView).LoadUrl(MEDIA.Media)";
((anywheresoftware.b4a.objects.WebViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.WebViewWrapper(), (android.webkit.WebView)(_sm.CustomView /*Object*/ ))).LoadUrl(BA.ObjectToString(_media.Media /*Object*/ ));
 if (true) break;
;
 //BA.debugLineNum = 118;BA.debugLine="If RequestSet.Callback <> Null And RequestSet.Req";

case 25:
//if
this.state = 32;
if (_requestset.Callback /*Object*/ != null && _requestset.RequestState /*int*/ !=parent._mmanager._state_loading /*int*/ ) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 119;BA.debugLine="Dim params() As Object = Array(RequestSet.Reques";
_params = new Object[]{(Object)(_requestset.RequestState /*int*/ ==parent._mmanager._state_ready /*int*/ ),(Object)(_media)};
 //BA.debugLineNum = 120;BA.debugLine="If FadeAnimation > 0 Then";
if (true) break;

case 28:
//if
this.state = 31;
if (_fadeanimation>0) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 121;BA.debugLine="Sleep(FadeAnimation + 10)";
parent.__c.Sleep(ba,this,(int) (_fadeanimation+10));
this.state = 33;
return;
case 33:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 127;BA.debugLine="RequestSet.Callback.As(JavaObject).RunMethodJO(\"";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_requestset.Callback /*Object*/ ))).RunMethodJO("getBA",(Object[])(parent.__c.Null)).RunMethod("raiseEventFromUI",new Object[]{(Object)(_target.getObject()),(Object)("smm_mediaready"),(Object)(_params)});
 if (true) break;

case 32:
//C
this.state = -1;
;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cancelrequest(anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub CancelRequest (Target As B4XView)";
 //BA.debugLineNum = 41;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
if (_targettosmmviews.ContainsKey((Object)(_target.getObject()))) { 
 //BA.debugLineNum = 42;BA.debugLine="ReturnViewToCache(TargetToSMMViews.Get(Target))";
_returnviewtocache((b4a.DesaWisataSumpu.smmviews._smmview)(_targettosmmviews.Get((Object)(_target.getObject()))));
 //BA.debugLineNum = 43;BA.debugLine="TargetToSMMViews.Remove(Target)";
_targettosmmviews.Remove((Object)(_target.getObject()));
 };
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type SMMView (CustomView As Object, mBase As B4XV";
;
 //BA.debugLineNum = 3;BA.debugLine="Private TargetToSMMViews As Map";
_targettosmmviews = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private Const VIEW_TYPE_B4XIMAGEVIEW = 1, VIEW_TY";
_view_type_b4ximageview = (int) (1);
_view_type_gifview = (int) (2);
_view_type_videoplayer = (int) (3);
_view_type_none = (int) (4);
_view_type_webview = (int) (5);
_view_type_zoomimageview = (int) (6);
 //BA.debugLineNum = 5;BA.debugLine="Public Const MEDIA_TYPE_IMAGE = 1, MEDIA_TYPE_GIF";
_media_type_image = (int) (1);
_media_type_gif = (int) (2);
_media_type_video = (int) (3);
_media_type_none = (int) (4);
_media_type_webp = (int) (5);
_media_type_html = (int) (6);
 //BA.debugLineNum = 6;BA.debugLine="Private UnusedViews As B4XSet";
_unusedviews = new b4a.DesaWisataSumpu.b4xset();
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="Private Panel As B4XView";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Const GIF_SUPPORTED As Boolean = False";
_gif_supported = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Private Const VIDEO_SUPPORTED As Boolean = False";
_video_supported = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="Private Const WEBP_SUPPORTED As Boolean = False";
_webp_supported = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="Private mManager As SimpleMediaManager";
_mmanager = new b4a.DesaWisataSumpu.simplemediamanager();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public b4a.DesaWisataSumpu.smmviews._smmview  _createsmmview(Object _customview,anywheresoftware.b4a.objects.B4XViewWrapper _mbase,int _viewtype,String _key) throws Exception{
b4a.DesaWisataSumpu.smmviews._smmview _t1 = null;
 //BA.debugLineNum = 345;BA.debugLine="Private Sub CreateSMMView (CustomView As Object, m";
 //BA.debugLineNum = 346;BA.debugLine="Dim t1 As SMMView";
_t1 = new b4a.DesaWisataSumpu.smmviews._smmview();
 //BA.debugLineNum = 347;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 348;BA.debugLine="t1.CustomView = CustomView";
_t1.CustomView /*Object*/  = _customview;
 //BA.debugLineNum = 349;BA.debugLine="t1.mBase = mBase";
_t1.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _mbase;
 //BA.debugLineNum = 350;BA.debugLine="t1.ViewType = ViewType";
_t1.ViewType /*int*/  = _viewtype;
 //BA.debugLineNum = 351;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
 //BA.debugLineNum = 352;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4a.DesaWisataSumpu.smmviews._smmview  _getview(int _viewtype,String _key) throws Exception{
b4a.DesaWisataSumpu.smmviews._smmview _sview = null;
anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
Object _customview = null;
b4a.DesaWisataSumpu.b4ximageview _x = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.WebViewWrapper _wv = null;
 //BA.debugLineNum = 225;BA.debugLine="Private Sub GetView (ViewType As Int, Key As Strin";
 //BA.debugLineNum = 226;BA.debugLine="For Each sview As SMMView In UnusedViews.AsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _unusedviews._aslist /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sview = (b4a.DesaWisataSumpu.smmviews._smmview)(group1.Get(index1));
 //BA.debugLineNum = 227;BA.debugLine="If sview.ViewType = ViewType Then";
if (_sview.ViewType /*int*/ ==_viewtype) { 
 //BA.debugLineNum = 228;BA.debugLine="UnusedViews.Remove(sview)";
_unusedviews._remove /*String*/ ((Object)(_sview));
 //BA.debugLineNum = 232;BA.debugLine="Return CreateSMMView(sview.CustomView, sview.mB";
if (true) return _createsmmview(_sview.CustomView /*Object*/ ,_sview.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_sview.ViewType /*int*/ ,_key);
 };
 }
};
 //BA.debugLineNum = 238;BA.debugLine="Dim mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 239;BA.debugLine="Dim CustomView As Object";
_customview = new Object();
 //BA.debugLineNum = 240;BA.debugLine="Select ViewType";
switch (BA.switchObjectToInt(_viewtype,_view_type_b4ximageview,_view_type_none,_view_type_gifview,_view_type_zoomimageview,_view_type_videoplayer,_view_type_webview)) {
case 0: {
 //BA.debugLineNum = 242;BA.debugLine="Dim x As B4XImageView = XUIViewsUtils.CreateB4X";
_x = _xuiviewsutils._createb4ximageview /*b4a.DesaWisataSumpu.b4ximageview*/ (ba);
 //BA.debugLineNum = 243;BA.debugLine="x.mBackgroundColor = xui.Color_Transparent";
_x._mbackgroundcolor /*int*/  = _xui.Color_Transparent;
 //BA.debugLineNum = 244;BA.debugLine="CustomView = x";
_customview = (Object)(_x);
 //BA.debugLineNum = 245;BA.debugLine="mBase = x.mBase";
_mbase = _x._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 break; }
case 1: {
 //BA.debugLineNum = 247;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 248;BA.debugLine="CustomView = p";
_customview = (Object)(_p.getObject());
 //BA.debugLineNum = 249;BA.debugLine="mBase = p";
_mbase = _p;
 break; }
case 2: {
 //BA.debugLineNum = 251;BA.debugLine="Panel.LoadLayout(\"SMMGifView\")";
_panel.LoadLayout("SMMGifView",ba);
 //BA.debugLineNum = 252;BA.debugLine="CustomView = Panel.GetView(0).Tag";
_customview = _panel.GetView((int) (0)).getTag();
 //BA.debugLineNum = 253;BA.debugLine="mBase = Panel.GetView(0)";
_mbase = _panel.GetView((int) (0));
 //BA.debugLineNum = 254;BA.debugLine="mBase.RemoveViewFromParent";
_mbase.RemoveViewFromParent();
 break; }
case 3: {
 //BA.debugLineNum = 256;BA.debugLine="Panel.LoadLayout(\"SMMZoomImageView\")";
_panel.LoadLayout("SMMZoomImageView",ba);
 //BA.debugLineNum = 257;BA.debugLine="CustomView = Panel.GetView(0).Tag";
_customview = _panel.GetView((int) (0)).getTag();
 //BA.debugLineNum = 258;BA.debugLine="mBase = Panel.GetView(0)";
_mbase = _panel.GetView((int) (0));
 //BA.debugLineNum = 259;BA.debugLine="mBase.RemoveViewFromParent";
_mbase.RemoveViewFromParent();
 break; }
case 4: {
 break; }
case 5: {
 //BA.debugLineNum = 282;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 283;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 284;BA.debugLine="Dim wv As WebView";
_wv = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 285;BA.debugLine="wv.Initialize(\"\")";
_wv.Initialize(ba,"");
 //BA.debugLineNum = 286;BA.debugLine="p.AddView(wv, 0, 0, p.Width,p.Height)";
_p.AddView((android.view.View)(_wv.getObject()),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
 //BA.debugLineNum = 287;BA.debugLine="CustomView = wv";
_customview = (Object)(_wv.getObject());
 //BA.debugLineNum = 288;BA.debugLine="mBase = p";
_mbase = _p;
 break; }
}
;
 //BA.debugLineNum = 290;BA.debugLine="Return CreateSMMView(CustomView, mBase, ViewType,";
if (true) return _createsmmview(_customview,_mbase,_viewtype,_key);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.DesaWisataSumpu.simplemediamanager _manager) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Manager As SimpleMediaManag";
 //BA.debugLineNum = 33;BA.debugLine="mManager = Manager";
_mmanager = _manager;
 //BA.debugLineNum = 34;BA.debugLine="TargetToSMMViews.Initialize";
_targettosmmviews.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="UnusedViews.Initialize";
_unusedviews._initialize /*String*/ (ba);
 //BA.debugLineNum = 36;BA.debugLine="Panel = xui.CreatePanel(\"\")";
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 37;BA.debugLine="Panel.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_panel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _mediatobitmap(b4a.DesaWisataSumpu.simplemediamanager._smmedia _media) throws Exception{
anywheresoftware.b4j.object.JavaObject _decoder = null;
 //BA.debugLineNum = 133;BA.debugLine="Private Sub MediaToBitmap(MEDIA As SMMedia) As B4X";
 //BA.debugLineNum = 135;BA.debugLine="If mManager.IsWebPAnimated(MEDIA) Then";
if (_mmanager._iswebpanimated /*boolean*/ (_media)) { 
 //BA.debugLineNum = 136;BA.debugLine="Dim decoder As JavaObject";
_decoder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 137;BA.debugLine="Return decoder.InitializeStatic(\"android.graphic";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_decoder.InitializeStatic("android.graphics.ImageDecoder").RunMethod("decodeBitmap",new Object[]{_media.Media /*Object*/ })));
 };
 //BA.debugLineNum = 140;BA.debugLine="Return MEDIA.Media";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ ));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public int  _mediatypetoviewtype(int _mediatype,b4a.DesaWisataSumpu.simplemediamanager._smmediarequest _request) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Private Sub MediaTypeToViewType(MediaType As Int,";
 //BA.debugLineNum = 163;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,_media_type_image,_media_type_webp,_media_type_gif,_media_type_video,_media_type_none,_media_type_html)) {
case 0: 
case 1: {
 //BA.debugLineNum = 170;BA.debugLine="Return VIEW_TYPE_B4XIMAGEVIEW";
if (true) return _view_type_b4ximageview;
 break; }
case 2: {
 //BA.debugLineNum = 172;BA.debugLine="Return VIEW_TYPE_GIFVIEW";
if (true) return _view_type_gifview;
 break; }
case 3: {
 //BA.debugLineNum = 174;BA.debugLine="Return VIEW_TYPE_VIDEOPLAYER";
if (true) return _view_type_videoplayer;
 break; }
case 4: {
 //BA.debugLineNum = 176;BA.debugLine="Return VIEW_TYPE_NONE";
if (true) return _view_type_none;
 break; }
case 5: {
 //BA.debugLineNum = 178;BA.debugLine="Return VIEW_TYPE_WEBVIEW";
if (true) return _view_type_webview;
 break; }
default: {
 //BA.debugLineNum = 180;BA.debugLine="Log(\"Unexpected media type: \" & MediaType)";
__c.LogImpl("912451858","Unexpected media type: "+BA.NumberToString(_mediatype),0);
 //BA.debugLineNum = 181;BA.debugLine="Return VIEW_TYPE_NONE";
if (true) return _view_type_none;
 break; }
}
;
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return 0;
}
public int  _mimetomediatype(String _mime) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub MimeToMediaType (Mime As String) As Int";
 //BA.debugLineNum = 144;BA.debugLine="If Mime.StartsWith(\"image/gif\") Then";
if (_mime.startsWith("image/gif")) { 
 //BA.debugLineNum = 145;BA.debugLine="If GIF_SUPPORTED = False Then Log(\"*** Add a ref";
if (_gif_supported==__c.False) { 
__c.LogImpl("912386306","*** Add a reference to B4XGIfView and add SMM_GIF to the build configuration ***",0);};
 //BA.debugLineNum = 146;BA.debugLine="Return IIf(GIF_SUPPORTED, MEDIA_TYPE_GIF, MEDIA_";
if (true) return (int)(BA.ObjectToNumber(((_gif_supported) ? ((Object)(_media_type_gif)) : ((Object)(_media_type_none)))));
 }else if(_mime.startsWith("image/webp")) { 
 //BA.debugLineNum = 148;BA.debugLine="If WEBP_SUPPORTED = False Then Log(\"*** Add a re";
if (_webp_supported==__c.False) { 
__c.LogImpl("912386309","*** Add a reference to WebP library and add SMM_WEBP to the build configuration ***",0);};
 //BA.debugLineNum = 149;BA.debugLine="Return IIf(WEBP_SUPPORTED, MEDIA_TYPE_WEBP, MEDI";
if (true) return (int)(BA.ObjectToNumber(((_webp_supported) ? ((Object)(_media_type_webp)) : ((Object)(_media_type_none)))));
 }else if(_mime.startsWith("image/")) { 
 //BA.debugLineNum = 151;BA.debugLine="Return MEDIA_TYPE_IMAGE";
if (true) return _media_type_image;
 }else if(_mime.startsWith("video/")) { 
 //BA.debugLineNum = 153;BA.debugLine="If VIDEO_SUPPORTED = False Then Log(\"*** Add a r";
if (_video_supported==__c.False) { 
__c.LogImpl("912386314","*** Add a reference to the video library and add SMM_VIDEO to the build configuration ***",0);};
 //BA.debugLineNum = 154;BA.debugLine="Return IIf(VIDEO_SUPPORTED, MEDIA_TYPE_VIDEO, ME";
if (true) return (int)(BA.ObjectToNumber(((_video_supported) ? ((Object)(_media_type_video)) : ((Object)(_media_type_none)))));
 }else if(_mime.startsWith("text/")) { 
 //BA.debugLineNum = 156;BA.debugLine="Return MEDIA_TYPE_HTML";
if (true) return _media_type_html;
 }else {
 //BA.debugLineNum = 158;BA.debugLine="Return MEDIA_TYPE_NONE";
if (true) return _media_type_none;
 };
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return 0;
}
public String  _parentresized(anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
b4a.DesaWisataSumpu.smmviews._smmview _sm = null;
b4a.DesaWisataSumpu.b4ximageview _x = null;
 //BA.debugLineNum = 311;BA.debugLine="Public Sub ParentResized (Target As B4XView)";
 //BA.debugLineNum = 312;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
if (_targettosmmviews.ContainsKey((Object)(_target.getObject()))) { 
 //BA.debugLineNum = 313;BA.debugLine="Dim sm As SMMView = TargetToSMMViews.Get(Target)";
_sm = (b4a.DesaWisataSumpu.smmviews._smmview)(_targettosmmviews.Get((Object)(_target.getObject())));
 //BA.debugLineNum = 314;BA.debugLine="sm.mBase.SetLayoutAnimated(0, 0, 0, Target.Width";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
 //BA.debugLineNum = 315;BA.debugLine="Select sm.ViewType";
switch (BA.switchObjectToInt(_sm.ViewType /*int*/ ,_view_type_b4ximageview,_view_type_videoplayer,_view_type_webview,_view_type_zoomimageview)) {
case 0: {
 //BA.debugLineNum = 317;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
_x = (b4a.DesaWisataSumpu.b4ximageview)(_sm.CustomView /*Object*/ );
 //BA.debugLineNum = 318;BA.debugLine="x.Update";
_x._update /*String*/ ();
 break; }
case 1: {
 break; }
case 2: {
 //BA.debugLineNum = 334;BA.debugLine="sm.CustomView.As(B4XView).SetLayoutAnimated(0,";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sm.CustomView /*Object*/ ))).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
 break; }
case 3: {
 break; }
}
;
 };
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _returnviewtocache(b4a.DesaWisataSumpu.smmviews._smmview _sm) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Private Sub ReturnViewToCache (sm As SMMView)";
 //BA.debugLineNum = 189;BA.debugLine="sm.mBase.RemoveViewFromParent";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 //BA.debugLineNum = 190;BA.debugLine="Select sm.ViewType";
switch (BA.switchObjectToInt(_sm.ViewType /*int*/ ,_view_type_b4ximageview,_view_type_gifview,_view_type_videoplayer,_view_type_webview,_view_type_zoomimageview)) {
case 0: {
 //BA.debugLineNum = 192;BA.debugLine="sm.CustomView.As(B4XImageView).Clear";
((b4a.DesaWisataSumpu.b4ximageview)(_sm.CustomView /*Object*/ ))._clear /*String*/ ();
 break; }
case 1: {
 //BA.debugLineNum = 194;BA.debugLine="sm.mBase.GetView(0).SetBitmap(Null)";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetBitmap((android.graphics.Bitmap)(__c.Null));
 break; }
case 2: {
 break; }
case 3: {
 //BA.debugLineNum = 214;BA.debugLine="sm.CustomView.As(JavaObject).RunMethod(\"stopLoa";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sm.CustomView /*Object*/ ))).RunMethod("stopLoading",(Object[])(__c.Null));
 //BA.debugLineNum = 216;BA.debugLine="sm.CustomView.As(WebView).LoadHtml(\"\")";
((anywheresoftware.b4a.objects.WebViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.WebViewWrapper(), (android.webkit.WebView)(_sm.CustomView /*Object*/ ))).LoadHtml("");
 break; }
case 4: {
 break; }
}
;
 //BA.debugLineNum = 222;BA.debugLine="UnusedViews.Add(sm)";
_unusedviews._add /*String*/ ((Object)(_sm));
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _typetostring(int _viewtype) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Private Sub TypeToString (ViewType As Int) As Stri";
 //BA.debugLineNum = 295;BA.debugLine="Select ViewType";
switch (BA.switchObjectToInt(_viewtype,_view_type_b4ximageview,_view_type_gifview,_view_type_none,_view_type_videoplayer,_view_type_webview,_view_type_zoomimageview)) {
case 0: {
 //BA.debugLineNum = 297;BA.debugLine="Return \"B4XImageView\"";
if (true) return "B4XImageView";
 break; }
case 1: {
 //BA.debugLineNum = 299;BA.debugLine="Return \"B4XGifView\"";
if (true) return "B4XGifView";
 break; }
case 2: {
 //BA.debugLineNum = 301;BA.debugLine="Return \"Panel\"";
if (true) return "Panel";
 break; }
case 3: {
 //BA.debugLineNum = 303;BA.debugLine="Return \"video player\"";
if (true) return "video player";
 break; }
case 4: {
 //BA.debugLineNum = 305;BA.debugLine="Return \"WebView\"";
if (true) return "WebView";
 break; }
case 5: {
 //BA.debugLineNum = 307;BA.debugLine="Return \"ZoomImageView\"";
if (true) return "ZoomImageView";
 break; }
}
;
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
