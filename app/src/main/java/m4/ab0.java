package m4;

import android.os.Looper;

/* loaded from: classes.dex */
public final class ab0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
