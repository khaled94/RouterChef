package m4;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import l3.s;

/* loaded from: classes.dex */
public final class by0 {

    /* renamed from: a */
    public final om1 f6645a;

    /* renamed from: b */
    public final Executor f6646b;

    /* renamed from: c */
    public final yz0 f6647c;

    /* renamed from: d */
    public final az0 f6648d;

    /* renamed from: e */
    public final Context f6649e;

    /* renamed from: f */
    public final f11 f6650f;

    /* renamed from: g */
    public final ep1 f6651g;

    /* renamed from: h */
    public final zp1 f6652h;

    /* renamed from: i */
    public final v61 f6653i;

    public by0(om1 om1Var, Executor executor, yz0 yz0Var, Context context, f11 f11Var, ep1 ep1Var, zp1 zp1Var, v61 v61Var, az0 az0Var) {
        this.f6645a = om1Var;
        this.f6646b = executor;
        this.f6647c = yz0Var;
        this.f6649e = context;
        this.f6650f = f11Var;
        this.f6651g = ep1Var;
        this.f6652h = zp1Var;
        this.f6653i = v61Var;
        this.f6648d = az0Var;
    }

    public static final void b(vd0 vd0Var) {
        he0 he0Var = (he0) vd0Var;
        he0Var.D0("/videoClicked", kx.f10598d);
        ce0 ce0Var = (ce0) he0Var.q0();
        synchronized (ce0Var.f6795v) {
            ce0Var.G = true;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8075d2)).booleanValue()) {
            he0Var.D0("/getNativeAdViewSignals", kx.f10608n);
        }
        he0Var.D0("/getNativeClickMeta", kx.f10609o);
    }

    public final void a(vd0 vd0Var) {
        b(vd0Var);
        he0 he0Var = (he0) vd0Var;
        he0Var.D0("/video", kx.f10601g);
        he0Var.D0("/videoMeta", kx.f10602h);
        he0Var.D0("/precache", new ex(1));
        he0Var.D0("/delayPageLoaded", kx.f10605k);
        he0Var.D0("/instrument", kx.f10603i);
        he0Var.D0("/log", kx.f10597c);
        he0Var.D0("/click", new pw(null));
        if (this.f6645a.f12201b != null) {
            ce0 ce0Var = (ce0) he0Var.q0();
            synchronized (ce0Var.f6795v) {
                ce0Var.H = true;
            }
            he0Var.D0("/open", new wx(null, null, null, null, null));
        } else {
            ce0 ce0Var2 = (ce0) he0Var.q0();
            synchronized (ce0Var2.f6795v) {
                ce0Var2.H = false;
            }
        }
        View view = (View) vd0Var;
        if (s.B.f5809x.l(view.getContext())) {
            he0Var.D0("/logScionEvent", new qx(view.getContext()));
        }
    }
}
