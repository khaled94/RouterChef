package s4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Bundle f17793w;

    /* renamed from: x */
    public final /* synthetic */ k2 f17794x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(k2 k2Var, Bundle bundle) {
        super(k2Var, true);
        this.f17794x = k2Var;
        this.f17793w = bundle;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17794x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.setConditionalUserProperty(this.f17793w, this.f18212s);
    }
}
