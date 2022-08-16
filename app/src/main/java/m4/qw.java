package m4;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class qw implements lx {

    /* renamed from: s */
    public static final /* synthetic */ qw f13005s = new qw();

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        pe0 pe0Var = (pe0) obj;
        lx<vd0> lxVar = kx.f10595a;
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8186r5)).booleanValue()) {
            g1.j("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            g1.j("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(pe0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + String.valueOf(str).length() + 13);
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(obj2);
        g1.a(sb.toString());
        ((jz) pe0Var).a("openableApp", hashMap);
    }
}
