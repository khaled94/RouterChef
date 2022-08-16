package e8;

import androidx.activity.result.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    public static final Pattern B = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] C = new String[128];
    public static final String[] D;

    /* renamed from: s */
    public final Writer f4441s;

    /* renamed from: v */
    public String f4444v;

    /* renamed from: x */
    public boolean f4446x;
    public boolean y;

    /* renamed from: z */
    public String f4447z;

    /* renamed from: t */
    public int[] f4442t = new int[32];

    /* renamed from: u */
    public int f4443u = 0;

    /* renamed from: w */
    public String f4445w = ":";
    public boolean A = true;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            C[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        D = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        e0(6);
        Objects.requireNonNull(writer, "out == null");
        this.f4441s = writer;
    }

    public final c G(int i10, int i11, char c10) {
        int d02 = d0();
        if (d02 == i11 || d02 == i10) {
            if (this.f4447z != null) {
                StringBuilder c11 = a.c("Dangling name: ");
                c11.append(this.f4447z);
                throw new IllegalStateException(c11.toString());
            }
            this.f4443u--;
            if (d02 == i11) {
                Y();
            }
            this.f4441s.write(c10);
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public c H() {
        G(1, 2, ']');
        return this;
    }

    public c I() {
        G(3, 5, '}');
        return this;
    }

    public c L(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4447z == null) {
            if (this.f4443u == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            this.f4447z = str;
            return this;
        }
        throw new IllegalStateException();
    }

    public final void Y() {
        if (this.f4444v == null) {
            return;
        }
        this.f4441s.write(10);
        int i10 = this.f4443u;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f4441s.write(this.f4444v);
        }
    }

    public c Z() {
        if (this.f4447z != null) {
            if (!this.A) {
                this.f4447z = null;
                return this;
            }
            t0();
        }
        b();
        this.f4441s.write("null");
        return this;
    }

    public final void b() {
        int d02 = d0();
        if (d02 == 1) {
            m0(2);
        } else if (d02 != 2) {
            if (d02 == 4) {
                this.f4441s.append((CharSequence) this.f4445w);
                m0(5);
                return;
            }
            if (d02 != 6) {
                if (d02 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f4446x) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m0(7);
            return;
        } else {
            this.f4441s.append(',');
        }
        Y();
    }

    public c c() {
        t0();
        b();
        e0(1);
        this.f4441s.write(91);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4441s.close();
        int i10 = this.f4443u;
        if (i10 > 1 || (i10 == 1 && this.f4442t[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4443u = 0;
    }

    public final int d0() {
        int i10 = this.f4443u;
        if (i10 != 0) {
            return this.f4442t[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void e0(int i10) {
        int i11 = this.f4443u;
        int[] iArr = this.f4442t;
        if (i11 == iArr.length) {
            this.f4442t = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f4442t;
        int i12 = this.f4443u;
        this.f4443u = i12 + 1;
        iArr2[i12] = i10;
    }

    public void flush() {
        if (this.f4443u != 0) {
            this.f4441s.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c j() {
        t0();
        b();
        e0(3);
        this.f4441s.write(123);
        return this;
    }

    public final void m0(int i10) {
        this.f4442t[this.f4443u - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.y
            if (r0 == 0) goto L7
            java.lang.String[] r0 = e8.c.D
            goto L9
        L7:
            java.lang.String[] r0 = e8.c.C
        L9:
            java.io.Writer r1 = r8.f4441s
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f4441s
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f4441s
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f4441s
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f4441s
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.c.n0(java.lang.String):void");
    }

    public c o0(long j3) {
        t0();
        b();
        this.f4441s.write(Long.toString(j3));
        return this;
    }

    public c p0(Boolean bool) {
        if (bool == null) {
            return Z();
        }
        t0();
        b();
        this.f4441s.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c q0(Number number) {
        if (number == null) {
            return Z();
        }
        t0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !B.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f4446x) {
            throw new IllegalArgumentException(d7.a.c("Numeric values must be finite, but was ", obj));
        }
        b();
        this.f4441s.append((CharSequence) obj);
        return this;
    }

    public c r0(String str) {
        if (str == null) {
            return Z();
        }
        t0();
        b();
        n0(str);
        return this;
    }

    public c s0(boolean z10) {
        t0();
        b();
        this.f4441s.write(z10 ? "true" : "false");
        return this;
    }

    public final void t0() {
        if (this.f4447z != null) {
            int d02 = d0();
            if (d02 == 5) {
                this.f4441s.write(44);
            } else if (d02 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            Y();
            m0(4);
            n0(this.f4447z);
            this.f4447z = null;
        }
    }
}
