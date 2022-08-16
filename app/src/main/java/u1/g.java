package u1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import t1.h;
import t1.o;
import t1.p;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: j */
    public static final String f19007j = h.e("WorkContinuationImpl");

    /* renamed from: a */
    public final k f19008a;

    /* renamed from: d */
    public final List<? extends p> f19011d;

    /* renamed from: e */
    public final List<String> f19012e;

    /* renamed from: h */
    public boolean f19015h;

    /* renamed from: i */
    public c f19016i;

    /* renamed from: b */
    public final String f19009b = null;

    /* renamed from: c */
    public final int f19010c = 2;

    /* renamed from: g */
    public final List<g> f19014g = null;

    /* renamed from: f */
    public final List<String> f19013f = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public g(k kVar, List<? extends p> list) {
        this.f19008a = kVar;
        this.f19011d = list;
        this.f19012e = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = list.get(i10).a();
            this.f19012e.add(a10);
            this.f19013f.add(a10);
        }
    }

    public static boolean c(g gVar, Set<String> set) {
        set.addAll(gVar.f19012e);
        Set<String> d5 = d(gVar);
        for (String str : set) {
            if (((HashSet) d5).contains(str)) {
                return true;
            }
        }
        List<g> list = gVar.f19014g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                if (c(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f19012e);
        return false;
    }

    public static Set<String> d(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.f19014g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                hashSet.addAll(gVar2.f19012e);
            }
        }
        return hashSet;
    }
}
