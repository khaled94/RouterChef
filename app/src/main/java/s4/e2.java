package s4;

import android.app.Activity;
import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class e2 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Activity f17845w;

    /* renamed from: x */
    public final /* synthetic */ j2 f17846x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(j2 j2Var, Activity activity) {
        super(j2Var.f17936s, true);
        this.f17846x = j2Var;
        this.f17845w = activity;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17846x.f17936s.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.onActivityPaused(new b(this.f17845w), this.f18213t);
    }
}
