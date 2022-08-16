package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l3.s;
import m3.n;
import n3.g1;
import n3.o0;
import n3.s1;

@TargetApi(11)
/* loaded from: classes.dex */
public class qe0 extends ce0 {
    public qe0(vd0 vd0Var, wj wjVar, boolean z10) {
        super(vd0Var, wjVar, z10);
    }

    public final WebResourceResponse z(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof vd0)) {
            g1.j("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        vd0 vd0Var = (vd0) webView;
        g70 g70Var = this.M;
        if (g70Var != null) {
            g70Var.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return i(str, map);
        }
        if (vd0Var.q0() != null) {
            final ce0 ce0Var = (ce0) vd0Var.q0();
            synchronized (ce0Var.f6795v) {
                ce0Var.D = false;
                ce0Var.F = true;
                u90.f14298e.execute(new Runnable() { // from class: m4.wd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ce0 ce0Var2 = ce0.this;
                        ce0Var2.f6792s.S();
                        n V = ce0Var2.f6792s.V();
                        if (V != null) {
                            V.C.removeView(V.f5975w);
                            V.Q3(true);
                        }
                    }
                });
            }
        }
        String str2 = (String) jo.f10145d.f10148c.a(vd0Var.R().d() ? es.G : vd0Var.w0() ? es.F : es.E);
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        Context context = vd0Var.getContext();
        String str3 = vd0Var.m().f12051s;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", sVar.f5789c.D(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str4 = (String) ((w90) new o0(context).a(0, str2, hashMap, null)).get(60L, TimeUnit.SECONDS);
            if (str4 == null) {
                return null;
            }
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            g1.k("Could not fetch MRAID JS.", e10);
            return null;
        }
    }
}
