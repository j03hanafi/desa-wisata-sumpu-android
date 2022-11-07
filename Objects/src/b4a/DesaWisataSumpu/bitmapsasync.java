package b4a.DesaWisataSumpu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.*;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bitmapsasync extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.DesaWisataSumpu.bitmapsasync");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.DesaWisataSumpu.bitmapsasync.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _jme = null;
public long _maxfilesize = 0L;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private jme As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 7;BA.debugLine="Public MaxFileSize As Long = 3 * 1024 * 1024";
_maxfilesize = (long) (3*1024*1024);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 14;BA.debugLine="jme = Me";
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadfromfile(String _dir,String _filename,int _maxwidth,int _maxheight) throws Exception{
ResumableSub_LoadFromFile rsub = new ResumableSub_LoadFromFile(this,_dir,_filename,_maxwidth,_maxheight);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadFromFile extends BA.ResumableSub {
public ResumableSub_LoadFromFile(b4a.DesaWisataSumpu.bitmapsasync parent,String _dir,String _filename,int _maxwidth,int _maxheight) {
this.parent = parent;
this._dir = _dir;
this._filename = _filename;
this._maxwidth = _maxwidth;
this._maxheight = _maxheight;
}
b4a.DesaWisataSumpu.bitmapsasync parent;
String _dir;
String _filename;
int _maxwidth;
int _maxheight;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
Object _sf = null;
boolean _success = false;
Object _bmp = null;

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
 //BA.debugLineNum = 49;BA.debugLine="Dim res As B4XBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 50;BA.debugLine="If Dir <> File.DirAssets Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((_dir).equals(parent.__c.File.getDirAssets()) == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 51;BA.debugLine="If File.Size(Dir, Filename) > MaxFileSize Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.File.Size(_dir,_filename)>parent._maxfilesize) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 52;BA.debugLine="Log($\"File larger than MaxFileSize $1.0{File.Si";
parent.__c.LogImpl("913238276",("File larger than MaxFileSize "+parent.__c.SmartStringFormatter("1.0",(Object)(parent.__c.File.Size(_dir,_filename)))+""),0);
 //BA.debugLineNum = 53;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 64;BA.debugLine="Dim sf As Object = jme.RunMethod(\"loadBitmap\", Ar";
_sf = parent._jme.RunMethod("loadBitmap",new Object[]{(Object)(parent.__c.File.OpenInput(_dir,_filename).getObject()),(Object)(parent.__c.File.OpenInput(_dir,_filename).getObject()),(Object)(_maxwidth),(Object)(_maxheight)});
 //BA.debugLineNum = 65;BA.debugLine="Wait For (sf) Bitmap_Loaded (Success As Boolean,";
parent.__c.WaitFor("bitmap_loaded", ba, this, _sf);
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (Boolean) result[0];
_bmp = (Object) result[1];
;
 //BA.debugLineNum = 70;BA.debugLine="If Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 71;BA.debugLine="res = Bmp";
_res = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp));
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 73;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _bitmap_loaded(boolean _success,Object _bmp) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadfromhttpjob(b4a.DesaWisataSumpu.httpjob _job,int _maxwidth,int _maxheight) throws Exception{
ResumableSub_LoadFromHttpJob rsub = new ResumableSub_LoadFromHttpJob(this,_job,_maxwidth,_maxheight);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadFromHttpJob extends BA.ResumableSub {
public ResumableSub_LoadFromHttpJob(b4a.DesaWisataSumpu.bitmapsasync parent,b4a.DesaWisataSumpu.httpjob _job,int _maxwidth,int _maxheight) {
this.parent = parent;
this._job = _job;
this._maxwidth = _maxwidth;
this._maxheight = _maxheight;
}
b4a.DesaWisataSumpu.bitmapsasync parent;
b4a.DesaWisataSumpu.httpjob _job;
int _maxwidth;
int _maxheight;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
Object _sf = null;
boolean _success = false;
Object _bmp = null;

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
 //BA.debugLineNum = 21;BA.debugLine="Dim res As B4XBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 22;BA.debugLine="If Job.Success = False Then Return res";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 23;BA.debugLine="If Job.Response.ContentLength >= MaxFileSize Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentLength()>=parent._maxfilesize) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 24;BA.debugLine="Log($\"File larger than MaxFileSize $1.0{Job.Resp";
parent.__c.LogImpl("913172740",("File larger than MaxFileSize "+parent.__c.SmartStringFormatter("1.0",(Object)(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentLength()))+""),0);
 //BA.debugLineNum = 25;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 35;BA.debugLine="Dim sf As Object = jme.RunMethod(\"loadBitmap\", Ar";
_sf = parent._jme.RunMethod("loadBitmap",new Object[]{(Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(Object)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(Object)(_maxwidth),(Object)(_maxheight)});
 //BA.debugLineNum = 36;BA.debugLine="Wait For (sf) Bitmap_Loaded (Success As Boolean,";
parent.__c.WaitFor("bitmap_loaded", ba, this, _sf);
this.state = 15;
return;
case 15:
//C
this.state = 11;
_success = (Boolean) result[0];
_bmp = (Object) result[1];
;
 //BA.debugLineNum = 41;BA.debugLine="If Success Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_success) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 42;BA.debugLine="res = Bmp";
_res = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp));
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 44;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
public Object loadBitmap(final InputStream in1, final InputStream in2, final int MaxWidth, final int MaxHeight) {
	Object sender = new Object();
	BA.runAsync(getBA(), sender, "bitmap_loaded", new Object[] {false, null}, 
		new Callable<Object[]>() {
			public Object[] call() throws Exception {
				try {
				Options o = new Options();
				o.inJustDecodeBounds = true;
				BitmapFactory.decodeStream(in1, null, o);
				float r1 = Math.max(o.outWidth / MaxWidth, o.outHeight / MaxHeight);
				Options o2 = null;
				if (r1 > 1f) {
					o2 = new Options();
					o2.inSampleSize = (int) r1;
				}
				Bitmap bmp = BitmapFactory.decodeStream(in2, null, o2);
				bmp.setDensity(160);
				return new Object[] {true, bmp};
				} catch (Exception e) {
					BA.Log("" + e);
					throw e;
				} finally {
					in1.close();
					in2.close();
				}
			}
		}
	);
	return sender;
}
}
