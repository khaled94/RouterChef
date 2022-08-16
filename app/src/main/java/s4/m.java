package s4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends h {

    /* renamed from: u */
    public final List<String> f17982u;

    /* renamed from: v */
    public final List<n> f17983v;

    /* renamed from: w */
    public a4 f17984w;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public m(String str, List<n> list, List<n> list2, a4 a4Var) {
        super(str);
        this.f17982u = new ArrayList();
        this.f17984w = a4Var;
        if (!list.isEmpty()) {
            for (n nVar : list) {
                this.f17982u.add(nVar.h());
            }
        }
        this.f17983v = new ArrayList(list2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<s4.n>, java.util.ArrayList] */
    public m(m mVar) {
        super(mVar.f17900s);
        ArrayList arrayList = new ArrayList(mVar.f17982u.size());
        this.f17982u = arrayList;
        arrayList.addAll(mVar.f17982u);
        ArrayList arrayList2 = new ArrayList(mVar.f17983v.size());
        this.f17983v = arrayList2;
        arrayList2.addAll(mVar.f17983v);
        this.f17984w = mVar.f17984w;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<s4.n>, java.util.ArrayList] */
    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        n nVar;
        String str;
        a4 a10 = this.f17984w.a();
        for (int i10 = 0; i10 < this.f17982u.size(); i10++) {
            if (i10 < list.size()) {
                str = (String) this.f17982u.get(i10);
                nVar = a4Var.b(list.get(i10));
            } else {
                str = (String) this.f17982u.get(i10);
                nVar = n.f18009j;
            }
            a10.e(str, nVar);
        }
        Iterator it = this.f17983v.iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            n b10 = a10.b(nVar2);
            if (b10 instanceof o) {
                b10 = a10.b(nVar2);
            }
            if (b10 instanceof f) {
                return ((f) b10).f17854s;
            }
        }
        return n.f18009j;
    }

    @Override // s4.h, s4.n
    public final n g() {
        return new m(this);
    }
}
