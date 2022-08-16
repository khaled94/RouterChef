package m4;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import d4.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.a;
import l3.s;
import m3.f;
import m3.n;
import n3.h1;
import n3.r0;
import n3.s1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class he0 extends FrameLayout implements vd0 {

    /* renamed from: s */
    public final vd0 f9201s;

    /* renamed from: t */
    public final ua0 f9202t;

    /* renamed from: u */
    public final AtomicBoolean f9203u = new AtomicBoolean();

    public he0(vd0 vd0Var) {
        super(((View) vd0Var).getContext());
        this.f9201s = vd0Var;
        this.f9202t = new ua0(((ke0) vd0Var).f10391s.f6507c, this, this);
        addView((View) vd0Var);
    }

    @Override // m4.vd0, m4.we0
    public final View A() {
        return this;
    }

    @Override // m4.vd0
    public final void A0() {
        this.f9201s.A0();
    }

    @Override // m4.vd0
    public final boolean B() {
        return this.f9201s.B();
    }

    @Override // m4.js0
    public final void B0() {
        vd0 vd0Var = this.f9201s;
        if (vd0Var != null) {
            vd0Var.B0();
        }
    }

    @Override // m4.vd0
    public final boolean C() {
        return this.f9201s.C();
    }

    @Override // m4.vd0
    public final void C0(String str, String str2) {
        this.f9201s.C0(str, str2);
    }

    @Override // m4.vd0
    public final WebViewClient D() {
        return this.f9201s.D();
    }

    @Override // m4.vd0
    public final void D0(String str, lx<? super vd0> lxVar) {
        this.f9201s.D0(str, lxVar);
    }

    @Override // m4.vd0
    public final WebView E() {
        return (WebView) this.f9201s;
    }

    @Override // m4.vd0
    public final String E0() {
        return this.f9201s.E0();
    }

    @Override // m4.vd0
    public final void F(boolean z10) {
        this.f9201s.F(z10);
    }

    @Override // m4.vd0
    public final void F0(cm1 cm1Var, em1 em1Var) {
        this.f9201s.F0(cm1Var, em1Var);
    }

    @Override // m4.vd0, m4.ue0
    public final w7 G() {
        return this.f9201s.G();
    }

    @Override // m4.se0
    public final void G0(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f9201s.G0(z10, i10, str, str2, z11);
    }

    @Override // m4.vd0
    public final Context H() {
        return this.f9201s.H();
    }

    @Override // m4.se0
    public final void H0(boolean z10, int i10, String str, boolean z11) {
        this.f9201s.H0(z10, i10, str, z11);
    }

    @Override // m4.vd0
    public final void I(a aVar) {
        this.f9201s.I(aVar);
    }

    @Override // m4.qz
    public final void I0(String str, String str2) {
        this.f9201s.I0("window.inspectorInfo", str2);
    }

    @Override // m4.vd0
    public final ui J() {
        return this.f9201s.J();
    }

    @Override // m4.vd0
    public final void J0(cf0 cf0Var) {
        this.f9201s.J0(cf0Var);
    }

    @Override // m4.vd0
    public final ku K() {
        return this.f9201s.K();
    }

    @Override // m4.vd0
    public final void K0(boolean z10) {
        this.f9201s.K0(z10);
    }

    @Override // m4.vd0
    public final void L() {
        setBackgroundColor(0);
        this.f9201s.setBackgroundColor(0);
    }

    @Override // m4.vd0
    public final void L0(ui uiVar) {
        this.f9201s.L0(uiVar);
    }

    @Override // m4.vd0
    public final void M(String str, fk0 fk0Var) {
        this.f9201s.M(str, fk0Var);
    }

    @Override // l3.l
    public final void M0() {
        this.f9201s.M0();
    }

    @Override // m4.ym
    public final void N() {
        vd0 vd0Var = this.f9201s;
        if (vd0Var != null) {
            vd0Var.N();
        }
    }

    @Override // m4.vd0
    public final boolean N0() {
        return this.f9203u.get();
    }

    @Override // m4.vd0
    public final void O(iu iuVar) {
        this.f9201s.O(iuVar);
    }

    @Override // m4.se0
    public final void O0(r0 r0Var, v61 v61Var, f11 f11Var, ep1 ep1Var, String str, String str2) {
        this.f9201s.O0(r0Var, v61Var, f11Var, ep1Var, str, str2);
    }

    @Override // m4.vd0
    public final void P() {
        ua0 ua0Var = this.f9202t;
        Objects.requireNonNull(ua0Var);
        m.d("onDestroy must be called from the UI thread.");
        ta0 ta0Var = ua0Var.f14317d;
        if (ta0Var != null) {
            ta0Var.f13973w.a();
            pa0 pa0Var = ta0Var.y;
            if (pa0Var != null) {
                pa0Var.x();
            }
            ta0Var.b();
            ua0Var.f14316c.removeView(ua0Var.f14317d);
            ua0Var.f14317d = null;
        }
        this.f9201s.P();
    }

    @Override // m4.qz
    public final void P0(String str, JSONObject jSONObject) {
        ((ke0) this.f9201s).I0(str, jSONObject.toString());
    }

    @Override // m4.fb0
    public final void Q() {
        this.f9201s.Q();
    }

    @Override // m4.vd0
    public final void Q0(boolean z10) {
        this.f9201s.Q0(z10);
    }

    @Override // m4.vd0, m4.fb0
    public final cf0 R() {
        return this.f9201s.R();
    }

    @Override // m4.vd0
    public final void S() {
        this.f9201s.S();
    }

    @Override // m4.vd0, m4.ne0
    public final em1 T() {
        return this.f9201s.T();
    }

    @Override // m4.vd0
    public final void U(boolean z10) {
        this.f9201s.U(z10);
    }

    @Override // m4.vd0
    public final n V() {
        return this.f9201s.V();
    }

    @Override // m4.fb0
    public final void W(boolean z10) {
        this.f9201s.W(false);
    }

    @Override // m4.fb0
    public final void X(int i10) {
        this.f9201s.X(i10);
    }

    @Override // m4.vd0
    public final void Y(n nVar) {
        this.f9201s.Y(nVar);
    }

    @Override // m4.vd0
    public final boolean Z() {
        return this.f9201s.Z();
    }

    @Override // m4.jz
    public final void a(String str, Map<String, ?> map) {
        this.f9201s.a(str, map);
    }

    @Override // m4.vd0
    public final void a0() {
        TextView textView = new TextView(getContext());
        s1 s1Var = s.B.f5789c;
        textView.setText(s1.c());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // m4.qz
    public final void b(String str) {
        ((ke0) this.f9201s).S0(str);
    }

    @Override // m4.vd0
    public final a b0() {
        return this.f9201s.b0();
    }

    @Override // m4.vd0
    public final void c0(boolean z10) {
        this.f9201s.c0(z10);
    }

    @Override // m4.vd0
    public final boolean canGoBack() {
        return this.f9201s.canGoBack();
    }

    @Override // m4.fb0
    public final int d() {
        return this.f9201s.d();
    }

    @Override // m4.fb0
    public final void d0(boolean z10, long j3) {
        this.f9201s.d0(z10, j3);
    }

    @Override // m4.vd0
    public final void destroy() {
        a b02 = b0();
        if (b02 == null) {
            this.f9201s.destroy();
            return;
        }
        h1 h1Var = s1.f16555i;
        h1Var.post(new p7(b02, 1));
        vd0 vd0Var = this.f9201s;
        Objects.requireNonNull(vd0Var);
        h1Var.postDelayed(new cr(vd0Var, 1), ((Integer) jo.f10145d.f10148c.a(es.f8106h3)).intValue());
    }

    @Override // m4.fb0
    public final int e() {
        return this.f9201s.e();
    }

    @Override // m4.vd0
    public final n e0() {
        return this.f9201s.e0();
    }

    @Override // m4.fb0
    public final int f() {
        return this.f9201s.f();
    }

    @Override // m4.vd0
    public final void f0(n nVar) {
        this.f9201s.f0(nVar);
    }

    @Override // l3.l
    public final void g() {
        this.f9201s.g();
    }

    @Override // m4.vd0
    public final void g0() {
        this.f9201s.g0();
    }

    @Override // m4.vd0
    public final void goBack() {
        this.f9201s.goBack();
    }

    @Override // m4.fb0
    public final int h() {
        return ((Boolean) jo.f10145d.f10148c.a(es.f8113i2)).booleanValue() ? this.f9201s.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // m4.vd0
    public final tz1<String> h0() {
        return this.f9201s.h0();
    }

    @Override // m4.fb0
    public final int i() {
        return ((Boolean) jo.f10145d.f10148c.a(es.f8113i2)).booleanValue() ? this.f9201s.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // m4.vd0
    public final void i0(ku kuVar) {
        this.f9201s.i0(kuVar);
    }

    @Override // m4.fb0
    public final os j() {
        return this.f9201s.j();
    }

    @Override // m4.vd0
    public final boolean j0() {
        return this.f9201s.j0();
    }

    @Override // m4.vd0, m4.fb0
    public final ps k() {
        return this.f9201s.k();
    }

    @Override // m4.vd0
    public final void k0(int i10) {
        this.f9201s.k0(i10);
    }

    @Override // m4.jz
    public final void l(String str, JSONObject jSONObject) {
        this.f9201s.l(str, jSONObject);
    }

    @Override // m4.vd0
    public final void loadData(String str, String str2, String str3) {
        this.f9201s.loadData(str, "text/html", str3);
    }

    @Override // m4.vd0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f9201s.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // m4.vd0
    public final void loadUrl(String str) {
        this.f9201s.loadUrl(str);
    }

    @Override // m4.vd0, m4.ve0, m4.fb0
    public final o90 m() {
        return this.f9201s.m();
    }

    @Override // m4.se0
    public final void m0(f fVar, boolean z10) {
        this.f9201s.m0(fVar, z10);
    }

    @Override // m4.vd0, m4.pe0, m4.fb0
    public final Activity n() {
        return this.f9201s.n();
    }

    @Override // m4.fb0
    public final ua0 n0() {
        return this.f9202t;
    }

    @Override // m4.vd0, m4.fb0
    public final l3.a o() {
        return this.f9201s.o();
    }

    @Override // m4.vd0
    public final void o0() {
        this.f9201s.o0();
    }

    @Override // m4.vd0
    public final void onPause() {
        pa0 pa0Var;
        ua0 ua0Var = this.f9202t;
        Objects.requireNonNull(ua0Var);
        m.d("onPause must be called from the UI thread.");
        ta0 ta0Var = ua0Var.f14317d;
        if (ta0Var != null && (pa0Var = ta0Var.y) != null) {
            pa0Var.s();
        }
        this.f9201s.onPause();
    }

    @Override // m4.vd0
    public final void onResume() {
        this.f9201s.onResume();
    }

    @Override // m4.vd0, m4.fb0
    public final me0 p() {
        return this.f9201s.p();
    }

    @Override // m4.fb0
    public final void p0(int i10) {
        ua0 ua0Var = this.f9202t;
        Objects.requireNonNull(ua0Var);
        m.d("setPlayerBackgroundColor must be called from the UI thread.");
        ta0 ta0Var = ua0Var.f14317d;
        if (ta0Var != null) {
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8228x)).booleanValue()) {
                return;
            }
            ta0Var.f13970t.setBackgroundColor(i10);
            ta0Var.f13971u.setBackgroundColor(i10);
        }
    }

    @Override // m4.vd0, m4.fb0
    public final void q(me0 me0Var) {
        this.f9201s.q(me0Var);
    }

    @Override // m4.vd0
    public final af0 q0() {
        return ((ke0) this.f9201s).E;
    }

    @Override // m4.fb0
    public final String r() {
        return this.f9201s.r();
    }

    @Override // m4.vd0
    public final void r0(Context context) {
        this.f9201s.r0(context);
    }

    @Override // m4.fb0
    public final uc0 s(String str) {
        return this.f9201s.s(str);
    }

    @Override // m4.vd0
    public final void s0(int i10) {
        this.f9201s.s0(i10);
    }

    @Override // android.view.View, m4.vd0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9201s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, m4.vd0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f9201s.setOnTouchListener(onTouchListener);
    }

    @Override // m4.vd0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f9201s.setWebChromeClient(webChromeClient);
    }

    @Override // m4.vd0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f9201s.setWebViewClient(webViewClient);
    }

    @Override // m4.vd0, m4.md0
    public final cm1 t() {
        return this.f9201s.t();
    }

    @Override // m4.vd0
    public final void t0() {
        vd0 vd0Var = this.f9201s;
        HashMap hashMap = new HashMap(3);
        s sVar = s.B;
        hashMap.put("app_muted", String.valueOf(sVar.f5794h.c()));
        hashMap.put("app_volume", String.valueOf(sVar.f5794h.a()));
        ke0 ke0Var = (ke0) vd0Var;
        hashMap.put("device_volume", String.valueOf(n3.f.b(ke0Var.getContext())));
        ke0Var.a("volume", hashMap);
    }

    @Override // m4.fb0
    public final void u() {
        this.f9201s.u();
    }

    @Override // m4.vd0
    public final void u0(boolean z10) {
        this.f9201s.u0(z10);
    }

    @Override // m4.fb0
    public final String v() {
        return this.f9201s.v();
    }

    @Override // m4.se0
    public final void w(boolean z10, int i10, boolean z11) {
        this.f9201s.w(z10, i10, z11);
    }

    @Override // m4.vd0
    public final boolean w0() {
        return this.f9201s.w0();
    }

    @Override // m4.rh
    public final void x(qh qhVar) {
        this.f9201s.x(qhVar);
    }

    @Override // m4.vd0
    public final boolean x0(boolean z10, int i10) {
        if (!this.f9203u.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8205u0)).booleanValue()) {
            return false;
        }
        if (this.f9201s.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f9201s.getParent()).removeView((View) this.f9201s);
        }
        this.f9201s.x0(z10, i10);
        return true;
    }

    @Override // m4.vd0, m4.fb0
    public final void y(String str, uc0 uc0Var) {
        this.f9201s.y(str, uc0Var);
    }

    @Override // m4.fb0
    public final void y0(int i10) {
        this.f9201s.y0(i10);
    }

    @Override // m4.fb0
    public final void z(int i10) {
        this.f9201s.z(i10);
    }

    @Override // m4.vd0
    public final void z0(String str, lx<? super vd0> lxVar) {
        this.f9201s.z0(str, lxVar);
    }
}
