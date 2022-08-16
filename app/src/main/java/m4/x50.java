package m4;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class x50 {
    public /* synthetic */ x50() {
    }

    public static x50 e(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new ed2(cls.getSimpleName()) : new fd2(cls.getSimpleName());
    }

    public abstract int a(vy1 vy1Var);

    public abstract tz1 b();

    public abstract void c(String str);

    public abstract boolean d(char c10);

    public abstract ro0 f();

    public abstract void g(vy1 vy1Var, Set set);

    public abstract cp0 h();

    public abstract gp0 i();

    public abstract ip0 j();

    public abstract ls0 k();

    public abstract eb1 l();

    public abstract kb1 m();

    public /* synthetic */ x50(int i10) {
    }
}
