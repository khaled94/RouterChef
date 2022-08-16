package m4;

import a6.d;
import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l3.a;

/* loaded from: classes.dex */
public final class ry0 implements Callable<ty0> {

    /* renamed from: a */
    public final a f13455a;

    /* renamed from: b */
    public final Context f13456b;

    /* renamed from: c */
    public final f11 f13457c;

    /* renamed from: d */
    public final ep1 f13458d;

    /* renamed from: e */
    public final v61 f13459e;

    /* renamed from: f */
    public final Executor f13460f;

    /* renamed from: g */
    public final w7 f13461g;

    /* renamed from: h */
    public final o90 f13462h;

    /* renamed from: i */
    public final zp1 f13463i;

    public ry0(Context context, Executor executor, w7 w7Var, o90 o90Var, a aVar, ge0 ge0Var, v61 v61Var, zp1 zp1Var, f11 f11Var, ep1 ep1Var) {
        this.f13456b = context;
        this.f13460f = executor;
        this.f13461g = w7Var;
        this.f13462h = o90Var;
        this.f13455a = aVar;
        this.f13459e = v61Var;
        this.f13463i = zp1Var;
        this.f13457c = f11Var;
        this.f13458d = ep1Var;
    }

    @Override // java.util.concurrent.Callable
    public final ty0 call() {
        ty0 ty0Var = new ty0(this);
        synchronized (ty0Var) {
            Context context = ty0Var.f14196c;
            o90 o90Var = ty0Var.f14201h;
            yr<String> yrVar = es.f8059b2;
            tz1 o10 = mz1.o(mz1.n(new ee0(context, ty0Var.f14200g, o90Var, ty0Var.f14195b, (String) jo.f10145d.f10148c.a(yrVar)), u90.f14298e), new n0(ty0Var, 1), ty0Var.f14199f);
            ty0Var.f14205l = (py1) o10;
            d.e(o10, "NativeJavascriptExecutor.initializeEngine");
        }
        return ty0Var;
    }
}
