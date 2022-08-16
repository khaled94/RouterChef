package v;

import androidx.fragment.app.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d */
    public p f19713d;

    /* renamed from: f */
    public int f19715f;

    /* renamed from: g */
    public int f19716g;

    /* renamed from: a */
    public p f19710a = null;

    /* renamed from: b */
    public boolean f19711b = false;

    /* renamed from: c */
    public boolean f19712c = false;

    /* renamed from: e */
    public int f19714e = 1;

    /* renamed from: h */
    public int f19717h = 1;

    /* renamed from: i */
    public g f19718i = null;

    /* renamed from: j */
    public boolean f19719j = false;

    /* renamed from: k */
    public List<d> f19720k = new ArrayList();

    /* renamed from: l */
    public List<f> f19721l = new ArrayList();

    public f(p pVar) {
        this.f19713d = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<v.f>, java.util.ArrayList] */
    @Override // v.d
    public final void a(d dVar) {
        Iterator it = this.f19721l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f19719j) {
                return;
            }
        }
        this.f19712c = true;
        p pVar = this.f19710a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f19711b) {
            this.f19713d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        Iterator it2 = this.f19721l.iterator();
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f19719j) {
            g gVar = this.f19718i;
            if (gVar != null) {
                if (!gVar.f19719j) {
                    return;
                }
                this.f19715f = this.f19717h * gVar.f19716g;
            }
            d(fVar.f19716g + this.f19715f);
        }
        p pVar2 = this.f19710a;
        if (pVar2 == null) {
            return;
        }
        pVar2.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final void b(d dVar) {
        this.f19720k.add(dVar);
        if (this.f19719j) {
            dVar.a(dVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final void c() {
        this.f19721l.clear();
        this.f19720k.clear();
        this.f19719j = false;
        this.f19716g = 0;
        this.f19712c = false;
        this.f19711b = false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<v.d>, java.util.ArrayList] */
    public void d(int i10) {
        if (this.f19719j) {
            return;
        }
        this.f19719j = true;
        this.f19716g = i10;
        Iterator it = this.f19720k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<v.f>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List<v.d>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19713d.f19736b.f18951j0);
        sb.append(":");
        sb.append(c1.e(this.f19714e));
        sb.append("(");
        sb.append(this.f19719j ? Integer.valueOf(this.f19716g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f19721l.size());
        sb.append(":d=");
        sb.append(this.f19720k.size());
        sb.append(">");
        return sb.toString();
    }
}
