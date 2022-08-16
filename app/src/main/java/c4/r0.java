package c4;

import android.app.Dialog;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    public final /* synthetic */ Dialog f2728a;

    /* renamed from: b */
    public final /* synthetic */ s0 f2729b;

    public r0(s0 s0Var, Dialog dialog) {
        this.f2729b = s0Var;
        this.f2728a = dialog;
    }

    public final void a() {
        this.f2729b.f2733t.i();
        if (this.f2728a.isShowing()) {
            this.f2728a.dismiss();
        }
    }
}
