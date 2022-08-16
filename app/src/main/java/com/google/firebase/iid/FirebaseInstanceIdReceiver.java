package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c5.l;
import java.util.concurrent.ExecutionException;
import u7.o;
import u7.y;
import z3.a;
import z3.b;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b {
    @Override // z3.b
    public final int a(Context context, a aVar) {
        try {
            return ((Integer) l.a(new o(context).b(aVar.f20925s))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // z3.b
    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (y.b(putExtras)) {
            y.a("_nd", putExtras.getExtras());
        }
    }
}
