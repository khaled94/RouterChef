package z;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import l0.e;
import l3.s;
import m4.a00;
import m4.f00;
import m4.kx;
import m4.n00;
import m4.o00;
import m4.w90;
import m4.z90;
import n3.g1;
import n3.s1;
import org.json.JSONObject;
import r.g;

/* loaded from: classes.dex */
public final class a implements z90 {

    /* renamed from: s */
    public final Object f20885s;

    /* renamed from: t */
    public final Object f20886t;

    /* renamed from: u */
    public final Object f20887u;

    /* renamed from: v */
    public final Object f20888v;

    public /* synthetic */ a() {
        this.f20885s = new e(10, 0);
        this.f20886t = new g();
        this.f20887u = new ArrayList();
        this.f20888v = new HashSet();
    }

    public /* synthetic */ a(o00 o00Var, a00 a00Var, Object obj, w90 w90Var) {
        this.f20888v = o00Var;
        this.f20885s = a00Var;
        this.f20886t = obj;
        this.f20887u = w90Var;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((g) this.f20886t).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                a(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        f00 f00Var = (f00) obj;
        o00 o00Var = (o00) this.f20888v;
        a00 a00Var = (a00) this.f20885s;
        Object obj2 = this.f20886t;
        w90 w90Var = (w90) this.f20887u;
        try {
            s1 s1Var = s.B.f5789c;
            String uuid = UUID.randomUUID().toString();
            kx.f10604j.b(uuid, new n00(o00Var, a00Var, w90Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", o00Var.f11969b.a(obj2));
            f00Var.P0(o00Var.f11971d, jSONObject);
        } catch (Exception e10) {
            try {
                w90Var.c(e10);
                g1.h("Unable to invokeJavascript", e10);
            } finally {
                a00Var.g();
            }
        }
    }
}
