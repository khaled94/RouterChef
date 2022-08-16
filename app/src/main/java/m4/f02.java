package m4;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f02 extends rz1 {

    /* renamed from: u */
    public final Callable f8311u;

    /* renamed from: v */
    public final /* synthetic */ g02 f8312v;

    public f02(g02 g02Var, Callable callable) {
        this.f8312v = g02Var;
        Objects.requireNonNull(callable);
        this.f8311u = callable;
    }

    @Override // m4.rz1
    public final Object a() {
        return this.f8311u.call();
    }

    @Override // m4.rz1
    public final String b() {
        return this.f8311u.toString();
    }

    @Override // m4.rz1
    public final void d(Throwable th) {
        this.f8312v.m(th);
    }

    @Override // m4.rz1
    public final void e(Object obj) {
        this.f8312v.l(obj);
    }

    @Override // m4.rz1
    public final boolean f() {
        return this.f8312v.isDone();
    }
}
