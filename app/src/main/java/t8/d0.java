package t8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class d0 extends Handler {
    public d0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
