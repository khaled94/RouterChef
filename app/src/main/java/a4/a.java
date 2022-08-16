package a4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import d4.m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a */
    public boolean f109a = false;

    /* renamed from: b */
    public final BlockingQueue<IBinder> f110b = new LinkedBlockingQueue();

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue<android.os.IBinder>] */
    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f109a) {
            this.f109a = true;
            IBinder iBinder = (IBinder) this.f110b.poll(10000L, timeUnit);
            if (iBinder == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            return iBinder;
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f110b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
