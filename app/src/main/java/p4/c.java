package p4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final /* synthetic */ int f16949a = 0;

    static {
        c.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
