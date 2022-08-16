package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ o0 f18056w;

    /* renamed from: x */
    public final /* synthetic */ k2 f18057x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(k2 k2Var, o0 o0Var) {
        super(k2Var, true);
        this.f18057x = k2Var;
        this.f18056w = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f18057x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.getCurrentScreenName(this.f18056w);
    }

    @Override // s4.z1
    public final void b() {
        this.f18056w.l0(null);
    }
}
