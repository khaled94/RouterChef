package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f417s;

    /* renamed from: t */
    public final /* synthetic */ IntentSender.SendIntentException f418t;

    /* renamed from: u */
    public final /* synthetic */ ComponentActivity.b f419u;

    public f(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f419u = bVar;
        this.f417s = i10;
        this.f418t = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f419u.b(this.f417s, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f418t));
    }
}
