package s4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b9 extends z8<a9, a9> {
    @Override // s4.z8
    public final /* bridge */ /* synthetic */ int a(a9 a9Var) {
        return a9Var.a();
    }

    @Override // s4.z8
    public final int b(a9 a9Var) {
        a9 a9Var2 = a9Var;
        int i10 = a9Var2.f17724d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < a9Var2.f17721a; i12++) {
                int i13 = a9Var2.f17722b[i12];
                int g10 = k6.g(8);
                int g11 = ((g6) a9Var2.f17723c[i12]).g();
                i11 += k6.g(g11) + g11 + k6.g(24) + k6.g(i13 >>> 3) + k6.g(16) + g10 + g10;
            }
            a9Var2.f17724d = i11;
            return i11;
        }
        return i10;
    }

    @Override // s4.z8
    public final /* bridge */ /* synthetic */ a9 c(Object obj) {
        return ((b7) obj).zzc;
    }

    @Override // s4.z8
    public final a9 d(a9 a9Var, a9 a9Var2) {
        a9 a9Var3 = a9Var2;
        if (a9Var3.equals(a9.f17720f)) {
            return a9Var;
        }
        a9 a9Var4 = a9Var;
        int i10 = a9Var4.f17721a + a9Var3.f17721a;
        int[] copyOf = Arrays.copyOf(a9Var4.f17722b, i10);
        System.arraycopy(a9Var3.f17722b, 0, copyOf, a9Var4.f17721a, a9Var3.f17721a);
        Object[] copyOf2 = Arrays.copyOf(a9Var4.f17723c, i10);
        System.arraycopy(a9Var3.f17723c, 0, copyOf2, a9Var4.f17721a, a9Var3.f17721a);
        return new a9(i10, copyOf, copyOf2, true);
    }

    @Override // s4.z8
    public final /* bridge */ /* synthetic */ a9 e() {
        return a9.b();
    }

    @Override // s4.z8
    public final /* bridge */ /* synthetic */ void f(a9 a9Var, int i10, long j3) {
        a9Var.c(i10 << 3, Long.valueOf(j3));
    }

    @Override // s4.z8
    public final void g(Object obj) {
        ((b7) obj).zzc.f17725e = false;
    }

    @Override // s4.z8
    public final /* bridge */ /* synthetic */ void h(Object obj, a9 a9Var) {
        ((b7) obj).zzc = a9Var;
    }

    @Override // s4.z8
    public final /* bridge */ /* synthetic */ void i(a9 a9Var, l6 l6Var) {
        a9Var.d(l6Var);
    }
}
