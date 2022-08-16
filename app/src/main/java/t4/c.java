package t4;

import java.util.AbstractMap;
import java.util.Objects;
import l0.g;

/* loaded from: classes.dex */
public final class c extends t {

    /* renamed from: u */
    public final /* synthetic */ d f18639u;

    public c(d dVar) {
        this.f18639u = dVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        g.i(i10, this.f18639u.f18642w);
        d dVar = this.f18639u;
        int i11 = i10 + i10;
        Object obj = dVar.f18641v[i11];
        Objects.requireNonNull(obj);
        Object obj2 = dVar.f18641v[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18639u.f18642w;
    }
}
