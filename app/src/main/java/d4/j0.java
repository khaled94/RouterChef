package d4;

import a4.a0;
import a4.c0;
import a4.y;
import android.os.IBinder;
import android.os.Parcel;
import r4.a;
import r4.c;

/* loaded from: classes.dex */
public final class j0 extends a implements l0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // d4.l0
    public final boolean Y1(c0 c0Var, k4.a aVar) {
        Parcel c02 = c0();
        int i10 = c.f17253a;
        boolean z10 = true;
        c02.writeInt(1);
        c0Var.writeToParcel(c02, 0);
        c.b(c02, aVar);
        Parcel w10 = w(5, c02);
        if (w10.readInt() == 0) {
            z10 = false;
        }
        w10.recycle();
        return z10;
    }

    @Override // d4.l0
    public final boolean e() {
        Parcel w10 = w(7, c0());
        int i10 = c.f17253a;
        boolean z10 = w10.readInt() != 0;
        w10.recycle();
        return z10;
    }

    @Override // d4.l0
    public final a0 j1(y yVar) {
        Parcel c02 = c0();
        int i10 = c.f17253a;
        c02.writeInt(1);
        yVar.writeToParcel(c02, 0);
        Parcel w10 = w(6, c02);
        a0 a0Var = (a0) c.a(w10, a0.CREATOR);
        w10.recycle();
        return a0Var;
    }
}
