package a4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.b;
import androidx.fragment.app.g0;
import androidx.fragment.app.t;
import b0.n;
import b0.p;
import b0.q;
import com.raouf.routerchef.R;
import d4.m;
import d4.u;
import d4.v;
import d4.w;
import d4.x;
import h4.d;
import h4.f;
import java.util.Objects;
import r.g;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c */
    public static final Object f129c = new Object();

    /* renamed from: d */
    public static final e f130d = new e();

    @Override // a4.f
    public final Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // a4.f
    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    public final int d(Context context) {
        return super.c(context, f.f132a);
    }

    public final boolean e(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog f10 = f(activity, i10, new v(super.b(activity, i10, "d"), activity), onCancelListener);
        if (f10 == null) {
            return false;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog f(Context context, int i10, x xVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(u.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String string = context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? 17039370 : R.string.common_google_play_services_enable_button : R.string.common_google_play_services_update_button : R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, xVar);
        }
        String c10 = u.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final void g(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof t) {
                g0 J = ((t) activity).J();
                k kVar = new k();
                m.i(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                kVar.C0 = dialog;
                if (onCancelListener != null) {
                    kVar.D0 = onCancelListener;
                }
                kVar.f1493z0 = false;
                kVar.A0 = true;
                b bVar = new b(J);
                bVar.p = true;
                bVar.d(0, kVar, str, 1);
                bVar.c();
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        m.i(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        cVar.f119s = dialog;
        if (onCancelListener != null) {
            cVar.f120t = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i10 != 6) {
                return;
            }
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        } else {
            String e10 = i10 == 6 ? u.e(context, "common_google_play_services_resolution_required_title") : u.c(context, i10);
            if (e10 == null) {
                e10 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            String d5 = (i10 == 6 || i10 == 19) ? u.d(context, "common_google_play_services_resolution_required_text", u.a(context)) : u.b(context, i10);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            Objects.requireNonNull(systemService, "null reference");
            NotificationManager notificationManager = (NotificationManager) systemService;
            q qVar = new q(context, null);
            qVar.f2447m = true;
            qVar.c(true);
            qVar.e(e10);
            p pVar = new p();
            pVar.f2434b = q.b(d5);
            qVar.g(pVar);
            if (d.b(context)) {
                qVar.f2452s.icon = context.getApplicationInfo().icon;
                qVar.f2444j = 2;
                if (d.c(context)) {
                    qVar.f2436b.add(new n(resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    qVar.f2441g = pendingIntent;
                }
            } else {
                qVar.f2452s.icon = 17301642;
                qVar.f2452s.tickerText = q.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                qVar.f2452s.when = System.currentTimeMillis();
                qVar.f2441g = pendingIntent;
                qVar.d(d5);
            }
            if (f.a()) {
                m.j(f.a());
                synchronized (f129c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                g<String, String> gVar = u.f3919a;
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    qVar.f2450q = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                qVar.f2450q = "com.google.android.gms.availability";
            }
            Notification a10 = qVar.a();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                i.f139a.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, a10);
        }
    }

    public final boolean i(Activity activity, c4.g gVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog f10 = f(activity, i10, new w(super.b(activity, i10, "d"), gVar), onCancelListener);
        if (f10 == null) {
            return false;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
