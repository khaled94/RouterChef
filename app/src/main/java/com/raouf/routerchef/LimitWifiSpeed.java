package com.raouf.routerchef;

import a3.u;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.LimitWifiSpeed;
import com.raouf.routerchef.resModels.LimitWifiInfo;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class LimitWifiSpeed extends g {

    /* renamed from: i0 */
    public static final /* synthetic */ int f3540i0 = 0;
    public RadioButton X;
    public RadioButton Y;
    public TextView Z;

    /* renamed from: a0 */
    public SeekBar f3541a0;

    /* renamed from: b0 */
    public p f3542b0;

    /* renamed from: c0 */
    public Button f3543c0;

    /* renamed from: d0 */
    public Button f3544d0;

    /* renamed from: e0 */
    public int f3545e0;

    /* renamed from: f0 */
    public String f3546f0;

    /* renamed from: g0 */
    public String f3547g0;

    /* renamed from: h0 */
    public e f3548h0;

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
            LimitWifiSpeed.this = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @SuppressLint({"SetTextI18n"})
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (i10 < 1) {
                seekBar.setProgress(1);
                return;
            }
            TextView textView = LimitWifiSpeed.this.Z;
            textView.setText((i10 * LimitWifiSpeed.this.f3545e0) + "%");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new Runnable() { // from class: f8.r0
            @Override // java.lang.Runnable
            public final void run() {
                LimitWifiSpeed limitWifiSpeed = LimitWifiSpeed.this;
                limitWifiSpeed.f3543c0.setEnabled(true);
                limitWifiSpeed.f3544d0.setEnabled(true);
                limitWifiSpeed.f3542b0.b();
                m.e(limitWifiSpeed.P);
            }
        });
    }

    public final void Q() {
        this.f3543c0.setEnabled(false);
        this.f3544d0.setEnabled(false);
        this.f3542b0.d();
        m.e(this.P);
        m mVar = new m(this, this.f3547g0);
        this.P = mVar;
        mVar.c(this.f3546f0);
    }

    public void applyLimitSettings(View view) {
        this.f3543c0.setEnabled(false);
        this.f3544d0.setEnabled(false);
        this.f3542b0.d();
        m mVar = new m(this, this.S.c(this.Y.isChecked(), String.valueOf((100 / this.f3541a0.getMax()) * this.f3541a0.getProgress())));
        this.P = mVar;
        mVar.c(this.f3546f0);
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        Log.i("ASYNC MSG ::::::: ", str);
        LimitWifiInfo limitWifiInfo = (LimitWifiInfo) new h().b(str, LimitWifiInfo.class);
        String str2 = limitWifiInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1313911455:
                if (str2.equals("timeout")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1265587180:
                if (str2.equals("limit_wifi_info")) {
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
            case -724193048:
                if (str2.equals("showing_info")) {
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
                this.O.post(new f8.g(this, limitWifiInfo, 1));
                P();
                return;
            case 2:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 3:
                pVar = this.f3542b0;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 4:
                pVar = this.f3542b0;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case 5:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3548h0 == null) {
                    return;
                }
                this.O.post(new u(this, 1));
                return;
            default:
                this.f3542b0.c(str);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_limit_wifi_speed);
        AdView adView = (AdView) findViewById(R.id.LimitWiFiAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3548h0 = new e(this, "ca-app-pub-6362221127909922/2164784328", this.Q, false, this);
        }
        this.f3546f0 = this.U + this.S.f16796i;
        this.f3547g0 = this.S.q();
        this.f3541a0 = (SeekBar) findViewById(R.id.wifiPowerSeek);
        this.X = (RadioButton) findViewById(R.id.wifiLimitUnlimited);
        this.Y = (RadioButton) findViewById(R.id.wifiLimit6Mbps);
        this.f3543c0 = (Button) findViewById(R.id.showBtn);
        this.f3544d0 = (Button) findViewById(R.id.applyBtn);
        this.Z = (TextView) findViewById(R.id.wifiPowerValue);
        this.f3542b0 = new p(this);
        this.f3541a0.setMax(this.S.C);
        this.f3541a0.setOnSeekBarChangeListener(new a());
        if (!this.S.A) {
            this.Z.setText(getString(R.string.notSupported));
            this.f3541a0.setEnabled(false);
        }
        this.f3545e0 = 100 / this.f3541a0.getMax();
        this.f3541a0.setProgress(2);
        this.Z.setText((this.f3545e0 * 2) + "%");
        Q();
    }

    public void showLimitSettings(View view) {
        Q();
    }
}
