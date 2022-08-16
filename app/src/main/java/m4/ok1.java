package m4;

import java.util.AbstractMap;
import java.util.Iterator;
import n3.g1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class ok1 implements kz1, z90, r92 {

    /* renamed from: s */
    public static final cz0 f12189s = new cz0(1);

    /* renamed from: t */
    public static final eo1 f12190t = new eo1();

    public /* synthetic */ ok1() {
    }

    @Override // m4.kz1
    public /* synthetic */ void a(@NullableDecl Object obj) {
        Void r12 = (Void) obj;
        g1.a("Notification of cache hit successful.");
    }

    @Override // m4.kz1
    public void f(Throwable th) {
        g1.a("Notification of cache hit failed.");
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        g1.a("Ending javascript session.");
        g00 g00Var = (g00) ((f00) obj);
        Iterator<AbstractMap.SimpleEntry<String, lx<? super f00>>> it = g00Var.f8695t.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, lx<? super f00>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            g1.a(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            g00Var.f8694s.v0(next.getKey(), next.getValue());
        }
        g00Var.f8695t.clear();
    }

    public /* synthetic */ ok1(Object obj) {
    }
}
