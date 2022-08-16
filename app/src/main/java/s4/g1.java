package s4;

import android.app.Activity;
import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class g1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Activity f17870w;

    /* renamed from: x */
    public final /* synthetic */ String f17871x;
    public final /* synthetic */ String y;

    /* renamed from: z */
    public final /* synthetic */ k2 f17872z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(k2 k2Var, Activity activity, String str, String str2) {
        super(k2Var, true);
        this.f17872z = k2Var;
        this.f17870w = activity;
        this.f17871x = str;
        this.y = str2;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17872z.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.setCurrentScreen(new b(this.f17870w), this.f17871x, this.y, this.f18212s);
    }
}
