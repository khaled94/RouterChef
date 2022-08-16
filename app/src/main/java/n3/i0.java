package n3;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final String[] f16483a;

    /* renamed from: b */
    public final double[] f16484b;

    /* renamed from: c */
    public final double[] f16485c;

    /* renamed from: d */
    public final int[] f16486d;

    /* renamed from: e */
    public int f16487e = 0;

    public /* synthetic */ i0(h0 h0Var) {
        int size = ((List) h0Var.f16480b).size();
        this.f16483a = (String[]) h0Var.f16479a.toArray(new String[size]);
        this.f16484b = a((List) h0Var.f16480b);
        this.f16485c = a((List) h0Var.f16481c);
        this.f16486d = new int[size];
    }

    public static final double[] a(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = list.get(i10).doubleValue();
        }
        return dArr;
    }
}
