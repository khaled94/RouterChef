package da;

import da.j;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g implements c<Object, b<?>> {

    /* renamed from: a */
    public final /* synthetic */ Type f4035a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4036b;

    public g(Type type, Executor executor) {
        this.f4035a = type;
        this.f4036b = executor;
    }

    @Override // da.c
    public final Type a() {
        return this.f4035a;
    }

    @Override // da.c
    public final b<?> b(b<Object> bVar) {
        Executor executor = this.f4036b;
        return executor == null ? bVar : new j.a(executor, bVar);
    }
}
