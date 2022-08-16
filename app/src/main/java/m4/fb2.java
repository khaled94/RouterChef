package m4;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class fb2 {

    /* renamed from: a */
    public static final Class<?> f8390a;

    /* renamed from: b */
    public static final pb2<?, ?> f8391b;

    /* renamed from: c */
    public static final pb2<?, ?> f8392c;

    /* renamed from: d */
    public static final pb2<?, ?> f8393d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8390a = cls;
        f8391b = v(false);
        f8392c = v(true);
        f8393d = new rb2();
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v82.i(i10 << 3) + 8) * size;
    }

    public static int B(List<?> list) {
        return list.size() * 8;
    }

    public static int C(int i10, List<qa2> list, eb2 eb2Var) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += v82.A(i10, list.get(i12), eb2Var);
            }
            return i11;
        }
        return 0;
    }

    public static int D(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n92) {
            n92 n92Var = (n92) list;
            i10 = 0;
            while (i11 < size) {
                i10 += v82.B(n92Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += v82.B(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int E(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (v82.E(i10) * list.size()) + F(list);
    }

    public static int F(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ga2) {
            ga2 ga2Var = (ga2) list;
            i10 = 0;
            while (i11 < size) {
                i10 += v82.j(ga2Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += v82.j(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int G(int i10, Object obj, eb2 eb2Var) {
        if (!(obj instanceof aa2)) {
            return v82.C((qa2) obj, eb2Var) + v82.i(i10 << 3);
        }
        int i11 = v82.i(i10 << 3);
        int a10 = ((aa2) obj).a();
        return v82.i(a10) + a10 + i11;
    }

    public static int H(int i10, List<?> list, eb2 eb2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int E = v82.E(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof aa2) {
                int a10 = ((aa2) obj).a();
                E = v82.i(a10) + a10 + E;
            } else {
                E = v82.C((qa2) obj, eb2Var) + E;
            }
        }
        return E;
    }

    public static int I(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n92) {
            n92 n92Var = (n92) list;
            i10 = 0;
            while (i11 < size) {
                int e10 = n92Var.e(i11);
                i10 += v82.i((e10 >> 31) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += v82.i((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int J(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ga2) {
            ga2 ga2Var = (ga2) list;
            i10 = 0;
            while (i11 < size) {
                long g10 = ga2Var.g(i11);
                i10 += v82.j((g10 >> 63) ^ (g10 + g10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += v82.j((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int K(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int E = v82.E(i10) * size;
        if (list instanceof ca2) {
            ca2 ca2Var = (ca2) list;
            while (i11 < size) {
                Object w10 = ca2Var.w(i11);
                E = (w10 instanceof n82 ? v82.z((n82) w10) : v82.D((String) w10)) + E;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                E = (obj instanceof n82 ? v82.z((n82) obj) : v82.D((String) obj)) + E;
                i11++;
            }
        }
        return E;
    }

    public static int L(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n92) {
            n92 n92Var = (n92) list;
            i10 = 0;
            while (i11 < size) {
                i10 += v82.i(n92Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += v82.i(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int M(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ga2) {
            ga2 ga2Var = (ga2) list;
            i10 = 0;
            while (i11 < size) {
                i10 += v82.j(ga2Var.g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += v82.j(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB a(int i10, List<Integer> list, p92 p92Var, UB ub, pb2<UT, UB> pb2Var) {
        if (p92Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (p92Var.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) b(i10, intValue, ub, pb2Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!p92Var.a(intValue2)) {
                    ub = (UB) b(i10, intValue2, ub, pb2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB b(int i10, int i11, UB ub, pb2<UT, UB> pb2Var) {
        if (ub == null) {
            ub = pb2Var.f();
        }
        pb2Var.l(ub, i10, i11);
        return ub;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void d(int i10, List<Boolean> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.l(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).booleanValue();
            i12++;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.k(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void e(int i10, List<n82> list, w82 w82Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        for (int i11 = 0; i11 < list.size(); i11++) {
            w82Var.f14883a.m(i10, list.get(i11));
        }
    }

    public static void f(int i10, List<Double> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.p(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).doubleValue();
            i12 += 8;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.q(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public static void g(int i10, List<Integer> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.r(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v82.B(list.get(i13).intValue());
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.s(list.get(i11).intValue());
            i11++;
        }
    }

    public static void h(int i10, List<Integer> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.n(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.o(list.get(i11).intValue());
            i11++;
        }
    }

    public static void i(int i10, List<Long> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.p(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).longValue();
            i12 += 8;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.q(list.get(i11).longValue());
            i11++;
        }
    }

    public static void j(int i10, List<Float> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.n(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).floatValue();
            i12 += 4;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.o(Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public static void k(int i10, List<?> list, w82 w82Var, eb2 eb2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            w82Var.l(i10, list.get(i11), eb2Var);
        }
    }

    public static void l(int i10, List<Integer> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.r(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v82.B(list.get(i13).intValue());
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.s(list.get(i11).intValue());
            i11++;
        }
    }

    public static void m(int i10, List<Long> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.x(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v82.j(list.get(i13).longValue());
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.y(list.get(i11).longValue());
            i11++;
        }
    }

    public static void n(int i10, List<?> list, w82 w82Var, eb2 eb2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            w82Var.o(i10, list.get(i11), eb2Var);
        }
    }

    public static void o(int i10, List<Integer> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.n(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.o(list.get(i11).intValue());
            i11++;
        }
    }

    public static void p(int i10, List<Long> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.p(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).longValue();
            i12 += 8;
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.q(list.get(i11).longValue());
            i11++;
        }
    }

    public static void q(int i10, List<Integer> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v82 v82Var = w82Var.f14883a;
                int intValue = list.get(i11).intValue();
                v82Var.v(i10, (intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = list.get(i13).intValue();
            i12 += v82.i((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            v82 v82Var2 = w82Var.f14883a;
            int intValue3 = list.get(i11).intValue();
            v82Var2.w((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public static void r(int i10, List<Long> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v82 v82Var = w82Var.f14883a;
                long longValue = list.get(i11).longValue();
                v82Var.x(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = list.get(i13).longValue();
            i12 += v82.j((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            v82 v82Var2 = w82Var.f14883a;
            long longValue3 = list.get(i11).longValue();
            v82Var2.y((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void s(int i10, List<String> list, w82 w82Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!(list instanceof ca2)) {
            while (i11 < list.size()) {
                w82Var.f14883a.t(i10, list.get(i11));
                i11++;
            }
            return;
        }
        ca2 ca2Var = (ca2) list;
        while (i11 < list.size()) {
            Object w10 = ca2Var.w(i11);
            if (w10 instanceof String) {
                w82Var.f14883a.t(i10, (String) w10);
            } else {
                w82Var.f14883a.m(i10, (n82) w10);
            }
            i11++;
        }
    }

    public static void t(int i10, List<Integer> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.v(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v82.i(list.get(i13).intValue());
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.w(list.get(i11).intValue());
            i11++;
        }
    }

    public static void u(int i10, List<Long> list, w82 w82Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(w82Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                w82Var.f14883a.x(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        w82Var.f14883a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v82.j(list.get(i13).longValue());
        }
        w82Var.f14883a.w(i12);
        while (i11 < list.size()) {
            w82Var.f14883a.y(list.get(i11).longValue());
            i11++;
        }
    }

    public static pb2<?, ?> v(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (pb2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int w(int i10, List<n82> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int E = v82.E(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            E += v82.z(list.get(i11));
        }
        return E;
    }

    public static int x(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n92) {
            n92 n92Var = (n92) list;
            i10 = 0;
            while (i11 < size) {
                i10 += v82.B(n92Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += v82.B(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v82.i(i10 << 3) + 4) * size;
    }

    public static int z(List<?> list) {
        return list.size() * 4;
    }
}
