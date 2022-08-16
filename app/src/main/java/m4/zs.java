package m4;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import l3.b;

/* loaded from: classes.dex */
public final class zs implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f16321a = 1;

    /* renamed from: b */
    public final vd2 f16322b;

    /* renamed from: c */
    public final vd2 f16323c;

    /* renamed from: d */
    public final vd2 f16324d;

    public zs(vd2 vd2Var, vd2 vd2Var2) {
        this.f16322b = vd2Var;
        this.f16323c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        switch (this.f16321a) {
            case 0:
                ((en1) this.f16322b).b();
                return new ys((ScheduledExecutorService) this.f16323c.a());
            default:
                return new b((Context) this.f16322b.a(), (g70) this.f16323c.a());
        }
    }

    public zs(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3) {
        this.f16322b = vd2Var;
        this.f16323c = vd2Var2;
        this.f16324d = vd2Var3;
    }
}
