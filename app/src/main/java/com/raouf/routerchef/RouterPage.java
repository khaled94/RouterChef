package com.raouf.routerchef;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdView;
import f8.c0;
import f8.i1;
import f8.z;
import h8.c;
import i8.g;
import i8.p;
import i8.t;
import r8.b;

/* loaded from: classes.dex */
public class RouterPage extends g {

    /* renamed from: e0 */
    public static final /* synthetic */ int f3619e0 = 0;
    public p X;
    public EditText Y;
    public Button Z;

    /* renamed from: a0 */
    public WebView f3620a0;

    /* renamed from: b0 */
    public ConstraintLayout f3621b0;

    /* renamed from: c0 */
    public ImageView f3622c0;

    /* renamed from: d0 */
    public a f3623d0;

    /* loaded from: classes.dex */
    public class a extends t {

        /* renamed from: d */
        public final /* synthetic */ View f3624d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, WebView webView, View view) {
            super(gVar, webView);
            RouterPage.this = r1;
            this.f3624d = view;
        }
    }

    @Override // i8.g
    public final void O(String str) {
        this.O.post(new c0(this, str, 1));
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new i1(this, 1));
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        if (this.f3623d0.f5314c) {
            P();
            this.O.post(new z(this, 1));
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_router_page);
        AdView adView = (AdView) findViewById(R.id.routerPageAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
        }
        this.X = new p(this);
        this.Y = (EditText) findViewById(R.id.routerPageIPInput);
        this.Z = (Button) findViewById(R.id.openRouterPageBtn);
        this.f3620a0 = (WebView) findViewById(R.id.routerPageWebView);
        this.f3621b0 = (ConstraintLayout) findViewById(R.id.controlsLayout);
        this.f3622c0 = (ImageView) findViewById(R.id.routerPageIconToScale);
        this.Y.setText(getSharedPreferences("ROUTER_PAGE_IP", 0).getString("ROUTER_PAGE_IP", "192.168.1.1"));
        b.r(this.f3622c0, 1.2f, 1400);
    }

    public void openRouterPage(View view) {
        String str;
        if (b.k(this).booleanValue()) {
            String obj = this.Y.getText().toString();
            if (obj.length() > 4) {
                this.Z.setEnabled(false);
                this.X.d();
                SharedPreferences.Editor edit = getSharedPreferences("ROUTER_PAGE_IP", 0).edit();
                edit.putString("ROUTER_PAGE_IP", obj);
                edit.apply();
                WebView webView = this.f3620a0;
                this.f3623d0 = new a(this, webView, view);
                webView.loadUrl("https://" + obj);
                b.j(this);
                return;
            }
            str = "Invalid Router IP";
        } else {
            str = getString(R.string.noConnection);
        }
        b.q(this, str);
    }
}
