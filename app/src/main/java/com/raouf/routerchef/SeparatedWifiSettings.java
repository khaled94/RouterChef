package com.raouf.routerchef;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.SeparatedWifiSettings;
import com.raouf.routerchef.resModels.BasicWifiInfo;
import f8.e2;
import g1.o;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class SeparatedWifiSettings extends g {

    /* renamed from: n0 */
    public static final /* synthetic */ int f3626n0 = 0;
    public EditText X;
    public EditText Y;
    public EditText Z;

    /* renamed from: a0 */
    public RadioButton f3627a0;

    /* renamed from: b0 */
    public RadioButton f3628b0;

    /* renamed from: c0 */
    public RadioButton f3629c0;

    /* renamed from: d0 */
    public RadioButton f3630d0;

    /* renamed from: e0 */
    public Button f3631e0;

    /* renamed from: f0 */
    public Button f3632f0;

    /* renamed from: g0 */
    public Button f3633g0;

    /* renamed from: h0 */
    public Button f3634h0;

    /* renamed from: i0 */
    public p f3635i0;

    /* renamed from: j0 */
    public String f3636j0;

    /* renamed from: k0 */
    public String f3637k0;

    /* renamed from: l0 */
    public e f3638l0;

    /* renamed from: m0 */
    public Dialog f3639m0;

    @Override // i8.g
    public final void P() {
        this.O.post(new o(this, 3));
    }

    public final String Q(boolean z10) {
        String obj = this.X.getText().toString();
        String obj2 = this.Y.getText().toString();
        boolean isChecked = this.f3627a0.isChecked();
        boolean isChecked2 = this.f3630d0.isChecked();
        return this.S.g(z10, obj, obj2, this.Z.getText().toString(), isChecked, isChecked2);
    }

    public final void R() {
        if (this.X.getText().toString().length() <= 1 || (this.S.y && (Integer.parseInt(this.Z.getText().toString()) <= 1 || Integer.parseInt(this.Z.getText().toString()) >= 33))) {
            b.q(this, getString(R.string.wifiSettingsValidation));
            return;
        }
        S();
        m mVar = new m(this, Q(false));
        this.P = mVar;
        mVar.c(this.f3636j0);
    }

    public final void S() {
        this.f3631e0.setEnabled(false);
        this.f3632f0.setEnabled(false);
        this.f3633g0.setEnabled(false);
        this.f3634h0.setEnabled(false);
        this.f3635i0.d();
    }

    public final void T() {
        this.X.getText().clear();
        this.Y.getText().clear();
        this.Z.getText().clear();
        S();
        m.e(this.P);
        m mVar = new m(this, this.f3637k0);
        this.P = mVar;
        mVar.c(this.f3636j0);
    }

    public void applyBasicSettings(View view) {
        if (this.f3627a0.isChecked()) {
            Dialog dialog = new Dialog(this);
            this.f3639m0 = dialog;
            dialog.setContentView(R.layout.hide_wifi_dialog);
            this.f3639m0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f3639m0.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.c2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SeparatedWifiSettings.this.f3639m0.dismiss();
                }
            });
            this.f3639m0.findViewById(R.id.continueBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.d2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SeparatedWifiSettings separatedWifiSettings = SeparatedWifiSettings.this;
                    int i10 = SeparatedWifiSettings.f3626n0;
                    separatedWifiSettings.R();
                    separatedWifiSettings.f3639m0.dismiss();
                }
            });
            this.f3639m0.show();
        } else {
            R();
        }
        b.j(this);
    }

    public void applySecuritySettings(View view) {
        if (this.Y.getText().toString().length() > 7) {
            S();
            m mVar = new m(this, Q(true));
            this.P = mVar;
            mVar.c(this.f3636j0);
        } else {
            b.q(this, getString(R.string.wifiSettingsValidation));
        }
        b.j(this);
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        Log.i("ASYNC MSG ::::::: ", str);
        BasicWifiInfo basicWifiInfo = (BasicWifiInfo) new h().b(str, BasicWifiInfo.class);
        String str2 = basicWifiInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1313911455:
                if (str2.equals("timeout")) {
                    c10 = 0;
                    break;
                }
                break;
            case -996765056:
                if (str2.equals("need_login")) {
                    c10 = 1;
                    break;
                }
                break;
            case -724193048:
                if (str2.equals("showing_info")) {
                    c10 = 2;
                    break;
                }
                break;
            case -464161095:
                if (str2.equals("basic_wifi_info_1")) {
                    c10 = 3;
                    break;
                }
                break;
            case -464161094:
                if (str2.equals("basic_wifi_info_2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1547821646:
                if (str2.equals("applying_settings")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2043017103:
                if (str2.equals("executed")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = R.string.mayLogin;
                O(getString(i10));
                return;
            case 1:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 2:
                pVar = this.f3635i0;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 3:
                this.O.post(new a3.e(this, basicWifiInfo, 1));
                return;
            case 4:
                this.O.post(new e2(this, basicWifiInfo, 0));
                P();
                return;
            case 5:
                pVar = this.f3635i0;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case 6:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3638l0 == null) {
                    return;
                }
                this.O.post(new Runnable() { // from class: f8.f2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SeparatedWifiSettings.this.f3638l0.b();
                    }
                });
                return;
            default:
                this.f3635i0.c(str);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_separated_wifi_settings);
        AdView adView = (AdView) findViewById(R.id.wifiSettingsAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3638l0 = new e(this, "ca-app-pub-6362221127909922/4576800027", this.Q, false, this);
        }
        this.f3636j0 = this.U + this.S.f16792e;
        this.f3637k0 = this.S.v();
        this.f3635i0 = new p(this);
        this.f3631e0 = (Button) findViewById(R.id.showBtn);
        this.f3632f0 = (Button) findViewById(R.id.applyBtn);
        this.f3633g0 = (Button) findViewById(R.id.showSecurityBtn);
        this.f3634h0 = (Button) findViewById(R.id.applySecurityBtn);
        this.X = (EditText) findViewById(R.id.wifiNameEditText);
        this.Y = (EditText) findViewById(R.id.wifiPasswordEditText);
        this.Z = (EditText) findViewById(R.id.maxClientsInput);
        this.f3627a0 = (RadioButton) findViewById(R.id.wifiRadioHidden);
        this.f3628b0 = (RadioButton) findViewById(R.id.wifiRadioNormal);
        this.f3629c0 = (RadioButton) findViewById(R.id.securityRadioSafe);
        this.f3630d0 = (RadioButton) findViewById(R.id.securityRadioOpen);
        T();
    }

    public void showSettings(View view) {
        T();
        b.j(this);
    }
}
