package m4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ge1 implements eh1<he1> {

    /* renamed from: a */
    public final uz1 f8839a;

    /* renamed from: b */
    public final Context f8840b;

    public ge1(uz1 uz1Var, Context context) {
        this.f8839a = uz1Var;
        this.f8840b = context;
    }

    @Override // m4.eh1
    public final tz1<he1> a() {
        return this.f8839a.Z(new Callable() { // from class: m4.fe1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                double d5;
                ge1 ge1Var = ge1.this;
                Objects.requireNonNull(ge1Var);
                Intent registerReceiver = ge1Var.f8840b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z10 = false;
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    d5 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
                    if (intExtra == 2 || intExtra == 5) {
                        z10 = true;
                    }
                } else {
                    d5 = -1.0d;
                }
                return new he1(d5, z10);
            }
        });
    }
}
