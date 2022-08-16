package m4;

import r.g;

/* loaded from: classes.dex */
public final class lv0 {

    /* renamed from: h */
    public static final lv0 f11029h = new lv0(new kv0());

    /* renamed from: a */
    public final kv f11030a;

    /* renamed from: b */
    public final iv f11031b;

    /* renamed from: c */
    public final wv f11032c;

    /* renamed from: d */
    public final tv f11033d;

    /* renamed from: e */
    public final hz f11034e;

    /* renamed from: f */
    public final g<String, qv> f11035f;

    /* renamed from: g */
    public final g<String, nv> f11036g;

    public lv0(kv0 kv0Var) {
        this.f11030a = kv0Var.f10581a;
        this.f11031b = kv0Var.f10582b;
        this.f11032c = kv0Var.f10583c;
        this.f11035f = new g<>(kv0Var.f10586f);
        this.f11036g = new g<>(kv0Var.f10587g);
        this.f11033d = kv0Var.f10584d;
        this.f11034e = kv0Var.f10585e;
    }

    public final nv a(String str) {
        return this.f11036g.getOrDefault(str, null);
    }
}
