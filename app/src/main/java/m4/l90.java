package m4;

import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Array;
import javax.annotation.ParametersAreNonnullByDefault;
import t3.l;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class l90 implements ar0 {

    /* renamed from: s */
    public static final /* synthetic */ l90 f10681s = new l90();

    /* renamed from: t */
    public static final l f10682t = new l(2);

    public static int a(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
            return i10 != 3 ? 0 : 4;
        }
        return 1;
    }

    public static void b(long j3, dd ddVar, mp2[] mp2VarArr) {
        int i10;
        int i11;
        while (true) {
            boolean z10 = true;
            if (ddVar.zza() > 1) {
                int i12 = 0;
                while (true) {
                    if (ddVar.zza() != 0) {
                        int q10 = ddVar.q();
                        i12 += q10;
                        if (q10 != 255) {
                            i10 = i12;
                            break;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (ddVar.zza() != 0) {
                        int q11 = ddVar.q();
                        i13 += q11;
                        if (q11 != 255) {
                            break;
                        }
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                int i14 = ddVar.f7309b + i13;
                if (i13 == -1 || i13 > ddVar.zza()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = ddVar.f7310c;
                } else if (i10 == 4 && i13 >= 8) {
                    int q12 = ddVar.q();
                    int t10 = ddVar.t();
                    if (t10 == 49) {
                        i11 = ddVar.l();
                        t10 = 49;
                    } else {
                        i11 = 0;
                    }
                    int q13 = ddVar.q();
                    if (t10 == 47) {
                        ddVar.i(1);
                        t10 = 47;
                    }
                    boolean z11 = q12 == 181 && (t10 == 49 || t10 == 47) && q13 == 3;
                    if (t10 == 49) {
                        if (i11 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        d(j3, ddVar, mp2VarArr);
                    }
                }
                ddVar.h(i14);
            } else {
                return;
            }
        }
    }

    public static boolean c(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !c((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!d4.l.a(Array.get(obj, i10), Array.get(obj2, i10))) {
                            return false;
                        }
                    }
                    continue;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void d(long j3, dd ddVar, mp2[] mp2VarArr) {
        int q10 = ddVar.q();
        if ((q10 & 64) != 0) {
            ddVar.i(1);
            int i10 = (q10 & 31) * 3;
            int i11 = ddVar.f7309b;
            for (mp2 mp2Var : mp2VarArr) {
                ddVar.h(i11);
                mp2Var.b(ddVar, i10);
                if (j3 != -9223372036854775807L) {
                    mp2Var.e(j3, 1, i10, 0, null);
                }
            }
        }
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((js0) obj).B0();
    }
}
