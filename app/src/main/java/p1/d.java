package p1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.u0;
import java.util.ArrayList;
import p1.i;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class d extends u0 {

    /* loaded from: classes.dex */
    public class a extends i.c {
    }

    /* loaded from: classes.dex */
    public class b implements i.d {

        /* renamed from: a */
        public final /* synthetic */ View f16894a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f16895b;

        public b(View view, ArrayList arrayList) {
            this.f16894a = view;
            this.f16895b = arrayList;
        }

        @Override // p1.i.d
        public final void a(i iVar) {
            iVar.w(this);
            this.f16894a.setVisibility(8);
            int size = this.f16895b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f16895b.get(i10)).setVisibility(0);
            }
        }

        @Override // p1.i.d
        public final void b() {
        }

        @Override // p1.i.d
        public final void c() {
        }

        @Override // p1.i.d
        public final void d() {
        }

        @Override // p1.i.d
        public final void e(i iVar) {
            iVar.w(this);
            iVar.a(this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i.c {
    }

    public static boolean s(i iVar) {
        return !u0.h(iVar.f16909w) || !u0.h(null) || !u0.h(null);
    }

    @Override // androidx.fragment.app.u0
    public final void a(Object obj, View view) {
        ((i) obj).b(view);
    }

    @Override // androidx.fragment.app.u0
    public final void b(Object obj, ArrayList<View> arrayList) {
        i iVar = (i) obj;
        if (iVar == null) {
            return;
        }
        int i10 = 0;
        if (iVar instanceof n) {
            n nVar = (n) iVar;
            int size = nVar.P.size();
            while (i10 < size) {
                b(nVar.M(i10), arrayList);
                i10++;
            }
        } else if (s(iVar) || !u0.h(iVar.f16910x)) {
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                iVar.b(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.u0
    public final void c(ViewGroup viewGroup, Object obj) {
        m.a(viewGroup, (i) obj);
    }

    @Override // androidx.fragment.app.u0
    public final boolean e(Object obj) {
        return obj instanceof i;
    }

    @Override // androidx.fragment.app.u0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u0
    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            n nVar = new n();
            nVar.L(iVar);
            nVar.L(iVar2);
            nVar.Q = false;
            iVar = nVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 != null) {
            n nVar2 = new n();
            if (iVar != null) {
                nVar2.L(iVar);
            }
            nVar2.L(iVar3);
            return nVar2;
        }
        return iVar;
    }

    @Override // androidx.fragment.app.u0
    public final Object j(Object obj, Object obj2) {
        n nVar = new n();
        if (obj != null) {
            nVar.L((i) obj);
        }
        nVar.L((i) obj2);
        return nVar;
    }

    @Override // androidx.fragment.app.u0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.u0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((i) obj).a(new e(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.u0
    public final void m(Object obj, Rect rect) {
        ((i) obj).B(new c());
    }

    @Override // androidx.fragment.app.u0
    public final void n(Object obj, View view) {
        if (view != null) {
            g(view, new Rect());
            ((i) obj).B(new a());
        }
    }

    @Override // androidx.fragment.app.u0
    public final void o(Object obj, i0.c cVar, Runnable runnable) {
        i iVar = (i) obj;
        cVar.b(new f(iVar));
        iVar.a(new g(runnable));
    }

    @Override // androidx.fragment.app.u0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f16910x;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u0.d(arrayList2, arrayList.get(i10));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(nVar, arrayList);
    }

    @Override // androidx.fragment.app.u0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.f16910x.clear();
            nVar.f16910x.addAll(arrayList2);
            t(nVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.u0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.L((i) obj);
        return nVar;
    }

    public final void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        i iVar = (i) obj;
        int i10 = 0;
        if (iVar instanceof n) {
            n nVar = (n) iVar;
            int size = nVar.P.size();
            while (i10 < size) {
                t(nVar.M(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (s(iVar)) {
        } else {
            ArrayList<View> arrayList3 = iVar.f16910x;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size2) {
                iVar.b(arrayList2.get(i10));
                i10++;
            }
            int size3 = arrayList.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    return;
                }
                iVar.x(arrayList.get(size3));
            }
        }
    }
}
