package m4;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class zb2 {

    /* renamed from: a */
    public static final Unsafe f16087a;

    /* renamed from: b */
    public static final Class<?> f16088b = d82.a();

    /* renamed from: c */
    public static final yb2 f16089c;

    /* renamed from: d */
    public static final boolean f16090d;

    /* renamed from: e */
    public static final boolean f16091e;

    /* renamed from: f */
    public static final long f16092f;

    /* renamed from: g */
    public static final long f16093g;

    /* renamed from: h */
    public static final boolean f16094h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    static {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.zb2.<clinit>():void");
    }

    public static int a(Class<?> cls) {
        if (f16091e) {
            return f16089c.s(cls);
        }
        return -1;
    }

    public static int b(Class<?> cls) {
        if (f16091e) {
            return f16089c.u(cls);
        }
        return -1;
    }

    public static Field c() {
        Field field;
        Field field2;
        int i10 = d82.f7261a;
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

    public static void d(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        yb2 yb2Var = f16089c;
        int w10 = yb2Var.w(obj, j10);
        int i10 = ((~((int) j3)) & 3) << 3;
        yb2Var.E(obj, j10, ((255 & b10) << i10) | (w10 & (~(255 << i10))));
    }

    public static void e(Object obj, long j3, byte b10) {
        long j10 = (-4) & j3;
        yb2 yb2Var = f16089c;
        int i10 = (((int) j3) & 3) << 3;
        yb2Var.E(obj, j10, ((255 & b10) << i10) | (yb2Var.w(obj, j10) & (~(255 << i10))));
    }

    public static byte f(long j3) {
        return f16089c.a(j3);
    }

    public static double g(Object obj, long j3) {
        return f16089c.c(obj, j3);
    }

    public static float h(Object obj, long j3) {
        return f16089c.e(obj, j3);
    }

    public static int i(Object obj, long j3) {
        return f16089c.w(obj, j3);
    }

    public static long j(Object obj, long j3) {
        return f16089c.y(obj, j3);
    }

    public static <T> T k(Class<T> cls) {
        try {
            return (T) f16087a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object l(Object obj, long j3) {
        return f16089c.C(obj, j3);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new vb2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void n(Throwable th) {
        Logger.getLogger(zb2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void o(long j3, byte[] bArr, long j10, long j11) {
        f16089c.g(j3, bArr, j10, j11);
    }

    public static void p(Object obj, long j3, boolean z10) {
        f16089c.j(obj, j3, z10);
    }

    public static void q(Object obj, long j3, double d5) {
        f16089c.m(obj, j3, d5);
    }

    public static void r(Object obj, long j3, float f10) {
        f16089c.p(obj, j3, f10);
    }

    public static void s(Object obj, long j3, int i10) {
        f16089c.E(obj, j3, i10);
    }

    public static void t(Object obj, long j3, long j10) {
        f16089c.G(obj, j3, j10);
    }

    public static void u(Object obj, long j3, Object obj2) {
        f16089c.H(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj, long j3) {
        return ((byte) ((f16089c.w(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj, long j3) {
        return ((byte) ((f16089c.w(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    public static boolean x(Class<?> cls) {
        int i10 = d82.f7261a;
        try {
            Class<?> cls2 = f16088b;
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

    public static boolean y(Object obj, long j3) {
        return f16089c.r(obj, j3);
    }
}
