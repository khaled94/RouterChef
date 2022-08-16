package l3;

import a6.f;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import m4.g90;
import m4.io;
import m4.po;
import m4.x7;
import n3.g1;

/* loaded from: classes.dex */
public final class m extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ r f5769a;

    public m(r rVar) {
        this.f5769a = rVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        po poVar = this.f5769a.y;
        if (poVar != null) {
            try {
                poVar.t(f.n(1, null, null));
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        po poVar2 = this.f5769a.y;
        if (poVar2 != null) {
            try {
                poVar2.E(0);
            } catch (RemoteException e11) {
                g1.l("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i10 = 0;
        if (str.startsWith(this.f5769a.s())) {
            return false;
        }
        try {
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            po poVar = this.f5769a.y;
            if (poVar != null) {
                try {
                    poVar.t(f.n(3, null, null));
                } catch (RemoteException e11) {
                    g1.l("#007 Could not call remote method.", e11);
                }
            }
            po poVar2 = this.f5769a.y;
            if (poVar2 != null) {
                poVar2.E(3);
            }
            this.f5769a.N3(i10);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            po poVar3 = this.f5769a.y;
            if (poVar3 != null) {
                try {
                    poVar3.t(f.n(1, null, null));
                } catch (RemoteException e12) {
                    g1.l("#007 Could not call remote method.", e12);
                }
            }
            po poVar4 = this.f5769a.y;
            if (poVar4 != null) {
                poVar4.E(0);
            }
        } else if (!str.startsWith("gmsg://adResized")) {
            if (str.startsWith("gmsg://")) {
                return true;
            }
            po poVar5 = this.f5769a.y;
            if (poVar5 != null) {
                try {
                    poVar5.c();
                    this.f5769a.y.f();
                } catch (RemoteException e13) {
                    g1.l("#007 Could not call remote method.", e13);
                }
            }
            r rVar = this.f5769a;
            if (rVar.f5786z != null) {
                Uri parse = Uri.parse(str);
                try {
                    parse = rVar.f5786z.a(parse, rVar.f5783v, null, null);
                } catch (x7 e14) {
                    g1.k("Unable to process ad data", e14);
                }
                str = parse.toString();
            }
            r rVar2 = this.f5769a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            rVar2.f5783v.startActivity(intent);
            return true;
        } else {
            po poVar6 = this.f5769a.y;
            if (poVar6 != null) {
                try {
                    poVar6.h();
                } catch (RemoteException e15) {
                    g1.l("#007 Could not call remote method.", e15);
                }
            }
            r rVar3 = this.f5769a;
            Objects.requireNonNull(rVar3);
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    g90 g90Var = io.f9708f.f9709a;
                    i10 = g90.j(rVar3.f5783v, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.f5769a.N3(i10);
        return true;
        this.f5769a.N3(i10);
        return true;
    }
}
