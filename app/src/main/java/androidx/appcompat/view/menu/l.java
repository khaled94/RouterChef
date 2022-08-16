package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public final class l extends e implements SubMenu {
    public g A;

    /* renamed from: z */
    public e f623z;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f623z = eVar;
        this.A = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public final boolean e(g gVar) {
        return this.f623z.e(gVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public final boolean f(e eVar, MenuItem menuItem) {
        return super.f(eVar, menuItem) || this.f623z.f(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public final boolean g(g gVar) {
        return this.f623z.g(gVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.e
    public final String k() {
        g gVar = this.A;
        int i10 = gVar != null ? gVar.f577a : 0;
        if (i10 == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i10;
    }

    @Override // androidx.appcompat.view.menu.e
    public final e l() {
        return this.f623z.l();
    }

    @Override // androidx.appcompat.view.menu.e
    public final boolean n() {
        return this.f623z.n();
    }

    @Override // androidx.appcompat.view.menu.e
    public final boolean o() {
        return this.f623z.o();
    }

    @Override // androidx.appcompat.view.menu.e
    public final boolean p() {
        return this.f623z.p();
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f623z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        z(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        z(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        z(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f623z.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public final void y(e.a aVar) {
        this.f623z.y(aVar);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        z(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        z(0, charSequence, 0, null, null);
        return this;
    }
}
