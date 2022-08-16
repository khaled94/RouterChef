package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import d0.g;
import java.lang.reflect.Method;
import r.e;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final l f4318a;

    /* renamed from: b */
    public static final e<String, Typeface> f4319b;

    /* loaded from: classes.dex */
    public static class a extends c4.a {

        /* renamed from: u */
        public g.e f4320u;

        public a(g.e eVar) {
            this.f4320u = eVar;
        }
    }

    static {
        l gVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            gVar = new k();
        } else if (i10 >= 28) {
            gVar = new j();
        } else if (i10 >= 26) {
            gVar = new i();
        } else {
            if (i10 >= 24) {
                Method method = h.f4328d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    gVar = new h();
                }
            }
            gVar = new g();
        }
        f4318a = gVar;
        f4319b = new e<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0.equals(r4) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r7, d0.e.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, d0.g.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.f.a(android.content.Context, d0.e$b, android.content.res.Resources, int, java.lang.String, int, int, d0.g$e, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d5 = f4318a.d(context, resources, i10, str, i12);
        if (d5 != null) {
            f4319b.c(c(resources, i10, str, i11, i12), d5);
        }
        return d5;
    }

    public static String c(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
