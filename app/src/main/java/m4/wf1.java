package m4;

import android.content.Context;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import l3.s;

/* loaded from: classes.dex */
public final class wf1 implements eh1<xf1> {

    /* renamed from: a */
    public final uz1 f14955a;

    /* renamed from: b */
    public final Context f14956b;

    /* renamed from: c */
    public final Set<String> f14957c;

    public wf1(uz1 uz1Var, Context context, Set<String> set) {
        this.f14955a = uz1Var;
        this.f14956b = context;
        this.f14957c = set;
    }

    @Override // m4.eh1
    public final tz1<xf1> a() {
        return this.f14955a.Z(new Callable() { // from class: m4.vf1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wf1 wf1Var = wf1.this;
                Objects.requireNonNull(wf1Var);
                if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
                    Set<String> set = wf1Var.f14957c;
                    if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                        ki kiVar = s.B.f5807v;
                        return new xf1(kiVar.a().e0(wf1Var.f14956b));
                    }
                }
                return new xf1(null);
            }
        });
    }
}
