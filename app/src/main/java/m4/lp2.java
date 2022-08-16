package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lp2 {

    /* renamed from: a */
    public final int f10962a;

    /* renamed from: b */
    public final byte[] f10963b;

    /* renamed from: c */
    public final int f10964c;

    /* renamed from: d */
    public final int f10965d;

    public lp2(int i10, byte[] bArr, int i11, int i12) {
        this.f10962a = i10;
        this.f10963b = bArr;
        this.f10964c = i11;
        this.f10965d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lp2.class == obj.getClass()) {
            lp2 lp2Var = (lp2) obj;
            if (this.f10962a == lp2Var.f10962a && this.f10964c == lp2Var.f10964c && this.f10965d == lp2Var.f10965d && Arrays.equals(this.f10963b, lp2Var.f10963b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10963b) + (this.f10962a * 31)) * 31) + this.f10964c) * 31) + this.f10965d;
    }
}
