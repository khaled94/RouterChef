package a4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e0 extends f0 {

    /* renamed from: e */
    public final Callable<String> f131e;

    public /* synthetic */ e0(Callable callable) {
        super(false, null, null);
        this.f131e = callable;
    }

    @Override // a4.f0
    public final String a() {
        try {
            return this.f131e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
