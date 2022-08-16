package t4;

import java.util.Objects;
import l0.g;

/* loaded from: classes.dex */
public final class b extends t {

    /* renamed from: w */
    public static final b f18636w = new b(new Object[0], 0);

    /* renamed from: u */
    public final transient Object[] f18637u;

    /* renamed from: v */
    public final transient int f18638v;

    public b(Object[] objArr, int i10) {
        this.f18637u = objArr;
        this.f18638v = i10;
    }

    @Override // t4.t, t4.q
    public final int d(Object[] objArr) {
        System.arraycopy(this.f18637u, 0, objArr, 0, this.f18638v);
        return this.f18638v;
    }

    @Override // t4.q
    public final int e() {
        return this.f18638v;
    }

    @Override // t4.q
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g.i(i10, this.f18638v);
        Object obj = this.f18637u[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // t4.q
    public final Object[] h() {
        return this.f18637u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18638v;
    }
}
