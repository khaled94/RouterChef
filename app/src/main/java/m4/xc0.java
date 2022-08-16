package m4;

import n3.g1;

/* loaded from: classes.dex */
public final class xc0 extends uc0 {
    public xc0(fb0 fb0Var) {
        super(fb0Var);
    }

    @Override // m4.uc0
    public final void h() {
    }

    @Override // m4.uc0
    public final boolean p(String str) {
        String b10 = g90.b(str);
        fb0 fb0Var = this.f14360u.get();
        if (fb0Var != null && b10 != null) {
            fb0Var.y(b10, this);
        }
        g1.j("VideoStreamNoopCache is doing nothing.");
        i(str, b10, "noop", "Noop cache is a noop.");
        return false;
    }
}
