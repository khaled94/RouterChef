package com.raouf.routerchef;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.ads.AdView;
import h8.c;
import i8.g;
import java.util.ArrayList;
import java.util.Objects;
import o8.a;
import r8.b;

/* loaded from: classes.dex */
public class MainFeatures extends g {
    public void advanced(View view) {
        startActivity(new Intent(this, Advanced.class));
    }

    public void connectedDevices(View view) {
        startActivity(new Intent(this, RouterDevices.class));
    }

    public void dnsPornBlocker(View view) {
        startActivity(new Intent(this, DnsPornBlocker.class));
    }

    public void limitWifiSpeed(View view) {
        startActivity(this.S.f16804r ? new Intent(this, PersonalizedSpeedLimit.class) : new Intent(this, LimitWifiSpeed.class));
    }

    public void lineDetails(View view) {
        startActivity(new Intent(this, LineDetails.class));
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main_features);
        AdView adView = (AdView) findViewById(R.id.FeaturesAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
        }
        a aVar = this.S;
        if (!aVar.f16804r && !aVar.f16803q) {
            findViewById(R.id.blockListCard).setVisibility(8);
        }
        if (!this.S.f16806t) {
            findViewById(R.id.dnsPornBlockerLayout).setVisibility(8);
        }
        if (!this.S.f16807u) {
            findViewById(R.id.wifiAccessControlLayout).setVisibility(8);
        }
        Objects.requireNonNull(this.S);
        if (this.S.f16808v) {
            findViewById(R.id.lineDetailsContainer).setVisibility(8);
        }
        ArrayList i10 = b.i((ViewGroup) findViewById(R.id.featuresCardsLayout), ImageView.class);
        for (int i11 = 0; i11 < i10.size(); i11++) {
            b.r((View) i10.get(i11), 1.15f, 1400);
        }
    }

    @Override // i8.g, androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    public void pppoeSettings(View view) {
        startActivity(new Intent(this, PppoeSettings.class));
    }

    public void wifiAccessControl(View view) {
        startActivity(new Intent(this, AccessControl.class));
    }

    public void wifiSettings(View view) {
        a aVar = this.S;
        startActivity(aVar.f16805s ? new Intent(this, SeparatedWifiSettings.class) : aVar.p ? new Intent(this, NewWifiSettings.class) : new Intent(this, WifiSettings.class));
    }
}
