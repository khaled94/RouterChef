package e9;

import d7.a;
import java.util.Arrays;
import m4.j61;
import m4.jp2;
import m4.mp2;
import m4.n31;
import m4.qh0;
import m4.rk1;
import m4.s60;
import m4.vo2;
import s4.aa;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class f implements rk1, vo2, d1 {

    /* renamed from: s */
    public static final qh0 f4463s = new qh0(0);

    /* renamed from: t */
    public static final n31 f4464t = new n31();

    /* renamed from: u */
    public static final j61 f4465u = new j61();

    /* renamed from: v */
    public static final /* synthetic */ f f4466v = new f();

    /* renamed from: w */
    public static final /* synthetic */ f f4467w = new f();

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(a.c(str, " must not be null"));
        i(illegalStateException, f.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException, f.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(a.c(str, " must not be null"));
        i(nullPointerException, f.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g(str));
        i(nullPointerException, f.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(g(str));
        i(illegalArgumentException, f.class.getName());
        throw illegalArgumentException;
    }

    public static String g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static Throwable i(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    public static String j(String str, Object obj) {
        return str + obj;
    }

    @Override // m4.rk1
    public void h(Object obj) {
        ((s60) obj).b();
    }

    @Override // m4.vo2
    public void l(jp2 jp2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.vo2
    public mp2 p(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.vo2
    public void y() {
        throw new UnsupportedOperationException();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().i());
    }
}
