package m4;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import n3.g1;

/* loaded from: classes.dex */
public final class dw0 {

    /* renamed from: a */
    public final yz0 f7653a;

    /* renamed from: b */
    public final ty0 f7654b;

    /* renamed from: c */
    public final lj0 f7655c;

    /* renamed from: d */
    public final jv0 f7656d;

    public dw0(yz0 yz0Var, ty0 ty0Var, lj0 lj0Var, jv0 jv0Var) {
        this.f7653a = yz0Var;
        this.f7654b = ty0Var;
        this.f7655c = lj0Var;
        this.f7656d = jv0Var;
    }

    public final View a() {
        vd0 a10 = this.f7653a.a(on.s(), null, null);
        View view = (View) a10;
        view.setVisibility(8);
        he0 he0Var = (he0) a10;
        he0Var.D0("/sendMessageToSdk", new lx() { // from class: m4.yv0
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                vd0 vd0Var = (vd0) obj;
                dw0.this.f7654b.b(map);
            }
        });
        he0Var.D0("/adMuted", new zv0(this, 0));
        this.f7654b.d(new WeakReference(a10), "/loadHtml", new aw0(this, 0));
        this.f7654b.d(new WeakReference(a10), "/showOverlay", new lx() { // from class: m4.bw0
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                dw0 dw0Var = dw0.this;
                Objects.requireNonNull(dw0Var);
                g1.i("Showing native ads overlay.");
                ((vd0) obj).A().setVisibility(0);
                dw0Var.f7655c.f10878x = true;
            }
        });
        this.f7654b.d(new WeakReference(a10), "/hideOverlay", new lx() { // from class: m4.cw0
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                dw0 dw0Var = dw0.this;
                Objects.requireNonNull(dw0Var);
                g1.i("Hiding native ads overlay.");
                ((vd0) obj).A().setVisibility(8);
                dw0Var.f7655c.f10878x = false;
            }
        });
        return view;
    }
}
