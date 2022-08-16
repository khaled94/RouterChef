package m4;

import android.content.Context;
import androidx.activity.k;
import c5.a;
import c5.i;
import f3.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ql implements r92, yl0, a {

    /* renamed from: s */
    public static final uh f12910s = new uh();

    /* renamed from: t */
    public static final ag0 f12911t = new ag0(0);

    /* renamed from: u */
    public static final ak0 f12912u = new ak0(0);

    /* renamed from: v */
    public static final /* synthetic */ ql f12913v = new ql();

    /* renamed from: w */
    public static final /* synthetic */ ql f12914w = new ql();

    public static on a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dm1 dm1Var = (dm1) it.next();
            if (dm1Var.f7551c) {
                arrayList.add(e.f4499o);
            } else {
                arrayList.add(new e(dm1Var.f7549a, dm1Var.f7550b));
            }
        }
        return new on(context, (e[]) arrayList.toArray(new e[arrayList.size()]));
    }

    public static int b(@CheckForNull Object obj, @CheckForNull Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int i11;
        int i12;
        int d5 = zv1.d(obj);
        int i13 = d5 & i10;
        int c10 = c(obj3, i13);
        if (c10 != 0) {
            int i14 = ~i10;
            int i15 = d5 & i14;
            int i16 = -1;
            while (true) {
                i11 = c10 - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !js.a(obj, objArr[i11]) || (objArr2 != null && !js.a(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    c10 = i17;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                g(obj3, i13, i18);
            } else {
                iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            }
            return i11;
        }
        return -1;
    }

    public static int c(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static dm1 e(on onVar) {
        return onVar.A ? new dm1(-3, 0, true) : new dm1(onVar.f12224w, onVar.f12221t, false);
    }

    public static Object f(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(k.a(52, "must be power of 2 between 2^1 and 2^30: ", i10));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static void g(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    @Override // c5.a
    public Object d(i iVar) {
        return Boolean.valueOf(iVar.n());
    }

    @Override // m4.yl0
    public lq zza() {
        return null;
    }
}
