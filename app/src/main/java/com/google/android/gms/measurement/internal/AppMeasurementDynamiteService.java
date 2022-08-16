package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c1.f;
import com.google.android.gms.common.util.DynamiteApi;
import d4.m;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k4.b;
import m4.an1;
import m4.h30;
import m4.l70;
import m4.oe;
import m4.r3;
import m4.xq;
import n3.k;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r.a;
import s4.a1;
import s4.b1;
import s4.r0;
import s4.sa;
import s4.v0;
import s4.y0;
import y4.d4;
import y4.e4;
import y4.f1;
import y4.f4;
import y4.h6;
import y4.i6;
import y4.j6;
import y4.k3;
import y4.l3;
import y4.l4;
import y4.n;
import y4.p;
import y4.p3;
import y4.q3;
import y4.t3;
import y4.v2;
import y4.w2;
import y4.w4;
import y4.x3;
import y4.y3;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends r0 {

    /* renamed from: s */
    public w2 f2969s = null;

    /* renamed from: t */
    public final Map<Integer, l3> f2970t = new a();

    @EnsuresNonNull({"scion"})
    public final void a() {
        if (this.f2969s != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    @Override // s4.s0
    public void beginAdUnitExposure(String str, long j3) {
        a();
        this.f2969s.m().h(str, j3);
    }

    public final void c0(v0 v0Var, String str) {
        a();
        this.f2969s.z().I(v0Var, str);
    }

    @Override // s4.s0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        this.f2969s.u().K(str, str2, bundle);
    }

    @Override // s4.s0
    public void clearMeasurementEnabled(long j3) {
        a();
        f4 u10 = this.f2969s.u();
        u10.h();
        ((w2) u10.f20505s).B().q(new y3(u10, null));
    }

    @Override // s4.s0
    public void endAdUnitExposure(String str, long j3) {
        a();
        this.f2969s.m().i(str, j3);
    }

    @Override // s4.s0
    public void generateEventId(v0 v0Var) {
        a();
        long o02 = this.f2969s.z().o0();
        a();
        this.f2969s.z().H(v0Var, o02);
    }

    @Override // s4.s0
    public void getAppInstanceId(v0 v0Var) {
        a();
        this.f2969s.B().q(new xq(this, v0Var, 1));
    }

    @Override // s4.s0
    public void getCachedAppInstanceId(v0 v0Var) {
        a();
        c0(v0Var, this.f2969s.u().H());
    }

    @Override // s4.s0
    public void getConditionalUserProperties(String str, String str2, v0 v0Var) {
        a();
        this.f2969s.B().q(new i6(this, v0Var, str, str2));
    }

    @Override // s4.s0
    public void getCurrentScreenClass(v0 v0Var) {
        a();
        l4 l4Var = ((w2) this.f2969s.u().f20505s).w().f20651u;
        c0(v0Var, l4Var != null ? l4Var.f20552b : null);
    }

    @Override // s4.s0
    public void getCurrentScreenName(v0 v0Var) {
        a();
        l4 l4Var = ((w2) this.f2969s.u().f20505s).w().f20651u;
        c0(v0Var, l4Var != null ? l4Var.f20551a : null);
    }

    @Override // s4.s0
    public void getGmpAppId(v0 v0Var) {
        a();
        f4 u10 = this.f2969s.u();
        k3 k3Var = u10.f20505s;
        String str = ((w2) k3Var).f20787t;
        if (str == null) {
            try {
                str = f.h(((w2) k3Var).f20786s, ((w2) k3Var).K);
            } catch (IllegalStateException e10) {
                ((w2) u10.f20505s).C().f20710x.b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        c0(v0Var, str);
    }

    @Override // s4.s0
    public void getMaxUserProperties(String str, v0 v0Var) {
        a();
        f4 u10 = this.f2969s.u();
        Objects.requireNonNull(u10);
        m.e(str);
        Objects.requireNonNull((w2) u10.f20505s);
        a();
        this.f2969s.z().G(v0Var, 25);
    }

    @Override // s4.s0
    public void getTestFlag(v0 v0Var, int i10) {
        a();
        if (i10 == 0) {
            h6 z10 = this.f2969s.z();
            f4 u10 = this.f2969s.u();
            Objects.requireNonNull(u10);
            AtomicReference atomicReference = new AtomicReference();
            z10.I(v0Var, (String) ((w2) u10.f20505s).B().n(atomicReference, 15000L, "String test flag value", new r3(u10, atomicReference, 1)));
        } else if (i10 == 1) {
            h6 z11 = this.f2969s.z();
            f4 u11 = this.f2969s.u();
            Objects.requireNonNull(u11);
            AtomicReference atomicReference2 = new AtomicReference();
            z11.H(v0Var, ((Long) ((w2) u11.f20505s).B().n(atomicReference2, 15000L, "long test flag value", new o4.f(u11, atomicReference2, 1))).longValue());
        } else if (i10 == 2) {
            h6 z12 = this.f2969s.z();
            f4 u12 = this.f2969s.u();
            Objects.requireNonNull(u12);
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) ((w2) u12.f20505s).B().n(atomicReference3, 15000L, "double test flag value", new x3(u12, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                v0Var.l0(bundle);
            } catch (RemoteException e10) {
                ((w2) z12.f20505s).C().A.b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            h6 z13 = this.f2969s.z();
            f4 u13 = this.f2969s.u();
            Objects.requireNonNull(u13);
            AtomicReference atomicReference4 = new AtomicReference();
            z13.G(v0Var, ((Integer) ((w2) u13.f20505s).B().n(atomicReference4, 15000L, "int test flag value", new v2(u13, atomicReference4, 1))).intValue());
        } else if (i10 != 4) {
        } else {
            h6 z14 = this.f2969s.z();
            f4 u14 = this.f2969s.u();
            Objects.requireNonNull(u14);
            AtomicReference atomicReference5 = new AtomicReference();
            z14.A(v0Var, ((Boolean) ((w2) u14.f20505s).B().n(atomicReference5, 15000L, "boolean test flag value", new k(u14, atomicReference5))).booleanValue());
        }
    }

    @Override // s4.s0
    public void getUserProperties(String str, String str2, boolean z10, v0 v0Var) {
        a();
        this.f2969s.B().q(new w4(this, v0Var, str, str2, z10));
    }

    @Override // s4.s0
    public void initForTests(Map map) {
        a();
    }

    @Override // s4.s0
    public void initialize(k4.a aVar, b1 b1Var, long j3) {
        w2 w2Var = this.f2969s;
        if (w2Var == null) {
            Context context = (Context) b.e0(aVar);
            Objects.requireNonNull(context, "null reference");
            this.f2969s = w2.t(context, b1Var, Long.valueOf(j3));
            return;
        }
        w2Var.C().A.a("Attempting to initialize multiple times");
    }

    @Override // s4.s0
    public void isDataCollectionEnabled(v0 v0Var) {
        a();
        this.f2969s.B().q(new h30(this, v0Var, 1));
    }

    @Override // s4.s0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j3) {
        a();
        this.f2969s.u().m(str, str2, bundle, z10, z11, j3);
    }

    @Override // s4.s0
    public void logEventAndBundle(String str, String str2, Bundle bundle, v0 v0Var, long j3) {
        a();
        m.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f2969s.B().q(new e4(this, v0Var, new p(str2, new n(bundle), "app", j3), str));
    }

    @Override // s4.s0
    public void logHealthData(int i10, String str, k4.a aVar, k4.a aVar2, k4.a aVar3) {
        a();
        Object obj = null;
        Object e02 = aVar == null ? null : b.e0(aVar);
        Object e03 = aVar2 == null ? null : b.e0(aVar2);
        if (aVar3 != null) {
            obj = b.e0(aVar3);
        }
        this.f2969s.C().w(i10, true, false, str, e02, e03, obj);
    }

    @Override // s4.s0
    public void onActivityCreated(k4.a aVar, Bundle bundle, long j3) {
        a();
        d4 d4Var = this.f2969s.u().f20447u;
        if (d4Var != null) {
            this.f2969s.u().k();
            d4Var.onActivityCreated((Activity) b.e0(aVar), bundle);
        }
    }

    @Override // s4.s0
    public void onActivityDestroyed(k4.a aVar, long j3) {
        a();
        d4 d4Var = this.f2969s.u().f20447u;
        if (d4Var != null) {
            this.f2969s.u().k();
            d4Var.onActivityDestroyed((Activity) b.e0(aVar));
        }
    }

    @Override // s4.s0
    public void onActivityPaused(k4.a aVar, long j3) {
        a();
        d4 d4Var = this.f2969s.u().f20447u;
        if (d4Var != null) {
            this.f2969s.u().k();
            d4Var.onActivityPaused((Activity) b.e0(aVar));
        }
    }

    @Override // s4.s0
    public void onActivityResumed(k4.a aVar, long j3) {
        a();
        d4 d4Var = this.f2969s.u().f20447u;
        if (d4Var != null) {
            this.f2969s.u().k();
            d4Var.onActivityResumed((Activity) b.e0(aVar));
        }
    }

    @Override // s4.s0
    public void onActivitySaveInstanceState(k4.a aVar, v0 v0Var, long j3) {
        a();
        d4 d4Var = this.f2969s.u().f20447u;
        Bundle bundle = new Bundle();
        if (d4Var != null) {
            this.f2969s.u().k();
            d4Var.onActivitySaveInstanceState((Activity) b.e0(aVar), bundle);
        }
        try {
            v0Var.l0(bundle);
        } catch (RemoteException e10) {
            this.f2969s.C().A.b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // s4.s0
    public void onActivityStarted(k4.a aVar, long j3) {
        a();
        if (this.f2969s.u().f20447u != null) {
            this.f2969s.u().k();
            Activity activity = (Activity) b.e0(aVar);
        }
    }

    @Override // s4.s0
    public void onActivityStopped(k4.a aVar, long j3) {
        a();
        if (this.f2969s.u().f20447u != null) {
            this.f2969s.u().k();
            Activity activity = (Activity) b.e0(aVar);
        }
    }

    @Override // s4.s0
    public void performAction(Bundle bundle, v0 v0Var, long j3) {
        a();
        v0Var.l0(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<y4.l3>, java.util.concurrent.CopyOnWriteArraySet] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.Integer, y4.l3>, r.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.Integer, y4.l3>, r.g] */
    @Override // s4.s0
    public void registerOnMeasurementEventListener(y0 y0Var) {
        Object obj;
        a();
        synchronized (this.f2970t) {
            obj = (l3) this.f2970t.getOrDefault(Integer.valueOf(y0Var.g()), null);
            if (obj == null) {
                obj = new j6(this, y0Var);
                this.f2970t.put(Integer.valueOf(y0Var.g()), obj);
            }
        }
        f4 u10 = this.f2969s.u();
        u10.h();
        if (!u10.f20449w.add(obj)) {
            ((w2) u10.f20505s).C().A.a("OnEventListener already registered");
        }
    }

    @Override // s4.s0
    public void resetAnalyticsData(long j3) {
        a();
        f4 u10 = this.f2969s.u();
        u10.y.set(null);
        ((w2) u10.f20505s).B().q(new t3(u10, j3));
    }

    @Override // s4.s0
    public void setConditionalUserProperty(Bundle bundle, long j3) {
        a();
        if (bundle == null) {
            this.f2969s.C().f20710x.a("Conditional user property must not be null");
        } else {
            this.f2969s.u().u(bundle, j3);
        }
    }

    @Override // s4.s0
    public void setConsent(final Bundle bundle, final long j3) {
        a();
        final f4 u10 = this.f2969s.u();
        Objects.requireNonNull(u10);
        sa.b();
        if (((w2) u10.f20505s).y.s(null, f1.f20431r0)) {
            ((w2) u10.f20505s).B().r(new Runnable() { // from class: y4.o3
                @Override // java.lang.Runnable
                public final void run() {
                    f4.this.E(bundle, j3);
                }
            });
        } else {
            u10.E(bundle, j3);
        }
    }

    @Override // s4.s0
    public void setConsentThirdParty(Bundle bundle, long j3) {
        a();
        this.f2969s.u().v(bundle, -20, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (r0 <= 100) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
        if (r0 <= 100) goto L32;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreen(k4.a r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(k4.a, java.lang.String, java.lang.String, long):void");
    }

    @Override // s4.s0
    public void setDataCollectionEnabled(boolean z10) {
        a();
        f4 u10 = this.f2969s.u();
        u10.h();
        ((w2) u10.f20505s).B().q(new p3(u10, z10));
    }

    @Override // s4.s0
    public void setDefaultEventParameters(Bundle bundle) {
        a();
        f4 u10 = this.f2969s.u();
        ((w2) u10.f20505s).B().q(new an1(u10, bundle == null ? null : new Bundle(bundle), 2));
    }

    @Override // s4.s0
    public void setEventInterceptor(y0 y0Var) {
        a();
        l70 l70Var = new l70(this, y0Var);
        if (this.f2969s.B().s()) {
            this.f2969s.u().x(l70Var);
        } else {
            this.f2969s.B().q(new oe(this, l70Var, 6));
        }
    }

    @Override // s4.s0
    public void setInstanceIdProvider(a1 a1Var) {
        a();
    }

    @Override // s4.s0
    public void setMeasurementEnabled(boolean z10, long j3) {
        a();
        f4 u10 = this.f2969s.u();
        Boolean valueOf = Boolean.valueOf(z10);
        u10.h();
        ((w2) u10.f20505s).B().q(new y3(u10, valueOf));
    }

    @Override // s4.s0
    public void setMinimumSessionDuration(long j3) {
        a();
    }

    @Override // s4.s0
    public void setSessionTimeoutDuration(long j3) {
        a();
        f4 u10 = this.f2969s.u();
        ((w2) u10.f20505s).B().q(new q3(u10, j3));
    }

    @Override // s4.s0
    public void setUserId(String str, long j3) {
        a();
        if (str == null || str.length() != 0) {
            this.f2969s.u().A(null, "_id", str, true, j3);
        } else {
            this.f2969s.C().A.a("User ID must be non-empty");
        }
    }

    @Override // s4.s0
    public void setUserProperty(String str, String str2, k4.a aVar, boolean z10, long j3) {
        a();
        this.f2969s.u().A(str, str2, b.e0(aVar), z10, j3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<y4.l3>, java.util.concurrent.CopyOnWriteArraySet] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.Integer, y4.l3>, r.g] */
    @Override // s4.s0
    public void unregisterOnMeasurementEventListener(y0 y0Var) {
        Object obj;
        a();
        synchronized (this.f2970t) {
            obj = (l3) this.f2970t.remove(Integer.valueOf(y0Var.g()));
        }
        if (obj == null) {
            obj = new j6(this, y0Var);
        }
        f4 u10 = this.f2969s.u();
        u10.h();
        if (!u10.f20449w.remove(obj)) {
            ((w2) u10.f20505s).C().A.a("OnEventListener had not been registered");
        }
    }
}
