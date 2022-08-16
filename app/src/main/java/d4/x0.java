package d4;

import a4.d;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import e4.b;
import m2.a;

/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator<e> {
    public static void a(e eVar, Parcel parcel, int i10) {
        int q10 = a.q(parcel, 20293);
        a.g(parcel, 1, eVar.f3859s);
        a.g(parcel, 2, eVar.f3860t);
        a.g(parcel, 3, eVar.f3861u);
        a.l(parcel, 4, eVar.f3862v);
        a.f(parcel, 5, eVar.f3863w);
        a.o(parcel, 6, eVar.f3864x, i10);
        a.b(parcel, 7, eVar.y);
        a.k(parcel, 8, eVar.f3865z, i10);
        a.o(parcel, 10, eVar.A, i10);
        a.o(parcel, 11, eVar.B, i10);
        a.a(parcel, 12, eVar.C);
        a.g(parcel, 13, eVar.D);
        a.a(parcel, 14, eVar.E);
        a.l(parcel, 15, eVar.F);
        a.u(parcel, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        d[] dVarArr = null;
        d[] dVarArr2 = null;
        String str2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    i11 = b.n(parcel, readInt);
                    break;
                case 3:
                    i12 = b.n(parcel, readInt);
                    break;
                case 4:
                    str = b.e(parcel, readInt);
                    break;
                case 5:
                    iBinder = b.m(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.h(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) b.d(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    b.q(parcel, readInt);
                    break;
                case '\n':
                    dVarArr = (d[]) b.h(parcel, readInt, d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d[]) b.h(parcel, readInt, d.CREATOR);
                    break;
                case '\f':
                    z10 = b.k(parcel, readInt);
                    break;
                case '\r':
                    i13 = b.n(parcel, readInt);
                    break;
                case 14:
                    z11 = b.k(parcel, readInt);
                    break;
                case 15:
                    str2 = b.e(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new e(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
