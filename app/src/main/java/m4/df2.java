package m4;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class df2 extends z40 {

    /* renamed from: b */
    public final int f7355b;

    /* renamed from: c */
    public final bl2 f7356c;

    /* renamed from: d */
    public final int f7357d;

    /* renamed from: e */
    public final int f7358e;

    /* renamed from: f */
    public final int[] f7359f;

    /* renamed from: g */
    public final int[] f7360g;

    /* renamed from: h */
    public final z40[] f7361h;

    /* renamed from: i */
    public final Object[] f7362i;

    /* renamed from: j */
    public final HashMap<Object, Integer> f7363j = new HashMap<>();

    public df2(Collection<? extends re2> collection, bl2 bl2Var) {
        this.f7356c = bl2Var;
        this.f7355b = bl2Var.f6566b.length;
        int size = collection.size();
        this.f7359f = new int[size];
        this.f7360g = new int[size];
        this.f7361h = new z40[size];
        this.f7362i = new Object[size];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (re2 re2Var : collection) {
            this.f7361h[i12] = re2Var.zza();
            this.f7360g[i12] = i10;
            this.f7359f[i12] = i11;
            i10 += this.f7361h[i12].c();
            i11 += this.f7361h[i12].b();
            this.f7362i[i12] = re2Var.a();
            this.f7363j.put(this.f7362i[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f7357d = i10;
        this.f7358e = i11;
    }

    @Override // m4.z40
    public final int a(Object obj) {
        int a10;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = this.f7363j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (a10 = this.f7361h[intValue].a(obj3)) != -1) {
                return this.f7359f[intValue] + a10;
            }
            return -1;
        }
        return -1;
    }

    @Override // m4.z40
    public final int b() {
        return this.f7358e;
    }

    @Override // m4.z40
    public final int c() {
        return this.f7357d;
    }

    @Override // m4.z40
    public final d30 d(int i10, d30 d30Var, boolean z10) {
        int p = p(i10);
        int i11 = this.f7360g[p];
        this.f7361h[p].d(i10 - this.f7359f[p], d30Var, z10);
        d30Var.f7204c += i11;
        if (z10) {
            Object obj = this.f7362i[p];
            Object obj2 = d30Var.f7203b;
            Objects.requireNonNull(obj2);
            d30Var.f7203b = Pair.create(obj, obj2);
        }
        return d30Var;
    }

    @Override // m4.z40
    public final j40 e(int i10, j40 j40Var, long j3) {
        int q10 = q(i10);
        int i11 = this.f7360g[q10];
        int i12 = this.f7359f[q10];
        this.f7361h[q10].e(i10 - i11, j40Var, j3);
        Object obj = this.f7362i[q10];
        if (!j40.f9833n.equals(j40Var.f9835a)) {
            obj = Pair.create(obj, j40Var.f9835a);
        }
        j40Var.f9835a = obj;
        j40Var.f9846l += i12;
        j40Var.f9847m += i12;
        return j40Var;
    }

    @Override // m4.z40
    public final Object f(int i10) {
        int p = p(i10);
        return Pair.create(this.f7362i[p], this.f7361h[p].f(i10 - this.f7359f[p]));
    }

    @Override // m4.z40
    public final int g(boolean z10) {
        if (this.f7355b == 0) {
            return -1;
        }
        int i10 = 0;
        if (z10) {
            int[] iArr = this.f7356c.f6566b;
            i10 = iArr.length > 0 ? iArr[0] : -1;
        }
        while (this.f7361h[i10].o()) {
            i10 = r(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return this.f7360g[i10] + this.f7361h[i10].g(z10);
    }

    @Override // m4.z40
    public final int h(boolean z10) {
        int i10;
        int i11 = this.f7355b;
        if (i11 == 0) {
            return -1;
        }
        if (z10) {
            int[] iArr = this.f7356c.f6566b;
            int length = iArr.length;
            i10 = length > 0 ? iArr[length - 1] : -1;
        } else {
            i10 = i11 - 1;
        }
        while (this.f7361h[i10].o()) {
            i10 = s(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return this.f7360g[i10] + this.f7361h[i10].h(z10);
    }

    @Override // m4.z40
    public final int j(int i10, int i11, boolean z10) {
        int q10 = q(i10);
        int i12 = this.f7360g[q10];
        int j3 = this.f7361h[q10].j(i10 - i12, i11 == 2 ? 0 : i11, z10);
        if (j3 != -1) {
            return i12 + j3;
        }
        int r10 = r(q10, z10);
        while (r10 != -1 && this.f7361h[r10].o()) {
            r10 = r(r10, z10);
        }
        if (r10 != -1) {
            return this.f7361h[r10].g(z10) + this.f7360g[r10];
        } else if (i11 != 2) {
            return -1;
        } else {
            return g(z10);
        }
    }

    @Override // m4.z40
    public final int k(int i10) {
        int q10 = q(i10);
        int i11 = this.f7360g[q10];
        int k10 = this.f7361h[q10].k(i10 - i11);
        if (k10 != -1) {
            return i11 + k10;
        }
        do {
            q10 = s(q10, false);
            if (q10 == -1) {
                break;
            }
        } while (this.f7361h[q10].o());
        if (q10 == -1) {
            return -1;
        }
        return this.f7361h[q10].h(false) + this.f7360g[q10];
    }

    @Override // m4.z40
    public final d30 n(Object obj, d30 d30Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = this.f7363j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i10 = this.f7360g[intValue];
        this.f7361h[intValue].n(obj3, d30Var);
        d30Var.f7204c += i10;
        d30Var.f7203b = obj;
        return d30Var;
    }

    public final int p(int i10) {
        int[] iArr = this.f7359f;
        int i11 = i10 + 1;
        int i12 = ls1.f10971a;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i11);
        return binarySearch;
    }

    public final int q(int i10) {
        int[] iArr = this.f7360g;
        int i11 = i10 + 1;
        int i12 = ls1.f10971a;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i11);
        return binarySearch;
    }

    public final int r(int i10, boolean z10) {
        if (z10) {
            bl2 bl2Var = this.f7356c;
            int i11 = bl2Var.f6567c[i10] + 1;
            int[] iArr = bl2Var.f6566b;
            if (i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        } else if (i10 < this.f7355b - 1) {
            return i10 + 1;
        } else {
            return -1;
        }
    }

    public final int s(int i10, boolean z10) {
        if (!z10) {
            if (i10 > 0) {
                return (-1) + i10;
            }
            return -1;
        }
        bl2 bl2Var = this.f7356c;
        int i11 = bl2Var.f6567c[i10] - 1;
        if (i11 < 0) {
            return -1;
        }
        return bl2Var.f6566b[i11];
    }
}
