package f9;

import e9.f;
import java.util.Random;

/* loaded from: classes.dex */
public final class b extends f9.a {

    /* renamed from: u */
    public final a f4721u = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // f9.a
    public final Random b() {
        Random random = this.f4721u.get();
        f.d(random, "implStorage.get()");
        return random;
    }
}
