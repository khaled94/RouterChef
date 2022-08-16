package m4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ej2 implements xj2 {

    /* renamed from: a */
    public final ArrayList<wj2> f7986a = new ArrayList<>(1);

    /* renamed from: b */
    public final HashSet<wj2> f7987b = new HashSet<>(1);

    /* renamed from: c */
    public final ek2 f7988c = new ek2();

    /* renamed from: d */
    public final wh2 f7989d = new wh2();

    /* renamed from: e */
    public Looper f7990e;

    /* renamed from: f */
    public z40 f7991f;

    @Override // m4.xj2
    public final void a(Handler handler, fk2 fk2Var) {
        this.f7988c.f7997c.add(new dk2(handler, fk2Var));
    }

    @Override // m4.xj2
    public final void b(Handler handler, xh2 xh2Var) {
        this.f7989d.f15028c.add(new vh2(xh2Var));
    }

    @Override // m4.xj2
    public final void c(wj2 wj2Var, i01 i01Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f7990e;
        r01.f(looper == null || looper == myLooper);
        z40 z40Var = this.f7991f;
        this.f7986a.add(wj2Var);
        if (this.f7990e == null) {
            this.f7990e = myLooper;
            this.f7987b.add(wj2Var);
            m(i01Var);
        } else if (z40Var == null) {
        } else {
            h(wj2Var);
            wj2Var.a(this, z40Var);
        }
    }

    @Override // m4.xj2
    public final void e(wj2 wj2Var) {
        this.f7986a.remove(wj2Var);
        if (!this.f7986a.isEmpty()) {
            j(wj2Var);
            return;
        }
        this.f7990e = null;
        this.f7991f = null;
        this.f7987b.clear();
        o();
    }

    @Override // m4.xj2
    public final void f(fk2 fk2Var) {
        ek2 ek2Var = this.f7988c;
        Iterator<dk2> it = ek2Var.f7997c.iterator();
        while (it.hasNext()) {
            dk2 next = it.next();
            if (next.f7544b == fk2Var) {
                ek2Var.f7997c.remove(next);
            }
        }
    }

    @Override // m4.xj2
    public final void g(xh2 xh2Var) {
        wh2 wh2Var = this.f7989d;
        Iterator<vh2> it = wh2Var.f15028c.iterator();
        while (it.hasNext()) {
            vh2 next = it.next();
            if (next.f14695a == xh2Var) {
                wh2Var.f15028c.remove(next);
            }
        }
    }

    @Override // m4.xj2
    public final void h(wj2 wj2Var) {
        Objects.requireNonNull(this.f7990e);
        boolean isEmpty = this.f7987b.isEmpty();
        this.f7987b.add(wj2Var);
        if (isEmpty) {
            l();
        }
    }

    @Override // m4.xj2
    public final void j(wj2 wj2Var) {
        boolean isEmpty = this.f7987b.isEmpty();
        this.f7987b.remove(wj2Var);
        if (!(!isEmpty) || !this.f7987b.isEmpty()) {
            return;
        }
        k();
    }

    public void k() {
    }

    public void l() {
    }

    public abstract void m(i01 i01Var);

    public final void n(z40 z40Var) {
        this.f7991f = z40Var;
        ArrayList<wj2> arrayList = this.f7986a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this, z40Var);
        }
    }

    public abstract void o();

    @Override // m4.xj2
    public final /* synthetic */ void r() {
    }

    @Override // m4.xj2
    public final /* synthetic */ void t() {
    }
}
