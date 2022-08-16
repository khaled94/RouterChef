package s4;

import c1.f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import l0.d;
import m4.g7;

/* loaded from: classes.dex */
public abstract class g6 implements Iterable<Byte>, Serializable {

    /* renamed from: t */
    public static final f6 f17877t = new f6(i7.f17921b);

    /* renamed from: s */
    public int f17878s = 0;

    static {
        int i10 = z5.f18216a;
    }

    public static int o(int i10, int i11, int i12) {
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

    public static g6 p(byte[] bArr, int i10, int i11) {
        o(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new f6(bArr2);
    }

    public abstract byte d(int i10);

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract int h(int i10, int i11);

    public final int hashCode() {
        int i10 = this.f17878s;
        if (i10 == 0) {
            int g10 = g();
            i10 = h(g10, g10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f17878s = i10;
        }
        return i10;
    }

    public abstract g6 i();

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new c6(this);
    }

    public abstract String k(Charset charset);

    public abstract void l(g7 g7Var);

    public abstract boolean m();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(g());
        objArr[2] = g() <= 50 ? f.d(this) : String.valueOf(f.d(i())).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
