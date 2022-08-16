package m4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xn2 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: w */
    public static final xn2 f15425w = new xn2();

    /* renamed from: s */
    public volatile long f15426s = -9223372036854775807L;

    /* renamed from: t */
    public final Handler f15427t;

    /* renamed from: u */
    public Choreographer f15428u;

    /* renamed from: v */
    public int f15429v;

    public xn2() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = ls1.f10971a;
        Handler handler = new Handler(looper, this);
        this.f15427t = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f15426s = j3;
        Choreographer choreographer = this.f15428u;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f15428u = Choreographer.getInstance();
            return true;
        } else if (i10 == 1) {
            int i11 = this.f15429v + 1;
            this.f15429v = i11;
            if (i11 == 1) {
                Choreographer choreographer = this.f15428u;
                Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.f15429v - 1;
            this.f15429v = i12;
            if (i12 == 0) {
                Choreographer choreographer2 = this.f15428u;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f15426s = -9223372036854775807L;
            }
            return true;
        }
    }
}
