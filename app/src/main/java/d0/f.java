package d0;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final int[] f3702a;

    /* renamed from: b */
    public final float[] f3703b;

    public f(int i10, int i11) {
        this.f3702a = new int[]{i10, i11};
        this.f3703b = new float[]{0.0f, 1.0f};
    }

    public f(int i10, int i11, int i12) {
        this.f3702a = new int[]{i10, i11, i12};
        this.f3703b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f3702a = new int[size];
        this.f3703b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f3702a[i10] = list.get(i10).intValue();
            this.f3703b[i10] = list2.get(i10).floatValue();
        }
    }
}
