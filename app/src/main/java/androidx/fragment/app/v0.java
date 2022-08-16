package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
import androidx.lifecycle.z;
import c1.a;
import j1.b;
import j1.c;
import j1.d;

/* loaded from: classes.dex */
public final class v0 implements e, d, j0 {

    /* renamed from: s */
    public final o f1593s;

    /* renamed from: t */
    public final i0 f1594t;

    /* renamed from: u */
    public m f1595u = null;

    /* renamed from: v */
    public c f1596v = null;

    public v0(o oVar, i0 i0Var) {
        this.f1593s = oVar;
        this.f1594t = i0Var;
    }

    @Override // androidx.lifecycle.l
    public final g a() {
        e();
        return this.f1595u;
    }

    @Override // j1.d
    public final b c() {
        e();
        return this.f1596v.f5437b;
    }

    public final void d(g.b bVar) {
        this.f1595u.f(bVar);
    }

    public final void e() {
        if (this.f1595u == null) {
            this.f1595u = new m(this);
            c a10 = c.a(this);
            this.f1596v = a10;
            a10.b();
            z.a(this);
        }
    }

    @Override // androidx.lifecycle.e
    public final a n() {
        Application application;
        Context applicationContext = this.f1593s.W().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        c1.d dVar = new c1.d();
        if (application != null) {
            dVar.f2604a.put(f0.f1676s, application);
        }
        dVar.f2604a.put(z.f1734a, this);
        dVar.f2604a.put(z.f1735b, this);
        Bundle bundle = this.f1593s.f1521x;
        if (bundle != null) {
            dVar.f2604a.put(z.f1736c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.j0
    public final i0 w() {
        e();
        return this.f1594t;
    }
}
