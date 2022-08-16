package m4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class eu1 extends BroadcastReceiver implements Runnable {

    /* renamed from: s */
    public final Handler f8267s;

    public eu1(Handler handler) {
        this.f8267s = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f8267s.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
