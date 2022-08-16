package t4;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class e extends w {

    /* renamed from: u */
    public final transient v f18643u;

    /* renamed from: v */
    public final transient t f18644v;

    public e(v vVar, t tVar) {
        this.f18643u = vVar;
        this.f18644v = tVar;
    }

    @Override // t4.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f18643u.get(obj) != null;
    }

    @Override // t4.q
    public final int d(Object[] objArr) {
        return this.f18644v.d(objArr);
    }

    @Override // t4.w
    public final t i() {
        return this.f18644v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f18644v.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((g) this.f18643u).f18650x;
    }
}
