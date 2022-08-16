package com.raouf.routerchef;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.a;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.resModels.DevicesInfo;
import f8.a0;
import f8.b0;
import f8.c0;
import f8.d0;
import f8.e0;
import f8.f0;
import f8.z;
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
public class Blacklist extends g implements d {

    /* renamed from: h0 */
    public static final /* synthetic */ int f3522h0 = 0;
    public p X;
    public Button Y;
    public String Z = "ca-app-pub-6362221127909922/8352612672";

    /* renamed from: a0 */
    public e f3523a0;

    /* renamed from: b0 */
    public ArrayList<c> f3524b0;

    /* renamed from: c0 */
    public RecyclerView f3525c0;

    /* renamed from: d0 */
    public f0 f3526d0;

    /* renamed from: e0 */
    public Blacklist f3527e0;

    /* renamed from: f0 */
    public TextView f3528f0;

    /* renamed from: g0 */
    public Dialog f3529g0;

    public Blacklist() {
        new ArrayList();
    }

    @Override // j8.d
    public final void A(String str) {
    }

    @Override // j8.d
    public final void C() {
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new z(this, 0));
    }

    public final void Q() {
        this.O.post(new a0(this, 0));
        m.e(this.P);
        m mVar = new m(this, this.S.n());
        this.P = mVar;
        mVar.c(this.U + this.S.f16802o);
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        p pVar;
        int i11;
        String str2;
        DevicesInfo devicesInfo = (DevicesInfo) new h().b(str, DevicesInfo.class);
        String str3 = devicesInfo.result;
        Objects.requireNonNull(str3);
        char c10 = 65535;
        switch (str3.hashCode()) {
            case -2094305299:
                if (str3.equals("request_failed")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1313911455:
                if (str3.equals("timeout")) {
                    c10 = 1;
                    break;
                }
                break;
            case -996765056:
                if (str3.equals("need_login")) {
                    c10 = 2;
                    break;
                }
                break;
            case -724193048:
                if (str3.equals("showing_info")) {
                    c10 = 3;
                    break;
                }
                break;
            case 154380978:
                if (str3.equals("blacklist_devices_info")) {
                    c10 = 4;
                    break;
                }
                break;
            case 491291763:
                if (str3.equals("mac_filter_disabled")) {
                    c10 = 5;
                    break;
                }
                break;
            case 913126107:
                if (str3.equals("unblock_device_failed")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1547821646:
                if (str3.equals("applying_settings")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2039809954:
                if (str3.equals("no_devices_found")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2043017103:
                if (str3.equals("executed")) {
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
                i10 = R.string.mayLogin;
                O(getString(i10));
                return;
            case 2:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 3:
                pVar = this.X;
                i11 = R.string.loadingInfo;
                pVar.c(getString(i11));
                return;
            case 4:
                this.O.post(new b0(this, devicesInfo, 0));
                return;
            case 5:
                P();
                str2 = getString(R.string.macFilterDisabled);
                b.q(this, str2);
                return;
            case 6:
                P();
                str2 = getString(R.string.blockFailed);
                b.q(this, str2);
                return;
            case 7:
                pVar = this.X;
                i11 = R.string.applying;
                pVar.c(getString(i11));
                return;
            case '\b':
                this.O.post(new a(this, 1));
                P();
                return;
            case '\t':
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3523a0 == null) {
                    return;
                }
                this.O.post(new d0(this, 0));
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
        this.O.post(new e0(this, arrayList));
        P();
    }

    @Override // j8.d
    public final void l(String str) {
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blacklist);
        AdView adView = (AdView) findViewById(R.id.blacklistAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new h8.c(this, adView2));
            this.f3523a0 = new e(this, this.Z, this.Q, false, this);
        }
        this.f3525c0 = (RecyclerView) findViewById(R.id.blockListRV);
        this.f3528f0 = (TextView) findViewById(R.id.devicesBlockerErrorMsg);
        this.f3527e0 = this;
        ArrayList<c> arrayList = new ArrayList<>();
        this.f3524b0 = arrayList;
        this.O.post(new c0(this, arrayList, 0));
        this.Y = (Button) findViewById(R.id.scanBtn);
        this.X = new p(this);
        Q();
    }

    public void scanBlacklist(View view) {
        Q();
    }

    @Override // j8.d
    public final void u() {
    }

    @Override // j8.d
    public final void y(String str) {
    }
}
