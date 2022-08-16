package n3;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import h4.b;
import l3.s;
import m4.ut;
import m4.vt1;

/* loaded from: classes.dex */
public final class h1 extends vt1 {
    public h1(Looper looper) {
        super(looper);
    }

    @Override // m4.vt1
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            s1 s1Var = s.B.f5789c;
            Context context = s.B.f5793g.f16039e;
            if (context != null) {
                try {
                    if (ut.f14486b.e().booleanValue()) {
                        b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            s.B.f5793g.g(e10, "AdMobHandler.handleMessage");
        }
    }
}
