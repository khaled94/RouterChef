package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ String f17947w;

    /* renamed from: x */
    public final /* synthetic */ k2 f17948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(k2 k2Var, String str) {
        super(k2Var, true);
        this.f17948x = k2Var;
        this.f17947w = str;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17948x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.endAdUnitExposure(this.f17947w, this.f18213t);
    }
}
