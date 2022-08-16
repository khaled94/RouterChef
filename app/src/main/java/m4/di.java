package m4;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class di implements Runnable {

    /* renamed from: s */
    public final ValueCallback<String> f7508s = new ci(this);

    /* renamed from: t */
    public final /* synthetic */ xh f7509t;

    /* renamed from: u */
    public final /* synthetic */ WebView f7510u;

    /* renamed from: v */
    public final /* synthetic */ boolean f7511v;

    /* renamed from: w */
    public final /* synthetic */ fi f7512w;

    public di(fi fiVar, xh xhVar, WebView webView, boolean z10) {
        this.f7512w = fiVar;
        this.f7509t = xhVar;
        this.f7510u = webView;
        this.f7511v = z10;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m4.ci, android.webkit.ValueCallback<java.lang.String>] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7510u.getSettings().getJavaScriptEnabled()) {
            try {
                this.f7510u.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f7508s);
            } catch (Throwable unused) {
                this.f7508s.onReceiveValue("");
            }
        }
    }
}
