package m4;

import android.content.Context;
import android.os.RemoteException;
import d.a;
import java.util.Objects;
import n3.g1;
import p3.d;

/* loaded from: classes.dex */
public final class y20 implements d {

    /* renamed from: s */
    public final Object f15573s;

    /* renamed from: t */
    public Object f15574t;

    /* renamed from: u */
    public Object f15575u;

    public /* synthetic */ y20(b30 b30Var, l20 l20Var, l10 l10Var) {
        this.f15575u = b30Var;
        this.f15573s = l20Var;
        this.f15574t = l10Var;
    }

    public /* synthetic */ y20(f11 f11Var, km1 km1Var, ep1 ep1Var) {
        this.f15573s = ep1Var;
        this.f15574t = f11Var;
        this.f15575u = km1Var;
    }

    public /* synthetic */ y20(gh0 gh0Var) {
        this.f15573s = gh0Var;
    }

    public static String b(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j3, int i10) {
        if (((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue()) {
            dp1 b10 = dp1.b("ad_closed");
            b10.e(((km1) this.f15575u).f10489b.f10126b);
            b10.a("show_time", String.valueOf(j3));
            b10.a("ad_format", "app_open_ad");
            b10.a("acr", b(i10));
            ((ep1) this.f15573s).a(b10);
            return;
        }
        e11 a10 = ((f11) this.f15574t).a();
        a10.b(((km1) this.f15575u).f10489b.f10126b);
        a10.a("action", "ad_closed");
        a10.a("show_time", String.valueOf(j3));
        a10.a("ad_format", "app_open_ad");
        a10.a("acr", b(i10));
        a10.c();
    }

    public final y20 c(Context context) {
        Objects.requireNonNull(context);
        this.f15574t = context;
        return this;
    }

    public final bh0 d() {
        a.g((Context) this.f15574t, Context.class);
        return new bh0((gh0) this.f15573s, (Context) this.f15574t, (String) this.f15575u);
    }

    @Override // p3.d
    public final void e(f3.a aVar) {
        try {
            ((l20) this.f15573s).t(aVar.a());
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }
}
