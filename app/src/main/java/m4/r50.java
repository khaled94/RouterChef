package m4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import l3.s;

/* loaded from: classes.dex */
public final class r50 {
    public int A;
    public final String B;
    public boolean C;

    /* renamed from: a */
    public int f13141a;

    /* renamed from: b */
    public boolean f13142b;

    /* renamed from: c */
    public boolean f13143c;

    /* renamed from: d */
    public int f13144d;

    /* renamed from: e */
    public int f13145e;

    /* renamed from: f */
    public int f13146f;

    /* renamed from: g */
    public String f13147g;

    /* renamed from: h */
    public int f13148h;

    /* renamed from: i */
    public int f13149i;

    /* renamed from: j */
    public int f13150j;

    /* renamed from: k */
    public boolean f13151k;

    /* renamed from: l */
    public int f13152l;

    /* renamed from: m */
    public double f13153m;

    /* renamed from: n */
    public boolean f13154n;

    /* renamed from: o */
    public String f13155o;
    public String p;

    /* renamed from: q */
    public final boolean f13156q;

    /* renamed from: r */
    public final boolean f13157r;

    /* renamed from: s */
    public final String f13158s;

    /* renamed from: t */
    public final boolean f13159t;

    /* renamed from: u */
    public final boolean f13160u;

    /* renamed from: v */
    public final boolean f13161v;

    /* renamed from: w */
    public final String f13162w;

    /* renamed from: x */
    public final String f13163x;
    public float y;

    /* renamed from: z */
    public int f13164z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:2|(1:4)(1:5)|6|(1:8)|9|(3:31|14|(7:16|17|33|18|(1:20)|21|(2:27|28)(1:26)))|11|17|33|18|(0)|21|(1:23)(3:24|27|28)) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:18:0x0095, B:20:0x00a3), top: B:33:0x0095 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r50(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.c(r7)
            r6.e(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r4
        L21:
            r6.f13156q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r3 = r4
        L2d:
            r6.f13157r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f13158s = r2
            l3.s r2 = l3.s.B
            n3.s1 r2 = r2.f5789c
            m4.io r2 = m4.io.f9708f
            m4.g90 r2 = r2.f9709a
            boolean r2 = m4.g90.e()
            r6.f13159t = r2
            boolean r2 = h4.d.a(r7)
            r6.f13160u = r2
            boolean r2 = h4.d.d(r7)
            r6.f13161v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f13162w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L62
        L60:
            r0 = r2
            goto L93
        L62:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L67
            goto L60
        L67:
            j4.b r3 = j4.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            android.content.pm.PackageInfo r3 = r3.d(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r3 == 0) goto L60
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            int r4 = r4.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r5.<init>(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r5.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r5.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            java.lang.String r0 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
        L93:
            r6.f13163x = r0
            j4.b r0 = j4.c.a(r7)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.d(r3, r4)     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lc3
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lc3
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Lc3
            int r4 = r4.length()     // Catch: java.lang.Exception -> Lc3
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lc3
            r5.append(r3)     // Catch: java.lang.Exception -> Lc3
            r5.append(r1)     // Catch: java.lang.Exception -> Lc3
            r5.append(r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> Lc3
        Lc3:
            r6.B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lcc
            return
        Lcc:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto Ld3
            return
        Ld3:
            float r0 = r7.density
            r6.y = r0
            int r0 = r7.widthPixels
            r6.f13164z = r0
            int r7 = r7.heightPixels
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r50.<init>(android.content.Context):void");
    }

    public r50(Context context, s50 s50Var) {
        c(context);
        e(context);
        d(context);
        this.f13155o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = xs.a(context);
        this.f13156q = s50Var.f13515a;
        this.f13157r = s50Var.f13516b;
        this.f13158s = s50Var.f13517c;
        this.f13159t = s50Var.f13518d;
        this.f13160u = s50Var.f13519e;
        this.f13161v = s50Var.f13520f;
        this.f13162w = s50Var.f13521g;
        this.f13163x = s50Var.f13522h;
        this.B = s50Var.f13523i;
        this.y = s50Var.f13526l;
        this.f13164z = s50Var.f13527m;
        this.A = s50Var.f13528n;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            s.B.f5793g.g(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final s50 a() {
        return new s50(this.f13156q, this.f13157r, this.f13158s, this.f13159t, this.f13160u, this.f13161v, this.f13162w, this.f13163x, this.B, this.f13148h, this.f13149i, this.y, this.f13164z, this.A);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f13141a = audioManager.getMode();
                this.f13142b = audioManager.isMusicActive();
                this.f13143c = audioManager.isSpeakerphoneOn();
                this.f13144d = audioManager.getStreamVolume(3);
                this.f13145e = audioManager.getRingerMode();
                this.f13146f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                s.B.f5793g.g(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f13141a = -2;
        this.f13142b = false;
        this.f13143c = false;
        this.f13144d = 0;
        this.f13145e = 2;
        this.f13146f = 0;
    }

    public final void d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            this.f13153m = -1.0d;
            this.f13154n = false;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        this.f13153m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        }
        this.f13154n = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f13147g = r2
            boolean r2 = h4.f.c()
            r3 = 0
            if (r2 == 0) goto L31
            m4.yr<java.lang.Boolean> r2 = m4.es.D5
            m4.jo r4 = m4.jo.f10145d
            m4.ds r4 = r4.f10148c
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f13149i = r2
            int r0 = r0.getPhoneType()
            r5.f13150j = r0
            r0 = -2
            r5.f13148h = r0
            r5.f13151k = r3
            r0 = -1
            r5.f13152l = r0
            l3.s r2 = l3.s.B
            n3.s1 r2 = r2.f5789c
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = n3.s1.e(r6, r2)
            if (r6 == 0) goto L70
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L68
            int r0 = r6.getType()
            r5.f13148h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f13152l = r6
            goto L6a
        L68:
            r5.f13148h = r0
        L6a:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f13151k = r6
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r50.e(android.content.Context):void");
    }
}
