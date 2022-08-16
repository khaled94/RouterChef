package m4;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class gj1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ al1 f8950a;

    public /* synthetic */ gj1(al1 al1Var) {
        this.f8950a = al1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (m4.ls1.f10971a >= 29) goto L28;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 9
            r1 = 6
            r2 = 4
            r3 = 29
            r4 = 1
            r5 = 0
            r6 = 5
            if (r10 != 0) goto L14
            goto L4e
        L14:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
            if (r10 == 0) goto L4c
            boolean r7 = r10.isConnected()
            if (r7 != 0) goto L21
            goto L4c
        L21:
            int r7 = r10.getType()
            if (r7 == 0) goto L36
            if (r7 == r4) goto L44
            if (r7 == r2) goto L36
            if (r7 == r6) goto L36
            if (r7 == r1) goto L46
            if (r7 == r0) goto L34
            r0 = 8
            goto L4f
        L34:
            r0 = 7
            goto L4f
        L36:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L48;
                case 4: goto L48;
                case 5: goto L48;
                case 6: goto L48;
                case 7: goto L48;
                case 8: goto L48;
                case 9: goto L48;
                case 10: goto L48;
                case 11: goto L48;
                case 12: goto L48;
                case 13: goto L46;
                case 14: goto L48;
                case 15: goto L48;
                case 16: goto L3d;
                case 17: goto L48;
                case 18: goto L44;
                case 19: goto L3d;
                case 20: goto L3f;
                default: goto L3d;
            }
        L3d:
            r0 = r1
            goto L4f
        L3f:
            int r10 = m4.ls1.f10971a
            if (r10 < r3) goto L4e
            goto L4f
        L44:
            r0 = 2
            goto L4f
        L46:
            r0 = r6
            goto L4f
        L48:
            r0 = r2
            goto L4f
        L4a:
            r0 = 3
            goto L4f
        L4c:
            r0 = r4
            goto L4f
        L4e:
            r0 = r5
        L4f:
            int r10 = m4.ls1.f10971a
            if (r10 < r3) goto L78
            if (r0 != r6) goto L78
            java.lang.String r0 = "phone"
            java.lang.Object r9 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L79
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.RuntimeException -> L79
            java.util.Objects.requireNonNull(r9)
            m4.ek1 r0 = new m4.ek1     // Catch: java.lang.RuntimeException -> L79
            m4.al1 r1 = r8.f8950a     // Catch: java.lang.RuntimeException -> L79
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L79
            r1 = 31
            if (r10 >= r1) goto L6f
            r9.listen(r0, r4)     // Catch: java.lang.RuntimeException -> L79
            goto L74
        L6f:
            r10 = 1048576(0x100000, float:1.469368E-39)
            r9.listen(r0, r10)     // Catch: java.lang.RuntimeException -> L79
        L74:
            r9.listen(r0, r5)     // Catch: java.lang.RuntimeException -> L79
            return
        L78:
            r6 = r0
        L79:
            m4.al1 r9 = r8.f8950a
            m4.al1.a(r9, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.gj1.onReceive(android.content.Context, android.content.Intent):void");
    }
}
