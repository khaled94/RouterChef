package y4;

/* loaded from: classes.dex */
public final class o4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ long f20624s;

    /* renamed from: t */
    public final /* synthetic */ p4 f20625t;

    public o4(p4 p4Var, long j3) {
        this.f20625t = p4Var;
        this.f20624s = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((w2) this.f20625t.f20505s).m().j(this.f20624s);
        this.f20625t.f20653w = null;
    }
}
