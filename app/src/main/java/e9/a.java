package e9;

import h9.c;
import java.io.Serializable;
import java.util.Objects;
import k9.u;

/* loaded from: classes.dex */
public abstract class a implements h9.a, Serializable {

    /* renamed from: s */
    public transient h9.a f4448s;

    /* renamed from: t */
    public final Object f4449t;

    /* renamed from: u */
    public final Class f4450u;

    /* renamed from: v */
    public final String f4451v;

    /* renamed from: w */
    public final String f4452w;

    /* renamed from: x */
    public final boolean f4453x;

    /* renamed from: e9.a$a */
    /* loaded from: classes.dex */
    public static class C0067a implements Serializable {

        /* renamed from: s */
        public static final C0067a f4454s = new C0067a();
    }

    public a() {
        this.f4449t = C0067a.f4454s;
        this.f4450u = null;
        this.f4451v = null;
        this.f4452w = null;
        this.f4453x = false;
    }

    public a(Object obj, boolean z10) {
        this.f4449t = obj;
        this.f4450u = u.class;
        this.f4451v = "classSimpleName";
        this.f4452w = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;";
        this.f4453x = z10;
    }

    public abstract h9.a b();

    public final c c() {
        Class cls = this.f4450u;
        if (cls == null) {
            return null;
        }
        if (this.f4453x) {
            Objects.requireNonNull(k.f4470a);
            return new h(cls);
        }
        return k.a(cls);
    }
}
