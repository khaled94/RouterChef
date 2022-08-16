package da;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c */
    public static final x f4123c;

    /* renamed from: a */
    public final boolean f4124a;
    @Nullable

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f4125b;

    /* loaded from: classes.dex */
    public static final class a extends x {

        /* renamed from: da.x$a$a */
        /* loaded from: classes.dex */
        public static final class ExecutorC0060a implements Executor {

            /* renamed from: s */
            public final Handler f4126s = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f4126s.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // da.x
        public final Executor a() {
            return new ExecutorC0060a();
        }

        @Override // da.x
        @Nullable
        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return x.super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f4123c = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new x(true);
    }

    public x(boolean z10) {
        this.f4124a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f4125b = constructor;
    }

    @Nullable
    public Executor a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f4125b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public final boolean c(Method method) {
        return this.f4124a && method.isDefault();
    }
}
