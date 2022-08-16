package z1;

import a2.g;
import android.content.Context;
import android.os.Build;
import c2.p;
import f2.a;
import t1.h;
import t1.i;
import y1.b;

/* loaded from: classes.dex */
public final class e extends c<b> {

    /* renamed from: e */
    public static final String f20900e = h.e("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super(g.a(context, aVar).f34c);
    }

    @Override // z1.c
    public final boolean b(p pVar) {
        return pVar.f2644j.f18452a == i.METERED;
    }

    @Override // z1.c
    public final boolean c(b bVar) {
        b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            h.c().a(f20900e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar2.f20260a;
        }
        if (bVar2.f20260a && bVar2.f20262c) {
            z10 = false;
        }
        return z10;
    }
}
