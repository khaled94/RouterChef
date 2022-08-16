package z3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import c5.i;
import c5.j;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import m3.h;
import q4.a;
import r.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h */
    public static int f20927h;

    /* renamed from: i */
    public static PendingIntent f20928i;

    /* renamed from: j */
    public static final Pattern f20929j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f20931b;

    /* renamed from: c */
    public final u f20932c;

    /* renamed from: d */
    public final ScheduledThreadPoolExecutor f20933d;

    /* renamed from: f */
    public Messenger f20935f;

    /* renamed from: g */
    public h f20936g;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    public final g<String, j<Bundle>> f20930a = new g<>();

    /* renamed from: e */
    public Messenger f20934e = new Messenger(new e(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f20931b = context;
        this.f20932c = new u(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20933d = scheduledThreadPoolExecutor;
    }

    public final i<Bundle> a(Bundle bundle) {
        String num;
        synchronized (c.class) {
            int i10 = f20927h;
            f20927h = i10 + 1;
            num = Integer.toString(i10);
        }
        j<Bundle> jVar = new j<>();
        synchronized (this.f20930a) {
            this.f20930a.put(num, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f20932c.a() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        Context context = this.f20931b;
        synchronized (c.class) {
            if (f20928i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f20928i = PendingIntent.getBroadcast(context, 0, intent2, a.f17148a);
            }
            intent.putExtra("app", f20928i);
        }
        intent.putExtra("kid", androidx.fragment.app.a.b(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("Sending ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        intent.putExtra("google.messenger", this.f20934e);
        if (this.f20935f != null || this.f20936g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f20935f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f20936g.f20938s;
                    Objects.requireNonNull(messenger2);
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            jVar.f2776a.b(w.f20975s, new v(this, num, this.f20933d.schedule(new h(jVar, 1), 30L, TimeUnit.SECONDS)));
            return jVar.f2776a;
        }
        if (this.f20932c.a() == 2) {
            this.f20931b.sendBroadcast(intent);
        } else {
            this.f20931b.startService(intent);
        }
        jVar.f2776a.b(w.f20975s, new v(this, num, this.f20933d.schedule(new h(jVar, 1), 30L, TimeUnit.SECONDS)));
        return jVar.f2776a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f20930a) {
            j<Bundle> remove = this.f20930a.remove(str);
            if (remove != null) {
                remove.b(bundle);
                return;
            }
            String valueOf = String.valueOf(str);
            Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
        }
    }
}
