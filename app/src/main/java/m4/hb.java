package m4;

import android.os.RemoteException;
import c1.e;
import d4.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k4.b;
import l3.s;
import n3.g1;
import n3.k1;
import org.json.JSONObject;
import y4.a6;
import y4.h3;
import y4.k6;

/* loaded from: classes.dex */
public final class hb implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9172s;

    /* renamed from: t */
    public final /* synthetic */ Object f9173t;

    /* renamed from: u */
    public final /* synthetic */ Object f9174u;

    public /* synthetic */ hb(Object obj, Object obj2, int i10) {
        this.f9172s = i10;
        this.f9174u = obj;
        this.f9173t = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Map, java.util.Map<java.lang.String, m4.a10>, java.util.HashMap] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9172s) {
            case 0:
                return;
            case 1:
                mh0 mh0Var = (mh0) this.f9173t;
                Runnable runnable = (Runnable) this.f9174u;
                Objects.requireNonNull(mh0Var);
                m.d("Adapters must be initialized on the main thread.");
                ?? r22 = ((k1) s.B.f5793g.c()).e().f14600c;
                if (r22.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        g1.k("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (!(mh0Var.f11200u.f9073b.get() != null)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                for (a10 a10Var : r22.values()) {
                    for (z00 z00Var : a10Var.f6003a) {
                        String str = z00Var.f15947g;
                        for (String str2 : z00Var.f15941a) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        h71<ym1, p81> a10 = mh0Var.f11201v.a(str3, jSONObject);
                        if (a10 != null) {
                            ym1 ym1Var = a10.f9129b;
                            if (!ym1Var.a() && ym1Var.f15839a.G()) {
                                ym1Var.f15839a.p3(new b(mh0Var.f11198s), a10.f9130c, (List) entry.getValue());
                                String valueOf = String.valueOf(str3);
                                g1.e(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                            }
                        }
                    } catch (pm1 e10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        g1.k(sb.toString(), e10);
                    }
                }
                return;
            case 2:
                try {
                    ((xy) this.f9174u).N1(((j21) this.f9173t).a());
                    return;
                } catch (RemoteException e11) {
                    g1.h("", e11);
                    return;
                }
            default:
                ((h3) this.f9174u).f20483s.a();
                if (((y4.b) this.f9173t).f20301u.s() == null) {
                    a6 a6Var = ((h3) this.f9174u).f20483s;
                    y4.b bVar = (y4.b) this.f9173t;
                    Objects.requireNonNull(a6Var);
                    String str4 = bVar.f20299s;
                    Objects.requireNonNull(str4, "null reference");
                    k6 w10 = a6Var.w(str4);
                    if (w10 == null) {
                        return;
                    }
                    a6Var.l(bVar, w10);
                    return;
                }
                a6 a6Var2 = ((h3) this.f9174u).f20483s;
                y4.b bVar2 = (y4.b) this.f9173t;
                Objects.requireNonNull(a6Var2);
                String str5 = bVar2.f20299s;
                Objects.requireNonNull(str5, "null reference");
                k6 w11 = a6Var2.w(str5);
                if (w11 == null) {
                    return;
                }
                a6Var2.o(bVar2, w11);
                return;
        }
    }

    public /* synthetic */ hb(Object obj, Object obj2, int i10, e eVar) {
        this.f9172s = i10;
        this.f9173t = obj;
        this.f9174u = obj2;
    }
}
