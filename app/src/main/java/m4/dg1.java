package m4;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class dg1 implements eh1<je1> {

    /* renamed from: a */
    public final uz1 f7390a;

    /* renamed from: b */
    public final Bundle f7391b;

    public dg1(uz1 uz1Var, Bundle bundle) {
        this.f7390a = uz1Var;
        this.f7391b = bundle;
    }

    @Override // m4.eh1
    public final tz1<je1> a() {
        return this.f7390a.Z(new Callable() { // from class: m4.cg1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new je1(dg1.this.f7391b, 1);
            }
        });
    }
}
