package m4;

import n3.i1;

/* loaded from: classes.dex */
public final class h61 implements mp0, vo0 {

    /* renamed from: u */
    public static final Object f9116u = new Object();

    /* renamed from: v */
    public static int f9117v;

    /* renamed from: s */
    public final i1 f9118s;

    /* renamed from: t */
    public final o61 f9119t;

    public h61(o61 o61Var, i1 i1Var) {
        this.f9119t = o61Var;
        this.f9118s = i1Var;
    }

    public final void a(boolean z10) {
        int i10;
        int intValue;
        yr<Boolean> yrVar = es.Z3;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && !this.f9118s.J()) {
            Object obj = f9116u;
            synchronized (obj) {
                i10 = f9117v;
                intValue = ((Integer) joVar.f10148c.a(es.f8054a4)).intValue();
            }
            if (i10 >= intValue) {
                return;
            }
            o61 o61Var = this.f9119t;
            mz1.t(o61Var.f12006b.a(), new n61(o61Var, z10), u90.f14299f);
            synchronized (obj) {
                f9117v++;
            }
        }
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        a(false);
    }

    @Override // m4.mp0
    public final void j() {
        a(true);
    }
}
