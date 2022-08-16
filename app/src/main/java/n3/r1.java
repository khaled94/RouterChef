package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class r1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ s1 f16552a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f16552a.f16559c = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
        } else {
            this.f16552a.f16559c = false;
        }
    }
}
