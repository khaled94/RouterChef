package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class wu1 extends ww1 {

    /* renamed from: t */
    public final /* synthetic */ gv1 f15114t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu1(gv1 gv1Var, Map map) {
        super(map);
        this.f15114t = gv1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            vu1 vu1Var = (vu1) it;
            if (vu1Var.hasNext()) {
                vu1Var.next();
                vu1Var.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f15127s.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f15127s.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15127s.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vu1(this, this.f15127s.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f15127s.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f15114t.f9055w -= size;
            return size > 0;
        }
        return false;
    }
}
