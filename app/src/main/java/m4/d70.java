package m4;

import a4.f;
import android.content.Context;
import j4.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class d70 implements g70 {

    /* renamed from: l */
    public static final List<Future<Void>> f7232l = Collections.synchronizedList(new ArrayList());
    @GuardedBy("lock")

    /* renamed from: a */
    public final fc2 f7233a;
    @GuardedBy("lock")

    /* renamed from: b */
    public final LinkedHashMap<String, wc2> f7234b;

    /* renamed from: e */
    public final Context f7237e;

    /* renamed from: f */
    public boolean f7238f;

    /* renamed from: g */
    public final e70 f7239g;
    @GuardedBy("lock")

    /* renamed from: c */
    public final List<String> f7235c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: d */
    public final List<String> f7236d = new ArrayList();

    /* renamed from: h */
    public final Object f7240h = new Object();

    /* renamed from: i */
    public HashSet<String> f7241i = new HashSet<>();

    /* renamed from: j */
    public boolean f7242j = false;

    /* renamed from: k */
    public boolean f7243k = false;

    public d70(Context context, o90 o90Var, e70 e70Var, String str) {
        this.f7237e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f7234b = new LinkedHashMap<>();
        this.f7239g = e70Var;
        for (String str2 : e70Var.f7734w) {
            this.f7241i.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.f7241i.remove("cookie".toLowerCase(Locale.ENGLISH));
        fc2 v10 = ad2.v();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ad2.K((ad2) v10.f9883t, 9);
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ad2.A((ad2) v10.f9883t, str);
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ad2.B((ad2) v10.f9883t, str);
        gc2 v11 = hc2.v();
        String str3 = this.f7239g.f7730s;
        if (str3 != null) {
            if (v11.f9884u) {
                v11.m();
                v11.f9884u = false;
            }
            hc2.x((hc2) v11.f9883t, str3);
        }
        hc2 k10 = v11.k();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ad2.C((ad2) v10.f9883t, k10);
        yc2 v12 = zc2.v();
        boolean e10 = c.a(this.f7237e).e();
        if (v12.f9884u) {
            v12.m();
            v12.f9884u = false;
        }
        zc2.z((zc2) v12.f9883t, e10);
        String str4 = o90Var.f12051s;
        if (str4 != null) {
            if (v12.f9884u) {
                v12.m();
                v12.f9884u = false;
            }
            zc2.x((zc2) v12.f9883t, str4);
        }
        long a10 = f.f133b.a(this.f7237e);
        if (a10 > 0) {
            if (v12.f9884u) {
                v12.m();
                v12.f9884u = false;
            }
            zc2.y((zc2) v12.f9883t, a10);
        }
        zc2 k11 = v12.k();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        ad2.H((ad2) v10.f9883t, k11);
        this.f7233a = v10;
    }

    @Override // m4.g70
    public final void Y(String str) {
        synchronized (this.f7240h) {
            try {
                if (str == null) {
                    fc2 fc2Var = this.f7233a;
                    if (fc2Var.f9884u) {
                        fc2Var.m();
                        fc2Var.f9884u = false;
                    }
                    ad2.F((ad2) fc2Var.f9883t);
                } else {
                    fc2 fc2Var2 = this.f7233a;
                    if (fc2Var2.f9884u) {
                        fc2Var2.m();
                        fc2Var2.f9884u = false;
                    }
                    ad2.E((ad2) fc2Var2.f9883t, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m4.g70
    public final void a(String str, Map<String, String> map, int i10) {
        synchronized (this.f7240h) {
            if (i10 == 3) {
                try {
                    this.f7243k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7234b.containsKey(str)) {
                if (i10 == 3) {
                    wc2 wc2Var = this.f7234b.get(str);
                    int a10 = l90.a(3);
                    if (wc2Var.f9884u) {
                        wc2Var.m();
                        wc2Var.f9884u = false;
                    }
                    xc2.D((xc2) wc2Var.f9883t, a10);
                }
                return;
            }
            wc2 w10 = xc2.w();
            int a11 = l90.a(i10);
            if (a11 != 0) {
                if (w10.f9884u) {
                    w10.m();
                    w10.f9884u = false;
                }
                xc2.D((xc2) w10.f9883t, a11);
            }
            int size = this.f7234b.size();
            if (w10.f9884u) {
                w10.m();
                w10.f9884u = false;
            }
            xc2.z((xc2) w10.f9883t, size);
            if (w10.f9884u) {
                w10.m();
                w10.f9884u = false;
            }
            xc2.A((xc2) w10.f9883t, str);
            kc2 v10 = mc2.v();
            if (this.f7241i.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.f7241i.contains(key.toLowerCase(Locale.ENGLISH))) {
                        ic2 v11 = jc2.v();
                        n82 E = n82.E(key);
                        if (v11.f9884u) {
                            v11.m();
                            v11.f9884u = false;
                        }
                        jc2.x((jc2) v11.f9883t, E);
                        n82 E2 = n82.E(value);
                        if (v11.f9884u) {
                            v11.m();
                            v11.f9884u = false;
                        }
                        jc2.y((jc2) v11.f9883t, E2);
                        jc2 k10 = v11.k();
                        if (v10.f9884u) {
                            v10.m();
                            v10.f9884u = false;
                        }
                        mc2.x((mc2) v10.f9883t, k10);
                    }
                }
            }
            mc2 k11 = v10.k();
            if (w10.f9884u) {
                w10.m();
                w10.f9884u = false;
            }
            xc2.B((xc2) w10.f9883t, k11);
            this.f7234b.put(str, w10);
        }
    }

    @Override // m4.g70
    public final void b() {
        synchronized (this.f7240h) {
            this.f7234b.keySet();
            tz1 m10 = mz1.m(Collections.emptyMap());
            ny nyVar = new ny(this, 1);
            t90 t90Var = u90.f14299f;
            tz1 p = mz1.p(m10, nyVar, t90Var);
            tz1 q10 = mz1.q(p, 10L, TimeUnit.SECONDS, u90.f14297d);
            mz1.t(p, new wq(q10), t90Var);
            f7232l.add(q10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // m4.g70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r9) {
        /*
            r8 = this;
            m4.e70 r0 = r8.f7239g
            boolean r0 = r0.f7732u
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8.f7242j
            if (r0 == 0) goto Lc
            return
        Lc:
            l3.s r0 = l3.s.B
            n3.s1 r0 = r0.f5789c
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 != 0) goto L16
            goto L6e
        L16:
            boolean r3 = r9.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2f
            r9.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2f
            android.graphics.Bitmap r4 = r9.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2f
            if (r4 == 0) goto L28
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4)     // Catch: java.lang.RuntimeException -> L2f
            goto L29
        L28:
            r4 = r2
        L29:
            r9.setDrawingCacheEnabled(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L36
        L2d:
            r3 = move-exception
            goto L31
        L2f:
            r3 = move-exception
            r4 = r2
        L31:
            java.lang.String r5 = "Fail to capture the web view"
            n3.g1.h(r5, r3)
        L36:
            if (r4 != 0) goto L6d
            int r3 = r9.getWidth()     // Catch: java.lang.RuntimeException -> L66
            int r4 = r9.getHeight()     // Catch: java.lang.RuntimeException -> L66
            if (r3 == 0) goto L60
            if (r4 != 0) goto L45
            goto L60
        L45:
            int r5 = r9.getWidth()     // Catch: java.lang.RuntimeException -> L66
            int r6 = r9.getHeight()     // Catch: java.lang.RuntimeException -> L66
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L66
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)     // Catch: java.lang.RuntimeException -> L66
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L66
            r6.<init>(r5)     // Catch: java.lang.RuntimeException -> L66
            r9.layout(r1, r1, r3, r4)     // Catch: java.lang.RuntimeException -> L66
            r9.draw(r6)     // Catch: java.lang.RuntimeException -> L66
            r2 = r5
            goto L6e
        L60:
            java.lang.String r9 = "Width or height of view is zero"
            n3.g1.j(r9)     // Catch: java.lang.RuntimeException -> L66
            goto L6e
        L66:
            r9 = move-exception
            java.lang.String r3 = "Fail to capture the webview"
            n3.g1.h(r3, r9)
            goto L6e
        L6d:
            r2 = r4
        L6e:
            if (r2 != 0) goto L76
            java.lang.String r9 = "Failed to capture the webview bitmap."
            a6.f.k(r9)
            return
        L76:
            r8.f7242j = r0
            m4.b70 r9 = new m4.b70
            r9.<init>(r8, r2, r1)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8f
            r9.run()
            goto L94
        L8f:
            m4.t90 r0 = m4.u90.f14294a
            r0.execute(r9)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.d70.c(android.view.View):void");
    }

    @Override // m4.g70
    public final boolean h() {
        return this.f7239g.f7732u && !this.f7242j;
    }

    @Override // m4.g70
    public final e70 zza() {
        return this.f7239g;
    }
}
