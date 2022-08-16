package com.raouf.routerchef;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.R;
import com.raouf.routerchef.RouterDevices;
import com.raouf.routerchef.resModels.DevicesInfo;
import f8.a0;
import f8.b0;
import f8.b2;
import f8.d0;
import f8.d1;
import i8.g;
import i8.m;
import i8.p;
import j8.b;
import j8.c;
import j8.d;
import java.util.ArrayList;
import java.util.Objects;
import n6.q;
import x7.h;
import z3.n;

/* loaded from: classes.dex */
public class RouterDevices extends g implements d {
    public p X;
    public Button Y;
    public ArrayList<c> Z;

    /* renamed from: a0 */
    public RecyclerView f3611a0;

    /* renamed from: b0 */
    public b2 f3612b0;

    /* renamed from: c0 */
    public n f3613c0;

    /* renamed from: d0 */
    public RouterDevices f3614d0;

    /* renamed from: e0 */
    public TextView f3615e0;

    /* renamed from: f0 */
    public String f3616f0;

    /* renamed from: g0 */
    public String f3617g0;

    /* renamed from: h0 */
    public final Handler f3618h0 = new Handler(Looper.getMainLooper());

    @Override // j8.d
    public final void A(String str) {
    }

    @Override // j8.d
    public final void C() {
    }

    @Override // i8.g
    public final void P() {
        this.f3618h0.post(new a0(this, 2));
    }

    public final void Q() {
        this.f3618h0.post(new d1(this, 1));
        m.e(this.P);
        m mVar = new m(this, this.f3617g0);
        this.P = mVar;
        mVar.c(this.f3616f0);
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        Log.i("ASYNC MSG ::::::: ", str);
        final DevicesInfo devicesInfo = (DevicesInfo) new h().b(str, DevicesInfo.class);
        String str2 = devicesInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2028838842:
                if (str2.equals("connected_devices_info")) {
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
            case -724193048:
                if (str2.equals("showing_info")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2039809954:
                if (str2.equals("no_devices_found")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f3618h0.post(new Runnable() { // from class: f8.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        RouterDevices routerDevices = RouterDevices.this;
                        DevicesInfo devicesInfo2 = devicesInfo;
                        routerDevices.f3611a0.setVisibility(0);
                        routerDevices.f3615e0.setVisibility(8);
                        b bVar = new b(routerDevices, routerDevices);
                        bVar.b(devicesInfo2.devices, R.drawable.ic_edit);
                        bVar.g(true);
                        bVar.f();
                    }
                });
                return;
            case 1:
                i10 = R.string.mayLogin;
                break;
            case 2:
                i10 = R.string.needLogin;
                break;
            case 3:
                this.X.c(getString(R.string.loadingInfo));
                return;
            case 4:
                r8.b.q(this, getString(R.string.noConnectedDevices));
                this.f3618h0.post(new d0(this, 1));
                P();
                return;
            default:
                this.X.c(str);
                return;
        }
        O(getString(i10));
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
        this.f3618h0.post(new b0(this, arrayList, 1));
        P();
    }

    @Override // j8.d
    public final void l(String str) {
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_router_devices);
        AdView adView = (AdView) findViewById(R.id.connectedDevicesAdView);
        this.R = adView;
        if (!r8.b.l(this, adView, this.f3618h0)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new h8.c(this, adView2));
        }
        this.f3616f0 = this.U + this.S.f16794g;
        this.f3617g0 = this.S.o();
        this.f3611a0 = (RecyclerView) findViewById(R.id.routerDevicesRV);
        this.Y = (Button) findViewById(R.id.scanRouterDevicesBtn);
        this.X = new p(this);
        this.f3615e0 = (TextView) findViewById(R.id.errorMsg);
        this.f3614d0 = this;
        ArrayList<c> arrayList = new ArrayList<>();
        this.Z = arrayList;
        this.f3618h0.post(new q(this, arrayList, 1));
        this.f3613c0 = new n(this);
        Q();
    }

    public void scanAgain(View view) {
        Q();
    }

    @Override // j8.d
    public final void u() {
    }

    @Override // j8.d
    public final void y(String str) {
    }
}
