package m4;

import androidx.fragment.app.a;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class d02<V> extends fz1<V> {
    @CheckForNull
    public ScheduledFuture<?> A;
    @CheckForNull

    /* renamed from: z */
    public tz1<V> f7167z;

    public d02(tz1<V> tz1Var) {
        Objects.requireNonNull(tz1Var);
        this.f7167z = tz1Var;
    }

    @Override // m4.my1
    @CheckForNull
    public final String h() {
        tz1<V> tz1Var = this.f7167z;
        ScheduledFuture<?> scheduledFuture = this.A;
        if (tz1Var != null) {
            String obj = tz1Var.toString();
            String b10 = a.b(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
            if (scheduledFuture == null) {
                return b10;
            }
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay <= 0) {
                return b10;
            }
            StringBuilder sb = new StringBuilder(b10.length() + 43);
            sb.append(b10);
            sb.append(", remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    @Override // m4.my1
    public final void i() {
        k(this.f7167z);
        ScheduledFuture<?> scheduledFuture = this.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f7167z = null;
        this.A = null;
    }
}
