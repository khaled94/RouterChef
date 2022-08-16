package e8;

import a8.f;
import androidx.activity.result.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import x7.q;

/* loaded from: classes.dex */
public class a implements Closeable {
    public long A;
    public int B;
    public String C;
    public int[] D;

    /* renamed from: s */
    public final Reader f4434s;

    /* renamed from: t */
    public boolean f4435t = false;

    /* renamed from: u */
    public final char[] f4436u = new char[1024];

    /* renamed from: v */
    public int f4437v = 0;

    /* renamed from: w */
    public int f4438w = 0;

    /* renamed from: x */
    public int f4439x = 0;
    public int y = 0;

    /* renamed from: z */
    public int f4440z = 0;
    public int E = 1;
    public String[] F = new String[32];
    public int[] G = new int[32];

    /* renamed from: e8.a$a */
    /* loaded from: classes.dex */
    public class C0066a extends d {
        public final void h(a aVar) {
            int i10;
            if (aVar instanceof f) {
                f fVar = (f) aVar;
                fVar.E0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) fVar.F0()).next();
                fVar.H0(entry.getValue());
                fVar.H0(new q((String) entry.getKey()));
                return;
            }
            int i11 = aVar.f4440z;
            if (i11 == 0) {
                i11 = aVar.G();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 != 14) {
                StringBuilder c10 = androidx.activity.result.a.c("Expected a name but was ");
                c10.append(b.a(aVar.x0()));
                c10.append(aVar.m0());
                throw new IllegalStateException(c10.toString());
            } else {
                i10 = 10;
            }
            aVar.f4440z = i10;
        }
    }

    static {
        d.f428a = new C0066a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.D = iArr;
        iArr[0] = 6;
        this.f4434s = reader;
    }

    public String A() {
        return Y(false);
    }

    public final void A0(char c10) {
        char[] cArr = this.f4436u;
        while (true) {
            int i10 = this.f4437v;
            int i11 = this.f4438w;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f4437v = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.f4437v = i12;
                        z0();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f4439x++;
                            this.y = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f4437v = i10;
                    if (!L(1)) {
                        D0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void B0() {
        char c10;
        do {
            if (this.f4437v >= this.f4438w && !L(1)) {
                return;
            }
            char[] cArr = this.f4436u;
            int i10 = this.f4437v;
            int i11 = i10 + 1;
            this.f4437v = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f4439x++;
                this.y = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public void C0() {
        char c10;
        int i10 = 0;
        do {
            int i11 = this.f4440z;
            if (i11 == 0) {
                i11 = G();
            }
            if (i11 == 3) {
                y0(1);
            } else if (i11 == 1) {
                y0(3);
            } else {
                if (i11 == 4 || i11 == 2) {
                    this.E--;
                    i10--;
                } else if (i11 == 14 || i11 == 10) {
                    do {
                        int i12 = 0;
                        while (true) {
                            int i13 = this.f4437v + i12;
                            if (i13 < this.f4438w) {
                                char c11 = this.f4436u[i13];
                                if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                                    if (c11 != '#') {
                                        if (c11 != ',') {
                                            if (c11 != '/' && c11 != '=') {
                                                if (c11 != '{' && c11 != '}' && c11 != ':') {
                                                    if (c11 != ';') {
                                                        switch (c11) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i12++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f4437v = i13;
                            }
                        }
                        j();
                        this.f4437v += i12;
                    } while (L(1));
                } else {
                    if (i11 == 8 || i11 == 12) {
                        c10 = '\'';
                    } else if (i11 == 9 || i11 == 13) {
                        c10 = '\"';
                    } else if (i11 == 16) {
                        this.f4437v += this.B;
                    }
                    A0(c10);
                }
                this.f4440z = 0;
            }
            i10++;
            this.f4440z = 0;
        } while (i10 != 0);
        int[] iArr = this.G;
        int i14 = this.E;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.F[i14 - 1] = "null";
    }

    public final IOException D0(String str) {
        StringBuilder c10 = androidx.activity.result.a.c(str);
        c10.append(m0());
        throw new d(c10.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a1, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0213, code lost:
        if (e0(r1) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0216, code lost:
        if (r9 != 2) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0218, code lost:
        if (r10 == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x021e, code lost:
        if (r11 != Long.MIN_VALUE) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0220, code lost:
        if (r16 == 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0224, code lost:
        if (r11 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0226, code lost:
        if (r16 != 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0228, code lost:
        if (r16 == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x022b, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x022c, code lost:
        r20.A = r11;
        r20.f4437v += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0236, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0237, code lost:
        if (r9 == r1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x023a, code lost:
        if (r9 == 4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x023d, code lost:
        if (r9 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x023f, code lost:
        r20.B = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0243, code lost:
        r13 = r1;
        r20.f4440z = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int G() {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.a.G():int");
    }

    public void H() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 != 4) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected END_ARRAY but was ");
            c10.append(b.a(x0()));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        int i11 = this.E - 1;
        this.E = i11;
        int[] iArr = this.G;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f4440z = 0;
    }

    public void I() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 != 2) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected END_OBJECT but was ");
            c10.append(b.a(x0()));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        int i11 = this.E - 1;
        this.E = i11;
        this.F[i11] = null;
        int[] iArr = this.G;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f4440z = 0;
    }

    public final boolean L(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f4436u;
        int i13 = this.y;
        int i14 = this.f4437v;
        this.y = i13 - i14;
        int i15 = this.f4438w;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f4438w = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f4438w = 0;
        }
        this.f4437v = 0;
        do {
            Reader reader = this.f4434s;
            int i17 = this.f4438w;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f4438w + read;
            this.f4438w = i11;
            if (this.f4439x == 0 && (i12 = this.y) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f4437v++;
                this.y = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public final String Y(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.E;
            if (i10 < i11) {
                int i12 = this.D[i10];
                if (i12 == 1 || i12 == 2) {
                    int i13 = this.G[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb.append('[');
                    sb.append(i13);
                    sb.append(']');
                } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb.append('.');
                    String[] strArr = this.F;
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

    public String Z() {
        return Y(true);
    }

    public void b() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 3) {
            y0(1);
            this.G[this.E - 1] = 0;
            this.f4440z = 0;
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("Expected BEGIN_ARRAY but was ");
        c10.append(b.a(x0()));
        c10.append(m0());
        throw new IllegalStateException(c10.toString());
    }

    public void c() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 1) {
            y0(3);
            this.f4440z = 0;
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("Expected BEGIN_OBJECT but was ");
        c10.append(b.a(x0()));
        c10.append(m0());
        throw new IllegalStateException(c10.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4440z = 0;
        this.D[0] = 8;
        this.E = 1;
        this.f4434s.close();
    }

    public boolean d0() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public final boolean e0(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    public final void j() {
        if (this.f4435t) {
            return;
        }
        D0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String m0() {
        return " at line " + (this.f4439x + 1) + " column " + ((this.f4437v - this.y) + 1) + " path " + A();
    }

    public boolean n0() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 5) {
            this.f4440z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 != 6) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected a boolean but was ");
            c10.append(b.a(x0()));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        } else {
            this.f4440z = 0;
            int[] iArr2 = this.G;
            int i12 = this.E - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
    }

    public double o0() {
        String str;
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 15) {
            this.f4440z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.A;
        }
        if (i10 == 16) {
            this.C = new String(this.f4436u, this.f4437v, this.B);
            this.f4437v += this.B;
        } else {
            if (i10 == 8 || i10 == 9) {
                str = u0(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                str = w0();
            } else if (i10 != 11) {
                StringBuilder c10 = androidx.activity.result.a.c("Expected a double but was ");
                c10.append(b.a(x0()));
                c10.append(m0());
                throw new IllegalStateException(c10.toString());
            }
            this.C = str;
        }
        this.f4440z = 11;
        double parseDouble = Double.parseDouble(this.C);
        if (!this.f4435t && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + m0());
        }
        this.C = null;
        this.f4440z = 0;
        int[] iArr2 = this.G;
        int i12 = this.E - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int p0() {
        String str;
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 15) {
            long j3 = this.A;
            int i11 = (int) j3;
            if (j3 != i11) {
                StringBuilder c10 = androidx.activity.result.a.c("Expected an int but was ");
                c10.append(this.A);
                c10.append(m0());
                throw new NumberFormatException(c10.toString());
            }
            this.f4440z = 0;
            int[] iArr = this.G;
            int i12 = this.E - 1;
            iArr[i12] = iArr[i12] + 1;
            return i11;
        }
        if (i10 == 16) {
            this.C = new String(this.f4436u, this.f4437v, this.B);
            this.f4437v += this.B;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            StringBuilder c11 = androidx.activity.result.a.c("Expected an int but was ");
            c11.append(b.a(x0()));
            c11.append(m0());
            throw new IllegalStateException(c11.toString());
        } else {
            if (i10 == 10) {
                str = w0();
            } else {
                str = u0(i10 == 8 ? '\'' : '\"');
            }
            this.C = str;
            try {
                int parseInt = Integer.parseInt(this.C);
                this.f4440z = 0;
                int[] iArr2 = this.G;
                int i13 = this.E - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4440z = 11;
        double parseDouble = Double.parseDouble(this.C);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            StringBuilder c12 = androidx.activity.result.a.c("Expected an int but was ");
            c12.append(this.C);
            c12.append(m0());
            throw new NumberFormatException(c12.toString());
        }
        this.C = null;
        this.f4440z = 0;
        int[] iArr3 = this.G;
        int i15 = this.E - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long q0() {
        String str;
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 15) {
            this.f4440z = 0;
            int[] iArr = this.G;
            int i11 = this.E - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.A;
        }
        if (i10 == 16) {
            this.C = new String(this.f4436u, this.f4437v, this.B);
            this.f4437v += this.B;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected a long but was ");
            c10.append(b.a(x0()));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        } else {
            if (i10 == 10) {
                str = w0();
            } else {
                str = u0(i10 == 8 ? '\'' : '\"');
            }
            this.C = str;
            try {
                long parseLong = Long.parseLong(this.C);
                this.f4440z = 0;
                int[] iArr2 = this.G;
                int i12 = this.E - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4440z = 11;
        double parseDouble = Double.parseDouble(this.C);
        long j3 = (long) parseDouble;
        if (j3 != parseDouble) {
            StringBuilder c11 = androidx.activity.result.a.c("Expected a long but was ");
            c11.append(this.C);
            c11.append(m0());
            throw new NumberFormatException(c11.toString());
        }
        this.C = null;
        this.f4440z = 0;
        int[] iArr3 = this.G;
        int i13 = this.E - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j3;
    }

    public String r0() {
        String str;
        char c10;
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 14) {
            str = w0();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 != 13) {
                StringBuilder c11 = androidx.activity.result.a.c("Expected a name but was ");
                c11.append(b.a(x0()));
                c11.append(m0());
                throw new IllegalStateException(c11.toString());
            } else {
                c10 = '\"';
            }
            str = u0(c10);
        }
        this.f4440z = 0;
        this.F[this.E - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r1 != '/') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        r9.f4437v = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r4 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        r9.f4437v = r4 - 1;
        r2 = L(2);
        r9.f4437v++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        j();
        r2 = r9.f4437v;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r4 == '*') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r4 == '/') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        r9.f4437v = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        r9.f4437v = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        if ((r9.f4437v + 2) <= r9.f4438w) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (L(2) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
        r1 = r9.f4436u;
        r2 = r9.f4437v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        if (r1[r2] != '\n') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
        r9.f4439x++;
        r9.y = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if (r4 >= 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
        if (r9.f4436u[r9.f4437v + r4] == "*\/".charAt(r4)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r9.f4437v++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (r3 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
        D0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
        r9.f4437v = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r1 != '#') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s0(boolean r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.a.s0(boolean):int");
    }

    public void t0() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 != 7) {
            StringBuilder c10 = androidx.activity.result.a.c("Expected null but was ");
            c10.append(b.a(x0()));
            c10.append(m0());
            throw new IllegalStateException(c10.toString());
        }
        this.f4440z = 0;
        int[] iArr = this.G;
        int i11 = this.E - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + m0();
    }

    public final String u0(char c10) {
        char[] cArr = this.f4436u;
        StringBuilder sb = null;
        while (true) {
            int i10 = this.f4437v;
            int i11 = this.f4438w;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f4437v = i12;
                        int i13 = (i12 - i10) - 1;
                        if (sb == null) {
                            return new String(cArr, i10, i13);
                        }
                        sb.append(cArr, i10, i13);
                        return sb.toString();
                    } else if (c11 == '\\') {
                        this.f4437v = i12;
                        int i14 = (i12 - i10) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                        }
                        sb.append(cArr, i10, i14);
                        sb.append(z0());
                    } else {
                        if (c11 == '\n') {
                            this.f4439x++;
                            this.y = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb.append(cArr, i10, i10 - i10);
                    this.f4437v = i10;
                    if (!L(1)) {
                        D0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String v0() {
        String str;
        char c10;
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        if (i10 == 10) {
            str = w0();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.C;
                this.C = null;
            } else if (i10 == 15) {
                str = Long.toString(this.A);
            } else if (i10 != 16) {
                StringBuilder c11 = androidx.activity.result.a.c("Expected a string but was ");
                c11.append(b.a(x0()));
                c11.append(m0());
                throw new IllegalStateException(c11.toString());
            } else {
                str = new String(this.f4436u, this.f4437v, this.B);
                this.f4437v += this.B;
            }
            str = u0(c10);
        }
        this.f4440z = 0;
        int[] iArr = this.G;
        int i11 = this.E - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        j();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String w0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f4437v
            int r4 = r3 + r2
            int r5 = r6.f4438w
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f4436u
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.j()
            goto L5c
        L4e:
            char[] r3 = r6.f4436u
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.L(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f4436u
            int r4 = r6.f4437v
            r1.append(r3, r4, r2)
            int r3 = r6.f4437v
            int r3 = r3 + r2
            r6.f4437v = r3
            r2 = 1
            boolean r2 = r6.L(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4436u
            int r3 = r6.f4437v
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f4436u
            int r3 = r6.f4437v
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f4437v
            int r2 = r2 + r0
            r6.f4437v = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.a.w0():java.lang.String");
    }

    public int x0() {
        int i10 = this.f4440z;
        if (i10 == 0) {
            i10 = G();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void y0(int i10) {
        int i11 = this.E;
        int[] iArr = this.D;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.D = Arrays.copyOf(iArr, i12);
            this.G = Arrays.copyOf(this.G, i12);
            this.F = (String[]) Arrays.copyOf(this.F, i12);
        }
        int[] iArr2 = this.D;
        int i13 = this.E;
        this.E = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char z0() {
        int i10;
        int i11;
        if (this.f4437v == this.f4438w && !L(1)) {
            D0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f4436u;
        int i12 = this.f4437v;
        int i13 = i12 + 1;
        this.f4437v = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f4439x++;
            this.y = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                D0("Invalid escape sequence");
                throw null;
            } else if (i13 + 4 > this.f4438w && !L(4)) {
                D0("Unterminated escape sequence");
                throw null;
            } else {
                char c11 = 0;
                int i14 = this.f4437v;
                int i15 = i14 + 4;
                while (i14 < i15) {
                    char c12 = this.f4436u[i14];
                    char c13 = (char) (c11 << 4);
                    if (c12 < '0' || c12 > '9') {
                        if (c12 >= 'a' && c12 <= 'f') {
                            i11 = c12 - 'a';
                        } else if (c12 < 'A' || c12 > 'F') {
                            StringBuilder c14 = androidx.activity.result.a.c("\\u");
                            c14.append(new String(this.f4436u, this.f4437v, 4));
                            throw new NumberFormatException(c14.toString());
                        } else {
                            i11 = c12 - 'A';
                        }
                        i10 = i11 + 10;
                    } else {
                        i10 = c12 - '0';
                    }
                    c11 = (char) (i10 + c13);
                    i14++;
                }
                this.f4437v += 4;
                return c11;
            }
        }
        return c10;
    }
}
