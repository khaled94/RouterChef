package m4;

import android.content.Intent;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public abstract class s30 extends ba implements t30 {

    /* renamed from: s */
    public static final /* synthetic */ int f13507s = 0;

    public s30() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((c71) this).r0((Intent) ca.a(parcel, Intent.CREATOR));
        } else if (i10 == 2) {
            ((c71) this).u0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            c71 c71Var = (c71) this;
            c71Var.f6734w.j(new b00(c71Var.f6733v, 3));
        }
        parcel2.writeNoException();
        return true;
    }
}
