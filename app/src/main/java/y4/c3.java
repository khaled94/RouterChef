package y4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c3 implements Callable<List<b>> {

    /* renamed from: a */
    public final /* synthetic */ String f20334a;

    /* renamed from: b */
    public final /* synthetic */ String f20335b;

    /* renamed from: c */
    public final /* synthetic */ String f20336c;

    /* renamed from: d */
    public final /* synthetic */ h3 f20337d;

    public c3(h3 h3Var, String str, String str2, String str3) {
        this.f20337d = h3Var;
        this.f20334a = str;
        this.f20335b = str2;
        this.f20336c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final List<b> call() {
        this.f20337d.f20483s.a();
        i iVar = this.f20337d.f20483s.f20294u;
        a6.I(iVar);
        return iVar.N(this.f20334a, this.f20335b, this.f20336c);
    }
}
