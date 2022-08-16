package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.i;
import m0.f0;

/* loaded from: classes.dex */
public interface l0 {
    void a(Menu menu, i.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(int i10);

    void j();

    boolean k();

    void l(int i10);

    void m();

    int n();

    void o(int i10);

    void p();

    f0 q(int i10, long j3);

    void r();

    void s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z10);
}
