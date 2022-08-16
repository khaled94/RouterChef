package g4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import d4.m;
import d4.z0;
import j4.c;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    public static final Object f4889b = new Object();
    @Nullable

    /* renamed from: c */
    public static volatile a f4890c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f4891a = new ConcurrentHashMap<>();

    public static a b() {
        if (f4890c == null) {
            synchronized (f4889b) {
                if (f4890c == null) {
                    f4890c = new a();
                }
            }
        }
        a aVar = f4890c;
        m.h(aVar);
        return aVar;
    }

    public static final boolean e(Context context, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return (!(Build.VERSION.SDK_INT >= 29) || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if ((!(serviceConnection instanceof z0)) && this.f4891a.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService(this.f4891a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
                return;
            } finally {
                this.f4891a.remove(serviceConnection);
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof z0)) {
            ServiceConnection putIfAbsent = this.f4891a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean e10 = e(context, intent, serviceConnection, i10, executor);
                if (!e10) {
                    return false;
                }
                return e10;
            } finally {
                this.f4891a.remove(serviceConnection, serviceConnection);
            }
        }
        return e(context, intent, serviceConnection, i10, executor);
    }
}
