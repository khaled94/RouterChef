package m4;

import android.content.Context;
import java.util.Objects;
import l3.s;
import x.d;

/* loaded from: classes.dex */
public final class zf0 implements nd2<x50> {

    /* renamed from: a */
    public final vd2<Context> f16187a;

    public zf0(vd2<Context> vd2Var) {
        this.f16187a = vd2Var;
    }

    /* renamed from: b */
    public final x50 a() {
        Context b10 = ((lf0) this.f16187a).b();
        s sVar = s.B;
        m00 b11 = sVar.p.b(b10, o90.s());
        d dVar = l00.f10626b;
        Objects.requireNonNull(b11);
        return new w50(b10, sVar.p.b(b10, o90.s()).a("google.afma.sdkConstants.getSdkConstants", dVar, dVar));
    }
}
