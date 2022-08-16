package m4;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class wb2 extends yb2 {
    public wb2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // m4.yb2
    public final byte a(long j3) {
        return Memory.peekByte((int) j3);
    }

    @Override // m4.yb2
    public final double c(Object obj, long j3) {
        return Double.longBitsToDouble(y(obj, j3));
    }

    @Override // m4.yb2
    public final float e(Object obj, long j3) {
        return Float.intBitsToFloat(w(obj, j3));
    }

    @Override // m4.yb2
    public final void g(long j3, byte[] bArr, long j10, long j11) {
        Memory.peekByteArray((int) j3, bArr, (int) j10, (int) j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.yb2
    public final void j(Object obj, long j3, boolean z10) {
        if (zb2.f16094h) {
            zb2.d(obj, j3, z10);
        } else {
            zb2.e(obj, j3, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // m4.yb2
    public final void k(Object obj, long j3, byte b10) {
        if (zb2.f16094h) {
            zb2.d(obj, j3, b10);
        } else {
            zb2.e(obj, j3, b10);
        }
    }

    @Override // m4.yb2
    public final void m(Object obj, long j3, double d5) {
        G(obj, j3, Double.doubleToLongBits(d5));
    }

    @Override // m4.yb2
    public final void p(Object obj, long j3, float f10) {
        E(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // m4.yb2
    public final boolean r(Object obj, long j3) {
        return zb2.f16094h ? zb2.v(obj, j3) : zb2.w(obj, j3);
    }
}
