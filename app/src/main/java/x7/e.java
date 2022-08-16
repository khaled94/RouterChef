package x7;

import e8.a;
import e8.c;

/* loaded from: classes.dex */
public final class e extends w<Number> {
    @Override // x7.w
    public final Number a(a aVar) {
        if (aVar.x0() == 9) {
            aVar.t0();
            return null;
        }
        return Float.valueOf((float) aVar.o0());
    }

    @Override // x7.w
    public final void b(c cVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            cVar.Z();
            return;
        }
        h.a(number2.floatValue());
        cVar.q0(number2);
    }
}
