package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ey0 extends ba implements fz {
    public ey0() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // m4.fz
    public final void E(int i10) {
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel.readInt();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // m4.fz
    public final void d() {
    }
}
