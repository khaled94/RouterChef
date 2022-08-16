package m4;

import android.content.Context;
import k4.b;

/* loaded from: classes.dex */
public final class w81 implements qt0 {

    /* renamed from: s */
    public final cm1 f14879s;

    /* renamed from: t */
    public final u20 f14880t;

    /* renamed from: u */
    public final boolean f14881u;

    /* renamed from: v */
    public cp0 f14882v = null;

    public w81(cm1 cm1Var, u20 u20Var, boolean z10) {
        this.f14879s = cm1Var;
        this.f14880t = u20Var;
        this.f14881u = z10;
    }

    @Override // m4.qt0
    public final void c(boolean z10, Context context, zo0 zo0Var) {
        boolean z11;
        try {
            if (this.f14881u) {
                z11 = this.f14880t.s3(new b(context));
            } else {
                z11 = this.f14880t.Z(new b(context));
            }
            if (!z11) {
                throw new pt0("Adapter failed to show.");
            }
            if (this.f14882v == null) {
                return;
            }
            if (((Boolean) jo.f10145d.f10148c.a(es.Y0)).booleanValue() || this.f14879s.V != 2) {
                return;
            }
            this.f14882v.zza();
        } catch (Throwable th) {
            throw new pt0(th);
        }
    }
}
