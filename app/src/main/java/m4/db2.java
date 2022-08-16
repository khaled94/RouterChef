package m4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class db2 extends n82 {

    /* renamed from: z */
    public static final int[] f7286z = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: u */
    public final int f7287u;

    /* renamed from: v */
    public final n82 f7288v;

    /* renamed from: w */
    public final n82 f7289w;

    /* renamed from: x */
    public final int f7290x;
    public final int y;

    public db2(n82 n82Var, n82 n82Var2) {
        this.f7288v = n82Var;
        this.f7289w = n82Var2;
        int k10 = n82Var.k();
        this.f7290x = k10;
        this.f7287u = n82Var2.k() + k10;
        this.y = Math.max(n82Var.m(), n82Var2.m()) + 1;
    }

    public static n82 G(n82 n82Var, n82 n82Var2) {
        int k10 = n82Var.k();
        int k11 = n82Var2.k();
        int i10 = k10 + k11;
        byte[] bArr = new byte[i10];
        n82.z(0, k10, n82Var.k());
        n82.z(0, k10 + 0, i10);
        if (k10 > 0) {
            n82Var.l(bArr, 0, 0, k10);
        }
        n82.z(0, k11, n82Var2.k());
        n82.z(k10, i10, i10);
        if (k11 > 0) {
            n82Var2.l(bArr, 0, k10, k11);
        }
        return new l82(bArr);
    }

    public static int H(int i10) {
        int[] iArr = f7286z;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // m4.n82
    public final i82 A() {
        return new bb2(this);
    }

    @Override // m4.n82
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n82)) {
            return false;
        }
        n82 n82Var = (n82) obj;
        if (this.f7287u != n82Var.k()) {
            return false;
        }
        if (this.f7287u == 0) {
            return true;
        }
        int i10 = this.f11572s;
        int i11 = n82Var.f11572s;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        cb2 cb2Var = new cb2(this);
        k82 next = cb2Var.next();
        cb2 cb2Var2 = new cb2(n82Var);
        k82 next2 = cb2Var2.next();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int k10 = next.k() - i12;
            int k11 = next2.k() - i13;
            int min = Math.min(k10, k11);
            if (!(i12 == 0 ? next.G(next2, i13, min) : next2.G(next, i12, min))) {
                return false;
            }
            i14 += min;
            int i15 = this.f7287u;
            if (i14 >= i15) {
                if (i14 != i15) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if (min == k10) {
                next = cb2Var.next();
                i12 = 0;
            } else {
                i12 += min;
            }
            if (min == k11) {
                next2 = cb2Var2.next();
                i13 = 0;
            } else {
                i13 += min;
            }
        }
    }

    @Override // m4.n82
    public final byte g(int i10) {
        n82.d(i10, this.f7287u);
        return h(i10);
    }

    @Override // m4.n82
    public final byte h(int i10) {
        int i11 = this.f7290x;
        return i10 < i11 ? this.f7288v.h(i10) : this.f7289w.h(i10 - i11);
    }

    @Override // m4.n82, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new bb2(this);
    }

    @Override // m4.n82
    public final int k() {
        return this.f7287u;
    }

    @Override // m4.n82
    public final void l(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.f7290x;
        if (i10 + i12 <= i13) {
            this.f7288v.l(bArr, i10, i11, i12);
        } else if (i10 >= i13) {
            this.f7289w.l(bArr, i10 - i13, i11, i12);
        } else {
            int i14 = i13 - i10;
            this.f7288v.l(bArr, i10, i11, i14);
            this.f7289w.l(bArr, 0, i11 + i14, i12 - i14);
        }
    }

    @Override // m4.n82
    public final int m() {
        return this.y;
    }

    @Override // m4.n82
    public final boolean o() {
        return this.f7287u >= H(this.y);
    }

    @Override // m4.n82
    public final int p(int i10, int i11, int i12) {
        int i13 = this.f7290x;
        if (i11 + i12 <= i13) {
            return this.f7288v.p(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.f7289w.p(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.f7289w.p(this.f7288v.p(i10, i11, i14), 0, i12 - i14);
    }

    @Override // m4.n82
    public final int q(int i10, int i11, int i12) {
        int i13 = this.f7290x;
        if (i11 + i12 <= i13) {
            return this.f7288v.q(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.f7289w.q(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.f7289w.q(this.f7288v.q(i10, i11, i14), 0, i12 - i14);
    }

    @Override // m4.n82
    public final n82 s(int i10, int i11) {
        int z10 = n82.z(i10, i11, this.f7287u);
        if (z10 == 0) {
            return n82.f11571t;
        }
        if (z10 == this.f7287u) {
            return this;
        }
        int i12 = this.f7290x;
        if (i11 <= i12) {
            return this.f7288v.s(i10, i11);
        }
        if (i10 >= i12) {
            return this.f7289w.s(i10 - i12, i11 - i12);
        }
        n82 n82Var = this.f7288v;
        return new db2(n82Var.s(i10, n82Var.k()), this.f7289w.s(0, i11 - this.f7290x));
    }

    @Override // m4.n82
    public final r82 t() {
        k82 k82Var;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.y);
        arrayDeque.push(this);
        n82 n82Var = this.f7288v;
        while (n82Var instanceof db2) {
            db2 db2Var = (db2) n82Var;
            arrayDeque.push(db2Var);
            n82Var = db2Var.f7288v;
        }
        k82 k82Var2 = (k82) n82Var;
        while (true) {
            boolean z11 = false;
            if (!(k82Var2 != null)) {
                Iterator it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    i10 += byteBuffer.remaining();
                    z11 = byteBuffer.hasArray() ? z11 | true : byteBuffer.isDirect() ? z11 | true : z11 | true;
                }
                return z11 ? new p82(arrayList, i10) : new q82(new y92(arrayList));
            } else if (k82Var2 != null) {
                while (true) {
                    if (!arrayDeque.isEmpty()) {
                        n82 n82Var2 = ((db2) arrayDeque.pop()).f7289w;
                        while (n82Var2 instanceof db2) {
                            db2 db2Var2 = (db2) n82Var2;
                            arrayDeque.push(db2Var2);
                            n82Var2 = db2Var2.f7288v;
                        }
                        k82Var = (k82) n82Var2;
                        if (k82Var.k() == 0) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
                            break;
                        }
                    } else {
                        k82Var = null;
                        break;
                    }
                }
                arrayList.add(k82Var2.v());
                k82Var2 = k82Var;
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    @Override // m4.n82
    public final String u(Charset charset) {
        return new String(e(), charset);
    }

    @Override // m4.n82
    public final void x(wo2 wo2Var) {
        this.f7288v.x(wo2Var);
        this.f7289w.x(wo2Var);
    }

    @Override // m4.n82
    public final boolean y() {
        int q10 = this.f7288v.q(0, 0, this.f7290x);
        n82 n82Var = this.f7289w;
        return n82Var.q(q10, 0, n82Var.k()) == 0;
    }
}
