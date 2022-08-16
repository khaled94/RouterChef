package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class aq2 implements to2 {

    /* renamed from: b */
    public vo2 f6234b;

    /* renamed from: c */
    public int f6235c;

    /* renamed from: d */
    public int f6236d;

    /* renamed from: e */
    public int f6237e;

    /* renamed from: g */
    public i f6239g;

    /* renamed from: h */
    public uo2 f6240h;

    /* renamed from: i */
    public dq2 f6241i;

    /* renamed from: j */
    public u0 f6242j;

    /* renamed from: a */
    public final dd f6233a = new dd(6);

    /* renamed from: f */
    public long f6238f = -1;

    public final int a(uo2 uo2Var) {
        this.f6233a.e(2);
        ((qo2) uo2Var).o((byte[]) this.f6233a.f7311d, 0, 2, false);
        return this.f6233a.t();
    }

    public final void b() {
        d(new ym0[0]);
        vo2 vo2Var = this.f6234b;
        Objects.requireNonNull(vo2Var);
        vo2Var.y();
        this.f6234b.l(new ip2(-9223372036854775807L, 0L));
        this.f6235c = 6;
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        if (a(uo2Var) != 65496) {
            return false;
        }
        int a10 = a(uo2Var);
        this.f6236d = a10;
        if (a10 == 65504) {
            this.f6233a.e(2);
            qo2 qo2Var = (qo2) uo2Var;
            qo2Var.o((byte[]) this.f6233a.f7311d, 0, 2, false);
            qo2Var.p(this.f6233a.t() - 2, false);
            a10 = a(uo2Var);
            this.f6236d = a10;
        }
        if (a10 == 65505) {
            qo2 qo2Var2 = (qo2) uo2Var;
            qo2Var2.p(2, false);
            this.f6233a.e(6);
            qo2Var2.o((byte[]) this.f6233a.f7311d, 0, 6, false);
            if (this.f6233a.w() == 1165519206 && this.f6233a.t() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(ym0... ym0VarArr) {
        vo2 vo2Var = this.f6234b;
        Objects.requireNonNull(vo2Var);
        mp2 p = vo2Var.p(1024, 4);
        kq2 kq2Var = new kq2();
        kq2Var.f10541i = "image/jpeg";
        kq2Var.f10540h = new ln0(ym0VarArr);
        p.f(new t(kq2Var));
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f6234b = vo2Var;
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        if (j3 == 0) {
            this.f6235c = 0;
            this.f6242j = null;
        } else if (this.f6235c != 5) {
        } else {
            u0 u0Var = this.f6242j;
            Objects.requireNonNull(u0Var);
            u0Var.g(j3, j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
        r17 = -9223372036854775807L;
     */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r32, m4.gp2 r33) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.aq2.h(m4.uo2, m4.gp2):int");
    }
}
