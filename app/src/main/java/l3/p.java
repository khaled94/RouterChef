package l3;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import androidx.fragment.app.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m4.ct;
import m4.w7;
import m4.x7;
import n3.g1;

/* loaded from: classes.dex */
public final class p extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    public final /* synthetic */ r f5773a;

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.TreeMap, java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    @Override // android.os.AsyncTask
    public final String doInBackground(Void[] voidArr) {
        try {
            r rVar = this.f5773a;
            rVar.f5786z = rVar.f5782u.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            g1.k("", e10);
        }
        r rVar2 = this.f5773a;
        Objects.requireNonNull(rVar2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(ct.f7140d.e());
        builder.appendQueryParameter("query", rVar2.f5784w.f5777d);
        builder.appendQueryParameter("pubId", rVar2.f5784w.f5775b);
        builder.appendQueryParameter("mappver", rVar2.f5784w.f5779f);
        ?? r12 = rVar2.f5784w.f5776c;
        for (String str : r12.keySet()) {
            builder.appendQueryParameter(str, (String) r12.get(str));
        }
        Uri build = builder.build();
        w7 w7Var = rVar2.f5786z;
        if (w7Var != null) {
            try {
                build = w7Var.d(build, w7Var.f14875b.c(rVar2.f5783v));
            } catch (x7 e11) {
                g1.k("Unable to process ad data", e11);
            }
        }
        String s10 = rVar2.s();
        String encodedQuery = build.getEncodedQuery();
        return a.b(new StringBuilder(s10.length() + 1 + String.valueOf(encodedQuery).length()), s10, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        WebView webView = this.f5773a.f5785x;
        if (webView == null || str2 == null) {
            return;
        }
        webView.loadUrl(str2);
    }
}
