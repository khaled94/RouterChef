package m4;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class qx1<E> extends pw1<E> {

    /* renamed from: v */
    public final transient E f13016v;

    public qx1(E e10) {
        this.f13016v = e10;
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f13016v.equals(obj);
    }

    @Override // m4.bw1
    public final int d(Object[] objArr, int i10) {
        objArr[i10] = this.f13016v;
        return i10 + 1;
    }

    @Override // m4.pw1, m4.bw1
    public final gw1<E> h() {
        return gw1.s(this.f13016v);
    }

    @Override // m4.pw1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13016v.hashCode();
    }

    @Override // m4.bw1
    public final sx1<E> i() {
        return new qw1(this.f13016v);
    }

    @Override // m4.pw1, m4.bw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new qw1(this.f13016v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f13016v.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
