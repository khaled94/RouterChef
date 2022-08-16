package m4;

import h4.a;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class bm1 {

    /* renamed from: a */
    public final a f6569a;

    /* renamed from: b */
    public final Object f6570b = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    public volatile int f6572d = 1;

    /* renamed from: c */
    public volatile long f6571c = 0;

    public bm1(a aVar) {
        this.f6569a = aVar;
    }

    public final void a() {
        long a10 = this.f6569a.a();
        synchronized (this.f6570b) {
            if (this.f6572d == 3) {
                if (this.f6571c + ((Long) jo.f10145d.f10148c.a(es.N3)).longValue() <= a10) {
                    this.f6572d = 1;
                }
            }
        }
    }

    public final void b(int i10, int i11) {
        a();
        long a10 = this.f6569a.a();
        synchronized (this.f6570b) {
            if (this.f6572d != i10) {
                return;
            }
            this.f6572d = i11;
            if (this.f6572d == 3) {
                this.f6571c = a10;
            }
        }
    }
}
