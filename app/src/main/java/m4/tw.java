package m4;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class tw implements lx {

    /* renamed from: s */
    public static final /* synthetic */ tw f14187s = new tw();

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        pe0 pe0Var = (pe0) obj;
        lx<vd0> lxVar = kx.f10595a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            g1.j("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = pe0Var.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str2, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + str2.length() + 14);
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(obj2);
            g1.a(sb.toString());
        }
        ((jz) pe0Var).a("openableURLs", hashMap);
    }
}
