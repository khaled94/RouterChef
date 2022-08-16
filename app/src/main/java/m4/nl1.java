package m4;

/* loaded from: classes.dex */
public final class nl1 {

    /* renamed from: a */
    public byte[] f11826a;

    /* renamed from: b */
    public int f11827b;

    /* renamed from: c */
    public int f11828c;

    /* renamed from: d */
    public int f11829d;

    public nl1() {
        this.f11826a = ls1.f10976f;
    }

    public nl1(byte[] bArr, int i10) {
        this.f11826a = bArr;
        this.f11829d = i10;
    }

    public final int a() {
        return ((this.f11829d - this.f11827b) * 8) - this.f11828c;
    }

    public final int b() {
        return (this.f11827b * 8) + this.f11828c;
    }

    public final int c(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f11828c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f11828c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f11828c = i13;
            byte[] bArr = this.f11826a;
            int i14 = this.f11827b;
            this.f11827b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f11826a;
        int i15 = this.f11827b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f11828c = 0;
            this.f11827b = i15 + 1;
        }
        j();
        return i16;
    }

    public final void d(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f11826a;
            int i13 = this.f11827b;
            int i14 = i13 + 1;
            this.f11827b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f11828c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f11828c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f11826a;
            int i18 = this.f11827b;
            this.f11827b = i18 + 1;
            b12 = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b12;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.f11828c = i19;
        byte[] bArr4 = this.f11826a;
        int i20 = this.f11827b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b12);
        if (i19 == 8) {
            this.f11828c = 0;
            this.f11827b = i20 + 1;
        }
        j();
    }

    public final void e(byte[] bArr, int i10) {
        this.f11826a = bArr;
        this.f11827b = 0;
        this.f11828c = 0;
        this.f11829d = i10;
    }

    public final void f(int i10) {
        int i11 = i10 / 8;
        this.f11827b = i11;
        this.f11828c = i10 - (i11 * 8);
        j();
    }

    public final void g() {
        int i10 = this.f11828c + 1;
        this.f11828c = i10;
        if (i10 == 8) {
            this.f11828c = 0;
            this.f11827b++;
        }
        j();
    }

    public final void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f11827b + i11;
        this.f11827b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f11828c;
        this.f11828c = i13;
        if (i13 > 7) {
            this.f11827b = i12 + 1;
            this.f11828c = i13 - 8;
        }
        j();
    }

    public final boolean i() {
        boolean z10 = (this.f11826a[this.f11827b] & (128 >> this.f11828c)) != 0;
        g();
        return z10;
    }

    public final void j() {
        int i10;
        int i11 = this.f11827b;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.f11829d) && (i11 != i10 || this.f11828c != 0))) {
            z10 = false;
        }
        r01.h(z10);
    }
}
