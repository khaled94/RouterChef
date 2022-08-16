package m4;

import android.content.Context;
import k4.b;

/* loaded from: classes.dex */
public final class ao extends ho<dp> {

    /* renamed from: b */
    public final /* synthetic */ Context f6217b;

    /* renamed from: c */
    public final /* synthetic */ on f6218c;

    /* renamed from: d */
    public final /* synthetic */ String f6219d;

    /* renamed from: e */
    public final /* synthetic */ f10 f6220e;

    /* renamed from: f */
    public final /* synthetic */ go f6221f;

    public ao(go goVar, Context context, on onVar, String str, f10 f10Var) {
        this.f6221f = goVar;
        this.f6217b = context;
        this.f6218c = onVar;
        this.f6219d = str;
        this.f6220e = f10Var;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ dp a() {
        go.b(this.f6217b, "banner");
        return new fr();
    }

    @Override // m4.ho
    public final dp b(lp lpVar) {
        return lpVar.V0(new b(this.f6217b), this.f6218c, this.f6219d, this.f6220e, 214106000);
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ dp c() {
        return this.f6221f.f8983a.c(this.f6217b, this.f6218c, this.f6219d, this.f6220e, 1);
    }
}
