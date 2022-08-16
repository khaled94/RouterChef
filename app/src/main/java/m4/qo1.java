package m4;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qo1 {
    public static final <O> to1<O> a(Callable<O> callable, uz1 uz1Var, Object obj, uo1 uo1Var) {
        return new to1<>(uo1Var, obj, uo1.f14464d, Collections.emptyList(), uz1Var.Z(callable));
    }

    public static final <O> to1<O> b(tz1<O> tz1Var, Object obj, uo1 uo1Var) {
        return new to1<>(uo1Var, obj, uo1.f14464d, Collections.emptyList(), tz1Var);
    }

    public static final to1 c(final lo1 lo1Var, uz1 uz1Var, Object obj, uo1 uo1Var) {
        return a(new Callable() { // from class: m4.po1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                lo1.this.zza();
                return null;
            }
        }, uz1Var, obj, uo1Var);
    }
}
