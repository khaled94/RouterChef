package m4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class nf2 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ of2 f11655a;

    public /* synthetic */ nf2(of2 of2Var) {
        this.f11655a = of2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        of2 of2Var = this.f11655a;
        of2Var.f12146b.post(new yu0(of2Var, 1));
    }
}
