package l3;

import android.content.Context;
import android.content.pm.PackageManager;
import j4.c;
import java.util.Map;
import java.util.TreeMap;
import n3.g1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    public final Context f5774a;

    /* renamed from: b */
    public final String f5775b;

    /* renamed from: c */
    public final Map<String, String> f5776c = new TreeMap();

    /* renamed from: d */
    public String f5777d;

    /* renamed from: e */
    public String f5778e;

    /* renamed from: f */
    public final String f5779f;

    public q(Context context, String str) {
        String str2;
        this.f5774a = context.getApplicationContext();
        this.f5775b = str;
        String packageName = context.getPackageName();
        try {
            String str3 = c.a(context).d(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str3).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str3);
            str2 = sb.toString();
        } catch (PackageManager.NameNotFoundException e10) {
            g1.h("Unable to get package version name for reporting", e10);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f5779f = str2;
    }
}
