package m4;

import android.os.Parcel;
import androidx.fragment.app.v;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class op extends ba implements pp {
    public op() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            cn cnVar = (cn) ca.a(parcel, cn.CREATOR);
            v vVar = ((ko) this).f10511s;
            if (vVar != null) {
                Objects.requireNonNull(cnVar);
                vVar.g();
            }
        } else if (i10 == 2) {
            v vVar2 = ((ko) this).f10511s;
            if (vVar2 != null) {
                vVar2.h();
            }
        } else if (i10 == 3) {
            v vVar3 = ((ko) this).f10511s;
            if (vVar3 != null) {
                vVar3.f();
            }
        } else if (i10 != 4 && i10 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
