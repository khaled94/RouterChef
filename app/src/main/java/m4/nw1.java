package m4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class nw1<K, V> extends kv1<K, V> implements Serializable {

    /* renamed from: v */
    public final transient kw1<K, ? extends bw1<V>> f11935v;

    /* renamed from: w */
    public final transient int f11936w;

    public nw1(kw1<K, ? extends bw1<V>> kw1Var, int i10) {
        this.f11935v = kw1Var;
        this.f11936w = i10;
    }

    @Override // m4.zw1
    public final int b() {
        throw null;
    }

    @Override // m4.jv1
    public final Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // m4.jv1
    public final Set<K> d() {
        throw new AssertionError("unreachable");
    }

    @Override // m4.jv1
    public final boolean e(@CheckForNull Object obj) {
        return obj != null && super.e(obj);
    }

    @Override // m4.zw1
    @Deprecated
    public final void m() {
        throw null;
    }

    @Override // m4.jv1, m4.zw1
    public final /* synthetic */ Map p() {
        return this.f11935v;
    }
}
