package m4;

import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import z3.p;

/* loaded from: classes.dex */
public final class wg2 {

    /* renamed from: a */
    public final int f15016a;

    /* renamed from: b */
    public final int f15017b;

    /* renamed from: c */
    public final int f15018c;

    /* renamed from: d */
    public final byte[] f15019d;

    /* renamed from: e */
    public int f15020e;

    public wg2(int i10, int i11, int i12, byte[] bArr) {
        this.f15016a = i10;
        this.f15017b = i11;
        this.f15018c = i12;
        this.f15019d = bArr;
    }

    @Pure
    public static int a(int i10) {
        if (i10 != 1) {
            if (i10 == 9) {
                return 6;
            }
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 1;
    }

    @Pure
    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 == 16) {
                return 6;
            }
            if (i10 == 18) {
                return 7;
            }
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wg2.class == obj.getClass()) {
            wg2 wg2Var = (wg2) obj;
            if (this.f15016a == wg2Var.f15016a && this.f15017b == wg2Var.f15017b && this.f15018c == wg2Var.f15018c && Arrays.equals(this.f15019d, wg2Var.f15019d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f15020e;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f15019d) + ((((((this.f15016a + 527) * 31) + this.f15017b) * 31) + this.f15018c) * 31);
            this.f15020e = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f15016a;
        int i11 = this.f15017b;
        int i12 = this.f15018c;
        boolean z10 = this.f15019d != null;
        StringBuilder a10 = p.a(55, "ColorInfo(", i10, ", ", i11);
        a10.append(", ");
        a10.append(i12);
        a10.append(", ");
        a10.append(z10);
        a10.append(")");
        return a10.toString();
    }
}
