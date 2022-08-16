package n9;

import a6.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b<T> extends n {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16680a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = f.V;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9.n
    public final Object a(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        r rVar = f.V;
        if (obj2 == rVar) {
            Object c10 = c(obj);
            obj2 = this._consensus;
            if (obj2 == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16680a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                obj2 = z10 ? c10 : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object c(T t10);
}
