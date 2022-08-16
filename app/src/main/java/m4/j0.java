package m4;

import android.util.Log;
import l0.d;

/* loaded from: classes.dex */
public final class j0 implements h0 {

    /* renamed from: a */
    public final int f9779a;

    /* renamed from: b */
    public final int f9780b;

    /* renamed from: c */
    public final dd f9781c;

    public j0(e0 e0Var, t tVar) {
        dd ddVar = e0Var.f7675b;
        this.f9781c = ddVar;
        ddVar.h(12);
        int s10 = ddVar.s();
        if ("audio/raw".equals(tVar.f13871k)) {
            int t10 = ls1.t(tVar.f13884z, tVar.f13883x);
            if (s10 == 0 || s10 % t10 != 0) {
                Log.w("AtomParsers", d.a(88, "Audio sample size mismatch. stsd sample size: ", t10, ", stsz sample size: ", s10));
                s10 = t10;
            }
        }
        this.f9779a = s10 == 0 ? -1 : s10;
        this.f9780b = ddVar.s();
    }

    @Override // m4.h0
    public final int a() {
        return this.f9780b;
    }

    @Override // m4.h0
    public final int c() {
        int i10 = this.f9779a;
        return i10 == -1 ? this.f9781c.s() : i10;
    }

    @Override // m4.h0
    public final int zza() {
        return this.f9779a;
    }
}
