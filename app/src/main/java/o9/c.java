package o9;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: u */
    public static final c f16828u = new c();

    public c() {
        super(k.f16836b, k.f16837c, k.f16838d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // k9.q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
