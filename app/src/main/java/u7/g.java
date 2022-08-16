package u7;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.a;
import b0.o;
import b0.q;
import c1.c;
import c5.i;
import c5.j;
import c5.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u7.e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final ExecutorService f19497a;

    /* renamed from: b */
    public final Context f19498b;

    /* renamed from: c */
    public final c f19499c;

    public g(Context context, c cVar, ExecutorService executorService) {
        this.f19497a = executorService;
        this.f19498b = context;
        this.f19499c = cVar;
    }

    public final boolean a() {
        boolean z10;
        if (this.f19499c.a("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f19498b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f19498b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        z10 = false;
        if (z10) {
            return false;
        }
        String e10 = this.f19499c.e("gcm.n.image");
        final x xVar = null;
        if (!TextUtils.isEmpty(e10)) {
            try {
                xVar = new x(new URL(e10));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + e10);
            }
        }
        if (xVar != null) {
            ExecutorService executorService = this.f19497a;
            final j jVar = new j();
            xVar.f19601t = executorService.submit(new Runnable() { // from class: u7.w
                @Override // java.lang.Runnable
                public final void run() {
                    x xVar2 = x.this;
                    j jVar2 = jVar;
                    Objects.requireNonNull(xVar2);
                    try {
                        jVar2.b(xVar2.b());
                    } catch (Exception e11) {
                        jVar2.a(e11);
                    }
                }
            });
            xVar.f19602u = jVar.f2776a;
        }
        e.a a10 = e.a(this.f19498b, this.f19499c);
        q qVar = a10.f19490a;
        if (xVar != null) {
            try {
                i<Bitmap> iVar = xVar.f19602u;
                Objects.requireNonNull(iVar, "null reference");
                Bitmap bitmap = (Bitmap) l.b(iVar, 5L, TimeUnit.SECONDS);
                qVar.f(bitmap);
                o oVar = new o();
                oVar.f2431b = bitmap;
                oVar.d();
                qVar.g(oVar);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                xVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                StringBuilder c10 = a.c("Failed to download image: ");
                c10.append(e11.getCause());
                Log.w("FirebaseMessaging", c10.toString());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                xVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f19498b.getSystemService("notification")).notify(a10.f19491b, 0, a10.f19490a.a());
        return true;
    }
}
