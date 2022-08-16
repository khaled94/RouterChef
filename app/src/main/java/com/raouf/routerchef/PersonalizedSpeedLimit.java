package com.raouf.routerchef;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.PersonalizedSpeedLimit;
import com.raouf.routerchef.resModels.CustomLimitInfo;
import f8.l;
import f8.s0;
import g1.v;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class PersonalizedSpeedLimit extends g {

    /* renamed from: h0 */
    public static final /* synthetic */ int f3595h0 = 0;
    public TextView X;
    public EditText Y;
    public EditText Z;

    /* renamed from: a0 */
    public SwitchCompat f3596a0;

    /* renamed from: b0 */
    public p f3597b0;

    /* renamed from: c0 */
    public Button f3598c0;

    /* renamed from: d0 */
    public Button f3599d0;

    /* renamed from: e0 */
    public String f3600e0;

    /* renamed from: f0 */
    public String f3601f0;

    /* renamed from: g0 */
    public e f3602g0;

    @Override // i8.g
    public final void P() {
        this.O.post(new l(this, 1));
    }

    public final void Q() {
        this.Y.getText().clear();
        this.Z.getText().clear();
        this.f3598c0.setEnabled(false);
        this.f3599d0.setEnabled(false);
        this.f3597b0.d();
        m mVar = new m(this, this.f3601f0);
        this.P = mVar;
        mVar.c(this.f3600e0);
    }

    public void applyLimitSettings(View view) {
        String str;
        b.j(this);
        String obj = this.Y.getText().toString();
        String obj2 = this.Z.getText().toString();
        if (this.f3596a0.isChecked() && (obj.equals("") || obj2.equals("") || Float.parseFloat(obj) <= 0.0f || Float.parseFloat(obj2) <= 0.0f)) {
            b.q(this, getString(R.string.limitCheck));
            return;
        }
        this.f3598c0.setEnabled(false);
        this.f3599d0.setEnabled(false);
        this.f3597b0.d();
        if (this.f3596a0.isChecked()) {
            str = this.S.e(true, this.Y.getText().toString(), this.Z.getText().toString());
        } else {
            str = this.S.e(false, "0", "0");
        }
        m mVar = new m(this, str);
        this.P = mVar;
        mVar.c(this.f3600e0);
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        Handler handler;
        Runnable runnable;
        int i10;
        p pVar;
        int i11;
        Log.i("ASYNC MSG ::::::: ", str);
        final CustomLimitInfo customLimitInfo = (CustomLimitInfo) new h().b(str, CustomLimitInfo.class);
        String str2 = customLimitInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2129341873:
                if (str2.equals("speed_limit_exceeded")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2094305299:
                if (str2.equals("request_failed")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1313911455:
                if (str2.equals("timeout")) {
                    c10 = 2;
                    break;
                }
                break;
            case -996765056:
                if (str2.equals("need_login")) {
                    c10 = 3;
                    break;
                }
                break;
            case -724193048:
                if (str2.equals("showing_info")) {
                    c10 = 4;
                    break;
                }
                break;
            case 35367553:
                if (str2.equals("personalized_limit_info")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1547821646:
                if (str2.equals("applying_settings")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2043017103:
                if (str2.equals("executed")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                P();
                handler = this.O;
                runnable = new v(this, 1);
                handler.post(runnable);
                return;
            case 1:
                b.q(this, getString(R.string.requestFailed));
                P();
                return;
            case 2:
                i10 = R.string.mayLogin;
                O(getString(i10));
                return;
            case 3:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 4:
                pVar = this.f3597b0;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 5:
                this.O.post(new Runnable() { // from class: f8.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PersonalizedSpeedLimit personalizedSpeedLimit = PersonalizedSpeedLimit.this;
                        CustomLimitInfo customLimitInfo2 = customLimitInfo;
                        personalizedSpeedLimit.f3596a0.setChecked(Boolean.parseBoolean(customLimitInfo2.limited));
                        if (customLimitInfo2.maxDownload != null) {
                            personalizedSpeedLimit.X.setText(customLimitInfo2.maxUpload + "/" + customLimitInfo2.maxDownload);
                        }
                        if (Boolean.parseBoolean(customLimitInfo2.limited)) {
                            personalizedSpeedLimit.Y.setText(customLimitInfo2.upload);
                            personalizedSpeedLimit.Z.setText(customLimitInfo2.download);
                        }
                        personalizedSpeedLimit.P();
                    }
                });
                return;
            case 6:
                pVar = this.f3597b0;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case 7:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3602g0 == null) {
                    return;
                }
                handler = this.O;
                runnable = new s0(this, 1);
                handler.post(runnable);
                return;
            default:
                this.f3597b0.c(str);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_personalized_limit_bw);
        AdView adView = (AdView) findViewById(R.id.LimitWiFiAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3602g0 = new e(this, "ca-app-pub-6362221127909922/4705642591", this.Q, false, this);
        }
        this.f3600e0 = this.U + this.S.f16797j;
        this.f3601f0 = this.S.u();
        this.X = (TextView) findViewById(R.id.maxSpeedValue);
        this.Y = (EditText) findViewById(R.id.uploadSpeedValue);
        this.Z = (EditText) findViewById(R.id.downloadSpeedValue);
        this.f3596a0 = (SwitchCompat) findViewById(R.id.enableSwitch);
        this.f3598c0 = (Button) findViewById(R.id.showBtn);
        this.f3599d0 = (Button) findViewById(R.id.applyBtn);
        this.f3597b0 = new p(this);
        this.f3596a0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f8.r1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                PersonalizedSpeedLimit personalizedSpeedLimit = PersonalizedSpeedLimit.this;
                personalizedSpeedLimit.Y.setEnabled(z10);
                personalizedSpeedLimit.Y.getText().clear();
                personalizedSpeedLimit.Z.setEnabled(z10);
                personalizedSpeedLimit.Z.getText().clear();
            }
        });
        Q();
    }

    public void showLimitSettings(View view) {
        b.j(this);
        Q();
    }
}
