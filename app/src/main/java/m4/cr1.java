package m4;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class cr1 extends br1 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public cr1(WebView webView) {
        super(0);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f6606c = new wr1(webView);
    }
}
