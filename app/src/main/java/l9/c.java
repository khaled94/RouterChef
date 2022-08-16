package l9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d.b;
import java.util.Objects;
import v8.e;

/* loaded from: classes.dex */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new a(a(Looper.getMainLooper()), null, false);
        } catch (Throwable th) {
            obj = b.a(th);
        }
        if (!(obj instanceof e.a)) {
            obj2 = obj;
        }
        b bVar = (b) obj2;
    }

    public static final Handler a(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
