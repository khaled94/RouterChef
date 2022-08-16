package y4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Bundle f20578s;

    /* renamed from: t */
    public final /* synthetic */ l4 f20579t;

    /* renamed from: u */
    public final /* synthetic */ l4 f20580u;

    /* renamed from: v */
    public final /* synthetic */ long f20581v;

    /* renamed from: w */
    public final /* synthetic */ p4 f20582w;

    public m4(p4 p4Var, Bundle bundle, l4 l4Var, l4 l4Var2, long j3) {
        this.f20582w = p4Var;
        this.f20578s = bundle;
        this.f20579t = l4Var;
        this.f20580u = l4Var2;
        this.f20581v = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4 p4Var = this.f20582w;
        Bundle bundle = this.f20578s;
        l4 l4Var = this.f20579t;
        l4 l4Var2 = this.f20580u;
        long j3 = this.f20581v;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        p4Var.l(l4Var, l4Var2, j3, true, ((w2) p4Var.f20505s).z().s0(null, "screen_view", bundle, null, false));
    }
}
