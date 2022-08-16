package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ o0 f18068w;

    /* renamed from: x */
    public final /* synthetic */ k2 f18069x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(k2 k2Var, o0 o0Var) {
        super(k2Var, true);
        this.f18069x = k2Var;
        this.f18068w = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f18069x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.getCurrentScreenClass(this.f18068w);
    }

    @Override // s4.z1
    public final void b() {
        this.f18068w.l0(null);
    }
}
