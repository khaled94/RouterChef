package h2;

import android.os.RemoteException;
import c1.f;
import c4.m;
import c5.d;
import c5.i;
import c5.j;
import f3.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m4.a00;
import m4.a3;
import m4.dd;
import m4.eq1;
import m4.h00;
import m4.i20;
import m4.kz1;
import m4.lx;
import m4.mo1;
import m4.nl1;
import m4.q2;
import m4.r2;
import m4.to1;
import m4.vd0;
import m4.vo2;
import m4.w2;
import m4.w90;
import m4.x2;
import m4.y90;
import n3.g1;
import s4.a0;
import s4.a4;
import s4.b0;
import s4.c0;
import s4.d0;
import s4.e0;
import s4.n;
import s4.o;
import s4.t;
import s4.v;
import s4.w;
import s4.y;

/* loaded from: classes.dex */
public final class u implements d, q2, y90, p3.d, kz1 {

    /* renamed from: s */
    public final /* synthetic */ int f5041s;

    /* renamed from: t */
    public final Object f5042t;

    /* renamed from: u */
    public final Object f5043u;

    public u(int i10) {
        this.f5041s = i10;
        if (i10 != 9) {
            this.f5042t = new ConcurrentHashMap();
            this.f5043u = new AtomicInteger(0);
            return;
        }
        this.f5042t = new HashMap();
        this.f5043u = new c0();
        h(new t());
        h(new v());
        h(new w());
        h(new y());
        h(new a0());
        h(new b0());
        h(new d0());
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        switch (this.f5041s) {
            case 6:
                ((vd0) obj).z0((String) this.f5042t, (lx) this.f5043u);
                return;
            default:
                ((to1) this.f5043u).f14126f.f14467c.W((mo1) this.f5042t);
                return;
        }
    }

    @Override // m4.q2
    public final void b(eq1 eq1Var, vo2 vo2Var, a3 a3Var) {
    }

    @Override // c5.d
    public final void c(i iVar) {
        ((m) this.f5043u).f2718b.remove((j) this.f5042t);
    }

    @Override // m4.q2
    public final void d(dd ddVar) {
        if (ddVar.q() == 0 && (ddVar.q() & 128) != 0) {
            ddVar.i(6);
            int zza = ddVar.zza() / 4;
            for (int i10 = 0; i10 < zza; i10++) {
                ddVar.b((nl1) this.f5042t, 4);
                int c10 = ((nl1) this.f5042t).c(16);
                ((nl1) this.f5042t).h(3);
                if (c10 == 0) {
                    ((nl1) this.f5042t).h(13);
                } else {
                    int c11 = ((nl1) this.f5042t).c(13);
                    if (((x2) this.f5043u).f15182e.get(c11) == null) {
                        Object obj = this.f5043u;
                        ((x2) obj).f15182e.put(c11, new r2(new w2((x2) obj, c11)));
                        ((x2) this.f5043u).f15188k++;
                    }
                }
            }
            ((x2) this.f5043u).f15182e.remove(0);
        }
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            ((i20) this.f5042t).t(aVar.a());
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        switch (this.f5041s) {
            case 6:
                return;
            default:
                ((to1) this.f5043u).f14126f.f14467c.s((mo1) this.f5042t, th);
                return;
        }
    }

    public final n g(a4 a4Var, n nVar) {
        f.g(a4Var);
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            ArrayList<n> arrayList = oVar.f18036t;
            String str = oVar.f18035s;
            return (((Map) this.f5042t).containsKey(str) ? (s4.u) ((Map) this.f5042t).get(str) : (c0) this.f5043u).a(str, a4Var, arrayList);
        }
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public final void h(s4.u uVar) {
        Iterator it = uVar.f18127a.iterator();
        while (it.hasNext()) {
            ((Map) this.f5042t).put(Integer.valueOf(((e0) it.next()).f17841s).toString(), uVar);
        }
    }

    @Override // m4.y90
    /* renamed from: zza */
    public final void mo20zza() {
        ((w90) this.f5042t).c(new h00("Unable to obtain a JavascriptEngine."));
        ((a00) this.f5043u).g();
    }

    public /* synthetic */ u(Object obj, Object obj2, int i10) {
        this.f5041s = i10;
        this.f5042t = obj2;
        this.f5043u = obj;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i10) {
        this.f5041s = i10;
        this.f5042t = obj2;
        this.f5043u = obj3;
    }

    public u(x2 x2Var) {
        this.f5041s = 3;
        this.f5043u = x2Var;
        this.f5042t = new nl1(new byte[4], 4);
    }
}
