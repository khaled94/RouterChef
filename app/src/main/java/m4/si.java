package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class si implements Comparator<hi> {
    @Override // java.util.Comparator
    public final int compare(hi hiVar, hi hiVar2) {
        hi hiVar3 = hiVar;
        hi hiVar4 = hiVar2;
        float f10 = hiVar3.f9341b;
        float f11 = hiVar4.f9341b;
        if (f10 >= f11) {
            if (f10 > f11) {
                return 1;
            }
            float f12 = hiVar3.f9340a;
            float f13 = hiVar4.f9340a;
            if (f12 >= f13) {
                if (f12 > f13) {
                    return 1;
                }
                float f14 = (hiVar3.f9342c - f12) * (hiVar3.f9343d - f10);
                float f15 = (hiVar4.f9342c - f13) * (hiVar4.f9343d - f11);
                if (f14 <= f15) {
                    return f14 < f15 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
