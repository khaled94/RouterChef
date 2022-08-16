package m4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import k4.a;

/* loaded from: classes.dex */
public final class qp extends aa implements tp {
    public qp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // m4.tp
    public final void I0(jr jrVar) {
        Parcel w10 = w();
        ca.b(w10, jrVar);
        e0(14, w10);
    }

    @Override // m4.tp
    public final void c2(xy xyVar) {
        Parcel w10 = w();
        ca.d(w10, xyVar);
        e0(12, w10);
    }

    @Override // m4.tp
    public final String d() {
        Parcel c02 = c0(9, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.tp
    public final List<ry> e() {
        Parcel c02 = c0(13, w());
        ArrayList createTypedArrayList = c02.createTypedArrayList(ry.CREATOR);
        c02.recycle();
        return createTypedArrayList;
    }

    @Override // m4.tp
    public final void i() {
        e0(1, w());
    }

    @Override // m4.tp
    public final void o3(f10 f10Var) {
        Parcel w10 = w();
        ca.d(w10, f10Var);
        e0(11, w10);
    }

    @Override // m4.tp
    public final void y0(String str, a aVar) {
        Parcel w10 = w();
        w10.writeString(null);
        ca.d(w10, aVar);
        e0(6, w10);
    }
}
