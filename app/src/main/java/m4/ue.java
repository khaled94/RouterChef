package m4;

import android.net.Uri;
import android.os.Handler;
import n9.d;
import z3.v;

/* loaded from: classes.dex */
public final class ue implements ye, xe {
    public xe A;
    public boolean B;

    /* renamed from: s */
    public final Uri f14383s;

    /* renamed from: t */
    public final ag f14384t;

    /* renamed from: u */
    public final jc f14385u;

    /* renamed from: v */
    public final int f14386v;

    /* renamed from: w */
    public final Handler f14387w;

    /* renamed from: x */
    public final te f14388x;
    public final bb y = new bb();

    /* renamed from: z */
    public final int f14389z;

    public ue(Uri uri, ag agVar, jc jcVar, int i10, Handler handler, te teVar, int i11) {
        this.f14383s = uri;
        this.f14384t = agVar;
        this.f14385u = jcVar;
        this.f14386v = i10;
        this.f14387w = handler;
        this.f14388x = teVar;
        this.f14389z = i11;
    }

    @Override // m4.ye
    public final void a(we weVar) {
        se seVar = (se) weVar;
        v vVar = seVar.A;
        mg mgVar = seVar.f13614z;
        oe oeVar = new oe(seVar, vVar, 0);
        kg<? extends qe> kgVar = mgVar.f11183b;
        if (kgVar != null) {
            kgVar.a(true);
        }
        mgVar.f11182a.execute(oeVar);
        mgVar.f11182a.shutdown();
        seVar.E.removeCallbacksAndMessages(null);
        seVar.X = true;
    }

    @Override // m4.ye
    public final void b(na naVar, xe xeVar) {
        this.A = xeVar;
        xeVar.c(new jf(-9223372036854775807L));
    }

    @Override // m4.xe
    public final void c(db dbVar) {
        bb bbVar = this.y;
        boolean z10 = false;
        dbVar.d(0, bbVar, false);
        if (bbVar.f6436c != -9223372036854775807L) {
            z10 = true;
        }
        if (!this.B || z10) {
            this.B = z10;
            this.A.c(dbVar);
        }
    }

    @Override // m4.ye
    public final we d(int i10, eg egVar) {
        d.g(i10 == 0);
        return new se(this.f14383s, this.f14384t.mo26zza(), this.f14385u.mo14zza(), this.f14386v, this.f14387w, this.f14388x, this, egVar, this.f14389z);
    }

    @Override // m4.ye
    public final void g() {
        this.A = null;
    }

    @Override // m4.ye
    public final void zza() {
    }
}
