package m4;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bp2 {

    /* renamed from: a */
    public final int f6587a;

    /* renamed from: b */
    public final int f6588b;

    /* renamed from: c */
    public final int f6589c;

    /* renamed from: d */
    public final int f6590d;

    /* renamed from: e */
    public final int f6591e;

    /* renamed from: f */
    public final int f6592f;

    /* renamed from: g */
    public final int f6593g;

    /* renamed from: h */
    public final int f6594h;

    /* renamed from: i */
    public final int f6595i;

    /* renamed from: j */
    public final long f6596j;

    /* renamed from: k */
    public final u8 f6597k;

    /* renamed from: l */
    public final ln0 f6598l;

    public bp2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, u8 u8Var, ln0 ln0Var) {
        this.f6587a = i10;
        this.f6588b = i11;
        this.f6589c = i12;
        this.f6590d = i13;
        this.f6591e = i14;
        this.f6592f = g(i14);
        this.f6593g = i15;
        this.f6594h = i16;
        this.f6595i = f(i16);
        this.f6596j = j3;
        this.f6597k = u8Var;
        this.f6598l = ln0Var;
    }

    public bp2(byte[] bArr, int i10) {
        nl1 nl1Var = new nl1(bArr, bArr.length);
        nl1Var.f(i10 * 8);
        this.f6587a = nl1Var.c(16);
        this.f6588b = nl1Var.c(16);
        this.f6589c = nl1Var.c(24);
        this.f6590d = nl1Var.c(24);
        int c10 = nl1Var.c(20);
        this.f6591e = c10;
        this.f6592f = g(c10);
        this.f6593g = nl1Var.c(3) + 1;
        int c11 = nl1Var.c(5) + 1;
        this.f6594h = c11;
        this.f6595i = f(c11);
        int c12 = nl1Var.c(4);
        int c13 = nl1Var.c(32);
        int i11 = ls1.f10971a;
        this.f6596j = ((c12 & 4294967295L) << 32) | (c13 & 4294967295L);
        this.f6597k = null;
        this.f6598l = null;
    }

    public static int f(int i10) {
        if (i10 != 8) {
            if (i10 == 12) {
                return 2;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 20) {
                return 5;
            }
            return i10 != 24 ? -1 : 6;
        }
        return 1;
    }

    public static int g(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static ln0 h(List<String> list, List<jq2> list2) {
        if (!list.isEmpty() || !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str = list.get(i10);
                int i11 = ls1.f10971a;
                String[] split = str.split("=", 2);
                if (split.length != 2) {
                    Log.w("FlacStreamMetadata", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
                } else {
                    arrayList.add(new mq2(split[0], split[1]));
                }
            }
            arrayList.addAll(list2);
            if (!arrayList.isEmpty()) {
                return new ln0(arrayList);
            }
            return null;
        }
        return null;
    }

    public final long a() {
        long j3 = this.f6596j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f6591e;
    }

    public final long b(long j3) {
        return ls1.u((j3 * this.f6591e) / 1000000, 0L, this.f6596j - 1);
    }

    public final t c(byte[] bArr, ln0 ln0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f6590d;
        if (i10 <= 0) {
            i10 = -1;
        }
        ln0 d5 = d(ln0Var);
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "audio/flac";
        kq2Var.f10543k = i10;
        kq2Var.f10554w = this.f6593g;
        kq2Var.f10555x = this.f6591e;
        kq2Var.f10544l = Collections.singletonList(bArr);
        kq2Var.f10540h = d5;
        return new t(kq2Var);
    }

    public final ln0 d(ln0 ln0Var) {
        ln0 ln0Var2 = this.f6598l;
        return ln0Var2 == null ? ln0Var : ln0Var == null ? ln0Var2 : ln0Var2.a(ln0Var.f10943s);
    }

    public final bp2 e(u8 u8Var) {
        return new bp2(this.f6587a, this.f6588b, this.f6589c, this.f6590d, this.f6591e, this.f6593g, this.f6594h, this.f6596j, u8Var, this.f6598l);
    }
}
