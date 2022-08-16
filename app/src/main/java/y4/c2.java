package y4;

import android.content.SharedPreferences;
import d4.m;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a */
    public final String f20329a;

    /* renamed from: b */
    public final long f20330b;

    /* renamed from: c */
    public boolean f20331c;

    /* renamed from: d */
    public long f20332d;

    /* renamed from: e */
    public final /* synthetic */ g2 f20333e;

    public c2(g2 g2Var, String str, long j3) {
        this.f20333e = g2Var;
        m.e(str);
        this.f20329a = str;
        this.f20330b = j3;
    }

    public final long a() {
        if (!this.f20331c) {
            this.f20331c = true;
            this.f20332d = this.f20333e.n().getLong(this.f20329a, this.f20330b);
        }
        return this.f20332d;
    }

    public final void b(long j3) {
        SharedPreferences.Editor edit = this.f20333e.n().edit();
        edit.putLong(this.f20329a, j3);
        edit.apply();
        this.f20332d = j3;
    }
}
