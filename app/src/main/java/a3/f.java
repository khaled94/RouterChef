package a3;

import a3.c;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q2.d;

@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: a3.f$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0002a {
            public abstract a a();

            public abstract AbstractC0002a b(long j3);

            public abstract AbstractC0002a c();
        }

        public static AbstractC0002a a() {
            c.b bVar = new c.b();
            Set<b> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.f44c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    /* loaded from: classes.dex */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract d3.a a();

    public final long b(d dVar, long j3, int i10) {
        int i11;
        long a10 = j3 - a().a();
        a aVar = c().get(dVar);
        long b10 = aVar.b();
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * b10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((b10 > 1 ? b10 : 2L) * i11))), a10), aVar.d());
    }

    public abstract Map<d, a> c();
}
