package m4;

import l3.s;
import n3.g1;
import n3.z;

/* loaded from: classes.dex */
public final class x80 extends z {

    /* renamed from: b */
    public final /* synthetic */ z80 f15245b;

    public x80(z80 z80Var) {
        this.f15245b = z80Var;
    }

    @Override // n3.z
    public final void a() {
        z80 z80Var = this.f15245b;
        gs gsVar = new gs(z80Var.f16039e, z80Var.f16040f.f12051s);
        synchronized (this.f15245b.f16035a) {
            try {
                is isVar = s.B.f5798l;
                is.b(this.f15245b.f16041g, gsVar);
            } catch (IllegalArgumentException e10) {
                g1.k("Cannot config CSI reporter.", e10);
            }
        }
    }
}
