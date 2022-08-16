package z1;

import android.content.Context;
import android.os.Build;
import c2.p;
import f2.a;
import t1.i;
import y1.b;

/* loaded from: classes.dex */
public final class g extends c<b> {
    public g(Context context, a aVar) {
        super(a2.g.a(context, aVar).f34c);
    }

    @Override // z1.c
    public final boolean b(p pVar) {
        i iVar = pVar.f2644j.f18452a;
        return iVar == i.UNMETERED || (Build.VERSION.SDK_INT >= 30 && iVar == i.TEMPORARILY_UNMETERED);
    }

    @Override // z1.c
    public final boolean c(b bVar) {
        b bVar2 = bVar;
        return !bVar2.f20260a || bVar2.f20262c;
    }
}
