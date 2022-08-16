package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jq extends aa implements lq {
    public jq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // m4.lq
    public final float b() {
        throw null;
    }

    @Override // m4.lq
    public final float d() {
        throw null;
    }

    @Override // m4.lq
    public final float e() {
        throw null;
    }

    @Override // m4.lq
    public final pq h() {
        pq pqVar;
        Parcel c02 = c0(11, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            pqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            pqVar = queryLocalInterface instanceof pq ? (pq) queryLocalInterface : new nq(readStrongBinder);
        }
        c02.recycle();
        return pqVar;
    }

    @Override // m4.lq
    public final void y2(pq pqVar) {
        Parcel w10 = w();
        ca.d(w10, pqVar);
        e0(8, w10);
    }
}
