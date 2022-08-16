package t4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import l0.g;

/* loaded from: classes.dex */
public abstract class t extends q implements List, RandomAccess {

    /* renamed from: t */
    public static final r f18662t = new r(b.f18636w, 0);

    public static t k(Object[] objArr, int i10) {
        return i10 == 0 ? b.f18636w : new b(objArr, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // t4.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // t4.q
    public int d(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        boolean z10;
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(list instanceof RandomAccess)) {
                h listIterator = listIterator(0);
                Iterator it = list.iterator();
                do {
                    r rVar = (r) listIterator;
                    if (rVar.hasNext()) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        Object next = rVar.next();
                        Object next2 = it.next();
                        if (next == next2 || (next != null && next.equals(next2))) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                    } else if (it.hasNext()) {
                        return false;
                    }
                } while (z10);
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = get(i10);
                Object obj3 = list.get(i10);
                if (!(obj2 == obj3 || (obj2 != null && obj2.equals(obj3)))) {
                    return false;
                }
            }
        }
        return true;
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

    /* renamed from: i */
    public t subList(int i10, int i11) {
        g.k(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? b.f18636w : new s(this, i10, i12);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public final h listIterator(int i10) {
        g.j(i10, size());
        return isEmpty() ? f18662t : new r(this, i10);
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

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
