package m4;

import f3.m;
import h3.c;
import h3.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fw extends g {

    /* renamed from: a */
    public final ew f8652a;

    /* renamed from: c */
    public final wu f8654c;

    /* renamed from: b */
    public final List<c> f8653b = new ArrayList();

    /* renamed from: d */
    public final m f8655d = new m();

    /* renamed from: e */
    public final List<Object> f8656e = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:56:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<h3.c>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fw(m4.ew r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8653b = r1
            f3.m r1 = new f3.m
            r1.<init>()
            r5.f8655d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8656e = r1
            r5.f8652a = r6
            r1 = 0
            java.util.List r6 = r6.v()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof m4.vu     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            m4.vu r3 = (m4.vu) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            m4.uu r3 = new m4.uu     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List<h3.c> r2 = r5.f8653b     // Catch: android.os.RemoteException -> L5b
            m4.wu r4 = new m4.wu     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            n3.g1.h(r0, r6)
        L5f:
            m4.ew r6 = r5.f8652a     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.q()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            m4.yp r2 = m4.ar.N3(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List<java.lang.Object> r3 = r5.f8656e     // Catch: android.os.RemoteException -> L8e
            m4.lh r4 = new m4.lh     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            n3.g1.h(r0, r6)
        L92:
            m4.ew r6 = r5.f8652a     // Catch: android.os.RemoteException -> La1
            m4.vu r6 = r6.n()     // Catch: android.os.RemoteException -> La1
            if (r6 == 0) goto La5
            m4.wu r2 = new m4.wu     // Catch: android.os.RemoteException -> La1
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La1
            r1 = r2
            goto La5
        La1:
            r6 = move-exception
            n3.g1.h(r0, r6)
        La5:
            r5.f8654c = r1
            m4.ew r6 = r5.f8652a     // Catch: android.os.RemoteException -> Lbb
            m4.pu r6 = r6.h()     // Catch: android.os.RemoteException -> Lbb
            if (r6 == 0) goto Lbf
            m4.qu r6 = new m4.qu     // Catch: android.os.RemoteException -> Lbb
            m4.ew r1 = r5.f8652a     // Catch: android.os.RemoteException -> Lbb
            m4.pu r1 = r1.h()     // Catch: android.os.RemoteException -> Lbb
            r6.<init>(r1)     // Catch: android.os.RemoteException -> Lbb
            goto Lbf
        Lbb:
            r6 = move-exception
            n3.g1.h(r0, r6)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.fw.<init>(m4.ew):void");
    }
}
