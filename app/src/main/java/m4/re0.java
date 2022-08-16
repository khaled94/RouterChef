package m4;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* loaded from: classes.dex */
public final class re0 extends qe0 {
    public re0(vd0 vd0Var, wj wjVar, boolean z10) {
        super(vd0Var, wjVar, z10);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return z(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
