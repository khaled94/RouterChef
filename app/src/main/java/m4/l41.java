package m4;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l41 implements gq0 {

    /* renamed from: s */
    public final Context f10653s;

    /* renamed from: t */
    public final x70 f10654t;

    public l41(Context context, x70 x70Var) {
        this.f10653s = context;
        this.f10654t = x70Var;
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        if (!TextUtils.isEmpty(km1Var.f10489b.f10126b.f8006d)) {
            x70 x70Var = this.f10654t;
            Context context = this.f10653s;
            jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
            Objects.requireNonNull(x70Var);
            if (((Boolean) jo.f10145d.f10148c.a(es.f8080e0)).booleanValue() && x70Var.l(context) && x70.m(context)) {
                synchronized (x70Var.f15239l) {
                }
            }
            this.f10654t.b(this.f10653s, "_aq", km1Var.f10489b.f10126b.f8006d, null);
        }
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
    }
}
