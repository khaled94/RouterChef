package y4;

import j4.b;
import j4.c;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a */
    public final w2 f20518a;

    public j2(a6 a6Var) {
        this.f20518a = a6Var.D;
    }

    public final boolean a() {
        try {
            b a10 = c.a(this.f20518a.f20786s);
            if (a10 != null) {
                return a10.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f20518a.C().F.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f20518a.C().F.b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
