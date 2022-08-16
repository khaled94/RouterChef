package y4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class b3 implements Callable<List<b>> {

    /* renamed from: a */
    public final /* synthetic */ String f20312a;

    /* renamed from: b */
    public final /* synthetic */ String f20313b;

    /* renamed from: c */
    public final /* synthetic */ String f20314c;

    /* renamed from: d */
    public final /* synthetic */ h3 f20315d;

    public b3(h3 h3Var, String str, String str2, String str3) {
        this.f20315d = h3Var;
        this.f20312a = str;
        this.f20313b = str2;
        this.f20314c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final List<b> call() {
        this.f20315d.f20483s.a();
        i iVar = this.f20315d.f20483s.f20294u;
        a6.I(iVar);
        return iVar.N(this.f20312a, this.f20313b, this.f20314c);
    }
}
