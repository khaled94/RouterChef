package c1;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import k9.b1;
import k9.c1;
import k9.z;
import s4.a4;
import s4.ac;
import s4.e;
import s4.e0;
import s4.g;
import s4.g6;
import s4.k;
import s4.l;
import s4.n;
import s4.r;
import s4.s;
import x8.d;
import y4.d1;
import y4.e1;
import y4.f1;
import y4.q2;
import z7.m;

/* loaded from: classes.dex */
public class f implements d1, m {

    /* renamed from: s */
    public static final int[] f2608s = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: t */
    public static final /* synthetic */ f f2609t = new f();

    public static final b1 a(d dVar, x8.f fVar) {
        b1 b1Var;
        if (!(dVar instanceof z8.d)) {
            return null;
        }
        if (!(fVar.get(c1.f5642s) != null)) {
            return null;
        }
        z8.d dVar2 = (z8.d) dVar;
        while (!(dVar2 instanceof z) && (dVar2 = dVar2.a()) != null) {
            if (dVar2 instanceof b1) {
                b1Var = (b1) dVar2;
                break;
            }
        }
        b1Var = null;
        if (b1Var != null) {
            throw null;
        }
        return b1Var;
    }

    public static double b(double d5) {
        int i10;
        if (Double.isNaN(d5)) {
            return 0.0d;
        }
        if (Double.isInfinite(d5) || d5 == 0.0d || i10 == 0) {
            return d5;
        }
        return Math.floor(Math.abs(d5)) * (i10 > 0 ? 1 : -1);
    }

    public static String d(g6 g6Var) {
        String str;
        StringBuilder sb = new StringBuilder(g6Var.g());
        for (int i10 = 0; i10 < g6Var.g(); i10++) {
            int d5 = g6Var.d(i10);
            if (d5 == 34) {
                str = "\\\"";
            } else if (d5 == 39) {
                str = "\\'";
            } else if (d5 != 92) {
                switch (d5) {
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
                        if (d5 < 32 || d5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((d5 >>> 6) & 3) + 48));
                            sb.append((char) (((d5 >>> 3) & 7) + 48));
                            d5 = (d5 & 7) + 48;
                        }
                        sb.append((char) d5);
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

    public static int e(double d5) {
        int i10;
        if (Double.isNaN(d5) || Double.isInfinite(d5) || d5 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d5)) * (i10 > 0 ? 1 : -1)) % 4.294967296E9d);
    }

    public static String f(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    public static int g(a4 a4Var) {
        int e10 = e(a4Var.d("runtime.counter").f().doubleValue() + 1.0d);
        if (e10 <= 1000000) {
            a4Var.f("runtime.counter", new g(Double.valueOf(e10)));
            return e10;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static String h(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = q2.a(context);
        }
        return q2.b("google_app_id", resources, str);
    }

    public static long i(double d5) {
        return e(d5) & 4294967295L;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.Integer, s4.e0>, java.util.HashMap] */
    public static e0 j(String str) {
        e0 e0Var = (str == null || str.isEmpty()) ? null : (e0) e0.D0.get(Integer.valueOf(Integer.parseInt(str)));
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object k(n nVar) {
        if (n.f18010k.equals(nVar)) {
            return null;
        }
        if (n.f18009j.equals(nVar)) {
            return "";
        }
        if (nVar instanceof k) {
            return l((k) nVar);
        }
        if (!(nVar instanceof s4.d)) {
            return !nVar.f().isNaN() ? nVar.f() : nVar.h();
        }
        ArrayList arrayList = new ArrayList();
        s4.d dVar = (s4.d) nVar;
        Objects.requireNonNull(dVar);
        int i10 = 0;
        while (true) {
            if (!(i10 < dVar.m())) {
                return arrayList;
            }
            if (i10 < dVar.m()) {
                int i11 = i10 + 1;
                Object k10 = k(dVar.o(i10));
                if (k10 != null) {
                    arrayList.add(k10);
                }
                i10 = i11;
            } else {
                throw new NoSuchElementException(androidx.activity.k.a(32, "Out of bounds index: ", i10));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public static Map l(k kVar) {
        HashMap hashMap = new HashMap();
        Objects.requireNonNull(kVar);
        Iterator it = new ArrayList(kVar.f17946s.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object k10 = k(kVar.O(str));
            if (k10 != null) {
                hashMap.put(str, k10);
            }
        }
        return hashMap;
    }

    public static void m(String str, int i10, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
    }

    public static void n(String str, int i10, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
    }

    public static void o(String str, int i10, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(arrayList.size())));
    }

    public static boolean p(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double f10 = nVar.f();
        return !f10.isNaN() && f10.doubleValue() >= 0.0d && f10.equals(Double.valueOf(Math.floor(f10.doubleValue())));
    }

    public static boolean q(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof s) || (nVar instanceof l)) {
            return true;
        }
        if (!(nVar instanceof g)) {
            return nVar instanceof r ? nVar.h().equals(nVar2.h()) : nVar instanceof e ? nVar.e().equals(nVar2.e()) : nVar == nVar2;
        } else if (!Double.isNaN(nVar.f().doubleValue()) && !Double.isNaN(nVar2.f().doubleValue())) {
            return nVar.f().equals(nVar2.f());
        } else {
            return false;
        }
    }

    @Override // z7.m
    public Object c() {
        return new ArrayList();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(ac.f17729t.zza().c());
    }
}
