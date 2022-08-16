package k6;

import android.os.Bundle;
import o6.e;
import x4.a;

/* loaded from: classes.dex */
public final class d implements a.AbstractC0149a {

    /* renamed from: a */
    public final /* synthetic */ e f5607a;

    public d(e eVar) {
        this.f5607a = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @Override // y4.l3
    public final void a(String str, String str2, Bundle bundle, long j3) {
        if (str == null || str.equals("crash") || !(!a.f5598a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j3);
        bundle2.putBundle("params", bundle);
        ((e) this.f5607a.f5608a).a(3, bundle2);
    }
}
