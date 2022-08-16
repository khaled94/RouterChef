package s4;

import android.util.Log;
import i0.b;

/* loaded from: classes.dex */
public final class i5 extends n5<Boolean> {
    public i5(l5 l5Var, String str, Boolean bool) {
        super(l5Var, str, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.n5
    public final /* bridge */ /* synthetic */ Boolean a(Object obj) {
        if (t4.f18104b.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (t4.f18105c.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String c10 = c();
        String str = (String) obj;
        Log.e("PhenotypeFlag", b.a(new StringBuilder(String.valueOf(c10).length() + 28 + str.length()), "Invalid boolean value for ", c10, ": ", str));
        return null;
    }
}
