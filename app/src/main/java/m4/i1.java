package m4;

import e1.i;
import h2.a0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class i1 extends j1 {

    /* renamed from: o */
    public static final byte[] f9500o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f9501n;

    @Override // m4.j1
    public final long a(dd ddVar) {
        int i10;
        byte[] bArr = (byte[]) ddVar.f7311d;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArr[1] & 63;
        }
        int i14 = i11 >> 3;
        return d(i13 * (i14 >= 16 ? 2500 << i10 : i14 >= 12 ? 10000 << (i10 & 1) : (i14 & 3) == 3 ? 60000 : 10000 << i10));
    }

    @Override // m4.j1
    public final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f9501n = false;
        }
    }

    @Override // m4.j1
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(dd ddVar, long j3, a0 a0Var) {
        boolean z10 = true;
        if (this.f9501n) {
            Objects.requireNonNull((t) a0Var.f4956s);
            if (ddVar.l() != 1332770163) {
                z10 = false;
            }
            ddVar.h(0);
            return z10;
        }
        byte[] copyOf = Arrays.copyOf((byte[]) ddVar.f7311d, ddVar.f7310c);
        byte b10 = copyOf[9];
        List<byte[]> c10 = i.c(copyOf);
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "audio/opus";
        kq2Var.f10554w = b10 & 255;
        kq2Var.f10555x = 48000;
        kq2Var.f10544l = c10;
        a0Var.f4956s = new t(kq2Var);
        this.f9501n = true;
        return true;
    }
}
