package s4;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o0 extends u0 {

    /* renamed from: s */
    public final AtomicReference<Bundle> f18037s = new AtomicReference<>();

    /* renamed from: t */
    public boolean f18038t;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T E1(android.os.Bundle r3, java.lang.Class<T> r4) {
        /*
            if (r3 == 0) goto L31
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L31
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            goto L32
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L31:
            r3 = 0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.o0.E1(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle c0(long j3) {
        Bundle bundle;
        synchronized (this.f18037s) {
            if (!this.f18038t) {
                try {
                    this.f18037s.wait(j3);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f18037s.get();
        }
        return bundle;
    }

    public final String e0(long j3) {
        return (String) E1(c0(j3), String.class);
    }

    @Override // s4.v0
    public final void l0(Bundle bundle) {
        synchronized (this.f18037s) {
            this.f18037s.set(bundle);
            this.f18038t = true;
            this.f18037s.notify();
        }
    }
}
