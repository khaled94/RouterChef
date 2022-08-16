package p7;

import c5.j;
import r7.e;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a */
    public final j<String> f16991a;

    public i(j<String> jVar) {
        this.f16991a = jVar;
    }

    @Override // p7.l
    public final boolean a(e eVar) {
        if ((eVar.f() == 3) || eVar.j() || eVar.h()) {
            this.f16991a.d(eVar.c());
            return true;
        }
        return false;
    }

    @Override // p7.l
    public final boolean b(Exception exc) {
        return false;
    }
}
