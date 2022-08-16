package m4;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dr1 extends br1 {

    /* renamed from: d */
    public WebView f7612d;

    /* renamed from: e */
    public Long f7613e = null;

    /* renamed from: f */
    public final Map<String, pq1> f7614f;

    public dr1(Map map) {
        super(0);
        this.f7614f = map;
    }

    @Override // m4.br1
    public final void b() {
        ((wr1) this.f6606c).clear();
        new Handler().postDelayed(new rb0(this), Math.max(4000 - (this.f7613e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f7613e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f7612d = null;
    }

    @Override // m4.br1
    public final void c(jq1 jq1Var, hq1 hq1Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(hq1Var.f9413d);
        for (String str : unmodifiableMap.keySet()) {
            er1.c(jSONObject, str, (pq1) unmodifiableMap.get(str));
        }
        d(jq1Var, hq1Var, jSONObject);
    }

    @Override // m4.br1
    public final void f() {
        WebView webView = new WebView(vq1.f14771b.f14772a);
        this.f7612d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f6606c = new wr1(this.f7612d);
        WebView webView2 = this.f7612d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator<String> it = this.f7614f.keySet().iterator();
        if (!it.hasNext()) {
            this.f7613e = Long.valueOf(System.nanoTime());
            return;
        }
        this.f7614f.get(it.next());
        throw null;
    }
}
