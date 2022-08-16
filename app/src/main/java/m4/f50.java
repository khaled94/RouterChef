package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f50 extends aa implements h50 {
    public f50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // m4.h50
    public final void U0(o50 o50Var, l50 l50Var) {
        Parcel w10 = w();
        ca.b(w10, o50Var);
        ca.d(w10, l50Var);
        e0(6, w10);
    }

    @Override // m4.h50
    public final void q3(o50 o50Var, l50 l50Var) {
        Parcel w10 = w();
        ca.b(w10, o50Var);
        ca.d(w10, l50Var);
        e0(5, w10);
    }

    @Override // m4.h50
    public final void u2(o50 o50Var, l50 l50Var) {
        Parcel w10 = w();
        ca.b(w10, o50Var);
        ca.d(w10, l50Var);
        e0(4, w10);
    }

    @Override // m4.h50
    public final void v0(String str, l50 l50Var) {
        Parcel w10 = w();
        w10.writeString(str);
        ca.d(w10, l50Var);
        e0(7, w10);
    }
}
