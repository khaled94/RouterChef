package a2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.a;
import java.util.Objects;
import t1.h;

/* loaded from: classes.dex */
public final class b extends c<Boolean> {

    /* renamed from: i */
    public static final String f12i = h.e("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // a2.d
    public final Object a() {
        Intent registerReceiver = this.f18b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            h.c().b(f12i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // a2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // a2.c
    public final void g(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        h.c().a(f12i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        c(bool);
    }
}
