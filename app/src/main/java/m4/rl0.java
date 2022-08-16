package m4;

import android.content.Context;
import android.view.View;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import l3.s;

/* loaded from: classes.dex */
public final class rl0 implements mp0, ep0 {

    /* renamed from: s */
    public final Context f13383s;

    /* renamed from: t */
    public final vd0 f13384t;

    /* renamed from: u */
    public final cm1 f13385u;

    /* renamed from: v */
    public final o90 f13386v;
    @GuardedBy("this")

    /* renamed from: w */
    public a f13387w;
    @GuardedBy("this")

    /* renamed from: x */
    public boolean f13388x;

    public rl0(Context context, vd0 vd0Var, cm1 cm1Var, o90 o90Var) {
        this.f13383s = context;
        this.f13384t = vd0Var;
        this.f13385u = cm1Var;
        this.f13386v = o90Var;
    }

    public final synchronized void a() {
        z30 z30Var;
        a40 a40Var;
        if (!this.f13385u.Q) {
            return;
        }
        if (this.f13384t == null) {
            return;
        }
        s sVar = s.B;
        if (!sVar.f5807v.g0(this.f13383s)) {
            return;
        }
        o90 o90Var = this.f13386v;
        int i10 = o90Var.f12052t;
        int i11 = o90Var.f12053u;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i10);
        sb.append(".");
        sb.append(i11);
        String sb2 = sb.toString();
        String str = this.f13385u.S.c() + (-1) != 1 ? "javascript" : null;
        if (this.f13385u.S.c() == 1) {
            z30Var = z30.VIDEO;
            a40Var = a40.DEFINED_BY_JAVASCRIPT;
        } else {
            z30Var = z30.HTML_DISPLAY;
            a40Var = this.f13385u.f7042f == 1 ? a40.ONE_PIXEL : a40.BEGIN_TO_RENDER;
        }
        a h02 = sVar.f5807v.h0(sb2, this.f13384t.E(), str, a40Var, z30Var, this.f13385u.f7051j0);
        this.f13387w = h02;
        vd0 vd0Var = this.f13384t;
        if (h02 == null) {
            return;
        }
        sVar.f5807v.d0(h02, (View) vd0Var);
        this.f13384t.I(this.f13387w);
        sVar.f5807v.b0(this.f13387w);
        this.f13388x = true;
        this.f13384t.a("onSdkLoaded", new r.a());
    }

    @Override // m4.mp0
    public final synchronized void j() {
        if (this.f13388x) {
            return;
        }
        a();
    }

    @Override // m4.ep0
    public final synchronized void l() {
        vd0 vd0Var;
        if (!this.f13388x) {
            a();
        }
        if (!this.f13385u.Q || this.f13387w == null || (vd0Var = this.f13384t) == null) {
            return;
        }
        vd0Var.a("onSdkImpression", new r.a());
    }
}
