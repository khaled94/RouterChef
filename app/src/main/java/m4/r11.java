package m4;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class r11 implements gq0, ym, to0, ep0, fp0, mp0, vo0, ga, ap1 {

    /* renamed from: s */
    public final List<Object> f13115s;

    /* renamed from: t */
    public final n11 f13116t;

    /* renamed from: u */
    public long f13117u;

    public r11(n11 n11Var, if0 if0Var) {
        this.f13116t = n11Var;
        this.f13115s = Collections.singletonList(if0Var);
    }

    @Override // m4.ym
    public final void N() {
        v(ym.class, "onAdClicked", new Object[0]);
    }

    @Override // m4.ap1
    public final void a(wo1 wo1Var, String str) {
        v(vo1.class, "onTaskSucceeded", str);
    }

    @Override // m4.ap1
    public final void b(wo1 wo1Var, String str) {
        v(vo1.class, "onTaskStarted", str);
    }

    @Override // m4.ga
    public final void c(String str, String str2) {
        v(ga.class, "onAppEvent", str, str2);
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        v(vo0.class, "onAdFailedToLoad", Integer.valueOf(cnVar.f7067s), cnVar.f7068t, cnVar.f7069u);
    }

    @Override // m4.to0
    public final void e() {
        v(to0.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // m4.ap1
    public final void f(String str) {
        v(vo1.class, "onTaskCreated", str);
    }

    @Override // m4.fp0
    public final void g(Context context) {
        v(fp0.class, "onResume", context);
    }

    @Override // m4.ap1
    public final void h(wo1 wo1Var, String str, Throwable th) {
        v(vo1.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // m4.to0
    public final void i() {
        v(to0.class, "onAdClosed", new Object[0]);
    }

    @Override // m4.mp0
    public final void j() {
        Objects.requireNonNull(s.B.f5796j);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f13117u;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime - j3);
        g1.a(sb.toString());
        v(mp0.class, "onAdLoaded", new Object[0]);
    }

    @Override // m4.to0
    public final void k() {
        v(to0.class, "onAdOpened", new Object[0]);
    }

    @Override // m4.ep0
    public final void l() {
        v(ep0.class, "onAdImpression", new Object[0]);
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
    }

    @Override // m4.to0
    public final void o() {
        v(to0.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // m4.fp0
    public final void r(Context context) {
        v(fp0.class, "onPause", context);
    }

    @Override // m4.fp0
    public final void s(Context context) {
        v(fp0.class, "onDestroy", context);
    }

    @Override // m4.to0
    @ParametersAreNonnullByDefault
    public final void u(a60 a60Var, String str, String str2) {
        v(to0.class, "onRewarded", a60Var, str, str2);
    }

    public final void v(Class<?> cls, String str, Object... objArr) {
        n11 n11Var = this.f13116t;
        List<Object> list = this.f13115s;
        String simpleName = cls.getSimpleName();
        String concat = simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-");
        Objects.requireNonNull(n11Var);
        if (!ot.f12288a.e().booleanValue()) {
            return;
        }
        long a10 = n11Var.f11394a.a();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(a10);
            jsonWriter.name("source").value(concat);
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (Object obj : list) {
                jsonWriter.value(obj.toString());
            }
            jsonWriter.endArray();
            jsonWriter.name("params").beginArray();
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Object obj2 = objArr[i10];
                jsonWriter.value(obj2 != null ? obj2.toString() : null);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            g1.h("unable to log", e10);
        }
        String valueOf = String.valueOf(stringWriter.toString());
        g1.i(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
        Objects.requireNonNull(s.B.f5796j);
        this.f13117u = SystemClock.elapsedRealtime();
        v(gq0.class, "onAdRequest", new Object[0]);
    }

    @Override // m4.to0
    public final void x() {
        v(to0.class, "onRewardedVideoStarted", new Object[0]);
    }
}
