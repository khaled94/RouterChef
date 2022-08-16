package i6;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import s4.d1;
import s4.e1;
import s4.j1;
import s4.k1;
import s4.k2;
import s4.m1;
import s4.n1;
import s4.o0;
import s4.p1;
import s4.q1;
import s4.x1;
import y4.g4;

/* loaded from: classes.dex */
public final class a implements g4 {

    /* renamed from: a */
    public final /* synthetic */ k2 f5275a;

    public a(k2 k2Var) {
        this.f5275a = k2Var;
    }

    @Override // y4.g4
    public final void U(String str) {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new j1(k2Var, str));
    }

    @Override // y4.g4
    public final long a() {
        return this.f5275a.d();
    }

    @Override // y4.g4
    public final int b(String str) {
        return this.f5275a.c(str);
    }

    @Override // y4.g4
    public final void c(String str, String str2, Bundle bundle) {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new e1(k2Var, str, str2, bundle));
    }

    @Override // y4.g4
    public final List<Bundle> d(String str, String str2) {
        return this.f5275a.g(str, str2);
    }

    @Override // y4.g4
    public final Map<String, Object> e(String str, String str2, boolean z10) {
        return this.f5275a.h(str, str2, z10);
    }

    @Override // y4.g4
    public final String f() {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new n1(k2Var, o0Var));
        return o0Var.e0(50L);
    }

    @Override // y4.g4
    public final void g(Bundle bundle) {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new d1(k2Var, bundle));
    }

    @Override // y4.g4
    public final String h() {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new q1(k2Var, o0Var));
        return o0Var.e0(500L);
    }

    @Override // y4.g4
    public final String i() {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new p1(k2Var, o0Var));
        return o0Var.e0(500L);
    }

    @Override // y4.g4
    public final void j(String str, String str2, Bundle bundle) {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new x1(k2Var, str, str2, bundle));
    }

    @Override // y4.g4
    public final String n() {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        o0 o0Var = new o0();
        k2Var.b(new m1(k2Var, o0Var));
        return o0Var.e0(500L);
    }

    @Override // y4.g4
    public final void s(String str) {
        k2 k2Var = this.f5275a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new k1(k2Var, str));
    }
}
