package t4;

import java.util.Objects;
import l0.g;

/* loaded from: classes.dex */
public final class f extends t {

    /* renamed from: u */
    public final transient Object[] f18645u;

    /* renamed from: v */
    public final transient int f18646v;

    /* renamed from: w */
    public final transient int f18647w;

    public f(Object[] objArr, int i10, int i11) {
        this.f18645u = objArr;
        this.f18646v = i10;
        this.f18647w = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g.i(i10, this.f18647w);
        Object obj = this.f18645u[i10 + i10 + this.f18646v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18647w;
    }
}
