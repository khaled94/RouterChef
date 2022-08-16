package ca;

import d7.a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: v */
    public static final char[] f2845v = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: w */
    public static final i f2846w = k(new byte[0]);

    /* renamed from: s */
    public final byte[] f2847s;

    /* renamed from: t */
    public transient int f2848t;

    /* renamed from: u */
    public transient String f2849u;

    public i(byte[] bArr) {
        this.f2847s = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
        r6 = null;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ca.i d(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.i.d(java.lang.String):ca.i");
    }

    public static i e(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (f(str.charAt(i11 + 1)) + (f(str.charAt(i11)) << 4));
            }
            return k(bArr);
        }
        throw new IllegalArgumentException(a.c("Unexpected hex string: ", str));
    }

    public static int f(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                c11 = 'A';
                if (c10 < 'A' || c10 > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c10);
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    public static i h(String str) {
        if (str != null) {
            i iVar = new i(str.getBytes(a0.f2829a));
            iVar.f2849u = str;
            return iVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static i k(byte... bArr) {
        if (bArr != null) {
            return new i((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String b() {
        byte[] bArr = this.f2847s;
        byte[] bArr2 = d.f2838s;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[i11] & 255) >> 2];
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            bArr3[i12] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i14] & 255) >> 4)];
            int i15 = i13 + 1;
            int i16 = i11 + 2;
            bArr3[i13] = bArr2[((bArr[i14] & 15) << 2) | ((bArr[i16] & 255) >> 6)];
            i10 = i15 + 1;
            bArr3[i15] = bArr2[bArr[i16] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i17 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i18] = 61;
            bArr3[i18 + 1] = 61;
        } else if (length2 == 2) {
            int i19 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i20 = i19 + 1;
            int i21 = length + 1;
            bArr3[i19] = bArr2[((bArr[i21] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i20] = bArr2[(bArr[i21] & 15) << 2];
            bArr3[i20 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(ca.i r10) {
        /*
            r9 = this;
            ca.i r10 = (ca.i) r10
            int r0 = r9.n()
            int r1 = r10.n()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = r5
            goto L31
        L29:
            r3 = r6
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.i.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int n10 = iVar.n();
            byte[] bArr = this.f2847s;
            if (n10 == bArr.length && iVar.l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public final i g(String str) {
        try {
            return k(MessageDigest.getInstance(str).digest(this.f2847s));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public int hashCode() {
        int i10 = this.f2848t;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f2847s);
        this.f2848t = hashCode;
        return hashCode;
    }

    public byte i(int i10) {
        return this.f2847s[i10];
    }

    public String j() {
        byte[] bArr = this.f2847s;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f2845v;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean l(int i10, byte[] bArr, int i11, int i12) {
        boolean z10;
        if (i10 >= 0) {
            byte[] bArr2 = this.f2847s;
            if (i10 > bArr2.length - i12 || i11 < 0 || i11 > bArr.length - i12) {
                return false;
            }
            Charset charset = a0.f2829a;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    z10 = true;
                    break;
                } else if (bArr2[i13 + i10] != bArr[i13 + i11]) {
                    z10 = false;
                    break;
                } else {
                    i13++;
                }
            }
            return z10;
        }
        return false;
    }

    public boolean m(i iVar, int i10) {
        return iVar.l(0, this.f2847s, 0, i10);
    }

    public int n() {
        return this.f2847s.length;
    }

    public i o() {
        byte[] bArr = this.f2847s;
        if (64 > bArr.length) {
            StringBuilder c10 = androidx.activity.result.a.c("endIndex > length(");
            c10.append(this.f2847s.length);
            c10.append(")");
            throw new IllegalArgumentException(c10.toString());
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new i(bArr2);
        }
    }

    public i p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f2847s;
            if (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i10] = (byte) (b10 + 32);
                    for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                        byte b11 = bArr2[i11];
                        if (b11 >= 65 && b11 <= 90) {
                            bArr2[i11] = (byte) (b11 + 32);
                        }
                    }
                    return new i(bArr2);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public String q() {
        String str = this.f2849u;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f2847s, a0.f2829a);
        this.f2849u = str2;
        return str2;
    }

    public void r(f fVar) {
        byte[] bArr = this.f2847s;
        fVar.z0(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f2847s.length == 0) {
            return "[size=0]";
        }
        String q10 = q();
        int length = q10.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = q10.length();
                break;
            } else if (i11 == 64) {
                break;
            } else {
                int codePointAt = q10.codePointAt(i10);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i11++;
                    i10 += Character.charCount(codePointAt);
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            if (this.f2847s.length <= 64) {
                sb2 = androidx.activity.result.a.c("[hex=");
                sb2.append(j());
                sb2.append("]");
            } else {
                sb2 = androidx.activity.result.a.c("[size=");
                sb2.append(this.f2847s.length);
                sb2.append(" hex=");
                sb2.append(o().j());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = q10.substring(0, i10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i10 < q10.length()) {
            sb = androidx.activity.result.a.c("[size=");
            sb.append(this.f2847s.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
