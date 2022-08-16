package m4;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.Method;
import javax.annotation.ParametersAreNonnullByDefault;
import n3.g1;

/* loaded from: classes.dex */
public final class ut0 implements to0, yr0 {

    /* renamed from: s */
    public final o70 f14492s;

    /* renamed from: t */
    public final Context f14493t;

    /* renamed from: u */
    public final x70 f14494u;

    /* renamed from: v */
    public final View f14495v;

    /* renamed from: w */
    public String f14496w;

    /* renamed from: x */
    public final zj f14497x;

    public ut0(o70 o70Var, Context context, x70 x70Var, View view, zj zjVar) {
        this.f14492s = o70Var;
        this.f14493t = context;
        this.f14494u = x70Var;
        this.f14495v = view;
        this.f14497x = zjVar;
    }

    @Override // m4.yr0
    public final void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // m4.yr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            m4.x70 r0 = r7.f14494u
            android.content.Context r1 = r7.f14493t
            boolean r2 = r0.l(r1)
            if (r2 != 0) goto Le
        La:
            java.lang.String r0 = ""
            goto L8a
        Le:
            boolean r2 = m4.x70.m(r1)
            r3 = 0
            if (r2 == 0) goto L48
            java.lang.String r1 = "getCurrentScreenNameOrScreenClass"
            java.lang.String r2 = ""
            java.util.concurrent.atomic.AtomicReference<m4.ef0> r4 = r0.f15237j
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<m4.ef0> r5 = r0.f15237j     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L45
            m4.ef0 r5 = (m4.ef0) r5     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L42
            java.util.concurrent.atomic.AtomicReference<m4.ef0> r5 = r0.f15237j     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L45
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L45
            m4.ef0 r5 = (m4.ef0) r5     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L45
            java.lang.String r6 = r5.f()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L45
            if (r6 != 0) goto L3d
            java.lang.String r6 = r5.e()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L45
            if (r6 != 0) goto L3d
            java.lang.String r0 = ""
            goto L43
        L3d:
            r0 = r6
            goto L43
        L3f:
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> L45
        L42:
            r0 = r2
        L43:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            goto L8a
        L45:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r0
        L48:
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurement"
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r0.f15234g
            r5 = 1
            boolean r2 = r0.e(r1, r2, r4, r5)
            if (r2 != 0) goto L54
            goto La
        L54:
            java.lang.String r2 = "getCurrentScreenName"
            java.lang.reflect.Method r2 = r0.o(r1, r2)     // Catch: java.lang.Exception -> L84
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r0.f15234g     // Catch: java.lang.Exception -> L84
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L84
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L84
            java.lang.Object r2 = r2.invoke(r4, r5)     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L84
            if (r2 != 0) goto L80
            java.lang.String r2 = "getCurrentScreenClass"
            java.lang.reflect.Method r1 = r0.o(r1, r2)     // Catch: java.lang.Exception -> L84
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r0.f15234g     // Catch: java.lang.Exception -> L84
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L84
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L84
            java.lang.Object r1 = r1.invoke(r2, r4)     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L84
            r0 = r1
            goto L81
        L80:
            r0 = r2
        L81:
            if (r0 == 0) goto La
            goto L8a
        L84:
            java.lang.String r1 = "getCurrentScreenName"
            r0.c(r1, r3)
            goto La
        L8a:
            r7.f14496w = r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            m4.zj r1 = r7.f14497x
            m4.zj r2 = m4.zj.REWARD_BASED_VIDEO_AD
            if (r1 != r2) goto L99
            java.lang.String r1 = "/Rewarded"
            goto L9b
        L99:
            java.lang.String r1 = "/Interstitial"
        L9b:
            int r2 = r1.length()
            if (r2 == 0) goto La6
            java.lang.String r0 = r0.concat(r1)
            goto Lac
        La6:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        Lac:
            r7.f14496w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ut0.d():void");
    }

    @Override // m4.to0
    public final void e() {
    }

    @Override // m4.to0
    public final void i() {
        this.f14492s.a(false);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    @Override // m4.to0
    public final void k() {
        View view = this.f14495v;
        if (view != null && this.f14496w != null) {
            x70 x70Var = this.f14494u;
            Context context = view.getContext();
            String str = this.f14496w;
            if (x70Var.l(context) && (context instanceof Activity)) {
                if (x70.m(context)) {
                    x70Var.d("setScreenName", new t70(context, str));
                } else if (x70Var.e(context, "com.google.firebase.analytics.FirebaseAnalytics", x70Var.f15235h, false)) {
                    Method method = (Method) x70Var.f15236i.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            x70Var.f15236i.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            x70Var.c("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(x70Var.f15235h.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        x70Var.c("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f14492s.a(true);
    }

    @Override // m4.to0
    public final void o() {
    }

    @Override // m4.to0
    @ParametersAreNonnullByDefault
    public final void u(a60 a60Var, String str, String str2) {
        if (this.f14494u.l(this.f14493t)) {
            try {
                x70 x70Var = this.f14494u;
                Context context = this.f14493t;
                x70Var.k(context, x70Var.f(context), this.f14492s.f12021u, ((y50) a60Var).f15591s, ((y50) a60Var).f15592t);
            } catch (RemoteException e10) {
                g1.k("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // m4.to0
    public final void x() {
    }
}
