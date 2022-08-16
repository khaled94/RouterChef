package m4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class g01 {
    @GuardedBy("this")

    /* renamed from: a */
    public final Map<String, f01> f8696a = new HashMap();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, m4.f01>, java.util.HashMap] */
    @Nullable
    public final f01 a(List<String> list) {
        f01 f01Var;
        for (String str : list) {
            synchronized (this) {
                f01Var = (f01) this.f8696a.get(str);
            }
            if (f01Var != null) {
                return f01Var;
            }
        }
        return null;
    }
}
