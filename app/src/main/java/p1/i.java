package p1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public abstract class i implements Cloneable {
    public static final int[] M = {2, 1, 3, 4};
    public static final a N = new a();
    public static ThreadLocal<r.a<Animator, b>> O = new ThreadLocal<>();
    public ArrayList<p> C;
    public ArrayList<p> D;
    public c K;

    /* renamed from: s */
    public String f16905s = getClass().getName();

    /* renamed from: t */
    public long f16906t = -1;

    /* renamed from: u */
    public long f16907u = -1;

    /* renamed from: v */
    public TimeInterpolator f16908v = null;

    /* renamed from: w */
    public ArrayList<Integer> f16909w = new ArrayList<>();

    /* renamed from: x */
    public ArrayList<View> f16910x = new ArrayList<>();
    public q y = new q();

    /* renamed from: z */
    public q f16911z = new q();
    public n A = null;
    public int[] B = M;
    public ArrayList<Animator> E = new ArrayList<>();
    public int F = 0;
    public boolean G = false;
    public boolean H = false;
    public ArrayList<d> I = null;
    public ArrayList<Animator> J = new ArrayList<>();
    public androidx.activity.result.d L = N;

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.d {
        @Override // androidx.activity.result.d
        public final Path g(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public View f16912a;

        /* renamed from: b */
        public String f16913b;

        /* renamed from: c */
        public p f16914c;

        /* renamed from: d */
        public d0 f16915d;

        /* renamed from: e */
        public i f16916e;

        public b(View view, String str, i iVar, d0 d0Var, p pVar) {
            this.f16912a = view;
            this.f16913b = str;
            this.f16914c = pVar;
            this.f16915d = d0Var;
            this.f16916e = iVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(i iVar);

        void b();

        void c();

        void d();

        void e(i iVar);
    }

    public static void c(q qVar, View view, p pVar) {
        qVar.f16935a.put(view, pVar);
        int id = view.getId();
        if (id >= 0) {
            if (qVar.f16936b.indexOfKey(id) >= 0) {
                qVar.f16936b.put(id, null);
            } else {
                qVar.f16936b.put(id, view);
            }
        }
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        String k10 = z.i.k(view);
        if (k10 != null) {
            if (qVar.f16938d.containsKey(k10)) {
                qVar.f16938d.put(k10, null);
            } else {
                qVar.f16938d.put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            r.d<View> dVar = qVar.f16937c;
            if (dVar.f17172s) {
                dVar.d();
            }
            if (l4.b.d(dVar.f17173t, dVar.f17175v, itemIdAtPosition) >= 0) {
                View e10 = qVar.f16937c.e(itemIdAtPosition, null);
                if (e10 == null) {
                    return;
                }
                z.d.r(e10, false);
                qVar.f16937c.f(itemIdAtPosition, null);
                return;
            }
            z.d.r(view, true);
            qVar.f16937c.f(itemIdAtPosition, view);
        }
    }

    public static r.a<Animator, b> p() {
        r.a<Animator, b> aVar = O.get();
        if (aVar == null) {
            r.a<Animator, b> aVar2 = new r.a<>();
            O.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public static boolean u(p pVar, p pVar2, String str) {
        Object obj = pVar.f16932a.get(str);
        Object obj2 = pVar2.f16932a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    public i A(long j3) {
        this.f16907u = j3;
        return this;
    }

    public void B(c cVar) {
        this.K = cVar;
    }

    public i C(TimeInterpolator timeInterpolator) {
        this.f16908v = timeInterpolator;
        return this;
    }

    public void D(androidx.activity.result.d dVar) {
        if (dVar == null) {
            dVar = N;
        }
        this.L = dVar;
    }

    public void E() {
    }

    public i F(long j3) {
        this.f16906t = j3;
        return this;
    }

    public final void J() {
        if (this.F == 0) {
            ArrayList<d> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).e(this);
                }
            }
            this.H = false;
        }
        this.F++;
    }

    public String K(String str) {
        StringBuilder c10 = androidx.activity.result.a.c(str);
        c10.append(getClass().getSimpleName());
        c10.append("@");
        c10.append(Integer.toHexString(hashCode()));
        c10.append(": ");
        String sb = c10.toString();
        if (this.f16907u != -1) {
            StringBuilder c11 = androidx.fragment.app.a.c(sb, "dur(");
            c11.append(this.f16907u);
            c11.append(") ");
            sb = c11.toString();
        }
        if (this.f16906t != -1) {
            StringBuilder c12 = androidx.fragment.app.a.c(sb, "dly(");
            c12.append(this.f16906t);
            c12.append(") ");
            sb = c12.toString();
        }
        if (this.f16908v != null) {
            StringBuilder c13 = androidx.fragment.app.a.c(sb, "interp(");
            c13.append(this.f16908v);
            c13.append(") ");
            sb = c13.toString();
        }
        if (this.f16909w.size() > 0 || this.f16910x.size() > 0) {
            String c14 = d7.a.c(sb, "tgts(");
            if (this.f16909w.size() > 0) {
                for (int i10 = 0; i10 < this.f16909w.size(); i10++) {
                    if (i10 > 0) {
                        c14 = d7.a.c(c14, ", ");
                    }
                    StringBuilder c15 = androidx.activity.result.a.c(c14);
                    c15.append(this.f16909w.get(i10));
                    c14 = c15.toString();
                }
            }
            if (this.f16910x.size() > 0) {
                for (int i11 = 0; i11 < this.f16910x.size(); i11++) {
                    if (i11 > 0) {
                        c14 = d7.a.c(c14, ", ");
                    }
                    StringBuilder c16 = androidx.activity.result.a.c(c14);
                    c16.append(this.f16910x.get(i11));
                    c14 = c16.toString();
                }
            }
            return d7.a.c(c14, ")");
        }
        return sb;
    }

    public i a(d dVar) {
        if (this.I == null) {
            this.I = new ArrayList<>();
        }
        this.I.add(dVar);
        return this;
    }

    public i b(View view) {
        this.f16910x.add(view);
        return this;
    }

    public void cancel() {
        int size = this.E.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.E.get(size).cancel();
        }
        ArrayList<d> arrayList = this.I;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.I.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((d) arrayList2.get(i10)).d();
        }
    }

    public abstract void d(p pVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            p pVar = new p(view);
            if (z10) {
                g(pVar);
            } else {
                d(pVar);
            }
            pVar.f16934c.add(this);
            f(pVar);
            c(z10 ? this.y : this.f16911z, view, pVar);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            e(viewGroup.getChildAt(i10), z10);
        }
    }

    public void f(p pVar) {
    }

    public abstract void g(p pVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        if (this.f16909w.size() <= 0 && this.f16910x.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < this.f16909w.size(); i10++) {
            View findViewById = viewGroup.findViewById(this.f16909w.get(i10).intValue());
            if (findViewById != null) {
                p pVar = new p(findViewById);
                if (z10) {
                    g(pVar);
                } else {
                    d(pVar);
                }
                pVar.f16934c.add(this);
                f(pVar);
                c(z10 ? this.y : this.f16911z, findViewById, pVar);
            }
        }
        for (int i11 = 0; i11 < this.f16910x.size(); i11++) {
            View view = this.f16910x.get(i11);
            p pVar2 = new p(view);
            if (z10) {
                g(pVar2);
            } else {
                d(pVar2);
            }
            pVar2.f16934c.add(this);
            f(pVar2);
            c(z10 ? this.y : this.f16911z, view, pVar2);
        }
    }

    public final void i(boolean z10) {
        q qVar;
        if (z10) {
            this.y.f16935a.clear();
            this.y.f16936b.clear();
            qVar = this.y;
        } else {
            this.f16911z.f16935a.clear();
            this.f16911z.f16936b.clear();
            qVar = this.f16911z;
        }
        qVar.f16937c.b();
    }

    /* renamed from: k */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.J = new ArrayList<>();
            iVar.y = new q();
            iVar.f16911z = new q();
            iVar.C = null;
            iVar.D = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public void m(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        int i10;
        Animator l10;
        Animator animator;
        p pVar;
        View view;
        p pVar2;
        Animator animator2;
        Animator animator3;
        p pVar3;
        r.a<Animator, b> p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            p pVar4 = arrayList.get(i11);
            p pVar5 = arrayList2.get(i11);
            if (pVar4 != null && !pVar4.f16934c.contains(this)) {
                pVar4 = null;
            }
            if (pVar5 != null && !pVar5.f16934c.contains(this)) {
                pVar5 = null;
            }
            if (pVar4 != null || pVar5 != null) {
                if ((pVar4 == null || pVar5 == null || s(pVar4, pVar5)) && (l10 = l(viewGroup, pVar4, pVar5)) != null) {
                    if (pVar5 != null) {
                        View view2 = pVar5.f16933b;
                        String[] q10 = q();
                        if (q10 == null || q10.length <= 0) {
                            animator3 = l10;
                            i10 = size;
                            pVar3 = null;
                        } else {
                            pVar2 = new p(view2);
                            p orDefault = qVar2.f16935a.getOrDefault(view2, null);
                            if (orDefault != null) {
                                int i12 = 0;
                                while (i12 < q10.length) {
                                    pVar2.f16932a.put(q10[i12], orDefault.f16932a.get(q10[i12]));
                                    i12++;
                                    l10 = l10;
                                    size = size;
                                    orDefault = orDefault;
                                }
                            }
                            animator3 = l10;
                            i10 = size;
                            int i13 = p.f17201u;
                            for (int i14 = 0; i14 < i13; i14++) {
                                b orDefault2 = p.getOrDefault(p.h(i14), null);
                                if (orDefault2.f16914c != null && orDefault2.f16912a == view2 && orDefault2.f16913b.equals(this.f16905s) && orDefault2.f16914c.equals(pVar2)) {
                                    animator2 = null;
                                    break;
                                }
                            }
                            pVar3 = pVar2;
                        }
                        pVar2 = pVar3;
                        animator2 = animator3;
                        view = view2;
                        animator = animator2;
                        pVar = pVar2;
                    } else {
                        pVar = null;
                        i10 = size;
                        view = pVar4.f16933b;
                        animator = l10;
                    }
                    if (animator != null) {
                        String str = this.f16905s;
                        y yVar = u.f16943a;
                        p.put(animator, new b(view, str, this, new c0(viewGroup), pVar));
                        this.J.add(animator);
                    }
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator4 = this.J.get(sparseIntArray.keyAt(i15));
                animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i10 = this.F - 1;
        this.F = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).a(this);
                }
            }
            for (int i12 = 0; i12 < this.y.f16937c.g(); i12++) {
                View h10 = this.y.f16937c.h(i12);
                if (h10 != null) {
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    z.d.r(h10, false);
                }
            }
            for (int i13 = 0; i13 < this.f16911z.f16937c.g(); i13++) {
                View h11 = this.f16911z.f16937c.h(i13);
                if (h11 != null) {
                    WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                    z.d.r(h11, false);
                }
            }
            this.H = true;
        }
    }

    public final p o(View view, boolean z10) {
        n nVar = this.A;
        if (nVar != null) {
            return nVar.o(view, z10);
        }
        ArrayList<p> arrayList = z10 ? this.C : this.D;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            p pVar = arrayList.get(i11);
            if (pVar == null) {
                return null;
            }
            if (pVar.f16933b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.D : this.C).get(i10);
    }

    public String[] q() {
        return null;
    }

    public final p r(View view, boolean z10) {
        n nVar = this.A;
        if (nVar != null) {
            return nVar.r(view, z10);
        }
        return (z10 ? this.y : this.f16911z).f16935a.getOrDefault(view, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public boolean s(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return false;
        }
        String[] q10 = q();
        if (q10 == null) {
            for (String str : pVar.f16932a.keySet()) {
                if (u(pVar, pVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : q10) {
            if (!u(pVar, pVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        return (this.f16909w.size() == 0 && this.f16910x.size() == 0) || this.f16909w.contains(Integer.valueOf(view.getId())) || this.f16910x.contains(view);
    }

    public final String toString() {
        return K("");
    }

    public void v(View view) {
        if (!this.H) {
            for (int size = this.E.size() - 1; size >= 0; size--) {
                this.E.get(size).pause();
            }
            ArrayList<d> arrayList = this.I;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.I.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((d) arrayList2.get(i10)).b();
                }
            }
            this.G = true;
        }
    }

    public i w(d dVar) {
        ArrayList<d> arrayList = this.I;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.I.size() == 0) {
            this.I = null;
        }
        return this;
    }

    public i x(View view) {
        this.f16910x.remove(view);
        return this;
    }

    public void y(View view) {
        if (this.G) {
            if (!this.H) {
                int size = this.E.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.E.get(size).resume();
                }
                ArrayList<d> arrayList = this.I;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.I.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((d) arrayList2.get(i10)).c();
                    }
                }
            }
            this.G = false;
        }
    }

    public void z() {
        J();
        r.a<Animator, b> p = p();
        Iterator<Animator> it = this.J.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new j(this, p));
                    long j3 = this.f16907u;
                    if (j3 >= 0) {
                        next.setDuration(j3);
                    }
                    long j10 = this.f16906t;
                    if (j10 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f16908v;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.J.clear();
        n();
    }
}
