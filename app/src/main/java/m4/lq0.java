package m4;

import java.util.Iterator;
import java.util.List;
import y4.p2;
import y4.q1;
import y4.s1;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class lq0 implements nq0, mu1, al2 {

    /* renamed from: s */
    public final Object f10966s;

    public /* synthetic */ lq0(Object obj) {
        this.f10966s = obj;
    }

    @Override // m4.al2
    public final long a() {
        long j3 = Long.MAX_VALUE;
        for (al2 al2Var : (al2[]) this.f10966s) {
            long a10 = al2Var.a();
            if (a10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, a10);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // m4.al2
    public final boolean b(long j3) {
        al2[] al2VarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (al2 al2Var : (al2[]) this.f10966s) {
                long c11 = al2Var.c();
                boolean z12 = c11 != Long.MIN_VALUE && c11 <= j3;
                if (c11 == c10 || z12) {
                    z10 |= al2Var.b(j3);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // m4.al2
    public final long c() {
        long j3 = Long.MAX_VALUE;
        for (al2 al2Var : (al2[]) this.f10966s) {
            long c10 = al2Var.c();
            if (c10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, c10);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // m4.al2
    public final void e(long j3) {
        for (al2 al2Var : (al2[]) this.f10966s) {
            al2Var.e(j3);
        }
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        ((sl1) obj).h((qn) this.f10966s);
    }

    @Override // m4.al2
    public final boolean k() {
        for (al2 al2Var : (al2[]) this.f10966s) {
            if (al2Var.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.mu1
    public final /* synthetic */ Iterator l(aa0 aa0Var, CharSequence charSequence) {
        return new iu1(this, aa0Var, charSequence);
    }

    public final void p(int i10, String str, List list, boolean z10, boolean z11) {
        q1 q1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            q1Var = ((w2) ((p2) this.f10966s).f20505s).C().E;
        } else if (i11 == 1) {
            s1 C = ((w2) ((p2) this.f10966s).f20505s).C();
            if (z10) {
                q1Var = C.y;
            } else if (!z11) {
                q1Var = C.f20711z;
            } else {
                q1Var = C.f20710x;
            }
        } else if (i11 == 3) {
            q1Var = ((w2) ((p2) this.f10966s).f20505s).C().F;
        } else if (i11 != 4) {
            q1Var = ((w2) ((p2) this.f10966s).f20505s).C().D;
        } else {
            s1 C2 = ((w2) ((p2) this.f10966s).f20505s).C();
            if (z10) {
                q1Var = C2.B;
            } else if (!z11) {
                q1Var = C2.C;
            } else {
                q1Var = C2.A;
            }
        }
        int size = list.size();
        if (size == 1) {
            q1Var.b(str, list.get(0));
        } else if (size == 2) {
            q1Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            q1Var.a(str);
        } else {
            q1Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
