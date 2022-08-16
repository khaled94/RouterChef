package m4;

/* loaded from: classes.dex */
public enum z92 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(n82.class, n82.f11571t),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: s */
    public final Class<?> f16062s;

    /* renamed from: t */
    public final Object f16063t;

    z92(Class cls, Object obj) {
        this.f16062s = cls;
        this.f16063t = obj;
    }
}
