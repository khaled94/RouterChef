package s4;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class z7 {
    public static final void a(Object obj, Object obj2) {
        y7 y7Var = (y7) obj;
        w7 w7Var = (w7) obj2;
        if (y7Var.isEmpty()) {
            return;
        }
        Iterator it = y7Var.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        y7 y7Var = (y7) obj;
        y7 y7Var2 = (y7) obj2;
        if (!y7Var2.isEmpty()) {
            if (!y7Var.f18208s) {
                y7Var = y7Var.isEmpty() ? new y7() : new y7(y7Var);
            }
            y7Var.b();
            if (!y7Var2.isEmpty()) {
                y7Var.putAll(y7Var2);
            }
        }
        return y7Var;
    }
}
