package m0;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public a f5851a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.f5851a != null) {
            StringBuilder c10 = androidx.activity.result.a.c("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            c10.append(getClass().getSimpleName());
            c10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", c10.toString());
        }
        this.f5851a = aVar;
    }
}
