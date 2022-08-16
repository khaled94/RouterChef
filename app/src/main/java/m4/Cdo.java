package m4;

import android.content.Context;
import k4.b;

/* renamed from: m4.do */
/* loaded from: classes.dex */
public final class Cdo extends ho<dp> {

    /* renamed from: b */
    public final /* synthetic */ Context f7561b;

    /* renamed from: c */
    public final /* synthetic */ on f7562c;

    /* renamed from: d */
    public final /* synthetic */ String f7563d;

    /* renamed from: e */
    public final /* synthetic */ f10 f7564e;

    /* renamed from: f */
    public final /* synthetic */ go f7565f;

    public Cdo(go goVar, Context context, on onVar, String str, f10 f10Var) {
        this.f7565f = goVar;
        this.f7561b = context;
        this.f7562c = onVar;
        this.f7563d = str;
        this.f7564e = f10Var;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ dp a() {
        go.b(this.f7561b, "interstitial");
        return new fr();
    }

    @Override // m4.ho
    public final dp b(lp lpVar) {
        return lpVar.Q1(new b(this.f7561b), this.f7562c, this.f7563d, this.f7564e, 214106000);
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ dp c() {
        return this.f7565f.f8983a.c(this.f7561b, this.f7562c, this.f7563d, this.f7564e, 2);
    }
}
