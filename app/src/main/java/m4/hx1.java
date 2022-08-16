package m4;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hx1 extends gw1<Map.Entry> {

    /* renamed from: u */
    public final /* synthetic */ ix1 f9472u;

    public hx1(ix1 ix1Var) {
        this.f9472u = ix1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        hu1.a(i10, this.f9472u.f9764x);
        int i11 = i10 + i10;
        Object obj = this.f9472u.f9763w[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f9472u.f9763w[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // m4.bw1
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9472u.f9764x;
    }
}
