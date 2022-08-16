package s4;

import java.nio.charset.Charset;
import java.util.Objects;
import l0.d;
import m4.g7;

/* loaded from: classes.dex */
public class f6 extends g6 {

    /* renamed from: u */
    public final byte[] f17863u;

    public f6(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f17863u = bArr;
    }

    @Override // s4.g6
    public byte d(int i10) {
        return this.f17863u[i10];
    }

    @Override // s4.g6
    public byte e(int i10) {
        return this.f17863u[i10];
    }

    @Override // s4.g6
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g6) || g() != ((g6) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return obj.equals(this);
        }
        f6 f6Var = (f6) obj;
        int i10 = this.f17878s;
        int i11 = f6Var.f17878s;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int g10 = g();
        if (g10 > f6Var.g()) {
            int g11 = g();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(g10);
            sb.append(g11);
            throw new IllegalArgumentException(sb.toString());
        } else if (g10 > f6Var.g()) {
            throw new IllegalArgumentException(d.a(59, "Ran off end of other: 0, ", g10, ", ", f6Var.g()));
        } else {
            byte[] bArr = this.f17863u;
            byte[] bArr2 = f6Var.f17863u;
            f6Var.q();
            int i12 = 0;
            int i13 = 0;
            while (i12 < g10) {
                if (bArr[i12] != bArr2[i13]) {
                    return false;
                }
                i12++;
                i13++;
            }
            return true;
        }
    }

    @Override // s4.g6
    public int g() {
        return this.f17863u.length;
    }

    @Override // s4.g6
    public final int h(int i10, int i11) {
        byte[] bArr = this.f17863u;
        Charset charset = i7.f17920a;
        for (int i12 = 0; i12 < i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    @Override // s4.g6
    public final g6 i() {
        int o10 = g6.o(0, 47, g());
        return o10 == 0 ? g6.f17877t : new e6(this.f17863u, o10);
    }

    @Override // s4.g6
    public final String k(Charset charset) {
        return new String(this.f17863u, 0, g(), charset);
    }

    @Override // s4.g6
    public final void l(g7 g7Var) {
        ((i6) g7Var).E(this.f17863u, g());
    }

    @Override // s4.g6
    public final boolean m() {
        return k9.d(this.f17863u, 0, g());
    }

    public void q() {
    }
}
