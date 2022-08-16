package m4;

import a6.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import d.a;
import e9.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class dg0 {

    /* renamed from: a */
    public final s f7368a;

    /* renamed from: b */
    public final gh0 f7369b;

    /* renamed from: c */
    public final vd2<Integer> f7370c;

    /* renamed from: d */
    public final vd2<rh1> f7371d;

    /* renamed from: e */
    public final vd2<String> f7372e;

    /* renamed from: f */
    public final vd2<yh1> f7373f;

    /* renamed from: g */
    public final vd2<di1> f7374g;

    /* renamed from: h */
    public final vd2<gi1> f7375h;

    /* renamed from: i */
    public final vd2<li1> f7376i;

    /* renamed from: j */
    public final vd2<ri1> f7377j;

    /* renamed from: k */
    public final vd2<hj1> f7378k;

    /* renamed from: l */
    public final vd2<Boolean> f7379l;

    /* renamed from: m */
    public final vd2<cj1> f7380m;

    /* renamed from: n */
    public final vd2<String> f7381n;

    /* renamed from: o */
    public final vd2<v01> f7382o;
    public final vd2<v01> p;

    /* renamed from: q */
    public final vd2<v01> f7383q;

    /* renamed from: r */
    public final vd2<v01> f7384r;

    /* renamed from: s */
    public final vd2<Map<wo1, v01>> f7385s;

    /* renamed from: t */
    public final vd2<Set<es0<ap1>>> f7386t;

    /* renamed from: u */
    public final vd2<Set<es0<ap1>>> f7387u;

    /* renamed from: v */
    public final bp1 f7388v;

    /* renamed from: w */
    public final vd2<zo1> f7389w;

    public dg0(gh0 gh0Var, s sVar) {
        this.f7369b = gh0Var;
        this.f7368a = sVar;
        vi1 vi1Var = new vi1(sVar);
        this.f7370c = vi1Var;
        qh0 qh0Var = f.f4463s;
        vd2<Context> vd2Var = gh0Var.f8897i;
        vd2<ScheduledExecutorService> vd2Var2 = gh0Var.f8909o;
        go1 go1Var = eb.f7756v;
        this.f7371d = new ce1(qh0Var, vd2Var, vd2Var2, go1Var, vi1Var, 1);
        ui1 ui1Var = new ui1(sVar);
        this.f7372e = ui1Var;
        this.f7373f = new ai1(vd2Var, ui1Var);
        vd2<z80> vd2Var3 = gh0Var.f8884b0;
        this.f7374g = new l51(qh0Var, vi1Var, vd2Var, vd2Var3, vd2Var2, go1Var, ui1Var, 1);
        this.f7375h = new ii1(vd2Var);
        this.f7376i = new ni1(ui1Var);
        this.f7377j = new ti1(eb.f7753s, vd2Var2, vd2Var, 0);
        this.f7378k = new ij1(go1Var, 0);
        wi1 wi1Var = new wi1(sVar);
        this.f7379l = wi1Var;
        this.f7380m = new ej1(vd2Var3, wi1Var, ui1Var, vd2Var2);
        xi1 xi1Var = new xi1(sVar);
        this.f7381n = xi1Var;
        vd2<v01> c10 = md2.c(g7.f8757t);
        this.f7382o = c10;
        vd2<v01> c11 = md2.c(b10.f6321s);
        this.p = c11;
        vd2<v01> c12 = md2.c(eb.f7755u);
        this.f7383q = c12;
        vd2<v01> c13 = md2.c(wo2.f15081u);
        this.f7384r = c13;
        int i10 = qd2.f12805b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.l(4));
        wo1 wo1Var = wo1.GMS_SIGNALS;
        Objects.requireNonNull(c10, "provider");
        linkedHashMap.put(wo1Var, c10);
        wo1 wo1Var2 = wo1.BUILD_URL;
        Objects.requireNonNull(c11, "provider");
        linkedHashMap.put(wo1Var2, c11);
        wo1 wo1Var3 = wo1.HTTP;
        Objects.requireNonNull(c12, "provider");
        linkedHashMap.put(wo1Var3, c12);
        wo1 wo1Var4 = wo1.PRE_PROCESS;
        Objects.requireNonNull(c13, "provider");
        linkedHashMap.put(wo1Var4, c13);
        qd2 qd2Var = new qd2(linkedHashMap);
        this.f7385s = qd2Var;
        vd2<Set<es0<ap1>>> c14 = md2.c(new u01(xi1Var, gh0Var.f8897i, qd2Var));
        this.f7386t = c14;
        int i11 = td2.f14031c;
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c14);
        td2 td2Var = new td2(emptyList, arrayList);
        this.f7387u = td2Var;
        bp1 bp1Var = new bp1(td2Var);
        this.f7388v = bp1Var;
        this.f7389w = md2.c(new p11(gh0Var.f8909o, bp1Var));
    }

    public final zo1 a() {
        return this.f7389w.a();
    }

    public final vh1 b() {
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        String string = ((o50) this.f7368a.f13474b).f11995s.getString("ms");
        a.d(string);
        PackageInfo packageInfo = ((o50) this.f7368a.f13474b).f12000x;
        return new vh1(t90Var, string);
    }

    public final pi1 c() {
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        List<String> list = ((o50) this.f7368a.f13474b).f11999w;
        a.d(list);
        return new pi1(t90Var, list);
    }
}
