package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: b */
    public final Object f5705b = new Object();

    /* renamed from: c */
    public final ExecutorService f5706c = Executors.newFixedThreadPool(4, new a());

    /* renamed from: d */
    public volatile Handler f5707d;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f5708a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f5708a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
