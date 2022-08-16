package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class gw1<E> extends bw1<E> implements List<E>, RandomAccess {

    /* renamed from: t */
    public static final pu1 f9058t = new ew1(gx1.f9060w, 0);

    public static <E> dw1<E> o() {
        return new dw1<>(4);
    }

    public static <E> gw1<E> p(Object[] objArr, int i10) {
        return i10 == 0 ? (gw1<E>) gx1.f9060w : new gx1(objArr, i10);
    }

    public static <E> gw1<E> q(Collection<? extends E> collection) {
        if (!(collection instanceof bw1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            q40.f(array, length);
            return p(array, length);
        }
        gw1<E> h10 = ((bw1) collection).h();
        if (!h10.k()) {
            return h10;
        }
        Object[] array2 = h10.toArray();
        return p(array2, array2.length);
    }

    public static <E> gw1<E> s(E e10) {
        Object[] objArr = {e10};
        q40.f(objArr, 1);
        return p(objArr, 1);
    }

    public static <E> gw1<E> t(E e10, E e11) {
        Object[] objArr = {e10, e11};
        q40.f(objArr, 2);
        return p(objArr, 2);
    }

    public static <E> gw1<E> u(E e10, E e11, E e12, E e13, E e14) {
        Object[] objArr = {e10, e11, e12, e13, e14};
        q40.f(objArr, 5);
        return p(objArr, 5);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // m4.bw1
    public int d(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != r5) goto L4
            goto L59
        L4:
            boolean r1 = r6 instanceof java.util.List
            if (r1 != 0) goto L9
            goto L5a
        L9:
            java.util.List r6 = (java.util.List) r6
            int r1 = r5.size()
            int r2 = r6.size()
            if (r1 == r2) goto L16
            goto L5a
        L16:
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L2f
            r2 = r0
        L1b:
            if (r2 >= r1) goto L59
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = m4.js.a(r3, r4)
            if (r3 != 0) goto L2c
            goto L5a
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            m4.pu1 r1 = r5.listIterator(r0)
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L44
            goto L5a
        L44:
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.next()
            boolean r2 = m4.js.a(r2, r3)
            if (r2 != 0) goto L37
            goto L5a
        L53:
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L5a
        L59:
            r0 = 1
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.gw1.equals(java.lang.Object):boolean");
    }

    @Override // m4.bw1
    @Deprecated
    public final gw1<E> h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // m4.bw1
    public final sx1<E> i() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: m */
    public gw1<E> subList(int i10, int i11) {
        hu1.g(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? (gw1<E>) gx1.f9060w : new fw1(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public final pu1 listIterator(int i10) {
        hu1.b(i10, size());
        return isEmpty() ? f9058t : new ew1(this, i10);
    }
}
