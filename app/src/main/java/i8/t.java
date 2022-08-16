package i8;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.raouf.routerchef.R;
import r8.b;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a */
    public WebView f5312a;

    /* renamed from: b */
    public final g f5313b;

    /* renamed from: c */
    public boolean f5314c;

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    public t(g gVar, WebView webView) {
        gVar.M = 0;
        this.f5313b = gVar;
        this.f5312a = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMixedContentMode(0);
        settings.setBuiltInZoomControls(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheEnabled(false);
        settings.setCacheMode(2);
        webView.addJavascriptInterface(gVar, "Android");
        this.f5312a.setWebViewClient(new s(this));
    }

    public static void a(t tVar) {
        WebView webView = tVar.f5312a;
        if (webView == null || webView.getUrl() == null) {
            return;
        }
        g gVar = tVar.f5313b;
        b.q(gVar, gVar.getString(R.string.tryHTTP));
        String str = tVar.f5312a.getUrl().split("//")[1];
        WebView webView2 = tVar.f5312a;
        webView2.loadUrl("http://" + str);
    }
}
