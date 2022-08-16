package t4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends m implements l {
    public j(IBinder iBinder) {
        super(iBinder);
    }

    @Override // t4.l
    public final int B2(int i10, String str, String str2, Bundle bundle) {
        Parcel w10 = w();
        w10.writeInt(i10);
        w10.writeString(str);
        w10.writeString(str2);
        int i11 = o.f18654a;
        w10.writeInt(1);
        bundle.writeToParcel(w10, 0);
        Parcel c02 = c0(10, w10);
        int readInt = c02.readInt();
        c02.recycle();
        return readInt;
    }

    @Override // t4.l
    public final Bundle F3(String str, String str2, String str3) {
        Parcel w10 = w();
        w10.writeInt(3);
        w10.writeString(str);
        w10.writeString(str2);
        w10.writeString(str3);
        Parcel c02 = c0(4, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) o.a(c02);
        c02.recycle();
        return bundle;
    }

    @Override // t4.l
    public final Bundle H0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel w10 = w();
        w10.writeInt(i10);
        w10.writeString(str);
        w10.writeString(str2);
        w10.writeString(str3);
        w10.writeString(null);
        int i11 = o.f18654a;
        w10.writeInt(1);
        bundle.writeToParcel(w10, 0);
        Parcel c02 = c0(8, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) o.a(c02);
        c02.recycle();
        return bundle2;
    }

    @Override // t4.l
    public final Bundle M2(String str, String str2, String str3) {
        Parcel w10 = w();
        w10.writeInt(3);
        w10.writeString(str);
        w10.writeString(str2);
        w10.writeString(str3);
        w10.writeString(null);
        Parcel c02 = c0(3, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) o.a(c02);
        c02.recycle();
        return bundle;
    }

    @Override // t4.l
    public final Bundle O0(String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel w10 = w();
        w10.writeInt(10);
        w10.writeString(str);
        w10.writeString(str2);
        int i10 = o.f18654a;
        w10.writeInt(1);
        bundle.writeToParcel(w10, 0);
        w10.writeInt(1);
        bundle2.writeToParcel(w10, 0);
        Parcel c02 = c0(901, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) o.a(c02);
        c02.recycle();
        return bundle3;
    }

    @Override // t4.l
    public final Bundle Q2(String str, String str2, String str3, Bundle bundle) {
        Parcel w10 = w();
        w10.writeInt(9);
        w10.writeString(str);
        w10.writeString(str2);
        w10.writeString(str3);
        int i10 = o.f18654a;
        w10.writeInt(1);
        bundle.writeToParcel(w10, 0);
        Parcel c02 = c0(11, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) o.a(c02);
        c02.recycle();
        return bundle2;
    }

    @Override // t4.l
    public final int T0(int i10, String str, String str2) {
        Parcel w10 = w();
        w10.writeInt(i10);
        w10.writeString(str);
        w10.writeString(str2);
        Parcel c02 = c0(1, w10);
        int readInt = c02.readInt();
        c02.recycle();
        return readInt;
    }

    @Override // t4.l
    public final Bundle b1(String str, String str2, Bundle bundle) {
        Parcel w10 = w();
        w10.writeInt(9);
        w10.writeString(str);
        w10.writeString(str2);
        int i10 = o.f18654a;
        w10.writeInt(1);
        bundle.writeToParcel(w10, 0);
        Parcel c02 = c0(902, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) o.a(c02);
        c02.recycle();
        return bundle2;
    }

    @Override // t4.l
    public final Bundle q1(String str, String str2, Bundle bundle) {
        Parcel w10 = w();
        w10.writeInt(3);
        w10.writeString(str);
        w10.writeString(str2);
        int i10 = o.f18654a;
        w10.writeInt(1);
        bundle.writeToParcel(w10, 0);
        Parcel c02 = c0(2, w10);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) o.a(c02);
        c02.recycle();
        return bundle2;
    }
}
