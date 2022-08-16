package y4;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c4.h0;
import d.a;
import d4.m;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l3.h;
import m4.cc0;
import m4.ha0;
import m4.l70;
import m4.mz;
import m4.rb0;
import m4.xq;
import m4.yd0;
import s4.sa;
import s4.ya;

/* loaded from: classes.dex */
public final class f4 extends f2 {
    public final m6 F;

    /* renamed from: u */
    public d4 f20447u;

    /* renamed from: v */
    public l70 f20448v;

    /* renamed from: x */
    public boolean f20450x;

    /* renamed from: w */
    public final Set<l3> f20449w = new CopyOnWriteArraySet();

    /* renamed from: z */
    public final Object f20451z = new Object();
    public boolean G = true;
    public final h H = new h(this);
    public final AtomicReference<String> y = new AtomicReference<>();
    public f A = new f(null, null);
    public int B = 100;
    public long D = -1;
    public int E = 100;
    public final AtomicLong C = new AtomicLong(0);

    public f4(w2 w2Var) {
        super(w2Var);
        this.F = new m6(w2Var);
    }

    public static void I(f4 f4Var, f fVar, int i10, long j3, boolean z10, boolean z11) {
        String str;
        Object obj;
        q1 q1Var;
        f4Var.g();
        f4Var.h();
        if (j3 <= f4Var.D) {
            if (f4Var.E <= i10) {
                str = "Dropped out-of-date consent setting, proposed settings";
                q1Var = ((w2) f4Var.f20505s).C().D;
                obj = fVar;
                q1Var.b(str, obj);
            }
        }
        g2 s10 = ((w2) f4Var.f20505s).s();
        k3 k3Var = s10.f20505s;
        s10.g();
        if (s10.t(i10)) {
            SharedPreferences.Editor edit = s10.n().edit();
            edit.putString("consent_settings", fVar.e());
            edit.putInt("consent_source", i10);
            edit.apply();
            f4Var.D = j3;
            f4Var.E = i10;
            e5 x10 = ((w2) f4Var.f20505s).x();
            x10.g();
            x10.h();
            if (z10) {
                x10.t();
                ((w2) x10.f20505s).q().l();
            }
            if (x10.n()) {
                x10.s(new ha0(x10, x10.p(false), 1));
            }
            if (!z11) {
                return;
            }
            ((w2) f4Var.f20505s).x().x(new AtomicReference<>());
            return;
        }
        q1 q1Var2 = ((w2) f4Var.f20505s).C().D;
        Object valueOf = Integer.valueOf(i10);
        str = "Lower precedence consent source ignored, proposed source";
        q1Var = q1Var2;
        obj = valueOf;
        q1Var.b(str, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f4.A(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void D(String str, String str2, Object obj, long j3) {
        m.e(str);
        m.e(str2);
        g();
        h();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    Long valueOf = Long.valueOf(true != str4.equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    e2 e2Var = ((w2) this.f20505s).s().D;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    e2Var.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                ((w2) this.f20505s).s().D.b("unset");
                str2 = "_npa";
            }
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!((w2) this.f20505s).f()) {
            ((w2) this.f20505s).C().F.a("User property not set since app measurement is disabled");
        } else if (!((w2) this.f20505s).h()) {
        } else {
            d6 d6Var = new d6(str5, j3, obj2, str);
            e5 x10 = ((w2) this.f20505s).x();
            x10.g();
            x10.h();
            x10.t();
            m1 q10 = ((w2) x10.f20505s).q();
            Objects.requireNonNull(q10);
            Parcel obtain = Parcel.obtain();
            boolean z10 = false;
            e6.a(d6Var, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                ((w2) q10.f20505s).C().y.a("User property too long for local database. Sending directly to service");
            } else {
                z10 = q10.o(1, marshall);
            }
            x10.s(new r4(x10, x10.p(true), z10, d6Var));
        }
    }

    public final void E(Bundle bundle, long j3) {
        sa.b();
        if (!((w2) this.f20505s).y.s(null, f1.f20429q0) || TextUtils.isEmpty(((w2) this.f20505s).p().m())) {
            v(bundle, 0, j3);
        } else {
            ((w2) this.f20505s).C().C.a("Using developer consent only; google app id found");
        }
    }

    public final void F(Boolean bool, boolean z10) {
        g();
        h();
        ((w2) this.f20505s).C().E.b("Setting app measurement enabled (FE)", bool);
        ((w2) this.f20505s).s().q(bool);
        if (z10) {
            g2 s10 = ((w2) this.f20505s).s();
            k3 k3Var = s10.f20505s;
            s10.g();
            SharedPreferences.Editor edit = s10.n().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        w2 w2Var = (w2) this.f20505s;
        w2Var.B().g();
        if (w2Var.V || (bool != null && !bool.booleanValue())) {
            G();
        }
    }

    public final void G() {
        g();
        String a10 = ((w2) this.f20505s).s().D.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                Objects.requireNonNull(((w2) this.f20505s).F);
                D("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a10) ? 0L : 1L);
                Objects.requireNonNull(((w2) this.f20505s).F);
                D("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (((w2) this.f20505s).f() && this.G) {
            ((w2) this.f20505s).C().E.a("Recording app launch after enabling measurement for the first time (FE)");
            J();
            ya.b();
            if (((w2) this.f20505s).y.s(null, f1.f20416j0)) {
                ((w2) this.f20505s).y().f20673v.a();
            }
            ((w2) this.f20505s).B().q(new h0(this, 1));
            return;
        }
        ((w2) this.f20505s).C().E.a("Updating Scion state (FE)");
        e5 x10 = ((w2) this.f20505s).x();
        x10.g();
        x10.h();
        x10.s(new cc0(x10, x10.p(true)));
    }

    public final String H() {
        return this.y.get();
    }

    public final void J() {
        g();
        h();
        if (((w2) this.f20505s).h()) {
            if (((w2) this.f20505s).y.s(null, f1.Z)) {
                e eVar = ((w2) this.f20505s).y;
                Objects.requireNonNull((w2) eVar.f20505s);
                Boolean r10 = eVar.r("google_analytics_deferred_deep_link_enabled");
                if (r10 != null && r10.booleanValue()) {
                    ((w2) this.f20505s).C().E.a("Deferred Deep Link feature enabled.");
                    ((w2) this.f20505s).B().q(new yd0(this, 4));
                }
            }
            e5 x10 = ((w2) this.f20505s).x();
            x10.g();
            x10.h();
            k6 p = x10.p(true);
            ((w2) x10.f20505s).q().o(3, new byte[0]);
            x10.s(new xq(x10, p, 2));
            this.G = false;
            g2 s10 = ((w2) this.f20505s).s();
            s10.g();
            String string = s10.n().getString("previous_os_version", null);
            ((w2) s10.f20505s).o().j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = s10.n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((w2) this.f20505s).o().j();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            n("auto", "_ou", bundle);
        }
    }

    public final void K(String str, String str2, Bundle bundle) {
        Objects.requireNonNull(((w2) this.f20505s).F);
        long currentTimeMillis = System.currentTimeMillis();
        m.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ((w2) this.f20505s).B().q(new mz(this, bundle2));
    }

    @Override // y4.f2
    public final boolean j() {
        return false;
    }

    public final void k() {
        if (!(((w2) this.f20505s).f20786s.getApplicationContext() instanceof Application) || this.f20447u == null) {
            return;
        }
        ((Application) ((w2) this.f20505s).f20786s.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f20447u);
    }

    public final void l(String str, String str2, Bundle bundle) {
        Objects.requireNonNull(((w2) this.f20505s).F);
        m(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r3 > 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r6 > 100) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f4.m(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void n(String str, String str2, Bundle bundle) {
        g();
        Objects.requireNonNull(((w2) this.f20505s).F);
        o(str, str2, System.currentTimeMillis(), bundle);
    }

    public final void o(String str, String str2, long j3, Bundle bundle) {
        g();
        p(str, str2, j3, bundle, true, this.f20448v == null || h6.V(str2), true, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ce, code lost:
        if (r27 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f0, code lost:
        if (r27 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
        r3 = true;
     */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.util.Set<y4.l3>, java.util.concurrent.CopyOnWriteArraySet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f4.p(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void q(long j3, boolean z10) {
        g();
        h();
        ((w2) this.f20505s).C().E.a("Resetting analytics data (FE)");
        q5 y = ((w2) this.f20505s).y();
        y.g();
        o5 o5Var = y.f20674w;
        o5Var.f20628c.a();
        o5Var.f20626a = 0L;
        o5Var.f20627b = 0L;
        boolean f10 = ((w2) this.f20505s).f();
        g2 s10 = ((w2) this.f20505s).s();
        s10.f20469w.b(j3);
        if (!TextUtils.isEmpty(((w2) s10.f20505s).s().K.a())) {
            s10.K.b(null);
        }
        ya.b();
        e eVar = ((w2) s10.f20505s).y;
        e1<Boolean> e1Var = f1.f20416j0;
        if (eVar.s(null, e1Var)) {
            s10.F.b(0L);
        }
        if (!((w2) s10.f20505s).y.v()) {
            s10.r(!f10);
        }
        s10.L.b(null);
        s10.M.b(0L);
        s10.N.b(null);
        if (z10) {
            e5 x10 = ((w2) this.f20505s).x();
            x10.g();
            x10.h();
            k6 p = x10.p(false);
            x10.t();
            ((w2) x10.f20505s).q().l();
            x10.s(new rb0(x10, p));
        }
        ya.b();
        if (((w2) this.f20505s).y.s(null, e1Var)) {
            ((w2) this.f20505s).y().f20673v.a();
        }
        this.G = !f10;
    }

    public final void r(String str, String str2, long j3, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str3 : bundle2.keySet()) {
            Object obj = bundle2.get(str3);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str3, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        ((w2) this.f20505s).B().q(new r3(this, str, str2, j3, bundle2, z10, z11, z12));
    }

    public final void s(String str, String str2, long j3, Object obj) {
        ((w2) this.f20505s).B().q(new s3(this, str, str2, obj, j3));
    }

    public final void t(String str) {
        this.y.set(str);
    }

    public final void u(Bundle bundle, long j3) {
        Objects.requireNonNull(bundle, "null reference");
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            ((w2) this.f20505s).C().A.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        a.b(bundle2, "app_id", String.class, null);
        a.b(bundle2, "origin", String.class, null);
        a.b(bundle2, "name", String.class, null);
        a.b(bundle2, "value", Object.class, null);
        a.b(bundle2, "trigger_event_name", String.class, null);
        a.b(bundle2, "trigger_timeout", Long.class, 0L);
        a.b(bundle2, "timed_out_event_name", String.class, null);
        a.b(bundle2, "timed_out_event_params", Bundle.class, null);
        a.b(bundle2, "triggered_event_name", String.class, null);
        a.b(bundle2, "triggered_event_params", Bundle.class, null);
        a.b(bundle2, "time_to_live", Long.class, 0L);
        a.b(bundle2, "expired_event_name", String.class, null);
        a.b(bundle2, "expired_event_params", Bundle.class, null);
        m.e(bundle2.getString("name"));
        m.e(bundle2.getString("origin"));
        m.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j3);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (((w2) this.f20505s).z().l0(string) != 0) {
            ((w2) this.f20505s).C().f20710x.b("Invalid conditional user property name", ((w2) this.f20505s).E.f(string));
        } else if (((w2) this.f20505s).z().h0(string, obj) != 0) {
            ((w2) this.f20505s).C().f20710x.c("Invalid conditional user property value", ((w2) this.f20505s).E.f(string), obj);
        } else {
            Object o10 = ((w2) this.f20505s).z().o(string, obj);
            if (o10 == null) {
                ((w2) this.f20505s).C().f20710x.c("Unable to normalize conditional user property value", ((w2) this.f20505s).E.f(string), obj);
                return;
            }
            a.e(bundle2, o10);
            long j10 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                Objects.requireNonNull((w2) this.f20505s);
                if (j10 > 15552000000L || j10 < 1) {
                    ((w2) this.f20505s).C().f20710x.c("Invalid conditional user property timeout", ((w2) this.f20505s).E.f(string), Long.valueOf(j10));
                    return;
                }
            }
            long j11 = bundle2.getLong("time_to_live");
            Objects.requireNonNull((w2) this.f20505s);
            if (j11 > 15552000000L || j11 < 1) {
                ((w2) this.f20505s).C().f20710x.c("Invalid conditional user property time to live", ((w2) this.f20505s).E.f(string), Long.valueOf(j11));
            } else {
                ((w2) this.f20505s).B().q(new u3(this, bundle2));
            }
        }
    }

    public final void v(Bundle bundle, int i10, long j3) {
        h();
        String string = bundle.getString("ad_storage");
        if ((string == null || f.j(string) != null) && ((string = bundle.getString("analytics_storage")) == null || f.j(string) != null)) {
            string = null;
        }
        if (string != null) {
            ((w2) this.f20505s).C().C.b("Ignoring invalid consent setting", string);
            ((w2) this.f20505s).C().C.a("Valid consent values are 'granted', 'denied'");
        }
        w(f.a(bundle), i10, j3);
    }

    public final void w(f fVar, int i10, long j3) {
        boolean z10;
        boolean z11;
        f fVar2;
        boolean z12;
        h();
        if (i10 != -10 && fVar.f20394a == null && fVar.f20395b == null) {
            ((w2) this.f20505s).C().C.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f20451z) {
            z10 = true;
            boolean z13 = false;
            if (i10 <= this.B) {
                z12 = fVar.h(this.A);
                if (fVar.g() && !this.A.g()) {
                    z13 = true;
                }
                f fVar3 = this.A;
                Boolean bool = fVar.f20394a;
                if (bool == null) {
                    bool = fVar3.f20394a;
                }
                Boolean bool2 = fVar.f20395b;
                if (bool2 == null) {
                    bool2 = fVar3.f20395b;
                }
                f fVar4 = new f(bool, bool2);
                this.A = fVar4;
                this.B = i10;
                z11 = z13;
                fVar2 = fVar4;
            } else {
                z12 = false;
                z10 = false;
                fVar2 = fVar;
                z11 = false;
            }
        }
        if (!z10) {
            ((w2) this.f20505s).C().D.b("Ignoring lower-priority consent settings, proposed settings", fVar2);
            return;
        }
        long andIncrement = this.C.getAndIncrement();
        if (z12) {
            this.y.set(null);
            ((w2) this.f20505s).B().r(new z3(this, fVar2, j3, i10, andIncrement, z11));
        } else if (i10 == 30 || i10 == -10) {
            ((w2) this.f20505s).B().r(new a4(this, fVar2, i10, andIncrement, z11));
        } else {
            ((w2) this.f20505s).B().q(new b4(this, fVar2, i10, andIncrement, z11));
        }
    }

    public final void x(l70 l70Var) {
        l70 l70Var2;
        g();
        h();
        if (l70Var != null && l70Var != (l70Var2 = this.f20448v)) {
            m.k(l70Var2 == null, "EventInterceptor already set.");
        }
        this.f20448v = l70Var;
    }

    public final void y(f fVar) {
        g();
        boolean z10 = (fVar.g() && fVar.f()) || ((w2) this.f20505s).x().n();
        w2 w2Var = (w2) this.f20505s;
        w2Var.B().g();
        if (z10 != w2Var.V) {
            w2 w2Var2 = (w2) this.f20505s;
            w2Var2.B().g();
            w2Var2.V = z10;
            g2 s10 = ((w2) this.f20505s).s();
            k3 k3Var = s10.f20505s;
            s10.g();
            Boolean valueOf = s10.n().contains("measurement_enabled_from_api") ? Boolean.valueOf(s10.n().getBoolean("measurement_enabled_from_api", true)) : null;
            if (z10 && valueOf != null && !valueOf.booleanValue()) {
                return;
            }
            F(Boolean.valueOf(z10), false);
        }
    }

    public final void z(Object obj) {
        Objects.requireNonNull(((w2) this.f20505s).F);
        A("auto", "_ldl", obj, true, System.currentTimeMillis());
    }
}
