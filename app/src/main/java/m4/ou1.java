package m4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ou1 {
    @CheckForNull

    /* renamed from: a */
    public static final Object f12294a;

    static {
        Object obj;
        Method method = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            obj = null;
        }
        f12294a = obj;
        if (obj != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (Throwable unused2) {
            }
        }
        Object obj2 = f12294a;
        if (obj2 != null) {
            try {
                try {
                    method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                } catch (ThreadDeath e12) {
                    throw e12;
                } catch (Throwable unused3) {
                }
                if (method == null) {
                    return;
                }
                method.invoke(obj2, new Throwable());
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
    }
}
