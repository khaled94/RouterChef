package m4;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wd1 implements eh1<dh1<Bundle>> {

    /* renamed from: a */
    public final Executor f14943a;

    /* renamed from: b */
    public final z80 f14944b;

    public wd1(Executor executor, z80 z80Var) {
        this.f14943a = executor;
        this.f14944b = z80Var;
    }

    @Override // m4.eh1
    public final tz1<dh1<Bundle>> a() {
        return ((Boolean) jo.f10145d.f10148c.a(es.I1)).booleanValue() ? mz1.m(null) : mz1.o(this.f14944b.d(), vd1.f14663a, this.f14943a);
    }
}
