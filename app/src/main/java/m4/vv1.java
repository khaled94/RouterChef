package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class vv1 extends xv1 {
    public static final xv1 f(int i10) {
        return i10 < 0 ? xv1.f15480b : i10 > 0 ? xv1.f15481c : xv1.f15479a;
    }

    @Override // m4.xv1
    public final int a() {
        return 0;
    }

    @Override // m4.xv1
    public final xv1 b(int i10, int i11) {
        return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // m4.xv1
    public final <T> xv1 c(T t10, T t11, Comparator<T> comparator) {
        return f(comparator.compare(t10, t11));
    }

    @Override // m4.xv1
    public final xv1 d(boolean z10, boolean z11) {
        return f(z10 == z11 ? 0 : !z10 ? -1 : 1);
    }

    @Override // m4.xv1
    public final xv1 e() {
        return f(0);
    }
}
