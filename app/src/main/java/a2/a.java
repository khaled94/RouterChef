package a2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t1.h;

/* loaded from: classes.dex */
public final class a extends c<Boolean> {

    /* renamed from: i */
    public static final String f11i = h.e("BatteryChrgTracker");

    public a(Context context, f2.a aVar) {
        super(context, aVar);
    }

    @Override // a2.d
    public final Object a() {
        Intent registerReceiver = this.f18b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            h.c().b(f11i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // a2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r7.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // a2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L7
            return
        L7:
            t1.h r0 = t1.h.c()
            java.lang.String r1 = a2.a.f11i
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r5 = "Received %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.a(r1, r3, r5)
            r0 = -1
            int r1 = r7.hashCode()
            switch(r1) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r2 = r0
            goto L51
        L28:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L31
            goto L26
        L31:
            r2 = 3
            goto L51
        L33:
            java.lang.String r1 = "android.os.action.CHARGING"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L3c
            goto L26
        L3c:
            r2 = 2
            goto L51
        L3e:
            java.lang.String r1 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L51
            goto L26
        L47:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L50
            goto L26
        L50:
            r2 = r4
        L51:
            switch(r2) {
                case 0: goto L58;
                case 1: goto L58;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L5d
        L55:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L5a
        L58:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L5a:
            r6.c(r7)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.a.g(android.content.Intent):void");
    }
}
