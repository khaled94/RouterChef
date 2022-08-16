package c4;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a */
    public final int f2723a;

    public o0(int i10) {
        this.f2723a = i10;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(w<?> wVar);

    public abstract void d(m mVar, boolean z10);
}
