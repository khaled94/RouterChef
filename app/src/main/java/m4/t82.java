package m4;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class t82 extends v82 {
    public final byte[] A;
    public final int B;
    public int C;

    public t82(byte[] bArr, int i10) {
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

    public final void F(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.A, this.C, i11);
            this.C += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new u82(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), Integer.valueOf(i11)), e10);
        }
    }

    @Override // m4.v82
    public final void k(byte b10) {
        try {
            byte[] bArr = this.A;
            int i10 = this.C;
            this.C = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new u82(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
        }
    }

    @Override // m4.v82
    public final void l(int i10, boolean z10) {
        w(i10 << 3);
        k(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // m4.v82
    public final void m(int i10, n82 n82Var) {
        w((i10 << 3) | 2);
        w(n82Var.k());
        n82Var.x(this);
    }

    @Override // m4.v82
    public final void n(int i10, int i11) {
        w((i10 << 3) | 5);
        o(i11);
    }

    @Override // m4.v82
    public final void o(int i10) {
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
            throw new u82(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
        }
    }

    @Override // m4.v82
    public final void p(int i10, long j3) {
        w((i10 << 3) | 1);
        q(j3);
    }

    @Override // m4.v82
    public final void q(long j3) {
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
            throw new u82(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
        }
    }

    @Override // m4.v82
    public final void r(int i10, int i11) {
        w(i10 << 3);
        s(i11);
    }

    @Override // m4.v82
    public final void s(int i10) {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    @Override // m4.v82
    public final void t(int i10, String str) {
        int i11;
        w((i10 << 3) | 2);
        int i12 = this.C;
        try {
            int i13 = v82.i(str.length() * 3);
            int i14 = v82.i(str.length());
            if (i14 == i13) {
                int i15 = i12 + i14;
                this.C = i15;
                i11 = bc2.b(str, this.A, i15, this.B - i15);
                this.C = i12;
                w((i11 - i12) - i14);
            } else {
                w(bc2.c(str));
                byte[] bArr = this.A;
                int i16 = this.C;
                i11 = bc2.b(str, bArr, i16, this.B - i16);
            }
            this.C = i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new u82(e10);
        } catch (ac2 e11) {
            this.C = i12;
            v82.y.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(v92.f14624a);
            try {
                int length = bytes.length;
                w(length);
                F(bytes, 0, length);
            } catch (IndexOutOfBoundsException e12) {
                throw new u82(e12);
            } catch (u82 e13) {
                throw e13;
            }
        }
    }

    @Override // m4.v82
    public final void u(int i10, int i11) {
        w((i10 << 3) | i11);
    }

    @Override // m4.v82
    public final void v(int i10, int i11) {
        w(i10 << 3);
        w(i11);
    }

    @Override // m4.v82
    public final void w(int i10) {
        if (v82.f14614z) {
            int i11 = d82.f7261a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.A;
                int i12 = this.C;
                this.C = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new u82(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
            }
        }
        byte[] bArr2 = this.A;
        int i13 = this.C;
        this.C = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // m4.v82
    public final void x(int i10, long j3) {
        w(i10 << 3);
        y(j3);
    }

    @Override // m4.v82
    public final void y(long j3) {
        if (v82.f14614z && this.B - this.C >= 10) {
            while ((j3 & (-128)) != 0) {
                byte[] bArr = this.A;
                int i10 = this.C;
                this.C = i10 + 1;
                zb2.f16089c.k(bArr, zb2.f16092f + i10, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            byte[] bArr2 = this.A;
            int i11 = this.C;
            this.C = i11 + 1;
            zb2.f16089c.k(bArr2, zb2.f16092f + i11, (byte) j3);
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
                throw new u82(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e10);
            }
        }
        byte[] bArr4 = this.A;
        int i13 = this.C;
        this.C = i13 + 1;
        bArr4[i13] = (byte) j3;
    }
}
