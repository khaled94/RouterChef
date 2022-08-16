package t8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public final d f18711a;

    /* renamed from: b */
    public final a f18712b;

    /* renamed from: c */
    public long f18713c;

    /* renamed from: d */
    public long f18714d;

    /* renamed from: e */
    public long f18715e;

    /* renamed from: f */
    public long f18716f;

    /* renamed from: g */
    public long f18717g;

    /* renamed from: h */
    public long f18718h;

    /* renamed from: i */
    public long f18719i;

    /* renamed from: j */
    public long f18720j;

    /* renamed from: k */
    public int f18721k;

    /* renamed from: l */
    public int f18722l;

    /* renamed from: m */
    public int f18723m;

    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a */
        public final a0 f18724a;

        /* renamed from: t8.a0$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0120a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ Message f18725s;

            public RunnableC0120a(Message message) {
                this.f18725s = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder c10 = androidx.activity.result.a.c("Unhandled stats message.");
                c10.append(this.f18725s.what);
                throw new AssertionError(c10.toString());
            }
        }

        public a(Looper looper, a0 a0Var) {
            super(looper);
            this.f18724a = a0Var;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f18724a.f18713c++;
            } else if (i10 == 1) {
                this.f18724a.f18714d++;
            } else if (i10 == 2) {
                a0 a0Var = this.f18724a;
                long j3 = message.arg1;
                int i11 = a0Var.f18722l + 1;
                a0Var.f18722l = i11;
                long j10 = a0Var.f18716f + j3;
                a0Var.f18716f = j10;
                a0Var.f18719i = j10 / i11;
            } else if (i10 == 3) {
                a0 a0Var2 = this.f18724a;
                long j11 = message.arg1;
                a0Var2.f18723m++;
                long j12 = a0Var2.f18717g + j11;
                a0Var2.f18717g = j12;
                a0Var2.f18720j = j12 / a0Var2.f18722l;
            } else if (i10 != 4) {
                t.f18797n.post(new RunnableC0120a(message));
            } else {
                a0 a0Var3 = this.f18724a;
                a0Var3.f18721k++;
                long longValue = ((Long) message.obj).longValue() + a0Var3.f18715e;
                a0Var3.f18715e = longValue;
                a0Var3.f18718h = longValue / a0Var3.f18721k;
            }
        }
    }

    public a0(d dVar) {
        this.f18711a = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = e0.f18755a;
        d0 d0Var = new d0(looper);
        d0Var.sendMessageDelayed(d0Var.obtainMessage(), 1000L);
        this.f18712b = new a(handlerThread.getLooper(), this);
    }

    public final b0 a() {
        return new b0(((n) this.f18711a).f18782a.maxSize(), ((n) this.f18711a).f18782a.size(), this.f18713c, this.f18714d, this.f18715e, this.f18716f, this.f18717g, this.f18718h, this.f18719i, this.f18720j, this.f18721k, this.f18722l, this.f18723m, System.currentTimeMillis());
    }
}
