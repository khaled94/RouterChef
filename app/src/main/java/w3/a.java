package w3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    str2 = b.e(parcel, readInt);
                    break;
                case 4:
                    str3 = b.e(parcel, readInt);
                    break;
                case 5:
                    str4 = b.e(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) b.d(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.e(parcel, readInt);
                    break;
                case '\b':
                    j3 = b.o(parcel, readInt);
                    break;
                case '\t':
                    str6 = b.e(parcel, readInt);
                    break;
                case '\n':
                    arrayList = b.i(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.e(parcel, readInt);
                    break;
                case '\f':
                    str8 = b.e(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j3, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
