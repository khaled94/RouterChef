package t3;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import javax.annotation.Nonnull;
import m4.kz1;
import m4.o40;
import n3.g1;

/* loaded from: classes.dex */
public final class y implements kz1<Uri> {

    /* renamed from: s */
    public final /* synthetic */ o40 f18624s;

    /* renamed from: t */
    public final /* synthetic */ z f18625t;

    public y(z zVar, o40 o40Var) {
        this.f18625t = zVar;
        this.f18624s = o40Var;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(@Nonnull Object obj) {
        Uri uri = (Uri) obj;
        try {
            this.f18625t.N.getAndIncrement();
            this.f18624s.A1(Collections.singletonList(uri));
            z zVar = this.f18625t;
            if (!zVar.I) {
                return;
            }
            this.f18625t.G.a(z.R3(uri, zVar.Q, "1").toString());
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        try {
            o40 o40Var = this.f18624s;
            String valueOf = String.valueOf(th.getMessage());
            o40Var.P(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }
}
