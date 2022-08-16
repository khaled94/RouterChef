package s6;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ long f18264a;

    /* renamed from: b */
    public final /* synthetic */ o f18265b;

    public i(o oVar, long j3) {
        this.f18265b = oVar;
        this.f18264a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f18264a);
        this.f18265b.f18299l.a(bundle);
        return null;
    }
}
