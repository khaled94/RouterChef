package m4;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hl0 {

    /* renamed from: b */
    public static final hl0 f9372b = new hl0(new c30[0]);

    /* renamed from: c */
    public static final c30 f9373c;

    /* renamed from: a */
    public final c30[] f9374a;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        f9373c = new c30(0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2);
    }

    public hl0(c30[] c30VarArr) {
        this.f9374a = c30VarArr;
    }

    public final c30 a(int i10) {
        return i10 < 0 ? f9373c : this.f9374a[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hl0.class == obj.getClass()) {
            hl0 hl0Var = (hl0) obj;
            if (ls1.f(null, null) && Arrays.equals(this.f9374a, hl0Var.f9374a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9374a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
