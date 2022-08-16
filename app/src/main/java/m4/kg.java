package m4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import m4.qe;
import n9.d;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class kg<T extends qe> extends Handler implements Runnable {
    public final /* synthetic */ mg A;

    /* renamed from: s */
    public final T f10405s;

    /* renamed from: t */
    public final se f10406t;

    /* renamed from: u */
    public final int f10407u;

    /* renamed from: v */
    public final long f10408v;

    /* renamed from: w */
    public IOException f10409w;

    /* renamed from: x */
    public int f10410x;
    public volatile Thread y;

    /* renamed from: z */
    public volatile boolean f10411z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(mg mgVar, Looper looper, T t10, se seVar, int i10, long j3) {
        super(looper);
        this.A = mgVar;
        this.f10405s = t10;
        this.f10406t = seVar;
        this.f10407u = i10;
        this.f10408v = j3;
    }

    public final void a(boolean z10) {
        this.f10411z = z10;
        this.f10409w = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f10405s.f12811f = true;
            if (this.y != null) {
                this.y.interrupt();
            }
            if (!z10) {
                return;
            }
        }
        this.A.f11183b = null;
        SystemClock.elapsedRealtime();
        this.f10406t.l(this.f10405s, true);
    }

    public final void b(long j3) {
        d.i(this.A.f11183b == null);
        mg mgVar = this.A;
        mgVar.f11183b = this;
        if (j3 > 0) {
            sendEmptyMessageDelayed(0, j3);
            return;
        }
        this.f10409w = null;
        mgVar.f11182a.execute(this);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        nc ncVar;
        if (this.f10411z) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f10409w = null;
            mg mgVar = this.A;
            mgVar.f11182a.execute(mgVar.f11183b);
        } else if (i10 == 4) {
            throw ((Error) message.obj);
        } else {
            this.A.f11183b = null;
            SystemClock.elapsedRealtime();
            boolean z10 = false;
            if (this.f10405s.f12811f) {
                this.f10406t.l(this.f10405s, false);
                return;
            }
            int i11 = message.what;
            int i12 = 1;
            if (i11 == 1) {
                this.f10406t.l(this.f10405s, false);
                return;
            }
            long j3 = 0;
            if (i11 == 2) {
                se seVar = this.f10406t;
                seVar.c(this.f10405s);
                seVar.W = true;
                if (seVar.O == -9223372036854775807L) {
                    long b10 = seVar.b();
                    if (b10 != Long.MIN_VALUE) {
                        j3 = b10 + 10000;
                    }
                    seVar.O = j3;
                    xe xeVar = seVar.f13613x;
                    seVar.H.c();
                    xeVar.c(new jf(j3));
                }
                seVar.G.b(seVar);
            } else if (i11 == 3) {
                IOException iOException = (IOException) message.obj;
                this.f10409w = iOException;
                se seVar2 = this.f10406t;
                T t10 = this.f10405s;
                seVar2.c(t10);
                Handler handler = seVar2.f13611v;
                if (handler != null) {
                    handler.post(new pe(seVar2, iOException, 0));
                }
                if (iOException instanceof mf) {
                    z10 = true;
                } else {
                    int a10 = seVar2.a();
                    int i13 = seVar2.V;
                    if (seVar2.S == -1 && ((ncVar = seVar2.H) == null || ncVar.zza() == -9223372036854775807L)) {
                        seVar2.T = 0L;
                        seVar2.L = seVar2.J;
                        int size = seVar2.F.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            ((hf) seVar2.F.valueAt(i14)).g(!seVar2.J || seVar2.P[i14]);
                        }
                        t10.f12810e.f10709a = 0L;
                        t10.f12813h = 0L;
                        t10.f12812g = true;
                    }
                    seVar2.V = seVar2.a();
                    if (a10 > i13) {
                        z10 = true;
                    }
                }
                if (z10) {
                    this.A.f11184c = this.f10409w;
                } else if (!z10) {
                    if (!z10) {
                        i12 = 1 + this.f10410x;
                    }
                    this.f10410x = i12;
                    b(Math.min((i12 - 1) * 1000, 5000));
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.y = Thread.currentThread();
            if (!this.f10405s.f12811f) {
                String simpleName = this.f10405s.getClass().getSimpleName();
                wo2.c(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f10405s.a();
                    wo2.e();
                } catch (Throwable th) {
                    wo2.e();
                    throw th;
                }
            }
            if (this.f10411z) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            e = e10;
            if (this.f10411z) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e11) {
            Log.e("LoadTask", "Unexpected error loading stream", e11);
            if (!this.f10411z) {
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (InterruptedException unused) {
            d.i(this.f10405s.f12811f);
            if (this.f10411z) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e12) {
            Log.e("LoadTask", "Unexpected exception loading stream", e12);
            if (this.f10411z) {
                return;
            }
            e = new lg(e12);
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e13) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e13);
            if (this.f10411z) {
                return;
            }
            e = new lg(e13);
            obtainMessage(3, e).sendToTarget();
        }
    }
}
