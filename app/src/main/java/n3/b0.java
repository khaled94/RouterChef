package n3;

import android.content.Context;
import java.util.regex.Pattern;
import m4.b4;
import m4.e4;
import m4.es;
import m4.g90;
import m4.io;
import m4.jo;
import m4.q4;
import m4.qy;
import m4.wo2;

/* loaded from: classes.dex */
public final class b0 extends q4 {

    /* renamed from: b */
    public final Context f16446b;

    public b0(Context context, wo2 wo2Var) {
        this.f16446b = context;
    }

    @Override // m4.q4, m4.y3
    public final b4 a(e4<?> e4Var) {
        if (e4Var.f7719t == 0) {
            if (Pattern.matches((String) jo.f10145d.f10148c.a(es.D2), e4Var.f7720u)) {
                g90 g90Var = io.f9708f.f9709a;
                if (g90.f(this.f16446b, 13400000)) {
                    b4 a10 = new qy(this.f16446b).a(e4Var);
                    if (a10 != null) {
                        String valueOf = String.valueOf(e4Var.f7720u);
                        g1.a(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a10;
                    }
                    String valueOf2 = String.valueOf(e4Var.f7720u);
                    g1.a(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(e4Var);
    }
}
