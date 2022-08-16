package k9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5669b = AtomicIntegerFieldUpdater.newUpdater(m.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f5670a;

    public m(Throwable th) {
        this.f5670a = th;
        this._handled = 0;
    }

    public m(Throwable th, boolean z10) {
        this.f5670a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5670a + ']';
    }
}
