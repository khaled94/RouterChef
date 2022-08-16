package m4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import z3.p;

/* loaded from: classes.dex */
public class l82 extends k82 {

    /* renamed from: u */
    public final byte[] f10679u;

    public l82(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f10679u = bArr;
    }

    @Override // m4.k82
    public final boolean G(n82 n82Var, int i10, int i11) {
        if (i11 > n82Var.k()) {
            int k10 = k();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(k10);
            throw new IllegalArgumentException(sb.toString());
        }
        int i12 = i10 + i11;
        if (i12 > n82Var.k()) {
            int k11 = n82Var.k();
            StringBuilder a10 = p.a(59, "Ran off end of other: ", i10, ", ", i11);
            a10.append(", ");
            a10.append(k11);
            throw new IllegalArgumentException(a10.toString());
        } else if (!(n82Var instanceof l82)) {
            return n82Var.s(i10, i12).equals(s(0, i11));
        } else {
            l82 l82Var = (l82) n82Var;
            byte[] bArr = this.f10679u;
            byte[] bArr2 = l82Var.f10679u;
            int H = H() + i11;
            int H2 = H();
            int H3 = l82Var.H() + i10;
            while (H2 < H) {
                if (bArr[H2] != bArr2[H3]) {
                    return false;
                }
                H2++;
                H3++;
            }
            return true;
        }
    }

    public int H() {
        return 0;
    }

    @Override // m4.n82
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n82) || k() != ((n82) obj).k()) {
            return false;
        }
        if (k() == 0) {
            return true;
        }
        if (!(obj instanceof l82)) {
            return obj.equals(this);
        }
        l82 l82Var = (l82) obj;
        int i10 = this.f11572s;
        int i11 = l82Var.f11572s;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        return G(l82Var, 0, k());
    }

    @Override // m4.n82
    public byte g(int i10) {
        return this.f10679u[i10];
    }

    @Override // m4.n82
    public byte h(int i10) {
        return this.f10679u[i10];
    }

    @Override // m4.n82
    public int k() {
        return this.f10679u.length;
    }

    @Override // m4.n82
    public void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f10679u, i10, bArr, i11, i12);
    }

    @Override // m4.n82
    public final int p(int i10, int i11, int i12) {
        byte[] bArr = this.f10679u;
        int H = H() + i11;
        Charset charset = v92.f14624a;
        for (int i13 = H; i13 < H + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // m4.n82
    public final int q(int i10, int i11, int i12) {
        int H = H() + i11;
        return bc2.f6451a.a(i10, this.f10679u, H, i12 + H);
    }

    @Override // m4.n82
    public final n82 s(int i10, int i11) {
        int z10 = n82.z(i10, i11, k());
        return z10 == 0 ? n82.f11571t : new j82(this.f10679u, H() + i10, z10);
    }

    @Override // m4.n82
    public final r82 t() {
        return r82.g(this.f10679u, H(), k(), true);
    }

    @Override // m4.n82
    public final String u(Charset charset) {
        return new String(this.f10679u, H(), k(), charset);
    }

    @Override // m4.n82
    public final ByteBuffer v() {
        return ByteBuffer.wrap(this.f10679u, H(), k()).asReadOnlyBuffer();
    }

    @Override // m4.n82
    public final void x(wo2 wo2Var) {
        ((t82) wo2Var).F(this.f10679u, H(), k());
    }

    @Override // m4.n82
    public final boolean y() {
        int H = H();
        return bc2.e(this.f10679u, H, k() + H);
    }
}
