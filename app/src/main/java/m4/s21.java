package m4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class s21 {

    /* renamed from: a */
    public final j21 f13494a;

    /* renamed from: b */
    public final g01 f13495b;

    /* renamed from: c */
    public final Object f13496c = new Object();

    /* renamed from: d */
    public final List<r21> f13497d = new ArrayList();

    /* renamed from: e */
    public boolean f13498e;

    public s21(j21 j21Var, g01 g01Var) {
        this.f13494a = j21Var;
        this.f13495b = g01Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<m4.r21>, java.util.ArrayList] */
    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f13496c) {
            if (!this.f13498e) {
                j21 j21Var = this.f13494a;
                if (!j21Var.f9809b) {
                    b();
                    return jSONArray;
                }
                c(j21Var.a());
            }
            Iterator it = this.f13497d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((r21) it.next()).a());
            }
            return jSONArray;
        }
    }

    public final void b() {
        j21 j21Var = this.f13494a;
        j21Var.f9812e.b(new hb(j21Var, new q21(this), 2, null), j21Var.f9817j);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.r21>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.String, m4.f01>, java.util.HashMap] */
    public final void c(List<ry> list) {
        f01 f01Var;
        String str;
        e30 e30Var;
        synchronized (this.f13496c) {
            if (this.f13498e) {
                return;
            }
            for (ry ryVar : list) {
                ?? r22 = this.f13497d;
                String str2 = ryVar.f13451s;
                g01 g01Var = this.f13495b;
                synchronized (g01Var) {
                    f01Var = (f01) g01Var.f8696a.get(str2);
                }
                if (f01Var != null && (e30Var = f01Var.f8309b) != null) {
                    str = e30Var.toString();
                    String str3 = str;
                    r22.add(new r21(str2, str3, ryVar.f13452t ? 1 : 0, ryVar.f13454v, ryVar.f13453u));
                }
                str = "";
                String str32 = str;
                r22.add(new r21(str2, str32, ryVar.f13452t ? 1 : 0, ryVar.f13454v, ryVar.f13453u));
            }
            this.f13498e = true;
        }
    }
}
