package i0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public boolean f5163a;

    /* renamed from: b */
    public a f5164b;

    /* renamed from: c */
    public boolean f5165c;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public final void a() {
        synchronized (this) {
            if (this.f5163a) {
                return;
            }
            this.f5163a = true;
            this.f5165c = true;
            a aVar = this.f5164b;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f5165c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f5165c = false;
                notifyAll();
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            while (this.f5165c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f5164b == aVar) {
                return;
            }
            this.f5164b = aVar;
            if (!this.f5163a) {
                return;
            }
            aVar.a();
        }
    }
}
