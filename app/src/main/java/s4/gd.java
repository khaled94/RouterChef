package s4;

import java.util.List;
import m4.lq0;

/* loaded from: classes.dex */
public final class gd extends h {

    /* renamed from: u */
    public final lq0 f17899u;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public gd(lq0 lq0Var) {
        super("internal.logger");
        this.f17899u = lq0Var;
        this.f17901t.put("log", new fd(this, false, true));
        this.f17901t.put("silent", new ob());
        ((h) this.f17901t.get("silent")).k("log", new fd(this, true, true));
        this.f17901t.put("unmonitored", new pc());
        ((h) this.f17901t.get("unmonitored")).k("log", new fd(this, false, false));
    }

    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        return n.f18009j;
    }
}
