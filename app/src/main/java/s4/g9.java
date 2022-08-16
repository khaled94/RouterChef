package s4;

import m4.yb2;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g9 extends yb2 {
    public g9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // m4.yb2
    public final double b(Object obj, long j3) {
        return Double.longBitsToDouble(v(obj, j3));
    }

    @Override // m4.yb2
    public final float d(Object obj, long j3) {
        return Float.intBitsToFloat(t(obj, j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.yb2
    public final void f(Object obj, long j3, boolean z10) {
        if (i9.f17928g) {
            i9.c(obj, j3, z10);
        } else {
            i9.d(obj, j3, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // m4.yb2
    public final void h(Object obj, long j3, byte b10) {
        if (i9.f17928g) {
            i9.c(obj, j3, b10);
        } else {
            i9.d(obj, j3, b10);
        }
    }

    @Override // m4.yb2
    public final void i(Object obj, long j3, double d5) {
        D(obj, j3, Double.doubleToLongBits(d5));
    }

    @Override // m4.yb2
    public final void l(Object obj, long j3, float f10) {
        B(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // m4.yb2
    public final boolean n(Object obj, long j3) {
        return i9.f17928g ? i9.s(obj, j3) : i9.t(obj, j3);
    }
}
