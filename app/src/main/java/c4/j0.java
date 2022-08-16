package c4;

import a4.b;
import a5.d;
import a5.g;
import a5.j;
import a5.l;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import b4.a;
import b4.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import d4.c;
import d4.c0;
import java.util.Objects;
import java.util.Set;
import n3.n1;
import z4.e;
import z4.f;

/* loaded from: classes.dex */
public final class j0 extends d implements d.a, d.b {

    /* renamed from: z */
    public static final a.AbstractC0032a<? extends f, z4.a> f2701z = e.f20977a;

    /* renamed from: s */
    public final Context f2702s;

    /* renamed from: t */
    public final Handler f2703t;

    /* renamed from: u */
    public final a.AbstractC0032a<? extends f, z4.a> f2704u;

    /* renamed from: v */
    public final Set<Scope> f2705v;

    /* renamed from: w */
    public final c f2706w;

    /* renamed from: x */
    public f f2707x;
    public i0 y;

    public j0(Context context, Handler handler, c cVar) {
        a.AbstractC0032a<? extends f, z4.a> abstractC0032a = f2701z;
        this.f2702s = context;
        this.f2703t = handler;
        this.f2706w = cVar;
        this.f2705v = cVar.f3835b;
        this.f2704u = abstractC0032a;
    }

    @Override // c4.j
    public final void c0(b bVar) {
        ((z) this.y).b(bVar);
    }

    @Override // c4.d
    public final void e0() {
        a5.a aVar = (a5.a) this.f2707x;
        Objects.requireNonNull(aVar);
        try {
            Account account = aVar.B.f3834a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? x3.a.a(aVar.f3807c).b() : null;
            Integer num = aVar.D;
            Objects.requireNonNull(num, "null reference");
            ((g) aVar.v()).w(new j(1, new c0(account, num.intValue(), b10)), this);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f2703t.post(new n1(this, new l(1, new b(8, null, null), null), 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // c4.d
    public final void w(int i10) {
        ((d4.b) this.f2707x).p();
    }
}
