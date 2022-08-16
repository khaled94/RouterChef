package t2;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import t2.i;

@AutoValue
/* loaded from: classes.dex */
public abstract class n {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public final a a(String str, int i10) {
            d().put(str, String.valueOf(i10));
            return this;
        }

        public final a b(String str, String str2) {
            d().put(str, str2);
            return this;
        }

        public abstract n c();

        public abstract Map<String, String> d();

        public abstract a e(long j3);

        public abstract a f(String str);

        public abstract a g(long j3);
    }

    public static a a() {
        i.b bVar = new i.b();
        bVar.f18526f = new HashMap();
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract m e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public final a j() {
        i.b bVar = new i.b();
        bVar.f(h());
        bVar.f18522b = d();
        bVar.h(e());
        bVar.e(f());
        bVar.g(i());
        bVar.f18526f = new HashMap(c());
        return bVar;
    }
}
