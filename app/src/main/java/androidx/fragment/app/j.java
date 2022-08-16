package androidx.fragment.app;

import androidx.fragment.app.z0;
import java.util.Objects;
import r.a;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ z0.b f1452s;

    /* renamed from: t */
    public final /* synthetic */ z0.b f1453t;

    /* renamed from: u */
    public final /* synthetic */ boolean f1454u;

    public j(z0.b bVar, z0.b bVar2, boolean z10, a aVar) {
        this.f1452s = bVar;
        this.f1453t = bVar2;
        this.f1454u = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f1452s.f1620c;
        o oVar2 = this.f1453t.f1620c;
        boolean z10 = this.f1454u;
        q0 q0Var = p0.f1563a;
        if (z10) {
            Objects.requireNonNull(oVar2);
        } else {
            Objects.requireNonNull(oVar);
        }
    }
}
