package s4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n7 extends y5<String> implements RandomAccess, o7 {

    /* renamed from: t */
    public final List<Object> f18028t;

    static {
        new n7(10).f18203s = false;
    }

    public n7() {
        this(10);
    }

    public n7(int i10) {
        this.f18028t = new ArrayList(i10);
    }

    public n7(ArrayList<Object> arrayList) {
        this.f18028t = arrayList;
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof g6)) {
            return new String((byte[]) obj, i7.f17920a);
        }
        g6 g6Var = (g6) obj;
        return g6Var.g() == 0 ? "" : g6Var.k(i7.f17920a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        d();
        this.f18028t.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof o7) {
            collection = ((o7) collection).f();
        }
        boolean addAll = this.f18028t.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // s4.y5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // s4.o7
    public final o7 b() {
        return this.f18203s ? new e9(this) : this;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f18028t.clear();
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f18028t.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g6) {
            g6 g6Var = (g6) obj;
            String k10 = g6Var.g() == 0 ? "" : g6Var.k(i7.f17920a);
            if (g6Var.m()) {
                this.f18028t.set(i10, k10);
            }
            return k10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, i7.f17920a);
        if (k9.f17960a.f(bArr, 0, bArr.length)) {
            this.f18028t.set(i10, str);
        }
        return str;
    }

    @Override // s4.o7
    public final List<?> f() {
        return Collections.unmodifiableList(this.f18028t);
    }

    @Override // s4.h7
    public final /* bridge */ /* synthetic */ h7 j(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f18028t);
            return new n7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // s4.o7
    public final void r(g6 g6Var) {
        d();
        this.f18028t.add(g6Var);
        ((AbstractList) this).modCount++;
    }

    @Override // s4.y5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        Object remove = this.f18028t.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        d();
        return g(this.f18028t.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18028t.size();
    }

    @Override // s4.o7
    public final Object w(int i10) {
        return this.f18028t.get(i10);
    }
}
