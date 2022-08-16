package m4;

import android.content.Context;
import d.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j81 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9869a;

    /* renamed from: b */
    public final vd2 f9870b;

    /* renamed from: c */
    public final vd2 f9871c;

    /* renamed from: d */
    public final vd2 f9872d;

    /* renamed from: e */
    public final vd2 f9873e;

    public /* synthetic */ j81(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, int i10) {
        this.f9869a = i10;
        this.f9870b = vd2Var;
        this.f9871c = vd2Var2;
        this.f9872d = vd2Var3;
        this.f9873e = vd2Var4;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f9869a) {
            case 0:
                return new i81((Context) this.f9870b.a(), (Executor) this.f9871c.a(), (nt0) this.f9872d.a(), (bm1) this.f9873e.a());
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new sd1(t90Var, ((mo0) this.f9871c).b(), ((vf0) this.f9872d).b(), ((fn1) this.f9873e).a());
        }
    }
}
