package m4;

/* loaded from: classes.dex */
public class oo2 {

    /* renamed from: a */
    public final jo2 f12247a;

    /* renamed from: b */
    public final no2 f12248b;

    /* renamed from: c */
    public ko2 f12249c;

    /* renamed from: d */
    public final int f12250d;

    public oo2(lo2 lo2Var, no2 no2Var, long j3, long j10, long j11, long j12, long j13, int i10) {
        this.f12248b = no2Var;
        this.f12250d = i10;
        this.f12247a = new jo2(lo2Var, j3, j10, j11, j12, j13);
    }

    public static final int e(uo2 uo2Var, long j3, gp2 gp2Var) {
        if (j3 == uo2Var.b()) {
            return 0;
        }
        gp2Var.f8999a = j3;
        return 1;
    }

    public static final boolean f(uo2 uo2Var, long j3) {
        long b10 = j3 - uo2Var.b();
        if (b10 < 0 || b10 > 262144) {
            return false;
        }
        ((qo2) uo2Var).q((int) b10);
        return true;
    }

    public final int a(uo2 uo2Var, gp2 gp2Var) {
        while (true) {
            ko2 ko2Var = this.f12249c;
            r01.d(ko2Var);
            long j3 = ko2Var.f10518f;
            long j10 = ko2Var.f10519g;
            long j11 = ko2Var.f10520h;
            if (j10 - j3 <= this.f12250d) {
                b();
                return e(uo2Var, j3, gp2Var);
            } else if (!f(uo2Var, j11)) {
                return e(uo2Var, j11, gp2Var);
            } else {
                uo2Var.i();
                mo2 b10 = this.f12248b.b(uo2Var, ko2Var.f10514b);
                int i10 = b10.f11268a;
                if (i10 == -3) {
                    b();
                    return e(uo2Var, j11, gp2Var);
                } else if (i10 == -2) {
                    long j12 = b10.f11269b;
                    long j13 = b10.f11270c;
                    ko2Var.f10516d = j12;
                    ko2Var.f10518f = j13;
                    ko2Var.f10520h = ko2.a(ko2Var.f10514b, j12, ko2Var.f10517e, j13, ko2Var.f10519g, ko2Var.f10515c);
                } else if (i10 != -1) {
                    f(uo2Var, b10.f11270c);
                    b();
                    return e(uo2Var, b10.f11270c, gp2Var);
                } else {
                    long j14 = b10.f11269b;
                    long j15 = b10.f11270c;
                    ko2Var.f10517e = j14;
                    ko2Var.f10519g = j15;
                    ko2Var.f10520h = ko2.a(ko2Var.f10514b, ko2Var.f10516d, j14, ko2Var.f10518f, j15, ko2Var.f10515c);
                }
            }
        }
    }

    public final void b() {
        this.f12249c = null;
        this.f12248b.a();
    }

    public final void c(long j3) {
        ko2 ko2Var = this.f12249c;
        if (ko2Var == null || ko2Var.f10513a != j3) {
            long c10 = this.f12247a.f10150a.c(j3);
            jo2 jo2Var = this.f12247a;
            this.f12249c = new ko2(j3, c10, jo2Var.f10152c, jo2Var.f10153d, jo2Var.f10154e, jo2Var.f10155f);
        }
    }

    public final boolean d() {
        return this.f12249c != null;
    }
}
