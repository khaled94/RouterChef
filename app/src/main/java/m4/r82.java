package m4;

/* loaded from: classes.dex */
public abstract class r82 {

    /* renamed from: a */
    public int f13197a;

    /* renamed from: b */
    public s82 f13198b;

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long f(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    public static r82 g(byte[] bArr, int i10, int i11, boolean z10) {
        o82 o82Var = new o82(bArr, i10, i11);
        try {
            o82Var.k(i11);
            return o82Var;
        } catch (x92 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void A(int i10);

    public abstract void a(int i10);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i10);

    public abstract double h();

    public abstract float i();

    public abstract int j();

    public abstract int k(int i10);

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract n82 x();

    public abstract String y();

    public abstract String z();
}
