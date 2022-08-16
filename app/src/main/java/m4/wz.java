package m4;

import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class wz implements lx<f00> {

    /* renamed from: s */
    public final /* synthetic */ d00 f15149s;

    /* renamed from: t */
    public final /* synthetic */ lz f15150t;

    /* renamed from: u */
    public final /* synthetic */ e00 f15151u;

    public wz(e00 e00Var, d00 d00Var, lz lzVar) {
        this.f15151u = e00Var;
        this.f15149s = d00Var;
        this.f15150t = lzVar;
    }

    @Override // m4.lx
    public final void a(f00 f00Var, Map map) {
        synchronized (this.f15151u.f7676a) {
            if (this.f15149s.c() != -1 && this.f15149s.c() != 1) {
                this.f15151u.f7682g = 0;
                lz lzVar = this.f15150t;
                lzVar.l0("/log", kx.f10597c);
                lzVar.l0("/result", kx.f10604j);
                d00 d00Var = this.f15149s;
                ((w90) d00Var.f6087s).a(this.f15150t);
                this.f15151u.f7681f = this.f15149s;
                g1.a("Successfully loaded JS Engine.");
            }
        }
    }
}
