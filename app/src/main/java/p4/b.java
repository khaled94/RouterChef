package p4;

import a5.e;
import a5.h;
import a5.l;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c4.j0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import n3.n1;

/* loaded from: classes.dex */
public class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        e eVar = (e) this;
        switch (i10) {
            case 3:
                a4.b bVar = (a4.b) c.a(parcel, a4.b.CREATOR);
                a5.b bVar2 = (a5.b) c.a(parcel, a5.b.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 7:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                j0 j0Var = (j0) eVar;
                j0Var.f2703t.post(new n1(j0Var, (l) c.a(parcel, l.CREATOR), 1));
                break;
            case 9:
                h hVar = (h) c.a(parcel, h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
