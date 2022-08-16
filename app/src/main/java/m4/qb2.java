package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qb2 {

    /* renamed from: f */
    public static final qb2 f12763f = new qb2(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f12764a;

    /* renamed from: b */
    public int[] f12765b;

    /* renamed from: c */
    public Object[] f12766c;

    /* renamed from: d */
    public int f12767d;

    /* renamed from: e */
    public boolean f12768e;

    public qb2() {
        this(0, new int[8], new Object[8], true);
    }

    public qb2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f12767d = -1;
        this.f12764a = i10;
        this.f12765b = iArr;
        this.f12766c = objArr;
        this.f12768e = z10;
    }

    public static qb2 b() {
        return new qb2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f12767d;
        if (i13 == -1) {
            int i14 = 0;
            for (int i15 = 0; i15 < this.f12764a; i15++) {
                int i16 = this.f12765b[i15];
                int i17 = i16 >>> 3;
                int i18 = i16 & 7;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ((Long) this.f12766c[i15]).longValue();
                        i12 = v82.i(i17 << 3) + 8;
                    } else if (i18 == 2) {
                        int i19 = v82.i(i17 << 3);
                        int k10 = ((n82) this.f12766c[i15]).k();
                        i14 = v82.i(k10) + k10 + i19 + i14;
                    } else if (i18 == 3) {
                        int E = v82.E(i17);
                        i11 = E + E;
                        i10 = ((qb2) this.f12766c[i15]).a();
                    } else if (i18 != 5) {
                        int i20 = x92.f15256t;
                        throw new IllegalStateException(new w92());
                    } else {
                        ((Integer) this.f12766c[i15]).intValue();
                        i12 = v82.i(i17 << 3) + 4;
                    }
                    i14 = i12 + i14;
                } else {
                    long longValue = ((Long) this.f12766c[i15]).longValue();
                    i11 = v82.i(i17 << 3);
                    i10 = v82.j(longValue);
                }
                i14 = i10 + i11 + i14;
            }
            this.f12767d = i14;
            return i14;
        }
        return i13;
    }

    public final void c(int i10, Object obj) {
        if (this.f12768e) {
            int i11 = this.f12764a;
            int[] iArr = this.f12765b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f12765b = Arrays.copyOf(iArr, i12);
                this.f12766c = Arrays.copyOf(this.f12766c, i12);
            }
            int[] iArr2 = this.f12765b;
            int i13 = this.f12764a;
            iArr2[i13] = i10;
            this.f12766c[i13] = obj;
            this.f12764a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(w82 w82Var) {
        if (this.f12764a != 0) {
            for (int i10 = 0; i10 < this.f12764a; i10++) {
                int i11 = this.f12765b[i10];
                Object obj = this.f12766c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    w82Var.n(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    w82Var.j(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    w82Var.f(i12, (n82) obj);
                } else if (i13 == 3) {
                    w82Var.f14883a.u(i12, 3);
                    ((qb2) obj).d(w82Var);
                    w82Var.f14883a.u(i12, 4);
                } else if (i13 != 5) {
                    int i14 = x92.f15256t;
                    throw new RuntimeException(new w92());
                } else {
                    w82Var.i(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qb2)) {
            return false;
        }
        qb2 qb2Var = (qb2) obj;
        int i10 = this.f12764a;
        if (i10 == qb2Var.f12764a) {
            int[] iArr = this.f12765b;
            int[] iArr2 = qb2Var.f12765b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f12766c;
                    Object[] objArr2 = qb2Var.f12766c;
                    int i12 = this.f12764a;
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
        int i10 = this.f12764a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f12765b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f12766c;
        int i16 = this.f12764a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
