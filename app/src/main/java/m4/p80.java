package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p80 {

    /* renamed from: a */
    public int f12429a;

    /* renamed from: b */
    public final kl2[] f12430b;

    public p80(kl2... kl2VarArr) {
        this.f12430b = kl2VarArr;
        int length = kl2VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p80.class == obj.getClass()) {
            return Arrays.equals(this.f12430b, ((p80) obj).f12430b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12429a;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f12430b) + 527;
            this.f12429a = hashCode;
            return hashCode;
        }
        return i10;
    }
}
