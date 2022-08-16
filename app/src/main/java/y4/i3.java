package y4;

import android.content.Context;
import h4.a;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public class i3 implements k3, u1 {

    /* renamed from: s */
    public final k3 f20505s;

    public /* synthetic */ i3(a6 a6Var) {
        this.f20505s = a6Var;
    }

    public i3(w2 w2Var) {
        Objects.requireNonNull(w2Var, "null reference");
        this.f20505s = w2Var;
    }

    @Override // y4.k3
    @Pure
    public final u2 B() {
        throw null;
    }

    @Override // y4.k3
    @Pure
    public final s1 C() {
        throw null;
    }

    @Override // y4.u1
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        ((a6) this.f20505s).j(str, i10, th, bArr, map);
    }

    @Override // y4.k3
    @Pure
    public final Context b() {
        throw null;
    }

    @Override // y4.k3
    @Pure
    public final a c() {
        throw null;
    }

    @Override // y4.k3
    @Pure
    public final m3.a d() {
        throw null;
    }

    public void f() {
        ((w2) this.f20505s).B().f();
    }

    public void g() {
        ((w2) this.f20505s).B().g();
    }
}
