package m4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import h2.d0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;
import n3.v0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qv0 extends xu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, lw0 {
    public static final gw1<String> F;
    public sh A;
    public tu C;
    public boolean D;

    /* renamed from: s */
    public final String f12997s;

    /* renamed from: u */
    public FrameLayout f12999u;

    /* renamed from: v */
    public FrameLayout f13000v;

    /* renamed from: w */
    public final t90 f13001w;

    /* renamed from: x */
    public View f13002x;
    @GuardedBy("this")

    /* renamed from: z */
    public av0 f13003z;
    @GuardedBy("this")

    /* renamed from: t */
    public Map<String, WeakReference<View>> f12998t = new HashMap();
    public a B = null;
    public boolean E = false;
    public final int y = 214106000;

    static {
        pu1 pu1Var = gw1.f9058t;
        Object[] objArr = {"2011", "1009", "3010"};
        q40.f(objArr, 3);
        F = (gx1) gw1.p(objArr, 3);
    }

    public qv0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f12999u = frameLayout;
        this.f13000v = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f12997s = str;
        ba0 ba0Var = s.B.A;
        ba0.a(frameLayout, this);
        ba0.b(frameLayout, this);
        this.f13001w = u90.f14298e;
        this.A = new sh(this.f12999u.getContext(), this.f12999u);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    @Override // m4.lw0
    public final synchronized View E1(String str) {
        if (this.E) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f12998t.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized void N3(a aVar) {
        av0 av0Var = this.f13003z;
        View view = (View) b.e0(aVar);
        synchronized (av0Var) {
            av0Var.f6262k.o(view);
        }
    }

    public final synchronized void O3(tu tuVar) {
        if (this.E) {
            return;
        }
        this.D = true;
        this.C = tuVar;
        av0 av0Var = this.f13003z;
        if (av0Var == null) {
            return;
        }
        cv0 cv0Var = av0Var.B;
        synchronized (cv0Var) {
            cv0Var.f7143a = tuVar;
        }
    }

    public final synchronized void P3(a aVar) {
        if (this.E) {
            return;
        }
        Object e02 = b.e0(aVar);
        if (!(e02 instanceof av0)) {
            g1.j("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            av0Var.f(this);
        }
        synchronized (this) {
            this.f13001w.execute(new d0(this, 3));
            av0 av0Var2 = (av0) e02;
            this.f13003z = av0Var2;
            av0Var2.e(this);
            this.f13003z.c(this.f12999u);
            av0 av0Var3 = this.f13003z;
            FrameLayout frameLayout = this.f13000v;
            a s10 = av0Var3.f6261j.s();
            if (av0Var3.f6264m.b() && s10 != null && frameLayout != null) {
                s.B.f5807v.a().f0(s10, frameLayout);
            }
            if (this.D) {
                cv0 cv0Var = this.f13003z.B;
                tu tuVar = this.C;
                synchronized (cv0Var) {
                    cv0Var.f7143a = tuVar;
                }
            }
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8128k2)).booleanValue() || TextUtils.isEmpty(this.f13003z.f6264m.a())) {
                return;
            }
            Q3(this.f13003z.f6264m.a());
        }
    }

    public final synchronized void Q3(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f13000v.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f13000v.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e10) {
                    g1.k("Encountered invalid base64 watermark.", e10);
                }
            }
        }
        this.f13000v.addView(frameLayout);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    @Override // m4.lw0
    public final synchronized void c0(String str, View view) {
        if (this.E) {
            return;
        }
        if (view == null) {
            this.f12998t.remove(str);
            return;
        }
        this.f12998t.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (v0.i(this.y)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // m4.lw0
    public final /* synthetic */ View d() {
        return this.f12999u;
    }

    @Override // m4.lw0
    public final FrameLayout f() {
        return this.f13000v;
    }

    @Override // m4.lw0
    public final sh h() {
        return this.A;
    }

    @Override // m4.lw0
    public final a i() {
        return this.B;
    }

    @Override // m4.lw0
    public final synchronized Map<String, WeakReference<View>> j() {
        return null;
    }

    @Override // m4.lw0
    public final synchronized JSONObject k() {
        JSONObject g10;
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            FrameLayout frameLayout = this.f12999u;
            Map<String, WeakReference<View>> l10 = l();
            Map<String, WeakReference<View>> o10 = o();
            synchronized (av0Var) {
                g10 = av0Var.f6262k.g(frameLayout, l10, o10);
            }
            return g10;
        }
        return null;
    }

    @Override // m4.lw0
    public final synchronized Map<String, WeakReference<View>> l() {
        return this.f12998t;
    }

    @Override // m4.lw0
    public final synchronized JSONObject m() {
        JSONObject u10;
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            FrameLayout frameLayout = this.f12999u;
            Map<String, WeakReference<View>> l10 = l();
            Map<String, WeakReference<View>> o10 = o();
            synchronized (av0Var) {
                u10 = av0Var.f6262k.u(frameLayout, l10, o10);
            }
            return u10;
        }
        return null;
    }

    @Override // m4.lw0
    public final synchronized String n() {
        return this.f12997s;
    }

    @Override // m4.lw0
    public final synchronized Map<String, WeakReference<View>> o() {
        return this.f12998t;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            synchronized (av0Var) {
                av0Var.f6262k.e();
            }
            this.f13003z.m(view, this.f12999u, l(), o(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            av0Var.l(this.f12999u, l(), o(), av0.g(this.f12999u));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            av0Var.l(this.f12999u, l(), o(), av0.g(this.f12999u));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        av0 av0Var = this.f13003z;
        if (av0Var != null) {
            FrameLayout frameLayout = this.f12999u;
            synchronized (av0Var) {
                av0Var.f6262k.q(motionEvent, frameLayout);
            }
        }
        return false;
    }
}
