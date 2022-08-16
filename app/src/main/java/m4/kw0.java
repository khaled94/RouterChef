package m4;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import n3.g1;
import n3.v0;

/* loaded from: classes.dex */
public final class kw0 {

    /* renamed from: a */
    public final yz0 f10589a;

    /* renamed from: b */
    public final ty0 f10590b;

    /* renamed from: c */
    public fw0 f10591c = null;

    public kw0(yz0 yz0Var, ty0 ty0Var) {
        this.f10589a = yz0Var;
        this.f10590b = ty0Var;
    }

    public static final int b(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        g90 g90Var = io.f9708f.f9709a;
        return g90.j(context, i10);
    }

    public final View a(final View view, final WindowManager windowManager) {
        vd0 a10 = this.f10589a.a(on.s(), null, null);
        View view2 = (View) a10;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        he0 he0Var = (he0) a10;
        he0Var.D0("/sendMessageToSdk", new lx() { // from class: m4.gw0
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                vd0 vd0Var = (vd0) obj;
                kw0.this.f10590b.b(map);
            }
        });
        he0Var.D0("/hideValidatorOverlay", new lx() { // from class: m4.iw0
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                kw0 kw0Var = kw0.this;
                WindowManager windowManager2 = windowManager;
                View view3 = view;
                vd0 vd0Var = (vd0) obj;
                Objects.requireNonNull(kw0Var);
                g1.e("Hide native ad policy validator overlay.");
                vd0Var.A().setVisibility(8);
                if (vd0Var.A().getWindowToken() != null) {
                    windowManager2.removeView(vd0Var.A());
                }
                vd0Var.destroy();
                ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                if (kw0Var.f10591c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(kw0Var.f10591c);
            }
        });
        he0Var.D0("/open", new wx(null, null, null, null, null));
        this.f10590b.d(new WeakReference(a10), "/loadNativeAdPolicyViolations", new lx() { // from class: m4.hw0
            /* JADX WARN: Type inference failed for: r10v0, types: [m4.fw0] */
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                kw0 kw0Var = kw0.this;
                final View view3 = view;
                final WindowManager windowManager2 = windowManager;
                final vd0 vd0Var = (vd0) obj;
                Objects.requireNonNull(kw0Var);
                ((ce0) vd0Var.q0()).y = new u8(kw0Var, map);
                if (map == null) {
                    return;
                }
                Context context = view3.getContext();
                yr<Integer> yrVar = es.f8123j5;
                jo joVar = jo.f10145d;
                int b10 = kw0.b(context, (String) map.get("validator_width"), ((Integer) joVar.f10148c.a(yrVar)).intValue());
                int b11 = kw0.b(context, (String) map.get("validator_height"), ((Integer) joVar.f10148c.a(es.f8131k5)).intValue());
                int b12 = kw0.b(context, (String) map.get("validator_x"), 0);
                int b13 = kw0.b(context, (String) map.get("validator_y"), 0);
                vd0Var.J0(cf0.b(b10, b11));
                try {
                    vd0Var.E().getSettings().setUseWideViewPort(((Boolean) joVar.f10148c.a(es.f8139l5)).booleanValue());
                    vd0Var.E().getSettings().setLoadWithOverviewMode(((Boolean) joVar.f10148c.a(es.f8147m5)).booleanValue());
                } catch (NullPointerException unused) {
                }
                final WindowManager.LayoutParams b14 = v0.b();
                b14.x = b12;
                b14.y = b13;
                windowManager2.updateViewLayout(vd0Var.A(), b14);
                final String str = (String) map.get("orientation");
                Rect rect = new Rect();
                if (view3.getGlobalVisibleRect(rect)) {
                    final int i10 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - b13;
                    kw0Var.f10591c = new ViewTreeObserver.OnScrollChangedListener() { // from class: m4.fw0
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            View view4 = view3;
                            vd0 vd0Var2 = vd0Var;
                            String str2 = str;
                            WindowManager.LayoutParams layoutParams = b14;
                            int i11 = i10;
                            WindowManager windowManager3 = windowManager2;
                            Rect rect2 = new Rect();
                            if (!view4.getGlobalVisibleRect(rect2) || vd0Var2.A().getWindowToken() == null) {
                                return;
                            }
                            layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i11;
                            windowManager3.updateViewLayout(vd0Var2.A(), layoutParams);
                        }
                    };
                    ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnScrollChangedListener(kw0Var.f10591c);
                    }
                }
                String str2 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                vd0Var.loadUrl(str2);
            }
        });
        this.f10590b.d(new WeakReference(a10), "/showValidatorOverlay", jw0.f10209s);
        return view2;
    }
}
