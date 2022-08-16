package t4;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class d extends w {

    /* renamed from: u */
    public final transient v f18640u;

    /* renamed from: v */
    public final transient Object[] f18641v;

    /* renamed from: w */
    public final transient int f18642w;

    public d(v vVar, Object[] objArr, int i10) {
        this.f18640u = vVar;
        this.f18641v = objArr;
        this.f18642w = i10;
    }

    @Override // t4.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f18640u.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // t4.q
    public final int d(Object[] objArr) {
        return i().d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // t4.w
    public final t k() {
        return new c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18642w;
    }
}
