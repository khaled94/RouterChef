package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a */
    public final ArrayList<o> f1500a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, m0> f1501b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, l0> f1502c = new HashMap<>();

    /* renamed from: d */
    public j0 f1503d;

    public final void a(o oVar) {
        if (this.f1500a.contains(oVar)) {
            throw new IllegalStateException("Fragment already added: " + oVar);
        }
        synchronized (this.f1500a) {
            this.f1500a.add(oVar);
        }
        oVar.C = true;
    }

    public final void b() {
        this.f1501b.values().removeAll(Collections.singleton(null));
    }

    public final o c(String str) {
        m0 m0Var = this.f1501b.get(str);
        if (m0Var != null) {
            return m0Var.f1477c;
        }
        return null;
    }

    public final o d(String str) {
        for (m0 m0Var : this.f1501b.values()) {
            if (m0Var != null) {
                o oVar = m0Var.f1477c;
                if (!str.equals(oVar.f1520w)) {
                    oVar = oVar.L.f1401c.d(str);
                }
                if (oVar != null) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final List<m0> e() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f1501b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return arrayList;
    }

    public final List<o> f() {
        ArrayList arrayList = new ArrayList();
        Iterator<m0> it = this.f1501b.values().iterator();
        while (it.hasNext()) {
            m0 next = it.next();
            arrayList.add(next != null ? next.f1477c : null);
        }
        return arrayList;
    }

    public final m0 g(String str) {
        return this.f1501b.get(str);
    }

    public final List<o> h() {
        ArrayList arrayList;
        if (this.f1500a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1500a) {
            arrayList = new ArrayList(this.f1500a);
        }
        return arrayList;
    }

    public final void i(m0 m0Var) {
        o oVar = m0Var.f1477c;
        if (this.f1501b.get(oVar.f1520w) != null) {
            return;
        }
        this.f1501b.put(oVar.f1520w, m0Var);
        if (!g0.K(2)) {
            return;
        }
        Log.v("FragmentManager", "Added fragment to active set " + oVar);
    }

    public final void j(m0 m0Var) {
        o oVar = m0Var.f1477c;
        if (oVar.S) {
            this.f1503d.d(oVar);
        }
        if (this.f1501b.put(oVar.f1520w, null) != null && g0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + oVar);
        }
    }

    public final l0 k(String str, l0 l0Var) {
        return l0Var != null ? this.f1502c.put(str, l0Var) : this.f1502c.remove(str);
    }
}
