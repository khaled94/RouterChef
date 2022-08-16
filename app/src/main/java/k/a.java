package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c0.a;
import f0.a;
import g0.b;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a */
    public CharSequence f5510a;

    /* renamed from: b */
    public CharSequence f5511b;

    /* renamed from: c */
    public Intent f5512c;

    /* renamed from: d */
    public char f5513d;

    /* renamed from: f */
    public char f5515f;

    /* renamed from: h */
    public Drawable f5517h;

    /* renamed from: i */
    public Context f5518i;

    /* renamed from: j */
    public CharSequence f5519j;

    /* renamed from: k */
    public CharSequence f5520k;

    /* renamed from: e */
    public int f5514e = 4096;

    /* renamed from: g */
    public int f5516g = 4096;

    /* renamed from: l */
    public ColorStateList f5521l = null;

    /* renamed from: m */
    public PorterDuff.Mode f5522m = null;

    /* renamed from: n */
    public boolean f5523n = false;

    /* renamed from: o */
    public boolean f5524o = false;
    public int p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f5518i = context;
        this.f5510a = charSequence;
    }

    @Override // g0.b
    public final m0.b a() {
        return null;
    }

    @Override // g0.b
    public final b b(m0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f5517h;
        if (drawable != null) {
            if (!this.f5523n && !this.f5524o) {
                return;
            }
            this.f5517h = drawable;
            Drawable mutate = drawable.mutate();
            this.f5517h = mutate;
            if (this.f5523n) {
                a.b.h(mutate, this.f5521l);
            }
            if (!this.f5524o) {
                return;
            }
            a.b.i(this.f5517h, this.f5522m);
        }
    }

    @Override // g0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // g0.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // g0.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // g0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5516g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5515f;
    }

    @Override // g0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5519j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5517h;
    }

    @Override // g0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5521l;
    }

    @Override // g0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5522m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5512c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5514e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5513d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5510a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5511b;
        return charSequence != null ? charSequence : this.f5510a;
    }

    @Override // g0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5520k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // g0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f5515f = Character.toLowerCase(c10);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f5515f = Character.toLowerCase(c10);
        this.f5516g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.p = (z10 ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.p = (z10 ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* renamed from: setContentDescription */
    public final MenuItem mo15setContentDescription(CharSequence charSequence) {
        this.f5519j = charSequence;
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* renamed from: setContentDescription */
    public final b mo15setContentDescription(CharSequence charSequence) {
        this.f5519j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.p = (z10 ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Context context = this.f5518i;
        Object obj = c0.a.f2602a;
        this.f5517h = a.b.b(context, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5517h = drawable;
        c();
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5521l = colorStateList;
        this.f5523n = true;
        c();
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5522m = mode;
        this.f5524o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5512c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f5513d = c10;
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f5513d = c10;
        this.f5514e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f5513d = c10;
        this.f5515f = Character.toLowerCase(c11);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f5513d = c10;
        this.f5514e = KeyEvent.normalizeMetaState(i10);
        this.f5515f = Character.toLowerCase(c11);
        this.f5516g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f5510a = this.f5518i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5510a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5511b = charSequence;
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* renamed from: setTooltipText */
    public final MenuItem mo16setTooltipText(CharSequence charSequence) {
        this.f5520k = charSequence;
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* renamed from: setTooltipText */
    public final b mo16setTooltipText(CharSequence charSequence) {
        this.f5520k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.p & 8;
        if (z10) {
            i10 = 0;
        }
        this.p = i11 | i10;
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
