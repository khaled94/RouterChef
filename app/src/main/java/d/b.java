package d;

import android.os.Build;
import android.os.RemoteException;
import androidx.fragment.app.a;
import com.raouf.routerchef.R;
import e9.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import m4.rk1;
import m4.x92;
import m4.zr1;
import n3.g1;
import s4.aa;
import s4.d;
import s4.g;
import s4.k;
import s4.n;
import s4.o;
import s4.r;
import s4.r4;
import v8.e;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public class b implements d1 {

    /* renamed from: s */
    public static final int[] f3662s = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: t */
    public static final int[] f3663t = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: u */
    public static final /* synthetic */ b f3664u = new b();

    public static final Object a(Throwable th) {
        f.e(th, "exception");
        return new e.a(th);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof e.a)) {
            return;
        }
        throw ((e.a) obj).f19831s;
    }

    public static int c(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object d(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ String e(int i10) {
        switch (i10) {
            case 1:
                return "PLATFORM_VERSION_TOO_LOW";
            case 2:
                return "CONTEXT_NOT_AN_ACTIVITY";
            case 3:
                return "CONTEXT_NULL";
            case 4:
                return "CCT_NOT_SUPPORTED";
            case 5:
                return "CCT_READY_TO_OPEN";
            case 6:
                return "ACTIVITY_NOT_FOUND";
            case 7:
                return "EMPTY_URL";
            case 8:
                return "UNKNOWN";
            default:
                return "WRONG_EXP_SETUP";
        }
    }

    public static n f(r4 r4Var) {
        if (r4Var == null) {
            return n.f18009j;
        }
        int B = r4Var.B() - 1;
        if (B == 1) {
            return r4Var.A() ? new r(r4Var.v()) : n.f18015q;
        } else if (B == 2) {
            return r4Var.z() ? new g(Double.valueOf(r4Var.s())) : new g(null);
        } else if (B == 3) {
            return r4Var.y() ? new s4.e(Boolean.valueOf(r4Var.x())) : new s4.e(null);
        } else if (B != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        } else {
            List<r4> w10 = r4Var.w();
            ArrayList arrayList = new ArrayList();
            for (r4 r4Var2 : w10) {
                arrayList.add(f(r4Var2));
            }
            return new o(r4Var.u(), arrayList);
        }
    }

    public static /* bridge */ /* synthetic */ void g(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!o(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !o(b12) && !o(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw x92.d();
    }

    public static void h(AtomicReference atomicReference, rk1 rk1Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            rk1Var.h(obj);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int i(android.content.Context r13, m4.zr1 r14) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.i(android.content.Context, m4.zr1):int");
    }

    public static n j(Object obj) {
        if (obj == null) {
            return n.f18010k;
        }
        if (obj instanceof String) {
            return new r((String) obj);
        }
        if (obj instanceof Double) {
            return new g((Double) obj);
        }
        if (obj instanceof Long) {
            return new g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new s4.e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            d dVar = new d();
            for (Object obj2 : (List) obj) {
                dVar.u(dVar.m(), j(obj2));
            }
            return dVar;
        }
        k kVar = new k();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            n j3 = j(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                kVar.k((String) obj3, j3);
            }
        }
        return kVar;
    }

    public static /* bridge */ /* synthetic */ void k(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!o(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!o(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw x92.d();
    }

    public static void l(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            throw new NullPointerException(a.b(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static /* bridge */ /* synthetic */ void m(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || o(b11)) {
            throw x92.d();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static final void n(byte[] bArr, String str, zr1 zr1Var) {
        StringBuilder c10 = androidx.activity.result.a.c("os.arch:");
        c10.append(System.getProperty("os.arch"));
        c10.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                c10.append("supported_abis:");
                c10.append(Arrays.toString(strArr));
                c10.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        c10.append("CPU_ABI:");
        c10.append(Build.CPU_ABI);
        c10.append(";CPU_ABI2:");
        c10.append(Build.CPU_ABI2);
        c10.append(";");
        if (bArr != null) {
            c10.append("ELF:");
            c10.append(Arrays.toString(bArr));
            c10.append(";");
        }
        if (str != null) {
            c10.append("dbg:");
            c10.append(str);
            c10.append(";");
        }
        zr1Var.b(4007, c10.toString());
    }

    public static boolean o(byte b10) {
        return b10 > -65;
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().e());
    }
}
