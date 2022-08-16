package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ o0 f18016w;

    /* renamed from: x */
    public final /* synthetic */ k2 f18017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(k2 k2Var, o0 o0Var) {
        super(k2Var, true);
        this.f18017x = k2Var;
        this.f18016w = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f18017x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.getCachedAppInstanceId(this.f18016w);
    }

    @Override // s4.z1
    public final void b() {
        this.f18016w.l0(null);
    }
}
