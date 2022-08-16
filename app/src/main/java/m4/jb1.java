package m4;

import m4.kp0;

/* loaded from: classes.dex */
public final class jb1<AdT, AdapterT, ListenerT extends kp0> implements nd2<ib1<AdT, AdapterT, ListenerT>> {

    /* renamed from: a */
    public final vd2<zo1> f9897a;

    /* renamed from: b */
    public final vd2<uz1> f9898b;

    /* renamed from: c */
    public final vd2<g71<AdapterT, ListenerT>> f9899c;

    /* renamed from: d */
    public final vd2<l71<AdT, AdapterT, ListenerT>> f9900d;

    public jb1(vd2<zo1> vd2Var, vd2<uz1> vd2Var2, vd2<g71<AdapterT, ListenerT>> vd2Var3, vd2<l71<AdT, AdapterT, ListenerT>> vd2Var4) {
        this.f9897a = vd2Var;
        this.f9898b = vd2Var2;
        this.f9899c = vd2Var3;
        this.f9900d = vd2Var4;
    }

    /* renamed from: b */
    public final ib1<AdT, AdapterT, ListenerT> a() {
        return new ib1<>(this.f9897a.a(), this.f9898b.a(), this.f9899c.a(), this.f9900d.a());
    }
}
