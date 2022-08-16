package m4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import b0.q;
import com.google.android.gms.ads.AdService;
import com.raouf.routerchef.R;
import h4.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k4.a;
import k4.b;
import l3.s;
import m3.n;
import n3.g1;
import n3.r0;
import n3.s1;

/* loaded from: classes.dex */
public final class c71 extends s30 {

    /* renamed from: t */
    public final Context f6731t;

    /* renamed from: u */
    public final f11 f6732u;

    /* renamed from: v */
    public final n90 f6733v;

    /* renamed from: w */
    public final v61 f6734w;

    /* renamed from: x */
    public final ep1 f6735x;

    public c71(Context context, v61 v61Var, n90 n90Var, f11 f11Var, ep1 ep1Var) {
        this.f6731t = context;
        this.f6732u = f11Var;
        this.f6733v = n90Var;
        this.f6734w = v61Var;
        this.f6735x = ep1Var;
    }

    public static void N3(Context context, f11 f11Var, ep1 ep1Var, v61 v61Var, String str, String str2) {
        O3(context, f11Var, ep1Var, v61Var, str, str2, new HashMap());
    }

    public static void O3(Context context, f11 f11Var, ep1 ep1Var, v61 v61Var, String str, String str2, Map<String, String> map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue()) {
            dp1 b10 = dp1.b(str2);
            b10.a("gqi", str);
            s sVar = s.B;
            s1 s1Var = sVar.f5789c;
            if (true == s1.h(context)) {
                str4 = "online";
            }
            b10.a("device_connectivity", str4);
            Objects.requireNonNull(sVar.f5796j);
            b10.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b10.a(entry.getKey(), entry.getValue());
            }
            str3 = ep1Var.b(b10);
        } else {
            e11 a10 = f11Var.a();
            a10.a("gqi", str);
            a10.a("action", str2);
            s sVar2 = s.B;
            s1 s1Var2 = sVar2.f5789c;
            if (true == s1.h(context)) {
                str4 = "online";
            }
            a10.a("device_connectivity", str4);
            Objects.requireNonNull(sVar2.f5796j);
            a10.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                a10.a(entry2.getKey(), entry2.getValue());
            }
            j11 j11Var = a10.f7690b.f8318a;
            str3 = j11Var.f10240e.a(a10.f7689a);
        }
        Objects.requireNonNull(s.B.f5796j);
        v61Var.c(new w61(System.currentTimeMillis(), str, str3, 2));
    }

    public static void P3(final Activity activity, final n nVar, final r0 r0Var, final v61 v61Var, final f11 f11Var, final ep1 ep1Var, final String str, final String str2) {
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        Objects.requireNonNull(sVar.f5791e);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 16974374);
        final Resources a10 = sVar.f5793g.a();
        builder.setTitle(a10 == null ? "Open ad when you're back online." : a10.getString(R.string.offline_opt_in_title)).setMessage(a10 == null ? "We'll send you a notification with a link to the advertiser site." : a10.getString(R.string.offline_opt_in_message)).setPositiveButton(a10 == null ? "OK" : a10.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: m4.z61
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.content.DialogInterface r19, int r20) {
                /*
                    r18 = this;
                    r1 = r18
                    m4.f11 r9 = m4.f11.this
                    android.app.Activity r10 = r2
                    m4.ep1 r11 = r3
                    m4.v61 r12 = r4
                    java.lang.String r13 = r5
                    n3.r0 r0 = r6
                    java.lang.String r14 = r7
                    android.content.res.Resources r15 = r8
                    m3.n r8 = r9
                    if (r9 == 0) goto L34
                    java.util.HashMap r7 = new java.util.HashMap
                    r7.<init>()
                    java.lang.String r2 = "dialog_action"
                    java.lang.String r3 = "confirm"
                    r7.put(r2, r3)
                    java.lang.String r16 = "dialog_click"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r17 = r7
                    r7 = r16
                    r1 = r8
                    r8 = r17
                    m4.c71.O3(r2, r3, r4, r5, r6, r7, r8)
                    goto L35
                L34:
                    r1 = r8
                L35:
                    k4.b r2 = new k4.b     // Catch: android.os.RemoteException -> L41
                    r2.<init>(r10)     // Catch: android.os.RemoteException -> L41
                    boolean r0 = r0.zzf(r2, r14, r13)     // Catch: android.os.RemoteException -> L41
                    if (r0 != 0) goto L56
                    goto L47
                L41:
                    r0 = move-exception
                    java.lang.String r2 = "Failed to schedule offline notification poster."
                    n3.g1.h(r2, r0)
                L47:
                    r12.b(r13)
                    if (r9 == 0) goto L56
                    java.lang.String r7 = "offline_notification_worker_not_scheduled"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    m4.c71.N3(r2, r3, r4, r5, r6, r7)
                L56:
                    l3.s r0 = l3.s.B
                    n3.s1 r2 = r0.f5789c
                    n3.x1 r0 = r0.f5791e
                    android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
                    java.util.Objects.requireNonNull(r0)
                    r0 = 16974374(0x1030226, float:2.4062441E-38)
                    r2.<init>(r10, r0)
                    if (r15 != 0) goto L6c
                    java.lang.String r0 = "You'll get a notification with the link when you're back online"
                    goto L73
                L6c:
                    r0 = 2131886411(0x7f12014b, float:1.94074E38)
                    java.lang.String r0 = r15.getString(r0)
                L73:
                    android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
                    m4.x61 r3 = new m4.x61
                    r3.<init>()
                    r0.setOnCancelListener(r3)
                    android.app.AlertDialog r0 = r2.create()
                    r0.show()
                    java.util.Timer r2 = new java.util.Timer
                    r2.<init>()
                    m4.b71 r3 = new m4.b71
                    r3.<init>(r0, r2, r1)
                    r0 = 3000(0xbb8, double:1.482E-320)
                    r2.schedule(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.z61.onClick(android.content.DialogInterface, int):void");
            }
        }).setNegativeButton(a10 == null ? "No thanks" : a10.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: m4.a71
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                v61 v61Var2 = v61.this;
                String str3 = str;
                f11 f11Var2 = f11Var;
                Activity activity2 = activity;
                ep1 ep1Var2 = ep1Var;
                n nVar2 = nVar;
                v61Var2.b(str3);
                if (f11Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    c71.O3(activity2, f11Var2, ep1Var2, v61Var2, str3, "dialog_click", hashMap);
                }
                if (nVar2 != null) {
                    nVar2.a();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: m4.y61
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                v61 v61Var2 = v61.this;
                String str3 = str;
                f11 f11Var2 = f11Var;
                Activity activity2 = activity;
                ep1 ep1Var2 = ep1Var;
                n nVar2 = nVar;
                v61Var2.b(str3);
                if (f11Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    c71.O3(activity2, f11Var2, ep1Var2, v61Var2, str3, "dialog_click", hashMap);
                }
                if (nVar2 != null) {
                    nVar2.a();
                }
            }
        });
        builder.create().show();
    }

    @Override // m4.t30
    public final void d() {
        this.f6734w.j(new b00(this.f6733v, 3));
    }

    @Override // m4.t30
    public final void r0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            s1 s1Var = s.B.f5789c;
            boolean h10 = s1.h(this.f6731t);
            HashMap hashMap = new HashMap();
            char c10 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == h10) {
                    c10 = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f6731t;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            char c11 = c10;
            O3(this.f6731t, this.f6732u, this.f6735x, this.f6734w, stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f6734w.getWritableDatabase();
                if (c11 == 1) {
                    this.f6734w.f14591t.execute(new t61(writableDatabase, stringExtra2, this.f6733v));
                    return;
                }
                v61.G(writableDatabase, stringExtra2);
            } catch (SQLiteException e10) {
                g1.g("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    @Override // m4.t30
    public final void u0(a aVar, String str, String str2) {
        Context context = (Context) b.e0(aVar);
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        if (f.a()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        ClipData clipData = wt1.f15104a;
        PendingIntent a10 = wt1.a(context, intent);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a11 = wt1.a(context, intent2);
        Resources a12 = sVar.f5793g.a();
        q qVar = new q(context, "offline_notification_channel");
        qVar.e(a12 == null ? "View the ad you saved when you were offline" : a12.getString(R.string.offline_notification_title));
        qVar.d(a12 == null ? "Tap to open ad" : a12.getString(R.string.offline_notification_text));
        qVar.c(true);
        qVar.f2452s.deleteIntent = a11;
        qVar.f2441g = a10;
        qVar.f2452s.icon = context.getApplicationInfo().icon;
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, qVar.a());
        O3(this.f6731t, this.f6732u, this.f6735x, this.f6734w, str2, "offline_notification_impression", new HashMap());
    }
}
