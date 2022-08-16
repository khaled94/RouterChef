package c4;

import a4.d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import b4.b;
import b4.g;
import c5.b0;
import c5.j;
import c5.k;
import c5.s;
import com.google.android.gms.common.api.Status;
import h2.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m0<ResultT> extends c0 {

    /* renamed from: b */
    public final l<Object, ResultT> f2719b;

    /* renamed from: c */
    public final j<ResultT> f2720c;

    /* renamed from: d */
    public final a f2721d;

    public m0(int i10, l<Object, ResultT> lVar, j<ResultT> jVar, a aVar) {
        super(i10);
        this.f2720c = jVar;
        this.f2719b = lVar;
        this.f2721d = aVar;
        if (i10 != 2 || !lVar.f2710b) {
            return;
        }
        throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }

    @Override // c4.o0
    public final void a(Status status) {
        j<ResultT> jVar = this.f2720c;
        Objects.requireNonNull(this.f2721d);
        jVar.c(status.f2932v != null ? new g(status) : new b(status));
    }

    @Override // c4.o0
    public final void b(Exception exc) {
        this.f2720c.c(exc);
    }

    @Override // c4.o0
    public final void c(w<?> wVar) {
        try {
            l<Object, ResultT> lVar = this.f2719b;
            ((k0) lVar).f2708d.f2712a.a(wVar.f2745t, this.f2720c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            this.f2720c.c(e12);
        }
    }

    @Override // c4.o0
    public final void d(m mVar, boolean z10) {
        j<ResultT> jVar = this.f2720c;
        mVar.f2718b.put(jVar, Boolean.valueOf(z10));
        b0<ResultT> b0Var = jVar.f2776a;
        u uVar = new u(mVar, jVar, 2);
        Objects.requireNonNull(b0Var);
        b0Var.f2771b.a(new s(k.f2777a, uVar));
        b0Var.u();
    }

    @Override // c4.c0
    public final boolean f(w<?> wVar) {
        return this.f2719b.f2710b;
    }

    @Override // c4.c0
    public final d[] g(w<?> wVar) {
        return this.f2719b.f2709a;
    }
}
