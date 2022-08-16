package m4;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ek2 {

    /* renamed from: a */
    public final int f7995a;

    /* renamed from: b */
    public final uj2 f7996b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<dk2> f7997c;

    public ek2() {
        this.f7997c = new CopyOnWriteArrayList<>();
        this.f7995a = 0;
        this.f7996b = null;
    }

    public ek2(CopyOnWriteArrayList copyOnWriteArrayList, int i10, uj2 uj2Var) {
        this.f7997c = copyOnWriteArrayList;
        this.f7995a = i10;
        this.f7996b = uj2Var;
    }

    public static final long g(long j3) {
        long c10 = xf2.c(j3);
        if (c10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return c10;
    }

    public final ek2 a(int i10, uj2 uj2Var) {
        return new ek2(this.f7997c, i10, uj2Var);
    }

    public final void b(final w3 w3Var) {
        Iterator<dk2> it = this.f7997c.iterator();
        while (it.hasNext()) {
            dk2 next = it.next();
            final fk2 fk2Var = next.f7544b;
            ls1.i(next.f7543a, new Runnable() { // from class: m4.ck2
                @Override // java.lang.Runnable
                public final void run() {
                    ek2 ek2Var = ek2.this;
                    fk2Var.e(ek2Var.f7995a, ek2Var.f7996b, w3Var);
                }
            });
        }
    }

    public final void c(final nj2 nj2Var, final w3 w3Var) {
        Iterator<dk2> it = this.f7997c.iterator();
        while (it.hasNext()) {
            dk2 next = it.next();
            final fk2 fk2Var = next.f7544b;
            ls1.i(next.f7543a, new Runnable() { // from class: m4.yj2
                @Override // java.lang.Runnable
                public final void run() {
                    ek2 ek2Var = ek2.this;
                    fk2Var.r(ek2Var.f7995a, ek2Var.f7996b, nj2Var, w3Var);
                }
            });
        }
    }

    public final void d(final nj2 nj2Var, final w3 w3Var) {
        Iterator<dk2> it = this.f7997c.iterator();
        while (it.hasNext()) {
            dk2 next = it.next();
            final fk2 fk2Var = next.f7544b;
            ls1.i(next.f7543a, new Runnable() { // from class: m4.zj2
                @Override // java.lang.Runnable
                public final void run() {
                    ek2 ek2Var = ek2.this;
                    fk2Var.B(ek2Var.f7995a, ek2Var.f7996b, nj2Var, w3Var);
                }
            });
        }
    }

    public final void e(final nj2 nj2Var, final w3 w3Var, final IOException iOException, final boolean z10) {
        Iterator<dk2> it = this.f7997c.iterator();
        while (it.hasNext()) {
            dk2 next = it.next();
            final fk2 fk2Var = next.f7544b;
            ls1.i(next.f7543a, new Runnable() { // from class: m4.bk2
                @Override // java.lang.Runnable
                public final void run() {
                    ek2 ek2Var = ek2.this;
                    fk2Var.v(ek2Var.f7995a, ek2Var.f7996b, nj2Var, w3Var, iOException, z10);
                }
            });
        }
    }

    public final void f(final nj2 nj2Var, final w3 w3Var) {
        Iterator<dk2> it = this.f7997c.iterator();
        while (it.hasNext()) {
            dk2 next = it.next();
            final fk2 fk2Var = next.f7544b;
            ls1.i(next.f7543a, new Runnable() { // from class: m4.ak2
                @Override // java.lang.Runnable
                public final void run() {
                    ek2 ek2Var = ek2.this;
                    fk2Var.u(ek2Var.f7995a, ek2Var.f7996b, nj2Var, w3Var);
                }
            });
        }
    }
}
