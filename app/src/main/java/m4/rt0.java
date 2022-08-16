package m4;

import android.content.Context;
import android.view.View;
import k4.a;
import l3.s;
import m3.p;

/* loaded from: classes.dex */
public final class rt0 implements mp0, p {

    /* renamed from: s */
    public final Context f13431s;

    /* renamed from: t */
    public final vd0 f13432t;

    /* renamed from: u */
    public final cm1 f13433u;

    /* renamed from: v */
    public final o90 f13434v;

    /* renamed from: w */
    public final zj f13435w;

    /* renamed from: x */
    public a f13436x;

    public rt0(Context context, vd0 vd0Var, cm1 cm1Var, o90 o90Var, zj zjVar) {
        this.f13431s = context;
        this.f13432t = vd0Var;
        this.f13433u = cm1Var;
        this.f13434v = o90Var;
        this.f13435w = zjVar;
    }

    @Override // m3.p
    public final void J3() {
    }

    @Override // m3.p
    public final void Z1() {
    }

    @Override // m3.p
    public final void a() {
        vd0 vd0Var;
        if (this.f13436x == null || (vd0Var = this.f13432t) == null) {
            return;
        }
        vd0Var.a("onSdkImpression", new r.a());
    }

    @Override // m3.p
    public final void b() {
    }

    @Override // m4.mp0
    public final void j() {
        z30 z30Var;
        a40 a40Var;
        zj zjVar = this.f13435w;
        if ((zjVar == zj.REWARD_BASED_VIDEO_AD || zjVar == zj.INTERSTITIAL || zjVar == zj.APP_OPEN) && this.f13433u.Q && this.f13432t != null) {
            s sVar = s.B;
            if (!sVar.f5807v.g0(this.f13431s)) {
                return;
            }
            o90 o90Var = this.f13434v;
            int i10 = o90Var.f12052t;
            int i11 = o90Var.f12053u;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i10);
            sb.append(".");
            sb.append(i11);
            String sb2 = sb.toString();
            String str = this.f13433u.S.c() + (-1) != 1 ? "javascript" : null;
            if (this.f13433u.S.c() == 1) {
                z30Var = z30.VIDEO;
                a40Var = a40.DEFINED_BY_JAVASCRIPT;
            } else {
                a40Var = this.f13433u.V == 2 ? a40.UNSPECIFIED : a40.BEGIN_TO_RENDER;
                z30Var = z30.HTML_DISPLAY;
            }
            a h02 = sVar.f5807v.h0(sb2, this.f13432t.E(), str, a40Var, z30Var, this.f13433u.f7051j0);
            this.f13436x = h02;
            if (h02 == null) {
                return;
            }
            sVar.f5807v.d0(h02, (View) this.f13432t);
            this.f13432t.I(this.f13436x);
            sVar.f5807v.b0(this.f13436x);
            this.f13432t.a("onSdkLoaded", new r.a());
        }
    }

    @Override // m3.p
    public final void v2() {
    }

    @Override // m3.p
    public final void w(int i10) {
        this.f13436x = null;
    }
}
