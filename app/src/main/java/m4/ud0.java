package m4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.b1;
import l3.b;
import l3.s;
import m3.n;
import n3.g1;
import n3.s1;

@TargetApi(11)
/* loaded from: classes.dex */
public final class ud0 extends WebChromeClient {

    /* renamed from: a */
    public final vd0 f14378a;

    public ud0(vd0 vd0Var) {
        this.f14378a = vd0Var;
    }

    public static final Context b(WebView webView) {
        if (!(webView instanceof vd0)) {
            return webView.getContext();
        }
        vd0 vd0Var = (vd0) webView;
        Activity n10 = vd0Var.n();
        return n10 != null ? n10 : vd0Var.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        vd0 vd0Var;
        AlertDialog.Builder onCancelListener;
        b bVar;
        try {
            vd0Var = this.f14378a;
        } catch (WindowManager.BadTokenException e10) {
            g1.k("Fail to display Dialog.", e10);
        }
        if (vd0Var != null && vd0Var.q0() != null && ((ce0) this.f14378a.q0()).K != null && (bVar = ((ce0) this.f14378a.q0()).K) != null && !bVar.b()) {
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            bVar.a(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            onCancelListener = builder.setView(linearLayout).setPositiveButton(17039370, new sd0(jsPromptResult, editText)).setNegativeButton(17039360, new rd0(jsPromptResult)).setOnCancelListener(new qd0(jsPromptResult));
        } else {
            onCancelListener = builder.setMessage(str3).setPositiveButton(17039370, new pd0(jsResult)).setNegativeButton(17039360, new od0(jsResult)).setOnCancelListener(new nd0(jsResult));
        }
        onCancelListener.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof vd0)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            n V = ((vd0) webView).V();
            if (V != null) {
                V.a();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        }
        g1.j(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        b1.b(sb, "JS: ", message, " (", sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = td0.f14027a[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            g1.g(sb2);
        } else if (i10 == 2) {
            g1.j(sb2);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            g1.i(sb2);
        } else {
            g1.e(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f14378a.D() != null) {
            webView2.setWebViewClient(this.f14378a.D());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j3, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = 5242880 - j11;
        if (j12 <= 0) {
            quotaUpdater.updateQuota(j3);
            return;
        }
        if (j3 == 0) {
            if (j10 > j12 || j10 > 1048576) {
                j10 = 0;
            }
        } else if (j10 == 0) {
            j10 = Math.min(Math.min(131072L, j12) + j3, 1048576L);
        } else {
            if (j10 <= Math.min(1048576 - j3, j12)) {
                j3 += j10;
            }
            j10 = j3;
        }
        quotaUpdater.updateQuota(j10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            s sVar = s.B;
            s1 s1Var = sVar.f5789c;
            if (!s1.e(this.f14378a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                s1 s1Var2 = sVar.f5789c;
                if (!s1.e(this.f14378a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        n V = this.f14378a.V();
        if (V == null) {
            g1.j("Could not get ad overlay when hiding custom view.");
        } else {
            V.d();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReachedMaxAppCacheSize(long j3, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = j3 + 131072;
        if (5242880 - j10 < j11) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j11);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        n V = this.f14378a.V();
        if (V == null) {
            g1.j("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(V.f5971s);
        V.y = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        V.y.addView(view, -1, -1);
        V.f5971s.setContentView(V.y);
        V.H = true;
        V.f5977z = customViewCallback;
        V.f5976x = true;
        V.S3(i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
