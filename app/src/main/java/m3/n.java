package m3;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Collections;
import k4.a;
import k4.b;
import l3.j;
import l3.s;
import m4.d40;
import m4.es;
import m4.jo;
import m4.vd0;
import m4.yr;
import n3.g1;
import n3.s1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends d40 implements b {
    public static final int M = Color.argb(0, 0, 0, 0);
    public j C;
    public h F;
    public boolean G;
    public boolean H;

    /* renamed from: s */
    public final Activity f5971s;

    /* renamed from: t */
    public AdOverlayInfoParcel f5972t;

    /* renamed from: u */
    public vd0 f5973u;

    /* renamed from: v */
    public k f5974v;

    /* renamed from: w */
    public s f5975w;
    public FrameLayout y;

    /* renamed from: z */
    public WebChromeClient.CustomViewCallback f5977z;

    /* renamed from: x */
    public boolean f5976x = false;
    public boolean A = false;
    public boolean B = false;
    public boolean D = false;
    public int L = 1;
    public final Object E = new Object();
    public boolean I = false;
    public boolean J = false;
    public boolean K = true;

    public n(Activity activity) {
        this.f5971s = activity;
    }

    @Override // m4.e40
    public final boolean B() {
        this.L = 1;
        if (this.f5973u == null) {
            return true;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.S5)).booleanValue() && this.f5973u.canGoBack()) {
            this.f5973u.goBack();
            return false;
        }
        boolean Z = this.f5973u.Z();
        if (!Z) {
            this.f5973u.a("onbackblocked", Collections.emptyMap());
        }
        return Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[Catch: i -> 0x0103, TryCatch #2 {i -> 0x0103, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:22:0x0054, B:24:0x0058, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:30:0x006c, B:32:0x0070, B:34:0x0074, B:36:0x007a, B:43:0x0087, B:45:0x008c, B:47:0x0092, B:48:0x0095, B:50:0x009b, B:52:0x009f, B:53:0x00a2, B:55:0x00a8, B:56:0x00ab, B:63:0x00da, B:65:0x00de, B:66:0x00e5, B:67:0x00e6, B:69:0x00ea, B:71:0x00f7, B:73:0x00fb, B:74:0x0102, B:37:0x007b, B:40:0x0080, B:42:0x0084), top: B:78:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7 A[Catch: i -> 0x0103, TryCatch #2 {i -> 0x0103, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:22:0x0054, B:24:0x0058, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:30:0x006c, B:32:0x0070, B:34:0x0074, B:36:0x007a, B:43:0x0087, B:45:0x008c, B:47:0x0092, B:48:0x0095, B:50:0x009b, B:52:0x009f, B:53:0x00a2, B:55:0x00a8, B:56:0x00ab, B:63:0x00da, B:65:0x00de, B:66:0x00e5, B:67:0x00e6, B:69:0x00ea, B:71:0x00f7, B:73:0x00fb, B:74:0x0102, B:37:0x007b, B:40:0x0080, B:42:0x0084), top: B:78:0x0017 }] */
    @Override // m4.e40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C1(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n.C1(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r27.f5971s.getResources().getConfiguration().orientation == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r27.f5971s.getResources().getConfiguration().orientation == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        r27.D = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O3(boolean r28) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n.O3(boolean):void");
    }

    public final void P3(Configuration configuration) {
        j jVar;
        j jVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (adOverlayInfoParcel == null || (jVar2 = adOverlayInfoParcel.G) == null || !jVar2.f5763t) ? false : true;
        boolean a10 = s.B.f5791e.a(this.f5971s, configuration);
        if ((!this.B || z12) && !a10) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5972t;
            if (adOverlayInfoParcel2 != null && (jVar = adOverlayInfoParcel2.G) != null && jVar.y) {
                z11 = true;
            }
        } else {
            z10 = false;
        }
        Window window = this.f5971s.getWindow();
        if (((Boolean) jo.f10145d.f10148c.a(es.L0)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z10 ? z11 ? 5894 : 5380 : 256);
        } else if (!z10) {
            window.addFlags(2048);
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (!z11) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    public final void Q3(boolean z10) {
        yr<Integer> yrVar = es.Z2;
        jo joVar = jo.f10145d;
        int intValue = ((Integer) joVar.f10148c.a(yrVar)).intValue();
        int i10 = 0;
        boolean z11 = ((Boolean) joVar.f10148c.a(es.H0)).booleanValue() || z10;
        r rVar = new r();
        rVar.f5982d = 50;
        rVar.f5979a = true != z11 ? 0 : intValue;
        if (true != z11) {
            i10 = intValue;
        }
        rVar.f5980b = i10;
        rVar.f5981c = intValue;
        this.f5975w = new s(this.f5971s, rVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        R3(z10, this.f5972t.y);
        this.C.addView(this.f5975w, layoutParams);
    }

    public final void R3(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        j jVar2;
        yr<Boolean> yrVar = es.F0;
        jo joVar = jo.f10145d;
        boolean z12 = true;
        boolean z13 = ((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && (adOverlayInfoParcel2 = this.f5972t) != null && (jVar2 = adOverlayInfoParcel2.G) != null && jVar2.f5768z;
        boolean z14 = ((Boolean) joVar.f10148c.a(es.G0)).booleanValue() && (adOverlayInfoParcel = this.f5972t) != null && (jVar = adOverlayInfoParcel.G) != null && jVar.A;
        if (z10 && z11 && z13 && !z14) {
            vd0 vd0Var = this.f5973u;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (vd0Var != null) {
                    vd0Var.l("onError", put);
                }
            } catch (JSONException e10) {
                g1.h("Error occurred while dispatching error event.", e10);
            }
        }
        s sVar = this.f5975w;
        if (sVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            sVar.a(z12);
        }
    }

    public final void S() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        p pVar;
        if (!this.f5971s.isFinishing() || this.I) {
            return;
        }
        this.I = true;
        vd0 vd0Var = this.f5973u;
        if (vd0Var != null) {
            vd0Var.k0(this.L - 1);
            synchronized (this.E) {
                try {
                    if (!this.G && this.f5973u.B()) {
                        yr<Boolean> yrVar = es.V2;
                        jo joVar = jo.f10145d;
                        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && !this.J && (adOverlayInfoParcel = this.f5972t) != null && (pVar = adOverlayInfoParcel.f2908u) != null) {
                            pVar.Z1();
                        }
                        h hVar = new h(this, 0);
                        this.F = hVar;
                        s1.f16555i.postDelayed(hVar, ((Long) joVar.f10148c.a(es.E0)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c();
    }

    public final void S3(int i10) {
        int i11 = this.f5971s.getApplicationInfo().targetSdkVersion;
        yr<Integer> yrVar = es.O3;
        jo joVar = jo.f10145d;
        if (i11 >= ((Integer) joVar.f10148c.a(yrVar)).intValue()) {
            if (this.f5971s.getApplicationInfo().targetSdkVersion <= ((Integer) joVar.f10148c.a(es.P3)).intValue()) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= ((Integer) joVar.f10148c.a(es.Q3)).intValue()) {
                    if (i12 <= ((Integer) joVar.f10148c.a(es.R3)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f5971s.setRequestedOrientation(i10);
        } catch (Throwable th) {
            s.B.f5793g.f(th, "AdOverlay.setRequestedOrientation");
        }
    }

    @Override // m4.e40
    public final void Y2(int i10, int i11, Intent intent) {
    }

    @Override // m4.e40
    public final void Z2(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.A);
    }

    public final void a() {
        this.L = 3;
        this.f5971s.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.C != 5) {
            return;
        }
        this.f5971s.overridePendingTransition(0, 0);
    }

    public final void c() {
        vd0 vd0Var;
        p pVar;
        if (this.J) {
            return;
        }
        this.J = true;
        vd0 vd0Var2 = this.f5973u;
        if (vd0Var2 != null) {
            this.C.removeView(vd0Var2.A());
            k kVar = this.f5974v;
            if (kVar != null) {
                this.f5973u.r0(kVar.f5967d);
                this.f5973u.U(false);
                ViewGroup viewGroup = this.f5974v.f5966c;
                View A = this.f5973u.A();
                k kVar2 = this.f5974v;
                viewGroup.addView(A, kVar2.f5964a, kVar2.f5965b);
                this.f5974v = null;
            } else if (this.f5971s.getApplicationContext() != null) {
                this.f5973u.r0(this.f5971s.getApplicationContext());
            }
            this.f5973u = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f2908u) != null) {
            pVar.w(this.L);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5972t;
        if (adOverlayInfoParcel2 == null || (vd0Var = adOverlayInfoParcel2.f2909v) == null) {
            return;
        }
        a b02 = vd0Var.b0();
        View A2 = this.f5972t.f2909v.A();
        if (b02 == null || A2 == null) {
            return;
        }
        s.B.f5807v.d0(b02, A2);
    }

    public final void d() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        if (adOverlayInfoParcel != null && this.f5976x) {
            S3(adOverlayInfoParcel.B);
        }
        if (this.y != null) {
            this.f5971s.setContentView(this.C);
            this.H = true;
            this.y.removeAllViews();
            this.y = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f5977z;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f5977z = null;
        }
        this.f5976x = false;
    }

    @Override // m3.b
    public final void e0() {
        this.L = 2;
        this.f5971s.finish();
    }

    @Override // m4.e40
    public final void f() {
        this.L = 1;
    }

    @Override // m4.e40
    public final void j() {
        p pVar;
        d();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f2908u) != null) {
            pVar.J3();
        }
        if (!((Boolean) jo.f10145d.f10148c.a(es.X2)).booleanValue() && this.f5973u != null && (!this.f5971s.isFinishing() || this.f5974v == null)) {
            this.f5973u.onPause();
        }
        S();
    }

    @Override // m4.e40
    public final void k() {
    }

    @Override // m4.e40
    public final void l() {
        vd0 vd0Var = this.f5973u;
        if (vd0Var != null) {
            try {
                this.C.removeView(vd0Var.A());
            } catch (NullPointerException unused) {
            }
        }
        S();
    }

    @Override // m4.e40
    public final void m() {
        p pVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f2908u) != null) {
            pVar.v2();
        }
        P3(this.f5971s.getResources().getConfiguration());
        if (!((Boolean) jo.f10145d.f10148c.a(es.X2)).booleanValue()) {
            vd0 vd0Var = this.f5973u;
            if (vd0Var == null || vd0Var.j0()) {
                g1.j("The webview does not exist. Ignoring action.");
            } else {
                this.f5973u.onResume();
            }
        }
    }

    @Override // m4.e40
    public final void m0(a aVar) {
        P3((Configuration) b.e0(aVar));
    }

    @Override // m4.e40
    public final void p() {
        if (((Boolean) jo.f10145d.f10148c.a(es.X2)).booleanValue() && this.f5973u != null && (!this.f5971s.isFinishing() || this.f5974v == null)) {
            this.f5973u.onPause();
        }
        S();
    }

    @Override // m4.e40
    public final void q() {
        this.H = true;
    }

    @Override // m4.e40
    public final void r() {
        p pVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5972t;
        if (adOverlayInfoParcel == null || (pVar = adOverlayInfoParcel.f2908u) == null) {
            return;
        }
        pVar.b();
    }

    @Override // m4.e40
    public final void x() {
        if (((Boolean) jo.f10145d.f10148c.a(es.X2)).booleanValue()) {
            vd0 vd0Var = this.f5973u;
            if (vd0Var == null || vd0Var.j0()) {
                g1.j("The webview does not exist. Ignoring action.");
            } else {
                this.f5973u.onResume();
            }
        }
    }
}
