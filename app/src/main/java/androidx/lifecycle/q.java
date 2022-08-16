package androidx.lifecycle;

import java.util.List;
import l3.s;
import m4.am1;
import m4.cm1;
import m4.hz0;
import m4.km1;
import m4.kz1;
import m4.tc1;
import m4.ti0;
import m4.tm1;
import m4.vd0;
import m4.xp1;
import n3.s1;
import n3.w0;

/* loaded from: classes.dex */
public final class q implements kz1, tc1 {

    /* renamed from: s */
    public final /* synthetic */ int f1714s;

    /* renamed from: t */
    public Object f1715t;

    public /* synthetic */ q(Object obj, int i10) {
        this.f1714s = i10;
        this.f1715t = obj;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        switch (this.f1714s) {
            case 1:
                new w0(((vd0) this.f1715t).getContext(), ((vd0) this.f1715t).m().f12051s, (String) obj).b();
                return;
            case 2:
                String str = (String) obj;
                ti0 ti0Var = (ti0) this.f1715t;
                tm1 tm1Var = ti0Var.f14073z;
                xp1 xp1Var = ti0Var.y;
                km1 km1Var = ti0Var.f14071w;
                cm1 cm1Var = ti0Var.f14072x;
                List<String> b10 = xp1Var.b(km1Var, cm1Var, false, "", str, cm1Var.f7036c);
                s1 s1Var = s.B.f5789c;
                int i10 = 1;
                if (true == s1.h(((ti0) this.f1715t).f14067s)) {
                    i10 = 2;
                }
                tm1Var.c(b10, i10);
                return;
            default:
                hz0 hz0Var = (hz0) obj;
                synchronized (((am1) this.f1715t)) {
                    Object obj2 = this.f1715t;
                    ((am1) obj2).f6201v = hz0Var;
                    ((am1) obj2).f6201v.b();
                }
                return;
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
    }

    @Override // m4.tc1
    /* renamed from: zza */
    public final void mo22zza() {
        synchronized (((am1) this.f1715t)) {
            ((am1) this.f1715t).f6201v = null;
        }
    }
}
