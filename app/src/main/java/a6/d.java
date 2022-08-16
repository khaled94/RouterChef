package a6;

import c1.f;
import c4.a;
import h2.v;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m3.p;
import m4.ar0;
import m4.dd;
import m4.j00;
import m4.ko1;
import m4.l00;
import m4.mz1;
import m4.tz1;
import m4.u90;
import m4.xm1;
import n3.g1;
import org.json.JSONObject;
import s4.a4;
import s4.a6;
import s4.a9;
import s4.aa;
import s4.b7;
import s4.d7;
import s4.g;
import s4.g6;
import s4.g8;
import s4.h;
import s4.h7;
import s4.i7;
import s4.k7;
import s4.k9;
import s4.n;
import s4.o8;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class d implements j00, ar0, ko1, d1 {

    /* renamed from: s */
    public static final /* synthetic */ d f179s = new d();

    /* renamed from: t */
    public static final /* synthetic */ d f180t = new d();

    /* renamed from: u */
    public static final /* synthetic */ d f181u = new d();

    /* renamed from: v */
    public static final xm1 f182v = new xm1();

    /* renamed from: w */
    public static final /* synthetic */ d f183w = new d();

    public static int c(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
            if (i10 == 3) {
                return 4;
            }
            return i10 != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int d(byte[] bArr, int i10, a6 a6Var) {
        int s10 = s(bArr, i10, a6Var);
        int i11 = a6Var.f17714a;
        if (i11 >= 0) {
            if (i11 > bArr.length - s10) {
                throw k7.d();
            }
            if (i11 == 0) {
                a6Var.f17716c = g6.f17877t;
                return s10;
            }
            a6Var.f17716c = g6.p(bArr, s10, i11);
            return s10 + i11;
        }
        throw k7.b();
    }

    public static void e(tz1 tz1Var, String str) {
        mz1.t(tz1Var, new v(str), u90.f14299f);
    }

    public static int f(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long g(dd ddVar, int i10, int i11) {
        ddVar.h(i10);
        if (ddVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int l10 = ddVar.l();
        if ((8388608 & l10) != 0 || ((l10 >> 8) & 8191) != i11 || (l10 & 32) == 0 || ddVar.q() < 7 || ddVar.zza() < 7 || (ddVar.q() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        ddVar.d(bArr, 0, 6);
        byte b10 = bArr[0];
        byte b11 = bArr[1];
        byte b12 = bArr[2];
        long j3 = bArr[3] & 255;
        return ((b11 & 255) << 17) | ((b10 & 255) << 25) | ((b12 & 255) << 9) | (j3 + j3) | ((bArr[4] & 255) >> 7);
    }

    public static s4.d i(s4.d dVar, a4 a4Var, h hVar, Boolean bool, Boolean bool2) {
        s4.d dVar2 = new s4.d();
        Iterator<Integer> q10 = dVar.q();
        while (q10.hasNext()) {
            int intValue = q10.next().intValue();
            if (dVar.v(intValue)) {
                n a10 = hVar.a(a4Var, Arrays.asList(dVar.o(intValue), new g(Double.valueOf(intValue)), dVar));
                if (a10.e().equals(bool)) {
                    return dVar2;
                }
                if (bool2 == null || a10.e().equals(bool2)) {
                    dVar2.u(intValue, a10);
                }
            }
        }
        return dVar2;
    }

    public static int j(o8 o8Var, byte[] bArr, int i10, int i11, int i12, a6 a6Var) {
        g8 g8Var = (g8) o8Var;
        Object r10 = ((b7) g8Var.f17885e).r(4);
        int z10 = g8Var.z(r10, bArr, i10, i11, i12, a6Var);
        g8Var.c(r10);
        a6Var.f17716c = r10;
        return z10;
    }

    public static n k(s4.d dVar, a4 a4Var, List list, boolean z10) {
        n nVar;
        f.n("reduce", 1, list);
        f.o("reduce", 2, list);
        ArrayList arrayList = (ArrayList) list;
        n b10 = a4Var.b((n) arrayList.get(0));
        if (b10 instanceof h) {
            if (arrayList.size() == 2) {
                nVar = a4Var.b((n) arrayList.get(1));
                if (nVar instanceof s4.f) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (dVar.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                nVar = null;
            }
            h hVar = (h) b10;
            int m10 = dVar.m();
            int i10 = z10 ? 0 : m10 - 1;
            int i11 = -1;
            int i12 = z10 ? m10 - 1 : 0;
            if (true == z10) {
                i11 = 1;
            }
            if (nVar == null) {
                nVar = dVar.o(i10);
                i10 += i11;
            }
            while ((i12 - i10) * i11 >= 0) {
                if (dVar.v(i10)) {
                    nVar = hVar.a(a4Var, Arrays.asList(nVar, dVar.o(i10), new g(Double.valueOf(i10)), dVar));
                    if (nVar instanceof s4.f) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i10 += i11;
                } else {
                    i10 += i11;
                }
            }
            return nVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static int l(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i10 / 0.75f) + 1.0f);
    }

    public static int m(o8 o8Var, byte[] bArr, int i10, int i11, a6 a6Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = t(i13, bArr, i12, a6Var);
            i13 = a6Var.f17714a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw k7.d();
        }
        Object b10 = o8Var.b();
        int i15 = i13 + i14;
        o8Var.f(b10, bArr, i14, i15, a6Var);
        o8Var.c(b10);
        a6Var.f17716c = b10;
        return i15;
    }

    public static int n(o8 o8Var, int i10, byte[] bArr, int i11, int i12, h7 h7Var, a6 a6Var) {
        int m10 = m(o8Var, bArr, i11, i12, a6Var);
        while (true) {
            h7Var.add(a6Var.f17716c);
            if (m10 >= i12) {
                break;
            }
            int s10 = s(bArr, m10, a6Var);
            if (i10 != a6Var.f17714a) {
                break;
            }
            m10 = m(o8Var, bArr, s10, i12, a6Var);
        }
        return m10;
    }

    public static int o(byte[] bArr, int i10, h7 h7Var, a6 a6Var) {
        d7 d7Var = (d7) h7Var;
        int s10 = s(bArr, i10, a6Var);
        int i11 = a6Var.f17714a + s10;
        while (s10 < i11) {
            s10 = s(bArr, s10, a6Var);
            d7Var.h(a6Var.f17714a);
        }
        if (s10 == i11) {
            return s10;
        }
        throw k7.d();
    }

    public static int p(byte[] bArr, int i10, a6 a6Var) {
        int s10 = s(bArr, i10, a6Var);
        int i11 = a6Var.f17714a;
        if (i11 >= 0) {
            if (i11 == 0) {
                a6Var.f17716c = "";
                return s10;
            }
            a6Var.f17716c = new String(bArr, s10, i11, i7.f17920a);
            return s10 + i11;
        }
        throw k7.b();
    }

    public static int q(byte[] bArr, int i10, a6 a6Var) {
        int s10 = s(bArr, i10, a6Var);
        int i11 = a6Var.f17714a;
        if (i11 >= 0) {
            if (i11 == 0) {
                a6Var.f17716c = "";
                return s10;
            }
            d.d dVar = k9.f17960a;
            int length = bArr.length;
            if ((s10 | i11 | ((length - s10) - i11)) >= 0) {
                int i12 = s10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (s10 < i12) {
                    byte b10 = bArr[s10];
                    if (!(b10 >= 0)) {
                        break;
                    }
                    s10++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                while (s10 < i12) {
                    int i14 = s10 + 1;
                    byte b11 = bArr[s10];
                    if (b11 >= 0) {
                        int i15 = i13 + 1;
                        cArr[i13] = (char) b11;
                        s10 = i14;
                        while (true) {
                            i13 = i15;
                            if (s10 >= i12) {
                                break;
                            }
                            byte b12 = bArr[s10];
                            if (!(b12 >= 0)) {
                                break;
                            }
                            s10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    } else if (b11 < -32) {
                        if (i14 < i12) {
                            int i16 = i14 + 1;
                            int i17 = i13 + 1;
                            byte b13 = bArr[i14];
                            if (b11 < -62 || a.e(b13)) {
                                throw k7.a();
                            }
                            cArr[i13] = (char) (((b11 & 31) << 6) | (b13 & 63));
                            s10 = i16;
                            i13 = i17;
                        } else {
                            throw k7.a();
                        }
                    } else if (b11 < -16) {
                        if (i14 < i12 - 1) {
                            int i18 = i14 + 1;
                            int i19 = i18 + 1;
                            int i20 = i13 + 1;
                            byte b14 = bArr[i14];
                            byte b15 = bArr[i18];
                            if (!a.e(b14)) {
                                if (b11 == -32) {
                                    if (b14 >= -96) {
                                        b11 = -32;
                                    }
                                }
                                if (b11 == -19) {
                                    if (b14 < -96) {
                                        b11 = -19;
                                    }
                                }
                                if (!a.e(b15)) {
                                    cArr[i13] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                    s10 = i19;
                                    i13 = i20;
                                }
                            }
                            throw k7.a();
                        }
                        throw k7.a();
                    } else if (i14 < i12 - 2) {
                        int i21 = i14 + 1;
                        int i22 = i21 + 1;
                        int i23 = i22 + 1;
                        byte b16 = bArr[i14];
                        byte b17 = bArr[i21];
                        byte b18 = bArr[i22];
                        if (a.e(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || a.e(b17) || a.e(b18)) {
                            throw k7.a();
                        }
                        int i24 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                        cArr[i13] = (char) ((i24 >>> 10) + 55232);
                        cArr[i13 + 1] = (char) ((i24 & 1023) + 56320);
                        i13 += 2;
                        s10 = i23;
                    } else {
                        throw k7.a();
                    }
                }
                a6Var.f17716c = new String(cArr, 0, i13);
                return i12;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(s10), Integer.valueOf(i11)));
        }
        throw k7.b();
    }

    public static int r(int i10, byte[] bArr, int i11, int i12, a9 a9Var, a6 a6Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int v10 = v(bArr, i11, a6Var);
                a9Var.c(i10, Long.valueOf(a6Var.f17715b));
                return v10;
            } else if (i13 == 1) {
                a9Var.c(i10, Long.valueOf(w(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int s10 = s(bArr, i11, a6Var);
                int i14 = a6Var.f17714a;
                if (i14 < 0) {
                    throw k7.b();
                }
                if (i14 > bArr.length - s10) {
                    throw k7.d();
                }
                a9Var.c(i10, i14 == 0 ? g6.f17877t : g6.p(bArr, s10, i14));
                return s10 + i14;
            } else if (i13 != 3) {
                if (i13 != 5) {
                    throw new k7("Protocol message contained an invalid tag (zero).");
                }
                a9Var.c(i10, Integer.valueOf(f(bArr, i11)));
                return i11 + 4;
            } else {
                int i15 = (i10 & (-8)) | 4;
                a9 b10 = a9.b();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int s11 = s(bArr, i11, a6Var);
                    int i17 = a6Var.f17714a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = s11;
                        break;
                    }
                    int r10 = r(i16, bArr, s11, i12, b10, a6Var);
                    i16 = i17;
                    i11 = r10;
                }
                if (i11 > i12 || i16 != i15) {
                    throw k7.c();
                }
                a9Var.c(i10, b10);
                return i11;
            }
        }
        throw new k7("Protocol message contained an invalid tag (zero).");
    }

    public static int s(byte[] bArr, int i10, a6 a6Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            a6Var.f17714a = b10;
            return i11;
        }
        return t(b10, bArr, i11, a6Var);
    }

    public static int t(int i10, byte[] bArr, int i11, a6 a6Var) {
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
                                a6Var.f17714a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            a6Var.f17714a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        a6Var.f17714a = i14 | i13;
        return i15;
    }

    public static int u(int i10, byte[] bArr, int i11, int i12, h7 h7Var, a6 a6Var) {
        d7 d7Var = (d7) h7Var;
        int s10 = s(bArr, i11, a6Var);
        while (true) {
            d7Var.h(a6Var.f17714a);
            if (s10 >= i12) {
                break;
            }
            int s11 = s(bArr, s10, a6Var);
            if (i10 != a6Var.f17714a) {
                break;
            }
            s10 = s(bArr, s11, a6Var);
        }
        return s10;
    }

    public static int v(byte[] bArr, int i10, a6 a6Var) {
        byte b10;
        int i11 = i10 + 1;
        long j3 = bArr[i10];
        if (j3 >= 0) {
            a6Var.f17715b = j3;
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
        a6Var.f17715b = j10;
        return i12;
    }

    public static long w(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public void a(l lVar, float f10, float f11) {
        throw null;
    }

    @Override // m4.j00
    public Object b(JSONObject jSONObject) {
        Charset charset = l00.f10625a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(l00.f10625a));
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public Object mo30h(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        g1.a("Ad request signals:");
        g1.a(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((p) obj).v2();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return aa.f17726t.zza().H();
    }
}
