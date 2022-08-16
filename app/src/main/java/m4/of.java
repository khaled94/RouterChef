package m4;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class of {

    /* renamed from: a */
    public final kf f12138a;

    /* renamed from: b */
    public final int[] f12139b;

    /* renamed from: c */
    public final ua[] f12140c = new ua[1];

    /* renamed from: d */
    public int f12141d;

    public of(kf kfVar, int... iArr) {
        Objects.requireNonNull(kfVar);
        this.f12138a = kfVar;
        for (int i10 = 0; i10 <= 0; i10++) {
            this.f12140c[i10] = kfVar.f10399a[iArr[i10]];
        }
        Arrays.sort(this.f12140c, new nf());
        this.f12139b = new int[1];
        for (int i11 = 0; i11 <= 0; i11++) {
            int[] iArr2 = this.f12139b;
            ua uaVar = this.f12140c[i11];
            int i12 = 0;
            while (true) {
                if (i12 > 0) {
                    i12 = -1;
                    break;
                } else if (uaVar == kfVar.f10399a[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
            iArr2[i11] = i12;
        }
    }

    public final void a() {
        int length = this.f12139b.length;
    }

    public final ua b(int i10) {
        return this.f12140c[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            of ofVar = (of) obj;
            if (this.f12138a == ofVar.f12138a && Arrays.equals(this.f12139b, ofVar.f12139b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12141d;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f12139b) + (System.identityHashCode(this.f12138a) * 31);
            this.f12141d = hashCode;
            return hashCode;
        }
        return i10;
    }
}
