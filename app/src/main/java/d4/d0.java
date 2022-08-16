package d4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e4.b;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final c0 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                account = (Account) b.d(parcel, readInt, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = b.n(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.d(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new c0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int i10) {
        return new c0[i10];
    }
}
