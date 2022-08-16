package o;

import a.b;
import android.content.ComponentName;
import android.content.ServiceConnection;

/* loaded from: classes.dex */
public abstract class c implements ServiceConnection {

    /* loaded from: classes.dex */
    public class a extends b {
        public a(b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            o.c$a r0 = new o.c$a
            int r1 = a.b.a.f0s
            r1 = 0
            if (r7 != 0) goto L9
            r2 = r1
            goto L1d
        L9:
            java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
            android.os.IInterface r2 = r7.queryLocalInterface(r2)
            if (r2 == 0) goto L18
            boolean r3 = r2 instanceof a.b
            if (r3 == 0) goto L18
            a.b r2 = (a.b) r2
            goto L1d
        L18:
            a.b$a$a r2 = new a.b$a$a
            r2.<init>(r7)
        L1d:
            r0.<init>(r2, r6)
            r6 = r5
            m4.wd2 r6 = (m4.wd2) r6
            java.lang.ref.WeakReference<m4.xs> r6 = r6.f14945a
            java.lang.Object r6 = r6.get()
            m4.xs r6 = (m4.xs) r6
            if (r6 == 0) goto Lb9
            r6.f15458b = r0
            r2.n3()     // Catch: android.os.RemoteException -> L32
        L32:
            m4.ws r6 = r6.f15460d
            if (r6 == 0) goto Lb9
            n3.m1 r6 = (n3.m1) r6
            m4.xs r7 = r6.f16527a
            o.b r0 = r7.f15458b
            if (r0 != 0) goto L3f
            goto L5b
        L3f:
            o.d r2 = r7.f15457a
            if (r2 != 0) goto L5e
            o.a r2 = new o.a
            r2.<init>()
            a.b r3 = r0.f16729a     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r3.t2(r2)     // Catch: android.os.RemoteException -> L5b
            if (r3 != 0) goto L51
            goto L5b
        L51:
            o.d r3 = new o.d
            a.b r4 = r0.f16729a
            android.content.ComponentName r0 = r0.f16730b
            r3.<init>(r4, r2, r0)
            goto L5c
        L5b:
            r3 = r1
        L5c:
            r7.f15457a = r3
        L5e:
            o.d r7 = r7.f15457a
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2)
            r2 = 1
            if (r7 == 0) goto L73
            android.content.ComponentName r3 = r7.f16733c
            java.lang.String r3 = r3.getPackageName()
            r0.setPackage(r3)
        L73:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            if (r7 != 0) goto L7c
            r7 = r1
            goto L83
        L7c:
            a.a r7 = r7.f16732b
            a.a$a r7 = (a.a.AbstractBinderC0000a) r7
            java.util.Objects.requireNonNull(r7)
        L83:
            java.lang.String r4 = "android.support.customtabs.extra.SESSION"
            b0.i.b(r3, r4, r7)
            r0.putExtras(r3)
            java.lang.String r7 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r0.putExtra(r7, r2)
            android.content.Context r7 = r6.f16528b
            java.lang.String r7 = n9.d.c(r7)
            r0.setPackage(r7)
            android.content.Context r7 = r6.f16528b
            android.net.Uri r2 = r6.f16529c
            r0.setData(r2)
            java.lang.Object r2 = c0.a.f2602a
            c0.a.C0037a.b(r7, r0, r1)
            m4.xs r7 = r6.f16527a
            android.content.Context r6 = r6.f16528b
            android.app.Activity r6 = (android.app.Activity) r6
            m4.wd2 r0 = r7.f15459c
            if (r0 != 0) goto Lb0
            goto Lb9
        Lb0:
            r6.unbindService(r0)
            r7.f15458b = r1
            r7.f15457a = r1
            r7.f15459c = r1
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
