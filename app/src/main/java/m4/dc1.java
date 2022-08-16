package m4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d4.m;
import java.util.Collections;
import java.util.Objects;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class dc1 extends cp {

    /* renamed from: s */
    public final Context f7296s;

    /* renamed from: t */
    public final po f7297t;

    /* renamed from: u */
    public final om1 f7298u;

    /* renamed from: v */
    public final ik0 f7299v;

    /* renamed from: w */
    public final FrameLayout f7300w;

    public dc1(Context context, po poVar, om1 om1Var, ik0 ik0Var) {
        this.f7296s = context;
        this.f7297t = poVar;
        this.f7298u = om1Var;
        this.f7299v = ik0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = ((lk0) ik0Var).f10882j;
        Objects.requireNonNull(s.B.f5791e);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(e().f12222u);
        frameLayout.setMinimumWidth(e().f12225x);
        this.f7300w = frameLayout;
    }

    @Override // m4.dp
    public final void B() {
        g1.i("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final void C() {
        this.f7299v.h();
    }

    @Override // m4.dp
    public final void D3(on onVar) {
        m.d("setAdSize must be called on the main UI thread.");
        ik0 ik0Var = this.f7299v;
        if (ik0Var != null) {
            ik0Var.i(this.f7300w, onVar);
        }
    }

    @Override // m4.dp
    public final void F() {
        m.d("destroy must be called on the main UI thread.");
        this.f7299v.f6192c.P0(null);
    }

    @Override // m4.dp
    public final boolean F1(jn jnVar) {
        g1.i("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // m4.dp
    public final void G() {
    }

    @Override // m4.dp
    public final void G2(gq gqVar) {
        g1.i("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final void H2(yi yiVar) {
    }

    @Override // m4.dp
    public final void K() {
    }

    @Override // m4.dp
    public final void K0(mo moVar) {
        g1.i("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final void L() {
        m.d("destroy must be called on the main UI thread.");
        this.f7299v.a();
    }

    @Override // m4.dp
    public final void L2(or orVar) {
        g1.i("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final void R() {
    }

    @Override // m4.dp
    public final void R1(mp mpVar) {
        g1.i("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final void S2(e60 e60Var) {
    }

    @Override // m4.dp
    public final void T() {
    }

    @Override // m4.dp
    public final void Y0(po poVar) {
        g1.i("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
    }

    @Override // m4.dp
    public final on e() {
        m.d("getAdSize must be called on the main UI thread.");
        return ql.a(this.f7296s, Collections.singletonList(this.f7299v.f()));
    }

    @Override // m4.dp
    public final void e2(boolean z10) {
    }

    @Override // m4.dp
    public final void e3(un unVar) {
    }

    @Override // m4.dp
    public final Bundle g() {
        g1.i("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // m4.dp
    public final void g0() {
    }

    @Override // m4.dp
    public final po h() {
        return this.f7297t;
    }

    @Override // m4.dp
    public final void h0() {
    }

    @Override // m4.dp
    public final ip i() {
        return this.f7298u.f12213n;
    }

    @Override // m4.dp
    public final a j() {
        return new b(this.f7300w);
    }

    @Override // m4.dp
    public final void k1(a aVar) {
    }

    @Override // m4.dp
    public final lq l() {
        return this.f7299v.e();
    }

    @Override // m4.dp
    public final iq n() {
        return this.f7299v.f6195f;
    }

    @Override // m4.dp
    public final void n2(ip ipVar) {
        lc1 lc1Var = this.f7298u.f12202c;
        if (lc1Var != null) {
            lc1Var.f(ipVar);
        }
    }

    @Override // m4.dp
    public final boolean o0() {
        return false;
    }

    @Override // m4.dp
    public final String p() {
        oo0 oo0Var = this.f7299v.f6195f;
        if (oo0Var != null) {
            return oo0Var.f12238s;
        }
        return null;
    }

    @Override // m4.dp
    public final String r() {
        oo0 oo0Var = this.f7299v.f6195f;
        if (oo0Var != null) {
            return oo0Var.f12238s;
        }
        return null;
    }

    @Override // m4.dp
    public final void r3(jn jnVar, to toVar) {
    }

    @Override // m4.dp
    public final void v3(vs vsVar) {
        g1.i("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // m4.dp
    public final String x() {
        return this.f7298u.f12205f;
    }

    @Override // m4.dp
    public final void y() {
        m.d("destroy must be called on the main UI thread.");
        this.f7299v.f6192c.R0(null);
    }

    @Override // m4.dp
    public final boolean z2() {
        return false;
    }

    @Override // m4.dp
    public final void z3(boolean z10) {
        g1.i("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
