package s4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a9 {

    /* renamed from: f */
    public static final a9 f17720f = new a9(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f17721a;

    /* renamed from: b */
    public int[] f17722b;

    /* renamed from: c */
    public Object[] f17723c;

    /* renamed from: d */
    public int f17724d;

    /* renamed from: e */
    public boolean f17725e;

    public a9() {
        this(0, new int[8], new Object[8], true);
    }

    public a9(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f17724d = -1;
        this.f17721a = i10;
        this.f17722b = iArr;
        this.f17723c = objArr;
        this.f17725e = z10;
    }

    public static a9 b() {
        return new a9(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f17724d;
        if (i13 == -1) {
            int i14 = 0;
            for (int i15 = 0; i15 < this.f17721a; i15++) {
                int i16 = this.f17722b[i15];
                int i17 = i16 >>> 3;
                int i18 = i16 & 7;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ((Long) this.f17723c[i15]).longValue();
                        i12 = k6.g(i17 << 3) + 8;
                    } else if (i18 == 2) {
                        int g10 = k6.g(i17 << 3);
                        int g11 = ((g6) this.f17723c[i15]).g();
                        i14 = k6.g(g11) + g11 + g10 + i14;
                    } else if (i18 == 3) {
                        int D = k6.D(i17);
                        i11 = D + D;
                        i10 = ((a9) this.f17723c[i15]).a();
                    } else if (i18 != 5) {
                        int i19 = k7.f17959s;
                        throw new IllegalStateException(new j7());
                    } else {
                        ((Integer) this.f17723c[i15]).intValue();
                        i12 = k6.g(i17 << 3) + 4;
                    }
                    i14 = i12 + i14;
                } else {
                    long longValue = ((Long) this.f17723c[i15]).longValue();
                    i11 = k6.g(i17 << 3);
                    i10 = k6.i(longValue);
                }
                i14 = i10 + i11 + i14;
            }
            this.f17724d = i14;
            return i14;
        }
        return i13;
    }

    public final void c(int i10, Object obj) {
        if (this.f17725e) {
            int i11 = this.f17721a;
            int[] iArr = this.f17722b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f17722b = Arrays.copyOf(iArr, i12);
                this.f17723c = Arrays.copyOf(this.f17723c, i12);
            }
            int[] iArr2 = this.f17722b;
            int i13 = this.f17721a;
            iArr2[i13] = i10;
            this.f17723c[i13] = obj;
            this.f17721a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(l6 l6Var) {
        if (this.f17721a != 0) {
            for (int i10 = 0; i10 < this.f17721a; i10++) {
                int i11 = this.f17722b[i10];
                Object obj = this.f17723c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    l6Var.n(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    l6Var.j(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    l6Var.f(i12, (g6) obj);
                } else if (i13 == 3) {
                    l6Var.f17966a.t(i12, 3);
                    ((a9) obj).d(l6Var);
                    l6Var.f17966a.t(i12, 4);
                } else if (i13 != 5) {
                    int i14 = k7.f17959s;
                    throw new RuntimeException(new j7());
                } else {
                    l6Var.i(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        int i10 = this.f17721a;
        if (i10 == a9Var.f17721a) {
            int[] iArr = this.f17722b;
            int[] iArr2 = a9Var.f17722b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f17723c;
                    Object[] objArr2 = a9Var.f17723c;
                    int i12 = this.f17721a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f17721a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f17722b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f17723c;
        int i16 = this.f17721a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
