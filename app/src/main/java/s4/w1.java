package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ a2 f18161w;

    /* renamed from: x */
    public final /* synthetic */ k2 f18162x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(k2 k2Var, a2 a2Var) {
        super(k2Var, true);
        this.f18162x = k2Var;
        this.f18161w = a2Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f18162x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.registerOnMeasurementEventListener(this.f18161w);
    }
}
