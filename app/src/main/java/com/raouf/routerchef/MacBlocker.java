package com.raouf.routerchef;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.MacBlocker;
import com.raouf.routerchef.resModels.DevicesInfo;
import f8.a0;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import java.util.regex.Pattern;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class MacBlocker extends g {
    public p X;
    public Button Y;
    public EditText Z;

    /* renamed from: a0 */
    public EditText f3570a0;

    /* renamed from: b0 */
    public e f3571b0;

    @Override // i8.g
    public final void P() {
        this.O.post(new Runnable() { // from class: f8.h1
            @Override // java.lang.Runnable
            public final void run() {
                MacBlocker macBlocker = MacBlocker.this;
                macBlocker.Y.setEnabled(true);
                macBlocker.X.b();
                m.e(macBlocker.P);
            }
        });
    }

    public void blockMac(View view) {
        String obj = this.Z.getText().toString();
        String obj2 = this.f3570a0.getText().toString();
        if (obj.length() > 0 && Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$").matcher(obj2).matches()) {
            this.O.post(new a0(this, 1));
            m.e(this.P);
            m mVar = new m(this, this.S.h(obj, obj2));
            this.P = mVar;
            mVar.c(this.U + this.S.f16801n);
            return;
        }
        b.q(this, getString(R.string.macBlockerInvalidInfo));
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        Log.i("ASYNC MSG ::::::: ", str);
        String str2 = ((DevicesInfo) new h().b(str, DevicesInfo.class)).result;
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
            case -319102444:
                if (str2.equals("block_device_failed")) {
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
                b.q(this, getString(R.string.blockFailed));
                P();
                return;
            case 1:
                i10 = R.string.mayLogin;
                break;
            case 2:
                i10 = R.string.needLogin;
                break;
            case 3:
                P();
                b.q(this, getString(R.string.blockFailed));
                return;
            case 4:
                this.X.c(getString(R.string.applying));
                return;
            case 5:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3571b0 == null) {
                    return;
                }
                this.O.post(new Runnable() { // from class: f8.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MacBlocker.this.f3571b0.b();
                    }
                });
                return;
            default:
                this.X.c(str);
                return;
        }
        O(getString(i10));
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mac_blocker);
        AdView adView = (AdView) findViewById(R.id.macBlockerAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3571b0 = new e(this, "ca-app-pub-6362221127909922/8352612672", this.Q, false, this);
        }
        this.Y = (Button) findViewById(R.id.applyBtn);
        this.Z = (EditText) findViewById(R.id.deviceNameInput);
        this.f3570a0 = (EditText) findViewById(R.id.deviceMacInput);
        this.X = new p(this);
        if (!this.S.f16811z) {
            this.Z.setText("Unknown");
            this.Z.setEnabled(false);
            this.Z.setTextColor(Color.rgb(128, 128, 128));
        }
    }
}
