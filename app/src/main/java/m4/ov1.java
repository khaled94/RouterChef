package m4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ov1 extends AbstractSet<Map.Entry> {

    /* renamed from: s */
    public final /* synthetic */ tv1 f12296s;

    public ov1(tv1 tv1Var) {
        this.f12296s = tv1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12296s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map c10 = this.f12296s.c();
        if (c10 != null) {
            return c10.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int h10 = this.f12296s.h(entry.getKey());
            if (h10 != -1 && js.a(tv1.b(this.f12296s, h10), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        tv1 tv1Var = this.f12296s;
        Map c10 = tv1Var.c();
        return c10 != null ? c10.entrySet().iterator() : new mv1(tv1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        tv1 tv1Var;
        Map c10 = this.f12296s.c();
        if (c10 != null) {
            return c10.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f12296s.f()) {
            return false;
        }
        int g10 = this.f12296s.g();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = this.f12296s.f14180s;
        Objects.requireNonNull(obj2);
        int[] iArr = this.f12296s.f14181t;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.f12296s.f14182u;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.f12296s.f14183v;
        Objects.requireNonNull(objArr2);
        int b10 = ql.b(key, value, g10, obj2, iArr, objArr, objArr2);
        if (b10 == -1) {
            return false;
        }
        this.f12296s.e(b10, g10);
        tv1Var.f14185x--;
        this.f12296s.d();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12296s.size();
    }
}
