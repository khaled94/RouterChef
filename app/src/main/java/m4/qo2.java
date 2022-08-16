package m4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qo2 implements uo2 {

    /* renamed from: b */
    public final jp0 f12944b;

    /* renamed from: c */
    public final long f12945c;

    /* renamed from: d */
    public long f12946d;

    /* renamed from: f */
    public int f12948f;

    /* renamed from: g */
    public int f12949g;

    /* renamed from: e */
    public byte[] f12947e = new byte[65536];

    /* renamed from: a */
    public final byte[] f12943a = new byte[4096];

    public qo2(jp0 jp0Var, long j3, long j10) {
        this.f12944b = jp0Var;
        this.f12946d = j3;
        this.f12945c = j10;
    }

    @Override // m4.uo2
    public final int a() {
        int min = Math.min(this.f12949g, 1);
        u(min);
        if (min == 0) {
            min = r(this.f12943a, 0, Math.min(1, 4096), 0, true);
        }
        s(min);
        return min;
    }

    @Override // m4.uo2
    public final long b() {
        return this.f12946d;
    }

    @Override // m4.uo2
    public final long c() {
        return this.f12945c;
    }

    @Override // m4.uo2, m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        int i12 = this.f12949g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f12947e, 0, bArr, i10, min);
            u(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = r(bArr, i10, i11, 0, true);
        }
        s(i13);
        return i13;
    }

    @Override // m4.uo2
    public final int e(byte[] bArr, int i10, int i11) {
        int i12;
        t(i11);
        int i13 = this.f12949g;
        int i14 = this.f12948f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = r(this.f12947e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f12949g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f12947e, this.f12948f, bArr, i10, i12);
        this.f12948f += i12;
        return i12;
    }

    @Override // m4.uo2
    public final long g() {
        return this.f12946d + this.f12948f;
    }

    @Override // m4.uo2
    public final void i() {
        this.f12948f = 0;
    }

    @Override // m4.uo2
    public final void j(byte[] bArr, int i10, int i11) {
        n(bArr, i10, i11, false);
    }

    @Override // m4.uo2
    public final void l(byte[] bArr, int i10, int i11) {
        o(bArr, i10, i11, false);
    }

    @Override // m4.uo2
    public final void m(int i10) {
        q(i10);
    }

    @Override // m4.uo2
    public final boolean n(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        int i13 = this.f12949g;
        if (i13 == 0) {
            i12 = 0;
        } else {
            i12 = Math.min(i13, i11);
            System.arraycopy(this.f12947e, 0, bArr, i10, i12);
            u(i12);
        }
        int i14 = i12;
        while (i14 < i11 && i14 != -1) {
            i14 = r(bArr, i10, i11, i14, z10);
        }
        s(i14);
        return i14 != -1;
    }

    @Override // m4.uo2
    public final boolean o(byte[] bArr, int i10, int i11, boolean z10) {
        if (!p(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f12947e, this.f12948f - i11, bArr, i10, i11);
        return true;
    }

    public final boolean p(int i10, boolean z10) {
        t(i10);
        int i11 = this.f12949g - this.f12948f;
        while (i11 < i10) {
            i11 = r(this.f12947e, this.f12948f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f12949g = this.f12948f + i11;
        }
        this.f12948f += i10;
        return true;
    }

    public final boolean q(int i10) {
        int min = Math.min(this.f12949g, i10);
        u(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = r(this.f12943a, -i11, Math.min(i10, i11 + 4096), i11, false);
        }
        s(i11);
        return i11 != -1;
    }

    public final int r(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int d5 = this.f12944b.d(bArr, i10 + i12, i11 - i12);
            if (d5 != -1) {
                return i12 + d5;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final void s(int i10) {
        if (i10 != -1) {
            this.f12946d += i10;
        }
    }

    public final void t(int i10) {
        int i11 = this.f12948f + i10;
        int length = this.f12947e.length;
        if (i11 > length) {
            this.f12947e = Arrays.copyOf(this.f12947e, ls1.r(length + length, 65536 + i11, i11 + 524288));
        }
    }

    public final void u(int i10) {
        int i11 = this.f12949g - i10;
        this.f12949g = i11;
        this.f12948f = 0;
        byte[] bArr = this.f12947e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f12947e = bArr2;
    }

    @Override // m4.uo2
    public final void w(int i10) {
        p(i10, false);
    }
}
