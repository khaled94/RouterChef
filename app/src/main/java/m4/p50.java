package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p50 implements Parcelable.Creator<o50> {
    @Override // android.os.Parcelable.Creator
    public final o50 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Bundle bundle = null;
        o90 o90Var = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        nn1 nn1Var = null;
        String str4 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bundle = b.a(parcel, readInt);
                    break;
                case 2:
                    o90Var = (o90) b.d(parcel, readInt, o90.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) b.d(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = b.e(parcel, readInt);
                    break;
                case 5:
                    arrayList = b.g(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) b.d(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = b.e(parcel, readInt);
                    break;
                case '\b':
                default:
                    b.q(parcel, readInt);
                    break;
                case '\t':
                    str3 = b.e(parcel, readInt);
                    break;
                case '\n':
                    nn1Var = (nn1) b.d(parcel, readInt, nn1.CREATOR);
                    break;
                case 11:
                    str4 = b.e(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new o50(bundle, o90Var, applicationInfo, str, arrayList, packageInfo, str2, str3, nn1Var, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o50[] newArray(int i10) {
        return new o50[i10];
    }
}
