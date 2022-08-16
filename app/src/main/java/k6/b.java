package k6;

import android.os.Bundle;
import java.util.Set;
import n9.d;
import o6.e;
import x4.a;

/* loaded from: classes.dex */
public final class b implements a.AbstractC0149a {

    /* renamed from: a */
    public final /* synthetic */ c f5604a;

    public b(c cVar) {
        this.f5604a = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @Override // y4.l3
    public final void a(String str, String str2, Bundle bundle, long j3) {
        if (!this.f5604a.f5605a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        Set<String> set = a.f5598a;
        String d5 = d.d(str2);
        if (d5 != null) {
            str2 = d5;
        }
        bundle2.putString("events", str2);
        ((e) this.f5604a.f5606b).a(2, bundle2);
    }
}
