package s3;

import android.database.Cursor;
import g1.b0;
import g1.z;
import m4.a00;
import m4.ar0;
import m4.cl;
import m4.dl;
import m4.f00;
import m4.kk;
import m4.oq1;
import m4.pt0;
import m4.vj;
import m4.w90;
import m4.wl;
import m4.wo0;
import m4.ye0;
import m4.z90;
import m4.zq0;
import n3.g1;
import q9.a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements z90, ar0, ye0, vj, a {

    /* renamed from: s */
    public final /* synthetic */ int f17700s;

    /* renamed from: t */
    public final Object f17701t;

    public /* synthetic */ f(Object obj, int i10) {
        this.f17700s = i10;
        this.f17701t = obj;
    }

    @Override // m4.ye0
    public final void J(boolean z10) {
        w90 w90Var = (w90) this.f17701t;
        if (z10) {
            w90Var.a(null);
        } else {
            w90Var.c(new Exception("Ad Web View failed to load."));
        }
    }

    @Override // q9.a
    public final oq1 a(String str) {
        b0 j3 = b0.j("SELECT * FROM macvendor WHERE mac = ?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        ((z) this.f17701t).b();
        oq1 oq1Var = null;
        String string = null;
        Cursor n10 = ((z) this.f17701t).n(j3);
        try {
            int a10 = i1.a.a(n10, "name");
            int a11 = i1.a.a(n10, "mac");
            if (n10.moveToFirst()) {
                oq1 oq1Var2 = new oq1();
                if (n10.isNull(a10)) {
                    oq1Var2.f12269a = null;
                } else {
                    oq1Var2.f12269a = n10.getString(a10);
                }
                if (!n10.isNull(a11)) {
                    string = n10.getString(a11);
                }
                oq1Var2.f12270b = string;
                oq1Var = oq1Var2;
            }
            return oq1Var;
        } finally {
            n10.close();
            j3.G();
        }
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        wl wlVar = (wl) this.f17701t;
        if (clVar.f9884u) {
            clVar.m();
            clVar.f9884u = false;
        }
        dl.F((dl) clVar.f9883t, wlVar);
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f17700s) {
            case 1:
                f00 f00Var = (f00) obj;
                g1.a("Releasing engine reference.");
                ((a00) this.f17701t).f5992v.k();
                return;
            case 2:
                ((wo0) obj).p0((pt0) this.f17701t);
                return;
            default:
                ((zq0) obj).y0((kk) this.f17701t);
                return;
        }
    }
}
