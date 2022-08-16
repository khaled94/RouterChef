package ca;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends i {

    /* renamed from: x */
    public final transient byte[][] f2887x;
    public final transient int[] y;

    public w(f fVar, int i10) {
        super(null);
        a0.a(fVar.f2843t, 0L, i10);
        u uVar = fVar.f2842s;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = uVar.f2880c;
            int i15 = uVar.f2879b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            uVar = uVar.f2883f;
        }
        this.f2887x = new byte[i13];
        this.y = new int[i13 * 2];
        u uVar2 = fVar.f2842s;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f2887x;
            bArr[i16] = uVar2.f2878a;
            int i17 = uVar2.f2880c;
            int i18 = uVar2.f2879b;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.y;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            uVar2.f2881d = true;
            i16++;
            uVar2 = uVar2.f2883f;
        }
    }

    @Override // ca.i
    public final String b() {
        return u().b();
    }

    @Override // ca.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.n() == n() && m(iVar, n())) {
                return true;
            }
        }
        return false;
    }

    @Override // ca.i
    public final int hashCode() {
        int i10 = this.f2848t;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f2887x.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f2887x[i11];
            int[] iArr = this.y;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f2848t = i12;
        return i12;
    }

    @Override // ca.i
    public final byte i(int i10) {
        a0.a(this.y[this.f2887x.length - 1], i10, 1L);
        int s10 = s(i10);
        int i11 = s10 == 0 ? 0 : this.y[s10 - 1];
        int[] iArr = this.y;
        byte[][] bArr = this.f2887x;
        return bArr[s10][(i10 - i11) + iArr[bArr.length + s10]];
    }

    @Override // ca.i
    public final String j() {
        return u().j();
    }

    @Override // ca.i
    public final boolean l(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > n() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int s10 = s(i10);
        while (true) {
            boolean z10 = true;
            if (i12 <= 0) {
                return true;
            }
            int i13 = s10 == 0 ? 0 : this.y[s10 - 1];
            int min = Math.min(i12, ((this.y[s10] - i13) + i13) - i10);
            int[] iArr = this.y;
            byte[][] bArr2 = this.f2887x;
            int i14 = (i10 - i13) + iArr[bArr2.length + s10];
            byte[] bArr3 = bArr2[s10];
            Charset charset = a0.f2829a;
            int i15 = 0;
            while (true) {
                if (i15 >= min) {
                    break;
                } else if (bArr3[i15 + i14] != bArr[i15 + i11]) {
                    z10 = false;
                    break;
                } else {
                    i15++;
                }
            }
            if (!z10) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            s10++;
        }
    }

    @Override // ca.i
    public final boolean m(i iVar, int i10) {
        if (n() - i10 < 0) {
            return false;
        }
        int s10 = s(0);
        int i11 = 0;
        int i12 = 0;
        while (i10 > 0) {
            int i13 = s10 == 0 ? 0 : this.y[s10 - 1];
            int min = Math.min(i10, ((this.y[s10] - i13) + i13) - i11);
            int[] iArr = this.y;
            byte[][] bArr = this.f2887x;
            if (!iVar.l(i12, bArr[s10], (i11 - i13) + iArr[bArr.length + s10], min)) {
                return false;
            }
            i11 += min;
            i12 += min;
            i10 -= min;
            s10++;
        }
        return true;
    }

    @Override // ca.i
    public final int n() {
        return this.y[this.f2887x.length - 1];
    }

    @Override // ca.i
    public final i o() {
        return u().o();
    }

    @Override // ca.i
    public final i p() {
        return u().p();
    }

    @Override // ca.i
    public final String q() {
        return u().q();
    }

    @Override // ca.i
    public final void r(f fVar) {
        int length = this.f2887x.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.y;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            u uVar = new u(this.f2887x[i10], i12, (i12 + i13) - i11);
            u uVar2 = fVar.f2842s;
            if (uVar2 == null) {
                uVar.f2884g = uVar;
                uVar.f2883f = uVar;
                fVar.f2842s = uVar;
            } else {
                uVar2.f2884g.b(uVar);
            }
            i10++;
            i11 = i13;
        }
        fVar.f2843t += i11;
    }

    public final int s(int i10) {
        int binarySearch = Arrays.binarySearch(this.y, 0, this.f2887x.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final byte[] t() {
        int[] iArr = this.y;
        byte[][] bArr = this.f2887x;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.y;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f2887x[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // ca.i
    public final String toString() {
        return u().toString();
    }

    public final i u() {
        return new i(t());
    }
}
