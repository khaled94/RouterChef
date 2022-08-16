package m4;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class wq1 {

    /* renamed from: a */
    public static final wq1 f15090a = new wq1();

    public final void a(WebView webView, String str, Object... objArr) {
        String str2;
        if (webView == null) {
            if (str.length() == 0) {
                return;
            }
            "The WebView is null for ".concat(str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    str2 = "\"\"";
                } else {
                    if (obj instanceof String) {
                        str2 = obj.toString();
                        if (!str2.startsWith("{")) {
                            sb.append('\"');
                            sb.append(str2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append(str2);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new kh(webView, sb2));
        }
    }
}
