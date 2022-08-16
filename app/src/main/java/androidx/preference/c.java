package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import e1.g;
import e1.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class c extends RecyclerView.e<g> implements Preference.c {

    /* renamed from: c */
    public final PreferenceGroup f1830c;

    /* renamed from: h */
    public final a f1835h = new a();

    /* renamed from: g */
    public final Handler f1834g = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public List<Preference> f1831d = new ArrayList();

    /* renamed from: e */
    public List<Preference> f1832e = new ArrayList();

    /* renamed from: f */
    public final List<b> f1833f = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.l();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f1837a;

        /* renamed from: b */
        public int f1838b;

        /* renamed from: c */
        public String f1839c;

        public b(Preference preference) {
            this.f1839c = preference.getClass().getName();
            this.f1837a = preference.W;
            this.f1838b = preference.X;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1837a == bVar.f1837a && this.f1838b == bVar.f1838b && TextUtils.equals(this.f1839c, bVar.f1839c);
        }

        public final int hashCode() {
            return this.f1839c.hashCode() + ((((527 + this.f1837a) * 31) + this.f1838b) * 31);
        }
    }

    public c(PreferenceGroup preferenceGroup) {
        this.f1830c = preferenceGroup;
        preferenceGroup.Y = this;
        g(((PreferenceScreen) preferenceGroup).f1784l0);
        l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f1832e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i10) {
        if (!this.f1944b) {
            return -1L;
        }
        return j(i10).f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<androidx.preference.c$b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<androidx.preference.c$b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<androidx.preference.c$b>, java.util.ArrayList] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c(int i10) {
        b bVar = new b(j(i10));
        int indexOf = this.f1833f.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f1833f.size();
        this.f1833f.add(bVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(g gVar, int i10) {
        g gVar2 = gVar;
        Preference j3 = j(i10);
        Drawable background = gVar2.f1924a.getBackground();
        Drawable drawable = gVar2.f4352t;
        if (background != drawable) {
            View view = gVar2.f1924a;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.q(view, drawable);
        }
        TextView textView = (TextView) gVar2.x(16908310);
        if (textView != null && gVar2.f4353u != null && !textView.getTextColors().equals(gVar2.f4353u)) {
            textView.setTextColor(gVar2.f4353u);
        }
        j3.s(gVar2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.preference.c$b>, java.util.ArrayList] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final g f(ViewGroup viewGroup, int i10) {
        b bVar = (b) this.f1833f.get(i10);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, j.f4371s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = f.a.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.f1837a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.q(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i11 = bVar.f1838b;
            if (i11 != 0) {
                from.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new g(inflate);
    }

    public final List<Preference> h(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int I = preferenceGroup.I();
        int i10 = 0;
        for (int i11 = 0; i11 < I; i11++) {
            Preference H = preferenceGroup.H(i11);
            if (H.O) {
                if (!k(preferenceGroup) || i10 < preferenceGroup.f1782k0) {
                    arrayList.add(H);
                } else {
                    arrayList2.add(H);
                }
                if (!(H instanceof PreferenceGroup)) {
                    i10++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) H;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else if (k(preferenceGroup) && k(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        Iterator it = ((ArrayList) h(preferenceGroup2)).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!k(preferenceGroup) || i10 < preferenceGroup.f1782k0) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        if (k(preferenceGroup) && i10 > preferenceGroup.f1782k0) {
            e1.b bVar = new e1.b(preferenceGroup.f1768s, arrayList2, preferenceGroup.f1770u);
            bVar.f1773x = new d(this, preferenceGroup);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<androidx.preference.c$b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<androidx.preference.c$b>, java.util.ArrayList] */
    public final void i(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f1778g0);
        }
        int I = preferenceGroup.I();
        for (int i10 = 0; i10 < I; i10++) {
            Preference H = preferenceGroup.H(i10);
            list.add(H);
            b bVar = new b(H);
            if (!this.f1833f.contains(bVar)) {
                this.f1833f.add(bVar);
            }
            if (H instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) H;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    i(list, preferenceGroup2);
                }
            }
            H.Y = this;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public final Preference j(int i10) {
        if (i10 < 0 || i10 >= a()) {
            return null;
        }
        return (Preference) this.f1832e.get(i10);
    }

    public final boolean k(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f1782k0 != Integer.MAX_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public final void l() {
        Iterator it = this.f1831d.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).Y = null;
        }
        ArrayList arrayList = new ArrayList(this.f1831d.size());
        this.f1831d = arrayList;
        i(arrayList, this.f1830c);
        this.f1832e = (ArrayList) h(this.f1830c);
        e eVar = this.f1830c.f1769t;
        d();
        Iterator it2 = this.f1831d.iterator();
        while (it2.hasNext()) {
            Objects.requireNonNull((Preference) it2.next());
        }
    }
}
