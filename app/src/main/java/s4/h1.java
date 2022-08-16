package s4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Bundle f17903w;

    /* renamed from: x */
    public final /* synthetic */ k2 f17904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k2 k2Var, Bundle bundle) {
        super(k2Var, true);
        this.f17904x = k2Var;
        this.f17903w = bundle;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17904x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.setConsent(this.f17903w, this.f18212s);
    }
}
