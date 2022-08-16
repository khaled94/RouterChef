package m4;

import android.content.Context;
import k4.b;

/* loaded from: classes.dex */
public final class co extends ho<dp> {

    /* renamed from: b */
    public final /* synthetic */ Context f7083b;

    /* renamed from: c */
    public final /* synthetic */ on f7084c;

    /* renamed from: d */
    public final /* synthetic */ String f7085d;

    /* renamed from: e */
    public final /* synthetic */ go f7086e;

    public co(go goVar, Context context, on onVar, String str) {
        this.f7086e = goVar;
        this.f7083b = context;
        this.f7084c = onVar;
        this.f7085d = str;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ dp a() {
        go.b(this.f7083b, "search");
        return new fr();
    }

    @Override // m4.ho
    public final dp b(lp lpVar) {
        return lpVar.T1(new b(this.f7083b), this.f7084c, this.f7085d, 214106000);
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ dp c() {
        return this.f7086e.f8983a.c(this.f7083b, this.f7084c, this.f7085d, null, 3);
    }
}
