package m4;

/* loaded from: classes.dex */
public final class lm1 {

    /* renamed from: a */
    public byte[] f10939a;

    /* renamed from: b */
    public int f10940b;

    /* renamed from: c */
    public int f10941c;

    /* renamed from: d */
    public int f10942d = 0;

    public lm1(byte[] bArr, int i10, int i11) {
        this.f10939a = bArr;
        this.f10941c = i10;
        this.f10940b = i11;
        g();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        this.f10942d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f10942d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f10942d = i14;
            byte[] bArr = this.f10939a;
            int i15 = this.f10941c;
            i13 |= (bArr[i15] & 255) << i14;
            if (true != h(i15 + 1)) {
                i12 = 1;
            }
            this.f10941c = i15 + i12;
        }
        byte[] bArr2 = this.f10939a;
        int i16 = this.f10941c;
        int i17 = ((-1) >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f10942d = 0;
            if (true != h(i16 + 1)) {
                i12 = 1;
            }
            this.f10941c = i16 + i12;
        }
        g();
        return i17;
    }

    public final int b() {
        int f10 = f();
        return ((f10 + 1) / 2) * (f10 % 2 == 0 ? -1 : 1);
    }

    public final void c() {
        int i10 = 1;
        int i11 = this.f10942d + 1;
        this.f10942d = i11;
        if (i11 == 8) {
            this.f10942d = 0;
            int i12 = this.f10941c;
            if (true == h(i12 + 1)) {
                i10 = 2;
            }
            this.f10941c = i12 + i10;
        }
        g();
    }

    public final void d(int i10) {
        int i11 = this.f10941c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f10941c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f10942d;
        this.f10942d = i14;
        if (i14 > 7) {
            this.f10941c = i13 + 1;
            this.f10942d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f10941c) {
                g();
                return;
            } else if (h(i11)) {
                this.f10941c++;
                i11 += 2;
            }
        }
    }

    public final boolean e() {
        boolean z10 = (this.f10939a[this.f10941c] & (128 >> this.f10942d)) != 0;
        c();
        return z10;
    }

    public final int f() {
        int i10 = 0;
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = a(i11);
        }
        return i12 + i10;
    }

    public final void g() {
        int i10;
        int i11 = this.f10941c;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.f10940b) && (i11 != i10 || this.f10942d != 0))) {
            z10 = false;
        }
        r01.h(z10);
    }

    public final boolean h(int i10) {
        if (i10 < 2 || i10 >= this.f10940b) {
            return false;
        }
        byte[] bArr = this.f10939a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }
}
