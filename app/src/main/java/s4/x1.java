package s4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x1 extends z1 {
    public final /* synthetic */ k2 C;

    /* renamed from: x */
    public final /* synthetic */ String f18174x;
    public final /* synthetic */ String y;

    /* renamed from: z */
    public final /* synthetic */ Bundle f18175z;

    /* renamed from: w */
    public final /* synthetic */ Long f18173w = null;
    public final /* synthetic */ boolean A = true;
    public final /* synthetic */ boolean B = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(k2 k2Var, String str, String str2, Bundle bundle) {
        super(k2Var, true);
        this.C = k2Var;
        this.f18174x = str;
        this.y = str2;
        this.f18175z = bundle;
    }

    @Override // s4.z1
    public final void a() {
        Long l10 = this.f18173w;
        long longValue = l10 == null ? this.f18212s : l10.longValue();
        s0 s0Var = this.C.f17956g;
        Objects.requireNonNull(s0Var, "null reference");
        s0Var.logEvent(this.f18174x, this.y, this.f18175z, this.A, this.B, longValue);
    }
}
