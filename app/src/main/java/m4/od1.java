package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class od1 implements eh1<pd1> {

    /* renamed from: a */
    public final uz1 f12115a;

    /* renamed from: b */
    public final h01 f12116b;

    /* renamed from: c */
    public final j21 f12117c;

    /* renamed from: d */
    public final qd1 f12118d;

    public od1(uz1 uz1Var, h01 h01Var, j21 j21Var, qd1 qd1Var) {
        this.f12115a = uz1Var;
        this.f12116b = h01Var;
        this.f12117c = j21Var;
        this.f12118d = qd1Var;
    }

    @Override // m4.eh1
    public final tz1<pd1> a() {
        String str = (String) jo.f10145d.f10148c.a(es.U0);
        int i10 = gu1.f9052a;
        if ((str == null || str.isEmpty()) || this.f12118d.f12804a.get() || !this.f12117c.f9809b) {
            return mz1.m(new pd1(new Bundle()));
        }
        this.f12118d.f12804a.set(true);
        return this.f12115a.Z(new f21(this, 1));
    }
}
