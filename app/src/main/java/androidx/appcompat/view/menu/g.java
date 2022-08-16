package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import f0.a;
import g0.b;
import java.util.Objects;
import m0.b;

/* loaded from: classes.dex */
public final class g implements b {
    public m0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a */
    public final int f577a;

    /* renamed from: b */
    public final int f578b;

    /* renamed from: c */
    public final int f579c;

    /* renamed from: d */
    public final int f580d;

    /* renamed from: e */
    public CharSequence f581e;

    /* renamed from: f */
    public CharSequence f582f;

    /* renamed from: g */
    public Intent f583g;

    /* renamed from: h */
    public char f584h;

    /* renamed from: j */
    public char f586j;

    /* renamed from: l */
    public Drawable f588l;

    /* renamed from: n */
    public e f590n;

    /* renamed from: o */
    public l f591o;
    public MenuItem.OnMenuItemClickListener p;

    /* renamed from: q */
    public CharSequence f592q;

    /* renamed from: r */
    public CharSequence f593r;
    public int y;

    /* renamed from: z */
    public View f600z;

    /* renamed from: i */
    public int f585i = 4096;

    /* renamed from: k */
    public int f587k = 4096;

    /* renamed from: m */
    public int f589m = 0;

    /* renamed from: s */
    public ColorStateList f594s = null;

    /* renamed from: t */
    public PorterDuff.Mode f595t = null;

    /* renamed from: u */
    public boolean f596u = false;

    /* renamed from: v */
    public boolean f597v = false;

    /* renamed from: w */
    public boolean f598w = false;

    /* renamed from: x */
    public int f599x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
            g.this = r1;
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f590n = eVar;
        this.f577a = i11;
        this.f578b = i10;
        this.f579c = i12;
        this.f580d = i13;
        this.f581e = charSequence;
        this.y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // g0.b
    public final m0.b a() {
        return this.A;
    }

    @Override // g0.b
    public final g0.b b(m0.b bVar) {
        m0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f5851a = null;
        }
        this.f600z = null;
        this.A = bVar;
        this.f590n.r(true);
        m0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f600z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f590n.e(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f598w && (this.f596u || this.f597v)) {
            drawable = drawable.mutate();
            if (this.f596u) {
                a.b.h(drawable, this.f594s);
            }
            if (this.f597v) {
                a.b.i(drawable, this.f595t);
            }
            this.f598w = false;
        }
        return drawable;
    }

    public final char e() {
        return this.f590n.o() ? this.f586j : this.f584h;
    }

    @Override // g0.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f590n.g(this);
    }

    public final boolean f() {
        m0.b bVar;
        if ((this.y & 8) != 0) {
            if (this.f600z == null && (bVar = this.A) != null) {
                this.f600z = bVar.d(this);
            }
            return this.f600z != null;
        }
        return false;
    }

    public final boolean g() {
        return (this.f599x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // g0.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f600z;
        if (view != null) {
            return view;
        }
        m0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d5 = bVar.d(this);
        this.f600z = d5;
        return d5;
    }

    @Override // g0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f587k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f586j;
    }

    @Override // g0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f592q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f578b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f588l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f589m;
        if (i10 == 0) {
            return null;
        }
        Drawable b10 = f.a.b(this.f590n.f551a, i10);
        this.f589m = 0;
        this.f588l = b10;
        return d(b10);
    }

    @Override // g0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f594s;
    }

    @Override // g0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f595t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f583g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f577a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f585i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f584h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f579c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f591o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f581e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f582f;
        return charSequence != null ? charSequence : this.f581e;
    }

    @Override // g0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f593r;
    }

    public final boolean h() {
        return (this.f599x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f591o != null;
    }

    public final g0.b i(View view) {
        int i10;
        this.f600z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f577a) > 0) {
            view.setId(i10);
        }
        this.f590n.q();
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f599x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f599x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f599x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        m0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f599x & 8) == 0 : (this.f599x & 8) == 0 && this.A.b();
    }

    public final void j(boolean z10) {
        int i10 = this.f599x;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f599x = i11;
        if (i10 != i11) {
            this.f590n.r(false);
        }
    }

    public final void k(boolean z10) {
        this.f599x = z10 ? this.f599x | 32 : this.f599x & (-33);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        Context context = this.f590n.f551a;
        i(LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f586j == c10) {
            return this;
        }
        this.f586j = Character.toLowerCase(c10);
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f586j == c10 && this.f587k == i10) {
            return this;
        }
        this.f586j = Character.toLowerCase(c10);
        this.f587k = KeyEvent.normalizeMetaState(i10);
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f599x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f599x = i11;
        if (i10 != i11) {
            this.f590n.r(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        if ((this.f599x & 4) != 0) {
            e eVar = this.f590n;
            Objects.requireNonNull(eVar);
            int groupId = getGroupId();
            int size = eVar.f556f.size();
            eVar.B();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = eVar.f556f.get(i10);
                if (gVar.f578b == groupId && gVar.h() && gVar.isCheckable()) {
                    gVar.j(gVar == this);
                }
            }
            eVar.A();
        } else {
            j(z10);
        }
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* renamed from: setContentDescription */
    public final g0.b mo15setContentDescription(CharSequence charSequence) {
        this.f592q = charSequence;
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f599x = z10 ? this.f599x | 16 : this.f599x & (-17);
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f588l = null;
        this.f589m = i10;
        this.f598w = true;
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f589m = 0;
        this.f588l = drawable;
        this.f598w = true;
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f594s = colorStateList;
        this.f596u = true;
        this.f598w = true;
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f595t = mode;
        this.f597v = true;
        this.f598w = true;
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f583g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f584h == c10) {
            return this;
        }
        this.f584h = c10;
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f584h == c10 && this.f585i == i10) {
            return this;
        }
        this.f584h = c10;
        this.f585i = KeyEvent.normalizeMetaState(i10);
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f584h = c10;
        this.f586j = Character.toLowerCase(c11);
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f584h = c10;
        this.f585i = KeyEvent.normalizeMetaState(i10);
        this.f586j = Character.toLowerCase(c11);
        this.f587k = KeyEvent.normalizeMetaState(i11);
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.y = i10;
            this.f590n.q();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // g0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f590n.f551a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f581e = charSequence;
        this.f590n.r(false);
        l lVar = this.f591o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f582f = charSequence;
        this.f590n.r(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* renamed from: setTooltipText */
    public final g0.b mo16setTooltipText(CharSequence charSequence) {
        this.f593r = charSequence;
        this.f590n.r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f599x;
        boolean z11 = false;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f599x = i11;
        if (i10 != i11) {
            z11 = true;
        }
        if (z11) {
            e eVar = this.f590n;
            eVar.f558h = true;
            eVar.r(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f581e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
