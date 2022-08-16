package s9;

/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: s */
    public final String f18392s;

    public b(String str, Object... objArr) {
        this.f18392s = e.j(str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f18392s);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
