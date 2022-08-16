package m4;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class jx1<K> extends pw1<K> {

    /* renamed from: v */
    public final transient kw1<K, ?> f10213v;

    /* renamed from: w */
    public final transient gw1<K> f10214w;

    public jx1(kw1<K, ?> kw1Var, gw1<K> gw1Var) {
        this.f10213v = kw1Var;
        this.f10214w = gw1Var;
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f10213v.get(obj) != null;
    }

    @Override // m4.bw1
    public final int d(Object[] objArr, int i10) {
        return this.f10214w.d(objArr, i10);
    }

    @Override // m4.pw1, m4.bw1
    public final gw1<K> h() {
        return this.f10214w;
    }

    @Override // m4.bw1
    public final sx1<K> i() {
        return this.f10214w.listIterator(0);
    }

    @Override // m4.pw1, m4.bw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f10214w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10213v.size();
    }
}
