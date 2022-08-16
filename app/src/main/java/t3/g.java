package t3;

import android.os.Binder;
import android.util.JsonReader;
import h2.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l3.s;
import m4.es;
import m4.gz1;
import m4.h41;
import m4.jo;
import m4.mz1;
import m4.nz1;
import m4.o50;
import m4.t31;
import m4.t41;
import m4.tz1;
import m4.u90;
import m4.xy1;
import n3.s1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class g implements xy1<o50, i> {

    /* renamed from: a */
    public final Executor f18588a;

    /* renamed from: b */
    public final t31 f18589b;

    public g(Executor executor, t31 t31Var) {
        this.f18588a = executor;
        this.f18589b = t31Var;
    }

    @Override // m4.xy1
    public final tz1<i> h(o50 o50Var) {
        tz1 tz1Var;
        final o50 o50Var2 = o50Var;
        final t31 t31Var = this.f18589b;
        Objects.requireNonNull(t31Var);
        String str = o50Var2.f11998v;
        s1 s1Var = s.B.f5789c;
        if (s1.f(str)) {
            tz1Var = new nz1(new t41(1));
        } else {
            h41 h41Var = t31Var.f13912c;
            synchronized (h41Var.f8746b) {
                if (!h41Var.f8747c) {
                    h41Var.f8747c = true;
                    h41Var.f8749e = o50Var2;
                    h41Var.f8750f.n();
                    h41Var.f8745a.b(new l(h41Var, 1), u90.f14299f);
                }
                tz1Var = h41Var.f8745a;
            }
        }
        final int callingUid = Binder.getCallingUid();
        return mz1.p(mz1.j((gz1) mz1.q(gz1.r(tz1Var), ((Integer) jo.f10145d.f10148c.a(es.f8208u3)).intValue(), TimeUnit.SECONDS, t31Var.f13910a), Throwable.class, new xy1() { // from class: m4.s31
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                t31 t31Var2 = t31.this;
                Throwable th = (Throwable) obj;
                return t31Var2.f13913d.a().P3(o50Var2, callingUid);
            }
        }, t31Var.f13911b), new xy1() { // from class: t3.f
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                o50 o50Var3 = o50.this;
                i iVar = new i(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    iVar.f18593b = s.B.f5789c.E(o50Var3.f11995s).toString();
                } catch (JSONException unused) {
                    iVar.f18593b = "{}";
                }
                return mz1.m(iVar);
            }
        }, this.f18588a);
    }
}
