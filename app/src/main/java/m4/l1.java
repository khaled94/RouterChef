package m4;

import android.util.Log;
import h2.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class l1 extends j1 {

    /* renamed from: n */
    public k1 f10632n;

    /* renamed from: o */
    public int f10633o;
    public boolean p;

    /* renamed from: q */
    public pp2 f10634q;

    /* renamed from: r */
    public b5 f10635r;

    @Override // m4.j1
    public final long a(dd ddVar) {
        Object obj = ddVar.f7311d;
        int i10 = 0;
        if ((((byte[]) obj)[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = ((byte[]) obj)[0];
        k1 k1Var = this.f10632n;
        r01.d(k1Var);
        int i11 = !k1Var.f10234c[(b10 >> 1) & (255 >>> (8 - k1Var.f10235d))].f12263a ? k1Var.f10232a.f12610e : k1Var.f10232a.f12611f;
        if (this.p) {
            i10 = (this.f10633o + i11) / 4;
        }
        long j3 = i10;
        int a10 = ddVar.a();
        int i12 = ddVar.f7310c;
        if (a10 < i12 + 4) {
            byte[] copyOf = Arrays.copyOf((byte[]) ddVar.f7311d, i12 + 4);
            ddVar.f(copyOf, copyOf.length);
        } else {
            ddVar.g(i12 + 4);
        }
        byte[] bArr = (byte[]) ddVar.f7311d;
        int i13 = ddVar.f7310c;
        bArr[i13 - 4] = (byte) (j3 & 255);
        bArr[i13 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr[i13 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr[i13 - 1] = (byte) ((j3 >>> 24) & 255);
        this.p = true;
        this.f10633o = i11;
        return j3;
    }

    @Override // m4.j1
    public final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f10632n = null;
            this.f10634q = null;
            this.f10635r = null;
        }
        this.f10633o = 0;
        this.p = false;
    }

    @Override // m4.j1
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(dd ddVar, long j3, a0 a0Var) {
        k1 k1Var;
        boolean c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f10632n != null) {
            Objects.requireNonNull((t) a0Var.f4956s);
            return false;
        }
        pp2 pp2Var = this.f10634q;
        int i15 = 4;
        if (pp2Var == null) {
            zv1.g(1, ddVar, false);
            ddVar.n();
            int q10 = ddVar.q();
            int n10 = ddVar.n();
            int m10 = ddVar.m();
            int i16 = m10 <= 0 ? -1 : m10;
            int m11 = ddVar.m();
            int i17 = m11 <= 0 ? -1 : m11;
            ddVar.m();
            int q11 = ddVar.q();
            ddVar.q();
            this.f10634q = new pp2(q10, n10, i16, i17, (int) Math.pow(2.0d, q11 & 15), (int) Math.pow(2.0d, (q11 & 240) >> 4), Arrays.copyOf((byte[]) ddVar.f7311d, ddVar.f7310c));
        } else if (this.f10635r == null) {
            this.f10635r = zv1.e(ddVar, true, true);
        } else {
            int i18 = ddVar.f7310c;
            byte[] bArr = new byte[i18];
            System.arraycopy((byte[]) ddVar.f7311d, 0, bArr, 0, i18);
            int i19 = pp2Var.f12606a;
            int i20 = 5;
            zv1.g(5, ddVar, false);
            int q12 = ddVar.q() + 1;
            np2 np2Var = new np2((byte[]) ddVar.f7311d);
            np2Var.b(ddVar.f7309b * 8);
            int i21 = 0;
            while (i21 < q12) {
                if (np2Var.a(24) != 5653314) {
                    int i22 = (np2Var.f11886c * 8) + np2Var.f11887d;
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    sb.append(i22);
                    throw mq.a(sb.toString(), null);
                }
                int a10 = np2Var.a(16);
                int a11 = np2Var.a(24);
                long[] jArr = new long[a11];
                long j10 = 0;
                if (!np2Var.c()) {
                    boolean c11 = np2Var.c();
                    int i23 = 0;
                    while (i23 < a11) {
                        if (!c11) {
                            i14 = i19;
                            jArr[i23] = np2Var.a(i20) + 1;
                        } else if (np2Var.c()) {
                            i14 = i19;
                            jArr[i23] = np2Var.a(i20) + 1;
                        } else {
                            i14 = i19;
                            jArr[i23] = 0;
                        }
                        i23++;
                        i19 = i14;
                        i15 = 4;
                    }
                    i12 = i19;
                    i13 = i15;
                    i11 = q12;
                } else {
                    i12 = i19;
                    int a12 = np2Var.a(i20) + 1;
                    int i24 = 0;
                    while (i24 < a11) {
                        int a13 = np2Var.a(zv1.c(a11 - i24));
                        int i25 = 0;
                        while (i25 < a13 && i24 < a11) {
                            jArr[i24] = a12;
                            i24++;
                            i25++;
                            q12 = q12;
                        }
                        a12++;
                        q12 = q12;
                    }
                    i11 = q12;
                    i13 = 4;
                }
                int a14 = np2Var.a(i13);
                if (a14 > 2) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("lookup type greater than 2 not decodable: ");
                    sb2.append(a14);
                    throw mq.a(sb2.toString(), null);
                }
                if (a14 != 1) {
                    if (a14 == 2) {
                        a14 = 2;
                    } else {
                        i21++;
                        i19 = i12;
                        q12 = i11;
                        i15 = 4;
                        i20 = 5;
                    }
                }
                np2Var.b(32);
                np2Var.b(32);
                int a15 = np2Var.a(i13) + 1;
                np2Var.b(1);
                if (a14 != 1) {
                    j10 = a11 * a10;
                } else if (a10 != 0) {
                    j10 = (long) Math.floor(Math.pow(a11, 1.0d / a10));
                }
                np2Var.b((int) (a15 * j10));
                i21++;
                i19 = i12;
                q12 = i11;
                i15 = 4;
                i20 = 5;
            }
            int i26 = i19;
            int i27 = 6;
            int a16 = np2Var.a(6) + 1;
            for (int i28 = 0; i28 < a16; i28++) {
                if (np2Var.a(16) != 0) {
                    throw mq.a("placeholder of time domain transforms not zeroed out", null);
                }
            }
            int i29 = 1;
            int a17 = np2Var.a(6) + 1;
            int i30 = 0;
            while (true) {
                int i31 = 3;
                if (i30 < a17) {
                    int a18 = np2Var.a(16);
                    if (a18 == 0) {
                        int i32 = 8;
                        np2Var.b(8);
                        np2Var.b(16);
                        np2Var.b(16);
                        np2Var.b(6);
                        np2Var.b(8);
                        int a19 = np2Var.a(4) + 1;
                        int i33 = 0;
                        while (i33 < a19) {
                            np2Var.b(i32);
                            i33++;
                            i32 = 8;
                        }
                    } else if (a18 != i29) {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("floor type greater than 1 not decodable: ");
                        sb3.append(a18);
                        throw mq.a(sb3.toString(), null);
                    } else {
                        int a20 = np2Var.a(5);
                        int[] iArr = new int[a20];
                        int i34 = -1;
                        for (int i35 = 0; i35 < a20; i35++) {
                            int a21 = np2Var.a(4);
                            iArr[i35] = a21;
                            if (a21 > i34) {
                                i34 = a21;
                            }
                        }
                        int i36 = i34 + 1;
                        int[] iArr2 = new int[i36];
                        int i37 = 0;
                        while (i37 < i36) {
                            iArr2[i37] = np2Var.a(i31) + 1;
                            int a22 = np2Var.a(2);
                            int i38 = 8;
                            if (a22 > 0) {
                                np2Var.b(8);
                            }
                            int i39 = 0;
                            for (int i40 = 1; i39 < (i40 << a22); i40 = 1) {
                                np2Var.b(i38);
                                i39++;
                                i38 = 8;
                            }
                            i37++;
                            i31 = 3;
                        }
                        np2Var.b(2);
                        int a23 = np2Var.a(4);
                        int i41 = 0;
                        int i42 = 0;
                        for (int i43 = 0; i43 < a20; i43++) {
                            i41 += iArr2[iArr[i43]];
                            while (i42 < i41) {
                                np2Var.b(a23);
                                i42++;
                            }
                        }
                    }
                    i30++;
                    i27 = 6;
                    i29 = 1;
                } else {
                    int i44 = 1;
                    int a24 = np2Var.a(i27) + 1;
                    int i45 = 0;
                    while (i45 < a24) {
                        if (np2Var.a(16) > 2) {
                            throw mq.a("residueType greater than 2 is not decodable", null);
                        }
                        np2Var.b(24);
                        np2Var.b(24);
                        np2Var.b(24);
                        int a25 = np2Var.a(i27) + i44;
                        int i46 = 8;
                        np2Var.b(8);
                        int[] iArr3 = new int[a25];
                        for (int i47 = 0; i47 < a25; i47++) {
                            iArr3[i47] = ((np2Var.c() ? np2Var.a(5) : 0) * 8) + np2Var.a(3);
                        }
                        int i48 = 0;
                        while (i48 < a25) {
                            int i49 = 0;
                            while (i49 < i46) {
                                if ((iArr3[i48] & (1 << i49)) != 0) {
                                    np2Var.b(i46);
                                }
                                i49++;
                                i46 = 8;
                            }
                            i48++;
                            i46 = 8;
                        }
                        i45++;
                        i27 = 6;
                        i44 = 1;
                    }
                    int a26 = np2Var.a(i27) + 1;
                    int i50 = 0;
                    while (i50 < a26) {
                        int a27 = np2Var.a(16);
                        if (a27 != 0) {
                            StringBuilder sb4 = new StringBuilder(52);
                            sb4.append("mapping type other than 0 not supported: ");
                            sb4.append(a27);
                            Log.e("VorbisUtil", sb4.toString());
                            i10 = i26;
                        } else {
                            int a28 = np2Var.c() ? np2Var.a(4) + 1 : 1;
                            if (np2Var.c()) {
                                int a29 = np2Var.a(8) + 1;
                                for (int i51 = 0; i51 < a29; i51++) {
                                    int i52 = i26 - 1;
                                    np2Var.b(zv1.c(i52));
                                    np2Var.b(zv1.c(i52));
                                }
                            }
                            if (np2Var.a(2) != 0) {
                                throw mq.a("to reserved bits must be zero after mapping coupling steps", null);
                            }
                            if (a28 > 1) {
                                i10 = i26;
                                for (int i53 = 0; i53 < i10; i53++) {
                                    np2Var.b(4);
                                }
                            } else {
                                i10 = i26;
                            }
                            for (int i54 = 0; i54 < a28; i54++) {
                                np2Var.b(8);
                                np2Var.b(8);
                                np2Var.b(8);
                            }
                        }
                        i50++;
                        i26 = i10;
                    }
                    int a30 = np2Var.a(6) + 1;
                    op2[] op2VarArr = new op2[a30];
                    int i55 = 0;
                    while (true) {
                        c10 = np2Var.c();
                        if (i55 >= a30) {
                            break;
                        }
                        np2Var.a(16);
                        np2Var.a(16);
                        np2Var.a(8);
                        op2VarArr[i55] = new op2(c10);
                        i55++;
                    }
                    if (!c10) {
                        throw mq.a("framing bit after modes not set as expected", null);
                    }
                    k1Var = new k1(pp2Var, bArr, op2VarArr, zv1.c(a30 - 1));
                }
            }
        }
        k1Var = null;
        this.f10632n = k1Var;
        if (k1Var == null) {
            return true;
        }
        pp2 pp2Var2 = k1Var.f10232a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(pp2Var2.f12612g);
        arrayList.add(k1Var.f10233b);
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "audio/vorbis";
        kq2Var.f10537e = pp2Var2.f12609d;
        kq2Var.f10538f = pp2Var2.f12608c;
        kq2Var.f10554w = pp2Var2.f12606a;
        kq2Var.f10555x = pp2Var2.f12607b;
        kq2Var.f10544l = arrayList;
        a0Var.f4956s = new t(kq2Var);
        return true;
    }

    @Override // m4.j1
    public final void e(long j3) {
        this.f9789g = j3;
        int i10 = 0;
        this.p = j3 != 0;
        pp2 pp2Var = this.f10634q;
        if (pp2Var != null) {
            i10 = pp2Var.f12610e;
        }
        this.f10633o = i10;
    }
}
