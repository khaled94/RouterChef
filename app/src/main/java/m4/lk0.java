package m4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lk0 extends ik0 {

    /* renamed from: i */
    public final Context f10881i;

    /* renamed from: j */
    public final View f10882j;

    /* renamed from: k */
    public final vd0 f10883k;

    /* renamed from: l */
    public final dm1 f10884l;

    /* renamed from: m */
    public final yl0 f10885m;

    /* renamed from: n */
    public final lv0 f10886n;

    /* renamed from: o */
    public final ls0 f10887o;
    public final jd2<dc1> p;

    /* renamed from: q */
    public final Executor f10888q;

    /* renamed from: r */
    public on f10889r;

    public lk0(zl0 zl0Var, Context context, dm1 dm1Var, View view, vd0 vd0Var, yl0 yl0Var, lv0 lv0Var, ls0 ls0Var, jd2<dc1> jd2Var, Executor executor) {
        super(zl0Var);
        this.f10881i = context;
        this.f10882j = view;
        this.f10883k = vd0Var;
        this.f10884l = dm1Var;
        this.f10885m = yl0Var;
        this.f10886n = lv0Var;
        this.f10887o = ls0Var;
        this.p = jd2Var;
        this.f10888q = executor;
    }

    @Override // m4.am0
    public final void b() {
        this.f10888q.execute(new kk0(this, 0));
        super.b();
    }

    @Override // m4.ik0
    public final int c() {
        yr<Boolean> yrVar = es.f8070c5;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && this.f6191b.f7041e0) {
            if (!((Boolean) joVar.f10148c.a(es.d5)).booleanValue()) {
                return 0;
            }
        }
        return this.f6190a.f10489b.f10126b.f8005c;
    }

    @Override // m4.ik0
    public final View d() {
        return this.f10882j;
    }

    @Override // m4.ik0
    public final lq e() {
        try {
            return this.f10885m.zza();
        } catch (pm1 unused) {
            return null;
        }
    }

    @Override // m4.ik0
    public final dm1 f() {
        on onVar = this.f10889r;
        if (onVar != null) {
            return ql.e(onVar);
        }
        cm1 cm1Var = this.f6191b;
        if (cm1Var.Z) {
            for (String str : cm1Var.f7032a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new dm1(this.f10882j.getWidth(), this.f10882j.getHeight(), false);
        }
        return this.f6191b.f7060s.get(0);
    }

    @Override // m4.ik0
    public final dm1 g() {
        return this.f10884l;
    }

    @Override // m4.ik0
    public final void h() {
        this.f10887o.zza();
    }

    @Override // m4.ik0
    public final void i(ViewGroup viewGroup, on onVar) {
        vd0 vd0Var;
        if (viewGroup == null || (vd0Var = this.f10883k) == null) {
            return;
        }
        vd0Var.J0(cf0.c(onVar));
        viewGroup.setMinimumHeight(onVar.f12222u);
        viewGroup.setMinimumWidth(onVar.f12225x);
        this.f10889r = onVar;
    }
}
