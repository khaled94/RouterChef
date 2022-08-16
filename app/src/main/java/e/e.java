package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.m1;
import androidx.fragment.app.t;
import b0.b;
import b0.l;
import c0.a;
import e1.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l4.b;
import m3.a;
import r.c;

/* loaded from: classes.dex */
public class e extends t implements f {
    public h K;

    public e() {
        this.f388w.f5437b.b("androidx:appcompat", new c(this));
        G(new d(this));
    }

    private void I() {
        a.a(getWindow().getDecorView(), this);
        b.j(getWindow().getDecorView(), this);
        h.b(getWindow().getDecorView(), this);
    }

    public final g L() {
        if (this.K == null) {
            c<WeakReference<g>> cVar = g.f4181s;
            this.K = new h(this, null, this, this);
        }
        return this.K;
    }

    public final a M() {
        return L().h();
    }

    public final Intent N() {
        return l.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        I();
        L().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(L().d(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        M();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // b0.j, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        M();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i10) {
        return (T) L().e(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return L().g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = m1.f960a;
        return super.getResources();
    }

    @Override // e.f
    public final void h() {
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        L().j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L().k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        L().m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.t, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent a10;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a M = M();
        if (menuItem.getItemId() == 16908332 && M != null && (M.a() & 4) != 0 && (a10 = l.a(this)) != null) {
            if (l.a.c(this, a10)) {
                ArrayList arrayList = new ArrayList();
                Intent N = N();
                if (N == null) {
                    N = l.a(this);
                }
                if (N != null) {
                    ComponentName component = N.getComponent();
                    if (component == null) {
                        component = N.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            Intent b10 = l.b(this, component);
                            if (b10 == null) {
                                break;
                            }
                            arrayList.add(size, b10);
                            component = b10.getComponent();
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException(e10);
                        }
                    }
                    arrayList.add(N);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    Object obj = c0.a.f2602a;
                    a.C0037a.a(this, intentArr, null);
                    try {
                        int i11 = b0.b.f2397c;
                        b.a.a(this);
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            l.a.b(this, a10);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((h) L()).H();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        L().n();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        L().o();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
        L().p();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        L().w(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        M();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // e.f
    public final void r() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        I();
        L().s(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        I();
        L().t(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        I();
        L().u(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        L().v(i10);
    }

    @Override // e.f
    public final void z() {
    }
}
