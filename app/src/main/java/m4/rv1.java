package m4;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rv1 extends hv1 {

    /* renamed from: s */
    public final Object f13441s;

    /* renamed from: t */
    public int f13442t;

    /* renamed from: u */
    public final /* synthetic */ tv1 f13443u;

    public rv1(tv1 tv1Var, int i10) {
        this.f13443u = tv1Var;
        Object[] objArr = tv1Var.f14182u;
        Objects.requireNonNull(objArr);
        this.f13441s = objArr[i10];
        this.f13442t = i10;
    }

    public final void a() {
        int i10 = this.f13442t;
        if (i10 == -1 || i10 >= this.f13443u.size() || !js.a(this.f13441s, tv1.a(this.f13443u, this.f13442t))) {
            tv1 tv1Var = this.f13443u;
            Object obj = this.f13441s;
            Object obj2 = tv1.B;
            this.f13442t = tv1Var.h(obj);
        }
    }

    @Override // m4.hv1, java.util.Map.Entry
    public final Object getKey() {
        return this.f13441s;
    }

    @Override // m4.hv1, java.util.Map.Entry
    public final Object getValue() {
        Map c10 = this.f13443u.c();
        if (c10 != null) {
            return c10.get(this.f13441s);
        }
        a();
        int i10 = this.f13442t;
        if (i10 != -1) {
            return tv1.b(this.f13443u, i10);
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map c10 = this.f13443u.c();
        if (c10 != null) {
            return c10.put(this.f13441s, obj);
        }
        a();
        int i10 = this.f13442t;
        if (i10 == -1) {
            this.f13443u.put(this.f13441s, obj);
            return null;
        }
        Object b10 = tv1.b(this.f13443u, i10);
        tv1 tv1Var = this.f13443u;
        int i11 = this.f13442t;
        Object[] objArr = tv1Var.f14183v;
        Objects.requireNonNull(objArr);
        objArr[i11] = obj;
        return b10;
    }
}
