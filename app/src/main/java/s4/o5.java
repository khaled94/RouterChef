package s4;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import r.a;
import r.f;

/* loaded from: classes.dex */
public final class o5 implements a5 {

    /* renamed from: a */
    public static final Map<String, o5> f18041a = new a();

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, s4.o5>, r.g] */
    public static o5 a() {
        o5 o5Var;
        if (!u4.a()) {
            synchronized (o5.class) {
                o5Var = (o5) f18041a.getOrDefault(null, null);
                if (o5Var == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return o5Var;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [r.a, java.util.Map<java.lang.String, s4.o5>, r.g] */
    public static synchronized void b() {
        synchronized (o5.class) {
            ?? r12 = f18041a;
            Iterator it = ((f.e) r12.values()).iterator();
            if (it.hasNext()) {
                Objects.requireNonNull((o5) it.next());
                throw null;
            }
            r12.clear();
        }
    }

    @Override // s4.a5
    public final Object z(String str) {
        throw null;
    }
}
