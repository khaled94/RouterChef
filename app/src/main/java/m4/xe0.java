package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xe0 {

    /* renamed from: a */
    public final p60 f15310a;

    /* renamed from: b */
    public final int[] f15311b;

    /* renamed from: c */
    public final int f15312c;

    /* renamed from: d */
    public final boolean[] f15313d;

    public xe0(p60 p60Var, int[] iArr, int i10, boolean[] zArr) {
        this.f15310a = p60Var;
        this.f15311b = (int[]) iArr.clone();
        this.f15312c = i10;
        this.f15313d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xe0.class == obj.getClass()) {
            xe0 xe0Var = (xe0) obj;
            if (this.f15312c == xe0Var.f15312c && this.f15310a.equals(xe0Var.f15310a) && Arrays.equals(this.f15311b, xe0Var.f15311b) && Arrays.equals(this.f15313d, xe0Var.f15313d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f15311b);
        return Arrays.hashCode(this.f15313d) + ((((hashCode + (this.f15310a.hashCode() * 31)) * 31) + this.f15312c) * 31);
    }
}
