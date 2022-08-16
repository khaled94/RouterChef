package d4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class z0 implements ServiceConnection {

    /* renamed from: a */
    public final Map<ServiceConnection, ServiceConnection> f3937a = new HashMap();

    /* renamed from: b */
    public int f3938b = 2;

    /* renamed from: c */
    public boolean f3939c;

    /* renamed from: d */
    public IBinder f3940d;

    /* renamed from: e */
    public final y0 f3941e;

    /* renamed from: f */
    public ComponentName f3942f;

    /* renamed from: g */
    public final /* synthetic */ b1 f3943g;

    public z0(b1 b1Var, y0 y0Var) {
        this.f3943g = b1Var;
        this.f3941e = y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r10, java.util.concurrent.Executor r11) {
        /*
            r9 = this;
            r0 = 3
            r9.f3938b = r0
            d4.b1 r0 = r9.f3943g
            g4.a r1 = r0.f3831g
            android.content.Context r2 = r0.f3829e
            d4.y0 r0 = r9.f3941e
            java.lang.String r3 = "ConnectionStatusConfig"
            java.lang.String r4 = r0.f3932a
            r5 = 0
            if (r4 == 0) goto L79
            boolean r4 = r0.f3935d
            if (r4 == 0) goto L67
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = r0.f3932a
            java.lang.String r7 = "serviceActionBundleKey"
            r4.putString(r7, r6)
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f
            android.net.Uri r7 = d4.y0.f3931e     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r4 = r6.call(r7, r8, r5, r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            goto L3e
        L2f:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "Dynamic intent resolution failed: "
            java.lang.String r4 = r6.concat(r4)
            android.util.Log.w(r3, r4)
            r4 = r5
        L3e:
            if (r4 != 0) goto L41
            goto L4a
        L41:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r4.getParcelable(r5)
            r5 = r4
            android.content.Intent r5 = (android.content.Intent) r5
        L4a:
            if (r5 != 0) goto L67
            java.lang.String r4 = r0.f3932a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            int r7 = r4.length()
            if (r7 == 0) goto L5f
            java.lang.String r4 = r6.concat(r4)
            goto L64
        L5f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L64:
            android.util.Log.w(r3, r4)
        L67:
            if (r5 == 0) goto L6a
            goto L82
        L6a:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r0.f3932a
            r3.<init>(r4)
            java.lang.String r0 = r0.f3933b
            android.content.Intent r0 = r3.setPackage(r0)
            r4 = r0
            goto L83
        L79:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r5 = r0.setComponent(r5)
        L82:
            r4 = r5
        L83:
            d4.y0 r0 = r9.f3941e
            int r6 = r0.f3934c
            r3 = r10
            r5 = r9
            r7 = r11
            boolean r10 = r1.d(r2, r3, r4, r5, r6, r7)
            r9.f3939c = r10
            if (r10 == 0) goto La9
            d4.b1 r10 = r9.f3943g
            r4.e r10 = r10.f3830f
            d4.y0 r11 = r9.f3941e
            r0 = 1
            android.os.Message r10 = r10.obtainMessage(r0, r11)
            d4.b1 r11 = r9.f3943g
            r4.e r11 = r11.f3830f
            d4.b1 r0 = r9.f3943g
            long r0 = r0.f3833i
            r11.sendMessageDelayed(r10, r0)
            return
        La9:
            r10 = 2
            r9.f3938b = r10
            d4.b1 r10 = r9.f3943g     // Catch: java.lang.IllegalArgumentException -> Lb5
            g4.a r11 = r10.f3831g     // Catch: java.lang.IllegalArgumentException -> Lb5
            android.content.Context r10 = r10.f3829e     // Catch: java.lang.IllegalArgumentException -> Lb5
            r11.c(r10, r9)     // Catch: java.lang.IllegalArgumentException -> Lb5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.z0.a(java.lang.String, java.util.concurrent.Executor):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3943g.f3828d) {
            this.f3943g.f3830f.removeMessages(1, this.f3941e);
            this.f3940d = iBinder;
            this.f3942f = componentName;
            for (ServiceConnection serviceConnection : this.f3937a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f3938b = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3943g.f3828d) {
            this.f3943g.f3830f.removeMessages(1, this.f3941e);
            this.f3940d = null;
            this.f3942f = componentName;
            for (ServiceConnection serviceConnection : this.f3937a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f3938b = 2;
        }
    }
}
