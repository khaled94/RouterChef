package u2;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a */
    public final a f19068a;

    /* renamed from: b */
    public final j f19069b;

    /* renamed from: c */
    public final Map<String, n> f19070c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Context f19071a;

        /* renamed from: b */
        public Map<String, String> f19072b = null;

        public a(Context context) {
            this.f19071a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final u2.d a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: u2.l.a.a(java.lang.String):u2.d");
        }
    }

    public l(Context context, j jVar) {
        a aVar = new a(context);
        this.f19068a = aVar;
        this.f19069b = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, u2.n>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.String, u2.n>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, u2.n>] */
    @Override // u2.e
    public final synchronized n a(String str) {
        if (this.f19070c.containsKey(str)) {
            return (n) this.f19070c.get(str);
        }
        d a10 = this.f19068a.a(str);
        if (a10 == null) {
            return null;
        }
        j jVar = this.f19069b;
        n create = a10.create(new c(jVar.f19062a, jVar.f19063b, jVar.f19064c, str));
        this.f19070c.put(str, create);
        return create;
    }
}
