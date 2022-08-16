package y4;

/* loaded from: classes.dex */
public final class q3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ long f20664s;

    /* renamed from: t */
    public final /* synthetic */ f4 f20665t;

    public q3(f4 f4Var, long j3) {
        this.f20665t = f4Var;
        this.f20664s = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((w2) this.f20665t.f20505s).s().B.b(this.f20664s);
        ((w2) this.f20665t.f20505s).C().E.b("Session timeout duration set", Long.valueOf(this.f20664s));
    }
}
