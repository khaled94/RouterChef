package u6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: s */
    public final List<E> f19286s;

    public b0(List<E> list) {
        this.f19286s = Collections.unmodifiableList(list);
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        this.f19286s.add(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e10) {
        return this.f19286s.add(e10);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f19286s.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.f19286s.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f19286s.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19286s.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f19286s.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f19286s.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i10) {
        return this.f19286s.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f19286s.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f19286s.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f19286s.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f19286s.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f19286s.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.f19286s.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i10) {
        return this.f19286s.listIterator(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        return this.f19286s.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f19286s.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f19286s.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f19286s.retainAll(collection);
    }

    @Override // java.util.List
    public final E set(int i10, E e10) {
        return this.f19286s.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f19286s.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i10, int i11) {
        return this.f19286s.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f19286s.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f19286s.toArray(tArr);
    }
}
