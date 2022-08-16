package m4;

import android.content.Context;
import d.a;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j31 implements nd2<tz1<String>> {

    /* renamed from: a */
    public final vd2<w7> f9827a;

    /* renamed from: b */
    public final vd2<Context> f9828b;

    public j31(vd2 vd2Var, vd2 vd2Var2) {
        this.f9827a = vd2Var;
        this.f9828b = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        final w7 a10 = this.f9827a.a();
        final Context b10 = ((en1) this.f9828b).b();
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        tz1 Z = t90Var.Z(new Callable() { // from class: m4.i31
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w7 w7Var = w7.this;
                return w7Var.f14875b.c(b10);
            }
        });
        a.d(Z);
        return Z;
    }
}
