package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import m4.pe0;
import m4.ue0;
import m4.we0;
import n3.g1;
import n3.s1;

@TargetApi(17)
/* loaded from: classes.dex */
public final class oe0<WebViewT extends pe0 & ue0 & we0> {

    /* renamed from: a */
    public final WebViewT f12124a;

    /* renamed from: b */
    public final hh0 f12125b;

    public oe0(WebViewT webviewt, hh0 hh0Var) {
        this.f12125b = hh0Var;
        this.f12124a = webviewt;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            w7 G = this.f12124a.G();
            if (G == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                s7 s7Var = G.f14875b;
                if (s7Var == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (this.f12124a.getContext() != null) {
                    Context context = this.f12124a.getContext();
                    WebViewT webviewt = this.f12124a;
                    return s7Var.g(context, str, (View) webviewt, webviewt.n());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        g1.a(str2);
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            g1.j("URL is empty, ignoring message");
        } else {
            s1.f16555i.post(new nz(this, str, 1));
        }
    }
}
