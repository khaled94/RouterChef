package m4;

/* loaded from: classes.dex */
public abstract class pb2<T, B> {
    public abstract int a(T t10);

    public abstract int b(T t10);

    public abstract B c(Object obj);

    public abstract T d(Object obj);

    public abstract T e(T t10, T t11);

    public abstract B f();

    public abstract T g(B b10);

    public abstract void h(B b10, int i10, int i11);

    public abstract void i(B b10, int i10, long j3);

    public abstract void j(B b10, int i10, T t10);

    public abstract void k(B b10, int i10, n82 n82Var);

    public abstract void l(B b10, int i10, long j3);

    public abstract void m(Object obj);

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t10);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p(B b10, s82 s82Var) {
        int i10 = s82Var.f13549b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            l(b10, i11, s82Var.F());
            return true;
        } else if (i12 == 1) {
            i(b10, i11, s82Var.E());
            return true;
        } else if (i12 == 2) {
            k(b10, i11, s82Var.J());
            return true;
        } else if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 == 5) {
                h(b10, i11, s82Var.z());
                return true;
            }
            int i13 = x92.f15256t;
            throw new w92();
        } else {
            Object f10 = f();
            int i14 = 4 | (i11 << 3);
            while (s82Var.x() != Integer.MAX_VALUE && p(f10, s82Var)) {
            }
            if (i14 != s82Var.f13549b) {
                throw x92.b();
            }
            g(f10);
            j(b10, i11, f10);
            return true;
        }
    }

    public abstract void q();

    public abstract void r(T t10, w82 w82Var);
}
