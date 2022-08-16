package y4;

/* loaded from: classes.dex */
public final class x2 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ b f20805s;

    /* renamed from: t */
    public final /* synthetic */ k6 f20806t;

    /* renamed from: u */
    public final /* synthetic */ h3 f20807u;

    public x2(h3 h3Var, b bVar, k6 k6Var) {
        this.f20807u = h3Var;
        this.f20805s = bVar;
        this.f20806t = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20807u.f20483s.a();
        if (this.f20805s.f20301u.s() == null) {
            this.f20807u.f20483s.l(this.f20805s, this.f20806t);
        } else {
            this.f20807u.f20483s.o(this.f20805s, this.f20806t);
        }
    }
}
