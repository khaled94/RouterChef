package t8;

import android.content.Context;
import ca.o;
import t8.t;
import t8.y;
import w0.a;

/* loaded from: classes.dex */
public final class k extends g {
    public k(Context context) {
        super(context);
    }

    @Override // t8.g, t8.y
    public final boolean c(w wVar) {
        return "file".equals(wVar.f18833c.getScheme());
    }

    @Override // t8.g, t8.y
    public final y.a f(w wVar, int i10) {
        int i11;
        ca.y f10 = o.f(h(wVar));
        t.d dVar = t.d.DISK;
        a aVar = new a(wVar.f18833c.getPath());
        a.b d5 = aVar.d("Orientation");
        if (d5 != null) {
            try {
                i11 = d5.f(aVar.f19895e);
            } catch (NumberFormatException unused) {
                i11 = 1;
            }
            return new y.a(null, f10, dVar, i11);
        }
        i11 = 1;
        return new y.a(null, f10, dVar, i11);
    }
}
