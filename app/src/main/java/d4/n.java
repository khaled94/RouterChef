package d4;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b */
    public static n f3894b;

    /* renamed from: c */
    public static final o f3895c = new o(0, false, false, 0, 0);

    /* renamed from: a */
    public o f3896a;

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            if (f3894b == null) {
                f3894b = new n();
            }
            nVar = f3894b;
        }
        return nVar;
    }
}
