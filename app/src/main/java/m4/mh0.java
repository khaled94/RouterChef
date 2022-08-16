package m4;

import android.content.Context;
import android.text.TextUtils;
import h4.a;
import java.util.List;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import k4.b;
import l3.s;
import n3.f;
import n3.g1;
import n3.k1;
import n3.s1;
import n3.v;
import z3.k;

/* loaded from: classes.dex */
public final class mh0 extends sp {
    public final x21 A;
    public final eu B;
    @GuardedBy("this")
    public boolean C = false;

    /* renamed from: s */
    public final Context f11198s;

    /* renamed from: t */
    public final o90 f11199t;

    /* renamed from: u */
    public final h01 f11200u;

    /* renamed from: v */
    public final g71<ym1, p81> f11201v;

    /* renamed from: w */
    public final zb1 f11202w;

    /* renamed from: x */
    public final j21 f11203x;
    public final x70 y;

    /* renamed from: z */
    public final k01 f11204z;

    public mh0(Context context, o90 o90Var, h01 h01Var, g71<ym1, p81> g71Var, zb1 zb1Var, j21 j21Var, x70 x70Var, k01 k01Var, x21 x21Var, eu euVar) {
        this.f11198s = context;
        this.f11199t = o90Var;
        this.f11200u = h01Var;
        this.f11201v = g71Var;
        this.f11202w = zb1Var;
        this.f11203x = j21Var;
        this.y = x70Var;
        this.f11204z = k01Var;
        this.A = x21Var;
        this.B = euVar;
    }

    @Override // m4.tp
    public final void I0(jr jrVar) {
        x70 x70Var = this.y;
        Context context = this.f11198s;
        Objects.requireNonNull(x70Var);
        l70 a10 = n70.b(context).a();
        ((j70) a10.f10667t).b(-1, ((a) a10.f10666s).a());
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8080e0)).booleanValue() || !x70Var.l(context) || !x70.m(context)) {
            return;
        }
        synchronized (x70Var.f15239l) {
        }
    }

    @Override // m4.tp
    public final synchronized void O2(boolean z10) {
        f fVar = s.B.f5794h;
        synchronized (fVar) {
            fVar.f16462a = z10;
        }
    }

    @Override // m4.tp
    public final synchronized void T2(float f10) {
        f fVar = s.B.f5794h;
        synchronized (fVar) {
            fVar.f16463b = f10;
        }
    }

    @Override // m4.tp
    public final void X0(k4.a aVar, String str) {
        String str2;
        if (aVar == null) {
            str2 = "Wrapped context is null. Failed to open debug menu.";
        } else {
            Context context = (Context) b.e0(aVar);
            if (context != null) {
                v vVar = new v(context);
                vVar.f16580d = str;
                vVar.f16581e = this.f11199t.f12051s;
                vVar.b();
                return;
            }
            str2 = "Context is null. Failed to open debug menu.";
        }
        g1.g(str2);
    }

    @Override // m4.tp
    public final void Y(String str) {
        this.f11202w.a(str);
    }

    @Override // m4.tp
    public final synchronized void a3(String str) {
        es.c(this.f11198s);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8144m2)).booleanValue()) {
                s.B.f5797k.a(this.f11198s, this.f11199t, true, null, str, null, null);
            }
        }
    }

    @Override // m4.tp
    public final synchronized float b() {
        return s.B.f5794h.a();
    }

    @Override // m4.tp
    public final void c2(xy xyVar) {
        j21 j21Var = this.f11203x;
        j21Var.f9812e.b(new hb(j21Var, xyVar, 2, null), j21Var.f9817j);
    }

    @Override // m4.tp
    public final String d() {
        return this.f11199t.f12051s;
    }

    @Override // m4.tp
    public final List<ry> e() {
        return this.f11203x.a();
    }

    @Override // m4.tp
    public final void h() {
        this.f11203x.p = false;
    }

    @Override // m4.tp
    public final synchronized void i() {
        if (this.C) {
            g1.j("Mobile ads is initialized already.");
            return;
        }
        es.c(this.f11198s);
        s sVar = s.B;
        sVar.f5793g.e(this.f11198s, this.f11199t);
        sVar.f5795i.d(this.f11198s);
        this.C = true;
        this.f11203x.b();
        zb1 zb1Var = this.f11202w;
        Objects.requireNonNull(zb1Var);
        ((k1) sVar.f5793g.c()).z(new ne(zb1Var, 3));
        zb1Var.f16085d.execute(new ib(zb1Var, 4));
        yr<Boolean> yrVar = es.f8152n2;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            final k01 k01Var = this.f11204z;
            Objects.requireNonNull(k01Var);
            ((k1) sVar.f5793g.c()).z(new i4.b(k01Var, 2));
            k01Var.f10229c.execute(new Runnable() { // from class: m4.j01
                @Override // java.lang.Runnable
                public final void run() {
                    k01.this.a();
                }
            });
        }
        this.A.a();
        if (((Boolean) joVar.f10148c.a(es.f8109h6)).booleanValue()) {
            u90.f14294a.execute(new n3.s(this, 3));
        }
        if (!((Boolean) joVar.f10148c.a(es.H6)).booleanValue()) {
            return;
        }
        u90.f14294a.execute(new m8(this, 2));
    }

    @Override // m4.tp
    public final void o3(f10 f10Var) {
        this.f11200u.f9073b.compareAndSet(null, f10Var);
    }

    @Override // m4.tp
    public final void q2(bq bqVar) {
        this.A.b(bqVar, w21.API);
    }

    @Override // m4.tp
    public final synchronized boolean r() {
        return s.B.f5794h.c();
    }

    @Override // m4.tp
    public final void y0(String str, k4.a aVar) {
        String str2;
        k kVar;
        es.c(this.f11198s);
        yr<Boolean> yrVar = es.f8167p2;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            s1 s1Var = s.B.f5789c;
            str2 = s1.L(this.f11198s);
        } else {
            str2 = "";
        }
        boolean z10 = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) joVar.f10148c.a(es.f8144m2)).booleanValue();
        yr<Boolean> yrVar2 = es.x0;
        boolean booleanValue2 = booleanValue | ((Boolean) joVar.f10148c.a(yrVar2)).booleanValue();
        if (((Boolean) joVar.f10148c.a(yrVar2)).booleanValue()) {
            kVar = new k(this, (Runnable) b.e0(aVar), 3);
        } else {
            kVar = null;
            z10 = booleanValue2;
        }
        k kVar2 = kVar;
        if (!z10) {
            return;
        }
        s.B.f5797k.a(this.f11198s, this.f11199t, true, null, str3, null, kVar2);
    }
}
