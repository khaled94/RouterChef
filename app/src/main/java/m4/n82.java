package m4;

import androidx.activity.k;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import l0.d;

/* loaded from: classes.dex */
public abstract class n82 implements Iterable<Byte>, Serializable {

    /* renamed from: t */
    public static final l82 f11571t = new l82(v92.f14625b);

    /* renamed from: s */
    public int f11572s = 0;

    static {
        int i10 = d82.f7261a;
    }

    public static n82 B(Iterable<n82> iterable) {
        int i10;
        if (!(iterable instanceof Collection)) {
            Iterator it = ((ArrayList) iterable).iterator();
            i10 = 0;
            while (it.hasNext()) {
                it.next();
                i10++;
            }
        } else {
            i10 = ((ArrayList) iterable).size();
        }
        return i10 == 0 ? f11571t : i(((ArrayList) iterable).iterator(), i10);
    }

    public static n82 C(byte[] bArr) {
        return D(bArr, 0, bArr.length);
    }

    public static n82 D(byte[] bArr, int i10, int i11) {
        z(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new l82(bArr2);
    }

    public static n82 E(String str) {
        return new l82(str.getBytes(v92.f14624a));
    }

    public static n82 F(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i10 = 256;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            n82 D = i11 == 0 ? null : D(bArr, 0, i11);
            if (D == null) {
                return B(arrayList);
            }
            arrayList.add(D);
            i10 = Math.min(i10 + i10, 8192);
        }
    }

    public static void d(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(k.a(22, "Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(d.a(40, "Index > length: ", i10, ", ", i11));
        }
    }

    public static n82 i(Iterator<n82> it, int i10) {
        db2 db2Var;
        if (i10 > 0) {
            if (i10 == 1) {
                return it.next();
            }
            int i11 = i10 >>> 1;
            n82 i12 = i(it, i11);
            n82 i13 = i(it, i10 - i11);
            if (Integer.MAX_VALUE - i12.k() >= i13.k()) {
                if (i13.k() == 0) {
                    return i12;
                }
                if (i12.k() == 0) {
                    return i13;
                }
                int k10 = i13.k() + i12.k();
                if (k10 < 128) {
                    return db2.G(i12, i13);
                }
                if (i12 instanceof db2) {
                    db2 db2Var2 = (db2) i12;
                    if (i13.k() + db2Var2.f7289w.k() < 128) {
                        db2Var = new db2(db2Var2.f7288v, db2.G(db2Var2.f7289w, i13));
                        return db2Var;
                    } else if (db2Var2.f7288v.m() > db2Var2.f7289w.m() && db2Var2.y > i13.m()) {
                        return new db2(db2Var2.f7288v, new db2(db2Var2.f7289w, i13));
                    }
                }
                if (k10 >= db2.H(Math.max(i12.m(), i13.m()) + 1)) {
                    db2Var = new db2(i12, i13);
                    return db2Var;
                }
                fk0 fk0Var = new fk0();
                fk0Var.d(i12);
                fk0Var.d(i13);
                n82 n82Var = (n82) ((ArrayDeque) fk0Var.f8585t).pop();
                while (!((ArrayDeque) fk0Var.f8585t).isEmpty()) {
                    n82Var = new db2((n82) ((ArrayDeque) fk0Var.f8585t).pop(), n82Var);
                }
                return n82Var;
            }
            throw new IllegalArgumentException(d.a(53, "ByteString would be too long: ", i12.k(), "+", i13.k()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    public static int z(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(d.a(66, "Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(d.a(37, "End index: ", i11, " >= ", i12));
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i10);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return i13;
    }

    /* renamed from: A */
    public i82 iterator() {
        return new h82(this);
    }

    public final byte[] e() {
        int k10 = k();
        if (k10 == 0) {
            return v92.f14625b;
        }
        byte[] bArr = new byte[k10];
        l(bArr, 0, 0, k10);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public abstract byte h(int i10);

    public final int hashCode() {
        int i10 = this.f11572s;
        if (i10 == 0) {
            int k10 = k();
            i10 = p(k10, 0, k10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f11572s = i10;
        }
        return i10;
    }

    public abstract int k();

    public abstract void l(byte[] bArr, int i10, int i11, int i12);

    public abstract int m();

    public abstract boolean o();

    public abstract int p(int i10, int i11, int i12);

    public abstract int q(int i10, int i11, int i12);

    public abstract n82 s(int i10, int i11);

    public abstract r82 t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(k());
        objArr[2] = k() <= 50 ? wo2.a(this) : wo2.a(s(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract String u(Charset charset);

    public abstract ByteBuffer v();

    public abstract void x(wo2 wo2Var);

    public abstract boolean y();
}
