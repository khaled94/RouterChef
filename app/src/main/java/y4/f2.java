package y4;

/* loaded from: classes.dex */
public abstract class f2 extends h1 {

    /* renamed from: t */
    public boolean f20444t;

    public f2(w2 w2Var) {
        super(w2Var);
        ((w2) this.f20505s).W++;
    }

    public final void h() {
        if (this.f20444t) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void i() {
        if (!this.f20444t) {
            if (j()) {
                return;
            }
            ((w2) this.f20505s).a();
            this.f20444t = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean j();
}
