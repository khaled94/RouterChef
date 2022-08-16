package m4;

import java.util.List;

/* loaded from: classes.dex */
public final class hl2 extends kl2 {
    public hl2(p60 p60Var, int[] iArr, List list) {
        super(p60Var, iArr);
        gw1.q(list);
    }

    public static void a(List<dw1<gl2>> list, long[] jArr) {
        long j3 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j3 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            dw1<gl2> dw1Var = list.get(i11);
            if (dw1Var != null) {
                dw1Var.n(new gl2(j3, jArr[i11]));
            }
        }
    }
}
