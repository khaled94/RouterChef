package a5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b4.d;
import d4.c;
import d4.f;

/* loaded from: classes.dex */
public final class a extends f<g> implements z4.f {
    public final boolean A = true;
    public final c B;
    public final Bundle C;
    public final Integer D;

    public a(Context context, Looper looper, c cVar, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.B = cVar;
        this.C = bundle;
        this.D = cVar.f3841h;
    }

    @Override // d4.b, b4.a.e
    public final int f() {
        return 12451000;
    }

    @Override // d4.b, b4.a.e
    public final boolean l() {
        return this.A;
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // d4.b
    public final Bundle t() {
        if (!this.f3807c.getPackageName().equals(this.B.f3838e)) {
            this.C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.B.f3838e);
        }
        return this.C;
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
