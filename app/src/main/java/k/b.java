package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import g0.c;
import r.g;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public final Context f5525a;

    /* renamed from: b */
    public g<g0.b, MenuItem> f5526b;

    /* renamed from: c */
    public g<c, SubMenu> f5527c;

    public b(Context context) {
        this.f5525a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof g0.b) {
            g0.b bVar = (g0.b) menuItem;
            if (this.f5526b == null) {
                this.f5526b = new g<>();
            }
            MenuItem orDefault = this.f5526b.getOrDefault(menuItem, null);
            if (orDefault != null) {
                return orDefault;
            }
            c cVar = new c(this.f5525a, bVar);
            this.f5526b.put(bVar, cVar);
            return cVar;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof c) {
            c cVar = (c) subMenu;
            if (this.f5527c == null) {
                this.f5527c = new g<>();
            }
            SubMenu orDefault = this.f5527c.getOrDefault(cVar, null);
            if (orDefault != null) {
                return orDefault;
            }
            g gVar = new g(this.f5525a, cVar);
            this.f5527c.put(cVar, gVar);
            return gVar;
        }
        return subMenu;
    }
}
