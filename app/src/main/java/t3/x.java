package t3;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;
import m4.kz1;
import m4.o40;
import n3.g1;

/* loaded from: classes.dex */
public final class x implements kz1<ArrayList<Uri>> {

    /* renamed from: s */
    public final /* synthetic */ o40 f18622s;

    /* renamed from: t */
    public final /* synthetic */ z f18623t;

    public x(z zVar, o40 o40Var) {
        this.f18623t = zVar;
        this.f18622s = o40Var;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(@Nonnull Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f18622s.A1(arrayList);
            if (!this.f18623t.H) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (z.N3(uri)) {
                    this.f18623t.G.a(z.R3(uri, this.f18623t.Q, "1").toString());
                }
            }
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        try {
            o40 o40Var = this.f18622s;
            String valueOf = String.valueOf(th.getMessage());
            o40Var.P(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }
}
