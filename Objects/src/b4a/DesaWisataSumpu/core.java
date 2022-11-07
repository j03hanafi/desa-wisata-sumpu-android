package b4a.DesaWisataSumpu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class core {
private static core mostCurrent = new core();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.DesaWisataSumpu.main _main = null;
public b4a.DesaWisataSumpu.starter _starter = null;
public b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public b4a.DesaWisataSumpu.listrg _listrg = null;
public b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public b4a.DesaWisataSumpu.mapsev _mapsev = null;
public b4a.DesaWisataSumpu.detailev _detailev = null;
public b4a.DesaWisataSumpu.detailrg _detailrg = null;
public b4a.DesaWisataSumpu.homeuser _homeuser = null;
public b4a.DesaWisataSumpu.listev _listev = null;
public b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static String  _executeurl(anywheresoftware.b4a.BA _ba,String _url,String _parameters,String _jobname,Object _obj) throws Exception{
b4a.DesaWisataSumpu.httpjob _job = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
 //BA.debugLineNum = 10;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
 //BA.debugLineNum = 11;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
 //BA.debugLineNum = 12;BA.debugLine="job.PostString(Url, Parameters)";
_job._poststring /*String*/ (_url,_parameters);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _executeurlget(anywheresoftware.b4a.BA _ba,String _url,String _jobname,Object _obj) throws Exception{
b4a.DesaWisataSumpu.httpjob _job = null;
 //BA.debugLineNum = 15;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
 //BA.debugLineNum = 16;BA.debugLine="Dim job As HttpJob";
_job = new b4a.DesaWisataSumpu.httpjob();
 //BA.debugLineNum = 17;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
 //BA.debugLineNum = 18;BA.debugLine="job.Download(Url)";
_job._download /*String*/ (_url);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
