package m4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class sd1 implements eh1<td1> {

    /* renamed from: a */
    public final uz1 f13602a;

    /* renamed from: b */
    public final om1 f13603b;

    /* renamed from: c */
    public final o90 f13604c;

    /* renamed from: d */
    public final d90 f13605d;

    public sd1(uz1 uz1Var, om1 om1Var, o90 o90Var, d90 d90Var) {
        this.f13602a = uz1Var;
        this.f13603b = om1Var;
        this.f13604c = o90Var;
        this.f13605d = d90Var;
    }

    @Override // m4.eh1
    public final tz1<td1> a() {
        return this.f13602a.Z(new Callable() { // from class: m4.rd1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sd1 sd1Var = sd1.this;
                return new td1(sd1Var.f13603b.f12209j, sd1Var.f13604c, sd1Var.f13605d.f7270g);
            }
        });
    }
}
