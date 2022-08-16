package com.raouf.routerchef;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ToggleButton;
import androidx.activity.d;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.AccessControl;
import com.raouf.routerchef.resModels.FilterStatusInfo;
import f8.l;
import f8.m;
import h8.c;
import h8.e;
import i8.g;
import i8.p;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class AccessControl extends g {

    /* renamed from: d0 */
    public static final /* synthetic */ int f3500d0 = 0;
    public p X;
    public ToggleButton Y;
    public String Z;

    /* renamed from: a0 */
    public String f3501a0;

    /* renamed from: b0 */
    public String f3502b0 = "ca-app-pub-6362221127909922/8352612672";

    /* renamed from: c0 */
    public e f3503c0;

    @Override // i8.g
    public final void P() {
        this.O.post(new d(this, 2));
    }

    public void blockList(View view) {
        startActivity(new Intent(this, Blacklist.class));
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        Handler handler;
        Runnable runnable;
        p pVar;
        int i11;
        Log.i("ASYNC MSG ::::::: ", str);
        final FilterStatusInfo filterStatusInfo = (FilterStatusInfo) new h().b(str, FilterStatusInfo.class);
        String str2 = filterStatusInfo.result;
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
            case -1278946049:
                if (str2.equals("must_has_macs")) {
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
            case 1097083540:
                if (str2.equals("filter_status_info")) {
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
                b.q(this, getString(R.string.requestFailed));
                P();
                return;
            case 1:
                i10 = R.string.mayLogin;
                O(getString(i10));
                return;
            case 2:
                P();
                handler = this.O;
                runnable = new m(this, 0);
                handler.post(runnable);
                return;
            case 3:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 4:
                pVar = this.X;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 5:
                this.O.post(new Runnable() { // from class: f8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccessControl.this.Y.setChecked(filterStatusInfo.blockerEnabled);
                    }
                });
                P();
                return;
            case 6:
                pVar = this.X;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case 7:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3503c0 == null) {
                    return;
                }
                handler = this.O;
                runnable = new l(this, 0);
                handler.post(runnable);
                return;
            default:
                this.X.c(str);
                return;
        }
    }

    public void changeStatus(View view) {
        this.Y.setEnabled(false);
        this.X.d();
        i8.m mVar = new i8.m(this, this.S.w(this.Y.isChecked()));
        this.P = mVar;
        mVar.c(this.Z);
    }

    public void devicesBlocker(View view) {
        startActivity(new Intent(this, AccessBlocker.class));
    }

    public void macBlocker(View view) {
        startActivity(new Intent(this, MacBlocker.class));
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_access_control);
        AdView adView = (AdView) findViewById(R.id.wifiAccessControlAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3503c0 = new e(this, this.f3502b0, this.Q, false, this);
        }
        this.Z = this.U + this.S.f16801n;
        this.f3501a0 = this.S.s();
        this.Y = (ToggleButton) findViewById(R.id.filterToggleBtn);
        this.X = new p(this);
        this.Y.setEnabled(false);
        this.X.d();
        i8.m.e(this.P);
        i8.m mVar = new i8.m(this, this.f3501a0);
        this.P = mVar;
        mVar.c(this.Z);
    }
}
