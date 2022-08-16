package m4;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class r01 {

    /* renamed from: a */
    public static final xf0 f13085a = new xf0(1);

    /* renamed from: b */
    public static final ak0 f13086b = new ak0(1);

    /* renamed from: c */
    public static final m31 f13087c = new m31(0);

    /* renamed from: d */
    public static final xf0 f13088d = new xf0(3);

    /* renamed from: e */
    public static final gl0 f13089e = new gl0(1);

    /* renamed from: f */
    public static final int[] f13090f = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: g */
    public static final int[] f13091g = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: h */
    public static final int[] f13092h = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int a(int i10) {
        if (i10 != 1) {
            return i10 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Pure
    public static int b(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    public static int c(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 3;
            }
            if (i10 == 2) {
                return 4;
            }
            if (i10 == 3) {
                return 5;
            }
            if (i10 == 4) {
                return 6;
            }
            return i10 != 5 ? 0 : 7;
        }
        return 2;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static Object d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static boolean e() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    @Pure
    public static void f(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @Pure
    public static void g(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @Pure
    public static void h(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }
}
