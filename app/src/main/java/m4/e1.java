package m4;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class e1 implements to2 {

    /* renamed from: a */
    public vo2 f7686a;

    /* renamed from: b */
    public j1 f7687b;

    /* renamed from: c */
    public boolean f7688c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean a(uo2 uo2Var) {
        boolean z10;
        j1 i1Var;
        g1 g1Var = new g1();
        if (g1Var.b(uo2Var, true) && (g1Var.f8698a & 2) == 2) {
            int min = Math.min(g1Var.f8702e, 8);
            dd ddVar = new dd(min);
            ((qo2) uo2Var).o((byte[]) ddVar.f7311d, 0, min, false);
            ddVar.h(0);
            if (ddVar.zza() >= 5 && ddVar.q() == 127 && ddVar.w() == 1179402563) {
                i1Var = new d1();
            } else {
                ddVar.h(0);
                try {
                    if (zv1.g(1, ddVar, true)) {
                        i1Var = new l1();
                    }
                } catch (mq unused) {
                }
                ddVar.h(0);
                if (ddVar.zza() < 8) {
                    z10 = false;
                } else {
                    byte[] bArr = new byte[8];
                    ddVar.d(bArr, 0, 8);
                    z10 = Arrays.equals(bArr, i1.f9500o);
                }
                if (z10) {
                    i1Var = new i1();
                }
            }
            this.f7687b = i1Var;
            return true;
        }
        return false;
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        try {
            return a(uo2Var);
        } catch (mq unused) {
            return false;
        }
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f7686a = vo2Var;
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        j1 j1Var = this.f7687b;
        if (j1Var != null) {
            f1 f1Var = j1Var.f9783a;
            f1Var.f8313a.a();
            f1Var.f8314b.e(0);
            f1Var.f8315c = -1;
            f1Var.f8317e = false;
            if (j3 == 0) {
                j1Var.b(!j1Var.f9794l);
            } else if (j1Var.f9790h == 0) {
            } else {
                long d5 = j1Var.d(j10);
                j1Var.f9787e = d5;
                h1 h1Var = j1Var.f9786d;
                int i10 = ls1.f10971a;
                h1Var.d(d5);
                j1Var.f9790h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r22, m4.gp2 r23) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.e1.h(m4.uo2, m4.gp2):int");
    }
}
