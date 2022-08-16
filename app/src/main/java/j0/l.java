package j0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.e;
import r.g;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b */
    public static final ThreadPoolExecutor f5409b;

    /* renamed from: a */
    public static final e<String, Typeface> f5408a = new e<>(16);

    /* renamed from: c */
    public static final Object f5410c = new Object();

    /* renamed from: d */
    public static final g<String, ArrayList<l0.a<a>>> f5411d = new g<>();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Typeface f5412a;

        /* renamed from: b */
        public final int f5413b;

        public a(int i10) {
            this.f5412a = null;
            this.f5413b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f5412a = typeface;
            this.f5413b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5409b = threadPoolExecutor;
    }

    public static String a(g gVar, int i10) {
        return gVar.f5397e + "-" + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j0.l.a b(java.lang.String r6, android.content.Context r7, j0.g r8, int r9) {
        /*
            r.e<java.lang.String, android.graphics.Typeface> r0 = j0.l.f5408a
            java.lang.Object r0 = r0.b(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L10
            j0.l$a r6 = new j0.l$a
            r6.<init>(r0)
            return r6
        L10:
            j0.m r8 = j0.f.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            int r0 = r8.f5414a
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1d
            goto L34
        L1d:
            r0 = -2
            goto L3d
        L1f:
            j0.n[] r0 = r8.f5415b
            if (r0 == 0) goto L3c
            int r3 = r0.length
            if (r3 != 0) goto L27
            goto L3c
        L27:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L2a:
            if (r4 >= r2) goto L3b
            r5 = r0[r4]
            int r5 = r5.f5420e
            if (r5 == 0) goto L38
            if (r5 >= 0) goto L36
        L34:
            r0 = r1
            goto L3d
        L36:
            r0 = r5
            goto L3d
        L38:
            int r4 = r4 + 1
            goto L2a
        L3b:
            r2 = r3
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L45
            j0.l$a r6 = new j0.l$a
            r6.<init>(r0)
            return r6
        L45:
            j0.n[] r8 = r8.f5415b
            e0.l r0 = e0.f.f4318a
            android.graphics.Typeface r7 = r0.b(r7, r8, r9)
            if (r7 == 0) goto L5a
            r.e<java.lang.String, android.graphics.Typeface> r8 = j0.l.f5408a
            r8.c(r6, r7)
            j0.l$a r6 = new j0.l$a
            r6.<init>(r7)
            return r6
        L5a:
            j0.l$a r6 = new j0.l$a
            r6.<init>(r1)
            return r6
        L60:
            j0.l$a r6 = new j0.l$a
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.l.b(java.lang.String, android.content.Context, j0.g, int):j0.l$a");
    }
}
