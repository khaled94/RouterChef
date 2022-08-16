package s4;

/* loaded from: classes.dex */
public final class cc implements bc {

    /* renamed from: a */
    public static final n5<Boolean> f17784a;

    /* renamed from: b */
    public static final n5<Double> f17785b;

    /* renamed from: c */
    public static final n5<Long> f17786c;

    /* renamed from: d */
    public static final n5<Long> f17787d;

    /* renamed from: e */
    public static final n5<String> f17788e;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f17784a = (i5) l5Var.c("measurement.test.boolean_flag", false);
        f17785b = new j5(l5Var, Double.valueOf(-3.0d));
        f17786c = (h5) l5Var.a("measurement.test.int_flag", -2L);
        f17787d = (h5) l5Var.a("measurement.test.long_flag", -1L);
        f17788e = new k5(l5Var, "measurement.test.string_flag", "---");
    }

    @Override // s4.bc
    public final long a() {
        return f17786c.b().longValue();
    }

    @Override // s4.bc
    public final boolean b() {
        return f17784a.b().booleanValue();
    }

    @Override // s4.bc
    public final long c() {
        return f17787d.b().longValue();
    }

    @Override // s4.bc
    public final String g() {
        return f17788e.b();
    }

    @Override // s4.bc
    public final double zza() {
        return f17785b.b().doubleValue();
    }
}
