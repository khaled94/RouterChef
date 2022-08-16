package y4;

import android.content.SharedPreferences;
import d4.m;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a */
    public final String f20273a;

    /* renamed from: b */
    public final boolean f20274b;

    /* renamed from: c */
    public boolean f20275c;

    /* renamed from: d */
    public boolean f20276d;

    /* renamed from: e */
    public final /* synthetic */ g2 f20277e;

    public a2(g2 g2Var, String str, boolean z10) {
        this.f20277e = g2Var;
        m.e(str);
        this.f20273a = str;
        this.f20274b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f20277e.n().edit();
        edit.putBoolean(this.f20273a, z10);
        edit.apply();
        this.f20276d = z10;
    }

    public final boolean b() {
        if (!this.f20275c) {
            this.f20275c = true;
            this.f20276d = this.f20277e.n().getBoolean(this.f20273a, this.f20274b);
        }
        return this.f20276d;
    }
}
