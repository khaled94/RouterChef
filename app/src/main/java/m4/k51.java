package m4;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import d.a;
import d.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import org.json.JSONObject;
import t3.q;

/* loaded from: classes.dex */
public final class k51 extends g50 {

    /* renamed from: s */
    public final Context f10277s;

    /* renamed from: t */
    public final Executor f10278t;

    /* renamed from: u */
    public final x50 f10279u;

    /* renamed from: v */
    public final rh0 f10280v;
    @GuardedBy("this")

    /* renamed from: w */
    public final ArrayDeque<i51> f10281w;

    /* renamed from: x */
    public final r01 f10282x;

    public k51(Context context, Executor executor, r01 r01Var, rh0 rh0Var, x50 x50Var, ArrayDeque arrayDeque) {
        es.c(context);
        this.f10277s = context;
        this.f10278t = executor;
        this.f10282x = r01Var;
        this.f10279u = x50Var;
        this.f10280v = rh0Var;
        this.f10281w = arrayDeque;
    }

    public static tz1<q50> T3(tz1<JSONObject> tz1Var, zo1 zo1Var, m00 m00Var) {
        return zo1Var.b(wo1.BUILD_URL, tz1Var).f(m00Var.a("AFMA_getAdDictionary", l00.f10626b, d.f3672t)).a();
    }

    public static tz1<JSONObject> U3(o50 o50Var, zo1 zo1Var, final dg0 dg0Var) {
        xy1 xy1Var = new xy1() { // from class: m4.c51
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                dg0 dg0Var2 = dg0.this;
                Objects.requireNonNull(dg0Var2);
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                a.d(dg0Var2.f7368a.b());
                zf1 zf1Var = new zf1(new li1(t90Var), 0L, dg0Var2.f7369b.f8909o.a());
                a.d(dg0Var2.f7369b.f8883b.f10402b);
                zf1 zf1Var2 = new zf1(new ri1(dg0Var2.f7369b.f8909o.a()), ((Long) jo.f10145d.f10148c.a(es.f8183r2)).longValue(), dg0Var2.f7369b.f8909o.a());
                s80 s80Var = new s80();
                Context context = dg0Var2.f7369b.f8883b.f10402b;
                a.d(context);
                zf1 zf1Var3 = new zf1(new rh1(s80Var, context, dg0Var2.f7369b.f8909o.a(), t90Var, dg0Var2.f7368a.f13473a), 0L, dg0Var2.f7369b.f8909o.a());
                zf1 zf1Var4 = new zf1(new hj1(t90Var), 0L, dg0Var2.f7369b.f8909o.a());
                zi1 zi1Var = zi1.f16241a;
                a.d(dg0Var2.f7369b.f8883b.f10402b);
                a.d(dg0Var2.f7368a.b());
                yh1 yh1Var = new yh1(t90Var);
                a.d(dg0Var2.f7369b.f8883b.f10402b);
                int i10 = dg0Var2.f7368a.f13473a;
                a.d(dg0Var2.f7369b.f8883b.f10402b);
                a.d(dg0Var2.f7368a.b());
                eh1[] eh1VarArr = {new gi1(t90Var), dg0Var2.c(), dg0Var2.b(), new di1(dg0Var2.f7369b.f8884b0.a(), dg0Var2.f7369b.f8909o.a(), t90Var), (eh1) dg0Var2.f7369b.f8929z0.a()};
                int i11 = pw1.f12646u;
                Object[] objArr = new Object[11];
                objArr[0] = zf1Var;
                objArr[1] = zf1Var2;
                objArr[2] = zf1Var3;
                objArr[3] = zf1Var4;
                objArr[4] = zi1Var;
                objArr[5] = yh1Var;
                System.arraycopy(eh1VarArr, 0, objArr, 6, 5);
                return new hh1(t90Var, pw1.p(11, objArr)).a(s.B.f5789c.E((Bundle) obj));
            }
        };
        return zo1Var.b(wo1.GMS_SIGNALS, mz1.m(o50Var.f11995s)).f(xy1Var).e(a6.d.f181u).a();
    }

    public final tz1<InputStream> N3(final o50 o50Var, int i10) {
        if (!st.f13817a.e().booleanValue()) {
            return new nz1(new Exception("Split request is disabled."));
        }
        nn1 nn1Var = o50Var.A;
        if (nn1Var == null) {
            return new nz1(new Exception("Pool configuration missing from request."));
        }
        if (nn1Var.f11869v != 0 && nn1Var.f11870w != 0) {
            m00 b10 = s.B.p.b(this.f10277s, o90.s());
            dg0 u10 = ((if0) this.f10280v).u(o50Var, i10);
            zo1 a10 = u10.a();
            final tz1<JSONObject> U3 = U3(o50Var, a10, u10);
            final tz1<q50> T3 = T3(U3, a10, b10);
            return a10.a(wo1.GET_URL_AND_CACHE_KEY, U3, T3).a(new Callable() { // from class: m4.d51
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    k51 k51Var = k51.this;
                    tz1 tz1Var = T3;
                    tz1 tz1Var2 = U3;
                    o50 o50Var2 = o50Var;
                    Objects.requireNonNull(k51Var);
                    String str = ((q50) tz1Var.get()).f12706i;
                    String str2 = o50Var2.f12001z;
                    i51 i51Var = new i51((q50) tz1Var.get(), (JSONObject) tz1Var2.get(), str2, str);
                    synchronized (k51Var) {
                        synchronized (k51Var) {
                            int intValue = st.f13818b.e().intValue();
                            while (k51Var.f10281w.size() >= intValue) {
                                k51Var.f10281w.removeFirst();
                            }
                        }
                        return new ByteArrayInputStream(str.getBytes(bu1.f6617b));
                    }
                    k51Var.f10281w.addLast(i51Var);
                    return new ByteArrayInputStream(str.getBytes(bu1.f6617b));
                }
            }).a();
        }
        return new nz1(new Exception("Caching is disabled."));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.tz1<java.io.InputStream> O3(m4.o50 r12, int r13) {
        /*
            r11 = this;
            m4.wo1 r0 = m4.wo1.PRE_PROCESS
            m4.wo1 r1 = m4.wo1.HTTP
            l3.s r2 = l3.s.B
            m4.i00 r2 = r2.p
            android.content.Context r3 = r11.f10277s
            m4.o90 r4 = m4.o90.s()
            m4.m00 r2 = r2.b(r3, r4)
            m4.rh0 r3 = r11.f10280v
            m4.if0 r3 = (m4.if0) r3
            m4.dg0 r13 = r3.u(r12, r13)
            m4.k00<m4.j51> r3 = m4.j51.f9850d
            m4.j00<java.io.InputStream> r4 = m4.l00.f10627c
            java.lang.String r5 = "google.afma.response.normalize"
            m4.o00 r3 = r2.a(r5, r3, r4)
            m4.fk0 r4 = new m4.fk0
            java.lang.String r5 = r12.y
            r6 = 8
            r4.<init>(r5, r6)
            android.content.Context r5 = r11.f10277s
            m4.o90 r6 = r12.f11996t
            java.lang.String r6 = r6.f12051s
            m4.o51 r7 = new m4.o51
            r7.<init>(r5, r6)
            m4.zo1 r5 = r13.a()
            m4.at<java.lang.Boolean> r6 = m4.st.f13817a
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r8 = 0
            if (r6 != 0) goto L58
            java.lang.String r6 = r12.B
            if (r6 == 0) goto L84
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L84
            java.lang.String r6 = "Request contained a PoolKey but split request is disabled."
            goto L81
        L58:
            m4.at<java.lang.Boolean> r6 = m4.st.f13819c
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6e
            java.lang.String r6 = r12.f12001z
            m4.i51 r6 = r11.S3(r6)
        L6c:
            r8 = r6
            goto L7d
        L6e:
            java.lang.String r6 = r12.B
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L7d
            java.lang.String r6 = r12.B
            m4.i51 r6 = r11.R3(r6)
            goto L6c
        L7d:
            if (r8 != 0) goto L84
            java.lang.String r6 = "Request contained a PoolKey but no matching parameters were found."
        L81:
            n3.g1.a(r6)
        L84:
            r6 = 1
            r9 = 0
            r10 = 2
            if (r8 != 0) goto Lc7
            m4.tz1 r12 = U3(r12, r5, r13)
            m4.tz1 r13 = T3(r12, r5, r2)
            m4.tz1[] r2 = new m4.tz1[r10]
            r2[r9] = r13
            r2[r6] = r12
            m4.oo1 r1 = r5.a(r1, r2)
            m4.e51 r2 = new m4.e51
            r2.<init>()
            m4.to1 r1 = r1.a(r2)
            m4.to1 r1 = r1.e(r4)
            m4.to1 r1 = r1.e(r7)
            m4.mo1 r1 = r1.a()
            r2 = 3
            m4.tz1[] r2 = new m4.tz1[r2]
            r2[r9] = r12
            r2[r6] = r13
            r2[r10] = r1
            m4.oo1 r0 = r5.a(r0, r2)
            m4.g51 r2 = new m4.g51
            r2.<init>()
            m4.to1 r12 = r0.a(r2)
            goto Lfb
        Lc7:
            m4.p51 r12 = new m4.p51
            org.json.JSONObject r13 = r8.f9534b
            m4.q50 r2 = r8.f9533a
            r12.<init>(r13, r2)
            m4.tz1 r12 = m4.mz1.m(r12)
            m4.to1 r12 = r5.b(r1, r12)
            m4.to1 r12 = r12.e(r4)
            m4.to1 r12 = r12.e(r7)
            m4.mo1 r12 = r12.a()
            m4.tz1 r13 = m4.mz1.m(r8)
            m4.tz1[] r1 = new m4.tz1[r10]
            r1[r9] = r12
            r1[r6] = r13
            m4.oo1 r0 = r5.a(r0, r1)
            m4.f51 r1 = new m4.f51
            r1.<init>()
            m4.to1 r12 = r0.a(r1)
        Lfb:
            m4.to1 r12 = r12.f(r3)
            m4.mo1 r12 = r12.a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.k51.O3(m4.o50, int):m4.tz1");
    }

    public final tz1<InputStream> P3(o50 o50Var, int i10) {
        m00 b10 = s.B.p.b(this.f10277s, o90.s());
        if (!xt.f15468a.e().booleanValue()) {
            return new nz1(new Exception("Signal collection disabled."));
        }
        dg0 u10 = ((if0) this.f10280v).u(o50Var, i10);
        Object a10 = u10.f7369b.f8929z0.a();
        vh1 b11 = u10.b();
        pi1 c10 = u10.c();
        jd2 b12 = md2.b(u10.f7371d);
        jd2 b13 = md2.b(u10.f7373f);
        jd2 b14 = md2.b(u10.f7374g);
        jd2 b15 = md2.b(u10.f7375h);
        md2.b(u10.f7376i);
        jd2 b16 = md2.b(u10.f7377j);
        jd2 b17 = md2.b(u10.f7378k);
        md2.b(u10.f7380m);
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        u10.f7369b.f8909o.a();
        HashSet hashSet = new HashSet();
        hashSet.add((ki1) a10);
        hashSet.add(b11);
        hashSet.add(c10);
        yr<Boolean> yrVar = es.E3;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            hashSet.add((eh1) b12.a());
        }
        if (((Boolean) joVar.f10148c.a(es.F3)).booleanValue()) {
            hashSet.add((eh1) b13.a());
        }
        if (((Boolean) joVar.f10148c.a(es.G3)).booleanValue()) {
            hashSet.add((eh1) b14.a());
        }
        if (((Boolean) joVar.f10148c.a(es.H3)).booleanValue()) {
            hashSet.add((eh1) b15.a());
        }
        if (((Boolean) joVar.f10148c.a(es.J3)).booleanValue()) {
            hashSet.add((eh1) b16.a());
        }
        if (((Boolean) joVar.f10148c.a(es.K3)).booleanValue()) {
            hashSet.add((eh1) b17.a());
        }
        hh1 hh1Var = new hh1(t90Var, hashSet);
        return u10.a().b(wo1.GET_SIGNALS, mz1.m(o50Var.f11995s)).f(new ny(hh1Var, 3)).b(wo1.JS_SIGNALS).f(b10.a("google.afma.request.getSignals", l00.f10626b, l00.f10627c)).a();
    }

    public final tz1<InputStream> Q3(String str) {
        if (!st.f13817a.e().booleanValue()) {
            return new nz1(new Exception("Split request is disabled."));
        }
        h51 h51Var = new h51();
        if ((st.f13819c.e().booleanValue() ? S3(str) : R3(str)) == null) {
            String valueOf = String.valueOf(str);
            return new nz1(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
        }
        return mz1.m(h51Var);
    }

    public final synchronized i51 R3(String str) {
        Iterator<i51> it = this.f10281w.iterator();
        while (it.hasNext()) {
            i51 next = it.next();
            if (next.f9536d.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public final synchronized i51 S3(String str) {
        Iterator<i51> it = this.f10281w.iterator();
        while (it.hasNext()) {
            i51 next = it.next();
            if (next.f9535c.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @Override // m4.h50
    public final void U0(o50 o50Var, l50 l50Var) {
        V3(N3(o50Var, Binder.getCallingUid()), l50Var);
    }

    public final void V3(tz1<InputStream> tz1Var, l50 l50Var) {
        mz1.t(mz1.p(tz1Var, new q(this, 1), u90.f14294a), new np0(this, l50Var, 3), u90.f14299f);
    }

    @Override // m4.h50
    public final void q3(o50 o50Var, l50 l50Var) {
        V3(P3(o50Var, Binder.getCallingUid()), l50Var);
    }

    @Override // m4.h50
    public final void u2(o50 o50Var, l50 l50Var) {
        tz1<InputStream> O3 = O3(o50Var, Binder.getCallingUid());
        V3(O3, l50Var);
        ((mo1) O3).b(new yd0(this, 2), this.f10278t);
    }

    @Override // m4.h50
    public final void v0(String str, l50 l50Var) {
        V3(Q3(str), l50Var);
    }
}
