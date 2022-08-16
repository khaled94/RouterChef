package i8;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.d;
import androidx.lifecycle.g;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.R;
import com.raouf.routerchef.RouterPage;
import e9.f;
import i8.t;
import r8.b;

/* loaded from: classes.dex */
public final class s extends WebViewClient {

    /* renamed from: c */
    public final /* synthetic */ t f5311c;

    /* renamed from: b */
    public final /* synthetic */ String f5310b = "let loadedChecker = setTimeout(() =>  Android.callbackHandle(JSON.stringify({ result: \"page_loaded\" })), 1000);";

    /* renamed from: a */
    public boolean f5309a = false;

    public s(t tVar) {
        this.f5311c = tVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, final String str) {
        int i10;
        g gVar = this.f5311c.f5313b;
        if (((gVar instanceof Login) || (gVar instanceof RouterPage)) && (i10 = gVar.M) < 7) {
            gVar.M = i10 + 1;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: g1.s
                @Override // java.lang.Runnable
                public final void run() {
                    switch (r3) {
                        case 0:
                            t tVar = (t) this;
                            String str2 = str;
                            f.e(tVar, "this$0");
                            f.e(str2, "$sql");
                            tVar.f4855s.a();
                            return;
                        default:
                            i8.s sVar = (i8.s) this;
                            String str3 = str;
                            if (sVar.f5309a || str3 == null || !str3.split(":")[0].equals("https")) {
                                return;
                            }
                            t.a(sVar.f5311c);
                            return;
                    }
                }
            }, 10000L);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f5311c.f5312a.evaluateJavascript(this.f5310b, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f5309a = true;
        this.f5311c.f5314c = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        g gVar = this.f5311c.f5313b;
        b.q(gVar, webResourceError.getDescription().toString() + " | " + this.f5311c.f5313b.getString(R.string.retrying));
        try {
            Thread.sleep(300);
        } catch (InterruptedException unused) {
        }
        t tVar = this.f5311c;
        g gVar2 = tVar.f5313b;
        int i10 = gVar2.M + 1;
        gVar2.M = i10;
        this.f5309a = false;
        if (i10 >= 7) {
            if (webResourceError.getDescription().toString().contains("ERR_CONNECTION_REFUSED")) {
                t.a(this.f5311c);
                return;
            } else if (this.f5311c.f5313b.M > 7 && !webResourceError.getDescription().toString().contains("ERR_CONTENT_LENGTH_MISMATCH") && !webResourceError.getDescription().toString().contains("ERR_EMPTY_RESPONSE") && !webResourceError.getDescription().toString().contains("ERR_SSL_PROTOCOL_ERROR") && !webResourceError.getDescription().toString().contains("ERR_SSL_VERSION_OR_CIPHER_MISMATCH") && !webResourceError.getDescription().toString().contains("ERR_FAILED") && !webResourceError.getDescription().toString().contains("ERR_CONNECTION_RESET")) {
                t tVar2 = this.f5311c;
                RouterPage.a aVar = (RouterPage.a) tVar2;
                b.q(aVar.f3624d.getContext(), this.f5311c.f5313b.getString(R.string.wentWrong) + webResourceError.getDescription().toString());
                RouterPage routerPage = RouterPage.this;
                routerPage.f3621b0.setVisibility(0);
                routerPage.f3622c0.setVisibility(0);
                routerPage.f3620a0.setVisibility(8);
                return;
            } else {
                g gVar3 = this.f5311c.f5313b;
                b.q(gVar3, webResourceError.getDescription().toString() + " | " + this.f5311c.f5313b.getString(R.string.retrying));
                tVar = this.f5311c;
            }
        }
        WebView webView2 = tVar.f5312a;
        webView2.loadUrl(webView2.getUrl());
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f5309a = true;
        if (!this.f5311c.f5313b.f387v.f1702b.b(g.c.STARTED)) {
            sslErrorHandler.cancel();
            return;
        }
        d.a aVar = new d.a(webView.getContext());
        aVar.f502a.f476d = webView.getContext().getResources().getString(R.string.confirm);
        aVar.f502a.f478f = webView.getContext().getResources().getString(R.string.sslErrorMsg);
        aVar.c(webView.getContext().getResources().getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: i8.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                sslErrorHandler.proceed();
                dialogInterface.dismiss();
            }
        });
        aVar.b(webView.getContext().getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: i8.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SslErrorHandler sslErrorHandler2 = sslErrorHandler;
                View view = webView;
                sslErrorHandler2.cancel();
                b.q(view.getContext(), view.getContext().getString(R.string.loginCanceled));
            }
        });
        aVar.d();
    }
}
