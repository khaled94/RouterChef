package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j0 extends e0 {

    /* renamed from: i */
    public static final a f1455i = new a();

    /* renamed from: f */
    public final boolean f1459f;

    /* renamed from: c */
    public final HashMap<String, o> f1456c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, j0> f1457d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, i0> f1458e = new HashMap<>();

    /* renamed from: g */
    public boolean f1460g = false;

    /* renamed from: h */
    public boolean f1461h = false;

    /* loaded from: classes.dex */
    public class a implements g0.a {
        @Override // androidx.lifecycle.g0.a
        public final <T extends e0> T a(Class<T> cls) {
            return new j0(true);
        }

        @Override // androidx.lifecycle.g0.a
        public final e0 b(Class cls, c1.a aVar) {
            return a(cls);
        }
    }

    public j0(boolean z10) {
        this.f1459f = z10;
    }

    @Override // androidx.lifecycle.e0
    public final void a() {
        if (g0.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1460g = true;
    }

    public final void b(o oVar) {
        if (g0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        c(oVar.f1520w);
    }

    public final void c(String str) {
        j0 j0Var = this.f1457d.get(str);
        if (j0Var != null) {
            j0Var.a();
            this.f1457d.remove(str);
        }
        i0 i0Var = this.f1458e.get(str);
        if (i0Var != null) {
            i0Var.a();
            this.f1458e.remove(str);
        }
    }

    public final void d(o oVar) {
        if (this.f1461h) {
            if (!g0.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            return;
        }
        if (!(this.f1456c.remove(oVar.f1520w) != null) || !g0.K(2)) {
            return;
        }
        Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f1456c.equals(j0Var.f1456c) && this.f1457d.equals(j0Var.f1457d) && this.f1458e.equals(j0Var.f1458e);
    }

    public final int hashCode() {
        int hashCode = this.f1457d.hashCode();
        return this.f1458e.hashCode() + ((hashCode + (this.f1456c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<o> it = this.f1456c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1457d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1458e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
