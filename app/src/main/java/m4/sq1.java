package m4;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class sq1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ tq1 f13813a = tq1.f14155f;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            tq1.a(this.f13813a, true);
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            tq1.a(this.f13813a, false);
        } else if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
        } else {
            tq1.a(this.f13813a, false);
        }
    }
}
