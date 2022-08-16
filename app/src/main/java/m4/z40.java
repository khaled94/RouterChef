package m4;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class z40 {

    /* renamed from: a */
    public static final w10 f16002a = new w10();

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract d30 d(int i10, d30 d30Var, boolean z10);

    public abstract j40 e(int i10, j40 j40Var, long j3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        if (z40Var.c() != c() || z40Var.b() != b()) {
            return false;
        }
        j40 j40Var = new j40();
        d30 d30Var = new d30();
        j40 j40Var2 = new j40();
        d30 d30Var2 = new d30();
        for (int i10 = 0; i10 < c(); i10++) {
            if (!e(i10, j40Var, 0L).equals(z40Var.e(i10, j40Var2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < b(); i11++) {
            if (!d(i11, d30Var, true).equals(z40Var.d(i11, d30Var2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract Object f(int i10);

    public int g(boolean z10) {
        return o() ? -1 : 0;
    }

    public int h(boolean z10) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i10;
        j40 j40Var = new j40();
        d30 d30Var = new d30();
        int c10 = c() + 217;
        int i11 = 0;
        while (true) {
            i10 = c10 * 31;
            if (i11 >= c()) {
                break;
            }
            c10 = i10 + e(i11, j40Var, 0L).hashCode();
            i11++;
        }
        int b10 = b() + i10;
        for (int i12 = 0; i12 < b(); i12++) {
            b10 = (b10 * 31) + d(i12, d30Var, true).hashCode();
        }
        return b10;
    }

    public final int i(int i10, d30 d30Var, j40 j40Var, int i11, boolean z10) {
        int i12 = d(i10, d30Var, false).f7204c;
        if (e(i12, j40Var, 0L).f9847m == i10) {
            int j3 = j(i12, i11, z10);
            if (j3 != -1) {
                return e(j3, j40Var, 0L).f9846l;
            }
            return -1;
        }
        return i10 + 1;
    }

    public int j(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 != h(z10)) {
                return i10 + 1;
            }
            return -1;
        } else if (i11 == 1) {
            return i10;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException();
            }
            return i10 == h(z10) ? g(z10) : i10 + 1;
        }
    }

    public int k(int i10) {
        if (i10 == g(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair<Object, Long> l(j40 j40Var, d30 d30Var, int i10, long j3) {
        Pair<Object, Long> m10 = m(j40Var, d30Var, i10, j3, 0L);
        Objects.requireNonNull(m10);
        return m10;
    }

    public final Pair<Object, Long> m(j40 j40Var, d30 d30Var, int i10, long j3, long j10) {
        r01.b(i10, c());
        e(i10, j40Var, j10);
        if (j3 == -9223372036854775807L) {
            Objects.requireNonNull(j40Var);
            j3 = 0;
        }
        int i11 = j40Var.f9846l;
        d(i11, d30Var, false);
        while (i11 < j40Var.f9847m) {
            Objects.requireNonNull(d30Var);
            int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            Objects.requireNonNull(d(i13, d30Var, false));
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        d(i11, d30Var, true);
        Objects.requireNonNull(d30Var);
        long j11 = d30Var.f7205d;
        if (j11 != -9223372036854775807L) {
            j3 = Math.min(j3, j11 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = d30Var.f7203b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public d30 n(Object obj, d30 d30Var) {
        return d(a(obj), d30Var, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
