package m4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class av1 extends tu1 implements SortedMap {
    @CheckForNull

    /* renamed from: w */
    public SortedSet f6276w;

    /* renamed from: x */
    public final /* synthetic */ gv1 f6277x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av1(gv1 gv1Var, SortedMap sortedMap) {
        super(gv1Var, sortedMap);
        this.f6277x = gv1Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f14168u;
    }

    public SortedSet c() {
        return new bv1(this.f6277x, b());
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return b().comparator();
    }

    /* renamed from: d */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f6276w;
        if (sortedSet == null) {
            SortedSet c10 = c();
            this.f6276w = c10;
            return c10;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new av1(this.f6277x, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new av1(this.f6277x, b().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new av1(this.f6277x, b().tailMap(obj));
    }
}
