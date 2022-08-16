package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lf {

    /* renamed from: d */
    public static final lf f10745d = new lf(new kf[0]);

    /* renamed from: a */
    public final int f10746a;

    /* renamed from: b */
    public final kf[] f10747b;

    /* renamed from: c */
    public int f10748c;

    public lf(kf... kfVarArr) {
        this.f10747b = kfVarArr;
        this.f10746a = kfVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lf.class == obj.getClass()) {
            lf lfVar = (lf) obj;
            if (this.f10746a == lfVar.f10746a && Arrays.equals(this.f10747b, lfVar.f10747b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10748c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f10747b);
            this.f10748c = hashCode;
            return hashCode;
        }
        return i10;
    }
}
