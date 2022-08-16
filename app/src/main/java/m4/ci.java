package m4;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;
import l3.s;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ci implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ di f6989a;

    public ci(di diVar) {
        this.f6989a = diVar;
    }

    /* renamed from: a */
    public final void onReceiveValue(String str) {
        float x10;
        float y;
        float width;
        int height;
        di diVar = this.f6989a;
        fi fiVar = diVar.f7512w;
        xh xhVar = diVar.f7509t;
        WebView webView = diVar.f7510u;
        boolean z10 = diVar.f7511v;
        Objects.requireNonNull(fiVar);
        synchronized (xhVar.f15350g) {
            xhVar.f15356m--;
        }
        try {
            boolean z11 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (fiVar.F || TextUtils.isEmpty(webView.getTitle())) {
                    x10 = webView.getX();
                    y = webView.getY();
                    width = webView.getWidth();
                    height = webView.getHeight();
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    optString = sb.toString();
                    x10 = webView.getX();
                    y = webView.getY();
                    width = webView.getWidth();
                    height = webView.getHeight();
                }
                xhVar.a(optString, z10, x10, y, width, height);
            }
            synchronized (xhVar.f15350g) {
                if (xhVar.f15356m != 0) {
                    z11 = false;
                }
            }
            if (!z11) {
                return;
            }
            fiVar.f8561v.b(xhVar);
        } catch (JSONException unused) {
            g1.e("Json string may be malformed.");
        } catch (Throwable th) {
            g1.f("Failed to get webview content.", th);
            s.B.f5793g.g(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
