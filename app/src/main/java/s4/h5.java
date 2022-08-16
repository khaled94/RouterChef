package s4;

import android.util.Log;
import i0.b;

/* loaded from: classes.dex */
public final class h5 extends n5<Long> {
    public h5(l5 l5Var, String str, Long l10) {
        super(l5Var, str, l10);
    }

    @Override // s4.n5
    public final /* bridge */ /* synthetic */ Long a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = c();
            String str = (String) obj;
            Log.e("PhenotypeFlag", b.a(new StringBuilder(String.valueOf(c10).length() + 25 + str.length()), "Invalid long value for ", c10, ": ", str));
            return null;
        }
    }
}
