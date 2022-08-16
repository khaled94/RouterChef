package g9;

import e9.f;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends f9.a {
    @Override // f9.a
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        f.d(current, "current()");
        return current;
    }
}
