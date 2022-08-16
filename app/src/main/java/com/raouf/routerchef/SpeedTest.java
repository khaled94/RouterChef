package com.raouf.routerchef;

import a3.u;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.g1;
import com.github.anastr.speedviewlib.SpeedView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SpeedTest;
import com.raouf.routerchef.resModels.SpeedTestInfo;
import e.e;
import f3.d;
import f8.o0;
import g1.q;
import h8.c;
import java.util.Objects;
import java.util.regex.Pattern;
import k8.a;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class SpeedTest extends e {
    public TextView L;
    public TextView M;
    public Button N;
    public AdView O;
    public ProgressBar P;
    public a R;
    public SpeedView U;
    public PowerManager.WakeLock V;
    public final Handler Q = new Handler(Looper.getMainLooper());
    public boolean S = false;
    public boolean T = false;

    public final void O() {
        this.Q.post(new q(this, 4));
    }

    public final void P(final String str, final String str2) {
        final String c10 = d7.a.c(str, " Mbps");
        final String c11 = d7.a.c(str2, " Mbps");
        this.Q.post(new Runnable() { // from class: f8.k2
            @Override // java.lang.Runnable
            public final void run() {
                final SpeedTest speedTest = SpeedTest.this;
                String str3 = c11;
                final String str4 = str2;
                String str5 = c10;
                final String str6 = str;
                if (!speedTest.M.getText().toString().equals(str3)) {
                    speedTest.M.setText(str3);
                    final boolean matches = Pattern.matches("([0-9]*)\\.([0-9]*)", str4);
                    speedTest.Q.post(new Runnable() { // from class: f8.l2
                        @Override // java.lang.Runnable
                        public final void run() {
                            SpeedTest speedTest2 = SpeedTest.this;
                            boolean z10 = matches;
                            String str7 = str4;
                            speedTest2.U.setWithTremble(true);
                            if (z10) {
                                float parseFloat = Float.parseFloat(str7);
                                speedTest2.U.n(parseFloat, 500L);
                                if (speedTest2.U.getMaxSpeed() >= parseFloat && speedTest2.U.getMaxSpeed() != 100.0f) {
                                    return;
                                }
                                speedTest2.U.setMaxSpeed(parseFloat + 5.0f);
                            }
                        }
                    });
                }
                if (!speedTest.L.getText().toString().equals(str5)) {
                    speedTest.L.setText(str5);
                    final boolean matches2 = Pattern.matches("([0-9]*)\\.([0-9]*)", str6);
                    speedTest.Q.post(new Runnable() { // from class: f8.l2
                        @Override // java.lang.Runnable
                        public final void run() {
                            SpeedTest speedTest2 = SpeedTest.this;
                            boolean z10 = matches2;
                            String str7 = str6;
                            speedTest2.U.setWithTremble(true);
                            if (z10) {
                                float parseFloat = Float.parseFloat(str7);
                                speedTest2.U.n(parseFloat, 500L);
                                if (speedTest2.U.getMaxSpeed() >= parseFloat && speedTest2.U.getMaxSpeed() != 100.0f) {
                                    return;
                                }
                                speedTest2.U.setMaxSpeed(parseFloat + 5.0f);
                            }
                        }
                    });
                }
            }
        });
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        Log.i("ASYNC MSG ::::::: ", str);
        SpeedTestInfo speedTestInfo = (SpeedTestInfo) new h().b(str, SpeedTestInfo.class);
        String str2 = speedTestInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -1313911455:
                if (str2.equals("timeout")) {
                    c10 = 0;
                    break;
                }
                break;
            case -390484806:
                if (str2.equals("ready_to_start")) {
                    c10 = 1;
                    break;
                }
                break;
            case 303513065:
                if (str2.equals("final_speed_test_result")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2145984224:
                if (str2.equals("progress_speed_test_result")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                O();
                i10 = R.string.speedTestTimeout;
                str = getString(i10);
                b.q(this, str);
                return;
            case 1:
                this.T = true;
                this.Q.post(new g1(this, 3));
                return;
            case 2:
                P(speedTestInfo.upload, speedTestInfo.download);
                this.M.setTextColor(Color.rgb(0, 254, 0));
                this.L.setTextColor(Color.rgb(0, 254, 0));
                O();
                i10 = R.string.speedTestDone;
                str = getString(i10);
                b.q(this, str);
                return;
            case 3:
                P(speedTestInfo.upload, speedTestInfo.download);
                return;
            default:
                b.q(this, str);
                return;
        }
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_speed_test);
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(26, "MyApp::MyWakelockTag");
        this.V = newWakeLock;
        newWakeLock.acquire(600000L);
        AdView adView = (AdView) findViewById(R.id.speedTestAdView);
        this.O = adView;
        if (!b.l(this, adView, this.Q)) {
            this.O.a(new d(new d.a()));
            AdView adView2 = this.O;
            adView2.setAdListener(new c(this, adView2));
        }
        this.L = (TextView) findViewById(R.id.uploadValue);
        this.M = (TextView) findViewById(R.id.downloadValue);
        this.N = (Button) findViewById(R.id.toggleTestBtn);
        this.P = (ProgressBar) findViewById(R.id.progressBar);
        SpeedView speedView = (SpeedView) findViewById(R.id.speedView);
        this.U = speedView;
        speedView.getSections().get(0).b(Color.parseColor("#2ECC71"));
        this.U.getSections().get(1).b(Color.parseColor("#F1C40F"));
        this.U.getSections().get(2).b(Color.parseColor("#E74C3C"));
    }

    @Override // e.e, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        if (this.V.isHeld()) {
            try {
                this.V.release();
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    public void toggleTest(View view) {
        if (!this.S) {
            if (!b.k(this).booleanValue()) {
                b.q(this, getString(R.string.noConnection));
                return;
            }
            this.Q.post(new Runnable() { // from class: f8.j2
                @Override // java.lang.Runnable
                public final void run() {
                    SpeedTest speedTest = SpeedTest.this;
                    speedTest.M.setTextColor(-1);
                    speedTest.L.setTextColor(-1);
                    speedTest.S = true;
                    speedTest.Q.post(new u(speedTest, 2));
                    speedTest.M.setText("--");
                    speedTest.L.setText("--");
                    speedTest.N.setText(speedTest.getString(R.string.stopTest));
                    speedTest.P.setVisibility(0);
                }
            });
            a.a(this.R);
            a aVar = new a(this);
            this.R = aVar;
            aVar.f5634a.loadUrl("https://librespeed.org/");
            new Handler().postDelayed(new o0(this, 1), 30000L);
            return;
        }
        O();
    }
}
