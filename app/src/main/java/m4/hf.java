package m4;

import java.io.EOFException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class hf {

    /* renamed from: e */
    public ff f9217e;

    /* renamed from: f */
    public ff f9218f;

    /* renamed from: g */
    public ua f9219g;

    /* renamed from: h */
    public long f9220h;

    /* renamed from: j */
    public gf f9222j;

    /* renamed from: k */
    public final eg f9223k;

    /* renamed from: a */
    public final ef f9213a = new ef();

    /* renamed from: b */
    public final df f9214b = new df();

    /* renamed from: c */
    public final rg f9215c = new rg(32);

    /* renamed from: d */
    public final AtomicInteger f9216d = new AtomicInteger();

    /* renamed from: i */
    public int f9221i = 65536;

    public hf(eg egVar) {
        this.f9223k = egVar;
        ff ffVar = new ff(0L);
        this.f9217e = ffVar;
        this.f9218f = ffVar;
    }

    public final void a(ua uaVar) {
        boolean z10;
        if (uaVar == null) {
            uaVar = null;
        }
        ef efVar = this.f9213a;
        synchronized (efVar) {
            z10 = true;
            if (uaVar == null) {
                efVar.p = true;
            } else {
                efVar.p = false;
                if (!wg.h(uaVar, efVar.f7836q)) {
                    efVar.f7836q = uaVar;
                }
            }
            z10 = false;
        }
        gf gfVar = this.f9222j;
        if (gfVar == null || !z10) {
            return;
        }
        se seVar = (se) gfVar;
        seVar.E.post(seVar.C);
    }

    public final void b(rg rgVar, int i10) {
        if (!n()) {
            rgVar.o(i10);
            return;
        }
        while (i10 > 0) {
            int i11 = i(i10);
            rgVar.j(((yf) this.f9218f.f8434v).f15672a, this.f9221i, i11);
            this.f9221i += i11;
            this.f9220h += i11;
            i10 -= i11;
        }
        l();
    }

    public final void c(long j3, int i10, int i11, oc ocVar) {
        if (!n()) {
            ef efVar = this.f9213a;
            synchronized (efVar) {
                efVar.f7834n = Math.max(efVar.f7834n, j3);
            }
            return;
        }
        try {
            this.f9213a.a(j3, i10, this.f9220h - i11, i11, ocVar);
        } finally {
            l();
        }
    }

    public final int d(hc hcVar, int i10) {
        if (!n()) {
            int min = Math.min(hcVar.f9186f, i10);
            hcVar.g(min);
            if (min == 0) {
                min = hcVar.e(hc.f9180g, 0, Math.min(i10, 4096), 0, true);
            }
            hcVar.f(min);
            if (min == -1) {
                throw new EOFException();
            }
            return min;
        }
        try {
            int i11 = i(i10);
            byte[] bArr = ((yf) this.f9218f.f8434v).f15672a;
            int i12 = this.f9221i;
            int i13 = hcVar.f9186f;
            int i14 = 0;
            if (i13 != 0) {
                int min2 = Math.min(i13, i11);
                System.arraycopy(hcVar.f9184d, 0, bArr, i12, min2);
                hcVar.g(min2);
                i14 = min2;
            }
            if (i14 == 0) {
                i14 = hcVar.e(bArr, i12, i11, 0, true);
            }
            hcVar.f(i14);
            if (i14 == -1) {
                throw new EOFException();
            }
            this.f9221i += i14;
            this.f9220h += i14;
            return i14;
        } finally {
            l();
        }
    }

    public final long e() {
        long max;
        ef efVar = this.f9213a;
        synchronized (efVar) {
            max = Math.max(efVar.f7833m, efVar.f7834n);
        }
        return max;
    }

    public final void f() {
        if (this.f9216d.getAndSet(2) == 0) {
            j();
        }
    }

    public final void g(boolean z10) {
        int andSet = this.f9216d.getAndSet(true != z10 ? 2 : 0);
        j();
        ef efVar = this.f9213a;
        efVar.f7833m = Long.MIN_VALUE;
        efVar.f7834n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f9219g = null;
        }
    }

    public final boolean h(long j3, boolean z10) {
        long j10;
        ef efVar = this.f9213a;
        synchronized (efVar) {
            if (efVar.b()) {
                long[] jArr = efVar.f7826f;
                int i10 = efVar.f7831k;
                if (j3 >= jArr[i10] && (j3 <= efVar.f7834n || z10)) {
                    int i11 = 0;
                    int i12 = -1;
                    while (i10 != efVar.f7832l && efVar.f7826f[i10] <= j3) {
                        if (1 == (efVar.f7825e[i10] & 1)) {
                            i12 = i11;
                        }
                        i10 = (i10 + 1) % efVar.f7821a;
                        i11++;
                    }
                    if (i12 != -1) {
                        int i13 = (efVar.f7831k + i12) % efVar.f7821a;
                        efVar.f7831k = i13;
                        efVar.f7830j += i12;
                        efVar.f7829i -= i12;
                        j10 = efVar.f7823c[i13];
                    }
                }
            }
            j10 = -1;
        }
        if (j10 == -1) {
            return false;
        }
        k(j10);
        return true;
    }

    public final int i(int i10) {
        yf yfVar;
        if (this.f9221i == 65536) {
            this.f9221i = 0;
            ff ffVar = this.f9218f;
            if (ffVar.f8431s) {
                this.f9218f = (ff) ffVar.f8435w;
            }
            ff ffVar2 = this.f9218f;
            eg egVar = this.f9223k;
            synchronized (egVar) {
                egVar.f7840c++;
                int i11 = egVar.f7841d;
                if (i11 > 0) {
                    yf[] yfVarArr = egVar.f7842e;
                    int i12 = i11 - 1;
                    egVar.f7841d = i12;
                    yfVar = yfVarArr[i12];
                    yfVarArr[i12] = null;
                } else {
                    yfVar = new yf(new byte[65536]);
                }
            }
            ff ffVar3 = new ff(this.f9218f.f8433u);
            ffVar2.f8434v = yfVar;
            ffVar2.f8435w = ffVar3;
            ffVar2.f8431s = true;
        }
        return Math.min(i10, 65536 - this.f9221i);
    }

    public final void j() {
        ef efVar = this.f9213a;
        efVar.f7830j = 0;
        efVar.f7831k = 0;
        efVar.f7832l = 0;
        efVar.f7829i = 0;
        efVar.f7835o = true;
        ff ffVar = this.f9217e;
        if (ffVar.f8431s) {
            ff ffVar2 = this.f9218f;
            int i10 = (((int) (ffVar2.f8432t - ffVar.f8432t)) / 65536) + (ffVar2.f8431s ? 1 : 0);
            yf[] yfVarArr = new yf[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                yfVarArr[i11] = (yf) ffVar.f8434v;
                ffVar.f8434v = null;
                ffVar = (ff) ffVar.f8435w;
            }
            this.f9223k.b(yfVarArr);
        }
        ff ffVar3 = new ff(0L);
        this.f9217e = ffVar3;
        this.f9218f = ffVar3;
        this.f9220h = 0L;
        this.f9221i = 65536;
        this.f9223k.c();
    }

    public final void k(long j3) {
        while (true) {
            ff ffVar = this.f9217e;
            if (j3 >= ffVar.f8433u) {
                this.f9223k.a((yf) ffVar.f8434v);
                ff ffVar2 = this.f9217e;
                ffVar2.f8434v = null;
                this.f9217e = (ff) ffVar2.f8435w;
            } else {
                return;
            }
        }
    }

    public final void l() {
        if (!this.f9216d.compareAndSet(1, 0)) {
            j();
        }
    }

    public final void m(long j3, byte[] bArr, int i10) {
        k(j3);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = (int) (j3 - this.f9217e.f8432t);
            int min = Math.min(i10 - i11, 65536 - i12);
            yf yfVar = (yf) this.f9217e.f8434v;
            System.arraycopy(yfVar.f15672a, i12, bArr, i11, min);
            j3 += min;
            i11 += min;
            if (j3 == this.f9217e.f8433u) {
                this.f9223k.a(yfVar);
                ff ffVar = this.f9217e;
                ffVar.f8434v = null;
                this.f9217e = (ff) ffVar.f8435w;
            }
        }
    }

    public final boolean n() {
        return this.f9216d.compareAndSet(0, 1);
    }
}
