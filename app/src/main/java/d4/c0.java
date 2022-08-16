package d4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e4.a;

/* loaded from: classes.dex */
public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: s */
    public final int f3846s;

    /* renamed from: t */
    public final Account f3847t;

    /* renamed from: u */
    public final int f3848u;

    /* renamed from: v */
    public final GoogleSignInAccount f3849v;

    public c0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f3846s = i10;
        this.f3847t = account;
        this.f3848u = i11;
        this.f3849v = googleSignInAccount;
    }

    public c0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f3846s = 2;
        this.f3847t = account;
        this.f3848u = i10;
        this.f3849v = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f3846s);
        m2.a.k(parcel, 2, this.f3847t, i10);
        m2.a.g(parcel, 3, this.f3848u);
        m2.a.k(parcel, 4, this.f3849v, i10);
        m2.a.u(parcel, q10);
    }
}
