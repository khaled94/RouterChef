package s7;

import com.google.auto.value.AutoValue;
import s7.b;

@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(long j3);
    }

    public static a a() {
        b.a aVar = new b.a();
        aVar.b(0L);
        return aVar;
    }

    public abstract int b();

    public abstract String c();

    public abstract long d();
}
