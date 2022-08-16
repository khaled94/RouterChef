package n3;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import l3.s;
import m4.ba0;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a */
    public final View f16464a;

    /* renamed from: b */
    public Activity f16465b;

    /* renamed from: c */
    public boolean f16466c;

    /* renamed from: d */
    public boolean f16467d;

    /* renamed from: e */
    public boolean f16468e;

    /* renamed from: f */
    public final ViewTreeObserver.OnGlobalLayoutListener f16469f;

    public f1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f16465b = activity;
        this.f16464a = view;
        this.f16469f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (!this.f16466c) {
            Activity activity = this.f16465b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f16469f;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = null;
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            ba0 ba0Var = s.B.A;
            ba0.a(this.f16464a, this.f16469f);
            this.f16466c = true;
        }
    }

    public final void b() {
        View decorView;
        Activity activity = this.f16465b;
        if (activity != null && this.f16466c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f16469f;
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                viewTreeObserver = decorView.getViewTreeObserver();
            }
            if (viewTreeObserver != null) {
                x1 x1Var = s.B.f5791e;
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f16466c = false;
        }
    }
}
