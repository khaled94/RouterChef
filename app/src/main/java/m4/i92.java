package m4;

/* loaded from: classes.dex */
public final class i92 implements pa2 {

    /* renamed from: a */
    public static final i92 f9567a = new i92();

    @Override // m4.pa2
    public final oa2 a(Class<?> cls) {
        if (!m92.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (oa2) m92.s(cls.asSubclass(m92.class)).u(3, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }

    @Override // m4.pa2
    public final boolean b(Class<?> cls) {
        return m92.class.isAssignableFrom(cls);
    }
}
