package c4;

import c4.c;
import p4.f;

/* loaded from: classes.dex */
public final class r implements c.a {

    /* renamed from: a */
    public final /* synthetic */ e f2727a;

    public r(e eVar) {
        this.f2727a = eVar;
    }

    @Override // c4.c.a
    public final void a(boolean z10) {
        f fVar = this.f2727a.F;
        fVar.sendMessage(fVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
