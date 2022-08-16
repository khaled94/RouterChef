package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import com.raouf.routerchef.R;
import e9.f;
import m3.a;

/* loaded from: classes.dex */
public final class h extends Dialog implements l, j {

    /* renamed from: s */
    public m f422s;

    /* renamed from: t */
    public final OnBackPressedDispatcher f423t = new OnBackPressedDispatcher(new g(this, 0));

    public h(Context context, int i10) {
        super(context, i10);
    }

    public static void d(h hVar) {
        f.e(hVar, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.l
    public final g a() {
        return e();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f.e(view, "view");
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.j
    public final OnBackPressedDispatcher b() {
        return this.f423t;
    }

    public final m e() {
        m mVar = this.f422s;
        if (mVar == null) {
            m mVar2 = new m(this);
            this.f422s = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final void f() {
        Window window = getWindow();
        f.c(window);
        a.a(window.getDecorView(), this);
        Window window2 = getWindow();
        f.c(window2);
        View decorView = window2.getDecorView();
        f.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f423t.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e().f(g.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e().f(g.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        e().f(g.b.ON_DESTROY);
        this.f422s = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        f();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        f.e(view, "view");
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f.e(view, "view");
        f();
        super.setContentView(view, layoutParams);
    }
}
