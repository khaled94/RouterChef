package m4;

import android.net.Uri;
import n3.g1;

/* loaded from: classes.dex */
public final class v00 extends n90 {
    public v00(String str) {
        super(str);
    }

    @Override // m4.n90, m4.f90
    public final void b(String str) {
        String valueOf = String.valueOf(str);
        g1.e(valueOf.length() != 0 ? "LeibnizHttpUrlPinger pinging URL: ".concat(valueOf) : new String("LeibnizHttpUrlPinger pinging URL: "));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return;
        }
        g1.e("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        super.b(str);
    }
}
