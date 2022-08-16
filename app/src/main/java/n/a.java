package n;

import a6.d;
import a6.e;
import a6.g;
import a6.i;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import s4.aa;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class a implements d1 {

    /* renamed from: s */
    public static final /* synthetic */ a f16395s = new a();

    public static d a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new i();
            }
            return new e();
        }
        return new i();
    }

    public static void b(View view, g gVar) {
        r5.a aVar = gVar.f191s.f200b;
        if (aVar != null && aVar.f17256a) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                f10 += z.i.i((View) parent);
            }
            g.b bVar = gVar.f191s;
            if (bVar.f211m == f10) {
                return;
            }
            bVar.f211m = f10;
            gVar.w();
        }
    }

    public static int c(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static String d(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] e(String str, boolean z10) {
        byte[] decode = Base64.decode(str, true != z10 ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().g());
    }
}
