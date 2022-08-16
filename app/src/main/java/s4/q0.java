package s4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class q0 extends f0 implements s0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // s4.s0
    public final void beginAdUnitExposure(String str, long j3) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeLong(j3);
        e0(23, w10);
    }

    @Override // s4.s0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        h0.b(w10, bundle);
        e0(9, w10);
    }

    @Override // s4.s0
    public final void endAdUnitExposure(String str, long j3) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeLong(j3);
        e0(24, w10);
    }

    @Override // s4.s0
    public final void generateEventId(v0 v0Var) {
        Parcel w10 = w();
        h0.c(w10, v0Var);
        e0(22, w10);
    }

    @Override // s4.s0
    public final void getCachedAppInstanceId(v0 v0Var) {
        Parcel w10 = w();
        h0.c(w10, v0Var);
        e0(19, w10);
    }

    @Override // s4.s0
    public final void getConditionalUserProperties(String str, String str2, v0 v0Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        h0.c(w10, v0Var);
        e0(10, w10);
    }

    @Override // s4.s0
    public final void getCurrentScreenClass(v0 v0Var) {
        Parcel w10 = w();
        h0.c(w10, v0Var);
        e0(17, w10);
    }

    @Override // s4.s0
    public final void getCurrentScreenName(v0 v0Var) {
        Parcel w10 = w();
        h0.c(w10, v0Var);
        e0(16, w10);
    }

    @Override // s4.s0
    public final void getGmpAppId(v0 v0Var) {
        Parcel w10 = w();
        h0.c(w10, v0Var);
        e0(21, w10);
    }

    @Override // s4.s0
    public final void getMaxUserProperties(String str, v0 v0Var) {
        Parcel w10 = w();
        w10.writeString(str);
        h0.c(w10, v0Var);
        e0(6, w10);
    }

    @Override // s4.s0
    public final void getUserProperties(String str, String str2, boolean z10, v0 v0Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ClassLoader classLoader = h0.f17902a;
        w10.writeInt(z10 ? 1 : 0);
        h0.c(w10, v0Var);
        e0(5, w10);
    }

    @Override // s4.s0
    public final void initialize(a aVar, b1 b1Var, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        h0.b(w10, b1Var);
        w10.writeLong(j3);
        e0(1, w10);
    }

    @Override // s4.s0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j3) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        h0.b(w10, bundle);
        w10.writeInt(z10 ? 1 : 0);
        w10.writeInt(z11 ? 1 : 0);
        w10.writeLong(j3);
        e0(2, w10);
    }

    @Override // s4.s0
    public final void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) {
        Parcel w10 = w();
        w10.writeInt(5);
        w10.writeString(str);
        h0.c(w10, aVar);
        h0.c(w10, aVar2);
        h0.c(w10, aVar3);
        e0(33, w10);
    }

    @Override // s4.s0
    public final void onActivityCreated(a aVar, Bundle bundle, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        h0.b(w10, bundle);
        w10.writeLong(j3);
        e0(27, w10);
    }

    @Override // s4.s0
    public final void onActivityDestroyed(a aVar, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        w10.writeLong(j3);
        e0(28, w10);
    }

    @Override // s4.s0
    public final void onActivityPaused(a aVar, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        w10.writeLong(j3);
        e0(29, w10);
    }

    @Override // s4.s0
    public final void onActivityResumed(a aVar, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        w10.writeLong(j3);
        e0(30, w10);
    }

    @Override // s4.s0
    public final void onActivitySaveInstanceState(a aVar, v0 v0Var, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        h0.c(w10, v0Var);
        w10.writeLong(j3);
        e0(31, w10);
    }

    @Override // s4.s0
    public final void onActivityStarted(a aVar, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        w10.writeLong(j3);
        e0(25, w10);
    }

    @Override // s4.s0
    public final void onActivityStopped(a aVar, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        w10.writeLong(j3);
        e0(26, w10);
    }

    @Override // s4.s0
    public final void performAction(Bundle bundle, v0 v0Var, long j3) {
        Parcel w10 = w();
        h0.b(w10, bundle);
        h0.c(w10, v0Var);
        w10.writeLong(j3);
        e0(32, w10);
    }

    @Override // s4.s0
    public final void registerOnMeasurementEventListener(y0 y0Var) {
        Parcel w10 = w();
        h0.c(w10, y0Var);
        e0(35, w10);
    }

    @Override // s4.s0
    public final void setConditionalUserProperty(Bundle bundle, long j3) {
        Parcel w10 = w();
        h0.b(w10, bundle);
        w10.writeLong(j3);
        e0(8, w10);
    }

    @Override // s4.s0
    public final void setConsent(Bundle bundle, long j3) {
        Parcel w10 = w();
        h0.b(w10, bundle);
        w10.writeLong(j3);
        e0(44, w10);
    }

    @Override // s4.s0
    public final void setCurrentScreen(a aVar, String str, String str2, long j3) {
        Parcel w10 = w();
        h0.c(w10, aVar);
        w10.writeString(str);
        w10.writeString(str2);
        w10.writeLong(j3);
        e0(15, w10);
    }

    @Override // s4.s0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel w10 = w();
        ClassLoader classLoader = h0.f17902a;
        w10.writeInt(z10 ? 1 : 0);
        e0(39, w10);
    }

    @Override // s4.s0
    public final void setUserProperty(String str, String str2, a aVar, boolean z10, long j3) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        h0.c(w10, aVar);
        w10.writeInt(z10 ? 1 : 0);
        w10.writeLong(j3);
        e0(4, w10);
    }
}
