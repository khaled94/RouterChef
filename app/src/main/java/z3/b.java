package z3;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c5.i;
import c5.l;
import i4.a;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a */
    public final ExecutorService f20926a;

    public b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20926a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public abstract int a(Context context, a aVar);

    public void b(Bundle bundle) {
    }

    public final int c(Context context, Intent intent) {
        i iVar;
        int i10;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            iVar = l.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            t a10 = t.a(context);
            synchronized (a10) {
                i10 = a10.f20967d;
                a10.f20967d = i10 + 1;
            }
            iVar = a10.b(new o(i10, bundle));
        }
        int a11 = a(context, new a(intent));
        try {
            l.b(iVar, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return a11;
    }

    public final int d(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.f20926a.execute(new Runnable() { // from class: z3.i
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z10 = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                Objects.requireNonNull(bVar);
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int d5 = intent3 != null ? bVar.d(context2, intent3) : bVar.c(context2, intent2);
                    if (z10) {
                        pendingResult.setResultCode(d5);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }
}
