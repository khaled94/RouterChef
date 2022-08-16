package s4;

import android.util.Log;
import i0.b;

/* loaded from: classes.dex */
public final class j5 extends n5<Double> {
    public j5(l5 l5Var, Double d5) {
        super(l5Var, "measurement.test.double_flag", d5);
    }

    @Override // s4.n5
    public final /* bridge */ /* synthetic */ Double a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = c();
            String str = (String) obj;
            Log.e("PhenotypeFlag", b.a(new StringBuilder(String.valueOf(c10).length() + 27 + str.length()), "Invalid double value for ", c10, ": ", str));
            return null;
        }
    }
}
