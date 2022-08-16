package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gx1<E> extends gw1<E> {

    /* renamed from: w */
    public static final gw1<Object> f9060w = new gx1(new Object[0], 0);

    /* renamed from: u */
    public final transient Object[] f9061u;

    /* renamed from: v */
    public final transient int f9062v;

    public gx1(Object[] objArr, int i10) {
        this.f9061u = objArr;
        this.f9062v = i10;
    }

    @Override // m4.gw1, m4.bw1
    public final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f9061u, 0, objArr, i10, this.f9062v);
        return i10 + this.f9062v;
    }

    @Override // m4.bw1
    public final int e() {
        return this.f9062v;
    }

    @Override // m4.bw1
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i10) {
        hu1.a(i10, this.f9062v);
        E e10 = (E) this.f9061u[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // m4.bw1
    public final boolean k() {
        return false;
    }

    @Override // m4.bw1
    public final Object[] l() {
        return this.f9061u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9062v;
    }
}
