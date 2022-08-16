package s4;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import m4.yb2;
import s.b;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a */
    public static final Unsafe f17922a;

    /* renamed from: b */
    public static final Class<?> f17923b = z5.a();

    /* renamed from: c */
    public static final yb2 f17924c;

    /* renamed from: d */
    public static final boolean f17925d;

    /* renamed from: e */
    public static final boolean f17926e;

    /* renamed from: f */
    public static final long f17927f;

    /* renamed from: g */
    public static final boolean f17928g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    static {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.i9.<clinit>():void");
    }

    public static int a(Class<?> cls) {
        if (f17926e) {
            return f17924c.q(cls);
        }
        return -1;
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = z5.f18216a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 != null && field2.getType() == Long.TYPE) {
                return field2;
            }
            return null;
        }
        return field;
    }

    public static void c(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        yb2 yb2Var = f17924c;
        int t10 = yb2Var.t(obj, j10);
        int i10 = ((~((int) j3)) & 3) << 3;
        yb2Var.B(obj, j10, ((255 & b10) << i10) | (t10 & (~(255 << i10))));
    }

    public static void d(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        yb2 yb2Var = f17924c;
        int i10 = (((int) j3) & 3) << 3;
        yb2Var.B(obj, j10, ((255 & b10) << i10) | (yb2Var.t(obj, j10) & (~(255 << i10))));
    }

    public static double e(Object obj, long j3) {
        return f17924c.b(obj, j3);
    }

    public static float f(Object obj, long j3) {
        return f17924c.d(obj, j3);
    }

    public static int g(Object obj, long j3) {
        return f17924c.t(obj, j3);
    }

    public static long h(Object obj, long j3) {
        return f17924c.v(obj, j3);
    }

    public static <T> T i(Class<T> cls) {
        try {
            return (T) f17922a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j3) {
        return f17924c.z(obj, j3);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f9());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th) {
        Logger logger = Logger.getLogger(i9.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", b.b(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    public static void m(Object obj, long j3, boolean z10) {
        f17924c.f(obj, j3, z10);
    }

    public static void n(Object obj, long j3, double d5) {
        f17924c.i(obj, j3, d5);
    }

    public static void o(Object obj, long j3, float f10) {
        f17924c.l(obj, j3, f10);
    }

    public static void p(Object obj, long j3, int i10) {
        f17924c.B(obj, j3, i10);
    }

    public static void q(Object obj, long j3, long j10) {
        f17924c.D(obj, j3, j10);
    }

    public static void r(Object obj, long j3, Object obj2) {
        f17924c.F(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj, long j3) {
        return ((byte) ((f17924c.t(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj, long j3) {
        return ((byte) ((f17924c.t(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(Class<?> cls) {
        int i10 = z5.f18216a;
        try {
            Class<?> cls2 = f17923b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean v(Object obj, long j3) {
        return f17924c.n(obj, j3);
    }

    public static int w(Class<?> cls) {
        if (f17926e) {
            return f17924c.o(cls);
        }
        return -1;
    }
}
