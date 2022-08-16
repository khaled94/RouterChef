package j0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* renamed from: a */
    public String f5421a = "fonts-androidx";

    /* renamed from: b */
    public int f5422b = 10;

    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: s */
        public final int f5423s;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f5423s = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f5423s);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f5421a, this.f5422b);
    }
}
