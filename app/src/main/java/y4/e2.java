package y4;

import android.content.SharedPreferences;
import d4.m;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a */
    public final String f20379a;

    /* renamed from: b */
    public boolean f20380b;

    /* renamed from: c */
    public String f20381c;

    /* renamed from: d */
    public final /* synthetic */ g2 f20382d;

    public e2(g2 g2Var, String str) {
        this.f20382d = g2Var;
        m.e(str);
        this.f20379a = str;
    }

    public final String a() {
        if (!this.f20380b) {
            this.f20380b = true;
            this.f20381c = this.f20382d.n().getString(this.f20379a, null);
        }
        return this.f20381c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f20382d.n().edit();
        edit.putString(this.f20379a, str);
        edit.apply();
        this.f20381c = str;
    }
}
