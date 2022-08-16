package s4;

import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class s1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ String f18092w = "Error with data collection. Data lost.";

    /* renamed from: x */
    public final /* synthetic */ Object f18093x;
    public final /* synthetic */ k2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(k2 k2Var, Object obj) {
        super(k2Var, false);
        this.y = k2Var;
        this.f18093x = obj;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.y.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.logHealthData(5, this.f18092w, new b(this.f18093x), new b(null), new b(null));
    }
}
