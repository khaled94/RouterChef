package x7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends l implements Iterable<l> {

    /* renamed from: s */
    public final List<l> f20086s = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f20086s.equals(this.f20086s));
    }

    public final int hashCode() {
        return this.f20086s.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        return this.f20086s.iterator();
    }
}
