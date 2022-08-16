package m4;

import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import m4.am0;
import m4.fo0;
import n3.k1;

/* loaded from: classes.dex */
public final class xn1<R extends fo0<AdT>, AdT extends am0> {

    /* renamed from: a */
    public final in1 f15420a;

    /* renamed from: b */
    public final rb1 f15421b;
    @GuardedBy("this")

    /* renamed from: d */
    public do1<R, AdT> f15423d;
    @GuardedBy("this")

    /* renamed from: e */
    public int f15424e = 1;
    @GuardedBy("this")

    /* renamed from: c */
    public final ArrayDeque<wn1<R, AdT>> f15422c = new ArrayDeque<>();

    public xn1(in1 in1Var, gn1 gn1Var, rb1 rb1Var) {
        this.f15420a = in1Var;
        this.f15421b = rb1Var;
        gn1Var.f8981a = new tz(this);
    }

    public final synchronized void a() {
        boolean z10;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8091f4)).booleanValue() && !((k1) s.B.f5793g.c()).e().f14607j) {
            this.f15422c.clear();
            return;
        }
        synchronized (this) {
            if (this.f15423d == null) {
                while (!this.f15422c.isEmpty()) {
                    wn1<R, AdT> pollFirst = this.f15422c.pollFirst();
                    if (pollFirst != null) {
                        if (pollFirst.zza() != null) {
                            in1 in1Var = this.f15420a;
                            qn1 zza = pollFirst.zza();
                            jn1 jn1Var = (jn1) in1Var;
                            synchronized (jn1Var) {
                                hn1 hn1Var = jn1Var.f10138a.get(zza);
                                z10 = hn1Var == null || hn1Var.a() < jn1Var.f10139b.f11870w;
                            }
                            if (z10) {
                            }
                        }
                    }
                    do1<R, AdT> do1Var = new do1<>(this.f15420a, this.f15421b, pollFirst);
                    this.f15423d = do1Var;
                    x10 x10Var = new x10(this, pollFirst);
                    synchronized (do1Var) {
                        mz1.t(mz1.p(do1Var.f7577b, co1.f7096a, pollFirst.a()), x10Var, pollFirst.a());
                    }
                    return;
                }
            }
        }
    }
}
