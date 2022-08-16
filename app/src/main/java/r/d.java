package r;

import l4.b;

/* loaded from: classes.dex */
public final class d<E> implements Cloneable {

    /* renamed from: w */
    public static final Object f17171w = new Object();

    /* renamed from: s */
    public boolean f17172s = false;

    /* renamed from: t */
    public long[] f17173t;

    /* renamed from: u */
    public Object[] f17174u;

    /* renamed from: v */
    public int f17175v;

    public d() {
        int g10 = b.g(10);
        this.f17173t = new long[g10];
        this.f17174u = new Object[g10];
    }

    public final void a(long j3, E e10) {
        int i10 = this.f17175v;
        if (i10 != 0 && j3 <= this.f17173t[i10 - 1]) {
            f(j3, e10);
            return;
        }
        if (this.f17172s && i10 >= this.f17173t.length) {
            d();
        }
        int i11 = this.f17175v;
        if (i11 >= this.f17173t.length) {
            int g10 = b.g(i11 + 1);
            long[] jArr = new long[g10];
            Object[] objArr = new Object[g10];
            long[] jArr2 = this.f17173t;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f17174u;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17173t = jArr;
            this.f17174u = objArr;
        }
        this.f17173t[i11] = j3;
        this.f17174u[i11] = e10;
        this.f17175v = i11 + 1;
    }

    public final void b() {
        int i10 = this.f17175v;
        Object[] objArr = this.f17174u;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f17175v = 0;
        this.f17172s = false;
    }

    /* renamed from: c */
    public final d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f17173t = (long[]) this.f17173t.clone();
            dVar.f17174u = (Object[]) this.f17174u.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f17175v;
        long[] jArr = this.f17173t;
        Object[] objArr = this.f17174u;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f17171w) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f17172s = false;
        this.f17175v = i11;
    }

    public final E e(long j3, E e10) {
        int d5 = b.d(this.f17173t, this.f17175v, j3);
        if (d5 >= 0) {
            Object[] objArr = this.f17174u;
            if (objArr[d5] != f17171w) {
                return (E) objArr[d5];
            }
        }
        return e10;
    }

    public final void f(long j3, E e10) {
        int d5 = b.d(this.f17173t, this.f17175v, j3);
        if (d5 >= 0) {
            this.f17174u[d5] = e10;
            return;
        }
        int i10 = ~d5;
        int i11 = this.f17175v;
        if (i10 < i11) {
            Object[] objArr = this.f17174u;
            if (objArr[i10] == f17171w) {
                this.f17173t[i10] = j3;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f17172s && i11 >= this.f17173t.length) {
            d();
            i10 = ~b.d(this.f17173t, this.f17175v, j3);
        }
        int i12 = this.f17175v;
        if (i12 >= this.f17173t.length) {
            int g10 = b.g(i12 + 1);
            long[] jArr = new long[g10];
            Object[] objArr2 = new Object[g10];
            long[] jArr2 = this.f17173t;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f17174u;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17173t = jArr;
            this.f17174u = objArr2;
        }
        int i13 = this.f17175v;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f17173t;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f17174u;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f17175v - i10);
        }
        this.f17173t[i10] = j3;
        this.f17174u[i10] = e10;
        this.f17175v++;
    }

    public final int g() {
        if (this.f17172s) {
            d();
        }
        return this.f17175v;
    }

    public final E h(int i10) {
        if (this.f17172s) {
            d();
        }
        return (E) this.f17174u[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17175v * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f17175v; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (this.f17172s) {
                d();
            }
            sb.append(this.f17173t[i10]);
            sb.append('=');
            E h10 = h(i10);
            if (h10 != this) {
                sb.append(h10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
