package m4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ow1<E> extends aw1<E> {
    @CheckForNull

    /* renamed from: d */
    public Object[] f12298d;

    /* renamed from: e */
    public int f12299e;

    public ow1(int i10) {
        super(i10);
        this.f12298d = new Object[pw1.m(i10)];
    }

    public final ow1<E> p(E e10) {
        Objects.requireNonNull(e10);
        if (this.f12298d != null) {
            int m10 = pw1.m(this.f6281b);
            int length = this.f12298d.length;
            if (m10 <= length) {
                int i10 = length - 1;
                int hashCode = e10.hashCode();
                int a10 = zv1.a(hashCode);
                while (true) {
                    int i11 = a10 & i10;
                    Object[] objArr = this.f12298d;
                    Object obj = objArr[i11];
                    if (obj != null) {
                        if (obj.equals(e10)) {
                            break;
                        }
                        a10 = i11 + 1;
                    } else {
                        objArr[i11] = e10;
                        this.f12299e += hashCode;
                        n(e10);
                        break;
                    }
                }
                return this;
            }
        }
        this.f12298d = null;
        n(e10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ow1<E> q(Iterable<? extends E> iterable) {
        if (this.f12298d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                p(it.next());
            }
        } else {
            o(iterable.size() + this.f6281b);
            if (!(iterable instanceof bw1)) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    p(it2.next());
                }
            } else {
                this.f6281b = ((bw1) iterable).d(this.f6280a, this.f6281b);
            }
        }
        return this;
    }

    public final pw1<E> r() {
        pw1<E> pw1Var;
        Object[] objArr;
        int i10 = this.f6281b;
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 == 1) {
                Object obj = this.f6280a[0];
                Objects.requireNonNull(obj);
                return new qx1(obj);
            }
            if (this.f12298d == null || pw1.m(i10) != this.f12298d.length) {
                pw1Var = pw1.p(this.f6281b, this.f6280a);
                this.f6281b = pw1Var.size();
            } else {
                int i11 = this.f6281b;
                Object[] objArr2 = this.f6280a;
                int length = objArr2.length;
                if (i11 < (length >> 1) + (length >> 2)) {
                    z10 = true;
                }
                if (z10) {
                    objArr2 = Arrays.copyOf(objArr2, i11);
                }
                pw1Var = new mx1<>(objArr2, this.f12299e, this.f12298d, objArr.length - 1, this.f6281b);
            }
            this.f6282c = true;
            this.f12298d = null;
            return pw1Var;
        }
        return mx1.B;
    }
}
