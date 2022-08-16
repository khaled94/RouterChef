package o4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class e implements IInterface {

    /* renamed from: s */
    public final IBinder f16759s;

    /* renamed from: t */
    public final String f16760t = "com.google.android.gms.appset.internal.IAppSetService";

    public e(IBinder iBinder) {
        this.f16759s = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16759s;
    }
}
