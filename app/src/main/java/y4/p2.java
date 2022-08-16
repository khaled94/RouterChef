package y4;

import android.text.TextUtils;
import d4.m;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import m4.fi1;
import m4.lq0;
import m4.wn;
import n3.t1;
import n9.d;
import r.a;
import r.e;
import s4.b3;
import s4.c3;
import s4.d3;
import s4.dc;
import s4.f3;
import s4.k7;
import s4.l1;
import s4.m4;
import s4.n9;
import s4.o4;
import s4.p0;
import s4.z2;

/* loaded from: classes.dex */
public final class p2 extends v5 implements d {

    /* renamed from: v */
    public final Map<String, Map<String, String>> f20645v = new a();

    /* renamed from: w */
    public final Map<String, Map<String, Boolean>> f20646w = new a();

    /* renamed from: x */
    public final Map<String, Map<String, Boolean>> f20647x = new a();
    public final Map<String, d3> y = new a();
    public final Map<String, String> C = new a();

    /* renamed from: z */
    public final Map<String, Map<String, Integer>> f20648z = new a();
    public final e<String, p0> A = new o2(this);
    public final lq0 B = new lq0(this);

    public p2(a6 a6Var) {
        super(a6Var);
    }

    public static final Map<String, String> x(d3 d3Var) {
        a aVar = new a();
        for (f3 f3Var : d3Var.C()) {
            aVar.put(f3Var.t(), f3Var.u());
        }
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, r.g] */
    @Override // y4.d
    public final String e(String str, String str2) {
        g();
        v(str);
        Map map = (Map) this.f20645v.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // y4.v5
    public final void j() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>, r.g] */
    public final int k(String str, String str2) {
        Integer num;
        g();
        v(str);
        Map map = (Map) this.f20648z.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    public final d3 l(String str) {
        h();
        g();
        m.e(str);
        v(str);
        return (d3) this.y.getOrDefault(str, null);
    }

    public final boolean m(String str) {
        g();
        d3 l10 = l(str);
        if (l10 == null) {
            return false;
        }
        return l10.F();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    public final boolean n(String str) {
        d3 d3Var;
        dc.b();
        return ((w2) this.f20505s).y.s(null, f1.f20433s0) && !TextUtils.isEmpty(str) && (d3Var = (d3) this.y.getOrDefault(str, null)) != null && d3Var.s() != 0;
    }

    public final boolean o(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>, r.g] */
    public final boolean p(String str, String str2) {
        Boolean bool;
        g();
        v(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.f20647x.getOrDefault(str, null);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>, r.g] */
    public final boolean q(String str, String str2) {
        Boolean bool;
        g();
        v(str);
        if (!o(str) || !h6.V(str2)) {
            if (r(str) && h6.W(str2)) {
                return true;
            }
            Map map = (Map) this.f20646w.getOrDefault(str, null);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean r(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0363, code lost:
        r9.put("session_scoped", r5);
        r9.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0375, code lost:
        if (r6.D().insertWithOnConflict(r19, null, r9, 5) != (-1)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0377, code lost:
        ((y4.w2) r6.f20505s).C().f20710x.b("Failed to insert event filter (got -1). appId", y4.s1.s(r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x038a, code lost:
        r3 = r21;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0390, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0391, code lost:
        r3 = ((y4.w2) r6.f20505s).C().f20710x;
        r5 = "Error storing event filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x039f, code lost:
        r0 = r0.z().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03ab, code lost:
        if (r0.hasNext() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03ad, code lost:
        r3 = r0.next();
        r6.h();
        r6.g();
        d4.m.e(r28);
        d4.m.h(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03c7, code lost:
        if (android.text.TextUtils.isEmpty(r3.w()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c9, code lost:
        r0 = ((y4.w2) r6.f20505s).C().A;
        r9 = y4.s1.s(r28);
        r11 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03e1, code lost:
        if (r3.B() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03e3, code lost:
        r3 = java.lang.Integer.valueOf(r3.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ec, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03ed, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03f6, code lost:
        r9 = r3.i();
        r11 = new android.content.ContentValues();
        r11.put(r5, r28);
        r23 = r0;
        r11.put("audience_id", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x040f, code lost:
        if (r3.B() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0411, code lost:
        r0 = java.lang.Integer.valueOf(r3.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x041a, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x041b, code lost:
        r11.put("filter_id", r0);
        r24 = r5;
        r11.put("property_name", r3.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x042d, code lost:
        if (r3.C() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x042f, code lost:
        r0 = java.lang.Boolean.valueOf(r3.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0438, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0439, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x044b, code lost:
        if (r6.D().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x044d, code lost:
        ((y4.w2) r6.f20505s).C().f20710x.b("Failed to insert property filter (got -1). appId", y4.s1.s(r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0461, code lost:
        r0 = r23;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0467, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0468, code lost:
        r3 = ((y4.w2) r6.f20505s).C().f20710x;
        r5 = "Error storing property filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0474, code lost:
        r3.c(r5, y4.s1.s(r28), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x047b, code lost:
        r6.h();
        r6.g();
        d4.m.e(r28);
        r0 = r6.D();
        r11 = r18;
        r0.delete("property_filters", r11, new java.lang.String[]{r28, java.lang.String.valueOf(r8)});
        r0.delete(r19, r11, new java.lang.String[]{r28, java.lang.String.valueOf(r8)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04a8, code lost:
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04aa, code lost:
        r18 = r11;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x028d, code lost:
        r9 = r0.z().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0299, code lost:
        if (r9.hasNext() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a5, code lost:
        if (r9.next().B() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a7, code lost:
        r0 = ((y4.w2) r6.f20505s).C().A;
        r5 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b4, code lost:
        r0.c(r5, y4.s1.s(r28), java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02bd, code lost:
        r9 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c9, code lost:
        r5 = "app_id";
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d7, code lost:
        if (r9.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02d9, code lost:
        r11 = r9.next();
        r6.h();
        r6.g();
        d4.m.e(r28);
        d4.m.h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f3, code lost:
        if (android.text.TextUtils.isEmpty(r11.y()) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02f5, code lost:
        r0 = ((y4.w2) r6.f20505s).C().A;
        r5 = y4.s1.s(r28);
        r9 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x030d, code lost:
        if (r11.G() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x030f, code lost:
        r11 = java.lang.Integer.valueOf(r11.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0318, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0319, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r5, r9, java.lang.String.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0322, code lost:
        r3 = r11.i();
        r23 = r9;
        r9 = new android.content.ContentValues();
        r9.put(r5, r28);
        r9.put("audience_id", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x033b, code lost:
        if (r11.G() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x033d, code lost:
        r5 = java.lang.Integer.valueOf(r11.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0346, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0347, code lost:
        r9.put("filter_id", r5);
        r9.put("event_name", r11.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0357, code lost:
        if (r11.H() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0359, code lost:
        r5 = java.lang.Boolean.valueOf(r11.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0362, code lost:
        r5 = null;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map<java.lang.String, java.lang.String>, r.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, r.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.p2.s(java.lang.String, byte[], java.lang.String):void");
    }

    public final d3 t(String str, byte[] bArr) {
        if (bArr == null) {
            return d3.y();
        }
        try {
            d3 f10 = ((c3) c6.D(d3.w(), bArr)).f();
            q1 q1Var = ((w2) this.f20505s).C().F;
            String str2 = null;
            Long valueOf = f10.H() ? Long.valueOf(f10.u()) : null;
            if (f10.G()) {
                str2 = f10.z();
            }
            q1Var.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return f10;
        } catch (RuntimeException | k7 e10) {
            ((w2) this.f20505s).C().A.c("Unable to merge remote config. appId", s1.s(str), e10);
            return d3.y();
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>, r.g] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>, r.g] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>, r.g] */
    public final void u(String str, c3 c3Var) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        for (int i10 = 0; i10 < ((d3) c3Var.f18205t).t(); i10++) {
            z2 o10 = ((d3) c3Var.f18205t).v(i10).o();
            if (TextUtils.isEmpty(o10.n())) {
                ((w2) this.f20505s).C().A.a("EventConfig contained null event name");
            } else {
                String n10 = o10.n();
                String f10 = d.f(o10.n());
                if (!TextUtils.isEmpty(f10)) {
                    if (o10.f18206u) {
                        o10.h();
                        o10.f18206u = false;
                    }
                    b3.v((b3) o10.f18205t, f10);
                    if (c3Var.f18206u) {
                        c3Var.h();
                        c3Var.f18206u = false;
                    }
                    d3.D((d3) c3Var.f18205t, i10, o10.f());
                }
                aVar.put(n10, Boolean.valueOf(((b3) o10.f18205t).w()));
                aVar2.put(o10.n(), Boolean.valueOf(((b3) o10.f18205t).x()));
                if (((b3) o10.f18205t).y()) {
                    if (o10.m() < 2 || o10.m() > 65535) {
                        ((w2) this.f20505s).C().A.c("Invalid sampling rate. Event name, sample rate", o10.n(), Integer.valueOf(o10.m()));
                    } else {
                        aVar3.put(o10.n(), Integer.valueOf(o10.m()));
                    }
                }
            }
        }
        this.f20646w.put(str, aVar);
        this.f20647x.put(str, aVar2);
        this.f20648z.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, r.g] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>, r.g] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>, r.g] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Map<java.lang.String, java.lang.String>, r.g] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, r.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.p2.v(java.lang.String):void");
    }

    public final void w(final String str, d3 d3Var) {
        if (d3Var.s() != 0) {
            ((w2) this.f20505s).C().F.b("EES programs found", Integer.valueOf(d3Var.s()));
            o4 o4Var = d3Var.B().get(0);
            try {
                p0 p0Var = new p0();
                p0Var.b("internal.remoteConfig", new Callable() { // from class: y4.m2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new n9(new wn(p2.this, str));
                    }
                });
                p0Var.b("internal.appMetadata", new t1(this, str, 1));
                p0Var.b("internal.logger", new fi1(this, 1));
                p0Var.a(o4Var);
                this.A.c(str, p0Var);
                ((w2) this.f20505s).C().F.c("EES program loaded for appId, activities", str, Integer.valueOf(o4Var.s().s()));
                for (m4 m4Var : o4Var.s().v()) {
                    ((w2) this.f20505s).C().F.b("EES program activity", m4Var.t());
                }
                return;
            } catch (l1 unused) {
                ((w2) this.f20505s).C().f20710x.b("Failed to load EES program. appId", str);
                return;
            }
        }
        e<String, p0> eVar = this.A;
        Objects.requireNonNull(eVar);
        Objects.requireNonNull(str, "key == null");
        synchronized (eVar) {
            if (eVar.f17176a.remove(str) != null) {
                eVar.f17177b--;
            }
        }
    }
}
