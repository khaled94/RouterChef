package m4;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d.d;
import l3.j;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class q71 implements qt0 {

    /* renamed from: s */
    public final o90 f12724s;

    /* renamed from: t */
    public final tz1<yj0> f12725t;

    /* renamed from: u */
    public final cm1 f12726u;

    /* renamed from: v */
    public final vd0 f12727v;

    /* renamed from: w */
    public final om1 f12728w;

    /* renamed from: x */
    public final ox f12729x;
    public final boolean y;

    public q71(o90 o90Var, tz1<yj0> tz1Var, cm1 cm1Var, vd0 vd0Var, om1 om1Var, boolean z10, ox oxVar) {
        this.f12724s = o90Var;
        this.f12725t = tz1Var;
        this.f12726u = cm1Var;
        this.f12727v = vd0Var;
        this.f12728w = om1Var;
        this.y = z10;
        this.f12729x = oxVar;
    }

    @Override // m4.qt0
    public final void c(boolean z10, Context context, zo0 zo0Var) {
        yj0 yj0Var = (yj0) mz1.s(this.f12725t);
        this.f12727v.U(true);
        j jVar = new j(this.y ? this.f12729x.c(true) : true, true, this.y ? this.f12729x.b() : false, this.y ? this.f12729x.a() : 0.0f, z10, this.f12726u.L, false);
        if (zo0Var != null) {
            zo0Var.O0();
        }
        d dVar = s.B.f5788b;
        lt0 o10 = yj0Var.o();
        vd0 vd0Var = this.f12727v;
        int i10 = this.f12726u.N;
        if (i10 == -1) {
            un unVar = this.f12728w.f12209j;
            if (unVar != null) {
                int i11 = unVar.f14459s;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                }
            }
            g1.e("Error setting app open orientation; no targeting orientation available.");
            i10 = this.f12726u.N;
        }
        int i12 = i10;
        o90 o90Var = this.f12724s;
        cm1 cm1Var = this.f12726u;
        String str = cm1Var.C;
        gm1 gm1Var = cm1Var.f7061t;
        d.e(context, new AdOverlayInfoParcel(o10, vd0Var, i12, o90Var, str, jVar, gm1Var.f8967b, gm1Var.f8966a, this.f12728w.f12205f, zo0Var), true);
    }
}
