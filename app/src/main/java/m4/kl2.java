package m4;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class kl2 {

    /* renamed from: a */
    public final p60 f10479a;

    /* renamed from: b */
    public final int f10480b;

    /* renamed from: c */
    public final int[] f10481c;

    /* renamed from: d */
    public final t[] f10482d;

    /* renamed from: e */
    public int f10483e;

    public kl2(p60 p60Var, int[] iArr) {
        int length = iArr.length;
        r01.h(length > 0);
        Objects.requireNonNull(p60Var);
        this.f10479a = p60Var;
        this.f10480b = length;
        this.f10482d = new t[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f10482d[i10] = p60Var.f12410a[iArr[i10]];
        }
        Arrays.sort(this.f10482d, jl2.f10122s);
        this.f10481c = new int[this.f10480b];
        for (int i11 = 0; i11 < this.f10480b; i11++) {
            int[] iArr2 = this.f10481c;
            t tVar = this.f10482d[i11];
            int i12 = 0;
            while (true) {
                if (i12 > 0) {
                    i12 = -1;
                    break;
                } else if (tVar == p60Var.f12410a[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
            iArr2[i11] = i12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kl2 kl2Var = (kl2) obj;
            if (this.f10479a == kl2Var.f10479a && Arrays.equals(this.f10481c, kl2Var.f10481c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10483e;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f10481c) + (System.identityHashCode(this.f10479a) * 31);
            this.f10483e = hashCode;
            return hashCode;
        }
        return i10;
    }
}
