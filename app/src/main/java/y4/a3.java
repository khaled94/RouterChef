package y4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a3 implements Callable<List<f6>> {

    /* renamed from: a */
    public final /* synthetic */ String f20278a;

    /* renamed from: b */
    public final /* synthetic */ String f20279b;

    /* renamed from: c */
    public final /* synthetic */ String f20280c;

    /* renamed from: d */
    public final /* synthetic */ h3 f20281d;

    public a3(h3 h3Var, String str, String str2, String str3) {
        this.f20281d = h3Var;
        this.f20278a = str;
        this.f20279b = str2;
        this.f20280c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final List<f6> call() {
        this.f20281d.f20483s.a();
        i iVar = this.f20281d.f20483s.f20294u;
        a6.I(iVar);
        return iVar.Q(this.f20278a, this.f20279b, this.f20280c);
    }
}
