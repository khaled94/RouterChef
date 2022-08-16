package m4;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class hm2 {

    /* renamed from: a */
    public final CopyOnWriteArrayList<gm2> f9380a = new CopyOnWriteArrayList<>();

    public final void a(im2 im2Var) {
        Iterator<gm2> it = this.f9380a.iterator();
        while (it.hasNext()) {
            gm2 next = it.next();
            if (next.f8971b == im2Var) {
                next.f8972c = true;
                this.f9380a.remove(next);
            }
        }
    }
}
