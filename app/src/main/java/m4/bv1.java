package m4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class bv1 extends wu1 implements SortedSet {

    /* renamed from: u */
    public final /* synthetic */ gv1 f6636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv1(gv1 gv1Var, SortedMap sortedMap) {
        super(gv1Var, sortedMap);
        this.f6636u = gv1Var;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f15127s;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return d().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new bv1(this.f6636u, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return d().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new bv1(this.f6636u, d().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new bv1(this.f6636u, d().tailMap(obj));
    }
}
