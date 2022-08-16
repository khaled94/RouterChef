package m4;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class bl2 {

    /* renamed from: a */
    public final Random f6565a;

    /* renamed from: b */
    public final int[] f6566b;

    /* renamed from: c */
    public final int[] f6567c;

    public bl2(int[] iArr, Random random) {
        this.f6566b = iArr;
        this.f6565a = random;
        this.f6567c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f6567c[iArr[i10]] = i10;
        }
    }

    public final bl2 a(int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            iArr[i12] = this.f6565a.nextInt(this.f6566b.length + 1);
            int i13 = i12 + 1;
            int nextInt = this.f6565a.nextInt(i13);
            iArr2[i12] = iArr2[nextInt];
            iArr2[nextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f6566b.length + i10];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.f6566b;
            if (i11 < iArr4.length + i10) {
                if (i14 >= i10 || i15 != iArr[i14]) {
                    int i16 = i15 + 1;
                    int i17 = iArr4[i15];
                    iArr3[i11] = i17;
                    if (i17 >= 0) {
                        iArr3[i11] = i17 + i10;
                    }
                    i15 = i16;
                } else {
                    iArr3[i11] = iArr2[i14];
                    i14++;
                }
                i11++;
            } else {
                return new bl2(iArr3, new Random(this.f6565a.nextLong()));
            }
        }
    }
}
