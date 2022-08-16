package n9;

import e9.f;
import java.lang.Comparable;
import java.util.Arrays;
import n9.v;

/* loaded from: classes.dex */
public class u<T extends v & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f16724a;

    public final void a(T t10) {
        t10.f(this);
        T[] tArr = this.f16724a;
        if (tArr == null) {
            tArr = (T[]) new v[4];
            this.f16724a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            f.d(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((v[]) copyOf);
            this.f16724a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = t10;
        t10.b(i10);
        f(i10);
    }

    public final T b() {
        T[] tArr = this.f16724a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final T d(int i10) {
        T[] tArr = this.f16724a;
        f.c(tArr);
        this._size--;
        if (i10 < this._size) {
            g(i10, this._size);
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                f.c(t10);
                T t11 = tArr[i11];
                f.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    g(i10, i11);
                    f(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f16724a;
                f.c(tArr2);
                int i13 = i12 + 1;
                if (i13 < this._size) {
                    T t12 = tArr2[i13];
                    f.c(t12);
                    T t13 = tArr2[i12];
                    f.c(t13);
                    if (((Comparable) t12).compareTo(t13) < 0) {
                        i12 = i13;
                    }
                }
                T t14 = tArr2[i10];
                f.c(t14);
                T t15 = tArr2[i12];
                f.c(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                g(i10, i12);
                i10 = i12;
            }
        }
        T t16 = tArr[this._size];
        f.c(t16);
        t16.f(null);
        t16.b(-1);
        tArr[this._size] = null;
        return t16;
    }

    public final T e() {
        T d5;
        synchronized (this) {
            d5 = this._size > 0 ? d(0) : null;
        }
        return d5;
    }

    public final void f(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f16724a;
            f.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            f.c(t10);
            T t11 = tArr[i10];
            f.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            g(i10, i11);
            i10 = i11;
        }
    }

    public final void g(int i10, int i11) {
        T[] tArr = this.f16724a;
        f.c(tArr);
        T t10 = tArr[i11];
        f.c(t10);
        T t11 = tArr[i10];
        f.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.b(i10);
        t11.b(i11);
    }
}
