package m4;

import f3.m;
import java.util.Arrays;
import java.util.Objects;
import n9.d;

@Deprecated
/* loaded from: classes.dex */
public final class h32 implements ar0 {

    /* renamed from: s */
    public static final byte[] f9099s = {0, 0, 0, 1};

    /* renamed from: t */
    public static final int[] f9100t = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: u */
    public static final int[] f9101u = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: v */
    public static final gl0 f9102v = new gl0(0);

    /* renamed from: w */
    public static final /* synthetic */ h32 f9103w = new h32();

    /* renamed from: x */
    public static final qh0 f9104x = new qh0(1);
    public static final m31 y = new m31(1);

    public static ln0 a(uo2 uo2Var, boolean z10) {
        hu1 hu1Var;
        if (z10) {
            hu1Var = null;
        } else {
            int i10 = dr2.f7615a;
            hu1Var = hu1.f9455v;
        }
        ln0 a10 = new b00().a(uo2Var, hu1Var);
        if (a10 == null || a10.f10943s.length == 0) {
            return null;
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<m4.y02, java.util.List<m4.x02<P>>>] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m4.a12<?, ?>>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m4.a12<?, ?>>] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<m4.y02, java.util.List<m4.x02<P>>>] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<m4.y02, java.util.List<m4.x02<P>>>] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.n02 b(m4.h7 r15) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.h32.b(m4.h7):m4.n02");
    }

    public static u8 c(dd ddVar) {
        ddVar.i(1);
        int r10 = ddVar.r();
        long j3 = ddVar.f7309b + r10;
        int i10 = r10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long v10 = ddVar.v();
            if (v10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = v10;
            jArr2[i11] = ddVar.v();
            ddVar.i(2);
            i11++;
        }
        ddVar.i((int) (j3 - ddVar.f7309b));
        return new u8(jArr, jArr2);
    }

    public static int d(qg qgVar) {
        int a10 = qgVar.a(4);
        if (a10 == 15) {
            return qgVar.a(24);
        }
        d.g(a10 < 13);
        return f9100t[a10];
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        Objects.requireNonNull((m.a) obj);
    }
}
