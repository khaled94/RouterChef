package m4;

import android.os.Handler;

/* loaded from: classes.dex */
public final class kr1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = nr1.f11901h;
        if (handler != null) {
            handler.post(nr1.f11902i);
            nr1.f11901h.postDelayed(nr1.f11903j, 200L);
        }
    }
}
