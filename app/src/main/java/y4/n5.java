package y4;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n5 extends j {

    /* renamed from: e */
    public final /* synthetic */ o5 f20610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o5 o5Var, k3 k3Var) {
        super(k3Var);
        this.f20610e = o5Var;
    }

    @Override // y4.j
    public final void b() {
        o5 o5Var = this.f20610e;
        o5Var.f20629d.g();
        Objects.requireNonNull(((w2) o5Var.f20629d.f20505s).F);
        o5Var.a(false, false, SystemClock.elapsedRealtime());
        m0 m10 = ((w2) o5Var.f20629d.f20505s).m();
        Objects.requireNonNull(((w2) o5Var.f20629d.f20505s).F);
        m10.j(SystemClock.elapsedRealtime());
    }
}
