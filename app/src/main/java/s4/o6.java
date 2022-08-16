package s4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o6 {

    /* renamed from: b */
    public static volatile o6 f18042b;

    /* renamed from: c */
    public static volatile o6 f18043c;

    /* renamed from: d */
    public static final o6 f18044d = new o6(true);

    /* renamed from: a */
    public final Map<n6, a7<?, ?>> f18045a;

    public o6() {
        this.f18045a = new HashMap();
    }

    public o6(boolean z10) {
        this.f18045a = Collections.emptyMap();
    }

    public static o6 a() {
        o6 o6Var = f18042b;
        if (o6Var == null) {
            synchronized (o6.class) {
                o6Var = f18042b;
                if (o6Var == null) {
                    o6Var = f18044d;
                    f18042b = o6Var;
                }
            }
        }
        return o6Var;
    }
}
