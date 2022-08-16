package m4;

import c5.f;
import c5.i;
import c5.v;
import m3.a;
import y4.j;
import y4.k3;

/* loaded from: classes.dex */
public final class jh implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10061s;

    /* renamed from: t */
    public final /* synthetic */ Object f10062t;

    /* renamed from: u */
    public final /* synthetic */ Object f10063u;

    public /* synthetic */ jh(Object obj, Object obj2, int i10) {
        this.f10061s = i10;
        this.f10063u = obj;
        this.f10062t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10061s) {
            case 0:
                va0 va0Var = ((dc0) ((mh) ((lh) this.f10063u).f10839c)).E;
                if (va0Var == null) {
                    return;
                }
                va0Var.q();
                return;
            case 1:
                lz lzVar = (lz) this.f10063u;
                lzVar.v0("/result", kx.f10604j);
                lzVar.c();
                return;
            case 2:
                ((k3) this.f10062t).d();
                if (a.b()) {
                    ((k3) this.f10062t).B().q(this);
                    return;
                }
                boolean z10 = ((j) this.f10063u).f20516c != 0;
                ((j) this.f10063u).f20516c = 0L;
                if (!z10) {
                    return;
                }
                ((j) this.f10063u).b();
                return;
            default:
                synchronized (((v) this.f10063u).f2805t) {
                    f<? super TResult> fVar = ((v) this.f10063u).f2806u;
                    if (fVar != 0) {
                        fVar.c(((i) this.f10062t).j());
                    }
                }
                return;
        }
    }

    public /* synthetic */ jh(c00 c00Var, lz lzVar) {
        this.f10061s = 1;
        this.f10062t = c00Var;
        this.f10063u = lzVar;
    }
}
