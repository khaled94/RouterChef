package m4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b0.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import java.util.concurrent.Executor;
import m3.f;
import n3.g1;

/* loaded from: classes.dex */
public final class i81 implements e71<xs0> {

    /* renamed from: a */
    public final Context f9557a;

    /* renamed from: b */
    public final nt0 f9558b;

    /* renamed from: c */
    public final Executor f9559c;

    /* renamed from: d */
    public final bm1 f9560d;

    public i81(Context context, Executor executor, nt0 nt0Var, bm1 bm1Var) {
        this.f9557a = context;
        this.f9558b = nt0Var;
        this.f9559c = executor;
        this.f9560d = bm1Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        String str;
        Context context = this.f9557a;
        if (!(context instanceof Activity) || !xs.a(context)) {
            return false;
        }
        try {
            str = cm1Var.f7064w.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    @Override // m4.e71
    public final tz1<xs0> b(final km1 km1Var, final cm1 cm1Var) {
        String str;
        try {
            str = cm1Var.f7064w.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        final Uri parse = str != null ? Uri.parse(str) : null;
        return mz1.p(mz1.m(null), new xy1() { // from class: m4.h81
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                i81 i81Var = i81.this;
                Uri uri = parse;
                km1 km1Var2 = km1Var;
                cm1 cm1Var2 = cm1Var;
                Objects.requireNonNull(i81Var);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Bundle bundle = new Bundle();
                    i.b(bundle, "android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle);
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.setData(uri);
                    f fVar = new f(intent, null);
                    w90 w90Var = new w90();
                    ys0 c10 = i81Var.f9558b.c(new lm0(km1Var2, cm1Var2, null), new ct0(new p41(w90Var), null));
                    w90Var.a(new AdOverlayInfoParcel(fVar, null, c10.n(), null, new o90(0, 0, false), null, null));
                    i81Var.f9560d.b(2, 3);
                    return mz1.m(c10.o());
                } catch (Throwable th) {
                    g1.h("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            }
        }, this.f9559c);
    }
}
