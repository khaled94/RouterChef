package m4;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class yu1 extends bv1 implements NavigableSet {

    /* renamed from: v */
    public final /* synthetic */ gv1 f15909v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu1(gv1 gv1Var, NavigableMap navigableMap) {
        super(gv1Var, navigableMap);
        this.f15909v = gv1Var;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15127s)).ceilingKey(obj);
    }

    @Override // m4.bv1
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f15127s);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((wu1) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new yu1(this.f15909v, ((NavigableMap) ((SortedMap) this.f15127s)).descendingMap());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15127s)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new yu1(this.f15909v, ((NavigableMap) ((SortedMap) this.f15127s)).headMap(obj, z10));
    }

    @Override // m4.bv1, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15127s)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15127s)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollFirst() {
        vu1 vu1Var = (vu1) iterator();
        if (vu1Var.hasNext()) {
            Object next = vu1Var.next();
            vu1Var.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new yu1(this.f15909v, ((NavigableMap) ((SortedMap) this.f15127s)).subMap(obj, z10, obj2, z11));
    }

    @Override // m4.bv1, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new yu1(this.f15909v, ((NavigableMap) ((SortedMap) this.f15127s)).tailMap(obj, z10));
    }

    @Override // m4.bv1, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
