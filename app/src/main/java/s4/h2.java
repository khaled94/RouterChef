package s4;

import android.app.Activity;
import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class h2 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Activity f17905w;

    /* renamed from: x */
    public final /* synthetic */ o0 f17906x;
    public final /* synthetic */ j2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(j2 j2Var, Activity activity, o0 o0Var) {
        super(j2Var.f17936s, true);
        this.y = j2Var;
        this.f17905w = activity;
        this.f17906x = o0Var;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.y.f17936s.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.onActivitySaveInstanceState(new b(this.f17905w), this.f17906x, this.f18213t);
    }
}
