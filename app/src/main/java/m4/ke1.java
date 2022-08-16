package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ke1 implements eh1<dh1<Bundle>> {

    /* renamed from: a */
    public final lk1 f10398a;

    public ke1(lk1 lk1Var) {
        this.f10398a = lk1Var;
    }

    @Override // m4.eh1
    public final tz1<dh1<Bundle>> a() {
        String str;
        lk1 lk1Var = this.f10398a;
        je1 je1Var = null;
        if (lk1Var != null && (str = lk1Var.f10890a) != null && !str.isEmpty()) {
            je1Var = new je1(this, 0);
        }
        return mz1.m(je1Var);
    }
}
