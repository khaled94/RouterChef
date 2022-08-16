package y4;

/* loaded from: classes.dex */
public abstract class v5 extends u5 {

    /* renamed from: u */
    public boolean f20777u;

    public v5(a6 a6Var) {
        super(a6Var);
        this.f20760t.I++;
    }

    public final void h() {
        if (this.f20777u) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void i() {
        if (!this.f20777u) {
            j();
            this.f20760t.J++;
            this.f20777u = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void j();
}
