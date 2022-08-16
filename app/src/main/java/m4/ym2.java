package m4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import l4.b;
import m4.lk2;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class ym2<T extends lk2> extends Handler implements Runnable {
    public final /* synthetic */ cn2 A;

    /* renamed from: s */
    public final T f15840s;

    /* renamed from: t */
    public final long f15841t;

    /* renamed from: u */
    public wm2<T> f15842u;

    /* renamed from: v */
    public IOException f15843v;

    /* renamed from: w */
    public int f15844w;

    /* renamed from: x */
    public Thread f15845x;
    public boolean y;

    /* renamed from: z */
    public volatile boolean f15846z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ym2(cn2 cn2Var, Looper looper, lk2 lk2Var, wm2 wm2Var, long j3) {
        super(looper);
        this.A = cn2Var;
        this.f15840s = lk2Var;
        this.f15842u = wm2Var;
        this.f15841t = j3;
    }

    public final void a(boolean z10) {
        this.f15846z = z10;
        this.f15843v = null;
        if (hasMessages(0)) {
            this.y = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.y = true;
                this.f15840s.f10898h = true;
                Thread thread = this.f15845x;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.A.f7081b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            wm2<T> wm2Var = this.f15842u;
            Objects.requireNonNull(wm2Var);
            ((pk2) wm2Var).q(this.f15840s, elapsedRealtime, elapsedRealtime - this.f15841t, true);
            this.f15842u = null;
        }
    }

    public final void b(long j3) {
        r01.h(this.A.f7081b == null);
        cn2 cn2Var = this.A;
        cn2Var.f7081b = this;
        if (j3 > 0) {
            sendEmptyMessageDelayed(0, j3);
            return;
        }
        this.f15843v = null;
        ExecutorService executorService = cn2Var.f7080a;
        Objects.requireNonNull(this);
        executorService.execute(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ym2.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        Message obtainMessage;
        bn2 bn2Var;
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.y;
                this.f15845x = Thread.currentThread();
            }
            if (z10) {
                String simpleName = this.f15840s.getClass().getSimpleName();
                b.o(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f15840s.a();
                    b.r();
                } catch (Throwable th) {
                    b.r();
                    throw th;
                }
            }
            synchronized (this) {
                this.f15845x = null;
                Thread.interrupted();
            }
            if (this.f15846z) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.f15846z) {
                return;
            }
            obtainMessage = obtainMessage(2, e10);
            obtainMessage.sendToTarget();
        } catch (Error e11) {
            if (!this.f15846z) {
                x90.e("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (this.f15846z) {
                return;
            }
            x90.e("LoadTask", "Unexpected exception loading stream", e12);
            bn2Var = new bn2(e12);
            obtainMessage = obtainMessage(2, bn2Var);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e13) {
            if (this.f15846z) {
                return;
            }
            x90.e("LoadTask", "OutOfMemory error loading stream", e13);
            bn2Var = new bn2(e13);
            obtainMessage = obtainMessage(2, bn2Var);
            obtainMessage.sendToTarget();
        }
    }
}
