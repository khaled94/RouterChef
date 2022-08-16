package m4;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class sv1 extends AbstractCollection {

    /* renamed from: s */
    public final /* synthetic */ tv1 f13831s;

    public sv1(tv1 tv1Var) {
        this.f13831s = tv1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f13831s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        tv1 tv1Var = this.f13831s;
        Map c10 = tv1Var.c();
        return c10 != null ? c10.values().iterator() : new nv1(tv1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f13831s.size();
    }
}
