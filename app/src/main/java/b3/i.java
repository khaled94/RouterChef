package b3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i implements u8.a {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final i f2517a = new i();
    }

    @Override // u8.a
    public final Object get() {
        b3.a aVar = e.f2509a;
        Objects.requireNonNull(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
