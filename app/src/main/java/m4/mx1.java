package m4;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class mx1<E> extends pw1<E> {
    public static final Object[] A;
    public static final mx1<Object> B;

    /* renamed from: v */
    public final transient Object[] f11347v;

    /* renamed from: w */
    public final transient int f11348w;

    /* renamed from: x */
    public final transient Object[] f11349x;
    public final transient int y;

    /* renamed from: z */
    public final transient int f11350z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new mx1<>(objArr, 0, objArr, 0, 0);
    }

    public mx1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11347v = objArr;
        this.f11348w = i10;
        this.f11349x = objArr2;
        this.y = i11;
        this.f11350z = i12;
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f11349x;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int d5 = zv1.d(obj);
        while (true) {
            int i10 = d5 & this.y;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d5 = i10 + 1;
        }
    }

    @Override // m4.bw1
    public final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f11347v, 0, objArr, i10, this.f11350z);
        return i10 + this.f11350z;
    }

    @Override // m4.bw1
    public final int e() {
        return this.f11350z;
    }

    @Override // m4.bw1
    public final int g() {
        return 0;
    }

    @Override // m4.pw1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11348w;
    }

    @Override // m4.bw1
    public final sx1<E> i() {
        return h().listIterator(0);
    }

    @Override // m4.pw1, m4.bw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // m4.bw1
    public final Object[] l() {
        return this.f11347v;
    }

    @Override // m4.pw1
    public final gw1<E> o() {
        return gw1.p(this.f11347v, this.f11350z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11350z;
    }
}
