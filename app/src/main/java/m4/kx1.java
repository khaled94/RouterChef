package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kx1 extends gw1<Object> {

    /* renamed from: u */
    public final transient Object[] f10610u;

    /* renamed from: v */
    public final transient int f10611v;

    /* renamed from: w */
    public final transient int f10612w;

    public kx1(Object[] objArr, int i10, int i11) {
        this.f10610u = objArr;
        this.f10611v = i10;
        this.f10612w = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        hu1.a(i10, this.f10612w);
        Object obj = this.f10610u[i10 + i10 + this.f10611v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // m4.bw1
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10612w;
    }
}
