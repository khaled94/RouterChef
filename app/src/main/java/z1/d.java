package z1;

import a2.g;
import android.content.Context;
import android.os.Build;
import c2.p;
import f2.a;
import t1.i;
import y1.b;

/* loaded from: classes.dex */
public final class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.a(context, aVar).f34c);
    }

    @Override // z1.c
    public final boolean b(p pVar) {
        return pVar.f2644j.f18452a == i.CONNECTED;
    }

    @Override // z1.c
    public final boolean c(b bVar) {
        b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            return !bVar2.f20260a || !bVar2.f20261b;
        }
        return true ^ bVar2.f20260a;
    }
}
