package d4;

/* loaded from: classes.dex */
public abstract class p0<TListener> {

    /* renamed from: a */
    public TListener f3905a = (TListener) Boolean.TRUE;

    /* renamed from: b */
    public boolean f3906b = false;

    /* renamed from: c */
    public final /* synthetic */ b f3907c;

    public p0(b bVar) {
        this.f3907c = bVar;
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        synchronized (this) {
            this.f3905a = null;
        }
        synchronized (this.f3907c.f3816l) {
            this.f3907c.f3816l.remove(this);
        }
    }
}
