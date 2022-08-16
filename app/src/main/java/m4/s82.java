package m4;

import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class s82 {

    /* renamed from: a */
    public final r82 f13548a;

    /* renamed from: b */
    public int f13549b;

    /* renamed from: c */
    public int f13550c;

    /* renamed from: d */
    public int f13551d = 0;

    public s82(r82 r82Var) {
        Charset charset = v92.f14624a;
        this.f13548a = r82Var;
        r82Var.f13198b = this;
    }

    public static final void t(int i10) {
        if ((i10 & 3) == 0) {
            return;
        }
        throw x92.g();
    }

    public static final void u(int i10) {
        if ((i10 & 7) == 0) {
            return;
        }
        throw x92.g();
    }

    public final int A() {
        s(0);
        return this.f13548a.n();
    }

    public final int B() {
        s(5);
        return this.f13548a.o();
    }

    public final int C() {
        s(0);
        return this.f13548a.p();
    }

    public final int D() {
        s(0);
        return this.f13548a.r();
    }

    public final long E() {
        s(1);
        return this.f13548a.s();
    }

    public final long F() {
        s(0);
        return this.f13548a.t();
    }

    public final long G() {
        s(1);
        return this.f13548a.u();
    }

    public final long H() {
        s(0);
        return this.f13548a.v();
    }

    public final long I() {
        s(0);
        return this.f13548a.w();
    }

    public final n82 J() {
        s(2);
        return this.f13548a.x();
    }

    public final <T> T K(eb2<T> eb2Var, z82 z82Var) {
        s(3);
        return (T) p(eb2Var, z82Var);
    }

    public final <T> T L(eb2<T> eb2Var, z82 z82Var) {
        s(2);
        return (T) q(eb2Var, z82Var);
    }

    public final void M(List<Boolean> list) {
        int q10;
        int q11;
        if (!(list instanceof g82)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f13548a.c()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Boolean.valueOf(this.f13548a.c()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        g82 g82Var = (g82) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                g82Var.e(this.f13548a.c());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                g82Var.e(this.f13548a.c());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final void N(List<n82> list) {
        int q10;
        if ((this.f13549b & 7) == 2) {
            do {
                list.add(J());
                if (this.f13548a.b()) {
                    return;
                }
                q10 = this.f13548a.q();
            } while (q10 == this.f13549b);
            this.f13551d = q10;
            return;
        }
        throw x92.a();
    }

    public final void O(List<Double> list) {
        int q10;
        int q11;
        if (!(list instanceof x82)) {
            int i10 = this.f13549b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f13548a.h()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int r10 = this.f13548a.r();
                u(r10);
                int j3 = this.f13548a.j() + r10;
                do {
                    list.add(Double.valueOf(this.f13548a.h()));
                } while (this.f13548a.j() < j3);
                return;
            }
        }
        x82 x82Var = (x82) list;
        int i11 = this.f13549b & 7;
        if (i11 == 1) {
            do {
                x82Var.e(this.f13548a.h());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int r11 = this.f13548a.r();
            u(r11);
            int j10 = this.f13548a.j() + r11;
            do {
                x82Var.e(this.f13548a.h());
            } while (this.f13548a.j() < j10);
        }
    }

    public final void P(List<Integer> list) {
        int q10;
        int q11;
        if (!(list instanceof n92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13548a.l()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Integer.valueOf(this.f13548a.l()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        n92 n92Var = (n92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                n92Var.h(this.f13548a.l());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                n92Var.h(this.f13548a.l());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final void Q(List<Integer> list) {
        int q10;
        int q11;
        if (!(list instanceof n92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 2) {
                int r10 = this.f13548a.r();
                t(r10);
                int j3 = this.f13548a.j() + r10;
                do {
                    list.add(Integer.valueOf(this.f13548a.m()));
                } while (this.f13548a.j() < j3);
                return;
            } else if (i10 != 5) {
                throw x92.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.f13548a.m()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            }
        }
        n92 n92Var = (n92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 2) {
            int r11 = this.f13548a.r();
            t(r11);
            int j10 = this.f13548a.j() + r11;
            do {
                n92Var.h(this.f13548a.m());
            } while (this.f13548a.j() < j10);
        } else if (i11 != 5) {
            throw x92.a();
        } else {
            do {
                n92Var.h(this.f13548a.m());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        }
    }

    public final void a(List<Long> list) {
        int q10;
        int q11;
        if (!(list instanceof ga2)) {
            int i10 = this.f13549b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f13548a.s()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int r10 = this.f13548a.r();
                u(r10);
                int j3 = this.f13548a.j() + r10;
                do {
                    list.add(Long.valueOf(this.f13548a.s()));
                } while (this.f13548a.j() < j3);
                return;
            }
        }
        ga2 ga2Var = (ga2) list;
        int i11 = this.f13549b & 7;
        if (i11 == 1) {
            do {
                ga2Var.h(this.f13548a.s());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int r11 = this.f13548a.r();
            u(r11);
            int j10 = this.f13548a.j() + r11;
            do {
                ga2Var.h(this.f13548a.s());
            } while (this.f13548a.j() < j10);
        }
    }

    public final void b(List<Float> list) {
        int q10;
        int q11;
        if (!(list instanceof g92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 2) {
                int r10 = this.f13548a.r();
                t(r10);
                int j3 = this.f13548a.j() + r10;
                do {
                    list.add(Float.valueOf(this.f13548a.i()));
                } while (this.f13548a.j() < j3);
                return;
            } else if (i10 != 5) {
                throw x92.a();
            } else {
                do {
                    list.add(Float.valueOf(this.f13548a.i()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            }
        }
        g92 g92Var = (g92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 2) {
            int r11 = this.f13548a.r();
            t(r11);
            int j10 = this.f13548a.j() + r11;
            do {
                g92Var.e(this.f13548a.i());
            } while (this.f13548a.j() < j10);
        } else if (i11 != 5) {
            throw x92.a();
        } else {
            do {
                g92Var.e(this.f13548a.i());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(List<T> list, eb2<T> eb2Var, z82 z82Var) {
        int q10;
        int i10 = this.f13549b;
        if ((i10 & 7) != 3) {
            int i11 = x92.f15256t;
            throw new w92();
        }
        do {
            list.add(p(eb2Var, z82Var));
            if (this.f13548a.b() || this.f13551d != 0) {
                return;
            }
            q10 = this.f13548a.q();
        } while (q10 == i10);
        this.f13551d = q10;
    }

    public final void d(List<Integer> list) {
        int q10;
        int q11;
        if (!(list instanceof n92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13548a.n()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Integer.valueOf(this.f13548a.n()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        n92 n92Var = (n92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                n92Var.h(this.f13548a.n());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                n92Var.h(this.f13548a.n());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final void e(List<Long> list) {
        int q10;
        int q11;
        if (!(list instanceof ga2)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f13548a.t()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Long.valueOf(this.f13548a.t()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        ga2 ga2Var = (ga2) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                ga2Var.h(this.f13548a.t());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                ga2Var.h(this.f13548a.t());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void f(List<T> list, eb2<T> eb2Var, z82 z82Var) {
        int q10;
        int i10 = this.f13549b;
        if ((i10 & 7) != 2) {
            int i11 = x92.f15256t;
            throw new w92();
        }
        do {
            list.add(q(eb2Var, z82Var));
            if (this.f13548a.b() || this.f13551d != 0) {
                return;
            }
            q10 = this.f13548a.q();
        } while (q10 == i10);
        this.f13551d = q10;
    }

    public final void g(List<Integer> list) {
        int q10;
        int q11;
        if (!(list instanceof n92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 2) {
                int r10 = this.f13548a.r();
                t(r10);
                int j3 = this.f13548a.j() + r10;
                do {
                    list.add(Integer.valueOf(this.f13548a.o()));
                } while (this.f13548a.j() < j3);
                return;
            } else if (i10 != 5) {
                throw x92.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.f13548a.o()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            }
        }
        n92 n92Var = (n92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 2) {
            int r11 = this.f13548a.r();
            t(r11);
            int j10 = this.f13548a.j() + r11;
            do {
                n92Var.h(this.f13548a.o());
            } while (this.f13548a.j() < j10);
        } else if (i11 != 5) {
            throw x92.a();
        } else {
            do {
                n92Var.h(this.f13548a.o());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        }
    }

    public final void h(List<Long> list) {
        int q10;
        int q11;
        if (!(list instanceof ga2)) {
            int i10 = this.f13549b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f13548a.u()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int r10 = this.f13548a.r();
                u(r10);
                int j3 = this.f13548a.j() + r10;
                do {
                    list.add(Long.valueOf(this.f13548a.u()));
                } while (this.f13548a.j() < j3);
                return;
            }
        }
        ga2 ga2Var = (ga2) list;
        int i11 = this.f13549b & 7;
        if (i11 == 1) {
            do {
                ga2Var.h(this.f13548a.u());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int r11 = this.f13548a.r();
            u(r11);
            int j10 = this.f13548a.j() + r11;
            do {
                ga2Var.h(this.f13548a.u());
            } while (this.f13548a.j() < j10);
        }
    }

    public final void i(List<Integer> list) {
        int q10;
        int q11;
        if (!(list instanceof n92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13548a.p()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Integer.valueOf(this.f13548a.p()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        n92 n92Var = (n92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                n92Var.h(this.f13548a.p());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                n92Var.h(this.f13548a.p());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final void j(List<Long> list) {
        int q10;
        int q11;
        if (!(list instanceof ga2)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f13548a.v()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Long.valueOf(this.f13548a.v()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        ga2 ga2Var = (ga2) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                ga2Var.h(this.f13548a.v());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                ga2Var.h(this.f13548a.v());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final void k(List<String> list, boolean z10) {
        String str;
        int q10;
        int q11;
        if ((this.f13549b & 7) == 2) {
            if ((list instanceof ca2) && !z10) {
                ca2 ca2Var = (ca2) list;
                do {
                    ca2Var.n(J());
                    if (this.f13548a.b()) {
                        return;
                    }
                    q11 = this.f13548a.q();
                } while (q11 == this.f13549b);
                this.f13551d = q11;
                return;
            }
            do {
                if (z10) {
                    s(2);
                    str = this.f13548a.z();
                } else {
                    s(2);
                    str = this.f13548a.y();
                }
                list.add(str);
                if (this.f13548a.b()) {
                    return;
                }
                q10 = this.f13548a.q();
            } while (q10 == this.f13549b);
            this.f13551d = q10;
            return;
        }
        throw x92.a();
    }

    public final void l(List<Integer> list) {
        int q10;
        int q11;
        if (!(list instanceof n92)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13548a.r()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Integer.valueOf(this.f13548a.r()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        n92 n92Var = (n92) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                n92Var.h(this.f13548a.r());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                n92Var.h(this.f13548a.r());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final void m(List<Long> list) {
        int q10;
        int q11;
        if (!(list instanceof ga2)) {
            int i10 = this.f13549b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f13548a.w()));
                    if (this.f13548a.b()) {
                        return;
                    }
                    q10 = this.f13548a.q();
                } while (q10 == this.f13549b);
                this.f13551d = q10;
                return;
            } else if (i10 != 2) {
                throw x92.a();
            } else {
                int j3 = this.f13548a.j() + this.f13548a.r();
                do {
                    list.add(Long.valueOf(this.f13548a.w()));
                } while (this.f13548a.j() < j3);
                r(j3);
                return;
            }
        }
        ga2 ga2Var = (ga2) list;
        int i11 = this.f13549b & 7;
        if (i11 == 0) {
            do {
                ga2Var.h(this.f13548a.w());
                if (this.f13548a.b()) {
                    return;
                }
                q11 = this.f13548a.q();
            } while (q11 == this.f13549b);
            this.f13551d = q11;
        } else if (i11 != 2) {
            throw x92.a();
        } else {
            int j10 = this.f13548a.j() + this.f13548a.r();
            do {
                ga2Var.h(this.f13548a.w());
            } while (this.f13548a.j() < j10);
            r(j10);
        }
    }

    public final boolean n() {
        s(0);
        return this.f13548a.c();
    }

    public final boolean o() {
        int i10;
        if (this.f13548a.b() || (i10 = this.f13549b) == this.f13550c) {
            return false;
        }
        return this.f13548a.d(i10);
    }

    public final <T> T p(eb2<T> eb2Var, z82 z82Var) {
        int i10 = this.f13550c;
        this.f13550c = ((this.f13549b >>> 3) << 3) | 4;
        try {
            T b10 = eb2Var.b();
            eb2Var.g(b10, this, z82Var);
            eb2Var.c(b10);
            if (this.f13549b == this.f13550c) {
                return b10;
            }
            throw x92.g();
        } finally {
            this.f13550c = i10;
        }
    }

    public final <T> T q(eb2<T> eb2Var, z82 z82Var) {
        r82 r82Var;
        int r10 = this.f13548a.r();
        r82 r82Var2 = this.f13548a;
        if (r82Var2.f13197a < 100) {
            int k10 = r82Var2.k(r10);
            T b10 = eb2Var.b();
            this.f13548a.f13197a++;
            eb2Var.g(b10, this, z82Var);
            eb2Var.c(b10);
            this.f13548a.A(0);
            r82Var.f13197a--;
            this.f13548a.a(k10);
            return b10;
        }
        throw new x92("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void r(int i10) {
        if (this.f13548a.j() == i10) {
            return;
        }
        throw x92.h();
    }

    public final void s(int i10) {
        if ((this.f13549b & 7) == i10) {
            return;
        }
        throw x92.a();
    }

    public final double v() {
        s(1);
        return this.f13548a.h();
    }

    public final float w() {
        s(5);
        return this.f13548a.i();
    }

    public final int x() {
        int i10 = this.f13551d;
        if (i10 != 0) {
            this.f13549b = i10;
            this.f13551d = 0;
        } else {
            i10 = this.f13548a.q();
            this.f13549b = i10;
        }
        if (i10 == 0 || i10 == this.f13550c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public final int y() {
        s(0);
        return this.f13548a.l();
    }

    public final int z() {
        s(5);
        return this.f13548a.m();
    }
}
