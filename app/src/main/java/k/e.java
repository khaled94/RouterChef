package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import g0.a;
import g0.b;
import g0.c;
import r.g;

/* loaded from: classes.dex */
public class e extends b implements Menu {

    /* renamed from: d */
    public final a f5539d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f5539d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return c(this.f5539d.add(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f5539d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f5539d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f5539d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f5539d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return d(this.f5539d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f5539d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f5539d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f5539d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        g<b, MenuItem> gVar = this.f5526b;
        if (gVar != null) {
            gVar.clear();
        }
        g<c, SubMenu> gVar2 = this.f5527c;
        if (gVar2 != null) {
            gVar2.clear();
        }
        this.f5539d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f5539d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return c(this.f5539d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return c(this.f5539d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f5539d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f5539d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f5539d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f5539d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (this.f5526b != null) {
            int i11 = 0;
            while (true) {
                g<b, MenuItem> gVar = this.f5526b;
                if (i11 >= gVar.f17201u) {
                    break;
                }
                if (gVar.h(i11).getGroupId() == i10) {
                    this.f5526b.i(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f5539d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (this.f5526b != null) {
            int i11 = 0;
            while (true) {
                g<b, MenuItem> gVar = this.f5526b;
                if (i11 >= gVar.f17201u) {
                    break;
                } else if (gVar.h(i11).getItemId() == i10) {
                    this.f5526b.i(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f5539d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f5539d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f5539d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f5539d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f5539d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5539d.size();
    }
}
