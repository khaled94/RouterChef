package m4;

import java.util.Map;
import n3.g1;
import n3.y0;

/* loaded from: classes.dex */
public final class xz implements lx<f00> {

    /* renamed from: s */
    public final /* synthetic */ lz f15496s;

    /* renamed from: t */
    public final /* synthetic */ y0 f15497t;

    /* renamed from: u */
    public final /* synthetic */ e00 f15498u;

    public xz(e00 e00Var, lz lzVar, y0 y0Var) {
        this.f15498u = e00Var;
        this.f15496s = lzVar;
        this.f15497t = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m4.lx] */
    @Override // m4.lx
    public final void a(f00 f00Var, Map map) {
        synchronized (this.f15498u.f7676a) {
            g1.i("JS Engine is requesting an update");
            if (this.f15498u.f7682g == 0) {
                g1.i("Starting reload.");
                e00 e00Var = this.f15498u;
                e00Var.f7682g = 2;
                e00Var.b();
            }
            this.f15496s.v0("/requestReload", this.f15497t.f16602t);
        }
    }
}
