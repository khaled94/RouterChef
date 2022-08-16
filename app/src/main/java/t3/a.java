package t3;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Objects;
import java.util.UUID;
import k4.b;
import l3.s;
import m4.c10;
import m4.es;
import m4.go;
import m4.i80;
import m4.io;
import m4.m80;
import m4.nn;
import m4.p40;
import m4.q40;
import m4.sq;
import m4.tq;
import m4.w7;
import m4.yn;
import n3.g1;
import n3.s1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final Context f18566a;

    /* renamed from: b */
    public final WebView f18567b;

    /* renamed from: c */
    public final w7 f18568c;

    public a(WebView webView, w7 w7Var) {
        this.f18567b = webView;
        this.f18566a = webView.getContext();
        this.f18568c = w7Var;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        es.c(this.f18566a);
        try {
            return this.f18568c.f14875b.f(this.f18566a, str, this.f18567b);
        } catch (RuntimeException e10) {
            g1.h("Exception getting click signals. ", e10);
            s.B.f5793g.g(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        i80 i80Var;
        String str;
        s1 s1Var = s.B.f5789c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f18566a;
        sq sqVar = new sq();
        sqVar.f13802d.add("B3EEABB8EE11C2BE770B684D95219ECB");
        sqVar.f13800b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            sqVar.f13802d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        tq tqVar = new tq(sqVar);
        j jVar = new j(this, uuid);
        synchronized (q40.class) {
            if (q40.f12691s == null) {
                go goVar = io.f9708f.f9710b;
                c10 c10Var = new c10();
                Objects.requireNonNull(goVar);
                q40.f12691s = new yn(context, c10Var).d(context, false);
            }
            i80Var = q40.f12691s;
        }
        if (i80Var != null) {
            try {
                i80Var.o2(new b(context), new m80(null, "BANNER", null, nn.f11862a.a(context, tqVar)), new p40(jVar));
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
            return uuid;
        }
        str = "Internal Error, query info generator is null.";
        jVar.a(str);
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        es.c(this.f18566a);
        try {
            return this.f18568c.f14875b.e(this.f18566a, this.f18567b);
        } catch (RuntimeException e10) {
            g1.h("Exception getting view signals. ", e10);
            s.B.f5793g.g(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        es.c(this.f18566a);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i12 = jSONObject.getInt("x");
            int i13 = jSONObject.getInt("y");
            int i14 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i15 = jSONObject.getInt("type");
            if (i15 != 0) {
                if (i15 == 1) {
                    i10 = 1;
                } else if (i15 == 2) {
                    i10 = 2;
                } else if (i15 != 3) {
                    i11 = -1;
                } else {
                    i10 = 3;
                }
                this.f18568c.b(MotionEvent.obtain(0L, i14, i10, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            }
            i11 = 0;
            i10 = i11;
            this.f18568c.b(MotionEvent.obtain(0L, i14, i10, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e10) {
            g1.h("Failed to parse the touch string. ", e10);
            s.B.f5793g.g(e10, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
