package m4;

import h2.a0;
import java.util.Arrays;
import java.util.Objects;
import m2.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class d1 extends j1 {

    /* renamed from: n */
    public bp2 f7168n;

    /* renamed from: o */
    public c1 f7169o;

    @Override // m4.j1
    public final long a(dd ddVar) {
        Object obj = ddVar.f7311d;
        if (((byte[]) obj)[0] == -1) {
            int i10 = (((byte[]) obj)[2] & 255) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int s10 = a.s(ddVar, i10);
                ddVar.h(0);
                return s10;
            }
            ddVar.i(4);
            ddVar.y();
            int s102 = a.s(ddVar, i10);
            ddVar.h(0);
            return s102;
        }
        return -1L;
    }

    @Override // m4.j1
    public final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f7168n = null;
            this.f7169o = null;
        }
    }

    @Override // m4.j1
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(dd ddVar, long j3, a0 a0Var) {
        byte[] bArr = (byte[]) ddVar.f7311d;
        bp2 bp2Var = this.f7168n;
        if (bp2Var == null) {
            bp2 bp2Var2 = new bp2(bArr, 17);
            this.f7168n = bp2Var2;
            a0Var.f4956s = bp2Var2.c(Arrays.copyOfRange(bArr, 9, ddVar.f7310c), null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            u8 c10 = h32.c(ddVar);
            bp2 e10 = bp2Var.e(c10);
            this.f7168n = e10;
            this.f7169o = new c1(e10, c10);
            return true;
        } else {
            if (!(bArr[0] == -1)) {
                return true;
            }
            c1 c1Var = this.f7169o;
            if (c1Var != null) {
                c1Var.f6678u = j3;
                a0Var.f4957t = c1Var;
            }
            Objects.requireNonNull((t) a0Var.f4956s);
            return false;
        }
    }
}
