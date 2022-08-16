package m4;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l3.b;
import m3.x;
import s3.f;

/* loaded from: classes.dex */
public final class xz0 {

    /* renamed from: a */
    public final ro0 f15499a;

    /* renamed from: b */
    public final hs0 f15500b;

    /* renamed from: c */
    public final ip0 f15501c;

    /* renamed from: d */
    public final rp0 f15502d;

    /* renamed from: e */
    public final wp0 f15503e;

    /* renamed from: f */
    public final vq0 f15504f;

    /* renamed from: g */
    public final Executor f15505g;

    /* renamed from: h */
    public final fs0 f15506h;

    /* renamed from: i */
    public final dj0 f15507i;

    /* renamed from: j */
    public final b f15508j;

    /* renamed from: k */
    public final g70 f15509k;

    /* renamed from: l */
    public final w7 f15510l;

    /* renamed from: m */
    public final qq0 f15511m;

    /* renamed from: n */
    public final v61 f15512n;

    /* renamed from: o */
    public final zp1 f15513o;
    public final f11 p;

    /* renamed from: q */
    public final ep1 f15514q;

    public xz0(ro0 ro0Var, ip0 ip0Var, rp0 rp0Var, wp0 wp0Var, vq0 vq0Var, Executor executor, fs0 fs0Var, dj0 dj0Var, b bVar, g70 g70Var, w7 w7Var, qq0 qq0Var, v61 v61Var, zp1 zp1Var, f11 f11Var, ep1 ep1Var, hs0 hs0Var) {
        this.f15499a = ro0Var;
        this.f15501c = ip0Var;
        this.f15502d = rp0Var;
        this.f15503e = wp0Var;
        this.f15504f = vq0Var;
        this.f15505g = executor;
        this.f15506h = fs0Var;
        this.f15507i = dj0Var;
        this.f15508j = bVar;
        this.f15509k = g70Var;
        this.f15510l = w7Var;
        this.f15511m = qq0Var;
        this.f15512n = v61Var;
        this.f15513o = zp1Var;
        this.p = f11Var;
        this.f15514q = ep1Var;
        this.f15500b = hs0Var;
    }

    public static final tz1<?> b(vd0 vd0Var, String str, String str2) {
        w90 w90Var = new w90();
        he0 he0Var = (he0) vd0Var;
        ((ce0) he0Var.q0()).y = new f(w90Var, 4);
        he0Var.C0(str, str2);
        return w90Var;
    }

    public final void a(final vd0 vd0Var, boolean z10, ox oxVar) {
        s7 s7Var;
        he0 he0Var = (he0) vd0Var;
        ((ce0) he0Var.q0()).c(new ym() { // from class: m4.tz0
            @Override // m4.ym
            public final void N() {
                xz0.this.f15499a.N();
            }
        }, this.f15502d, this.f15503e, new nw() { // from class: m4.uz0
            @Override // m4.nw
            public final void d0(String str, String str2) {
                xz0.this.f15504f.d0(str, str2);
            }
        }, new x() { // from class: m4.wz0
            @Override // m3.x
            public final void e() {
                xz0.this.f15501c.a();
            }
        }, z10, oxVar, this.f15508j, new e7(this, 4), this.f15509k, this.f15512n, this.f15513o, this.p, this.f15514q, null, this.f15500b);
        vd0Var.setOnTouchListener(new View.OnTouchListener() { // from class: m4.rz0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                xz0.this.f15508j.f5746b = true;
                return false;
            }
        });
        vd0Var.setOnClickListener(new View.OnClickListener() { // from class: m4.pz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xz0.this.f15508j.f5746b = true;
            }
        });
        if (((Boolean) jo.f10145d.f10148c.a(es.G1)).booleanValue() && (s7Var = this.f15510l.f14875b) != null) {
            s7Var.b((View) vd0Var);
        }
        this.f15506h.I0(vd0Var, this.f15505g);
        this.f15506h.I0(new rh() { // from class: m4.sz0
            @Override // m4.rh
            public final void x(qh qhVar) {
                af0 q02 = vd0.this.q0();
                Rect rect = qhVar.f12860d;
                ((ce0) q02).r(rect.left, rect.top);
            }
        }, this.f15505g);
        this.f15506h.O0((View) vd0Var);
        he0Var.D0("/trackActiveViewUnit", new lx() { // from class: m4.vz0
            /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashSet, java.util.Set<m4.vd0>] */
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                xz0 xz0Var = xz0.this;
                vd0 vd0Var2 = vd0Var;
                vd0 vd0Var3 = (vd0) obj;
                dj0 dj0Var = xz0Var.f15507i;
                synchronized (dj0Var) {
                    dj0Var.f7522u.add(vd0Var2);
                    yi0 yi0Var = dj0Var.f7520s;
                    vd0Var2.D0("/updateActiveView", yi0Var.f15792e);
                    vd0Var2.D0("/untrackActiveViewUnit", yi0Var.f15793f);
                }
            }
        });
        dj0 dj0Var = this.f15507i;
        Objects.requireNonNull(dj0Var);
        dj0Var.B = new WeakReference<>(vd0Var);
    }
}
