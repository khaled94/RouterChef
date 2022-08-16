package m4;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import f3.e;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import k4.b;
import n3.g1;
import n3.s0;

/* loaded from: classes.dex */
public final class b81 implements l71<ik0, ym1, o81> {

    /* renamed from: a */
    public final Context f6419a;

    /* renamed from: b */
    public final dl0 f6420b;

    /* renamed from: c */
    public final Executor f6421c;

    public b81(Context context, dl0 dl0Var, Executor executor) {
        this.f6419a = context;
        this.f6420b = dl0Var;
        this.f6421c = executor;
    }

    @Override // m4.l71
    public final ik0 a(km1 km1Var, final cm1 cm1Var, h71<ym1, o81> h71Var) {
        final View view;
        pm1 pm1Var;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8070c5)).booleanValue() && cm1Var.f7041e0) {
            ym1 ym1Var = h71Var.f9129b;
            Objects.requireNonNull(ym1Var);
            try {
                n10 i10 = ym1Var.f15839a.i();
                if (i10 == null) {
                    g1.g("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    e = new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new pm1(e);
                }
                try {
                    view = (View) b.e0(i10.b());
                    boolean d5 = i10.d();
                    if (view == null) {
                        e = new Exception("BannerAdapterWrapper interscrollerView should not be null");
                        throw new pm1(e);
                    } else if (d5) {
                        try {
                            view = (View) ((my1) mz1.p(mz1.m(null), new xy1() { // from class: m4.a81
                                @Override // m4.xy1
                                public final tz1 h(Object obj) {
                                    b81 b81Var = b81.this;
                                    return mz1.m(ql0.a(b81Var.f6419a, view, cm1Var));
                                }
                            }, u90.f14298e)).get();
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new pm1(e10);
                        }
                    }
                } catch (RemoteException e102) {
                    throw new pm1(e102);
                }
            } finally {
            }
        } else {
            ym1 ym1Var2 = h71Var.f9129b;
            Objects.requireNonNull(ym1Var2);
            try {
                view = (View) b.e0(ym1Var2.f15839a.j());
            } finally {
            }
        }
        jk0 a10 = this.f6420b.a(new lm0(km1Var, cm1Var, h71Var.f9128a), new qk0(view, null, new vc0(h71Var.f9129b), cm1Var.f7063v.get(0)));
        ((lg0) a10).f10775a1.a().O0(view);
        a10.i().I0(new oi0(h71Var.f9129b), this.f6421c);
        h71Var.f9130c.O3(a10.m());
        return a10.n();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<ym1, o81> h71Var) {
        on a10;
        pm1 pm1Var;
        on onVar = ((om1) km1Var.f10488a.f8363t).f12204e;
        if (onVar.F) {
            Context context = this.f6419a;
            int i10 = onVar.f12224w;
            int i11 = onVar.f12221t;
            e eVar = new e(i10, i11);
            eVar.f4504d = true;
            eVar.f4505e = i11;
            a10 = new on(context, eVar);
        } else {
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8070c5)).booleanValue() || !cm1Var.f7041e0) {
                a10 = ql.a(this.f6419a, cm1Var.f7063v);
            } else {
                Context context2 = this.f6419a;
                int i12 = onVar.f12224w;
                int i13 = onVar.f12221t;
                e eVar2 = new e(i12, i13);
                eVar2.f4506f = true;
                eVar2.f4507g = i13;
                a10 = new on(context2, eVar2);
            }
        }
        on onVar2 = a10;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8070c5)).booleanValue() && cm1Var.f7041e0) {
            ym1 ym1Var = h71Var.f9129b;
            Context context3 = this.f6419a;
            jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
            String jSONObject = cm1Var.f7064w.toString();
            String j3 = s0.j(cm1Var.f7061t);
            o81 o81Var = h71Var.f9130c;
            Objects.requireNonNull(ym1Var);
            try {
                ym1Var.f15839a.J1(new b(context3), onVar2, jnVar, jSONObject, j3, o81Var);
                return;
            } finally {
            }
        }
        ym1 ym1Var2 = h71Var.f9129b;
        Context context4 = this.f6419a;
        jn jnVar2 = ((om1) km1Var.f10488a.f8363t).f12203d;
        String jSONObject2 = cm1Var.f7064w.toString();
        String j10 = s0.j(cm1Var.f7061t);
        o81 o81Var2 = h71Var.f9130c;
        Objects.requireNonNull(ym1Var2);
        try {
            ym1Var2.f15839a.G0(new b(context4), onVar2, jnVar2, jSONObject2, j10, o81Var2);
        } finally {
        }
    }
}
