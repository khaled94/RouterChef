package m4;

import android.os.Parcel;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class oq extends ba implements pq {
    public oq() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((nr) this).h();
        } else if (i10 == 2) {
            Objects.requireNonNull(((nr) this).f11893s);
        } else if (i10 == 3) {
            ((nr) this).e();
        } else if (i10 == 4) {
            ((nr) this).b();
        } else if (i10 != 5) {
            return false;
        } else {
            ClassLoader classLoader = ca.f6747a;
            parcel.readInt();
            Objects.requireNonNull(((nr) this).f11893s);
        }
        parcel2.writeNoException();
        return true;
    }
}
