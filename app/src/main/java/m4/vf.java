package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vf {

    /* renamed from: a */
    public int f14668a;

    /* renamed from: b */
    public final of[] f14669b;

    public vf(of... ofVarArr) {
        this.f14669b = ofVarArr;
    }

    public final of a(int i10) {
        return this.f14669b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf.class == obj.getClass()) {
            return Arrays.equals(this.f14669b, ((vf) obj).f14669b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14668a;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f14669b) + 527;
            this.f14668a = hashCode;
            return hashCode;
        }
        return i10;
    }
}
