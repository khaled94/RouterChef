package m4;

import a6.f;
import android.net.Uri;
import d.d;
import h2.i;
import java.util.Objects;
import n3.m0;

/* loaded from: classes.dex */
public final class tk2 extends ej2 {

    /* renamed from: g */
    public final gi f14086g;

    /* renamed from: h */
    public final fg f14087h;

    /* renamed from: i */
    public final yp0 f14088i;

    /* renamed from: j */
    public final ai2 f14089j;

    /* renamed from: k */
    public final int f14090k;

    /* renamed from: l */
    public boolean f14091l = true;

    /* renamed from: m */
    public long f14092m = -9223372036854775807L;

    /* renamed from: n */
    public boolean f14093n;

    /* renamed from: o */
    public boolean f14094o;
    public i01 p;

    /* renamed from: q */
    public final m0 f14095q;

    /* renamed from: r */
    public final d f14096r;

    public /* synthetic */ tk2(gi giVar, yp0 yp0Var, m0 m0Var, d dVar, int i10) {
        f fVar = ai2.f6171d;
        fg fgVar = giVar.f8935b;
        Objects.requireNonNull(fgVar);
        this.f14087h = fgVar;
        this.f14086g = giVar;
        this.f14088i = yp0Var;
        this.f14095q = m0Var;
        this.f14089j = fVar;
        this.f14096r = dVar;
        this.f14090k = i10;
    }

    @Override // m4.xj2
    public final void d(tj2 tj2Var) {
        yk2[] yk2VarArr;
        pk2 pk2Var = (pk2) tj2Var;
        if (pk2Var.K) {
            for (yk2 yk2Var : pk2Var.H) {
                yk2Var.k();
                if (yk2Var.A != null) {
                    yk2Var.A = null;
                    yk2Var.f15812f = null;
                }
            }
        }
        cn2 cn2Var = pk2Var.f12553z;
        ym2<? extends lk2> ym2Var = cn2Var.f7081b;
        if (ym2Var != null) {
            ym2Var.a(true);
        }
        cn2Var.f7080a.execute(new i(pk2Var, 4));
        cn2Var.f7080a.shutdown();
        pk2Var.E.removeCallbacksAndMessages(null);
        pk2Var.F = null;
        pk2Var.f12545a0 = true;
    }

    @Override // m4.xj2
    public final tj2 i(uj2 uj2Var, pm2 pm2Var, long j3) {
        kq0 mo28zza = this.f14088i.mo28zza();
        i01 i01Var = this.p;
        if (i01Var != null) {
            mo28zza.f(i01Var);
        }
        Uri uri = this.f14087h.f11167a;
        q72 q72Var = new q72((yo2) this.f14095q.f16526s);
        ai2 ai2Var = this.f14089j;
        wh2 a10 = this.f7989d.a(0, uj2Var);
        ek2 a11 = this.f7988c.a(0, uj2Var);
        Objects.requireNonNull(this.f14087h);
        return new pk2(uri, mo28zza, q72Var, ai2Var, a10, a11, this, pm2Var, this.f14090k);
    }

    @Override // m4.ej2
    public final void m(i01 i01Var) {
        this.p = i01Var;
        s();
    }

    @Override // m4.ej2
    public final void o() {
    }

    public final void p(long j3, boolean z10, boolean z11) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f14092m;
        }
        if (!this.f14091l && this.f14092m == j3 && this.f14093n == z10 && this.f14094o == z11) {
            return;
        }
        this.f14092m = j3;
        this.f14093n = z10;
        this.f14094o = z11;
        this.f14091l = false;
        s();
    }

    @Override // m4.xj2
    public final void q() {
    }

    public final void s() {
        long j3 = this.f14092m;
        boolean z10 = this.f14093n;
        boolean z11 = this.f14094o;
        gi giVar = this.f14086g;
        z40 cl2Var = new cl2(j3, j3, z10, giVar, z11 ? giVar.f8936c : null);
        if (this.f14091l) {
            cl2Var = new rk2(cl2Var);
        }
        n(cl2Var);
    }

    @Override // m4.xj2
    public final gi u() {
        return this.f14086g;
    }
}
