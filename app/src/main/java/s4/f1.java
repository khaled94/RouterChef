package s4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ String f17858w;

    /* renamed from: x */
    public final /* synthetic */ String f17859x;
    public final /* synthetic */ o0 y;

    /* renamed from: z */
    public final /* synthetic */ k2 f17860z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k2 k2Var, String str, String str2, o0 o0Var) {
        super(k2Var, true);
        this.f17860z = k2Var;
        this.f17858w = str;
        this.f17859x = str2;
        this.y = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17860z.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.getConditionalUserProperties(this.f17858w, this.f17859x, this.y);
    }

    @Override // s4.z1
    public final void b() {
        this.y.l0(null);
    }
}
