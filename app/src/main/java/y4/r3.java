package y4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r3 implements Runnable {
    public final /* synthetic */ f4 A;

    /* renamed from: s */
    public final /* synthetic */ String f20690s;

    /* renamed from: t */
    public final /* synthetic */ String f20691t;

    /* renamed from: u */
    public final /* synthetic */ long f20692u;

    /* renamed from: v */
    public final /* synthetic */ Bundle f20693v;

    /* renamed from: w */
    public final /* synthetic */ boolean f20694w;

    /* renamed from: x */
    public final /* synthetic */ boolean f20695x;
    public final /* synthetic */ boolean y;

    /* renamed from: z */
    public final /* synthetic */ String f20696z = null;

    public r3(f4 f4Var, String str, String str2, long j3, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.A = f4Var;
        this.f20690s = str;
        this.f20691t = str2;
        this.f20692u = j3;
        this.f20693v = bundle;
        this.f20694w = z10;
        this.f20695x = z11;
        this.y = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.p(this.f20690s, this.f20691t, this.f20692u, this.f20693v, this.f20694w, this.f20695x, this.y, this.f20696z);
    }
}
