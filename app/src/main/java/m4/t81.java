package m4;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d.d;
import l3.j;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class t81 implements qt0 {

    /* renamed from: s */
    public final Context f13959s;

    /* renamed from: t */
    public final o90 f13960t;

    /* renamed from: u */
    public final tz1<ys0> f13961u;

    /* renamed from: v */
    public final cm1 f13962v;

    /* renamed from: w */
    public final vd0 f13963w;

    /* renamed from: x */
    public final om1 f13964x;
    public final ox y;

    /* renamed from: z */
    public final boolean f13965z;

    public t81(Context context, o90 o90Var, tz1<ys0> tz1Var, cm1 cm1Var, vd0 vd0Var, om1 om1Var, boolean z10, ox oxVar) {
        this.f13959s = context;
        this.f13960t = o90Var;
        this.f13961u = tz1Var;
        this.f13962v = cm1Var;
        this.f13963w = vd0Var;
        this.f13964x = om1Var;
        this.y = oxVar;
        this.f13965z = z10;
    }

    @Override // m4.qt0
    public final void c(boolean z10, Context context, zo0 zo0Var) {
        ys0 ys0Var = (ys0) mz1.s(this.f13961u);
        this.f13963w.U(true);
        boolean c10 = this.f13965z ? this.y.c(false) : false;
        s1 s1Var = s.B.f5789c;
        j jVar = new j(c10, s1.k(this.f13959s), this.f13965z ? this.y.b() : false, this.f13965z ? this.y.a() : 0.0f, z10, this.f13962v.L, false);
        if (zo0Var != null) {
            zo0Var.O0();
        }
        lt0 p = ys0Var.p();
        vd0 vd0Var = this.f13963w;
        cm1 cm1Var = this.f13962v;
        int i10 = cm1Var.N;
        o90 o90Var = this.f13960t;
        String str = cm1Var.C;
        gm1 gm1Var = cm1Var.f7061t;
        d.e(context, new AdOverlayInfoParcel(p, vd0Var, i10, o90Var, str, jVar, gm1Var.f8967b, gm1Var.f8966a, this.f13964x.f12205f, zo0Var), true);
    }
}
