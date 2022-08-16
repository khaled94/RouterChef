package m4;

/* loaded from: classes.dex */
public final class j52 implements me2 {

    /* renamed from: s */
    public final ff f9854s;

    /* renamed from: t */
    public final s42 f9855t;

    /* renamed from: u */
    public ff2 f9856u;

    /* renamed from: v */
    public me2 f9857v;

    /* renamed from: w */
    public boolean f9858w = true;

    /* renamed from: x */
    public boolean f9859x;

    public j52(s42 s42Var, g11 g11Var) {
        this.f9855t = s42Var;
        this.f9854s = new ff(g11Var);
    }

    @Override // m4.me2
    public final void b(pt ptVar) {
        me2 me2Var = this.f9857v;
        if (me2Var != null) {
            me2Var.b(ptVar);
            ptVar = this.f9857v.c();
        }
        this.f9854s.b(ptVar);
    }

    @Override // m4.me2
    public final pt c() {
        me2 me2Var = this.f9857v;
        return me2Var != null ? me2Var.c() : (pt) this.f9854s.f8435w;
    }

    @Override // m4.me2
    public final long zza() {
        throw null;
    }
}
