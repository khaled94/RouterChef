package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s70 {

    /* renamed from: d */
    public static final s70 f13532d = new s70(new p60[0]);

    /* renamed from: a */
    public final int f13533a;

    /* renamed from: b */
    public final p60[] f13534b;

    /* renamed from: c */
    public int f13535c;

    public s70(p60... p60VarArr) {
        this.f13534b = p60VarArr;
        this.f13533a = p60VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s70.class == obj.getClass()) {
            s70 s70Var = (s70) obj;
            if (this.f13533a == s70Var.f13533a && Arrays.equals(this.f13534b, s70Var.f13534b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f13535c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f13534b);
            this.f13535c = hashCode;
            return hashCode;
        }
        return i10;
    }
}
