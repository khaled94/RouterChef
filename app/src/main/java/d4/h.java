package d4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import r4.b;

/* loaded from: classes.dex */
public interface h extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends b implements h {
        public static h c0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof h ? (h) queryLocalInterface : new e1(iBinder);
        }
    }

    Account a();
}
