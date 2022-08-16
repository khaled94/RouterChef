package m4;

import h4.c;
import java.util.Objects;
import y4.a6;
import y4.c2;
import y4.e;
import y4.f5;
import y4.h3;
import y4.i;
import y4.j2;
import y4.k4;
import y4.k6;
import y4.p2;
import y4.s6;
import y4.t5;
import y4.z1;

/* loaded from: classes.dex */
public final /* synthetic */ class vu0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f14784s;

    /* renamed from: t */
    public final /* synthetic */ Object f14785t;

    /* renamed from: u */
    public final /* synthetic */ Object f14786u;

    public /* synthetic */ vu0(Object obj, Object obj2, int i10) {
        this.f14784s = i10;
        this.f14785t = obj;
        this.f14786u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14784s) {
            case 0:
                ((av0) this.f14785t).i((lw0) this.f14786u);
                return;
            case 1:
                ((kl1) this.f14785t).f10478v.f10912e.d((cn) this.f14786u);
                return;
            case 2:
                ((h3) this.f14786u).f20483s.a();
                ((h3) this.f14786u).f20483s.k((k6) this.f14785t);
                return;
            default:
                a6 a6Var = (a6) this.f14786u;
                a6Var.B().g();
                a6Var.C = new j2(a6Var);
                i iVar = new i(a6Var);
                iVar.i();
                a6Var.f20294u = iVar;
                e K = a6Var.K();
                p2 p2Var = a6Var.f20292s;
                Objects.requireNonNull(p2Var, "null reference");
                K.f20369u = p2Var;
                f5 f5Var = new f5(a6Var);
                f5Var.i();
                a6Var.A = f5Var;
                s6 s6Var = new s6(a6Var);
                s6Var.i();
                a6Var.f20297x = s6Var;
                k4 k4Var = new k4(a6Var);
                k4Var.i();
                a6Var.f20298z = k4Var;
                t5 t5Var = new t5(a6Var);
                t5Var.i();
                a6Var.f20296w = t5Var;
                a6Var.f20295v = new z1(a6Var);
                if (a6Var.I != a6Var.J) {
                    a6Var.C().f20710x.c("Not all upload components initialized", Integer.valueOf(a6Var.I), Integer.valueOf(a6Var.J));
                }
                a6Var.E = true;
                a6 a6Var2 = (a6) this.f14786u;
                a6Var2.B().g();
                i iVar2 = a6Var2.f20294u;
                a6.I(iVar2);
                iVar2.k();
                if (a6Var2.A.A.a() == 0) {
                    c2 c2Var = a6Var2.A.A;
                    Objects.requireNonNull((c) a6Var2.c());
                    c2Var.b(System.currentTimeMillis());
                }
                a6Var2.D();
                return;
        }
    }

    public /* synthetic */ vu0(Object obj, Object obj2, int i10, c1.e eVar) {
        this.f14784s = i10;
        this.f14786u = obj;
        this.f14785t = obj2;
    }
}
