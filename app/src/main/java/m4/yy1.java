package m4;

import d.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class yy1<V> extends sy1<Object, List<Object>> {
    @CheckForNull
    public List<zy1<Object>> H;

    public yy1(bw1 bw1Var) {
        super(bw1Var, true, true);
        List<zy1<Object>> list;
        if (bw1Var.isEmpty()) {
            list = Collections.emptyList();
        } else {
            int size = bw1Var.size();
            b.c(size, "initialArraySize");
            list = new ArrayList(size);
        }
        for (int i10 = 0; i10 < bw1Var.size(); i10++) {
            list.add(null);
        }
        this.H = list;
        z();
    }

    @Override // m4.sy1
    public final void r(int i10) {
        this.D = null;
        this.H = null;
    }

    @Override // m4.sy1
    public final void x(int i10, Object obj) {
        List<zy1<Object>> list = this.H;
        if (list != null) {
            list.set(i10, new zy1<>(obj));
        }
    }

    @Override // m4.sy1
    public final void y() {
        List<zy1<Object>> list = this.H;
        if (list != null) {
            int size = list.size();
            b.c(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            Iterator<zy1<Object>> it = list.iterator();
            while (it.hasNext()) {
                zy1<Object> next = it.next();
                arrayList.add(next != null ? next.f16352a : null);
            }
            l(Collections.unmodifiableList(arrayList));
        }
    }
}
