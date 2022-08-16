package n3;

import a4.b;
import a5.l;
import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import b4.a;
import c4.i0;
import c4.j0;
import c4.z;
import com.google.android.gms.common.api.Scope;
import d4.e0;
import d4.h;
import java.util.Objects;
import java.util.Set;
import m4.cp1;
import z4.f;

/* loaded from: classes.dex */
public final class n1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16536s;

    /* renamed from: t */
    public final /* synthetic */ Object f16537t;

    /* renamed from: u */
    public final /* synthetic */ Object f16538u;

    public /* synthetic */ n1(Object obj, Object obj2, int i10) {
        this.f16536s = i10;
        this.f16538u = obj;
        this.f16537t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16536s) {
            case 0:
                synchronized (((s1) this.f16538u).f16560d) {
                    ((s1) this.f16538u).f16561e = new WebView((Context) this.f16537t).getSettings().getUserAgentString();
                    ((s1) this.f16538u).f16560d.notifyAll();
                }
                return;
            case 1:
                j0 j0Var = (j0) this.f16538u;
                l lVar = (l) this.f16537t;
                a.AbstractC0032a<? extends f, z4.a> abstractC0032a = j0.f2701z;
                b bVar = lVar.f174t;
                if (bVar.t()) {
                    e0 e0Var = lVar.f175u;
                    Objects.requireNonNull(e0Var, "null reference");
                    bVar = e0Var.f3868u;
                    if (bVar.t()) {
                        i0 i0Var = j0Var.y;
                        h s10 = e0Var.s();
                        Set<Scope> set = j0Var.f2705v;
                        z zVar = (z) i0Var;
                        Objects.requireNonNull(zVar);
                        if (s10 != null && set != null) {
                            zVar.f2764c = s10;
                            zVar.f2765d = set;
                            if (zVar.f2766e) {
                                zVar.f2762a.c(s10, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            zVar.b(new b(4, null, null));
                        }
                        ((d4.b) j0Var.f2707x).p();
                        return;
                    }
                    String valueOf = String.valueOf(bVar);
                    Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                }
                ((z) j0Var.y).b(bVar);
                ((d4.b) j0Var.f2707x).p();
                return;
            default:
                ((cp1) this.f16537t).f7102b.b((String) this.f16538u);
                return;
        }
    }

    public /* synthetic */ n1(cp1 cp1Var, String str) {
        this.f16536s = 2;
        this.f16537t = cp1Var;
        this.f16538u = str;
    }
}
