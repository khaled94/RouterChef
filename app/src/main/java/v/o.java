package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l0.g;
import s.e;
import u.c;
import u.d;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f */
    public static int f19729f;

    /* renamed from: b */
    public int f19731b;

    /* renamed from: c */
    public int f19732c;

    /* renamed from: a */
    public ArrayList<d> f19730a = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<a> f19733d = null;

    /* renamed from: e */
    public int f19734e = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(d dVar, e eVar) {
            new WeakReference(dVar);
            eVar.o(dVar.J);
            eVar.o(dVar.K);
            eVar.o(dVar.L);
            eVar.o(dVar.M);
            eVar.o(dVar.N);
        }
    }

    public o(int i10) {
        int i11 = f19729f;
        f19729f = i11 + 1;
        this.f19731b = i11;
        this.f19732c = i10;
    }

    public final boolean a(d dVar) {
        if (this.f19730a.contains(dVar)) {
            return false;
        }
        this.f19730a.add(dVar);
        return true;
    }

    public final void b(ArrayList<o> arrayList) {
        int size = this.f19730a.size();
        if (this.f19734e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f19734e == oVar.f19731b) {
                    d(this.f19732c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(e eVar, int i10) {
        int i11;
        c cVar;
        if (this.f19730a.size() == 0) {
            return 0;
        }
        ArrayList<d> arrayList = this.f19730a;
        u.e eVar2 = (u.e) arrayList.get(0).V;
        eVar.u();
        eVar2.c(eVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).c(eVar, false);
        }
        if (i10 == 0 && eVar2.A0 > 0) {
            g.a(eVar2, eVar, arrayList, 0);
        }
        if (i10 == 1 && eVar2.B0 > 0) {
            g.a(eVar2, eVar, arrayList, 1);
        }
        try {
            eVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f19733d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f19733d.add(new a(arrayList.get(i13), eVar));
        }
        if (i10 == 0) {
            i11 = eVar.o(eVar2.J);
            cVar = eVar2.L;
        } else {
            i11 = eVar.o(eVar2.K);
            cVar = eVar2.M;
        }
        int o10 = eVar.o(cVar);
        eVar.u();
        return o10 - i11;
    }

    public final void d(int i10, o oVar) {
        Iterator<d> it = this.f19730a.iterator();
        while (it.hasNext()) {
            d next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f18962p0 = oVar.f19731b;
            } else {
                next.f18964q0 = oVar.f19731b;
            }
        }
        this.f19734e = oVar.f19731b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = this.f19732c;
        sb.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f19731b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<d> it = this.f19730a.iterator();
        while (it.hasNext()) {
            StringBuilder c10 = androidx.fragment.app.a.c(sb2, " ");
            c10.append(it.next().f18951j0);
            sb2 = c10.toString();
        }
        return d7.a.c(sb2, " >");
    }
}
