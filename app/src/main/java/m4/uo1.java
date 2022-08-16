package m4;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class uo1<E> {

    /* renamed from: d */
    public static final tz1<?> f14464d = (oz1) mz1.m(null);

    /* renamed from: a */
    public final uz1 f14465a;

    /* renamed from: b */
    public final ScheduledExecutorService f14466b;

    /* renamed from: c */
    public final vo1<E> f14467c;

    public uo1(uz1 uz1Var, ScheduledExecutorService scheduledExecutorService, vo1<E> vo1Var) {
        this.f14465a = uz1Var;
        this.f14466b = scheduledExecutorService;
        this.f14467c = vo1Var;
    }

    public final oo1 a(E e10, tz1<?>... tz1VarArr) {
        return new oo1(this, e10, Arrays.asList(tz1VarArr));
    }

    public final <I> to1<I> b(E e10, tz1<I> tz1Var) {
        return new to1<>(this, e10, tz1Var, Collections.singletonList(tz1Var), tz1Var);
    }
}
