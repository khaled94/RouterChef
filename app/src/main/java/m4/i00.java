package m4;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class i00 {

    /* renamed from: a */
    public final Object f9496a = new Object();

    /* renamed from: b */
    public final Object f9497b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c */
    public m00 f9498c;
    @GuardedBy("lockService")

    /* renamed from: d */
    public m00 f9499d;

    public final m00 a(Context context, o90 o90Var) {
        m00 m00Var;
        synchronized (this.f9496a) {
            if (this.f9498c == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f9498c = new m00(context, o90Var, (String) jo.f10145d.f10148c.a(es.f8049a));
            }
            m00Var = this.f9498c;
        }
        return m00Var;
    }

    public final m00 b(Context context, o90 o90Var) {
        m00 m00Var;
        synchronized (this.f9497b) {
            if (this.f9499d == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f9499d = new m00(context, o90Var, vt.f14777a.e());
            }
            m00Var = this.f9499d;
        }
        return m00Var;
    }
}
