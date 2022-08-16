package m4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class gi2 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ ii2 f8941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi2(ii2 ii2Var, Looper looper) {
        super(looper);
        this.f8941a = ii2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            m4.ii2 r0 = r10.f8941a
            int r1 = r11.what
            r2 = 0
            if (r1 == 0) goto L3f
            r3 = 1
            if (r1 == r3) goto L24
            r3 = 2
            if (r1 == r3) goto L1e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r11 = r0.f9665d
            r11.set(r1)
            goto L59
        L1e:
            m4.h21 r11 = r0.f9666e
            r11.b()
            goto L59
        L24:
            java.lang.Object r11 = r11.obj
            r2 = r11
            m4.hi2 r2 = (m4.hi2) r2
            int r4 = r2.f9348a
            android.media.MediaCodec$CryptoInfo r6 = r2.f9350c
            long r7 = r2.f9351d
            int r9 = r2.f9352e
            java.lang.Object r11 = m4.ii2.f9661h     // Catch: java.lang.RuntimeException -> L53
            monitor-enter(r11)     // Catch: java.lang.RuntimeException -> L53
            android.media.MediaCodec r3 = r0.f9662a     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3c
            goto L59
        L3c:
            r1 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.RuntimeException -> L53
        L3f:
            java.lang.Object r11 = r11.obj
            r2 = r11
            m4.hi2 r2 = (m4.hi2) r2
            int r4 = r2.f9348a
            int r6 = r2.f9349b
            long r7 = r2.f9351d
            int r9 = r2.f9352e
            android.media.MediaCodec r3 = r0.f9662a     // Catch: java.lang.RuntimeException -> L53
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L53
            goto L59
        L53:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f9665d
            r0.set(r11)
        L59:
            if (r2 == 0) goto L66
            java.util.ArrayDeque<m4.hi2> r11 = m4.ii2.f9660g
            monitor-enter(r11)
            r11.add(r2)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L63
            throw r0
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.gi2.handleMessage(android.os.Message):void");
    }
}
