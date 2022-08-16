package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import k4.a;
import k4.b;
import l3.r;
import m3.c;
import m3.d;
import m3.t;
import m3.u;
import m3.w;
import m3.y;
import m4.dp;
import m4.e40;
import m4.f10;
import m4.fc1;
import m4.gh0;
import m4.hc1;
import m4.i80;
import m4.if0;
import m4.kp;
import m4.o90;
import m4.og0;
import m4.on;
import m4.pg0;
import m4.t30;
import m4.tp;
import m4.zg0;
import m4.zo;

/* loaded from: classes.dex */
public class ClientApi extends kp {
    @Override // m4.lp
    public final zo C3(a aVar, String str, f10 f10Var) {
        Context context = (Context) b.e0(aVar);
        return new fc1(if0.e(context, f10Var, 214106000), context, str);
    }

    @Override // m4.lp
    public final t30 E3(a aVar, f10 f10Var) {
        return if0.e((Context) b.e0(aVar), f10Var, 214106000).q();
    }

    @Override // m4.lp
    public final e40 N(a aVar) {
        Activity activity = (Activity) b.e0(aVar);
        AdOverlayInfoParcel s10 = AdOverlayInfoParcel.s(activity.getIntent());
        if (s10 == null) {
            return new u(activity);
        }
        int i10 = s10.C;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new u(activity) : new y(activity) : new w(activity, s10) : new d(activity) : new c(activity) : new t(activity);
    }

    @Override // m4.lp
    public final dp Q1(a aVar, on onVar, String str, f10 f10Var, int i10) {
        Context context = (Context) b.e0(aVar);
        zg0 y = if0.e(context, f10Var, i10).y();
        Objects.requireNonNull(y);
        Objects.requireNonNull(context);
        y.f16200b = context;
        Objects.requireNonNull(onVar);
        y.f16202d = onVar;
        Objects.requireNonNull(str);
        y.f16201c = str;
        return y.a().f6158g.a();
    }

    @Override // m4.lp
    public final dp T1(a aVar, on onVar, String str, int i10) {
        return new r((Context) b.e0(aVar), onVar, str, new o90(214106000, i10, true));
    }

    @Override // m4.lp
    public final tp U1(a aVar) {
        return if0.d((Context) b.e0(aVar), 214106000).f();
    }

    @Override // m4.lp
    public final i80 U2(a aVar, f10 f10Var) {
        return if0.e((Context) b.e0(aVar), f10Var, 214106000).t();
    }

    @Override // m4.lp
    public final dp V0(a aVar, on onVar, String str, f10 f10Var, int i10) {
        Context context = (Context) b.e0(aVar);
        og0 x10 = if0.e(context, f10Var, i10).x();
        Objects.requireNonNull(x10);
        Objects.requireNonNull(context);
        x10.f12155b = context;
        Objects.requireNonNull(onVar);
        x10.f12157d = onVar;
        Objects.requireNonNull(str);
        x10.f12156c = str;
        d.a.g(x10.f12155b, Context.class);
        d.a.g(x10.f12156c, String.class);
        d.a.g(x10.f12157d, on.class);
        gh0 gh0Var = x10.f12154a;
        Context context2 = x10.f12155b;
        String str2 = x10.f12156c;
        on onVar2 = x10.f12157d;
        pg0 pg0Var = new pg0(gh0Var, context2, str2, onVar2);
        return new hc1(context2, onVar2, str2, pg0Var.f12507e.a(), pg0Var.f12505c.a());
    }
}
