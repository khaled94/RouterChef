package d4;

import r4.b;

/* loaded from: classes.dex */
public abstract class h0 extends b implements i {
    public h0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r5.f3897s >= r3.f3897s) goto L23;
     */
    @Override // r4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(int r8, android.os.Parcel r9, android.os.Parcel r10) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r0) goto L71
            r1 = 2
            if (r8 == r1) goto L59
            r1 = 3
            if (r8 == r1) goto Lb
            r8 = 0
            return r8
        Lb:
            int r8 = r9.readInt()
            android.os.IBinder r1 = r9.readStrongBinder()
            android.os.Parcelable$Creator<d4.u0> r2 = d4.u0.CREATOR
            android.os.Parcelable r9 = r4.c.a(r9, r2)
            d4.u0 r9 = (d4.u0) r9
            r2 = r7
            d4.q0 r2 = (d4.q0) r2
            d4.b r3 = r2.f3910s
            java.lang.String r4 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            d4.m.i(r3, r4)
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r9, r4)
            r3.f3825v = r9
            boolean r3 = r3 instanceof o4.c
            if (r3 == 0) goto L53
            d4.d r3 = r9.f3924v
            d4.n r4 = d4.n.a()
            if (r3 != 0) goto L3a
            r3 = 0
            goto L3c
        L3a:
            d4.o r3 = r3.f3851s
        L3c:
            monitor-enter(r4)
            if (r3 != 0) goto L42
            d4.o r3 = d4.n.f3895c     // Catch: java.lang.Throwable -> L50
            goto L4c
        L42:
            d4.o r5 = r4.f3896a     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L4c
            int r5 = r5.f3897s     // Catch: java.lang.Throwable -> L50
            int r6 = r3.f3897s     // Catch: java.lang.Throwable -> L50
            if (r5 >= r6) goto L4e
        L4c:
            r4.f3896a = r3     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r4)
            goto L53
        L50:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L53:
            android.os.Bundle r9 = r9.f3921s
            r2.c0(r8, r1, r9)
            goto L87
        L59:
            r9.readInt()
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = r4.c.a(r9, r8)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r9 = "GmsClient"
            java.lang.String r1 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r9, r1, r8)
            goto L87
        L71:
            int r8 = r9.readInt()
            android.os.IBinder r1 = r9.readStrongBinder()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = r4.c.a(r9, r2)
            android.os.Bundle r9 = (android.os.Bundle) r9
            r2 = r7
            d4.q0 r2 = (d4.q0) r2
            r2.c0(r8, r1, r9)
        L87:
            r10.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.h0.w(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
