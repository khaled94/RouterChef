package s4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import d4.m;
import java.util.Objects;
import k4.b;
import y4.q2;

/* loaded from: classes.dex */
public final class i1 extends z1 {

    /* renamed from: w */
    public final /* synthetic */ Context f17916w;

    /* renamed from: x */
    public final /* synthetic */ Bundle f17917x;
    public final /* synthetic */ k2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k2 k2Var, String str, String str2, Context context, Bundle bundle) {
        super(k2Var, true);
        this.y = k2Var;
        this.f17916w = context;
        this.f17917x = bundle;
    }

    @Override // s4.z1
    public final void a() {
        s0 s0Var;
        try {
            m.h(this.f17916w);
            k2 k2Var = this.y;
            Context context = this.f17916w;
            Objects.requireNonNull(k2Var);
            try {
                s0Var = r0.asInterface(DynamiteModule.c(context, DynamiteModule.f2946d, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.a e10) {
                k2Var.a(e10, true, false);
                s0Var = null;
            }
            k2Var.f17956g = s0Var;
            if (this.y.f17956g == null) {
                Objects.requireNonNull(this.y);
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.f17916w, ModuleDescriptor.MODULE_ID);
            int d5 = DynamiteModule.d(this.f17916w, ModuleDescriptor.MODULE_ID, false);
            b1 b1Var = new b1(43042L, Math.max(a10, d5), d5 < a10, null, null, null, this.f17917x, q2.a(this.f17916w));
            s0 s0Var2 = this.y.f17956g;
            Objects.requireNonNull(s0Var2, "null reference");
            s0Var2.initialize(new b(this.f17916w), b1Var, this.f18212s);
        } catch (Exception e11) {
            this.y.a(e11, true, false);
        }
    }
}
