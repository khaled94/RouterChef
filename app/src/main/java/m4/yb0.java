package m4;

/* loaded from: classes.dex */
public final class yb0 {

    /* renamed from: a */
    public final eg f15642a = new eg();

    /* renamed from: b */
    public long f15643b = 15000000;

    /* renamed from: c */
    public long f15644c = 30000000;

    /* renamed from: d */
    public long f15645d = 2500000;

    /* renamed from: e */
    public long f15646e = 5000000;

    /* renamed from: f */
    public int f15647f;

    /* renamed from: g */
    public boolean f15648g;

    public final void a() {
        c(false);
    }

    public final void b() {
        c(true);
    }

    public final void c(boolean z10) {
        this.f15647f = 0;
        this.f15648g = false;
        if (z10) {
            eg egVar = this.f15642a;
            synchronized (egVar) {
                synchronized (egVar) {
                    int i10 = egVar.f7839b;
                    egVar.f7839b = 0;
                    if (i10 > 0) {
                        egVar.c();
                    }
                }
            }
        }
    }

    public final synchronized boolean d(long j3, boolean z10) {
        long j10;
        j10 = z10 ? this.f15646e : this.f15645d;
        return j10 <= 0 || j3 >= j10;
    }
}
