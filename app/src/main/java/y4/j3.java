package y4;

/* loaded from: classes.dex */
public abstract class j3 extends i3 {

    /* renamed from: t */
    public boolean f20519t;

    public j3(w2 w2Var) {
        super(w2Var);
        ((w2) this.f20505s).W++;
    }

    public void h() {
    }

    public abstract boolean i();

    public final void j() {
        if (m()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void k() {
        if (!this.f20519t) {
            if (i()) {
                return;
            }
            ((w2) this.f20505s).a();
            this.f20519t = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void l() {
        if (!this.f20519t) {
            h();
            ((w2) this.f20505s).a();
            this.f20519t = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean m() {
        return this.f20519t;
    }
}
