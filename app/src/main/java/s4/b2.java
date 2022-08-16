package s4;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class b2 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Bundle f17740w;

    /* renamed from: x */
    public final /* synthetic */ Activity f17741x;
    public final /* synthetic */ j2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(j2 j2Var, Bundle bundle, Activity activity) {
        super(j2Var.f17936s, true);
        this.y = j2Var;
        this.f17740w = bundle;
        this.f17741x = activity;
    }

    @Override // s4.z1
    public final void a() {
        Bundle bundle;
        if (this.f17740w != null) {
            bundle = new Bundle();
            if (this.f17740w.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f17740w.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        s0 s0Var = this.y.f17936s.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.onActivityCreated(new b(this.f17741x), bundle, this.f18213t);
    }
}
