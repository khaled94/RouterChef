package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b0.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import java.util.Objects;
import l3.s;
import m3.f;
import m4.b20;
import m4.es;
import m4.g30;
import m4.h30;
import m4.jo;
import m4.o90;
import m4.xs;
import m4.y80;
import n3.g1;
import n3.s1;
import p3.e;
import p3.j;

/* loaded from: classes.dex */
public final class zzcaf implements MediationInterstitialAdapter {

    /* renamed from: a */
    public Activity f2961a;

    /* renamed from: b */
    public j f2962b;

    /* renamed from: c */
    public Uri f2963c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onDestroy() {
        g1.e("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onPause() {
        g1.e("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onResume() {
        g1.e("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, j jVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f2962b = jVar;
        if (jVar == null) {
            g1.j("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            g1.j("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((b20) this.f2962b).b();
        } else if (!xs.a(context)) {
            g1.j("Default browser does not support custom tabs. Bailing out.");
            ((b20) this.f2962b).b();
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                g1.j("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                ((b20) this.f2962b).b();
                return;
            }
            this.f2961a = (Activity) context;
            this.f2963c = Uri.parse(string);
            ((b20) this.f2962b).f();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent = new Intent("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        i.b(bundle, "android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.setData(this.f2963c);
        s1.f16555i.post(new h30(this, new AdOverlayInfoParcel(new f(intent, null), null, new g30(this), null, new o90(0, 0, false), null, null), 0));
        s sVar = s.B;
        y80 y80Var = sVar.f5793g.f16044j;
        Objects.requireNonNull(y80Var);
        Objects.requireNonNull(sVar.f5796j);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (y80Var.f15611a) {
            if (y80Var.f15613c == 3) {
                if (y80Var.f15612b + ((Long) jo.f10145d.f10148c.a(es.N3)).longValue() <= currentTimeMillis) {
                    y80Var.f15613c = 1;
                }
            }
        }
        Objects.requireNonNull(sVar.f5796j);
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (y80Var.f15611a) {
            if (y80Var.f15613c == 2) {
                y80Var.f15613c = 3;
                if (y80Var.f15613c == 3) {
                    y80Var.f15612b = currentTimeMillis2;
                }
            }
        }
    }
}
