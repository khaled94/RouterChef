package com.raouf.routerchef;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.appcompat.widget.g1;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.NewWifiSettings;
import com.raouf.routerchef.resModels.BasicWifiInfo;
import f8.p1;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import o8.a;
import r8.b;
import u7.s;
import x7.h;

/* loaded from: classes.dex */
public class NewWifiSettings extends g {

    /* renamed from: r0 */
    public static final /* synthetic */ int f3576r0 = 0;
    public EditText X;
    public EditText Y;
    public EditText Z;

    /* renamed from: a0 */
    public RadioButton f3577a0;

    /* renamed from: b0 */
    public RadioButton f3578b0;

    /* renamed from: c0 */
    public RadioButton f3579c0;

    /* renamed from: d0 */
    public RadioButton f3580d0;

    /* renamed from: e0 */
    public ToggleButton f3581e0;

    /* renamed from: f0 */
    public ToggleButton f3582f0;

    /* renamed from: g0 */
    public ToggleButton f3583g0;

    /* renamed from: h0 */
    public Button f3584h0;

    /* renamed from: i0 */
    public Button f3585i0;

    /* renamed from: j0 */
    public ConstraintLayout f3586j0;

    /* renamed from: k0 */
    public e f3587k0;

    /* renamed from: l0 */
    public String f3588l0;

    /* renamed from: m0 */
    public String f3589m0;

    /* renamed from: n0 */
    public String f3590n0;

    /* renamed from: o0 */
    public String f3591o0;

    /* renamed from: p0 */
    public p f3592p0;

    /* renamed from: q0 */
    public Dialog f3593q0;

    @Override // i8.g
    public final void P() {
        this.O.post(new s(this, 1));
    }

    public final void Q() {
        String str;
        m mVar;
        b.j(this);
        boolean z10 = true;
        String str2 = "";
        if (this.X.getText().toString().length() <= 1 || this.Y.getText().toString().length() <= 7 || (this.S.y && (this.Z.getText().toString().equals(str2) || Integer.parseInt(this.Z.getText().toString()) <= 1 || Integer.parseInt(this.Z.getText().toString()) >= 33))) {
            z10 = false;
        }
        if (!z10) {
            b.q(this, getString(R.string.wifiSettingsValidation));
            return;
        }
        this.f3584h0.setEnabled(false);
        this.f3592p0.d();
        String obj = this.X.getText().toString();
        if (!this.Y.getText().toString().contains("●")) {
            str2 = this.Y.getText().toString();
        }
        String str3 = str2;
        boolean isChecked = this.f3577a0.isChecked();
        boolean isChecked2 = this.f3580d0.isChecked();
        String obj2 = this.Z.getText().toString();
        boolean isChecked3 = this.f3583g0.isChecked();
        boolean R = R();
        a aVar = this.S;
        this.P = new m(this, !R ? aVar.f(obj, str3, obj2, isChecked, isChecked2) : aVar.a(isChecked3, obj, str3, obj2, isChecked, isChecked2));
        if (R()) {
            mVar = this.P;
            str = this.f3589m0;
        } else {
            mVar = this.P;
            str = this.f3588l0;
        }
        mVar.c(str);
    }

    public final boolean R() {
        return this.f3582f0.isChecked();
    }

    public final void S() {
        String str;
        m mVar;
        b.j(this);
        this.X.getText().clear();
        this.Y.getText().clear();
        this.Z.getText().clear();
        this.f3584h0.setEnabled(false);
        this.f3592p0.d();
        m.e(this.P);
        if (!R()) {
            mVar = new m(this, this.f3590n0);
            this.P = mVar;
            str = this.f3588l0;
        } else {
            mVar = new m(this, this.f3591o0);
            this.P = mVar;
            str = this.f3589m0;
        }
        mVar.c(str);
    }

    public final void T(ToggleButton toggleButton, ToggleButton toggleButton2) {
        if (toggleButton.isChecked()) {
            toggleButton2.setChecked(false);
        } else if (toggleButton2.isChecked()) {
        } else {
            toggleButton.setChecked(true);
        }
    }

    public final void U() {
        int i10;
        ConstraintLayout constraintLayout;
        if (R()) {
            constraintLayout = this.f3586j0;
            i10 = 0;
        } else {
            constraintLayout = this.f3586j0;
            i10 = 8;
        }
        constraintLayout.setVisibility(i10);
    }

    public void applySettings(View view) {
        if (this.f3577a0.isChecked()) {
            Dialog dialog = new Dialog(this);
            this.f3593q0 = dialog;
            dialog.setContentView(R.layout.hide_wifi_dialog);
            this.f3593q0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f3593q0.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NewWifiSettings.this.f3593q0.dismiss();
                }
            });
            this.f3593q0.findViewById(R.id.continueBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NewWifiSettings newWifiSettings = NewWifiSettings.this;
                    int i10 = NewWifiSettings.f3576r0;
                    newWifiSettings.Q();
                    newWifiSettings.f3593q0.dismiss();
                }
            });
            this.f3593q0.show();
            return;
        }
        Q();
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        BasicWifiInfo basicWifiInfo = (BasicWifiInfo) new h().b(str, BasicWifiInfo.class);
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
                this.O.post(new g1(this, 2));
                return;
            case 4:
                pVar = this.f3592p0;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 5:
                this.O.post(new p1(this, basicWifiInfo, 0));
                P();
                return;
            case 6:
                pVar = this.f3592p0;
                i11 = R.string.wps_deactivated;
                pVar.c(getString(i11));
                return;
            case 7:
                pVar = this.f3592p0;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case '\b':
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3587k0 == null) {
                    return;
                }
                this.O.post(new g1.p(this, 2));
                return;
            default:
                this.f3592p0.c(str);
                return;
        }
    }

    public void highFreqSettings(View view) {
        if (!this.f3581e0.isChecked()) {
            T(this.f3582f0, this.f3581e0);
            U();
            return;
        }
        T(this.f3582f0, this.f3581e0);
        U();
        S();
    }

    public void highFreqStatusChanged(View view) {
    }

    public void lowFreqSettings(View view) {
        if (!this.f3582f0.isChecked()) {
            T(this.f3581e0, this.f3582f0);
            U();
            return;
        }
        T(this.f3581e0, this.f3582f0);
        U();
        S();
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_new_wifi_settings);
        AdView adView = (AdView) findViewById(R.id.wifiSettingsAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3587k0 = new e(this, "ca-app-pub-6362221127909922/4576800027", this.Q, false, this);
        }
        this.f3588l0 = this.U + this.S.f16792e;
        this.f3589m0 = this.U + this.S.f16793f;
        this.f3590n0 = this.S.v();
        this.f3591o0 = this.S.m();
        this.f3592p0 = new p(this);
        this.f3584h0 = (Button) findViewById(R.id.showBtn);
        this.f3585i0 = (Button) findViewById(R.id.applyBtn);
        this.X = (EditText) findViewById(R.id.wifiNameEditText);
        this.Y = (EditText) findViewById(R.id.wifiPasswordEditText);
        this.Z = (EditText) findViewById(R.id.maxClientsInput);
        this.f3577a0 = (RadioButton) findViewById(R.id.wifiRadioHidden);
        this.f3578b0 = (RadioButton) findViewById(R.id.wifiRadioNormal);
        this.f3579c0 = (RadioButton) findViewById(R.id.securityRadioSafe);
        this.f3580d0 = (RadioButton) findViewById(R.id.securityRadioOpen);
        this.f3586j0 = (ConstraintLayout) findViewById(R.id.statusContainer);
        this.f3581e0 = (ToggleButton) findViewById(R.id.lowFreqBtn);
        this.f3582f0 = (ToggleButton) findViewById(R.id.highFreqBtn);
        this.f3583g0 = (ToggleButton) findViewById(R.id.wifiStatusBtn);
        Objects.requireNonNull(this.S);
        if (!this.S.f16809w) {
            this.f3578b0.setEnabled(false);
            this.f3577a0.setEnabled(false);
        }
        Objects.requireNonNull(this.S);
        if (!this.S.f16810x) {
            this.Z.setHint(R.string.notSupported);
            this.Z.setEnabled(false);
        }
        if (!this.S.y) {
            this.Z.setEnabled(false);
        }
        S();
    }

    public void showSettings(View view) {
        S();
    }
}
