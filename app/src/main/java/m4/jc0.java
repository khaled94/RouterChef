package m4;

import android.content.Context;
import androidx.fragment.app.b1;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class jc0 implements lx<fb0> {

    /* renamed from: s */
    public boolean f9904s;

    public static int b(Context context, Map<String, String> map, String str, int i10) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                g90 g90Var = io.f9708f.f9709a;
                i10 = g90.j(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str2.length() + str.length() + 34);
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                g1.j(sb.toString());
            }
        }
        if (g1.c()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            b1.b(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i10);
            sb2.append(".");
            g1.a(sb2.toString());
        }
        return i10;
    }

    public static void c(ta0 ta0Var, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                ta0Var.y.C(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                g1.j(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            ta0Var.y.B(Integer.parseInt(str2));
        }
        if (str3 != null) {
            ta0Var.y.z(Integer.parseInt(str3));
        }
        if (str4 != null) {
            ta0Var.y.A(Integer.parseInt(str4));
        }
        if (str5 != null) {
            ta0Var.y.a(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:209|(1:(9:212|219|(1:221)(3:223|(1:225)|226)|227|246|228|229|231|(2:242|(2:244|245)(1:276))(4:235|(1:237)|238|(2:240|241)(1:275)))(1:213))(3:214|(1:216)|217)|218|219|(0)(0)|227|246|228|229|231|(1:233)|242|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0462, code lost:
        if (r3 == (-1)) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04a4, code lost:
        r14 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    @Override // m4.lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(m4.fb0 r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.jc0.a(java.lang.Object, java.util.Map):void");
    }
}
