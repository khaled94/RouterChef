package m4;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p60 {

    /* renamed from: a */
    public final t[] f12410a;

    /* renamed from: b */
    public int f12411b;

    public p60(t... tVarArr) {
        this.f12410a = tVarArr;
        String str = tVarArr[0].f13863c;
        if (str != null) {
            str.equals("und");
        }
        Objects.requireNonNull(tVarArr[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p60.class == obj.getClass() && Arrays.equals(this.f12410a, ((p60) obj).f12410a);
    }

    public final int hashCode() {
        int i10 = this.f12411b;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f12410a) + 527;
            this.f12411b = hashCode;
            return hashCode;
        }
        return i10;
    }
}
