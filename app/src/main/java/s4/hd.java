package s4;

import d.b;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class hd extends h {

    /* renamed from: u */
    public final Callable<Object> f17914u;

    public hd(Callable callable) {
        super("internal.appMetadata");
        this.f17914u = callable;
    }

    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        try {
            return b.j(this.f17914u.call());
        } catch (Exception unused) {
            return n.f18009j;
        }
    }
}
