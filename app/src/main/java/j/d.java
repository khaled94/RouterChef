package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import j.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends a implements e.a {

    /* renamed from: u */
    public Context f5324u;

    /* renamed from: v */
    public ActionBarContextView f5325v;

    /* renamed from: w */
    public a.AbstractC0076a f5326w;

    /* renamed from: x */
    public WeakReference<View> f5327x;
    public boolean y;

    /* renamed from: z */
    public e f5328z;

    public d(Context context, ActionBarContextView actionBarContextView, a.AbstractC0076a abstractC0076a) {
        this.f5324u = context;
        this.f5325v = actionBarContextView;
        this.f5326w = abstractC0076a;
        e eVar = new e(actionBarContextView.getContext());
        eVar.f562l = 1;
        this.f5328z = eVar;
        eVar.f555e = this;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public final boolean a(e eVar, MenuItem menuItem) {
        return this.f5326w.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public final void b(e eVar) {
        i();
        c cVar = this.f5325v.f766v;
        if (cVar != null) {
            cVar.m();
        }
    }

    @Override // j.a
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.f5326w.c(this);
    }

    @Override // j.a
    public final View d() {
        WeakReference<View> weakReference = this.f5327x;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final Menu e() {
        return this.f5328z;
    }

    @Override // j.a
    public final MenuInflater f() {
        return new f(this.f5325v.getContext());
    }

    @Override // j.a
    public final CharSequence g() {
        return this.f5325v.getSubtitle();
    }

    @Override // j.a
    public final CharSequence h() {
        return this.f5325v.getTitle();
    }

    @Override // j.a
    public final void i() {
        this.f5326w.d(this, this.f5328z);
    }

    @Override // j.a
    public final boolean j() {
        return this.f5325v.K;
    }

    @Override // j.a
    public final void k(View view) {
        this.f5325v.setCustomView(view);
        this.f5327x = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.a
    public final void l(int i10) {
        this.f5325v.setSubtitle(this.f5324u.getString(i10));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.f5325v.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void n(int i10) {
        this.f5325v.setTitle(this.f5324u.getString(i10));
    }

    @Override // j.a
    public final void o(CharSequence charSequence) {
        this.f5325v.setTitle(charSequence);
    }

    @Override // j.a
    public final void p(boolean z10) {
        this.f5318t = z10;
        this.f5325v.setTitleOptional(z10);
    }
}
