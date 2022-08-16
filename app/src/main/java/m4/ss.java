package m4;

import android.os.Parcel;
import android.view.View;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public abstract class ss extends ba implements ts {
    public ss() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        if (i10 == 1) {
            str = ((rs) this).f13424t;
        } else if (i10 != 2) {
            if (i10 == 3) {
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                rs rsVar = (rs) this;
                if (c02 != null) {
                    rsVar.f13423s.d((View) b.e0(c02));
                }
            } else if (i10 == 4) {
                ((rs) this).f13423s.a();
            } else if (i10 != 5) {
                return false;
            } else {
                ((rs) this).f13423s.c();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = ((rs) this).f13425u;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
