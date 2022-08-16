package d4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import g4.a;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import r4.e;

/* loaded from: classes.dex */
public final class b1 extends g {

    /* renamed from: e */
    public final Context f3829e;

    /* renamed from: f */
    public volatile e f3830f;
    @GuardedBy("connectionStatus")

    /* renamed from: d */
    public final HashMap<y0, z0> f3828d = new HashMap<>();

    /* renamed from: g */
    public final a f3831g = a.b();

    /* renamed from: h */
    public final long f3832h = 5000;

    /* renamed from: i */
    public final long f3833i = 300000;

    public b1(Context context, Looper looper) {
        a1 a1Var = new a1(this);
        this.f3829e = context.getApplicationContext();
        this.f3830f = new e(looper, a1Var);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    @Override // d4.g
    public final boolean d(y0 y0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z10;
        synchronized (this.f3828d) {
            z0 z0Var = this.f3828d.get(y0Var);
            if (z0Var == null) {
                z0Var = new z0(this, y0Var);
                z0Var.f3937a.put(serviceConnection, serviceConnection);
                z0Var.a(str, executor);
                this.f3828d.put(y0Var, z0Var);
            } else {
                this.f3830f.removeMessages(0, y0Var);
                if (z0Var.f3937a.containsKey(serviceConnection)) {
                    String y0Var2 = y0Var.toString();
                    StringBuilder sb = new StringBuilder(y0Var2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(y0Var2);
                    throw new IllegalStateException(sb.toString());
                }
                z0Var.f3937a.put(serviceConnection, serviceConnection);
                int i10 = z0Var.f3938b;
                if (i10 == 1) {
                    serviceConnection.onServiceConnected(z0Var.f3942f, z0Var.f3940d);
                } else if (i10 == 2) {
                    z0Var.a(str, executor);
                }
            }
            z10 = z0Var.f3939c;
        }
        return z10;
    }
}
