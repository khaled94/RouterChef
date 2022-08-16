package m4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import m2.a;

/* loaded from: classes.dex */
public abstract class pw1<E> extends bw1<E> implements Set<E> {

    /* renamed from: u */
    public static final /* synthetic */ int f12646u = 0;
    @CheckForNull

    /* renamed from: t */
    public transient gw1<E> f12647t;

    public static int m(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            hu1.f(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static <E> pw1<E> p(int i10, Object... objArr) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 == 1) {
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                return new qx1(obj);
            }
            int m10 = m(i10);
            Object[] objArr2 = new Object[m10];
            int i11 = m10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object obj2 = objArr[i14];
                q40.a(obj2, i14);
                int hashCode = obj2.hashCode();
                int a10 = zv1.a(hashCode);
                while (true) {
                    int i15 = a10 & i11;
                    Object obj3 = objArr2[i15];
                    if (obj3 == null) {
                        objArr[i13] = obj2;
                        objArr2[i15] = obj2;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj3.equals(obj2)) {
                        break;
                    } else {
                        a10++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                return new qx1(obj4);
            } else if (m(i13) < m10 / 2) {
                return p(i13, objArr);
            } else {
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    z10 = true;
                }
                if (z10) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new mx1(objArr, i12, objArr2, i11, i13);
            }
        }
        return mx1.B;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof pw1) && (this instanceof mx1)) {
            pw1 pw1Var = (pw1) obj;
            Objects.requireNonNull(pw1Var);
            if ((pw1Var instanceof mx1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // m4.bw1
    public gw1<E> h() {
        gw1<E> gw1Var = this.f12647t;
        if (gw1Var == null) {
            gw1<E> o10 = o();
            this.f12647t = o10;
            return o10;
        }
        return gw1Var;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.r(this);
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public gw1<E> o() {
        Object[] array = toArray();
        pu1 pu1Var = gw1.f9058t;
        return gw1.p(array, array.length);
    }
}
