package m4;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public final class s92<F, T> extends AbstractList<T> {

    /* renamed from: s */
    public final List<F> f13558s;

    public s92(List list) {
        this.f13558s = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i10) {
        T t10 = (T) mk.b(((Integer) this.f13558s.get(i10)).intValue());
        return t10 == null ? (T) mk.AD_FORMAT_TYPE_UNSPECIFIED : t10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13558s.size();
    }
}
