package m4;

import a6.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class aa1 implements kz1 {

    /* renamed from: s */
    public final /* synthetic */ long f6089s;

    /* renamed from: t */
    public final /* synthetic */ String f6090t;

    /* renamed from: u */
    public final /* synthetic */ cm1 f6091u;

    /* renamed from: v */
    public final /* synthetic */ em1 f6092v;

    /* renamed from: w */
    public final /* synthetic */ xp1 f6093w;

    /* renamed from: x */
    public final /* synthetic */ km1 f6094x;
    public final /* synthetic */ ba1 y;

    public aa1(ba1 ba1Var, long j3, String str, cm1 cm1Var, em1 em1Var, xp1 xp1Var, km1 km1Var) {
        this.y = ba1Var;
        this.f6089s = j3;
        this.f6090t = str;
        this.f6091u = cm1Var;
        this.f6092v = em1Var;
        this.f6093w = xp1Var;
        this.f6094x = km1Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        long b10 = this.y.f6427a.b() - this.f6089s;
        ba1.a(this.y, this.f6090t, 0, b10, this.f6091u.f7039d0);
        ba1 ba1Var = this.y;
        if (ba1Var.f6431e) {
            ba1Var.f6428b.b(this.f6092v, this.f6091u, 0, null, b10);
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8226w5)).booleanValue()) {
            this.y.f6432f.a(this.f6091u, b10, null);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        cn cnVar;
        long b10 = this.y.f6427a.b() - this.f6089s;
        int i10 = th instanceof TimeoutException ? 2 : th instanceof q91 ? 3 : th instanceof CancellationException ? 4 : th instanceof pm1 ? 5 : (!(th instanceof c31) || f.i(th).f7067s != 3) ? 6 : 1;
        ba1.a(this.y, this.f6090t, i10, b10, this.f6091u.f7039d0);
        ba1 ba1Var = this.y;
        if (ba1Var.f6431e) {
            ba1Var.f6428b.b(this.f6092v, this.f6091u, i10, th instanceof i71 ? (i71) th : null, b10);
        }
        yr<Boolean> yrVar = es.f8239y5;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            zp1 zp1Var = this.y.f6429c;
            xp1 xp1Var = this.f6093w;
            km1 km1Var = this.f6094x;
            cm1 cm1Var = this.f6091u;
            zp1Var.b(xp1Var.a(km1Var, cm1Var, cm1Var.f7057o));
        }
        if (((Boolean) joVar.f10148c.a(es.f8226w5)).booleanValue()) {
            cn i11 = f.i(th);
            int i12 = i11.f7067s;
            if ((i12 == 3 || i12 == 0) && (cnVar = i11.f7070v) != null && !cnVar.f7069u.equals("com.google.android.gms.ads")) {
                i11 = f.i(new i71(13, i11.f7070v));
            }
            this.y.f6432f.a(this.f6091u, b10, i11);
        }
    }
}
