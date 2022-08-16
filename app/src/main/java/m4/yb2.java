package m4;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class yb2 {

    /* renamed from: a */
    public final Unsafe f15651a;

    public long A(Field field) {
        return this.f15651a.objectFieldOffset(field);
    }

    public void B(Object obj, long j3, int i10) {
        this.f15651a.putInt(obj, j3, i10);
    }

    public Object C(Object obj, long j3) {
        return this.f15651a.getObject(obj, j3);
    }

    public void D(Object obj, long j3, long j10) {
        this.f15651a.putLong(obj, j3, j10);
    }

    public void E(Object obj, long j3, int i10) {
        this.f15651a.putInt(obj, j3, i10);
    }

    public void F(Object obj, long j3, Object obj2) {
        this.f15651a.putObject(obj, j3, obj2);
    }

    public void G(Object obj, long j3, long j10) {
        this.f15651a.putLong(obj, j3, j10);
    }

    public void H(Object obj, long j3, Object obj2) {
        this.f15651a.putObject(obj, j3, obj2);
    }

    public abstract byte a(long j3);

    public abstract double b(Object obj, long j3);

    public abstract double c(Object obj, long j3);

    public abstract float d(Object obj, long j3);

    public abstract float e(Object obj, long j3);

    public abstract void f(Object obj, long j3, boolean z10);

    public abstract void g(long j3, byte[] bArr, long j10, long j11);

    public abstract void h(Object obj, long j3, byte b10);

    public abstract void i(Object obj, long j3, double d5);

    public abstract void j(Object obj, long j3, boolean z10);

    public abstract void k(Object obj, long j3, byte b10);

    public abstract void l(Object obj, long j3, float f10);

    public abstract void m(Object obj, long j3, double d5);

    public abstract boolean n(Object obj, long j3);

    public int o(Class cls) {
        return this.f15651a.arrayBaseOffset(cls);
    }

    public abstract void p(Object obj, long j3, float f10);

    public int q(Class cls) {
        return this.f15651a.arrayIndexScale(cls);
    }

    public abstract boolean r(Object obj, long j3);

    public int s(Class cls) {
        return this.f15651a.arrayBaseOffset(cls);
    }

    public int t(Object obj, long j3) {
        return this.f15651a.getInt(obj, j3);
    }

    public int u(Class cls) {
        return this.f15651a.arrayIndexScale(cls);
    }

    public long v(Object obj, long j3) {
        return this.f15651a.getLong(obj, j3);
    }

    public int w(Object obj, long j3) {
        return this.f15651a.getInt(obj, j3);
    }

    public long x(Field field) {
        return this.f15651a.objectFieldOffset(field);
    }

    public long y(Object obj, long j3) {
        return this.f15651a.getLong(obj, j3);
    }

    public Object z(Object obj, long j3) {
        return this.f15651a.getObject(obj, j3);
    }
}
