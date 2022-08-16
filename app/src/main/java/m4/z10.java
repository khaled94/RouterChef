package m4;

import android.os.RemoteException;
import c1.e;
import f3.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import n3.g1;
import p3.d;

/* loaded from: classes.dex */
public final class z10 implements d, kz1, ye0, v91 {

    /* renamed from: s */
    public final /* synthetic */ Object f15974s;

    /* renamed from: t */
    public final /* synthetic */ Object f15975t;

    public /* synthetic */ z10(Object obj, Object obj2) {
        this.f15975t = obj;
        this.f15974s = obj2;
    }

    @Override // m4.ye0
    public final void J(boolean z10) {
        dw0 dw0Var = (dw0) this.f15974s;
        Objects.requireNonNull(dw0Var);
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) ((Map) this.f15975t).get("id"));
        dw0Var.f7654b.b(hashMap);
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        Object obj2 = this.f15975t;
        ((ti0) obj2).f14073z.a(((ti0) obj2).y.b(((ti0) obj2).f14071w, ((ti0) obj2).f14072x, false, (String) this.f15974s, str, ((ti0) obj2).f14072x.f7038d));
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            String canonicalName = ((a20) this.f15975t).f6021s.getClass().getCanonicalName();
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
            ((l10) this.f15974s).w3(aVar.a());
            ((l10) this.f15974s).g1(aVar.f4481a, aVar.f4482b);
            ((l10) this.f15974s).A(aVar.f4481a);
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        ti0 ti0Var = (ti0) this.f15975t;
        tm1 tm1Var = ti0Var.f14073z;
        xp1 xp1Var = ti0Var.y;
        km1 km1Var = ti0Var.f14071w;
        cm1 cm1Var = ti0Var.f14072x;
        tm1Var.a(xp1Var.b(km1Var, cm1Var, false, (String) this.f15974s, null, cm1Var.f7038d));
    }

    @Override // m4.v91
    public final void h(Object obj) {
        sg0 sg0Var = (sg0) this.f15975t;
        ((gg2) obj).g(sg0Var);
        int i10 = sg0Var.f13628a;
    }

    public /* synthetic */ z10(Object obj, Object obj2, e eVar) {
        this.f15974s = obj;
        this.f15975t = obj2;
    }
}
