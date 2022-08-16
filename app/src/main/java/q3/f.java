package q3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m4.d00;
import m4.e00;
import m4.gg2;
import m4.lz;
import m4.v91;
import m4.z90;
import n3.g1;

/* loaded from: classes.dex */
public final class f implements e, z90, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f17145s;

    /* renamed from: t */
    public final Object f17146t;

    /* renamed from: u */
    public Object f17147u;

    public f() {
        this.f17145s = 2;
        this.f17146t = new HashMap();
    }

    public final synchronized Map a() {
        if (((Map) this.f17147u) == null) {
            this.f17147u = Collections.unmodifiableMap(new HashMap((Map) this.f17146t));
        }
        return (Map) this.f17147u;
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f17145s) {
            case 1:
                lz lzVar = (lz) obj;
                synchronized (((e00) this.f17147u).f7676a) {
                    Object obj2 = this.f17147u;
                    ((e00) obj2).f7682g = 0;
                    if (((e00) obj2).f7681f != null && ((d00) this.f17146t) != ((e00) obj2).f7681f) {
                        g1.a("New JS engine is loaded, marking previous one as destroyable.");
                        ((e00) this.f17147u).f7681f.i();
                    }
                    ((e00) this.f17147u).f7681f = (d00) this.f17146t;
                }
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i10) {
        this.f17145s = i10;
        this.f17146t = obj;
        this.f17147u = obj2;
    }

    public f(e00 e00Var, d00 d00Var) {
        this.f17145s = 1;
        this.f17147u = e00Var;
        this.f17146t = d00Var;
    }
}
