package c4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import b4.b;
import c5.j;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class l0<T> extends c0 {

    /* renamed from: b */
    public final j<T> f2716b;

    public l0(j jVar) {
        super(4);
        this.f2716b = jVar;
    }

    @Override // c4.o0
    public final void a(Status status) {
        this.f2716b.c(new b(status));
    }

    @Override // c4.o0
    public final void b(Exception exc) {
        this.f2716b.c(exc);
    }

    @Override // c4.o0
    public final void c(w<?> wVar) {
        try {
            h(wVar);
        } catch (DeadObjectException e10) {
            a(o0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            this.f2716b.c(e12);
        }
    }

    public abstract void h(w<?> wVar);
}
