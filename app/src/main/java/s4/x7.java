package s4;

import c1.f;
import d.b;
import java.util.ArrayList;
import java.util.List;
import z3.v;

/* loaded from: classes.dex */
public final class x7 extends k {

    /* renamed from: t */
    public final v f18186t;

    public x7(v vVar) {
        this.f18186t = vVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.Map, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // s4.k, s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            f.m("getEventName", 0, list);
            return new r(((a) this.f18186t.f20973u).f17702a);
        } else if (c10 == 1) {
            f.m("getParamValue", 1, list);
            String h10 = a4Var.b((n) ((ArrayList) list).get(0)).h();
            a aVar = (a) this.f18186t.f20973u;
            return b.j(aVar.f17704c.containsKey(h10) ? aVar.f17704c.get(h10) : null);
        } else if (c10 == 2) {
            f.m("getParams", 0, list);
            ?? r12 = ((a) this.f18186t.f20973u).f17704c;
            k kVar = new k();
            for (String str2 : r12.keySet()) {
                kVar.k(str2, b.j(r12.get(str2)));
            }
            return kVar;
        } else if (c10 == 3) {
            f.m("getTimestamp", 0, list);
            return new g(Double.valueOf(((a) this.f18186t.f20973u).f17703b));
        } else if (c10 == 4) {
            f.m("setEventName", 1, list);
            n b10 = a4Var.b((n) ((ArrayList) list).get(0));
            if (n.f18009j.equals(b10) || n.f18010k.equals(b10)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            ((a) this.f18186t.f20973u).f17702a = b10.h();
            return new r(b10.h());
        } else if (c10 != 5) {
            return super.i(str, a4Var, list);
        } else {
            f.m("setParamValue", 2, list);
            ArrayList arrayList = (ArrayList) list;
            String h11 = a4Var.b((n) arrayList.get(0)).h();
            n b11 = a4Var.b((n) arrayList.get(1));
            Object k10 = f.k(b11);
            ?? r22 = ((a) this.f18186t.f20973u).f17704c;
            if (k10 == null) {
                r22.remove(h11);
            } else {
                r22.put(h11, k10);
            }
            return b11;
        }
    }
}
