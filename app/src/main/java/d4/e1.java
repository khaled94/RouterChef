package d4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import r4.a;
import r4.c;

/* loaded from: classes.dex */
public final class e1 extends a implements h {
    public e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // d4.h
    public final Account a() {
        Parcel w10 = w(2, c0());
        Account account = (Account) c.a(w10, Account.CREATOR);
        w10.recycle();
        return account;
    }
}
