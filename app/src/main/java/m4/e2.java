package m4;

import android.util.Log;

/* loaded from: classes.dex */
public final class e2 implements u1 {

    /* renamed from: b */
    public mp2 f7693b;

    /* renamed from: c */
    public boolean f7694c;

    /* renamed from: e */
    public int f7696e;

    /* renamed from: f */
    public int f7697f;

    /* renamed from: a */
    public final dd f7692a = new dd(10);

    /* renamed from: d */
    public long f7695d = -9223372036854775807L;

    @Override // m4.u1
    public final void b() {
        this.f7694c = false;
        this.f7695d = -9223372036854775807L;
    }

    @Override // m4.u1
    public final void c() {
        int i10;
        r01.d(this.f7693b);
        if (!this.f7694c || (i10 = this.f7696e) == 0 || this.f7697f != i10) {
            return;
        }
        long j3 = this.f7695d;
        if (j3 != -9223372036854775807L) {
            this.f7693b.e(j3, 1, i10, 0, null);
        }
        this.f7694c = false;
    }

    @Override // m4.u1
    public final void d(dd ddVar) {
        r01.d(this.f7693b);
        if (!this.f7694c) {
            return;
        }
        int zza = ddVar.zza();
        int i10 = this.f7697f;
        if (i10 < 10) {
            int min = Math.min(zza, 10 - i10);
            System.arraycopy((byte[]) ddVar.f7311d, ddVar.f7309b, (byte[]) this.f7692a.f7311d, this.f7697f, min);
            if (this.f7697f + min == 10) {
                this.f7692a.h(0);
                if (this.f7692a.q() != 73 || this.f7692a.q() != 68 || this.f7692a.q() != 51) {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f7694c = false;
                    return;
                }
                this.f7692a.i(3);
                this.f7696e = this.f7692a.p() + 10;
            }
        }
        int min2 = Math.min(zza, this.f7696e - this.f7697f);
        this.f7693b.d(ddVar, min2);
        this.f7697f += min2;
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        mp2 p = vo2Var.p(a3Var.a(), 5);
        this.f7693b = p;
        kq2 kq2Var = new kq2();
        kq2Var.f10533a = a3Var.b();
        kq2Var.f10542j = "application/id3";
        p.f(new t(kq2Var));
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f7694c = true;
        if (j3 != -9223372036854775807L) {
            this.f7695d = j3;
        }
        this.f7696e = 0;
        this.f7697f = 0;
    }
}
