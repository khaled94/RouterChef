package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ String f18145w;

    /* renamed from: x */
    public final /* synthetic */ o0 f18146x;
    public final /* synthetic */ k2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(k2 k2Var, String str, o0 o0Var) {
        super(k2Var, true);
        this.y = k2Var;
        this.f18145w = str;
        this.f18146x = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.y.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.getMaxUserProperties(this.f18145w, this.f18146x);
    }

    @Override // s4.z1
    public final void b() {
        this.f18146x.l0(null);
    }
}
