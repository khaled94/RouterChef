package m4;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import n3.c0;
import n3.d0;

/* loaded from: classes.dex */
public abstract class k50 extends ba implements l50 {
    public k50() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((f41) this).f8353s.f8745a.a(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) ca.a(parcel, ParcelFileDescriptor.CREATOR)));
        } else if (i10 != 2) {
            return false;
        } else {
            d0 d0Var = (d0) ca.a(parcel, d0.CREATOR);
            ((f41) this).f8353s.f8745a.c(new c0(d0Var.f16452s, d0Var.f16453t));
        }
        parcel2.writeNoException();
        return true;
    }
}
