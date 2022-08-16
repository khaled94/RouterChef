package s4;

import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class y1 extends z1 {
    public final /* synthetic */ k2 A;

    /* renamed from: w */
    public final /* synthetic */ String f18200w;

    /* renamed from: x */
    public final /* synthetic */ String f18201x;
    public final /* synthetic */ Object y;

    /* renamed from: z */
    public final /* synthetic */ boolean f18202z = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(k2 k2Var, String str, String str2, Object obj) {
        super(k2Var, true);
        this.A = k2Var;
        this.f18200w = str;
        this.f18201x = str2;
        this.y = obj;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.A.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.setUserProperty(this.f18200w, this.f18201x, new b(this.y), this.f18202z, this.f18212s);
    }
}
