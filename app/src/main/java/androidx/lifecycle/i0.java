package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final HashMap<String, e0> f1700a = new HashMap<>();

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void a() {
        for (e0 e0Var : this.f1700a.values()) {
            Map<String, Object> map = e0Var.f1674a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : e0Var.f1674a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    }
                }
            }
            Set<Closeable> set = e0Var.f1675b;
            if (set != null) {
                synchronized (set) {
                    for (Closeable closeable : e0Var.f1675b) {
                        if (closeable instanceof Closeable) {
                            try {
                                closeable.close();
                            } catch (IOException e11) {
                                throw new RuntimeException(e11);
                            }
                        }
                    }
                }
            }
            e0Var.a();
        }
        this.f1700a.clear();
    }
}
