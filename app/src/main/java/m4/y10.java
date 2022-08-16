package m4;

import android.os.RemoteException;
import f3.a;
import n3.g1;
import p3.d;

/* loaded from: classes.dex */
public final class y10 implements d, ar0, lo1, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f15566s;

    /* renamed from: t */
    public final /* synthetic */ Object f15567t;

    /* renamed from: u */
    public final /* synthetic */ Object f15568u;

    public /* synthetic */ y10(Object obj, Object obj2, int i10) {
        this.f15566s = i10;
        this.f15567t = obj;
        this.f15568u = obj2;
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            String canonicalName = ((a20) this.f15568u).f6021s.getClass().getCanonicalName();
            int i10 = aVar.f4481a;
            String str = aVar.f4482b;
            String str2 = aVar.f4483c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(str).length() + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i10);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            g1.e(sb.toString());
            ((l10) this.f15567t).w3(aVar.a());
            ((l10) this.f15567t).g1(aVar.f4481a, aVar.f4482b);
            ((l10) this.f15567t).A(aVar.f4481a);
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f15566s) {
            case 1:
                ((ur0) obj).e((String) this.f15567t, (String) this.f15568u);
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }

    @Override // m4.lo1
    public final void zza() {
        ((qb1) this.f15567t).f12759a.B1((rs) this.f15568u);
    }

    public y10(a20 a20Var, l10 l10Var) {
        this.f15566s = 0;
        this.f15568u = a20Var;
        this.f15567t = l10Var;
    }
}
