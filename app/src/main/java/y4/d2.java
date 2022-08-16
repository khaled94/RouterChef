package y4;

import android.content.SharedPreferences;
import d4.m;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a */
    public final String f20350a;

    /* renamed from: b */
    public final String f20351b;

    /* renamed from: c */
    public final String f20352c;

    /* renamed from: d */
    public final long f20353d;

    /* renamed from: e */
    public final /* synthetic */ g2 f20354e;

    public /* synthetic */ d2(g2 g2Var, long j3) {
        this.f20354e = g2Var;
        m.e("health_monitor");
        m.a(j3 > 0);
        this.f20350a = "health_monitor:start";
        this.f20351b = "health_monitor:count";
        this.f20352c = "health_monitor:value";
        this.f20353d = j3;
    }

    public final void a() {
        this.f20354e.g();
        Objects.requireNonNull(((w2) this.f20354e.f20505s).F);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f20354e.n().edit();
        edit.remove(this.f20351b);
        edit.remove(this.f20352c);
        edit.putLong(this.f20350a, currentTimeMillis);
        edit.apply();
    }
}
