package m4;

import s4.aa;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements ar0, d1 {

    /* renamed from: s */
    public static final bk0 f10243s = new bk0(0);

    /* renamed from: t */
    public static final /* synthetic */ k2 f10244t = new k2();

    /* renamed from: u */
    public static final String[] f10245u = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: v */
    public static final int[] f10246v = {44100, 48000, 32000};

    /* renamed from: w */
    public static final int[] f10247w = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: x */
    public static final int[] f10248x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] y = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: z */
    public static final int[] f10249z = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] A = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final /* synthetic */ k2 B = new k2();

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f10246v[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f10247w[i13 - 1] : f10248x[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? y[i13 - 1] : f10249z[i13 - 1] : A[i13 - 1];
        int i18 = 144;
        if (i11 == 3) {
            return f82.a(i17, 144, i15, i16);
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return f82.a(i18, i17, i15, i16);
    }

    public static boolean c(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((to0) obj).i();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().C());
    }
}
