package m0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final Runnable f5877a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<k> f5878b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<k, a> f5879c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {
    }

    public i(Runnable runnable) {
        this.f5877a = runnable;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        Iterator<k> it = this.f5878b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public final boolean b(MenuItem menuItem) {
        Iterator<k> it = this.f5878b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<m0.k, m0.i$a>] */
    public final void c(k kVar) {
        this.f5878b.remove(kVar);
        if (((a) this.f5879c.remove(kVar)) == null) {
            this.f5877a.run();
            return;
        }
        throw null;
    }
}
