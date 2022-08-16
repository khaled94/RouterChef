package m4;

import android.util.SparseArray;
import androidx.fragment.app.a;
import e1.h;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import l0.e;

/* loaded from: classes.dex */
public final class uc implements ic {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    public static final byte[] f14332a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0 */
    public static final UUID f14333b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public e A;
    public e B;
    public boolean C;
    public int D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int[] I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public byte R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public se X;
    public final qc Y;

    /* renamed from: m */
    public ByteBuffer f14346m;

    /* renamed from: n */
    public long f14347n;

    /* renamed from: s */
    public tc f14351s;

    /* renamed from: t */
    public boolean f14352t;

    /* renamed from: u */
    public int f14353u;

    /* renamed from: v */
    public long f14354v;

    /* renamed from: w */
    public boolean f14355w;

    /* renamed from: o */
    public long f14348o = -1;
    public long p = -9223372036854775807L;

    /* renamed from: q */
    public long f14349q = -9223372036854775807L;

    /* renamed from: r */
    public long f14350r = -9223372036854775807L;

    /* renamed from: x */
    public long f14356x = -1;
    public long y = -1;

    /* renamed from: z */
    public long f14357z = -9223372036854775807L;

    /* renamed from: c */
    public final boolean f14336c = true;

    /* renamed from: a */
    public final wc f14334a = new wc();

    /* renamed from: b */
    public final SparseArray<tc> f14335b = new SparseArray<>();

    /* renamed from: f */
    public final rg f14339f = new rg(4);

    /* renamed from: g */
    public final rg f14340g = new rg(ByteBuffer.allocate(4).putInt(-1).array());

    /* renamed from: h */
    public final rg f14341h = new rg(4);

    /* renamed from: d */
    public final rg f14337d = new rg(h.f4357s);

    /* renamed from: e */
    public final rg f14338e = new rg(4);

    /* renamed from: i */
    public final rg f14342i = new rg();

    /* renamed from: j */
    public final rg f14343j = new rg();

    /* renamed from: k */
    public final rg f14344k = new rg(8);

    /* renamed from: l */
    public final rg f14345l = new rg();

    public uc() {
        qc qcVar = new qc();
        this.Y = qcVar;
        qcVar.f12775g = new rc(this, null);
    }

    public final void a(int i10, double d5) {
        if (i10 == 181) {
            this.f14351s.I = (int) d5;
        } else if (i10 == 17545) {
            this.f14349q = (long) d5;
        } else {
            switch (i10) {
                case 21969:
                    this.f14351s.f14019w = (float) d5;
                    return;
                case 21970:
                    this.f14351s.f14020x = (float) d5;
                    return;
                case 21971:
                    this.f14351s.y = (float) d5;
                    return;
                case 21972:
                    this.f14351s.f14021z = (float) d5;
                    return;
                case 21973:
                    this.f14351s.A = (float) d5;
                    return;
                case 21974:
                    this.f14351s.B = (float) d5;
                    return;
                case 21975:
                    this.f14351s.C = (float) d5;
                    return;
                case 21976:
                    this.f14351s.D = (float) d5;
                    return;
                case 21977:
                    this.f14351s.E = (float) d5;
                    return;
                case 21978:
                    this.f14351s.F = (float) d5;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // m4.ic
    public final void b(long j3, long j10) {
        this.f14357z = -9223372036854775807L;
        this.D = 0;
        qc qcVar = this.Y;
        qcVar.f12772d = 0;
        qcVar.f12770b.clear();
        wc wcVar = qcVar.f12771c;
        wcVar.f14931b = 0;
        wcVar.f14932c = 0;
        wc wcVar2 = this.f14334a;
        wcVar2.f14931b = 0;
        wcVar2.f14932c = 0;
        k();
    }

    public final void c(int i10, long j3) {
        if (i10 == 20529) {
            if (j3 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j3);
            sb.append(" not supported");
            throw new wa(sb.toString());
        } else if (i10 == 20530) {
            if (j3 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j3);
            sb2.append(" not supported");
            throw new wa(sb2.toString());
        } else {
            boolean z10 = false;
            switch (i10) {
                case 131:
                    this.f14351s.f14000c = (int) j3;
                    return;
                case 136:
                    tc tcVar = this.f14351s;
                    if (j3 == 1) {
                        z10 = true;
                    }
                    tcVar.L = z10;
                    return;
                case 155:
                    this.F = i(j3);
                    return;
                case 159:
                    this.f14351s.G = (int) j3;
                    return;
                case 176:
                    this.f14351s.f14007j = (int) j3;
                    return;
                case 179:
                    this.A.d(i(j3));
                    return;
                case 186:
                    this.f14351s.f14008k = (int) j3;
                    return;
                case 215:
                    this.f14351s.f13999b = (int) j3;
                    return;
                case 231:
                    this.f14357z = i(j3);
                    return;
                case 241:
                    if (this.C) {
                        return;
                    }
                    this.B.d(j3);
                    this.C = true;
                    return;
                case 251:
                    this.W = true;
                    return;
                case 16980:
                    if (j3 == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j3);
                    sb3.append(" not supported");
                    throw new wa(sb3.toString());
                case 17029:
                    if (j3 >= 1 && j3 <= 2) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j3);
                    sb4.append(" not supported");
                    throw new wa(sb4.toString());
                case 17143:
                    if (j3 == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j3);
                    sb5.append(" not supported");
                    throw new wa(sb5.toString());
                case 18401:
                    if (j3 == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j3);
                    sb6.append(" not supported");
                    throw new wa(sb6.toString());
                case 18408:
                    if (j3 == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j3);
                    sb7.append(" not supported");
                    throw new wa(sb7.toString());
                case 21420:
                    this.f14354v = j3 + this.f14348o;
                    return;
                case 21432:
                    int i11 = (int) j3;
                    if (i11 == 0) {
                        this.f14351s.p = 0;
                        return;
                    } else if (i11 == 1) {
                        this.f14351s.p = 2;
                        return;
                    } else if (i11 == 3) {
                        this.f14351s.p = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.f14351s.p = 3;
                        return;
                    }
                case 21680:
                    this.f14351s.f14009l = (int) j3;
                    return;
                case 21682:
                    this.f14351s.f14011n = (int) j3;
                    return;
                case 21690:
                    this.f14351s.f14010m = (int) j3;
                    return;
                case 21930:
                    tc tcVar2 = this.f14351s;
                    if (j3 == 1) {
                        z10 = true;
                    }
                    tcVar2.M = z10;
                    return;
                case 22186:
                    this.f14351s.J = j3;
                    return;
                case 22203:
                    this.f14351s.K = j3;
                    return;
                case 25188:
                    this.f14351s.H = (int) j3;
                    return;
                case 2352003:
                    this.f14351s.f14001d = (int) j3;
                    return;
                case 2807729:
                    this.p = j3;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            int i12 = (int) j3;
                            if (i12 == 1) {
                                this.f14351s.f14016t = 2;
                                return;
                            } else if (i12 != 2) {
                                return;
                            } else {
                                this.f14351s.f14016t = 1;
                                return;
                            }
                        case 21946:
                            int i13 = (int) j3;
                            if (i13 != 1) {
                                if (i13 == 16) {
                                    this.f14351s.f14015s = 6;
                                    return;
                                } else if (i13 == 18) {
                                    this.f14351s.f14015s = 7;
                                    return;
                                } else if (i13 != 6 && i13 != 7) {
                                    return;
                                }
                            }
                            this.f14351s.f14015s = 3;
                            return;
                        case 21947:
                            tc tcVar3 = this.f14351s;
                            tcVar3.f14013q = true;
                            int i14 = (int) j3;
                            if (i14 == 1) {
                                tcVar3.f14014r = 1;
                                return;
                            } else if (i14 == 9) {
                                tcVar3.f14014r = 6;
                                return;
                            } else if (i14 != 4 && i14 != 5 && i14 != 6 && i14 != 7) {
                                return;
                            } else {
                                tcVar3.f14014r = 2;
                                return;
                            }
                        case 21948:
                            this.f14351s.f14017u = (int) j3;
                            return;
                        case 21949:
                            this.f14351s.f14018v = (int) j3;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    @Override // m4.ic
    public final void d(se seVar) {
        this.X = seVar;
    }

    @Override // m4.ic
    public final boolean e(hc hcVar) {
        long a10;
        int i10;
        vc vcVar = new vc();
        long j3 = hcVar.f9182b;
        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i12 = (int) j10;
        hcVar.b(vcVar.f14658a.f13267a, 0, 4);
        vcVar.f14659b = 4;
        for (long g10 = vcVar.f14658a.g(); g10 != 440786851; g10 = ((g10 << 8) & (-256)) | (vcVar.f14658a.f13267a[0] & 255)) {
            int i13 = vcVar.f14659b + 1;
            vcVar.f14659b = i13;
            if (i13 == i12) {
                return false;
            }
            hcVar.b(vcVar.f14658a.f13267a, 0, 1);
        }
        long a11 = vcVar.a(hcVar);
        long j11 = vcVar.f14659b;
        if (a11 != Long.MIN_VALUE) {
            if (i11 != 0 && j11 + a11 >= j3) {
                return false;
            }
            while (true) {
                int i14 = (vcVar.f14659b > (j11 + a11) ? 1 : (vcVar.f14659b == (j11 + a11) ? 0 : -1));
                if (i14 >= 0) {
                    return i14 == 0;
                } else if (vcVar.a(hcVar) == Long.MIN_VALUE || (a10 = vcVar.a(hcVar)) < 0) {
                    return false;
                } else {
                    if (i10 != 0) {
                        hcVar.a((int) a10);
                        vcVar.f14659b = (int) (vcVar.f14659b + a10);
                    }
                }
            }
        } else {
            return false;
        }
    }

    @Override // m4.ic
    public final int f(hc hcVar, lc lcVar) {
        this.V = false;
        while (!this.V) {
            if (!this.Y.a(hcVar)) {
                return -1;
            }
            long j3 = hcVar.f9183c;
            if (this.f14355w) {
                this.y = j3;
                lcVar.f10709a = this.f14356x;
                this.f14355w = false;
                return 1;
            } else if (this.f14352t) {
                long j10 = this.y;
                if (j10 != -1) {
                    lcVar.f10709a = j10;
                    this.y = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    public final void g(int i10, String str) {
        if (i10 == 134) {
            this.f14351s.f13998a = str;
        } else if (i10 != 17026) {
            if (i10 != 2274716) {
                return;
            }
            this.f14351s.N = str;
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new wa(a.b(new StringBuilder(str.length() + 22), "DocType ", str, " not supported"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r12, int r13, m4.hc r14) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.uc.h(int, int, m4.hc):void");
    }

    public final long i(long j3) {
        long j10 = this.p;
        if (j10 != -9223372036854775807L) {
            return wg.f(j3, j10, 1000L);
        }
        throw new wa("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void j(tc tcVar, long j3) {
        byte[] bArr;
        int i10;
        if ("S_TEXT/UTF8".equals(tcVar.f13998a)) {
            byte[] bArr2 = this.f14343j.f13267a;
            long j10 = this.F;
            if (j10 == -9223372036854775807L) {
                bArr = f14332a0;
            } else {
                int i11 = (int) (j10 / 3600000000L);
                long j11 = j10 - (i11 * 3600000000L);
                int i12 = (int) (j11 / 60000000);
                long j12 = j11 - (60000000 * i12);
                String format = String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) (j12 / 1000000)), Integer.valueOf((int) ((j12 - (i10 * 1000000)) / 1000)));
                int i13 = wg.f14958a;
                bArr = format.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            hf hfVar = tcVar.O;
            rg rgVar = this.f14343j;
            hfVar.b(rgVar, rgVar.f13269c);
            this.U += this.f14343j.f13269c;
        }
        tcVar.O.c(j3, this.L, this.U, tcVar.f14004g);
        this.V = true;
        k();
    }

    public final void k() {
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = (byte) 0;
        this.P = false;
        rg rgVar = this.f14342i;
        rgVar.f13268b = 0;
        rgVar.f13269c = 0;
    }

    public final int l(hc hcVar, hf hfVar, int i10) {
        int i11;
        rg rgVar = this.f14342i;
        int i12 = rgVar.f13269c - rgVar.f13268b;
        if (i12 > 0) {
            i11 = Math.min(i10, i12);
            hfVar.b(this.f14342i, i11);
        } else {
            i11 = hfVar.d(hcVar, i10);
        }
        this.M += i11;
        this.U += i11;
        return i11;
    }

    public final void m(hc hcVar, int i10) {
        rg rgVar = this.f14339f;
        if (rgVar.f13269c >= i10) {
            return;
        }
        if (rgVar.a() < i10) {
            rg rgVar2 = this.f14339f;
            byte[] bArr = rgVar2.f13267a;
            int length = bArr.length;
            rgVar2.l(Arrays.copyOf(bArr, Math.max(length + length, i10)), this.f14339f.f13269c);
        }
        rg rgVar3 = this.f14339f;
        byte[] bArr2 = rgVar3.f13267a;
        int i11 = rgVar3.f13269c;
        hcVar.c(bArr2, i11, i10 - i11, false);
        this.f14339f.m(i10);
    }

    public final void n(hc hcVar, tc tcVar, int i10) {
        int i11;
        if ("S_TEXT/UTF8".equals(tcVar.f13998a)) {
            int i12 = i10 + 32;
            if (this.f14343j.a() < i12) {
                this.f14343j.f13267a = Arrays.copyOf(Z, i12 + i10);
            }
            hcVar.c(this.f14343j.f13267a, 32, i10, false);
            this.f14343j.n(0);
            this.f14343j.m(i12);
            return;
        }
        hf hfVar = tcVar.O;
        if (!this.N) {
            if (tcVar.f14002e) {
                this.L &= -1073741825;
                int i13 = 128;
                if (!this.O) {
                    hcVar.c(this.f14339f.f13267a, 0, 1, false);
                    this.M++;
                    byte b10 = this.f14339f.f13267a[0];
                    if ((b10 & 128) == 128) {
                        throw new wa("Extension bit is set in signal byte");
                    }
                    this.R = b10;
                    this.O = true;
                }
                byte b11 = this.R;
                if ((b11 & 1) == 1) {
                    int i14 = b11 & 2;
                    this.L |= 1073741824;
                    if (!this.P) {
                        hcVar.c(this.f14344k.f13267a, 0, 8, false);
                        this.M += 8;
                        this.P = true;
                        rg rgVar = this.f14339f;
                        byte[] bArr = rgVar.f13267a;
                        if (i14 != 2) {
                            i13 = 0;
                        }
                        bArr[0] = (byte) (i13 | 8);
                        rgVar.n(0);
                        hfVar.b(this.f14339f, 1);
                        this.U++;
                        this.f14344k.n(0);
                        hfVar.b(this.f14344k, 8);
                        this.U += 8;
                    }
                    if (i14 == 2) {
                        if (!this.Q) {
                            hcVar.c(this.f14339f.f13267a, 0, 1, false);
                            this.M++;
                            this.f14339f.n(0);
                            this.S = this.f14339f.c();
                            this.Q = true;
                        }
                        int i15 = this.S * 4;
                        this.f14339f.k(i15);
                        hcVar.c(this.f14339f.f13267a, 0, i15, false);
                        this.M += i15;
                        int i16 = (this.S >> 1) + 1;
                        int i17 = (i16 * 6) + 2;
                        ByteBuffer byteBuffer = this.f14346m;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f14346m = ByteBuffer.allocate(i17);
                        }
                        this.f14346m.position(0);
                        this.f14346m.putShort((short) i16);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.S;
                            if (i18 >= i11) {
                                break;
                            }
                            int d5 = this.f14339f.d();
                            if (i18 % 2 == 0) {
                                this.f14346m.putShort((short) (d5 - i19));
                            } else {
                                this.f14346m.putInt(d5 - i19);
                            }
                            i18++;
                            i19 = d5;
                        }
                        int i20 = (i10 - this.M) - i19;
                        if ((i11 & 1) == 1) {
                            this.f14346m.putInt(i20);
                        } else {
                            this.f14346m.putShort((short) i20);
                            this.f14346m.putInt(0);
                        }
                        this.f14345l.l(this.f14346m.array(), i17);
                        hfVar.b(this.f14345l, i17);
                        this.U += i17;
                    }
                }
            } else {
                byte[] bArr2 = tcVar.f14003f;
                if (bArr2 != null) {
                    this.f14342i.l(bArr2, bArr2.length);
                }
            }
            this.N = true;
        }
        int i21 = i10 + this.f14342i.f13269c;
        if (!"V_MPEG4/ISO/AVC".equals(tcVar.f13998a) && !"V_MPEGH/ISO/HEVC".equals(tcVar.f13998a)) {
            while (true) {
                int i22 = this.M;
                if (i22 >= i21) {
                    break;
                }
                l(hcVar, hfVar, i21 - i22);
            }
        } else {
            byte[] bArr3 = this.f14338e.f13267a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = tcVar.P;
            int i24 = 4 - i23;
            while (this.M < i21) {
                int i25 = this.T;
                if (i25 == 0) {
                    rg rgVar2 = this.f14342i;
                    int min = Math.min(i23, rgVar2.f13269c - rgVar2.f13268b);
                    hcVar.c(bArr3, i24 + min, i23 - min, false);
                    if (min > 0) {
                        this.f14342i.j(bArr3, i24, min);
                    }
                    this.M += i23;
                    this.f14338e.n(0);
                    this.T = this.f14338e.d();
                    this.f14337d.n(0);
                    hfVar.b(this.f14337d, 4);
                    this.U += 4;
                } else {
                    this.T = i25 - l(hcVar, hfVar, i25);
                }
            }
        }
        if (!"A_VORBIS".equals(tcVar.f13998a)) {
            return;
        }
        this.f14340g.n(0);
        hfVar.b(this.f14340g, 4);
        this.U += 4;
    }
}
