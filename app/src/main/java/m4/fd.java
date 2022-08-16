package m4;

import android.util.Pair;
import n9.d;

/* loaded from: classes.dex */
public final class fd {

    /* renamed from: a */
    public static final int f8403a = wg.c("vide");

    /* renamed from: b */
    public static final int f8404b = wg.c("soun");

    /* renamed from: c */
    public static final int f8405c = wg.c("text");

    /* renamed from: d */
    public static final int f8406d = wg.c("sbtl");

    /* renamed from: e */
    public static final int f8407e = wg.c("subt");

    /* renamed from: f */
    public static final int f8408f = wg.c("clcp");

    /* renamed from: g */
    public static final int f8409g = wg.c("cenc");

    /* renamed from: h */
    public static final int f8410h = wg.c("meta");

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r8 == 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x07d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.od a(m4.xc r66, m4.yc r67, long r68, m4.fc r70, boolean r71) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.fd.a(m4.xc, m4.yc, long, m4.fc, boolean):m4.od");
    }

    public static int b(rg rgVar) {
        int c10 = rgVar.c();
        int i10 = c10 & 127;
        while ((c10 & 128) == 128) {
            c10 = rgVar.c();
            i10 = (i10 << 7) | (c10 & 127);
        }
        return i10;
    }

    public static int c(rg rgVar, int i10, int i11, cd cdVar, int i12) {
        int i13 = rgVar.f13268b;
        while (true) {
            boolean z10 = false;
            if (i13 - i10 < i11) {
                rgVar.n(i13);
                int b10 = rgVar.b();
                d.h(b10 > 0, "childAtomSize should be positive");
                if (rgVar.b() == zc.W) {
                    int i14 = i13 + 8;
                    Pair pair = null;
                    boolean z11 = false;
                    Integer num = null;
                    pd pdVar = null;
                    while (i14 - i13 < b10) {
                        rgVar.n(i14);
                        int b11 = rgVar.b();
                        int b12 = rgVar.b();
                        if (b12 == zc.f16099c0) {
                            num = Integer.valueOf(rgVar.b());
                        } else if (b12 == zc.X) {
                            rgVar.o(4);
                            z11 = rgVar.b() == f8409g;
                        } else if (b12 == zc.Y) {
                            int i15 = i14 + 8;
                            while (true) {
                                if (i15 - i14 >= b11) {
                                    pdVar = null;
                                    break;
                                }
                                rgVar.n(i15);
                                int b13 = rgVar.b();
                                if (rgVar.b() == zc.Z) {
                                    rgVar.o(6);
                                    rgVar.c();
                                    int c10 = rgVar.c();
                                    byte[] bArr = new byte[16];
                                    rgVar.j(bArr, 0, 16);
                                    pdVar = new pd(c10, bArr);
                                    break;
                                }
                                i15 += b13;
                            }
                        }
                        i14 += b11;
                    }
                    if (z11) {
                        d.h(num != null, "frma atom is mandatory");
                        if (pdVar != null) {
                            z10 = true;
                        }
                        d.h(z10, "schi->tenc atom is mandatory");
                        pair = Pair.create(num, pdVar);
                    }
                    if (pair != null) {
                        ((pd[]) cdVar.f6786c)[i12] = (pd) pair.second;
                        return ((Integer) pair.first).intValue();
                    }
                }
                i13 += b10;
            } else {
                return 0;
            }
        }
    }

    public static Pair<String, byte[]> d(rg rgVar, int i10) {
        rgVar.n(i10 + 12);
        rgVar.o(1);
        b(rgVar);
        rgVar.o(2);
        int c10 = rgVar.c();
        if ((c10 & 128) != 0) {
            rgVar.o(2);
        }
        if ((c10 & 64) != 0) {
            rgVar.o(rgVar.e());
        }
        if ((c10 & 32) != 0) {
            rgVar.o(2);
        }
        rgVar.o(1);
        b(rgVar);
        int c11 = rgVar.c();
        String str = null;
        if (c11 == 32) {
            str = "video/mp4v-es";
        } else if (c11 == 33) {
            str = "video/avc";
        } else if (c11 != 35) {
            if (c11 != 64) {
                if (c11 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (c11 == 165) {
                    str = "audio/ac3";
                } else if (c11 != 166) {
                    switch (c11) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (c11) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        rgVar.o(12);
        rgVar.o(1);
        int b10 = b(rgVar);
        byte[] bArr = new byte[b10];
        rgVar.j(bArr, 0, b10);
        return Pair.create(str, bArr);
    }
}
