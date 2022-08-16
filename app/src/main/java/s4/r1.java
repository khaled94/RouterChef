package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r1 extends z1 {
    public final /* synthetic */ k2 A;

    /* renamed from: w */
    public final /* synthetic */ String f18079w;

    /* renamed from: x */
    public final /* synthetic */ String f18080x;
    public final /* synthetic */ boolean y;

    /* renamed from: z */
    public final /* synthetic */ o0 f18081z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(k2 k2Var, String str, String str2, boolean z10, o0 o0Var) {
        super(k2Var, true);
        this.A = k2Var;
        this.f18079w = str;
        this.f18080x = str2;
        this.y = z10;
        this.f18081z = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.A.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.getUserProperties(this.f18079w, this.f18080x, this.y, this.f18081z);
    }

    @Override // s4.z1
    public final void b() {
        this.f18081z.l0(null);
    }
}
