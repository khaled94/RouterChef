package m4;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;
import k4.b;
import s4.g1;
import s4.h1;
import s4.j1;
import s4.k1;
import s4.k2;
import s4.m1;
import s4.n1;
import s4.o0;
import s4.p1;
import s4.q1;
import x4.a;

/* loaded from: classes.dex */
public final class w00 extends df0 {

    /* renamed from: s */
    public final a f14816s;

    public w00(a aVar) {
        this.f14816s = aVar;
    }

    @Override // m4.ef0
    public final void J2(String str) {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new k1(k2Var, str));
    }

    @Override // m4.ef0
    public final void L3(String str, Bundle bundle) {
        this.f14816s.a("am", str, bundle);
    }

    @Override // m4.ef0
    public final void a0(String str) {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new j1(k2Var, str));
    }

    @Override // m4.ef0
    public final String b() {
        return this.f14816s.f20026a.f17955f;
    }

    @Override // m4.ef0
    public final void b2(Bundle bundle) {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new h1(k2Var, bundle));
    }

    @Override // m4.ef0
    public final long c() {
        return this.f14816s.f20026a.d();
    }

    @Override // m4.ef0
    public final String d() {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new n1(k2Var, o0Var));
        return o0Var.e0(50L);
    }

    @Override // m4.ef0
    public final String e() {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new q1(k2Var, o0Var));
        return o0Var.e0(500L);
    }

    @Override // m4.ef0
    public final String f() {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new p1(k2Var, o0Var));
        return o0Var.e0(500L);
    }

    @Override // m4.ef0
    public final void g3(k4.a aVar, String str, String str2) {
        a aVar2 = this.f14816s;
        Activity activity = aVar != null ? (Activity) b.e0(aVar) : null;
        k2 k2Var = aVar2.f20026a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new g1(k2Var, activity, str, str2));
    }

    @Override // m4.ef0
    public final String h() {
        k2 k2Var = this.f14816s.f20026a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new m1(k2Var, o0Var));
        return o0Var.e0(500L);
    }
}
