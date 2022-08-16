package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kf {

    /* renamed from: a */
    public final ua[] f10399a;

    /* renamed from: b */
    public int f10400b;

    public kf(ua... uaVarArr) {
        this.f10399a = uaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kf.class == obj.getClass() && Arrays.equals(this.f10399a, ((kf) obj).f10399a);
    }

    public final int hashCode() {
        int i10 = this.f10400b;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f10399a) + 527;
            this.f10400b = hashCode;
            return hashCode;
        }
        return i10;
    }
}
