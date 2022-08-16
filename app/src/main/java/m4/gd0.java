package m4;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class gd0 implements kq0 {

    /* renamed from: a */
    public final kq0 f8827a;

    /* renamed from: b */
    public final long f8828b;

    /* renamed from: c */
    public final kq0 f8829c;

    /* renamed from: d */
    public long f8830d;

    /* renamed from: e */
    public Uri f8831e;

    public gd0(kq0 kq0Var, int i10, kq0 kq0Var2) {
        this.f8827a = kq0Var;
        this.f8828b = i10;
        this.f8829c = kq0Var2;
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        int i12;
        long j3 = this.f8830d;
        long j10 = this.f8828b;
        if (j3 < j10) {
            int d5 = this.f8827a.d(bArr, i10, (int) Math.min(i11, j10 - j3));
            long j11 = this.f8830d + d5;
            this.f8830d = j11;
            i12 = d5;
            j3 = j11;
        } else {
            i12 = 0;
        }
        if (j3 >= this.f8828b) {
            int d10 = this.f8829c.d(bArr, i10 + i12, i11 - i12);
            this.f8830d += d10;
            return i12 + d10;
        }
        return i12;
    }

    @Override // m4.kq0
    public final void f(i01 i01Var) {
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f8831e;
    }

    @Override // m4.kq0
    public final void i() {
        this.f8827a.i();
        this.f8829c.i();
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        gs0 gs0Var2;
        this.f8831e = gs0Var.f9017a;
        long j3 = gs0Var.f9020d;
        long j10 = this.f8828b;
        gs0 gs0Var3 = null;
        if (j3 >= j10) {
            gs0Var2 = null;
        } else {
            long j11 = gs0Var.f9021e;
            long j12 = j10 - j3;
            if (j11 != -1) {
                j12 = Math.min(j11, j12);
            }
            gs0Var2 = new gs0(gs0Var.f9017a, j3, j3, j12, 0);
        }
        long j13 = gs0Var.f9021e;
        if (j13 == -1 || gs0Var.f9020d + j13 > this.f8828b) {
            long max = Math.max(this.f8828b, gs0Var.f9020d);
            long j14 = gs0Var.f9021e;
            gs0Var3 = new gs0(gs0Var.f9017a, max, max, j14 != -1 ? Math.min(j14, (gs0Var.f9020d + j14) - this.f8828b) : -1L, 0);
        }
        long j15 = 0;
        long k10 = gs0Var2 != null ? this.f8827a.k(gs0Var2) : 0L;
        if (gs0Var3 != null) {
            j15 = this.f8829c.k(gs0Var3);
        }
        this.f8830d = gs0Var.f9020d;
        if (k10 == -1 || j15 == -1) {
            return -1L;
        }
        return k10 + j15;
    }

    @Override // m4.kq0, m4.vy0
    public final Map<String, List<String>> zza() {
        return lx1.y;
    }
}
