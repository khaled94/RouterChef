package n3;

import android.content.Context;
import java.io.File;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import m4.a5;
import m4.d5;
import m4.es;
import m4.h4;
import m4.h90;
import m4.jo;
import m4.k90;
import m4.o3;
import m4.q4;
import m4.tz1;
import m4.w4;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public static h4 f16541a;

    /* renamed from: b */
    public static final Object f16542b = new Object();

    public o0(Context context) {
        h4 h4Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f16542b) {
            if (f16541a == null) {
                es.c(context);
                if (((Boolean) jo.f10145d.f10148c.a(es.C2)).booleanValue()) {
                    h4Var = new h4(new w4(new File(context.getCacheDir(), "admob_volley")), new b0(context, new a5()));
                    h4Var.c();
                } else {
                    h4Var = new h4(new w4(new d5(context.getApplicationContext())), new q4());
                    h4Var.c();
                }
                f16541a = h4Var;
            }
        }
    }

    public final tz1<String> a(int i10, String str, Map<String, String> map, byte[] bArr) {
        l0 l0Var = new l0();
        j0 j0Var = new j0(str, l0Var);
        k90 k90Var = new k90();
        k0 k0Var = new k0(i10, str, l0Var, j0Var, bArr, map, k90Var);
        if (k90.d()) {
            try {
                Map<String, String> e10 = k0Var.e();
                if (bArr == null) {
                    bArr = null;
                }
                if (k90.d()) {
                    k90Var.e("onNetworkRequest", new h90(str, "GET", e10, bArr));
                }
            } catch (o3 e11) {
                g1.j(e11.getMessage());
            }
        }
        f16541a.a(k0Var);
        return l0Var;
    }
}
