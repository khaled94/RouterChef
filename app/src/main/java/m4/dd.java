package m4;

import androidx.activity.k;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dd implements bd {

    /* renamed from: a */
    public final /* synthetic */ int f7308a;

    /* renamed from: b */
    public int f7309b;

    /* renamed from: c */
    public int f7310c;

    /* renamed from: d */
    public Object f7311d;

    public dd() {
        this.f7308a = 1;
        this.f7311d = ls1.f10976f;
    }

    public final String A(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f7309b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f7310c || ((byte[]) this.f7311d)[i12] != 0) ? i10 : i10 - 1;
        int i14 = ls1.f10971a;
        String str = new String((byte[]) this.f7311d, i11, i13, bu1.f6617b);
        this.f7309b += i10;
        return str;
    }

    public final String B(int i10, Charset charset) {
        String str = new String((byte[]) this.f7311d, this.f7309b, i10, charset);
        this.f7309b += i10;
        return str;
    }

    public final short C() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        this.f7309b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((b10 & 255) << 8));
    }

    public final void D(int i10) {
        byte[] bArr = (byte[]) this.f7311d;
        if (i10 > bArr.length) {
            this.f7311d = Arrays.copyOf(bArr, i10);
        }
    }

    @Override // m4.bd
    public final int a() {
        switch (this.f7308a) {
            case 0:
                int i10 = this.f7309b;
                return i10 == 0 ? ((rg) this.f7311d).d() : i10;
            default:
                return ((byte[]) this.f7311d).length;
        }
    }

    public final void b(nl1 nl1Var, int i10) {
        d(nl1Var.f11826a, 0, i10);
        nl1Var.f(0);
    }

    @Override // m4.bd
    public final boolean c() {
        return this.f7309b != 0;
    }

    public final void d(byte[] bArr, int i10, int i11) {
        System.arraycopy((byte[]) this.f7311d, this.f7309b, bArr, i10, i11);
        this.f7309b += i11;
    }

    public final void e(int i10) {
        byte[] bArr = (byte[]) this.f7311d;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        f(bArr, i10);
    }

    public final void f(byte[] bArr, int i10) {
        this.f7311d = bArr;
        this.f7310c = i10;
        this.f7309b = 0;
    }

    public final void g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= ((byte[]) this.f7311d).length) {
            z10 = true;
        }
        r01.f(z10);
        this.f7310c = i10;
    }

    public final void h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f7310c) {
            z10 = true;
        }
        r01.f(z10);
        this.f7309b = i10;
    }

    public final void i(int i10) {
        h(this.f7309b + i10);
    }

    public final byte[] j() {
        return (byte[]) this.f7311d;
    }

    public final int k() {
        return this.f7309b;
    }

    public final int l() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7309b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7309b = i13;
        byte b12 = bArr[i12];
        this.f7309b = i13 + 1;
        return (bArr[i13] & 255) | ((b10 & 255) << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8);
    }

    public final int m() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7309b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7309b = i13;
        byte b12 = bArr[i12];
        this.f7309b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
    }

    public final int n() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(k.a(29, "Top bit not zero: ", m10));
    }

    public final int o() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        this.f7309b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (b10 & 255);
    }

    public final int p() {
        return (q() << 21) | (q() << 14) | (q() << 7) | q();
    }

    public final int q() {
        int i10 = this.f7309b;
        this.f7309b = i10 + 1;
        return ((byte[]) this.f7311d)[i10] & 255;
    }

    public final int r() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7309b = i12;
        byte b11 = bArr[i11];
        this.f7309b = i12 + 1;
        return (bArr[i12] & 255) | ((b10 & 255) << 16) | ((b11 & 255) << 8);
    }

    public final int s() {
        int l10 = l();
        if (l10 >= 0) {
            return l10;
        }
        throw new IllegalStateException(k.a(29, "Top bit not zero: ", l10));
    }

    public final int t() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        this.f7309b = i11 + 1;
        return (bArr[i11] & 255) | ((b10 & 255) << 8);
    }

    public final long u() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7309b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7309b = i13;
        byte b12 = bArr[i12];
        this.f7309b = i13 + 1;
        return ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public final long v() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7309b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7309b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f7309b = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.f7309b = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.f7309b = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.f7309b = i17;
        byte b16 = bArr[i16];
        this.f7309b = i17 + 1;
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (bArr[i17] & 255);
    }

    public final long w() {
        byte[] bArr = (byte[]) this.f7311d;
        int i10 = this.f7309b;
        int i11 = i10 + 1;
        this.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f7309b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f7309b = i13;
        byte b12 = bArr[i12];
        this.f7309b = i13 + 1;
        return ((b11 & 255) << 16) | ((b10 & 255) << 24) | ((b12 & 255) << 8) | (bArr[i13] & 255);
    }

    public final long x() {
        long v10 = v();
        if (v10 >= 0) {
            return v10;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(v10);
        throw new IllegalStateException(sb.toString());
    }

    public final long y() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j3 = ((byte[]) this.f7311d)[this.f7309b];
        int i13 = 7;
        while (true) {
            i10 = 0;
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j3) != 0) {
                i13--;
            } else if (i13 < 6) {
                j3 &= i12 - 1;
                i10 = 7 - i13;
            } else if (i13 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j3);
            throw new NumberFormatException(sb.toString());
        }
        for (i11 = 1; i11 < i10; i11++) {
            if ((((byte[]) this.f7311d)[this.f7309b + i11] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j3);
                throw new NumberFormatException(sb2.toString());
            }
            j3 = (j3 << 6) | (b10 & 63);
        }
        this.f7309b += i10;
        return j3;
    }

    public final String z() {
        int i10 = this.f7310c;
        int i11 = this.f7309b;
        if (i10 - i11 != 0) {
            while (i11 < this.f7310c && ((byte[]) this.f7311d)[i11] != 0) {
                i11++;
            }
            int i12 = this.f7309b;
            int i13 = ls1.f10971a;
            String str = new String((byte[]) this.f7311d, i12, i11 - i12, bu1.f6617b);
            this.f7309b = i11;
            if (i11 < this.f7310c) {
                this.f7309b = i11 + 1;
            }
            return str;
        }
        return null;
    }

    @Override // m4.bd
    public final int zza() {
        switch (this.f7308a) {
            case 0:
                return this.f7310c;
            default:
                return this.f7310c - this.f7309b;
        }
    }

    public dd(int i10) {
        this.f7308a = 1;
        this.f7311d = new byte[i10];
        this.f7310c = i10;
    }

    public dd(yc ycVar) {
        this.f7308a = 0;
        rg rgVar = ycVar.P0;
        this.f7311d = rgVar;
        rgVar.n(12);
        this.f7309b = ((rg) this.f7311d).d();
        this.f7310c = ((rg) this.f7311d).d();
    }

    public dd(byte[] bArr) {
        this.f7308a = 1;
        this.f7311d = bArr;
        this.f7310c = bArr.length;
    }

    public dd(byte[] bArr, int i10) {
        this.f7308a = 1;
        this.f7311d = bArr;
        this.f7310c = i10;
    }
}
