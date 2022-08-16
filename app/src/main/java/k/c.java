package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;
import m0.b;

/* loaded from: classes.dex */
public final class c extends k.b implements MenuItem {

    /* renamed from: d */
    public final g0.b f5528d;

    /* renamed from: e */
    public Method f5529e;

    /* loaded from: classes.dex */
    public class a extends m0.b {

        /* renamed from: b */
        public final ActionProvider f5530b;

        public a(Context context, ActionProvider actionProvider) {
            c.this = r1;
            this.f5530b = actionProvider;
        }

        @Override // m0.b
        public final boolean a() {
            return this.f5530b.hasSubMenu();
        }

        @Override // m0.b
        public final View c() {
            return this.f5530b.onCreateActionView();
        }

        @Override // m0.b
        public final boolean e() {
            return this.f5530b.onPerformDefaultAction();
        }

        @Override // m0.b
        public final void f(SubMenu subMenu) {
            this.f5530b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public b.a f5532d;

        public b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // m0.b
        public final boolean b() {
            return this.f5530b.isVisible();
        }

        @Override // m0.b
        public final View d(MenuItem menuItem) {
            return this.f5530b.onCreateActionView(menuItem);
        }

        @Override // m0.b
        public final boolean g() {
            return this.f5530b.overridesItemVisibility();
        }

        @Override // m0.b
        public final void h(b.a aVar) {
            this.f5532d = aVar;
            this.f5530b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z10) {
            b.a aVar = this.f5532d;
            if (aVar != null) {
                androidx.appcompat.view.menu.e eVar = g.this.f590n;
                eVar.f558h = true;
                eVar.r(true);
            }
        }
    }

    /* renamed from: k.c$c */
    /* loaded from: classes.dex */
    public static class C0080c extends FrameLayout implements j.b {

        /* renamed from: s */
        public final CollapsibleActionView f5533s;

        public C0080c(View view) {
            super(view.getContext());
            this.f5533s = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // j.b
        public final void c() {
            this.f5533s.onActionViewExpanded();
        }

        @Override // j.b
        public final void d() {
            this.f5533s.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f5534a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            c.this = r1;
            this.f5534a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5534a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5534a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* loaded from: classes.dex */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: s */
        public final MenuItem.OnMenuItemClickListener f5536s;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            c.this = r1;
            this.f5536s = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5536s.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, g0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f5528d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f5528d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f5528d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        m0.b a10 = this.f5528d.a();
        if (a10 instanceof a) {
            return ((a) a10).f5530b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f5528d.getActionView();
        return actionView instanceof C0080c ? (View) ((C0080c) actionView).f5533s : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5528d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5528d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5528d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f5528d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5528d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5528d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5528d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5528d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f5528d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5528d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5528d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5528d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f5528d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return d(this.f5528d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5528d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f5528d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5528d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f5528d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f5528d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f5528d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f5528d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f5528d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f5528d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f5525a, actionProvider);
        g0.b bVar2 = this.f5528d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        this.f5528d.setActionView(i10);
        View actionView = this.f5528d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f5528d.setActionView(new C0080c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0080c(view);
        }
        this.f5528d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f5528d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f5528d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f5528d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f5528d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5528d.mo15setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f5528d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f5528d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5528d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5528d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5528d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5528d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f5528d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f5528d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5528d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5528d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f5528d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f5528d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        this.f5528d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f5528d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f5528d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5528d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5528d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5528d.mo16setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        return this.f5528d.setVisible(z10);
    }
}
