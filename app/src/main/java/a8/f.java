package a8;

import e8.b;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import x7.j;
import x7.n;
import x7.o;
import x7.q;
import z7.l;

/* loaded from: classes.dex */
public final class f extends e8.a {
    public static final Object L = new Object();
    public Object[] H;
    public int I;
    public String[] J;
    public int[] K;

    /* loaded from: classes.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    private String Y(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.I;
            if (i10 < i11) {
                Object[] objArr = this.H;
                if (objArr[i10] instanceof j) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        int i12 = this.K[i10];
                        if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                            i12--;
                        }
                        sb.append('[');
                        sb.append(i12);
                        sb.append(']');
                    }
                } else if ((objArr[i10] instanceof o) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb.append('.');
                    String[] strArr = this.J;
                    if (strArr[i10] != null) {
                        sb.append(strArr[i10]);
                    }
                }
                i10++;
            } else {
                return sb.toString();
            }
        }
    }

    private String m0() {
        StringBuilder c10 = androidx.activity.result.a.c(" at path ");
        c10.append(Y(false));
        return c10.toString();
    }

    @Override // e8.a
    public final String A() {
        return Y(false);
    }

    @Override // e8.a
    public final void C0() {
        if (x0() == 5) {
            r0();
            this.J[this.I - 2] = "null";
        } else {
            G0();
            int i10 = this.I;
            if (i10 > 0) {
                this.J[i10 - 1] = "null";
            }
        }
        int i11 = this.I;
        if (i11 > 0) {
            int[] iArr = this.K;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    public final void E0(int i10) {
        if (x0() == i10) {
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("Expected ");
        c10.append(b.a(i10));
        c10.append(" but was ");
        c10.append(b.a(x0()));
        c10.append(m0());
        throw new IllegalStateException(c10.toString());
    }

    public final Object F0() {
        return this.H[this.I - 1];
    }

    public final Object G0() {
        Object[] objArr = this.H;
        int i10 = this.I - 1;
        this.I = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // e8.a
    public final void H() {
        E0(2);
        G0();
        G0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void H0(Object obj) {
        int i10 = this.I;
        Object[] objArr = this.H;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.H = Arrays.copyOf(objArr, i11);
            this.K = Arrays.copyOf(this.K, i11);
            this.J = (String[]) Arrays.copyOf(this.J, i11);
        }
        Object[] objArr2 = this.H;
        int i12 = this.I;
        this.I = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // e8.a
    public final void I() {
        E0(4);
        G0();
        G0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // e8.a
    public final String Z() {
        return Y(true);
    }

    @Override // e8.a
    public final void b() {
        E0(1);
        H0(((j) F0()).iterator());
        this.K[this.I - 1] = 0;
    }

    @Override // e8.a
    public final void c() {
        E0(3);
        H0(new l.b.a((l.b) ((o) F0()).f20088a.entrySet()));
    }

    @Override // e8.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.H = new Object[]{L};
        this.I = 1;
    }

    @Override // e8.a
    public final boolean d0() {
        int x0 = x0();
        return (x0 == 4 || x0 == 2 || x0 == 10) ? false : true;
    }

    @Override // e8.a
    public final boolean n0() {
        E0(8);
        boolean e10 = ((q) G0()).e();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return e10;
    }

    @Override // e8.a
    public final double o0() {
        int x0 = x0();
        if (x0 != 7 && x0 != 6) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected ");
            c10.append(b.a(7));
            c10.append(" but was ");
            c10.append(b.a(x0));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        q qVar = (q) F0();
        double doubleValue = qVar.f20089a instanceof Number ? qVar.g().doubleValue() : Double.parseDouble(qVar.h());
        if (!this.f4435t && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        G0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return doubleValue;
    }

    @Override // e8.a
    public final int p0() {
        int x0 = x0();
        if (x0 != 7 && x0 != 6) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected ");
            c10.append(b.a(7));
            c10.append(" but was ");
            c10.append(b.a(x0));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        q qVar = (q) F0();
        int intValue = qVar.f20089a instanceof Number ? qVar.g().intValue() : Integer.parseInt(qVar.h());
        G0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return intValue;
    }

    @Override // e8.a
    public final long q0() {
        int x0 = x0();
        if (x0 != 7 && x0 != 6) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected ");
            c10.append(b.a(7));
            c10.append(" but was ");
            c10.append(b.a(x0));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        q qVar = (q) F0();
        long longValue = qVar.f20089a instanceof Number ? qVar.g().longValue() : Long.parseLong(qVar.h());
        G0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return longValue;
    }

    @Override // e8.a
    public final String r0() {
        E0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) F0()).next();
        String str = (String) entry.getKey();
        this.J[this.I - 1] = str;
        H0(entry.getValue());
        return str;
    }

    @Override // e8.a
    public final void t0() {
        E0(9);
        G0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // e8.a
    public final String toString() {
        return f.class.getSimpleName() + m0();
    }

    @Override // e8.a
    public final String v0() {
        int x0 = x0();
        if (x0 != 6 && x0 != 7) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected ");
            c10.append(b.a(6));
            c10.append(" but was ");
            c10.append(b.a(x0));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        String h10 = ((q) G0()).h();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return h10;
    }

    @Override // e8.a
    public final int x0() {
        if (this.I == 0) {
            return 10;
        }
        Object F0 = F0();
        if (F0 instanceof Iterator) {
            boolean z10 = this.H[this.I - 2] instanceof o;
            Iterator it = (Iterator) F0;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            } else if (z10) {
                return 5;
            } else {
                H0(it.next());
                return x0();
            }
        } else if (F0 instanceof o) {
            return 3;
        } else {
            if (F0 instanceof j) {
                return 1;
            }
            if (!(F0 instanceof q)) {
                if (F0 instanceof n) {
                    return 9;
                }
                if (F0 != L) {
                    throw new AssertionError();
                }
                throw new IllegalStateException("JsonReader is closed");
            }
            Serializable serializable = ((q) F0).f20089a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (!(serializable instanceof Number)) {
                throw new AssertionError();
            }
            return 7;
        }
    }
}
