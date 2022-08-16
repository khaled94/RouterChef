package a2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.a;
import java.util.Objects;
import t1.h;

/* loaded from: classes.dex */
public final class f extends c<Boolean> {

    /* renamed from: i */
    public static final String f30i = h.e("StorageNotLowTracker");

    public f(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // a2.d
    public final Object a() {
        Context context = this.f18b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            Objects.requireNonNull(action);
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    @Override // a2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // a2.c
    public final void g(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        h.c().a(f30i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        c(bool);
    }
}
