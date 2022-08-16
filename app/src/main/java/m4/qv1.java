package m4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class qv1 extends AbstractSet {

    /* renamed from: s */
    public final /* synthetic */ tv1 f13004s;

    public qv1(tv1 tv1Var) {
        this.f13004s = tv1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13004s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f13004s.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        tv1 tv1Var = this.f13004s;
        Map c10 = tv1Var.c();
        return c10 != null ? c10.keySet().iterator() : new lv1(tv1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map c10 = this.f13004s.c();
        if (c10 != null) {
            return c10.keySet().remove(obj);
        }
        Object j3 = this.f13004s.j(obj);
        Object obj2 = tv1.B;
        return j3 != tv1.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13004s.size();
    }
}
