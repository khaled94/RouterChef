package t2;

import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o implements u8.a {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final o f18542a = new o();
    }

    @Override // u8.a
    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
