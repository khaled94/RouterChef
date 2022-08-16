package m4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class ae0 implements kz1<Map<String, String>> {

    /* renamed from: s */
    public final /* synthetic */ List f6127s;

    /* renamed from: t */
    public final /* synthetic */ String f6128t;

    /* renamed from: u */
    public final /* synthetic */ Uri f6129u;

    /* renamed from: v */
    public final /* synthetic */ ce0 f6130v;

    public ae0(ce0 ce0Var, List list, String str, Uri uri) {
        this.f6130v = ce0Var;
        this.f6127s = list;
        this.f6128t = str;
        this.f6129u = uri;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.f6130v.f((Map) obj, this.f6127s, this.f6128t);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        g1.j("Failed to parse gmsg params for: ".concat(String.valueOf(this.f6129u)));
    }
}
