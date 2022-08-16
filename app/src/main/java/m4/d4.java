package m4;

/* loaded from: classes.dex */
public final class d4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f7211s;

    /* renamed from: t */
    public final /* synthetic */ long f7212t;

    /* renamed from: u */
    public final /* synthetic */ e4 f7213u;

    public d4(e4 e4Var, String str, long j3) {
        this.f7213u = e4Var;
        this.f7211s = str;
        this.f7212t = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7213u.f7718s.a(this.f7211s, this.f7212t);
        e4 e4Var = this.f7213u;
        e4Var.f7718s.b(e4Var.toString());
    }
}
