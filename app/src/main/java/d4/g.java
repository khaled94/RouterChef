package d4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a */
    public static final Object f3873a = new Object();

    /* renamed from: b */
    public static b1 f3874b;

    /* renamed from: c */
    public static HandlerThread f3875c;

    public static g a(Context context) {
        synchronized (f3873a) {
            if (f3874b == null) {
                f3874b = new b1(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f3874b;
    }

    public static HandlerThread b() {
        synchronized (f3873a) {
            HandlerThread handlerThread = f3875c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f3875c = handlerThread2;
            handlerThread2.start();
            return f3875c;
        }
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    public final void c(String str, String str2, int i10, ServiceConnection serviceConnection, boolean z10) {
        y0 y0Var = new y0(str, str2, i10, z10);
        b1 b1Var = (b1) this;
        synchronized (b1Var.f3828d) {
            z0 z0Var = b1Var.f3828d.get(y0Var);
            if (z0Var == null) {
                String y0Var2 = y0Var.toString();
                StringBuilder sb = new StringBuilder(y0Var2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(y0Var2);
                throw new IllegalStateException(sb.toString());
            } else if (!z0Var.f3937a.containsKey(serviceConnection)) {
                String y0Var3 = y0Var.toString();
                StringBuilder sb2 = new StringBuilder(y0Var3.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(y0Var3);
                throw new IllegalStateException(sb2.toString());
            } else {
                z0Var.f3937a.remove(serviceConnection);
                if (z0Var.f3937a.isEmpty()) {
                    b1Var.f3830f.sendMessageDelayed(b1Var.f3830f.obtainMessage(0, y0Var), b1Var.f3832h);
                }
            }
        }
    }

    public abstract boolean d(y0 y0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
