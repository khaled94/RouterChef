package m4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mc0 implements Iterable<lc0> {

    /* renamed from: s */
    public final List<lc0> f11146s = new ArrayList();

    public final lc0 d(fb0 fb0Var) {
        Iterator<lc0> it = iterator();
        while (it.hasNext()) {
            lc0 next = it.next();
            if (next.f10710b == fb0Var) {
                return next;
            }
        }
        return null;
    }

    public final boolean e(fb0 fb0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<lc0> it = iterator();
        while (it.hasNext()) {
            lc0 next = it.next();
            if (next.f10710b == fb0Var) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((lc0) it2.next()).f10711c.h();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.lc0>, java.util.ArrayList] */
    @Override // java.lang.Iterable
    public final Iterator<lc0> iterator() {
        return this.f11146s.iterator();
    }
}
