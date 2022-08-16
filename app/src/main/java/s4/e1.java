package s4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ String f17842w;

    /* renamed from: x */
    public final /* synthetic */ String f17843x;
    public final /* synthetic */ Bundle y;

    /* renamed from: z */
    public final /* synthetic */ k2 f17844z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k2 k2Var, String str, String str2, Bundle bundle) {
        super(k2Var, true);
        this.f17844z = k2Var;
        this.f17842w = str;
        this.f17843x = str2;
        this.y = bundle;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17844z.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.clearConditionalUserProperty(this.f17842w, this.f17843x, this.y);
    }
}
