package m4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class fh implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: w */
    public static final fh f8498w = new fh();

    /* renamed from: s */
    public volatile long f8499s;

    /* renamed from: t */
    public final Handler f8500t;

    /* renamed from: u */
    public Choreographer f8501u;

    /* renamed from: v */
    public int f8502v;

    public fh() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f8500t = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f8499s = j3;
        this.f8501u.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f8501u = Choreographer.getInstance();
            return true;
        } else if (i10 == 1) {
            int i11 = this.f8502v + 1;
            this.f8502v = i11;
            if (i11 == 1) {
                this.f8501u.postFrameCallback(this);
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.f8502v - 1;
            this.f8502v = i12;
            if (i12 == 0) {
                this.f8501u.removeFrameCallback(this);
                this.f8499s = 0L;
            }
            return true;
        }
    }
}
