package n9;

import b7.c;
import i9.e;
import java.util.Iterator;
import java.util.List;
import k9.t0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final t0 f16715a;

    static {
        Object obj;
        c.g("kotlinx.coroutines.fast.service.loader", true);
        List<? extends k> w10 = i9.c.w(e.v(l.a()));
        Iterator it = w10.iterator();
        t0 t0Var = null;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int loadPriority = ((k) obj).getLoadPriority();
                do {
                    Object next = it.next();
                    int loadPriority2 = ((k) next).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        obj = next;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            t0Var = kVar.createDispatcher(w10);
        }
        if (t0Var != null) {
            f16715a = t0Var;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
