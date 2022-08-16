package m4;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d.d;
import java.util.concurrent.TimeUnit;
import l3.s;
import u9.f;

/* loaded from: classes.dex */
public final class p41 implements kz1, qt0, v91 {

    /* renamed from: s */
    public final Object f12406s;

    public /* synthetic */ p41() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f12406s = new f();
    }

    public /* synthetic */ p41(Object obj) {
        this.f12406s = obj;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((q41) this.f12406s).f12696c.l0((km1) obj);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [m4.qa2, java.lang.Object] */
    public final qa2 b(n82 n82Var) {
        qa2 a10 = ((fa0) this.f12406s).a(n82Var);
        ((fa0) this.f12406s).e(a10);
        return ((fa0) this.f12406s).c(a10);
    }

    @Override // m4.qt0
    public final void c(boolean z10, Context context, zo0 zo0Var) {
        w90 w90Var = (w90) this.f12406s;
        try {
            d dVar = s.B.f5788b;
            d.e(context, (AdOverlayInfoParcel) w90Var.get(), true);
        } catch (Exception unused) {
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((rx) obj).C0(be2.v((ze2) this.f12406s));
    }
}
