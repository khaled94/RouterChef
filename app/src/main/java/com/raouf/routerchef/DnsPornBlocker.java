package com.raouf.routerchef;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.resModels.DnsInfo;
import f8.g0;
import f8.h0;
import g1.o;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class DnsPornBlocker extends g {

    /* renamed from: i0 */
    public static final /* synthetic */ int f3530i0 = 0;
    public Button X;
    public Button Y;
    public EditText Z;

    /* renamed from: a0 */
    public EditText f3531a0;

    /* renamed from: b0 */
    public Spinner f3532b0;

    /* renamed from: c0 */
    public p f3533c0;

    /* renamed from: d0 */
    public TextView f3534d0;

    /* renamed from: e0 */
    public a f3535e0;

    /* renamed from: f0 */
    public String f3536f0;

    /* renamed from: g0 */
    public String f3537g0;

    /* renamed from: h0 */
    public String f3538h0 = "";

    /* loaded from: classes.dex */
    public class a extends g8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Spinner spinner) {
            super(context, spinner);
            DnsPornBlocker.this = r1;
        }
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new o(this, 1));
    }

    public final void Q() {
        this.X.setEnabled(false);
        this.Y.setEnabled(false);
        this.f3533c0.d();
        m.e(this.P);
        m mVar = new m(this, this.f3537g0);
        this.P = mVar;
        mVar.c(this.f3536f0);
    }

    public void apply(View view) {
        boolean z10;
        if ((this.Z.getText().toString().length() <= 0 || this.f3531a0.getText().toString().length() <= 0) && !this.f3535e0.a()) {
            b.q(this, getString(R.string.errorEmpty));
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.X.setEnabled(false);
            this.Y.setEnabled(false);
            this.f3533c0.d();
            m mVar = new m(this, this.S.b(this.f3535e0.a(), this.Z.getText().toString(), this.f3531a0.getText().toString()));
            this.P = mVar;
            mVar.c(this.f3536f0);
        }
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        int i11;
        p pVar;
        int i12;
        Log.i("ASYNC MSG ::::::: ", str);
        DnsInfo dnsInfo = (DnsInfo) new h().b(str, DnsInfo.class);
        String str2 = dnsInfo.result;
        Objects.requireNonNull(str2);
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -2094305299:
                if (str2.equals("request_failed")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1913787988:
                if (str2.equals("dns_not_supported")) {
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
            case 411855364:
                if (str2.equals("dns_info")) {
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
                i10 = R.string.requestFailed;
                b.q(this, getString(i10));
                P();
                return;
            case 1:
                this.O.post(new g1.m(this, 1));
                return;
            case 2:
                i11 = R.string.mayLogin;
                O(getString(i11));
                return;
            case 3:
                i11 = R.string.needLogin;
                O(getString(i11));
                return;
            case 4:
                pVar = this.f3533c0;
                i12 = R.string.loadingInfo;
                pVar.c(getString(i12));
                return;
            case 5:
                this.O.post(new h0(this, dnsInfo, 0));
                P();
                return;
            case 6:
                pVar = this.f3533c0;
                i12 = R.string.applying;
                pVar.c(getString(i12));
                return;
            case 7:
                i10 = R.string.doneSuccess;
                b.q(this, getString(i10));
                P();
                return;
            default:
                this.f3533c0.c(str);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_dnsporn_blocker);
        AdView adView = (AdView) findViewById(R.id.dnsPornBlockerView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            new e(this, "ca-app-pub-6362221127909922/3613936679", this.Q, true, this);
        }
        this.f3536f0 = this.U + this.S.f16800m;
        this.f3537g0 = this.S.p();
        this.f3533c0 = new p(this);
        this.X = (Button) findViewById(R.id.showBtn);
        this.Y = (Button) findViewById(R.id.applyBtn);
        this.Z = (EditText) findViewById(R.id.dns1Input);
        this.f3531a0 = (EditText) findViewById(R.id.dns2Input);
        this.f3532b0 = (Spinner) findViewById(R.id.dnsSpinner);
        this.f3534d0 = (TextView) findViewById(R.id.pingValue);
        this.f3535e0 = new a(this, this.f3532b0);
        Q();
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new g0(this, 0), 0L, 1L, TimeUnit.SECONDS);
    }

    public void show(View view) {
        this.Z.getText().clear();
        this.f3531a0.getText().clear();
        Q();
    }
}
