package s4;

/* loaded from: classes.dex */
public final class x6 implements c8 {

    /* renamed from: a */
    public static final x6 f18185a = new x6();

    @Override // s4.c8
    public final b8 a(Class<?> cls) {
        if (!b7.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (b8) b7.p(cls.asSubclass(b7.class)).r(3);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }

    @Override // s4.c8
    public final boolean b(Class<?> cls) {
        return b7.class.isAssignableFrom(cls);
    }
}
