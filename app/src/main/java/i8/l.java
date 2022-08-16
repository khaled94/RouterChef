package i8;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
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
import f8.h;
import java.util.Objects;
import r8.b;

/* loaded from: classes.dex */
public final class l extends WebViewClient {

    /* renamed from: a */
    public boolean f5290a = false;

    /* renamed from: b */
    public final /* synthetic */ String f5291b;

    /* renamed from: c */
    public final /* synthetic */ m f5292c;

    public l(m mVar, String str) {
        this.f5292c = mVar;
        this.f5291b = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        int i10;
        g gVar = this.f5292c.f5294b;
        if (((gVar instanceof Login) || (gVar instanceof RouterPage)) && (i10 = gVar.M) < 7) {
            gVar.M = i10 + 1;
            new Handler(Looper.getMainLooper()).postDelayed(new h(this, str, 2), 10000L);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f5292c.f5293a.evaluateJavascript(this.f5291b, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f5290a = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(final WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceError.getDescription().toString().contains("ERR_SSL_VERSION_OR_CIPHER_MISMATCH")) {
            g gVar = this.f5292c.f5294b;
            b.q(gVar, this.f5292c.f5294b.getString(R.string.routerLagging) + " | " + this.f5292c.f5294b.getString(R.string.retrying));
            this.f5292c.d();
            m mVar = this.f5292c;
            int i10 = mVar.f5296d + 1;
            mVar.f5296d = i10;
            if (i10 > 30) {
                mVar.f5296d = 0;
                g gVar2 = mVar.f5294b;
                gVar2.O(this.f5292c.f5294b.getString(R.string.wentWrong) + webResourceError.getDescription().toString());
                final m mVar2 = this.f5292c;
                if (mVar2.f5294b.f387v.f1702b.b(g.c.STARTED)) {
                    d.a aVar = new d.a(webView.getContext());
                    aVar.f502a.f476d = webView.getContext().getResources().getString(R.string.confirm);
                    aVar.f502a.f478f = webView.getContext().getResources().getString(R.string.routerLagFixMsg);
                    aVar.c(webView.getContext().getResources().getString(R.string.clearAppData), new DialogInterface.OnClickListener() { // from class: i8.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            ((ActivityManager) m.this.f5294b.getSystemService("activity")).clearApplicationUserData();
                            dialogInterface.dismiss();
                        }
                    });
                    aVar.b(webView.getContext().getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: i8.i
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            m mVar3 = m.this;
                            View view = webView;
                            Objects.requireNonNull(mVar3);
                            dialogInterface.dismiss();
                            mVar3.f5294b.P();
                            b.q(view.getContext(), view.getContext().getString(R.string.loginCanceled));
                        }
                    });
                    aVar.d();
                }
            }
        } else {
            g gVar3 = this.f5292c.f5294b;
            b.q(gVar3, webResourceError.getDescription().toString() + " | " + this.f5292c.f5294b.getString(R.string.retrying));
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException unused) {
        }
        m mVar3 = this.f5292c;
        g gVar4 = mVar3.f5294b;
        int i11 = gVar4.M + 1;
        gVar4.M = i11;
        this.f5290a = false;
        if (i11 >= 7) {
            if (webResourceError.getDescription().toString().contains("ERR_CONNECTION_REFUSED")) {
                m.a(this.f5292c);
                return;
            } else if (!webResourceError.getDescription().toString().contains("ERR_CONTENT_LENGTH_MISMATCH") && !webResourceError.getDescription().toString().contains("ERR_EMPTY_RESPONSE") && !webResourceError.getDescription().toString().contains("ERR_SSL_PROTOCOL_ERROR") && !webResourceError.getDescription().toString().contains("ERR_FAILED") && !webResourceError.getDescription().toString().contains("ERR_SSL_VERSION_OR_CIPHER_MISMATCH") && !webResourceError.getDescription().toString().contains("ERR_CONNECTION_RESET")) {
                g gVar5 = this.f5292c.f5294b;
                gVar5.O(this.f5292c.f5294b.getString(R.string.wentWrong) + webResourceError.getDescription().toString());
                return;
            } else {
                mVar3 = this.f5292c;
            }
        }
        WebView webView2 = mVar3.f5293a;
        webView2.loadUrl(webView2.getUrl());
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f5290a = true;
        if (!this.f5292c.f5294b.f387v.f1702b.b(g.c.STARTED)) {
            sslErrorHandler.cancel();
            return;
        }
        d.a aVar = new d.a(webView.getContext());
        aVar.f502a.f476d = webView.getContext().getResources().getString(R.string.confirm);
        aVar.f502a.f478f = webView.getContext().getResources().getString(R.string.sslErrorMsg);
        aVar.c(webView.getContext().getResources().getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: i8.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                sslErrorHandler.proceed();
                dialogInterface.dismiss();
            }
        });
        aVar.b(webView.getContext().getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: i8.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                l lVar = l.this;
                SslErrorHandler sslErrorHandler2 = sslErrorHandler;
                WebView webView2 = webView;
                Objects.requireNonNull(lVar);
                sslErrorHandler2.cancel();
                lVar.f5292c.f5294b.P();
                b.q(webView2.getContext(), webView2.getContext().getString(R.string.loginCanceled));
            }
        });
        aVar.d();
    }
}
