package androidx.lifecycle;

import androidx.lifecycle.g;
import e9.f;
import j1.b;
import j1.d;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import m.b;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public static final b f1734a = new b();

    /* renamed from: b */
    public static final c f1735b = new c();

    /* renamed from: c */
    public static final a f1736c = new a();

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends d & j0> void a(T t10) {
        b.AbstractC0077b abstractC0077b;
        f.e(t10, "<this>");
        g.c b10 = t10.a().b();
        f.d(b10, "lifecycle.currentState");
        if (b10 == g.c.INITIALIZED || b10 == g.c.CREATED) {
            j1.b c10 = t10.c();
            Objects.requireNonNull(c10);
            Iterator<Map.Entry<String, b.AbstractC0077b>> it = c10.f5430a.iterator();
            while (true) {
                b.e eVar = (b.e) it;
                if (!eVar.hasNext()) {
                    abstractC0077b = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) eVar.next();
                f.d(entry, "components");
                abstractC0077b = (b.AbstractC0077b) entry.getValue();
                if (f.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            }
            if (abstractC0077b != null) {
                return;
            }
            b0 b0Var = new b0(t10.c(), t10);
            t10.c().b("androidx.lifecycle.internal.SavedStateHandlesProvider", b0Var);
            t10.a().a(new SavedStateHandleAttacher(b0Var));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
