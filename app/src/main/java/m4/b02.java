package m4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class b02<V> implements Runnable {
    @CheckForNull

    /* renamed from: s */
    public d02<V> f6313s;

    public b02(d02<V> d02Var) {
        this.f6313s = d02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tz1<V> tz1Var;
        d02<V> d02Var = this.f6313s;
        if (d02Var == null || (tz1Var = d02Var.f7167z) == null) {
            return;
        }
        this.f6313s = null;
        if (tz1Var.isDone()) {
            d02Var.n(tz1Var);
            return;
        }
        try {
            ScheduledFuture<?> scheduledFuture = d02Var.A;
            d02Var.A = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                if (abs > 10) {
                    StringBuilder sb = new StringBuilder(75);
                    sb.append(str);
                    sb.append(" (timeout delayed by ");
                    sb.append(abs);
                    sb.append(" ms after scheduled time)");
                    str = sb.toString();
                }
            }
            String obj = tz1Var.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            d02Var.m(new c02(sb2.toString()));
        } finally {
            tz1Var.cancel(true);
        }
    }
}
