package com.raouf.routerchef;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.WifiSettings;
import com.raouf.routerchef.resModels.BasicWifiInfo;
import f8.b1;
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
public class WifiSettings extends g {

    /* renamed from: l0 */
    public static final /* synthetic */ int f3642l0 = 0;
    public EditText X;
    public EditText Y;
    public EditText Z;

    /* renamed from: a0 */
    public RadioButton f3643a0;

    /* renamed from: b0 */
    public RadioButton f3644b0;

    /* renamed from: c0 */
    public RadioButton f3645c0;

    /* renamed from: d0 */
    public RadioButton f3646d0;

    /* renamed from: e0 */
    public p f3647e0;

    /* renamed from: f0 */
    public Button f3648f0;

    /* renamed from: g0 */
    public Button f3649g0;

    /* renamed from: h0 */
    public String f3650h0;

    /* renamed from: i0 */
    public String f3651i0;

    /* renamed from: j0 */
    public e f3652j0;

    /* renamed from: k0 */
    public Dialog f3653k0;

    @Override // i8.g
    public final void P() {
        this.O.post(new b1(this, 1));
    }

    public final void Q() {
        b.j(this);
        boolean z10 = true;
        String str = "";
        if (this.X.getText().toString().length() <= 1 || this.Y.getText().toString().length() <= 7 || (this.S.y && (this.Z.getText().toString().equals(str) || Integer.parseInt(this.Z.getText().toString()) <= 1 || Integer.parseInt(this.Z.getText().toString()) >= 33))) {
            z10 = false;
        }
        if (!z10) {
            b.q(this, getString(R.string.wifiSettingsValidation));
            return;
        }
        this.f3648f0.setEnabled(false);
        this.f3647e0.d();
        String obj = this.X.getText().toString();
        if (!this.Y.getText().toString().contains("●")) {
            str = this.Y.getText().toString();
        }
        boolean isChecked = this.f3643a0.isChecked();
        boolean isChecked2 = this.f3646d0.isChecked();
        m mVar = new m(this, this.S.f(obj, str, this.Z.getText().toString(), isChecked, isChecked2));
        this.P = mVar;
        mVar.c(this.f3650h0);
    }

    public final void R() {
        b.j(this);
        this.X.getText().clear();
        this.Y.getText().clear();
        this.Z.getText().clear();
        this.f3648f0.setEnabled(false);
        this.f3647e0.d();
        m.e(this.P);
        m mVar = new m(this, this.f3651i0);
        this.P = mVar;
        mVar.c(this.f3650h0);
    }

    public void applySettings(View view) {
        if (this.f3643a0.isChecked()) {
            Dialog dialog = new Dialog(this);
            this.f3653k0 = dialog;
            dialog.setContentView(R.layout.hide_wifi_dialog);
            this.f3653k0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f3653k0.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.q2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WifiSettings.this.f3653k0.dismiss();
                }
            });
            this.f3653k0.findViewById(R.id.continueBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.r2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WifiSettings wifiSettings = WifiSettings.this;
                    int i10 = WifiSettings.f3642l0;
                    wifiSettings.Q();
                    wifiSettings.f3653k0.dismiss();
                }
            });
            this.f3653k0.show();
            return;
        }
        Q();
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        final BasicWifiInfo basicWifiInfo = (BasicWifiInfo) new h().b(str, BasicWifiInfo.class);
        String str2 = basicWifiInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2094305299:
                if (str2.equals("request_failed")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1313911455:
                if (str2.equals("timeout")) {
                    c10 = 1;
                    break;
                }
                break;
            case -996765056:
                if (str2.equals("need_login")) {
                    c10 = 2;
                    break;
                }
                break;
            case -755055221:
                if (str2.equals("complex_wlan_password_needed")) {
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
            case -688750393:
                if (str2.equals("basic_wifi_info")) {
                    c10 = 5;
                    break;
                }
                break;
            case 743252587:
                if (str2.equals("wps_deactivated")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1547821646:
                if (str2.equals("applying_settings")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2043017103:
                if (str2.equals("executed")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                b.q(this, getString(R.string.requestFailed));
                P();
                return;
            case 1:
                i10 = R.string.mayLogin;
                O(getString(i10));
                return;
            case 2:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 3:
                P();
                this.O.post(new f8.m(this, 1));
                return;
            case 4:
                pVar = this.f3647e0;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 5:
                this.O.post(new Runnable() { // from class: f8.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3;
                        EditText editText;
                        WifiSettings wifiSettings = WifiSettings.this;
                        BasicWifiInfo basicWifiInfo2 = basicWifiInfo;
                        wifiSettings.X.setText(basicWifiInfo2.ssidName);
                        if (basicWifiInfo2.hidden != null) {
                            wifiSettings.f3644b0.setChecked(!basicWifiInfo2.a());
                            wifiSettings.f3643a0.setChecked(basicWifiInfo2.a());
                        }
                        String str4 = basicWifiInfo2.maxClients;
                        if (str4 != null) {
                            wifiSettings.Z.setText(str4);
                        }
                        String str5 = basicWifiInfo2.password;
                        if (str5 == null || str5.isEmpty()) {
                            editText = wifiSettings.Y;
                            str3 = "●●●●●●●●";
                        } else {
                            editText = wifiSettings.Y;
                            str3 = basicWifiInfo2.password;
                        }
                        editText.setText(str3);
                        if (basicWifiInfo2.safe != null) {
                            wifiSettings.f3645c0.setChecked(basicWifiInfo2.b());
                            wifiSettings.f3646d0.setChecked(!basicWifiInfo2.b());
                        }
                    }
                });
                P();
                return;
            case 6:
                pVar = this.f3647e0;
                i11 = R.string.wps_deactivated;
                pVar.c(getString(i11));
                return;
            case 7:
                pVar = this.f3647e0;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case '\b':
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3652j0 == null) {
                    return;
                }
                this.O.post(new v(this, 2));
                return;
            default:
                this.f3647e0.c(str);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi_settings);
        AdView adView = (AdView) findViewById(R.id.wifiSettingsAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3652j0 = new e(this, "ca-app-pub-6362221127909922/4576800027", this.Q, false, this);
        }
        this.f3650h0 = this.U + this.S.f16792e;
        this.f3651i0 = this.S.v();
        this.f3647e0 = new p(this);
        this.f3648f0 = (Button) findViewById(R.id.showBtn);
        this.f3649g0 = (Button) findViewById(R.id.applyBtn);
        this.X = (EditText) findViewById(R.id.wifiNameEditText);
        this.Y = (EditText) findViewById(R.id.wifiPasswordEditText);
        this.Z = (EditText) findViewById(R.id.maxClientsInput);
        this.f3643a0 = (RadioButton) findViewById(R.id.wifiRadioHidden);
        this.f3644b0 = (RadioButton) findViewById(R.id.wifiRadioNormal);
        this.f3645c0 = (RadioButton) findViewById(R.id.securityRadioSafe);
        this.f3646d0 = (RadioButton) findViewById(R.id.securityRadioOpen);
        Objects.requireNonNull(this.S);
        if (!this.S.f16809w) {
            this.f3644b0.setEnabled(false);
            this.f3643a0.setEnabled(false);
        }
        Objects.requireNonNull(this.S);
        if (!this.S.f16810x) {
            this.Z.setHint(R.string.notSupported);
            this.Z.setEnabled(false);
        }
        if (!this.S.y) {
            this.Z.setEnabled(false);
        }
        R();
    }

    public void showSettings(View view) {
        R();
    }
}
