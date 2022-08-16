package i3;

import a4.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import l3.f;
import m4.ar0;
import m4.cn;
import m4.vo0;
import m4.ys0;

/* loaded from: classes.dex */
public final class c implements ar0, f {

    /* renamed from: s */
    public Object f5265s;

    public /* synthetic */ c(Context context) {
        try {
            Context a10 = i.a(context);
            this.f5265s = a10 == null ? null : a10.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f5265s = null;
        }
    }

    public /* synthetic */ c(cn cnVar) {
        this.f5265s = cnVar;
    }

    @Override // l3.f
    public final void a() {
        ((ys0) this.f5265s).f().N();
    }

    public final boolean b(String str) {
        try {
            Object obj = this.f5265s;
            if (((SharedPreferences) obj) != null) {
                return ((SharedPreferences) obj).getBoolean(str, false);
            }
            return false;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    @Override // l3.f
    public final void c() {
        ((ys0) this.f5265s).h().zza();
        ((ys0) this.f5265s).k().zza();
    }

    @Override // l3.f
    public final void d(View view) {
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        ((vo0) obj).d((cn) this.f5265s);
    }
}
