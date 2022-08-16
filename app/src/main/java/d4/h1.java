package d4;

import a4.t;
import android.os.Parcel;
import k4.a;
import r4.b;
import r4.c;

/* loaded from: classes.dex */
public abstract class h1 extends b implements i1 {

    /* renamed from: s */
    public static final /* synthetic */ int f3879s = 0;

    public h1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // r4.b
    public final boolean w(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a g10 = ((t) this).g();
            parcel2.writeNoException();
            c.b(parcel2, g10);
        } else if (i10 != 2) {
            return false;
        } else {
            int i11 = ((t) this).f151t;
            parcel2.writeNoException();
            parcel2.writeInt(i11);
        }
        return true;
    }
}
