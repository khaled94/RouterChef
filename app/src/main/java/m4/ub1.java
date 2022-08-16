package m4;

import android.view.View;
import javax.annotation.concurrent.GuardedBy;
import l3.f;

/* loaded from: classes.dex */
public final class ub1 implements f {
    @GuardedBy("this")

    /* renamed from: s */
    public f f14330s;

    @Override // l3.f
    public final synchronized void a() {
        f fVar = this.f14330s;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // l3.f
    public final synchronized void c() {
        f fVar = this.f14330s;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // l3.f
    public final synchronized void d(View view) {
        f fVar = this.f14330s;
        if (fVar != null) {
            fVar.d(view);
        }
    }
}
