package m4;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class r70 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f13185a;

    /* renamed from: b */
    public final /* synthetic */ Object f13186b;

    /* renamed from: c */
    public final /* synthetic */ Object f13187c;

    public /* synthetic */ r70(Object obj, Object obj2, int i10) {
        this.f13185a = i10;
        this.f13186b = obj;
        this.f13187c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13185a) {
            case 0:
                return (String) ((x70) this.f13186b).n("getAppInstanceId", (Context) this.f13187c);
            case 1:
                co0 co0Var = (co0) this.f13186b;
                Objects.requireNonNull(co0Var);
                return new o50((Bundle) ((tz1) this.f13187c).get(), co0Var.f7088b, co0Var.f7089c, co0Var.f7090d, co0Var.f7091e, co0Var.f7092f, co0Var.f7093g.a().get(), co0Var.f7094h, null, null);
            default:
                return new mi1((String) ((tz1) this.f13186b).get(), (String) ((tz1) this.f13187c).get());
        }
    }
}
