package u1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import l.a;
import t1.k;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: c */
    public final r<k.a> f18994c = new r<>();

    /* renamed from: d */
    public final e2.c<k.a.c> f18995d = new e2.c<>();

    public c() {
        a(k.f18478b);
    }

    public final void a(k.a aVar) {
        boolean z10;
        r<k.a> rVar = this.f18994c;
        synchronized (rVar.f1632a) {
            z10 = rVar.f1637f == LiveData.f1631k;
            rVar.f1637f = aVar;
        }
        if (z10) {
            a.h().j(rVar.f1641j);
        }
        if (aVar instanceof k.a.c) {
            this.f18995d.k((k.a.c) aVar);
        } else if (!(aVar instanceof k.a.C0116a)) {
        } else {
            this.f18995d.l(((k.a.C0116a) aVar).f18479a);
        }
    }
}
