package s4;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class i6 extends k6 {
    public final byte[] A;
    public final int B;
    public int C;

    public i6(byte[] bArr, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.A = bArr;
            this.C = 0;
            this.B = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
    }

    public final void E(byte[] bArr, int i10) {
        try {
            System.arraycopy(bArr, 0, this.A, this.C, i10);
            this.C += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new j6(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), Integer.valueOf(i10)), e10);
        }
    }

    @Override // s4.k6
    public final void j(byte b10) {
        try {
            byte[] bArr = this.A;
            int i10 = this.C;
            this.C = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new j6(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
        }
    }

    @Override // s4.k6
    public final void k(int i10, boolean z10) {
        v(i10 << 3);
        j(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // s4.k6
    public final void l(int i10, g6 g6Var) {
        v((i10 << 3) | 2);
        v(g6Var.g());
        g6Var.l(this);
    }

    @Override // s4.k6
    public final void m(int i10, int i11) {
        v((i10 << 3) | 5);
        n(i11);
    }

    @Override // s4.k6
    public final void n(int i10) {
        try {
            byte[] bArr = this.A;
            int i11 = this.C;
            int i12 = i11 + 1;
            this.C = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.C = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.C = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.C = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new j6(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
        }
    }

    @Override // s4.k6
    public final void o(int i10, long j3) {
        v((i10 << 3) | 1);
        p(j3);
    }

    @Override // s4.k6
    public final void p(long j3) {
        try {
            byte[] bArr = this.A;
            int i10 = this.C;
            int i11 = i10 + 1;
            this.C = i11;
            bArr[i10] = (byte) (((int) j3) & 255);
            int i12 = i11 + 1;
            this.C = i12;
            bArr[i11] = (byte) (((int) (j3 >> 8)) & 255);
            int i13 = i12 + 1;
            this.C = i13;
            bArr[i12] = (byte) (((int) (j3 >> 16)) & 255);
            int i14 = i13 + 1;
            this.C = i14;
            bArr[i13] = (byte) (((int) (j3 >> 24)) & 255);
            int i15 = i14 + 1;
            this.C = i15;
            bArr[i14] = (byte) (((int) (j3 >> 32)) & 255);
            int i16 = i15 + 1;
            this.C = i16;
            bArr[i15] = (byte) (((int) (j3 >> 40)) & 255);
            int i17 = i16 + 1;
            this.C = i17;
            bArr[i16] = (byte) (((int) (j3 >> 48)) & 255);
            this.C = i17 + 1;
            bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new j6(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
        }
    }

    @Override // s4.k6
    public final void q(int i10, int i11) {
        v(i10 << 3);
        r(i11);
    }

    @Override // s4.k6
    public final void r(int i10) {
        if (i10 >= 0) {
            v(i10);
        } else {
            x(i10);
        }
    }

    @Override // s4.k6
    public final void s(int i10, String str) {
        int i11;
        v((i10 << 3) | 2);
        int i12 = this.C;
        try {
            int g10 = k6.g(str.length() * 3);
            int g11 = k6.g(str.length());
            if (g11 == g10) {
                int i13 = i12 + g11;
                this.C = i13;
                i11 = k9.b(str, this.A, i13, this.B - i13);
                this.C = i12;
                v((i11 - i12) - g11);
            } else {
                v(k9.c(str));
                byte[] bArr = this.A;
                int i14 = this.C;
                i11 = k9.b(str, bArr, i14, this.B - i14);
            }
            this.C = i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new j6(e10);
        } catch (j9 e11) {
            this.C = i12;
            k6.y.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(i7.f17920a);
            try {
                int length = bytes.length;
                v(length);
                E(bytes, length);
            } catch (IndexOutOfBoundsException e12) {
                throw new j6(e12);
            } catch (j6 e13) {
                throw e13;
            }
        }
    }

    @Override // s4.k6
    public final void t(int i10, int i11) {
        v((i10 << 3) | i11);
    }

    @Override // s4.k6
    public final void u(int i10, int i11) {
        v(i10 << 3);
        v(i11);
    }

    @Override // s4.k6
    public final void v(int i10) {
        if (k6.f17957z) {
            int i11 = z5.f18216a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.A;
                int i12 = this.C;
                this.C = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new j6(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
            }
        }
        byte[] bArr2 = this.A;
        int i13 = this.C;
        this.C = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // s4.k6
    public final void w(int i10, long j3) {
        v(i10 << 3);
        x(j3);
    }

    @Override // s4.k6
    public final void x(long j3) {
        if (k6.f17957z && this.B - this.C >= 10) {
            while ((j3 & (-128)) != 0) {
                byte[] bArr = this.A;
                int i10 = this.C;
                this.C = i10 + 1;
                i9.f17924c.h(bArr, i9.f17927f + i10, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            byte[] bArr2 = this.A;
            int i11 = this.C;
            this.C = i11 + 1;
            i9.f17924c.h(bArr2, i9.f17927f + i11, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.A;
                int i12 = this.C;
                this.C = i12 + 1;
                bArr3[i12] = (byte) ((((int) j3) & 127) | 128);
                j3 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new j6(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
            }
        }
        byte[] bArr4 = this.A;
        int i13 = this.C;
        this.C = i13 + 1;
        bArr4[i13] = (byte) j3;
    }
}
