package m4;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import l3.s;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class pv0 extends yu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, lw0 {

    /* renamed from: s */
    public final WeakReference<View> f12625s;

    /* renamed from: t */
    public final Map<String, WeakReference<View>> f12626t = new HashMap();

    /* renamed from: u */
    public final Map<String, WeakReference<View>> f12627u = new HashMap();

    /* renamed from: v */
    public final Map<String, WeakReference<View>> f12628v = new HashMap();
    @GuardedBy("this")

    /* renamed from: w */
    public av0 f12629w;

    /* renamed from: x */
    public sh f12630x;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    public pv0(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        ba0 ba0Var = s.B.A;
        ba0.a(view, this);
        ba0.b(view, this);
        this.f12625s = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f12626t.put(key, new WeakReference(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f12628v.putAll(this.f12626t);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f12627u.put(entry2.getKey(), new WeakReference(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f12628v.putAll(this.f12627u);
        this.f12630x = new sh(view.getContext(), view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    @Override // m4.lw0
    public final synchronized View E1(String str) {
        WeakReference weakReference = (WeakReference) this.f12628v.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    @Override // m4.lw0
    public final synchronized void c0(String str, View view) {
        this.f12628v.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f12626t.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // m4.lw0
    public final View d() {
        return this.f12625s.get();
    }

    @Override // m4.lw0
    public final FrameLayout f() {
        return null;
    }

    @Override // m4.lw0
    public final sh h() {
        return this.f12630x;
    }

    @Override // m4.lw0
    public final synchronized a i() {
        return null;
    }

    @Override // m4.lw0
    public final synchronized Map<String, WeakReference<View>> j() {
        return this.f12627u;
    }

    @Override // m4.lw0
    public final synchronized JSONObject k() {
        return null;
    }

    @Override // m4.lw0
    public final synchronized Map<String, WeakReference<View>> l() {
        return this.f12628v;
    }

    @Override // m4.lw0
    public final synchronized JSONObject m() {
        JSONObject u10;
        av0 av0Var = this.f12629w;
        if (av0Var != null) {
            View d5 = d();
            Map<String, WeakReference<View>> l10 = l();
            Map<String, WeakReference<View>> o10 = o();
            synchronized (av0Var) {
                u10 = av0Var.f6262k.u(d5, l10, o10);
            }
            return u10;
        }
        return null;
    }

    @Override // m4.lw0
    public final synchronized String n() {
        return "1007";
    }

    @Override // m4.lw0
    public final synchronized Map<String, WeakReference<View>> o() {
        return this.f12626t;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        av0 av0Var = this.f12629w;
        if (av0Var != null) {
            av0Var.m(view, d(), l(), o(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        av0 av0Var = this.f12629w;
        if (av0Var != null) {
            av0Var.l(d(), l(), o(), av0.g(d()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        av0 av0Var = this.f12629w;
        if (av0Var != null) {
            av0Var.l(d(), l(), o(), av0.g(d()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        av0 av0Var = this.f12629w;
        if (av0Var != null) {
            View d5 = d();
            synchronized (av0Var) {
                av0Var.f6262k.q(motionEvent, d5);
            }
        }
        return false;
    }
}
