package d4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a1 implements Handler.Callback {

    /* renamed from: s */
    public final /* synthetic */ b1 f3803s;

    public /* synthetic */ a1(b1 b1Var) {
        this.f3803s = b1Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection>, java.util.HashMap] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f3803s.f3828d) {
                y0 y0Var = (y0) message.obj;
                z0 z0Var = this.f3803s.f3828d.get(y0Var);
                if (z0Var != null && z0Var.f3937a.isEmpty()) {
                    if (z0Var.f3939c) {
                        z0Var.f3943g.f3830f.removeMessages(1, z0Var.f3941e);
                        b1 b1Var = z0Var.f3943g;
                        b1Var.f3831g.c(b1Var.f3829e, z0Var);
                        z0Var.f3939c = false;
                        z0Var.f3938b = 2;
                    }
                    this.f3803s.f3828d.remove(y0Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f3803s.f3828d) {
                y0 y0Var2 = (y0) message.obj;
                z0 z0Var2 = this.f3803s.f3828d.get(y0Var2);
                if (z0Var2 != null && z0Var2.f3938b == 3) {
                    String valueOf = String.valueOf(y0Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = z0Var2.f3942f;
                    if (componentName == null) {
                        Objects.requireNonNull(y0Var2);
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = y0Var2.f3933b;
                        m.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    z0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
