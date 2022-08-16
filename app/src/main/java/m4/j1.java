package m4;

import h2.a0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: b */
    public mp2 f9784b;

    /* renamed from: c */
    public vo2 f9785c;

    /* renamed from: d */
    public h1 f9786d;

    /* renamed from: e */
    public long f9787e;

    /* renamed from: f */
    public long f9788f;

    /* renamed from: g */
    public long f9789g;

    /* renamed from: h */
    public int f9790h;

    /* renamed from: i */
    public int f9791i;

    /* renamed from: k */
    public long f9793k;

    /* renamed from: l */
    public boolean f9794l;

    /* renamed from: m */
    public boolean f9795m;

    /* renamed from: a */
    public final f1 f9783a = new f1();

    /* renamed from: j */
    public a0 f9792j = new a0();

    public abstract long a(dd ddVar);

    public void b(boolean z10) {
        int i10;
        if (z10) {
            this.f9792j = new a0();
            this.f9788f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f9790h = i10;
        this.f9787e = -1L;
        this.f9789g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(dd ddVar, long j3, a0 a0Var);

    public final long d(long j3) {
        return (this.f9791i * j3) / 1000000;
    }

    public void e(long j3) {
        this.f9789g = j3;
    }
}
