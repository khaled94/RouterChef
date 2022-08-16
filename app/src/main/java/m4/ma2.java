package m4;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ma2 {
    public static final void a(Object obj, Object obj2) {
        la2 la2Var = (la2) obj;
        ka2 ka2Var = (ka2) obj2;
        if (la2Var.isEmpty()) {
            return;
        }
        Iterator it = la2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((la2) obj).f10695s;
    }

    public static final Object c(Object obj, Object obj2) {
        la2 la2Var = (la2) obj;
        la2 la2Var2 = (la2) obj2;
        if (!la2Var2.isEmpty()) {
            if (!la2Var.f10695s) {
                la2Var = la2Var.a();
            }
            la2Var.c();
            if (!la2Var2.isEmpty()) {
                la2Var.putAll(la2Var2);
            }
        }
        return la2Var;
    }
}
