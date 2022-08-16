package y4;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import d4.m;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final String f20542a;

    /* renamed from: b */
    public final String f20543b;

    /* renamed from: c */
    public final String f20544c;

    /* renamed from: d */
    public final long f20545d;

    /* renamed from: e */
    public final long f20546e;

    /* renamed from: f */
    public final n f20547f;

    public l(w2 w2Var, String str, String str2, String str3, long j3, long j10, n nVar) {
        m.e(str2);
        m.e(str3);
        Objects.requireNonNull(nVar, "null reference");
        this.f20542a = str2;
        this.f20543b = str3;
        this.f20544c = true == TextUtils.isEmpty(str) ? null : str;
        this.f20545d = j3;
        this.f20546e = j10;
        if (j10 != 0 && j10 > j3) {
            w2Var.C().A.c("Event created with reverse previous/current timestamps. appId, name", s1.s(str2), s1.s(str3));
        }
        this.f20547f = nVar;
    }

    public final l a(w2 w2Var, long j3) {
        return new l(w2Var, this.f20544c, this.f20542a, this.f20543b, this.f20545d, j3, this.f20547f);
    }

    public final String toString() {
        String str = this.f20542a;
        String str2 = this.f20543b;
        String valueOf = String.valueOf(this.f20547f);
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 33, String.valueOf(str2).length(), valueOf.length()));
        b1.b(sb, "Event{appId='", str, "', name='", str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public l(w2 w2Var, String str, String str2, String str3, long j3, Bundle bundle) {
        n nVar;
        m.e(str2);
        m.e(str3);
        this.f20542a = str2;
        this.f20543b = str3;
        this.f20544c = true == TextUtils.isEmpty(str) ? null : str;
        this.f20545d = j3;
        this.f20546e = 0L;
        if (bundle == null || bundle.isEmpty()) {
            nVar = new n(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w2Var.C().f20710x.a("Param name can't be null");
                } else {
                    Object n10 = w2Var.z().n(next, bundle2.get(next));
                    if (n10 == null) {
                        w2Var.C().A.b("Param value can't be null", w2Var.E.e(next));
                    } else {
                        w2Var.z().z(bundle2, next, n10);
                    }
                }
                it.remove();
            }
            nVar = new n(bundle2);
        }
        this.f20547f = nVar;
    }
}
