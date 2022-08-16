package y4;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.a;
import r.f;
import s4.d4;
import s4.e4;
import s4.f4;
import s4.g4;
import s4.j3;
import s4.k3;
import s4.l3;
import s4.m3;
import s4.va;

/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: a */
    public String f20611a;

    /* renamed from: b */
    public boolean f20612b;

    /* renamed from: c */
    public e4 f20613c;

    /* renamed from: d */
    public BitSet f20614d;

    /* renamed from: e */
    public BitSet f20615e;

    /* renamed from: f */
    public Map<Integer, Long> f20616f;

    /* renamed from: g */
    public Map<Integer, List<Long>> f20617g;

    /* renamed from: h */
    public final /* synthetic */ s6 f20618h;

    public /* synthetic */ n6(s6 s6Var, String str) {
        this.f20618h = s6Var;
        this.f20611a = str;
        this.f20612b = true;
        this.f20614d = new BitSet();
        this.f20615e = new BitSet();
        this.f20616f = new a();
        this.f20617g = new a();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>, r.g] */
    public /* synthetic */ n6(s6 s6Var, String str, e4 e4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f20618h = s6Var;
        this.f20611a = str;
        this.f20614d = bitSet;
        this.f20615e = bitSet2;
        this.f20616f = map;
        this.f20617g = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f20617g.put(num, arrayList);
        }
        this.f20612b = false;
        this.f20613c = e4Var;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>, r.g] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>, r.g] */
    public final k3 a(int i10) {
        ArrayList arrayList;
        List list;
        j3 t10 = k3.t();
        if (t10.f18206u) {
            t10.h();
            t10.f18206u = false;
        }
        k3.x((k3) t10.f18205t, i10);
        boolean z10 = this.f20612b;
        if (t10.f18206u) {
            t10.h();
            t10.f18206u = false;
        }
        k3.A((k3) t10.f18205t, z10);
        e4 e4Var = this.f20613c;
        if (e4Var != null) {
            if (t10.f18206u) {
                t10.h();
                t10.f18206u = false;
            }
            k3.z((k3) t10.f18205t, e4Var);
        }
        d4 x10 = e4.x();
        List<Long> I = c6.I(this.f20614d);
        if (x10.f18206u) {
            x10.h();
            x10.f18206u = false;
        }
        e4.H((e4) x10.f18205t, I);
        List<Long> I2 = c6.I(this.f20615e);
        if (x10.f18206u) {
            x10.h();
            x10.f18206u = false;
        }
        e4.F((e4) x10.f18205t, I2);
        Map<Integer, Long> map = this.f20616f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer num : this.f20616f.keySet()) {
                int intValue = num.intValue();
                Long l10 = this.f20616f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    l3 u10 = m3.u();
                    if (u10.f18206u) {
                        u10.h();
                        u10.f18206u = false;
                    }
                    m3.w((m3) u10.f18205t, intValue);
                    long longValue = l10.longValue();
                    if (u10.f18206u) {
                        u10.h();
                        u10.f18206u = false;
                    }
                    m3.x((m3) u10.f18205t, longValue);
                    arrayList.add(u10.f());
                }
            }
        }
        if (arrayList != null) {
            if (x10.f18206u) {
                x10.h();
                x10.f18206u = false;
            }
            e4.J((e4) x10.f18205t, arrayList);
        }
        ?? r12 = this.f20617g;
        if (r12 == 0) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(r12.f17201u);
            Iterator it = ((f.c) this.f20617g.keySet()).iterator();
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                f4 v10 = g4.v();
                int intValue2 = num2.intValue();
                if (v10.f18206u) {
                    v10.h();
                    v10.f18206u = false;
                }
                g4.y((g4) v10.f18205t, intValue2);
                List list2 = (List) this.f20617g.getOrDefault(num2, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (v10.f18206u) {
                        v10.h();
                        v10.f18206u = false;
                    }
                    g4.z((g4) v10.f18205t, list2);
                }
                arrayList2.add(v10.f());
            }
            list = arrayList2;
        }
        if (x10.f18206u) {
            x10.h();
            x10.f18206u = false;
        }
        e4.L((e4) x10.f18205t, list);
        if (t10.f18206u) {
            t10.h();
            t10.f18206u = false;
        }
        k3.y((k3) t10.f18205t, x10.f());
        return t10.f();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>, r.g] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>, r.g] */
    public final void b(q6 q6Var) {
        int a10 = q6Var.a();
        Boolean bool = q6Var.f20678c;
        if (bool != null) {
            this.f20615e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = q6Var.f20679d;
        if (bool2 != null) {
            this.f20614d.set(a10, bool2.booleanValue());
        }
        if (q6Var.f20680e != null) {
            Map<Integer, Long> map = this.f20616f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = map.get(valueOf);
            long longValue = q6Var.f20680e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f20616f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (q6Var.f20681f != null) {
            ?? r12 = this.f20617g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) r12.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                this.f20617g.put(valueOf2, list);
            }
            if (q6Var.c()) {
                list.clear();
            }
            va.b();
            e eVar = ((w2) this.f20618h.f20505s).y;
            String str = this.f20611a;
            e1<Boolean> e1Var = f1.Y;
            if (eVar.s(str, e1Var) && q6Var.b()) {
                list.clear();
            }
            va.b();
            boolean s10 = ((w2) this.f20618h.f20505s).y.s(this.f20611a, e1Var);
            Long valueOf3 = Long.valueOf(q6Var.f20681f.longValue() / 1000);
            if (!s10) {
                list.add(valueOf3);
            } else if (list.contains(valueOf3)) {
            } else {
                list.add(valueOf3);
            }
        }
    }
}
