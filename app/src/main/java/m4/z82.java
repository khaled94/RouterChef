package m4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class z82 {

    /* renamed from: b */
    public static volatile z82 f16050b;

    /* renamed from: c */
    public static volatile z82 f16051c;

    /* renamed from: d */
    public static final z82 f16052d = new z82(true);

    /* renamed from: a */
    public final Map<y82, l92<?, ?>> f16053a;

    public z82() {
        this.f16053a = new HashMap();
    }

    public z82(boolean z10) {
        this.f16053a = Collections.emptyMap();
    }

    public static z82 a() {
        z82 z82Var = f16050b;
        if (z82Var == null) {
            synchronized (z82.class) {
                z82Var = f16050b;
                if (z82Var == null) {
                    z82Var = f16052d;
                    f16050b = z82Var;
                }
            }
        }
        return z82Var;
    }

    public static z82 b() {
        z82 z82Var = f16051c;
        if (z82Var != null) {
            return z82Var;
        }
        synchronized (z82.class) {
            z82 z82Var2 = f16051c;
            if (z82Var2 != null) {
                return z82Var2;
            }
            z82 b10 = h92.b();
            f16051c = b10;
            return b10;
        }
    }
}
