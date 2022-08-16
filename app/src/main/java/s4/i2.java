package s4;

import android.app.Activity;
import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class i2 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Activity f17918w;

    /* renamed from: x */
    public final /* synthetic */ j2 f17919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, Activity activity) {
        super(j2Var.f17936s, true);
        this.f17919x = j2Var;
        this.f17918w = activity;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var = this.f17919x.f17936s.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.onActivityDestroyed(new b(this.f17918w), this.f18213t);
    }
}
