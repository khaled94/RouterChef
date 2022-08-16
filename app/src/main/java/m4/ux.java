package m4;

import java.util.Map;
import m3.v;

/* loaded from: classes.dex */
public final class ux implements v {

    /* renamed from: a */
    public boolean f14519a = false;

    /* renamed from: b */
    public final /* synthetic */ boolean f14520b;

    /* renamed from: c */
    public final /* synthetic */ ym f14521c;

    /* renamed from: d */
    public final /* synthetic */ Map f14522d;

    /* renamed from: e */
    public final /* synthetic */ Map f14523e;

    public ux(boolean z10, ym ymVar, Map map, Map map2) {
        this.f14520b = z10;
        this.f14521c = ymVar;
        this.f14522d = map;
        this.f14523e = map2;
    }

    @Override // m3.v
    public final void I(int i10) {
    }

    @Override // m3.v
    public final void J(boolean z10) {
        if (!this.f14519a) {
            if (z10 && this.f14520b) {
                ((js0) this.f14521c).B0();
            }
            this.f14519a = true;
            this.f14522d.put((String) this.f14523e.get("event_id"), Boolean.valueOf(z10));
            ((jz) this.f14521c).a("openIntentAsync", this.f14522d);
        }
    }
}
