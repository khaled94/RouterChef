package k8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class a extends WebViewClient {

    /* renamed from: a */
    public WebView f5634a;

    /* renamed from: b */
    public final String f5635b = "\nfunction drawMeter(c, amount, bk, fg, progress, prog) { }\nconst myServers = [\"Bologna, Italy (GARR)\", \"London, England (Clouvider)\", \"Nottingham, England (LayerIP)\", \"Nuremberg, Germany (2) (Hetzner)\", \"Frankfurt, Germany (Clouvider)\", \"Oslo, Norway (HostHatch)\"];\nfunction getRandomNumberBetween(min, max) {\n    return Math.floor(Math.random() * (max - min + 1) + min);\n}\n\nfunction getServerName() {\n    return myServers[getRandomNumberBetween(0, myServers.length)];\n}\n\nfunction selectServerAndStart() {\n    let selectedServer = SPEEDTEST_SERVERS.filter(e => e.name == getServerName())[0];\n    if (selectedServer) {\n        s.setSelectedServer(selectedServer);\n        updateSponsor();\n        startStop()\n        return true;\n    } else {\n        return false;\n    }\n}\n\nlet started = false;\nlet ended = false;\n\nlet exit = setTimeout(() => {\n    if (!started) {\n        clearInterval(temp);\n        clearTimeout(exit);\n        Android.callbackHandle(JSON.stringify({ result: \"timeout\" }));\n    }\n}, 20000);\n\nlet temp = setInterval(() => {\n    try {\n        if (document.getElementById('loading') && document.getElementById('loading').className != 'hidden') return\n        if (document.getElementById(\"server\")) {\n            !started && Android.callbackHandle(JSON.stringify({ result: \"ready_to_start\" }));\n            let download = document.querySelector(\"#dlText.meterText\").innerText;\n            let upload = document.querySelector(\"#ulText.meterText\").innerText;\n            if (!started && SPEEDTEST_SERVERS.length) {\n                started = selectServerAndStart();\n            }\n            else if (started && document.getElementById(\"testId\").innerText != '') {\n                ended = true;\n                Android.callbackHandle(JSON.stringify({\n                    result: \"final_speed_test_result\",\n                    upload: upload,\n                    download: download\n                }));\n                clearInterval(temp);\n                clearTimeout(exit);\n            }\n            else if (started && !ended) {\n                Android.callbackHandle(JSON.stringify({\n                    result: \"progress_speed_test_result\",\n                    upload: upload,\n                    download: download\n                }));\n            }\n        }\n\n    } catch (err){ }\n}, 1000);\n\n\n";

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    public a(Context context) {
        WebView webView = new WebView(context);
        this.f5634a = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        settings.setMixedContentMode(0);
        this.f5634a.addJavascriptInterface(context, "Android");
        this.f5634a.setWebViewClient(this);
    }

    public static void a(a aVar) {
        WebView webView;
        if (aVar == null || (webView = aVar.f5634a) == null) {
            return;
        }
        webView.removeJavascriptInterface("Android");
        aVar.f5634a.setWebViewClient(null);
        aVar.f5634a.destroy();
        aVar.f5634a = null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f5634a.evaluateJavascript(this.f5635b, null);
    }
}
