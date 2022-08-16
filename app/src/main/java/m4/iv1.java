package m4;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class iv1 extends AbstractCollection {

    /* renamed from: s */
    public final /* synthetic */ jv1 f9754s;

    public iv1(jv1 jv1Var) {
        this.f9754s = jv1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f9754s.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f9754s.e(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f9754s.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f9754s.b();
    }
}
