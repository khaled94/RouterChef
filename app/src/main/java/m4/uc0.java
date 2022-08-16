package m4;

import android.content.Context;
import b4.f;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class uc0 implements f {

    /* renamed from: s */
    public final Context f14358s;

    /* renamed from: t */
    public final String f14359t;

    /* renamed from: u */
    public final WeakReference<fb0> f14360u;

    public uc0(fb0 fb0Var) {
        Context context = fb0Var.getContext();
        this.f14358s = context;
        this.f14359t = s.B.f5789c.D(context, fb0Var.m().f12051s);
        this.f14360u = new WeakReference<>(fb0Var);
    }

    public static /* bridge */ /* synthetic */ void g(uc0 uc0Var, Map map) {
        fb0 fb0Var = uc0Var.f14360u.get();
        if (fb0Var != null) {
            fb0Var.a("onPrecacheEvent", map);
        }
    }

    @Override // b4.f
    public void a() {
    }

    public abstract void h();

    public final void i(String str, String str2, String str3, String str4) {
        g90.f8771b.post(new tc0(this, str, str2, str3, str4));
    }

    public final void j(String str, String str2, long j3) {
        g90.f8771b.post(new sc0(this, str, str2, j3));
    }

    public final void k(String str, String str2, long j3, long j10, boolean z10, long j11, long j12, long j13, int i10, int i11) {
        g90.f8771b.post(new pc0(this, str, str2, j3, j10, j11, j12, j13, z10, i10, i11));
    }

    public void l(int i10) {
    }

    public void m(int i10) {
    }

    public void n(int i10) {
    }

    public void o(int i10) {
    }

    public abstract boolean p(String str);

    public boolean r(String str, String[] strArr) {
        return p(str);
    }

    public boolean s(String str, String[] strArr, lc0 lc0Var) {
        return p(str);
    }
}
