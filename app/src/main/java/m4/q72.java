package m4;

import e1.i;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class q72 implements t32, v91 {

    /* renamed from: s */
    public final Object f12730s;

    /* renamed from: t */
    public Object f12731t;

    /* renamed from: u */
    public Object f12732u;

    public /* synthetic */ q72(fg2 fg2Var, t tVar, h12 h12Var) {
        this.f12730s = fg2Var;
        this.f12731t = tVar;
        this.f12732u = h12Var;
    }

    public /* synthetic */ q72(yo2 yo2Var) {
        this.f12730s = yo2Var;
    }

    public /* synthetic */ q72(byte[] bArr) {
        w72.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12730s = secretKeySpec;
        Cipher c10 = c();
        c10.init(1, secretKeySpec);
        byte[] f10 = i.f(c10.doFinal(new byte[16]));
        this.f12731t = f10;
        this.f12732u = i.f(f10);
    }

    public static Cipher c() {
        if (i.d(1)) {
            return n72.f11544e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // m4.t32
    public final byte[] a(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Cipher c10 = c();
            c10.init(1, (SecretKey) this.f12730s);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            byte[] f10 = max * 16 == length ? g7.f(bArr, (max - 1) * 16, (byte[]) this.f12731t, 0, 16) : g7.e(i.e(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), (byte[]) this.f12732u);
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = c10.doFinal(g7.f(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(c10.doFinal(g7.e(f10, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    public final long b() {
        uo2 uo2Var = (uo2) this.f12732u;
        if (uo2Var != null) {
            return uo2Var.b();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.f12946d != r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r6.f12946d != r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(m4.jp0 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, m4.vo2 r15) {
        /*
            r7 = this;
            m4.qo2 r6 = new m4.qo2
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f12732u = r6
            java.lang.Object r8 = r7.f12731t
            m4.to2 r8 = (m4.to2) r8
            if (r8 == 0) goto L12
            return
        L12:
            java.lang.Object r8 = r7.f12730s
            m4.yo2 r8 = (m4.yo2) r8
            m4.to2[] r8 = r8.a(r9, r10)
            int r9 = r8.length
            r10 = 0
            r13 = 1
            if (r9 != r13) goto L25
            r8 = r8[r10]
            r7.f12731t = r8
            goto Lb5
        L25:
            r14 = r10
        L26:
            if (r14 >= r9) goto L6f
            r0 = r8[r14]
            boolean r1 = r0.c(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r1 == 0) goto L35
            r7.f12731t = r0     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            r6.f12948f = r10
            goto L6f
        L35:
            java.lang.Object r0 = r7.f12731t
            m4.to2 r0 = (m4.to2) r0
            if (r0 != 0) goto L66
            long r0 = r6.f12946d
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            java.lang.Object r9 = r7.f12731t
            m4.to2 r9 = (m4.to2) r9
            if (r9 != 0) goto L51
            long r14 = r6.f12946d
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
            goto L51
        L50:
            r13 = r10
        L51:
            m4.r01.h(r13)
            r6.f12948f = r10
            throw r8
        L57:
            java.lang.Object r0 = r7.f12731t
            m4.to2 r0 = (m4.to2) r0
            if (r0 != 0) goto L66
            long r0 = r6.f12946d
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L64
            goto L66
        L64:
            r0 = r10
            goto L67
        L66:
            r0 = r13
        L67:
            m4.r01.h(r0)
            r6.f12948f = r10
            int r14 = r14 + 1
            goto L26
        L6f:
            java.lang.Object r9 = r7.f12731t
            m4.to2 r9 = (m4.to2) r9
            if (r9 != 0) goto Lb5
            m4.el2 r9 = new m4.el2
            int r11 = m4.ls1.f10971a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L7e:
            int r12 = r8.length
            if (r10 >= r12) goto L9a
            r13 = r8[r10]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r11.append(r13)
            int r12 = r12 + (-1)
            if (r10 >= r12) goto L97
            java.lang.String r12 = ", "
            r11.append(r12)
        L97:
            int r10 = r10 + 1
            goto L7e
        L9a:
            java.lang.String r8 = r11.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r11 = r8.length()
            int r11 = r11 + 58
            r10.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = androidx.fragment.app.a.b(r10, r11, r8, r12)
            r9.<init>(r8)
            throw r9
        Lb5:
            java.lang.Object r8 = r7.f12731t
            m4.to2 r8 = (m4.to2) r8
            r8.e(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.q72.d(m4.jp0, android.net.Uri, java.util.Map, long, long, m4.vo2):void");
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((gg2) obj).p((t) this.f12731t);
    }
}
