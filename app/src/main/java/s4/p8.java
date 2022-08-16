package s4;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p8 {

    /* renamed from: a */
    public static final Class<?> f18060a;

    /* renamed from: b */
    public static final z8<?, ?> f18061b;

    /* renamed from: c */
    public static final z8<?, ?> f18062c;

    /* renamed from: d */
    public static final z8<?, ?> f18063d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f18060a = cls;
        f18061b = t(false);
        f18062c = t(true);
        f18063d = new b9();
    }

    public static int A(int i10, List<d8> list, o8 o8Var) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += k6.z(i10, list.get(i12), o8Var);
            }
            return i11;
        }
        return 0;
    }

    public static int B(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d7) {
            d7 d7Var = (d7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k6.A(d7Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k6.A(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int C(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (k6.D(i10) * list.size()) + D(list);
    }

    public static int D(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k6.i(s7Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k6.i(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int E(int i10, Object obj, o8 o8Var) {
        if (!(obj instanceof m7)) {
            return k6.B((d8) obj, o8Var) + k6.g(i10 << 3);
        }
        int g10 = k6.g(i10 << 3);
        int a10 = ((m7) obj).a();
        return k6.g(a10) + a10 + g10;
    }

    public static int F(int i10, List<?> list, o8 o8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = k6.D(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof m7) {
                int a10 = ((m7) obj).a();
                D = k6.g(a10) + a10 + D;
            } else {
                D = k6.B((d8) obj, o8Var) + D;
            }
        }
        return D;
    }

    public static int G(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d7) {
            d7 d7Var = (d7) list;
            i10 = 0;
            while (i11 < size) {
                int e10 = d7Var.e(i11);
                i10 += k6.g((e10 >> 31) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += k6.g((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int H(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            i10 = 0;
            while (i11 < size) {
                long e10 = s7Var.e(i11);
                i10 += k6.i((e10 >> 63) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += k6.i((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int I(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int D = k6.D(i10) * size;
        if (list instanceof o7) {
            o7 o7Var = (o7) list;
            while (i11 < size) {
                Object w10 = o7Var.w(i11);
                D = (w10 instanceof g6 ? k6.y((g6) w10) : k6.C((String) w10)) + D;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                D = (obj instanceof g6 ? k6.y((g6) obj) : k6.C((String) obj)) + D;
                i11++;
            }
        }
        return D;
    }

    public static int J(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d7) {
            d7 d7Var = (d7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k6.g(d7Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k6.g(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int K(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k6.i(s7Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k6.i(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(int i10, List<Boolean> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.k(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).booleanValue();
            i12++;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.j(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void c(int i10, List<g6> list, l6 l6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        for (int i11 = 0; i11 < list.size(); i11++) {
            l6Var.f17966a.l(i10, list.get(i11));
        }
    }

    public static void d(int i10, List<Double> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.o(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).doubleValue();
            i12 += 8;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.p(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public static void e(int i10, List<Integer> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.q(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k6.A(list.get(i13).intValue());
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.r(list.get(i11).intValue());
            i11++;
        }
    }

    public static void f(int i10, List<Integer> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.m(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.n(list.get(i11).intValue());
            i11++;
        }
    }

    public static void g(int i10, List<Long> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.o(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).longValue();
            i12 += 8;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.p(list.get(i11).longValue());
            i11++;
        }
    }

    public static void h(int i10, List<Float> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.m(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).floatValue();
            i12 += 4;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.n(Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public static void i(int i10, List<?> list, l6 l6Var, o8 o8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            l6Var.l(i10, list.get(i11), o8Var);
        }
    }

    public static void j(int i10, List<Integer> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.q(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k6.A(list.get(i13).intValue());
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.r(list.get(i11).intValue());
            i11++;
        }
    }

    public static void k(int i10, List<Long> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.w(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k6.i(list.get(i13).longValue());
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.x(list.get(i11).longValue());
            i11++;
        }
    }

    public static void l(int i10, List<?> list, l6 l6Var, o8 o8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            l6Var.o(i10, list.get(i11), o8Var);
        }
    }

    public static void m(int i10, List<Integer> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.m(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).intValue();
            i12 += 4;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.n(list.get(i11).intValue());
            i11++;
        }
    }

    public static void n(int i10, List<Long> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.o(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).longValue();
            i12 += 8;
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.p(list.get(i11).longValue());
            i11++;
        }
    }

    public static void o(int i10, List<Integer> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                k6 k6Var = l6Var.f17966a;
                int intValue = list.get(i11).intValue();
                k6Var.u(i10, (intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = list.get(i13).intValue();
            i12 += k6.g((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            k6 k6Var2 = l6Var.f17966a;
            int intValue3 = list.get(i11).intValue();
            k6Var2.v((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public static void p(int i10, List<Long> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                k6 k6Var = l6Var.f17966a;
                long longValue = list.get(i11).longValue();
                k6Var.w(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = list.get(i13).longValue();
            i12 += k6.i((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            k6 k6Var2 = l6Var.f17966a;
            long longValue3 = list.get(i11).longValue();
            k6Var2.x((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void q(int i10, List<String> list, l6 l6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!(list instanceof o7)) {
            while (i11 < list.size()) {
                l6Var.f17966a.s(i10, list.get(i11));
                i11++;
            }
            return;
        }
        o7 o7Var = (o7) list;
        while (i11 < list.size()) {
            Object w10 = o7Var.w(i11);
            if (w10 instanceof String) {
                l6Var.f17966a.s(i10, (String) w10);
            } else {
                l6Var.f17966a.l(i10, (g6) w10);
            }
            i11++;
        }
    }

    public static void r(int i10, List<Integer> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.u(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k6.g(list.get(i13).intValue());
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.v(list.get(i11).intValue());
            i11++;
        }
    }

    public static void s(int i10, List<Long> list, l6 l6Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(l6Var);
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l6Var.f17966a.w(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        l6Var.f17966a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k6.i(list.get(i13).longValue());
        }
        l6Var.f17966a.v(i12);
        while (i11 < list.size()) {
            l6Var.f17966a.x(list.get(i11).longValue());
            i11++;
        }
    }

    public static z8<?, ?> t(boolean z10) {
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
            return (z8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int u(int i10, List<g6> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = k6.D(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            D += k6.y(list.get(i11));
        }
        return D;
    }

    public static int v(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d7) {
            d7 d7Var = (d7) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k6.A(d7Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k6.A(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int w(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k6.g(i10 << 3) + 4) * size;
    }

    public static int x(List<?> list) {
        return list.size() * 4;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k6.g(i10 << 3) + 8) * size;
    }

    public static int z(List<?> list) {
        return list.size() * 8;
    }
}
