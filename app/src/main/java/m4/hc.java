package m4;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hc {

    /* renamed from: g */
    public static final byte[] f9180g = new byte[4096];

    /* renamed from: a */
    public final bg f9181a;

    /* renamed from: b */
    public final long f9182b;

    /* renamed from: c */
    public long f9183c;

    /* renamed from: d */
    public byte[] f9184d = new byte[65536];

    /* renamed from: e */
    public int f9185e;

    /* renamed from: f */
    public int f9186f;

    public hc(bg bgVar, long j3, long j10) {
        this.f9181a = bgVar;
        this.f9183c = j3;
        this.f9182b = j10;
    }

    public final boolean a(int i10) {
        int i11 = this.f9185e + i10;
        int length = this.f9184d.length;
        if (i11 > length) {
            int i12 = wg.f14958a;
            this.f9184d = Arrays.copyOf(this.f9184d, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
        int min = Math.min(this.f9186f - this.f9185e, i10);
        while (min < i10) {
            min = e(this.f9184d, this.f9185e, i10, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i13 = this.f9185e + i10;
        this.f9185e = i13;
        this.f9186f = Math.max(this.f9186f, i13);
        return true;
    }

    public final boolean b(byte[] bArr, int i10, int i11) {
        if (!a(i11)) {
            return false;
        }
        System.arraycopy(this.f9184d, this.f9185e - i11, bArr, i10, i11);
        return true;
    }

    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        int i13 = this.f9186f;
        if (i13 == 0) {
            i12 = 0;
        } else {
            i12 = Math.min(i13, i11);
            System.arraycopy(this.f9184d, 0, bArr, i10, i12);
            g(i12);
        }
        int i14 = i12;
        while (i14 < i11 && i14 != -1) {
            i14 = e(bArr, i10, i11, i14, z10);
        }
        f(i14);
        return i14 != -1;
    }

    public final boolean d(int i10) {
        int min = Math.min(this.f9186f, i10);
        g(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = e(f9180g, -i11, Math.min(i10, i11 + 4096), i11, false);
        }
        f(i11);
        return i11 != -1;
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int e10 = this.f9181a.e(bArr, i10 + i12, i11 - i12);
            if (e10 != -1) {
                return i12 + e10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    public final void f(int i10) {
        if (i10 != -1) {
            this.f9183c += i10;
        }
    }

    public final void g(int i10) {
        int i11 = this.f9186f - i10;
        this.f9186f = i11;
        this.f9185e = 0;
        byte[] bArr = this.f9184d;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f9184d = bArr2;
    }
}
