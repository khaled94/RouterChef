package m4;

/* loaded from: classes.dex */
public final class am2 {

    /* renamed from: a */
    public final int f6203a;

    /* renamed from: b */
    public final gf2[] f6204b;

    /* renamed from: c */
    public final tf0 f6205c;

    /* renamed from: d */
    public final Object f6206d;

    /* renamed from: e */
    public final kl2[] f6207e;

    public am2(gf2[] gf2VarArr, kl2[] kl2VarArr, tf0 tf0Var, Object obj) {
        this.f6204b = gf2VarArr;
        this.f6207e = (kl2[]) kl2VarArr.clone();
        this.f6205c = tf0Var;
        this.f6206d = obj;
        this.f6203a = gf2VarArr.length;
    }

    public final boolean a(am2 am2Var, int i10) {
        return am2Var != null && ls1.f(this.f6204b[i10], am2Var.f6204b[i10]) && ls1.f(this.f6207e[i10], am2Var.f6207e[i10]);
    }

    public final boolean b(int i10) {
        return this.f6204b[i10] != null;
    }
}
