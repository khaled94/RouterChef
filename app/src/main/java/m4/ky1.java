package m4;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class ky1 extends ay1 {

    /* renamed from: a */
    public static final Unsafe f10616a;

    /* renamed from: b */
    public static final long f10617b;

    /* renamed from: c */
    public static final long f10618c;

    /* renamed from: d */
    public static final long f10619d;

    /* renamed from: e */
    public static final long f10620e;

    /* renamed from: f */
    public static final long f10621f;

    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static final Unsafe a() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            f10618c = unsafe.objectFieldOffset(my1.class.getDeclaredField("u"));
            f10617b = unsafe.objectFieldOffset(my1.class.getDeclaredField("t"));
            f10619d = unsafe.objectFieldOffset(my1.class.getDeclaredField("s"));
            f10620e = unsafe.objectFieldOffset(ly1.class.getDeclaredField("a"));
            f10621f = unsafe.objectFieldOffset(ly1.class.getDeclaredField("b"));
            f10616a = unsafe;
        } catch (Exception e11) {
            Object obj = ou1.f12294a;
            if (e11 instanceof RuntimeException) {
                throw ((RuntimeException) e11);
            }
            if (!(e11 instanceof Error)) {
                throw new RuntimeException(e11);
            }
            throw ((Error) e11);
        }
    }

    @Override // m4.ay1
    public final void a(ly1 ly1Var, @CheckForNull ly1 ly1Var2) {
        f10616a.putObject(ly1Var, f10621f, ly1Var2);
    }

    @Override // m4.ay1
    public final void b(ly1 ly1Var, Thread thread) {
        f10616a.putObject(ly1Var, f10620e, thread);
    }

    @Override // m4.ay1
    public final boolean c(my1<?> my1Var, @CheckForNull dy1 dy1Var, dy1 dy1Var2) {
        return jy1.a(f10616a, my1Var, f10617b, dy1Var, dy1Var2);
    }

    @Override // m4.ay1
    public final boolean d(my1<?> my1Var, @CheckForNull Object obj, Object obj2) {
        return jy1.a(f10616a, my1Var, f10619d, obj, obj2);
    }

    @Override // m4.ay1
    public final boolean e(my1<?> my1Var, @CheckForNull ly1 ly1Var, @CheckForNull ly1 ly1Var2) {
        return jy1.a(f10616a, my1Var, f10618c, ly1Var, ly1Var2);
    }
}
