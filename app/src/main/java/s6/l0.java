package s6;

import android.os.Looper;
import c5.i;
import f8.h2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public static final ExecutorService f18283a = c0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(i<T> iVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.f(f18283a, new h2(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (iVar.n()) {
            return iVar.j();
        }
        if (iVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (!iVar.m()) {
            throw new TimeoutException();
        }
        throw new IllegalStateException(iVar.i());
    }
}
