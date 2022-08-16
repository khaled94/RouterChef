package a3;

import b3.c;
import c3.b;
import c5.a;
import c5.f;
import c5.i;
import c5.j;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import s6.l0;
import u7.n0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements b.a, f, a {

    /* renamed from: s */
    public final /* synthetic */ Object f78s;

    public /* synthetic */ p(Object obj) {
        this.f78s = obj;
    }

    @Override // c3.b.a
    public Object a() {
        return ((c) this.f78s).c();
    }

    @Override // c5.f
    public void c(Object obj) {
        boolean z10;
        n0 n0Var = (n0) obj;
        if (((FirebaseMessaging) this.f78s).f3471g.b()) {
            if (!(n0Var.f19553h.a() != null)) {
                return;
            }
            synchronized (n0Var) {
                z10 = n0Var.f19552g;
            }
            if (z10) {
                return;
            }
            n0Var.g(0L);
        }
    }

    @Override // c5.a
    public Object d(i iVar) {
        j jVar = (j) this.f78s;
        ExecutorService executorService = l0.f18283a;
        if (iVar.n()) {
            jVar.d(iVar.j());
            return null;
        }
        Exception i10 = iVar.i();
        Objects.requireNonNull(i10);
        jVar.c(i10);
        return null;
    }
}
