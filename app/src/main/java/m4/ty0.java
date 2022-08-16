package m4;

import android.content.Context;
import h2.u;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import l3.a;
import l3.s;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ty0 {

    /* renamed from: b */
    public final a f14195b;

    /* renamed from: c */
    public final Context f14196c;

    /* renamed from: d */
    public final f11 f14197d;

    /* renamed from: e */
    public final ep1 f14198e;

    /* renamed from: f */
    public final Executor f14199f;

    /* renamed from: g */
    public final w7 f14200g;

    /* renamed from: h */
    public final o90 f14201h;

    /* renamed from: j */
    public final v61 f14203j;

    /* renamed from: k */
    public final zp1 f14204k;

    /* renamed from: l */
    public tz1<vd0> f14205l;

    /* renamed from: a */
    public final oy0 f14194a = new oy0();

    /* renamed from: i */
    public final zx f14202i = new zx();

    public ty0(ry0 ry0Var) {
        this.f14196c = ry0Var.f13456b;
        this.f14199f = ry0Var.f13460f;
        this.f14200g = ry0Var.f13461g;
        this.f14201h = ry0Var.f13462h;
        this.f14195b = ry0Var.f13455a;
        this.f14203j = ry0Var.f13459e;
        this.f14204k = ry0Var.f13463i;
        this.f14197d = ry0Var.f13457c;
        this.f14198e = ry0Var.f13458d;
    }

    public final synchronized tz1<JSONObject> a(final String str, final JSONObject jSONObject) {
        tz1<vd0> tz1Var = this.f14205l;
        if (tz1Var == null) {
            return mz1.m(null);
        }
        return mz1.p(tz1Var, new xy1() { // from class: m4.my0
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                ty0 ty0Var = ty0.this;
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                vd0 vd0Var = (vd0) obj;
                zx zxVar = ty0Var.f14202i;
                Objects.requireNonNull(zxVar);
                w90 w90Var = new w90();
                s1 s1Var = s.B.f5789c;
                String uuid = UUID.randomUUID().toString();
                zxVar.b(uuid, new xx(w90Var));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", uuid);
                    jSONObject3.put("args", jSONObject2);
                    vd0Var.P0(str2, jSONObject3);
                } catch (Exception e10) {
                    w90Var.c(e10);
                }
                return w90Var;
            }
        }, this.f14199f);
    }

    public final synchronized void b(Map map) {
        tz1<vd0> tz1Var = this.f14205l;
        if (tz1Var == null) {
            return;
        }
        mz1.t(tz1Var, new d5(map), this.f14199f);
    }

    public final synchronized void c(String str, lx<Object> lxVar) {
        tz1<vd0> tz1Var = this.f14205l;
        if (tz1Var == null) {
            return;
        }
        mz1.t(tz1Var, new b5(str, lxVar), this.f14199f);
    }

    public final <T> void d(WeakReference<T> weakReference, String str, lx<T> lxVar) {
        c(str, new sy0(this, weakReference, str, lxVar));
    }

    public final synchronized void e(String str, lx<Object> lxVar) {
        tz1<vd0> tz1Var = this.f14205l;
        if (tz1Var == null) {
            return;
        }
        mz1.t(tz1Var, new u(this, str, lxVar, 6), this.f14199f);
    }
}
