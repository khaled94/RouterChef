package m4;

import android.content.Context;
import android.text.TextUtils;
import h2.a;
import l3.s;

/* loaded from: classes.dex */
public final class o70 implements rh {

    /* renamed from: s */
    public final Context f12019s;

    /* renamed from: t */
    public final Object f12020t;

    /* renamed from: u */
    public final String f12021u;

    /* renamed from: v */
    public boolean f12022v;

    public o70(Context context, String str) {
        this.f12019s = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12021u = str;
        this.f12022v = false;
        this.f12020t = new Object();
    }

    public final void a(boolean z10) {
        s sVar = s.B;
        if (!sVar.f5809x.l(this.f12019s)) {
            return;
        }
        synchronized (this.f12020t) {
            try {
                if (this.f12022v == z10) {
                    return;
                }
                this.f12022v = z10;
                if (TextUtils.isEmpty(this.f12021u)) {
                    return;
                }
                if (this.f12022v) {
                    x70 x70Var = sVar.f5809x;
                    Context context = this.f12019s;
                    String str = this.f12021u;
                    if (x70Var.l(context)) {
                        if (x70.m(context)) {
                            x70Var.d("beginAdUnitExposure", new u70(str));
                        } else {
                            x70Var.a(context, str, "beginAdUnitExposure");
                        }
                    }
                } else {
                    x70 x70Var2 = sVar.f5809x;
                    Context context2 = this.f12019s;
                    String str2 = this.f12021u;
                    if (x70Var2.l(context2)) {
                        if (x70.m(context2)) {
                            x70Var2.d("endAdUnitExposure", new a(str2));
                        } else {
                            x70Var2.a(context2, str2, "endAdUnitExposure");
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m4.rh
    public final void x(qh qhVar) {
        a(qhVar.f12866j);
    }
}
