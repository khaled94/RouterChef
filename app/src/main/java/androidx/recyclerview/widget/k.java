package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends z {

    /* renamed from: s */
    public static TimeInterpolator f2127s;

    /* renamed from: h */
    public ArrayList<RecyclerView.a0> f2128h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.a0> f2129i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<b> f2130j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<a> f2131k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.a0>> f2132l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<b>> f2133m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<a>> f2134n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.a0> f2135o = new ArrayList<>();
    public ArrayList<RecyclerView.a0> p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.a0> f2136q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.a0> f2137r = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public RecyclerView.a0 f2138a;

        /* renamed from: b */
        public RecyclerView.a0 f2139b;

        /* renamed from: c */
        public int f2140c;

        /* renamed from: d */
        public int f2141d;

        /* renamed from: e */
        public int f2142e;

        /* renamed from: f */
        public int f2143f;

        public a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13) {
            this.f2138a = a0Var;
            this.f2139b = a0Var2;
            this.f2140c = i10;
            this.f2141d = i11;
            this.f2142e = i12;
            this.f2143f = i13;
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("ChangeInfo{oldHolder=");
            c10.append(this.f2138a);
            c10.append(", newHolder=");
            c10.append(this.f2139b);
            c10.append(", fromX=");
            c10.append(this.f2140c);
            c10.append(", fromY=");
            c10.append(this.f2141d);
            c10.append(", toX=");
            c10.append(this.f2142e);
            c10.append(", toY=");
            c10.append(this.f2143f);
            c10.append('}');
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public RecyclerView.a0 f2144a;

        /* renamed from: b */
        public int f2145b;

        /* renamed from: c */
        public int f2146c;

        /* renamed from: d */
        public int f2147d;

        /* renamed from: e */
        public int f2148e;

        public b(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13) {
            this.f2144a = a0Var;
            this.f2145b = i10;
            this.f2146c = i11;
            this.f2147d = i12;
            this.f2148e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void e(RecyclerView.a0 a0Var) {
        View view = a0Var.f1924a;
        view.animate().cancel();
        int size = this.f2130j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2130j.get(size).f2144a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                this.f2130j.remove(size);
            }
        }
        k(this.f2131k, a0Var);
        if (this.f2128h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.f2129i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        for (int size2 = this.f2134n.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList = this.f2134n.get(size2);
            k(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.f2134n.remove(size2);
            }
        }
        for (int size3 = this.f2133m.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList2 = this.f2133m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f2144a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2133m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2132l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.a0> arrayList3 = this.f2132l.get(size5);
            if (arrayList3.remove(a0Var)) {
                view.setAlpha(1.0f);
                c(a0Var);
                if (arrayList3.isEmpty()) {
                    this.f2132l.remove(size5);
                }
            }
        }
        this.f2136q.remove(a0Var);
        this.f2135o.remove(a0Var);
        this.f2137r.remove(a0Var);
        this.p.remove(a0Var);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void f() {
        int size = this.f2130j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2130j.get(size);
            View view = bVar.f2144a.f1924a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f2144a);
            this.f2130j.remove(size);
        }
        int size2 = this.f2128h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f2128h.get(size2));
            this.f2128h.remove(size2);
        }
        int size3 = this.f2129i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.f2129i.get(size3);
            a0Var.f1924a.setAlpha(1.0f);
            c(a0Var);
            this.f2129i.remove(size3);
        }
        int size4 = this.f2131k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f2131k.get(size4);
            RecyclerView.a0 a0Var2 = aVar.f2138a;
            if (a0Var2 != null) {
                l(aVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = aVar.f2139b;
            if (a0Var3 != null) {
                l(aVar, a0Var3);
            }
        }
        this.f2131k.clear();
        if (!g()) {
            return;
        }
        int size5 = this.f2133m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.f2133m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f2144a.f1924a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f2144a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2133m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f2132l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.a0> arrayList2 = this.f2132l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.a0 a0Var4 = arrayList2.get(size8);
                    a0Var4.f1924a.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2132l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f2134n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                i(this.f2136q);
                i(this.p);
                i(this.f2135o);
                i(this.f2137r);
                d();
                return;
            }
            ArrayList<a> arrayList3 = this.f2134n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    a aVar2 = arrayList3.get(size10);
                    RecyclerView.a0 a0Var5 = aVar2.f2138a;
                    if (a0Var5 != null) {
                        l(aVar2, a0Var5);
                    }
                    RecyclerView.a0 a0Var6 = aVar2.f2139b;
                    if (a0Var6 != null) {
                        l(aVar2, a0Var6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f2134n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean g() {
        return !this.f2129i.isEmpty() || !this.f2131k.isEmpty() || !this.f2130j.isEmpty() || !this.f2128h.isEmpty() || !this.p.isEmpty() || !this.f2136q.isEmpty() || !this.f2135o.isEmpty() || !this.f2137r.isEmpty() || !this.f2133m.isEmpty() || !this.f2132l.isEmpty() || !this.f2134n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.z
    public final boolean h(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13) {
        View view = a0Var.f1924a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) a0Var.f1924a.getTranslationY());
        m(a0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(a0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f2130j.add(new b(a0Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void i(List<RecyclerView.a0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f1924a.animate().cancel();
        }
    }

    public final void j() {
        if (!g()) {
            d();
        }
    }

    public final void k(List<a> list, RecyclerView.a0 a0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (l(aVar, a0Var) && aVar.f2138a == null && aVar.f2139b == null) {
                list.remove(aVar);
            }
        }
    }

    public final boolean l(a aVar, RecyclerView.a0 a0Var) {
        if (aVar.f2139b == a0Var) {
            aVar.f2139b = null;
        } else if (aVar.f2138a != a0Var) {
            return false;
        } else {
            aVar.f2138a = null;
        }
        a0Var.f1924a.setAlpha(1.0f);
        a0Var.f1924a.setTranslationX(0.0f);
        a0Var.f1924a.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void m(RecyclerView.a0 a0Var) {
        if (f2127s == null) {
            f2127s = new ValueAnimator().getInterpolator();
        }
        a0Var.f1924a.animate().setInterpolator(f2127s);
        e(a0Var);
    }
}
