package m4;

import android.content.Context;
import android.os.Trace;
import java.io.EOFException;
import java.util.concurrent.TimeUnit;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public class wo2 implements vd, ar0, zh2 {

    /* renamed from: s */
    public static final uj0 f15079s = new uj0();

    /* renamed from: t */
    public static final /* synthetic */ wo2 f15080t = new wo2();

    /* renamed from: u */
    public static final t01 f15081u = new t01();

    /* renamed from: v */
    public static final io1 f15082v = new io1();

    /* renamed from: w */
    public static final /* synthetic */ wo2 f15083w = new wo2();

    public static String a(n82 n82Var) {
        String str;
        StringBuilder sb = new StringBuilder(n82Var.k());
        for (int i10 = 0; i10 < n82Var.k(); i10++) {
            int g10 = n82Var.g(i10);
            if (g10 == 34) {
                str = "\\\"";
            } else if (g10 == 39) {
                str = "\\'";
            } else if (g10 != 92) {
                switch (g10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (g10 < 32 || g10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((g10 >>> 6) & 3) + 48));
                            sb.append((char) (((g10 >>> 3) & 7) + 48));
                            g10 = (g10 & 7) + 48;
                        }
                        sb.append((char) g10);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static k6 b(Context context, String str, String str2) {
        k6 k6Var;
        try {
            k6Var = new ds1(context, str, str2).f7629d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            k6Var = null;
        }
        return k6Var == null ? ds1.a() : k6Var;
    }

    public static void c(String str) {
        if (wg.f14958a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static int d(int i10) {
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
            return i10 != 4 ? 0 : 6;
        }
        return 2;
    }

    public static void e() {
        if (wg.f14958a >= 18) {
            Trace.endSection();
        }
    }

    @Pure
    public static void f(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw mq.a(str, null);
    }

    public static boolean g(uo2 uo2Var, byte[] bArr, int i10, boolean z10) {
        try {
            return uo2Var.o(bArr, 0, i10, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            return false;
        }
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((ym) obj).N();
    }
}
