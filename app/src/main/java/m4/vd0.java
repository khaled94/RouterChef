package m4;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;
import k4.a;
import l3.l;
import m3.n;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface vd0 extends ym, js0, md0, jz, ne0, pe0, qz, rh, se0, l, ue0, ve0, fb0, we0 {
    View A();

    void A0();

    boolean B();

    boolean C();

    void C0(String str, String str2);

    WebViewClient D();

    void D0(String str, lx<? super vd0> lxVar);

    WebView E();

    String E0();

    void F(boolean z10);

    void F0(cm1 cm1Var, em1 em1Var);

    w7 G();

    Context H();

    void I(a aVar);

    ui J();

    void J0(cf0 cf0Var);

    ku K();

    void K0(boolean z10);

    void L();

    void L0(ui uiVar);

    void M(String str, fk0 fk0Var);

    boolean N0();

    void O(iu iuVar);

    void P();

    void Q0(boolean z10);

    cf0 R();

    void S();

    em1 T();

    void U(boolean z10);

    n V();

    void Y(n nVar);

    boolean Z();

    void a0();

    a b0();

    void c0(boolean z10);

    boolean canGoBack();

    void destroy();

    n e0();

    void f0(n nVar);

    void g0();

    @Override // m4.pe0, m4.fb0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    tz1<String> h0();

    void i0(ku kuVar);

    boolean j0();

    ps k();

    void k0(int i10);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    o90 m();

    void measure(int i10, int i11);

    Activity n();

    l3.a o();

    void o0();

    void onPause();

    void onResume();

    me0 p();

    void q(me0 me0Var);

    af0 q0();

    void r0(Context context);

    void s0(int i10);

    @Override // m4.fb0
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    cm1 t();

    void t0();

    void u0(boolean z10);

    boolean w0();

    boolean x0(boolean z10, int i10);

    void y(String str, uc0 uc0Var);

    void z0(String str, lx<? super vd0> lxVar);
}
