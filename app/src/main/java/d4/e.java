package d4;

import a4.d;
import a4.f;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import d4.h;
import e4.a;

/* loaded from: classes.dex */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new x0();
    public d[] A;
    public d[] B;
    public boolean C;
    public int D;
    public boolean E;
    public String F;

    /* renamed from: s */
    public final int f3859s;

    /* renamed from: t */
    public final int f3860t;

    /* renamed from: u */
    public int f3861u;

    /* renamed from: v */
    public String f3862v;

    /* renamed from: w */
    public IBinder f3863w;

    /* renamed from: x */
    public Scope[] f3864x;
    public Bundle y;

    /* renamed from: z */
    public Account f3865z;

    public e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        this.f3859s = i10;
        this.f3860t = i11;
        this.f3861u = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f3862v = "com.google.android.gms";
        } else {
            this.f3862v = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                h c02 = h.a.c0(iBinder);
                int i14 = a.f3800s;
                if (c02 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = c02.a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f3865z = account2;
        } else {
            this.f3863w = iBinder;
            this.f3865z = account;
        }
        this.f3864x = scopeArr;
        this.y = bundle;
        this.A = dVarArr;
        this.B = dVarArr2;
        this.C = z10;
        this.D = i13;
        this.E = z11;
        this.F = str2;
    }

    public e(int i10, String str) {
        this.f3859s = 6;
        this.f3861u = f.f132a;
        this.f3860t = i10;
        this.C = true;
        this.F = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        x0.a(this, parcel, i10);
    }
}
