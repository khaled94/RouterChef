package com.raouf.routerchef;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.resModels.PPPOEInfo;
import f8.c1;
import f8.s;
import g8.i;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import r8.b;
import u7.s0;
import x7.h;

/* loaded from: classes.dex */
public class PppoeSettings extends g {
    public p X;
    public Button Y;
    public Button Z;

    /* renamed from: a0 */
    public EditText f3604a0;

    /* renamed from: b0 */
    public EditText f3605b0;

    /* renamed from: c0 */
    public String f3606c0;

    /* renamed from: d0 */
    public String f3607d0;

    /* renamed from: e0 */
    public a f3608e0;

    /* renamed from: f0 */
    public e f3609f0;

    /* loaded from: classes.dex */
    public class a extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Spinner spinner) {
            super(context, "pppoe_presets", spinner);
            PppoeSettings.this = r1;
        }

        @Override // g8.i
        public final void b(String str) {
            PppoeSettings.this.f3604a0.setText(str.split(",")[0]);
            PppoeSettings.this.f3605b0.setText(str.split(",")[1]);
        }
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new s0(this, 1));
    }

    public final boolean Q() {
        if (this.f3604a0.getText().toString().length() <= 0 || this.f3605b0.getText().toString().length() <= 0 || this.f3605b0.getText().toString().contains("●")) {
            b.q(this, getString(R.string.errorEmpty));
            return false;
        }
        return true;
    }

    public final void R() {
        this.Y.setEnabled(false);
        this.Z.setEnabled(false);
        this.X.d();
        m.e(this.P);
        m mVar = new m(this, this.f3607d0);
        this.P = mVar;
        mVar.c(this.f3606c0);
    }

    public void apply(View view) {
        if (Q()) {
            this.Y.setEnabled(false);
            this.Z.setEnabled(false);
            this.X.d();
            m mVar = new m(this, this.S.d(this.f3604a0.getText().toString().trim(), this.f3605b0.getText().toString().trim()));
            this.P = mVar;
            mVar.c(this.f3606c0);
        }
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        Log.i("ASYNC MSG ::::::: ", str);
        PPPOEInfo pPPOEInfo = (PPPOEInfo) new h().b(str, PPPOEInfo.class);
        String str2 = pPPOEInfo.result;
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
            case 1539862813:
                if (str2.equals("ppp_info")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1547821646:
                if (str2.equals("applying_settings")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2043017103:
                if (str2.equals("executed")) {
                    c10 = 5;
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
                pVar = this.X;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 3:
                this.O.post(new c1(this, pPPOEInfo, 1));
                P();
                return;
            case 4:
                pVar = this.X;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case 5:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3609f0 == null) {
                    return;
                }
                this.O.post(new s(this, 2));
                return;
            default:
                this.X.c(str);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pppoe_settings);
        AdView adView = (AdView) findViewById(R.id.pppoeSettingsAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3609f0 = new e(this, "ca-app-pub-6362221127909922/5827152574", this.Q, false, this);
        }
        this.f3606c0 = this.U + this.S.f16798k;
        this.f3607d0 = this.S.t();
        this.X = new p(this);
        this.Y = (Button) findViewById(R.id.showBtn);
        this.Z = (Button) findViewById(R.id.applyBtn);
        this.f3604a0 = (EditText) findViewById(R.id.pppoeUsernameInput);
        this.f3605b0 = (EditText) findViewById(R.id.pppoePasswordInput);
        Button button = (Button) findViewById(R.id.savePreset);
        this.f3608e0 = new a(this, (Spinner) findViewById(R.id.pppoe_presets_spinner));
        R();
    }

    public void save(View view) {
        if (Q()) {
            StringBuilder c10 = androidx.fragment.app.a.c(this.f3604a0.getText().toString().trim(), ",");
            c10.append(this.f3605b0.getText().toString().trim());
            this.f3608e0.c(c10.toString());
        }
    }

    public void show(View view) {
        this.f3605b0.getText().clear();
        this.f3604a0.getText().clear();
        R();
    }
}
