package m4;

import java.util.Objects;
import java.util.concurrent.Executor;
import m4.am0;
import m4.fo0;
import n3.m0;
import s3.f;

/* loaded from: classes.dex */
public final class qk1<R extends fo0<AdT>, AdT extends am0> implements dl1<R, pk1<R, AdT>> {

    /* renamed from: a */
    public final in1 f12902a;

    /* renamed from: b */
    public final Executor f12903b;

    /* renamed from: c */
    public final kz1<Void> f12904c = new ok1(this);

    public qk1(in1 in1Var, Executor executor) {
        this.f12902a = in1Var;
        this.f12903b = executor;
    }

    @Override // m4.dl1
    public final /* bridge */ /* synthetic */ tz1 a(el1 el1Var, cl1 cl1Var) {
        return b(el1Var, cl1Var, null);
    }

    public final tz1<pk1<R, AdT>> b(el1 el1Var, cl1<R> cl1Var, final R r10) {
        tz1 tz1Var;
        tz1 tz1Var2;
        in1 in1Var = this.f12902a;
        Executor executor = this.f12903b;
        yk1 yk1Var = new yk1(in1Var, r10, executor);
        xk1 xk1Var = yk1Var.f15806d;
        if (xk1Var == null) {
            if (!st.f13817a.e().booleanValue()) {
                xk1 xk1Var2 = new xk1(null, yk1Var.a());
                yk1Var.f15806d = xk1Var2;
                tz1Var2 = mz1.m(xk1Var2);
            } else {
                final wm0 a10 = r10.a();
                final nn1 nn1Var = ((jn1) in1Var).f10139b;
                mo1 a11 = a10.f15053c.b(wo1.GET_CACHE_KEY, a10.f15059i.b()).f(new xy1() { // from class: m4.tm0
                    @Override // m4.xy1
                    public final tz1 h(Object obj) {
                        wm0 wm0Var = wm0.this;
                        nn1 nn1Var2 = nn1Var;
                        o50 o50Var = (o50) obj;
                        Objects.requireNonNull(wm0Var);
                        o50Var.A = nn1Var2;
                        a51 a51Var = wm0Var.f15058h;
                        Objects.requireNonNull(a51Var);
                        return a51Var.a(o50Var, new m0(a51Var.f6050b), new ul0(a51Var, 3), new v41(o50Var, 0));
                    }
                }).a();
                mz1.t(a11, new fk0(a10, 1), a10.f15060j);
                tz1Var2 = mz1.i(mz1.o(gz1.r(a11), new wk1(yk1Var), executor), t41.class, new vk1(yk1Var), executor);
            }
            tz1Var = mz1.o(tz1Var2, uk1.f14437a, executor);
        } else {
            tz1Var = mz1.m(xk1Var);
        }
        return mz1.i(mz1.p(gz1.r(tz1Var), new xy1() { // from class: m4.mk1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                pn1<?, ?> pn1Var;
                Object obj2;
                qk1 qk1Var = qk1.this;
                fo0 fo0Var = r10;
                xk1 xk1Var3 = (xk1) obj;
                Objects.requireNonNull(qk1Var);
                qn1 qn1Var = xk1Var3.f15390b;
                o50 o50Var = xk1Var3.f15389a;
                if (qn1Var != null) {
                    jn1 jn1Var = (jn1) qk1Var.f12902a;
                    synchronized (jn1Var) {
                        hn1 hn1Var = jn1Var.f10138a.get(qn1Var);
                        if (hn1Var != null) {
                            hn1Var.f9387d.a();
                            hn1Var.b();
                            if (hn1Var.f9384a.isEmpty()) {
                                pn1Var = null;
                            } else {
                                pn1Var = hn1Var.f9384a.remove();
                                if (pn1Var != null) {
                                    zn1 zn1Var = hn1Var.f9387d;
                                    zn1Var.f16293e++;
                                    zn1Var.f16290b.f15852s = true;
                                }
                            }
                            if (pn1Var == null) {
                                jn1Var.f10140c.f10948e++;
                            }
                            zn1 zn1Var2 = hn1Var.f9387d;
                            yn1 a12 = zn1Var2.f16290b.a();
                            yn1 yn1Var = zn1Var2.f16290b;
                            yn1Var.f15852s = false;
                            yn1Var.f15853t = 0;
                            if (pn1Var != null) {
                                ek v10 = kk.v();
                                ck v11 = dk.v();
                                v11.n();
                                gk v12 = hk.v();
                                boolean z10 = a12.f15852s;
                                if (v12.f9884u) {
                                    v12.m();
                                    v12.f9884u = false;
                                }
                                hk.y((hk) v12.f9883t, z10);
                                int i10 = a12.f15853t;
                                if (v12.f9884u) {
                                    v12.m();
                                    v12.f9884u = false;
                                }
                                hk.z((hk) v12.f9883t, i10);
                                if (v11.f9884u) {
                                    v11.m();
                                    v11.f9884u = false;
                                }
                                dk.x((dk) v11.f9883t, v12.k());
                                v10.n(v11);
                                yq0 yq0Var = pn1Var.f12576a.a().f15056f;
                                Objects.requireNonNull(yq0Var);
                                yq0Var.M0(new f(v10.k(), 3));
                            }
                        } else {
                            jn1Var.f10140c.f10947d++;
                            pn1Var = null;
                        }
                        jn1Var.b();
                    }
                } else {
                    pn1Var = null;
                }
                if (qn1Var == null) {
                    return mz1.m(null);
                }
                if (pn1Var != null && o50Var != null) {
                    wm0 a13 = fo0Var.a();
                    zo1 zo1Var = a13.f15053c;
                    wo1 wo1Var = wo1.NOTIFY_CACHE_HIT;
                    a51 a51Var = a13.f15058h;
                    Objects.requireNonNull(a51Var);
                    if (p8.b(o50Var.B)) {
                        obj2 = new nz1(new c31(2, "Pool key missing from removeUrl call."));
                    } else {
                        obj2 = a51Var.a(o50Var, new h7(a51Var, 2), new u41(a51Var), x41.f15221a);
                    }
                    mo1 a14 = zo1Var.b(wo1Var, obj2).a();
                    mz1.t(a14, new vm0(a13, 0), a13.f15060j);
                    mz1.t(a14, qk1Var.f12904c, qk1Var.f12903b);
                }
                return mz1.m(new pk1(qn1Var, o50Var, pn1Var));
            }
        }, this.f12903b), Exception.class, new nk1(), this.f12903b);
    }

    @Override // m4.dl1
    public final /* bridge */ /* synthetic */ Object g() {
        return null;
    }
}
