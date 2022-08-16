package s4;

/* loaded from: classes.dex */
public enum l7 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(g6.class, g6.f17877t),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: s */
    public final Class<?> f17972s;

    /* renamed from: t */
    public final Object f17973t;

    l7(Class cls, Object obj) {
        this.f17972s = cls;
        this.f17973t = obj;
    }
}
