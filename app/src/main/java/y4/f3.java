package y4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f3 implements Callable<List<f6>> {

    /* renamed from: a */
    public final /* synthetic */ String f20445a;

    /* renamed from: b */
    public final /* synthetic */ h3 f20446b;

    public f3(h3 h3Var, String str) {
        this.f20446b = h3Var;
        this.f20445a = str;
    }

    @Override // java.util.concurrent.Callable
    public final List<f6> call() {
        this.f20446b.f20483s.a();
        i iVar = this.f20446b.f20483s.f20294u;
        a6.I(iVar);
        return iVar.P(this.f20445a);
    }
}
