package m4;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t1 implements u1 {

    /* renamed from: a */
    public final List<y2> f13890a;

    /* renamed from: b */
    public final mp2[] f13891b;

    /* renamed from: c */
    public boolean f13892c;

    /* renamed from: d */
    public int f13893d;

    /* renamed from: e */
    public int f13894e;

    /* renamed from: f */
    public long f13895f = -9223372036854775807L;

    public t1(List<y2> list) {
        this.f13890a = list;
        this.f13891b = new mp2[list.size()];
    }

    public final boolean a(dd ddVar, int i10) {
        if (ddVar.zza() == 0) {
            return false;
        }
        if (ddVar.q() != i10) {
            this.f13892c = false;
        }
        this.f13893d--;
        return this.f13892c;
    }

    @Override // m4.u1
    public final void b() {
        this.f13892c = false;
        this.f13895f = -9223372036854775807L;
    }

    @Override // m4.u1
    public final void c() {
        if (this.f13892c) {
            if (this.f13895f != -9223372036854775807L) {
                for (mp2 mp2Var : this.f13891b) {
                    mp2Var.e(this.f13895f, 1, this.f13894e, 0, null);
                }
            }
            this.f13892c = false;
        }
    }

    @Override // m4.u1
    public final void d(dd ddVar) {
        mp2[] mp2VarArr;
        if (this.f13892c) {
            if (this.f13893d == 2 && !a(ddVar, 32)) {
                return;
            }
            if (this.f13893d == 1 && !a(ddVar, 0)) {
                return;
            }
            int i10 = ddVar.f7309b;
            int zza = ddVar.zza();
            for (mp2 mp2Var : this.f13891b) {
                ddVar.h(i10);
                mp2Var.b(ddVar, zza);
            }
            this.f13894e += zza;
        }
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        for (int i10 = 0; i10 < this.f13891b.length; i10++) {
            y2 y2Var = this.f13890a.get(i10);
            a3Var.c();
            mp2 p = vo2Var.p(a3Var.a(), 3);
            kq2 kq2Var = new kq2();
            kq2Var.f10533a = a3Var.b();
            kq2Var.f10542j = "application/dvbsubs";
            kq2Var.f10544l = Collections.singletonList(y2Var.f15572b);
            kq2Var.f10535c = y2Var.f15571a;
            p.f(new t(kq2Var));
            this.f13891b[i10] = p;
        }
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f13892c = true;
        if (j3 != -9223372036854775807L) {
            this.f13895f = j3;
        }
        this.f13894e = 0;
        this.f13893d = 2;
    }
}
