package y4;

import android.os.Bundle;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import s.b;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a */
    public final String f20731a;

    /* renamed from: b */
    public final String f20732b;

    /* renamed from: c */
    public final long f20733c;

    /* renamed from: d */
    public final Bundle f20734d;

    public t1(String str, String str2, Bundle bundle, long j3) {
        this.f20731a = str;
        this.f20732b = str2;
        this.f20734d = bundle;
        this.f20733c = j3;
    }

    public static t1 b(p pVar) {
        return new t1(pVar.f20634s, pVar.f20636u, pVar.f20635t.s(), pVar.f20637v);
    }

    public final p a() {
        return new p(this.f20731a, new n(new Bundle(this.f20734d)), this.f20732b, this.f20733c);
    }

    public final String toString() {
        String str = this.f20732b;
        String str2 = this.f20731a;
        String valueOf = String.valueOf(this.f20734d);
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        b1.b(sb, "origin=", str, ",name=", str2);
        return b.b(sb, ",params=", valueOf);
    }
}
