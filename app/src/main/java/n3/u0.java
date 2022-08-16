package n3;

import a4.g;
import android.content.Context;
import i3.a;
import java.io.IOException;
import m4.k90;

/* loaded from: classes.dex */
public final class u0 extends z {

    /* renamed from: b */
    public final Context f16576b;

    public u0(Context context) {
        this.f16576b = context;
    }

    @Override // n3.z
    public final void a() {
        boolean z10;
        try {
            z10 = a.d(this.f16576b);
        } catch (g | IOException | IllegalStateException e10) {
            g1.h("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        synchronized (k90.f10300b) {
            k90.f10301c = true;
            k90.f10302d = z10;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z10);
        g1.j(sb.toString());
    }
}
