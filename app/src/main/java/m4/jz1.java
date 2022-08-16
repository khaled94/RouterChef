package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class jz1<V> extends iz1<Object> implements tz1<Object> {

    /* renamed from: s */
    public final tz1<V> f10219s;

    public jz1(tz1<V> tz1Var) {
        this.f10219s = tz1Var;
    }

    @Override // m4.tz1
    public final void b(Runnable runnable, Executor executor) {
        this.f10219s.b(runnable, executor);
    }
}
