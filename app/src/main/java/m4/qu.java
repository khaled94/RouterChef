package m4;

import h3.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qu {

    /* renamed from: a */
    public final pu f12994a;

    /* renamed from: b */
    public final List<c> f12995b = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        r4.f12995b.add(new m4.wu(r3));
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<h3.c>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qu(m4.pu r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f12995b = r1
            r4.f12994a = r5
            r5.e()     // Catch: android.os.RemoteException -> L12
            goto L16
        L12:
            r1 = move-exception
            n3.g1.h(r0, r1)
        L16:
            java.util.List r5 = r5.f()     // Catch: android.os.RemoteException -> L53
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L53
        L1e:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L53
            if (r1 == 0) goto L52
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L53
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L53
            r3 = 0
            if (r2 == 0) goto L45
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L53
            if (r1 != 0) goto L32
            goto L45
        L32:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L53
            boolean r3 = r2 instanceof m4.vu     // Catch: android.os.RemoteException -> L53
            if (r3 == 0) goto L40
            r3 = r2
            m4.vu r3 = (m4.vu) r3     // Catch: android.os.RemoteException -> L53
            goto L45
        L40:
            m4.uu r3 = new m4.uu     // Catch: android.os.RemoteException -> L53
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L53
        L45:
            if (r3 == 0) goto L1e
            java.util.List<h3.c> r1 = r4.f12995b     // Catch: android.os.RemoteException -> L53
            m4.wu r2 = new m4.wu     // Catch: android.os.RemoteException -> L53
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L53
            r1.add(r2)     // Catch: android.os.RemoteException -> L53
            goto L1e
        L52:
            return
        L53:
            r5 = move-exception
            n3.g1.h(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.qu.<init>(m4.pu):void");
    }
}
