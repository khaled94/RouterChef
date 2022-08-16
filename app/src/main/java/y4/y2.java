package y4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class y2 implements Callable<List<f6>> {

    /* renamed from: a */
    public final /* synthetic */ String f20816a;

    /* renamed from: b */
    public final /* synthetic */ String f20817b;

    /* renamed from: c */
    public final /* synthetic */ String f20818c;

    /* renamed from: d */
    public final /* synthetic */ h3 f20819d;

    public y2(h3 h3Var, String str, String str2, String str3) {
        this.f20819d = h3Var;
        this.f20816a = str;
        this.f20817b = str2;
        this.f20818c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final List<f6> call() {
        this.f20819d.f20483s.a();
        i iVar = this.f20819d.f20483s.f20294u;
        a6.I(iVar);
        return iVar.Q(this.f20816a, this.f20817b, this.f20818c);
    }
}
