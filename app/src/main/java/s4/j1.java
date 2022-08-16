package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class j1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ String f17934w;

    /* renamed from: x */
    public final /* synthetic */ k2 f17935x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k2 k2Var, String str) {
        super(k2Var, true);
        this.f17935x = k2Var;
        this.f17934w = str;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17935x.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.beginAdUnitExposure(this.f17934w, this.f18213t);
    }
}
