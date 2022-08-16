package l3;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import d4.m;
import java.util.Objects;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
import k4.a;
import k4.b;
import m4.ch1;
import m4.cp;
import m4.ct;
import m4.e60;
import m4.gq;
import m4.ip;
import m4.iq;
import m4.jn;
import m4.lq;
import m4.mo;
import m4.mp;
import m4.o90;
import m4.on;
import m4.or;
import m4.po;
import m4.pp;
import m4.to;
import m4.u90;
import m4.un;
import m4.vs;
import m4.w7;
import m4.yi;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONException;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class r extends cp {
    public AsyncTask<Void, Void, String> A;

    /* renamed from: s */
    public final o90 f5780s;

    /* renamed from: t */
    public final on f5781t;

    /* renamed from: u */
    public final Future<w7> f5782u = u90.f14294a.Z(new o(this, 0));

    /* renamed from: v */
    public final Context f5783v;

    /* renamed from: w */
    public final q f5784w;

    /* renamed from: x */
    public WebView f5785x;
    public po y;

    /* renamed from: z */
    public w7 f5786z;

    public r(Context context, on onVar, String str, o90 o90Var) {
        this.f5783v = context;
        this.f5780s = o90Var;
        this.f5781t = onVar;
        this.f5785x = new WebView(context);
        this.f5784w = new q(context, str);
        N3(0);
        this.f5785x.setVerticalScrollBarEnabled(false);
        this.f5785x.getSettings().setJavaScriptEnabled(true);
        this.f5785x.setWebViewClient(new m(this));
        this.f5785x.setOnTouchListener(new n(this));
    }

    @Override // m4.dp
    public final void B() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void C() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void D3(on onVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // m4.dp
    public final void F() {
        m.d("pause must be called on the main UI thread.");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.TreeMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.TreeMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.TreeMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // m4.dp
    public final boolean F1(jn jnVar) {
        m.i(this.f5785x, "This Search Ad has already been torn down");
        q qVar = this.f5784w;
        o90 o90Var = this.f5780s;
        Objects.requireNonNull(qVar);
        qVar.f5777d = jnVar.B.f10969s;
        Bundle bundle = jnVar.E;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String e10 = ct.f7139c.e();
            for (String str : bundle2.keySet()) {
                if (e10.equals(str)) {
                    qVar.f5778e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    qVar.f5776c.put(str.substring(4), bundle2.getString(str));
                }
            }
            qVar.f5776c.put("SDKVersion", o90Var.f12051s);
            if (ct.f7137a.e().booleanValue()) {
                try {
                    Bundle b10 = ch1.b(qVar.f5774a, new JSONArray(ct.f7138b.e()));
                    for (String str2 : b10.keySet()) {
                        qVar.f5776c.put(str2, b10.get(str2).toString());
                    }
                } catch (JSONException e11) {
                    g1.h("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e11);
                }
            }
        }
        this.A = new p(this).execute(new Void[0]);
        return true;
    }

    @Override // m4.dp
    public final void G() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void G2(gq gqVar) {
    }

    @Override // m4.dp
    public final void H2(yi yiVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void K() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void K0(mo moVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void L() {
        m.d("destroy must be called on the main UI thread.");
        this.A.cancel(true);
        this.f5782u.cancel(true);
        this.f5785x.destroy();
        this.f5785x = null;
    }

    @Override // m4.dp
    public final void L2(or orVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void N3(int i10) {
        if (this.f5785x == null) {
            return;
        }
        this.f5785x.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // m4.dp
    public final void R() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void R1(mp mpVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void S2(e60 e60Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void T() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void Y0(po poVar) {
        this.y = poVar;
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
    }

    @Override // m4.dp
    public final on e() {
        return this.f5781t;
    }

    @Override // m4.dp
    public final void e2(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void e3(un unVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final Bundle g() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final void g0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final po h() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // m4.dp
    public final void h0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final ip i() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // m4.dp
    public final a j() {
        m.d("getAdFrame must be called on the main UI thread.");
        return new b(this.f5785x);
    }

    @Override // m4.dp
    public final void k1(a aVar) {
    }

    @Override // m4.dp
    public final lq l() {
        return null;
    }

    @Override // m4.dp
    public final iq n() {
        return null;
    }

    @Override // m4.dp
    public final void n2(ip ipVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final boolean o0() {
        return false;
    }

    @Override // m4.dp
    public final String p() {
        return null;
    }

    @Override // m4.dp
    public final String r() {
        return null;
    }

    @Override // m4.dp
    public final void r3(jn jnVar, to toVar) {
    }

    public final String s() {
        String str = this.f5784w.f5778e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String e10 = ct.f7140d.e();
        return androidx.fragment.app.a.b(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(e10).length()), "https://", str, e10);
    }

    @Override // m4.dp
    public final void v3(vs vsVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // m4.dp
    public final String x() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // m4.dp
    public final void y() {
        m.d("resume must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final boolean z2() {
        return false;
    }

    @Override // m4.dp
    public final void z3(boolean z10) {
    }
}
