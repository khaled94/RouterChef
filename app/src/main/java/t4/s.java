package t4;

import javax.annotation.CheckForNull;
import l0.g;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: u */
    public final transient int f18659u;

    /* renamed from: v */
    public final transient int f18660v;

    /* renamed from: w */
    public final /* synthetic */ t f18661w;

    public s(t tVar, int i10, int i11) {
        this.f18661w = tVar;
        this.f18659u = i10;
        this.f18660v = i11;
    }

    @Override // t4.q
    public final int e() {
        return this.f18661w.g() + this.f18659u + this.f18660v;
    }

    @Override // t4.q
    public final int g() {
        return this.f18661w.g() + this.f18659u;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g.i(i10, this.f18660v);
        return this.f18661w.get(i10 + this.f18659u);
    }

    @Override // t4.q
    @CheckForNull
    public final Object[] h() {
        return this.f18661w.h();
    }

    @Override // t4.t
    /* renamed from: i */
    public final t subList(int i10, int i11) {
        g.k(i10, i11, this.f18660v);
        t tVar = this.f18661w;
        int i12 = this.f18659u;
        return tVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18660v;
    }
}
