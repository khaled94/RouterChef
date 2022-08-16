package m4;

import androidx.activity.k;
import n9.d;

/* loaded from: classes.dex */
public final class rg {

    /* renamed from: a */
    public byte[] f13267a;

    /* renamed from: b */
    public int f13268b;

    /* renamed from: c */
    public int f13269c;

    public rg() {
    }

    public rg(int i10) {
        this.f13267a = new byte[i10];
        this.f13269c = i10;
    }

    public rg(byte[] bArr) {
        this.f13267a = bArr;
        this.f13269c = bArr.length;
    }

    public final int a() {
        byte[] bArr = this.f13267a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        byte[] bArr = this.f13267a;
        int i10 = this.f13268b;
        int i11 = i10 + 1;
        this.f13268b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f13268b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f13268b = i13;
        byte b12 = bArr[i12];
        this.f13268b = i13 + 1;
        return (bArr[i13] & 255) | ((b10 & 255) << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8);
    }

    public final int c() {
        byte[] bArr = this.f13267a;
        int i10 = this.f13268b;
        this.f13268b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int d() {
        int b10 = b();
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalStateException(k.a(29, "Top bit not zero: ", b10));
    }

    public final int e() {
        byte[] bArr = this.f13267a;
        int i10 = this.f13268b;
        int i11 = i10 + 1;
        this.f13268b = i11;
        byte b10 = bArr[i10];
        this.f13268b = i11 + 1;
        return (bArr[i11] & 255) | ((b10 & 255) << 8);
    }

    public final long f() {
        byte[] bArr = this.f13267a;
        int i10 = this.f13268b;
        int i11 = i10 + 1;
        this.f13268b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f13268b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f13268b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f13268b = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.f13268b = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.f13268b = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.f13268b = i17;
        byte b16 = bArr[i16];
        this.f13268b = i17 + 1;
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (bArr[i17] & 255);
    }

    public final long g() {
        byte[] bArr = this.f13267a;
        int i10 = this.f13268b;
        int i11 = i10 + 1;
        this.f13268b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f13268b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f13268b = i13;
        byte b12 = bArr[i12];
        this.f13268b = i13 + 1;
        return ((b11 & 255) << 16) | ((b10 & 255) << 24) | ((b12 & 255) << 8) | (bArr[i13] & 255);
    }

    public final long h() {
        long f10 = f();
        if (f10 >= 0) {
            return f10;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(f10);
        throw new IllegalStateException(sb.toString());
    }

    public final String i(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f13268b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f13267a, i11, (i12 >= this.f13269c || this.f13267a[i12] != 0) ? i10 : i10 - 1);
        this.f13268b += i10;
        return str;
    }

    public final void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f13267a, this.f13268b, bArr, i10, i11);
        this.f13268b += i11;
    }

    public final void k(int i10) {
        l(a() < i10 ? new byte[i10] : this.f13267a, i10);
    }

    public final void l(byte[] bArr, int i10) {
        this.f13267a = bArr;
        this.f13269c = i10;
        this.f13268b = 0;
    }

    public final void m(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f13267a.length) {
            z10 = true;
        }
        d.g(z10);
        this.f13269c = i10;
    }

    public final void n(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f13269c) {
            z10 = true;
        }
        d.g(z10);
        this.f13268b = i10;
    }

    public final void o(int i10) {
        n(this.f13268b + i10);
    }
}
