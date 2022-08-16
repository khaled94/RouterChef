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
public final class f extends c<b> {

    /* renamed from: e */
    public static final String f20901e = h.e("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.a(context, aVar).f34c);
    }

    @Override // z1.c
    public final boolean b(p pVar) {
        return pVar.f2644j.f18452a == i.NOT_ROAMING;
    }

    @Override // z1.c
    public final boolean c(b bVar) {
        b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 24) {
            h.c().a(f20901e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar2.f20260a;
        }
        if (bVar2.f20260a && bVar2.f20263d) {
            z10 = false;
        }
        return z10;
    }
}
