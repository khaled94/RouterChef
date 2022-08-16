package i8;

import android.annotation.SuppressLint;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import com.raouf.routerchef.App;
import com.raouf.routerchef.R;
import o8.a;
import r8.b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public WebView f5293a;

    /* renamed from: b */
    public final g f5294b;

    /* renamed from: c */
    public String f5295c;

    /* renamed from: d */
    public int f5296d = 0;

    /* renamed from: e */
    public a f5297e;

    @SuppressLint({"JavascriptInterface", "SetJavaScriptEnabled"})
    public m(g gVar, String str) {
        gVar.M = 0;
        this.f5295c = str;
        this.f5294b = gVar;
        this.f5297e = (a) ((App) gVar.getApplication()).f3511t.f16191s;
        gVar.getFilesDir().getAbsolutePath();
        b();
    }

    public static void a(m mVar) {
        WebView webView = mVar.f5293a;
        if (webView != null) {
            mVar.f5297e.f16788a = "http://";
            if (webView.getUrl() == null) {
                return;
            }
            g gVar = mVar.f5294b;
            b.q(gVar, gVar.getString(R.string.tryHTTP));
            mVar.c(mVar.f5293a.getUrl().split("//")[1]);
        }
    }

    public static void e(m mVar) {
        if (mVar != null) {
            WebView webView = mVar.f5293a;
            if (webView != null) {
                webView.removeJavascriptInterface("Android");
                mVar.f5293a.setWebViewClient(null);
                mVar.f5293a = null;
            }
            mVar.f5294b.M = 0;
        }
    }

    @SuppressLint({"JavascriptInterface", "SetJavaScriptEnabled"})
    public final void b() {
        WebView webView = new WebView(this.f5294b);
        this.f5293a = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(this.f5297e.f16790c);
        settings.setDatabaseEnabled(this.f5297e.f16790c);
        settings.setCacheMode(this.f5297e.f16790c ? 2 : settings.getCacheMode());
        settings.setMixedContentMode(0);
        settings.setUserAgentString(this.f5297e.f16789b);
        this.f5293a.addJavascriptInterface(this.f5294b, "Android");
        this.f5293a.setWebViewClient(new l(this, this.f5295c));
    }

    public final void c(String str) {
        WebView webView = this.f5293a;
        webView.loadUrl(this.f5297e.f16788a + str);
    }

    public final void d() {
        CookieSyncManager.createInstance(this.f5294b);
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().removeSessionCookies(null);
        CookieManager.getInstance().flush();
        WebViewDatabase.getInstance(this.f5294b).clearFormData();
        WebViewDatabase.getInstance(this.f5294b).clearHttpAuthUsernamePassword();
        this.f5294b.getCacheDir().delete();
        this.f5294b.deleteDatabase("webview.db");
        this.f5294b.deleteDatabase("webviewCache.db");
        this.f5293a.clearCache(true);
        this.f5293a.clearFormData();
        this.f5293a.clearHistory();
        this.f5293a.clearSslPreferences();
    }
}
