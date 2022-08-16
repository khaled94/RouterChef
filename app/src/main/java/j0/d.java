package j0;

import a8.q;
import a9.b;
import android.content.Context;
import android.text.TextUtils;
import e8.c;
import e9.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m4.ar0;
import m4.as0;
import m4.at;
import m4.bc2;
import m4.e82;
import m4.eb2;
import m4.es1;
import m4.it1;
import m4.ls1;
import m4.n02;
import m4.n82;
import m4.n92;
import m4.qb2;
import m4.ta2;
import m4.to0;
import m4.u92;
import m4.v92;
import m4.x92;
import m4.zr1;
import s4.aa;
import s4.r8;
import s4.s8;
import x7.l;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class d implements ar0, d1 {
    public static n02 y;

    /* renamed from: s */
    public static final int[] f5384s = {48000, 44100, 32000};

    /* renamed from: t */
    public static final int[] f5385t = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: u */
    public static final /* synthetic */ d f5386u = new d();

    /* renamed from: v */
    public static final as0 f5387v = new as0();

    /* renamed from: w */
    public static final byte[] f5388w = {0, 0, 0, 1};

    /* renamed from: x */
    public static final String[] f5389x = {"", "A", "B", "C"};

    /* renamed from: z */
    public static final r8 f5390z = new r8();
    public static final s8 A = new s8();
    public static final /* synthetic */ d B = new d();

    public static final void a(Throwable th, Throwable th2) {
        f.e(th, "<this>");
        f.e(th2, "exception");
        if (th != th2) {
            b.f384a.a(th, th2);
        }
    }

    public static void d(l lVar, c cVar) {
        q.V.b(cVar, lVar);
    }

    public static int e(byte[] bArr, int i10, e82 e82Var) {
        int t10 = t(bArr, i10, e82Var);
        int i11 = e82Var.f7741a;
        if (i11 >= 0) {
            if (i11 > bArr.length - t10) {
                throw x92.h();
            }
            if (i11 == 0) {
                e82Var.f7743c = n82.f11571t;
                return t10;
            }
            e82Var.f7743c = n82.D(bArr, t10, i11);
            return t10 + i11;
        }
        throw x92.f();
    }

    public static String f(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static it1 g(Context context, int i10, String str, String str2, zr1 zr1Var) {
        it1 it1Var;
        es1 es1Var = new es1(context, i10, str, str2, zr1Var);
        try {
            it1Var = es1Var.f8254d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            es1Var.b(2009, es1Var.f8257g, e10);
            it1Var = null;
        }
        es1Var.b(3004, es1Var.f8257g, null);
        if (it1Var != null) {
            zr1.f16316e = it1Var.f9750u == 7 ? 3 : 2;
        }
        return it1Var == null ? new it1() : it1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(m4.n8 r6) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.i(m4.n8):boolean");
    }

    public static int j(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static String k(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f5389x[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(true != z10 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb = new StringBuilder(ls1.c("hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb.toString();
    }

    public static int l(eb2 eb2Var, byte[] bArr, int i10, int i11, int i12, e82 e82Var) {
        ta2 ta2Var = (ta2) eb2Var;
        Object b10 = ta2Var.b();
        int E = ta2Var.E(b10, bArr, i10, i11, i12, e82Var);
        ta2Var.c(b10);
        e82Var.f7743c = b10;
        return E;
    }

    public static void m(List list, at atVar) {
        String str = (String) atVar.e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }

    public static int n(eb2 eb2Var, byte[] bArr, int i10, int i11, e82 e82Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = u(i13, bArr, i12, e82Var);
            i13 = e82Var.f7741a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw x92.h();
        }
        Object b10 = eb2Var.b();
        int i15 = i13 + i14;
        eb2Var.e(b10, bArr, i14, i15, e82Var);
        eb2Var.c(b10);
        e82Var.f7743c = b10;
        return i15;
    }

    public static int o(eb2 eb2Var, int i10, byte[] bArr, int i11, int i12, u92 u92Var, e82 e82Var) {
        int n10 = n(eb2Var, bArr, i11, i12, e82Var);
        while (true) {
            u92Var.add(e82Var.f7743c);
            if (n10 >= i12) {
                break;
            }
            int t10 = t(bArr, n10, e82Var);
            if (i10 != e82Var.f7741a) {
                break;
            }
            n10 = n(eb2Var, bArr, t10, i12, e82Var);
        }
        return n10;
    }

    public static int p(byte[] bArr, int i10, u92 u92Var, e82 e82Var) {
        n92 n92Var = (n92) u92Var;
        int t10 = t(bArr, i10, e82Var);
        int i11 = e82Var.f7741a + t10;
        while (t10 < i11) {
            t10 = t(bArr, t10, e82Var);
            n92Var.h(e82Var.f7741a);
        }
        if (t10 == i11) {
            return t10;
        }
        throw x92.h();
    }

    public static int q(byte[] bArr, int i10, e82 e82Var) {
        int t10 = t(bArr, i10, e82Var);
        int i11 = e82Var.f7741a;
        if (i11 >= 0) {
            if (i11 == 0) {
                e82Var.f7743c = "";
                return t10;
            }
            e82Var.f7743c = new String(bArr, t10, i11, v92.f14624a);
            return t10 + i11;
        }
        throw x92.f();
    }

    public static int r(byte[] bArr, int i10, e82 e82Var) {
        int t10 = t(bArr, i10, e82Var);
        int i11 = e82Var.f7741a;
        if (i11 >= 0) {
            if (i11 == 0) {
                e82Var.f7743c = "";
                return t10;
            }
            e82Var.f7743c = bc2.f6451a.c(bArr, t10, i11);
            return t10 + i11;
        }
        throw x92.f();
    }

    public static int s(int i10, byte[] bArr, int i11, int i12, qb2 qb2Var, e82 e82Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int w10 = w(bArr, i11, e82Var);
                qb2Var.c(i10, Long.valueOf(e82Var.f7742b));
                return w10;
            } else if (i13 == 1) {
                qb2Var.c(i10, Long.valueOf(x(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int t10 = t(bArr, i11, e82Var);
                int i14 = e82Var.f7741a;
                if (i14 < 0) {
                    throw x92.f();
                }
                if (i14 > bArr.length - t10) {
                    throw x92.h();
                }
                qb2Var.c(i10, i14 == 0 ? n82.f11571t : n82.D(bArr, t10, i14));
                return t10 + i14;
            } else if (i13 != 3) {
                if (i13 != 5) {
                    throw x92.c();
                }
                qb2Var.c(i10, Integer.valueOf(j(bArr, i11)));
                return i11 + 4;
            } else {
                int i15 = (i10 & (-8)) | 4;
                qb2 b10 = qb2.b();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int t11 = t(bArr, i11, e82Var);
                    int i17 = e82Var.f7741a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = t11;
                        break;
                    }
                    int s10 = s(i16, bArr, t11, i12, b10, e82Var);
                    i16 = i17;
                    i11 = s10;
                }
                if (i11 > i12 || i16 != i15) {
                    throw x92.g();
                }
                qb2Var.c(i10, b10);
                return i11;
            }
        }
        throw x92.c();
    }

    public static int t(byte[] bArr, int i10, e82 e82Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            e82Var.f7741a = b10;
            return i11;
        }
        return u(b10, bArr, i11, e82Var);
    }

    public static int u(int i10, byte[] bArr, int i11, e82 e82Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                e82Var.f7741a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            e82Var.f7741a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        e82Var.f7741a = i14 | i13;
        return i15;
    }

    public static int v(int i10, byte[] bArr, int i11, int i12, u92 u92Var, e82 e82Var) {
        n92 n92Var = (n92) u92Var;
        int t10 = t(bArr, i11, e82Var);
        while (true) {
            n92Var.h(e82Var.f7741a);
            if (t10 >= i12) {
                break;
            }
            int t11 = t(bArr, t10, e82Var);
            if (i10 != e82Var.f7741a) {
                break;
            }
            t10 = t(bArr, t11, e82Var);
        }
        return t10;
    }

    public static int w(byte[] bArr, int i10, e82 e82Var) {
        byte b10;
        int i11 = i10 + 1;
        long j3 = bArr[i10];
        if (j3 >= 0) {
            e82Var.f7742b = j3;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j10 = (j3 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        e82Var.f7742b = j10;
        return i12;
    }

    public static long x(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public void b(boolean z10) {
    }

    public void c(boolean z10) {
        throw null;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((to0) obj).x();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().j());
    }
}
