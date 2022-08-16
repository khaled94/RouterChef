package r;

import l4.b;

/* loaded from: classes.dex */
public final class h<E> implements Cloneable {

    /* renamed from: v */
    public static final Object f17202v = new Object();

    /* renamed from: s */
    public int[] f17203s;

    /* renamed from: t */
    public Object[] f17204t;

    /* renamed from: u */
    public int f17205u;

    public h() {
        int f10 = b.f(10);
        this.f17203s = new int[f10];
        this.f17204t = new Object[f10];
    }

    public final void a(int i10, E e10) {
        int i11 = this.f17205u;
        if (i11 != 0 && i10 <= this.f17203s[i11 - 1]) {
            e(i10, e10);
            return;
        }
        if (i11 >= this.f17203s.length) {
            int f10 = b.f(i11 + 1);
            int[] iArr = new int[f10];
            Object[] objArr = new Object[f10];
            int[] iArr2 = this.f17203s;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f17204t;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17203s = iArr;
            this.f17204t = objArr;
        }
        this.f17203s[i11] = i10;
        this.f17204t[i11] = e10;
        this.f17205u = i11 + 1;
    }

    /* renamed from: b */
    public final h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f17203s = (int[]) this.f17203s.clone();
            hVar.f17204t = (Object[]) this.f17204t.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final E c(int i10, E e10) {
        int b10 = b.b(this.f17203s, this.f17205u, i10);
        if (b10 >= 0) {
            Object[] objArr = this.f17204t;
            if (objArr[b10] != f17202v) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public final int d(int i10) {
        return this.f17203s[i10];
    }

    public final void e(int i10, E e10) {
        int b10 = b.b(this.f17203s, this.f17205u, i10);
        if (b10 >= 0) {
            this.f17204t[b10] = e10;
            return;
        }
        int i11 = ~b10;
        int i12 = this.f17205u;
        if (i11 < i12) {
            Object[] objArr = this.f17204t;
            if (objArr[i11] == f17202v) {
                this.f17203s[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (i12 >= this.f17203s.length) {
            int f10 = b.f(i12 + 1);
            int[] iArr = new int[f10];
            Object[] objArr2 = new Object[f10];
            int[] iArr2 = this.f17203s;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f17204t;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17203s = iArr;
            this.f17204t = objArr2;
        }
        int i13 = this.f17205u - i11;
        if (i13 != 0) {
            int[] iArr3 = this.f17203s;
            int i14 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i14, i13);
            Object[] objArr4 = this.f17204t;
            System.arraycopy(objArr4, i11, objArr4, i14, this.f17205u - i11);
        }
        this.f17203s[i11] = i10;
        this.f17204t[i11] = e10;
        this.f17205u++;
    }

    public final int f() {
        return this.f17205u;
    }

    public final E g(int i10) {
        return (E) this.f17204t[i10];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17205u * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f17205u; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(d(i10));
            sb.append('=');
            E g10 = g(i10);
            if (g10 != this) {
                sb.append(g10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
