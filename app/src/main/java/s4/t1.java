package s4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Bundle f18101w;

    /* renamed from: x */
    public final /* synthetic */ o0 f18102x;
    public final /* synthetic */ k2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k2 k2Var, Bundle bundle, o0 o0Var) {
        super(k2Var, true);
        this.y = k2Var;
        this.f18101w = bundle;
        this.f18102x = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.y.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.performAction(this.f18101w, this.f18102x, this.f18212s);
    }

    @Override // s4.z1
    public final void b() {
        this.f18102x.l0(null);
    }
}
