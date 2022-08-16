package m4;

import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class fw1 extends gw1 {

    /* renamed from: u */
    public final transient int f8663u;

    /* renamed from: v */
    public final transient int f8664v;

    /* renamed from: w */
    public final /* synthetic */ gw1 f8665w;

    public fw1(gw1 gw1Var, int i10, int i11) {
        this.f8665w = gw1Var;
        this.f8663u = i10;
        this.f8664v = i11;
    }

    @Override // m4.bw1
    public final int e() {
        return this.f8665w.g() + this.f8663u + this.f8664v;
    }

    @Override // m4.bw1
    public final int g() {
        return this.f8665w.g() + this.f8663u;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        hu1.a(i10, this.f8664v);
        return this.f8665w.get(i10 + this.f8663u);
    }

    @Override // m4.bw1
    public final boolean k() {
        return true;
    }

    @Override // m4.bw1
    @CheckForNull
    public final Object[] l() {
        return this.f8665w.l();
    }

    @Override // m4.gw1
    /* renamed from: m */
    public final gw1 subList(int i10, int i11) {
        hu1.g(i10, i11, this.f8664v);
        gw1 gw1Var = this.f8665w;
        int i12 = this.f8663u;
        return gw1Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8664v;
    }
}
