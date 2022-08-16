package n3;

import android.os.HandlerThread;
import android.os.Looper;
import d4.m;
import m4.vt1;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a */
    public HandlerThread f16567a = null;

    /* renamed from: b */
    public vt1 f16568b = null;

    /* renamed from: c */
    public int f16569c = 0;

    /* renamed from: d */
    public final Object f16570d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.f16570d) {
            if (this.f16569c != 0) {
                m.i(this.f16567a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f16567a == null) {
                g1.a("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f16567a = handlerThread;
                handlerThread.start();
                this.f16568b = new vt1(this.f16567a.getLooper());
                g1.a("Looper thread started.");
            } else {
                g1.a("Resuming the looper thread");
                this.f16570d.notifyAll();
            }
            this.f16569c++;
            looper = this.f16567a.getLooper();
        }
        return looper;
    }
}
