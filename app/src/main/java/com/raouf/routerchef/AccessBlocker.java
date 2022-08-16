package com.raouf.routerchef;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.g1;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.resModels.DevicesInfo;
import f8.j;
import g1.q;
import g1.r;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import j8.c;
import j8.d;
import java.util.ArrayList;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class AccessBlocker extends g implements d {

    /* renamed from: k0 */
    public static final /* synthetic */ int f3489k0 = 0;
    public p X;
    public Button Y;
    public String Z;

    /* renamed from: a0 */
    public String f3490a0;

    /* renamed from: b0 */
    public String f3491b0;

    /* renamed from: c0 */
    public ArrayList<c> f3492c0;

    /* renamed from: d0 */
    public RecyclerView f3493d0;

    /* renamed from: e0 */
    public j f3494e0;

    /* renamed from: f0 */
    public AccessBlocker f3495f0;

    /* renamed from: g0 */
    public TextView f3496g0;

    /* renamed from: h0 */
    public String f3497h0 = "ca-app-pub-6362221127909922/8352612672";

    /* renamed from: i0 */
    public e f3498i0;

    /* renamed from: j0 */
    public Dialog f3499j0;

    @Override // j8.d
    public final void A(String str) {
    }

    @Override // j8.d
    public final void C() {
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new g1(this, 1));
    }

    public final void Q(String str, String str2) {
        this.O.post(new q(this, 2));
        m.e(this.P);
        m mVar = new m(this, this.S.i(str, str2));
        this.P = mVar;
        mVar.c(this.f3490a0);
    }

    public final String R(String str, String str2) {
        if (str.equals("Unknown")) {
            StringBuilder c10 = a.c(str, "_");
            c10.append(str2.substring(str2.length() - 2));
            str = c10.toString();
        }
        return str.substring(0, Math.min(str.length(), 10));
    }

    public final void S() {
        this.O.post(new q(this, 2));
        m.e(this.P);
        m mVar = new m(this, this.f3491b0);
        this.P = mVar;
        mVar.c(this.Z);
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        String string;
        Log.i("ASYNC MSG ::::::: ", str);
        DevicesInfo devicesInfo = (DevicesInfo) new h().b(str, DevicesInfo.class);
        String str2 = devicesInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2094305299:
                if (str2.equals("request_failed")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2028838842:
                if (str2.equals("connected_devices_info")) {
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
            case -319102444:
                if (str2.equals("block_device_failed")) {
                    c10 = 5;
                    break;
                }
                break;
            case 491291763:
                if (str2.equals("mac_filter_disabled")) {
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
            case 2039809954:
                if (str2.equals("no_devices_found")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2043017103:
                if (str2.equals("executed")) {
                    c10 = '\t';
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
                this.O.post(new r(this, devicesInfo, 1));
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
                pVar = this.X;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 5:
                P();
                string = getString(R.string.blockFailed);
                b.q(this, string);
                return;
            case 6:
                P();
                string = getString(R.string.macFilterDisabled);
                b.q(this, string);
                return;
            case 7:
                pVar = this.X;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case '\b':
                this.O.post(new g1.p(this, 1));
                P();
                return;
            case '\t':
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3498i0 == null) {
                    return;
                }
                this.O.post(new Runnable() { // from class: f8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccessBlocker.this.f3498i0.b();
                    }
                });
                return;
            default:
                this.X.c(str);
                return;
        }
    }

    @Override // j8.d
    public final void d(c cVar, int i10) {
    }

    @Override // j8.d
    public final void f(ArrayList<c> arrayList) {
    }

    @Override // j8.d
    public final void i(ArrayList<c> arrayList) {
    }

    @Override // j8.d
    public final void k(ArrayList<c> arrayList) {
        this.O.post(new f8.g(this, arrayList, 0));
        P();
    }

    @Override // j8.d
    public final void l(String str) {
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_access_blocker);
        AdView adView = (AdView) findViewById(R.id.accessBlockerAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new h8.c(this, adView2));
            this.f3498i0 = new e(this, this.f3497h0, this.Q, false, this);
        }
        this.f3493d0 = (RecyclerView) findViewById(R.id.routerDevicesBlockerRV);
        this.f3496g0 = (TextView) findViewById(R.id.devicesBlockerErrorMsg);
        this.f3495f0 = this;
        ArrayList<c> arrayList = new ArrayList<>();
        this.f3492c0 = arrayList;
        this.O.post(new f8.h(this, arrayList, 0));
        this.Z = this.U + this.S.f16794g;
        this.f3490a0 = this.U + this.S.f16801n;
        this.f3491b0 = this.S.o();
        this.Y = (Button) findViewById(R.id.scanBtn);
        this.X = new p(this);
        S();
    }

    public void scanConnectedDevices(View view) {
        S();
    }

    @Override // j8.d
    public final void u() {
    }

    @Override // j8.d
    public final void y(String str) {
    }
}
