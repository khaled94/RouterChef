package s4;

import c1.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class jd extends h {

    /* renamed from: u */
    public final h6 f17944u;

    /* renamed from: v */
    public final Map<String, h> f17945v = new HashMap();

    public jd(h6 h6Var) {
        super("require");
        this.f17944u = h6Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map<java.lang.String, s4.h>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.Map<java.lang.String, s4.h>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, s4.h>, java.util.HashMap] */
    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        n nVar;
        f.m("require", 1, list);
        String h10 = a4Var.b(list.get(0)).h();
        if (this.f17945v.containsKey(h10)) {
            return (n) this.f17945v.get(h10);
        }
        h6 h6Var = this.f17944u;
        if (((Map) h6Var.f17907s).containsKey(h10)) {
            try {
                nVar = (n) ((Callable) ((Map) h6Var.f17907s).get(h10)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(h10);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            nVar = n.f18009j;
        }
        if (nVar instanceof h) {
            this.f17945v.put(h10, (h) nVar);
        }
        return nVar;
    }
}
