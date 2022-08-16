package m4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ba2 extends c82<String> implements RandomAccess, ca2 {

    /* renamed from: t */
    public final List<Object> f6433t;

    static {
        new ba2(10).f6742s = false;
    }

    public ba2() {
        this(10);
    }

    public ba2(int i10) {
        this.f6433t = new ArrayList(i10);
    }

    public ba2(ArrayList<Object> arrayList) {
        this.f6433t = arrayList;
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof n82)) {
            return new String((byte[]) obj, v92.f14624a);
        }
        n82 n82Var = (n82) obj;
        return n82Var.k() == 0 ? "" : n82Var.u(v92.f14624a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        d();
        this.f6433t.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof ca2) {
            collection = ((ca2) collection).f();
        }
        boolean addAll = this.f6433t.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // m4.c82, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // m4.ca2
    public final ca2 b() {
        return this.f6742s ? new ub2(this) : this;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f6433t.clear();
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f6433t.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof n82) {
            n82 n82Var = (n82) obj;
            String u10 = n82Var.k() == 0 ? "" : n82Var.u(v92.f14624a);
            if (n82Var.y()) {
                this.f6433t.set(i10, u10);
            }
            return u10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, v92.f14624a);
        boolean z10 = false;
        if (bc2.f6451a.a(0, bArr, 0, bArr.length) == 0) {
            z10 = true;
        }
        if (z10) {
            this.f6433t.set(i10, str);
        }
        return str;
    }

    @Override // m4.ca2
    public final List<?> f() {
        return Collections.unmodifiableList(this.f6433t);
    }

    @Override // m4.u92
    public final /* bridge */ /* synthetic */ u92 j(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f6433t);
            return new ba2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.ca2
    public final void n(n82 n82Var) {
        d();
        this.f6433t.add(n82Var);
        ((AbstractList) this).modCount++;
    }

    @Override // m4.c82, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        Object remove = this.f6433t.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        d();
        return g(this.f6433t.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6433t.size();
    }

    @Override // m4.ca2
    public final Object w(int i10) {
        return this.f6433t.get(i10);
    }
}
