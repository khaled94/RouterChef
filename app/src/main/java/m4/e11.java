package m4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m3.h;

/* loaded from: classes.dex */
public final class e11 {

    /* renamed from: a */
    public final Map<String, String> f7689a = new ConcurrentHashMap();

    /* renamed from: b */
    public final /* synthetic */ f11 f7690b;

    public e11(f11 f11Var) {
        this.f7690b = f11Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final e11 a(String str, String str2) {
        this.f7689a.put(str, str2);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final e11 b(em1 em1Var) {
        this.f7689a.put("gqi", em1Var.f8004b);
        return this;
    }

    public final void c() {
        this.f7690b.f8319b.execute(new h(this, 3));
    }
}
