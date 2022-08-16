package com.raouf.routerchef;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import androidx.appcompat.app.d;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.Advanced;
import com.raouf.routerchef.resModels.AdvancedActions;
import f8.q;
import f8.r;
import f8.s;
import h8.c;
import h8.e;
import i8.g;
import i8.m;
import i8.p;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class Advanced extends g {

    /* renamed from: f0 */
    public static final /* synthetic */ int f3504f0 = 0;
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a0 */
    public p f3505a0;

    /* renamed from: b0 */
    public Button f3506b0;

    /* renamed from: c0 */
    public Button f3507c0;

    /* renamed from: d0 */
    public String f3508d0 = "ca-app-pub-6362221127909922/2721329277";

    /* renamed from: e0 */
    public e f3509e0;

    @Override // i8.g
    public final void P() {
        this.O.post(new Runnable() { // from class: f8.t
            @Override // java.lang.Runnable
            public final void run() {
                Advanced advanced = Advanced.this;
                advanced.f3506b0.setEnabled(true);
                advanced.f3506b0.setEnabled(true);
                advanced.f3505a0.b();
                m.e(advanced.P);
            }
        });
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        Log.i("ASYNC MSG ::::::: ", str);
        String str2 = ((AdvancedActions) new h().b(str, AdvancedActions.class)).result;
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
            case 1547821646:
                if (str2.equals("applying_settings")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2043017103:
                if (str2.equals("executed")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = R.string.mayLogin;
                break;
            case 1:
                i10 = R.string.needLogin;
                break;
            case 2:
                this.f3505a0.c(getString(R.string.applying));
                return;
            case 3:
                b.q(this, getString(R.string.doneSuccess));
                P();
                if (this.f3509e0 == null) {
                    return;
                }
                this.O.post(new s(this, 0));
                return;
            default:
                this.f3505a0.c(str);
                return;
        }
        O(getString(i10));
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_advanced);
        AdView adView = (AdView) findViewById(R.id.advancedAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3509e0 = new e(this, this.f3508d0, this.Q, false, this);
        }
        this.X = this.U + this.S.f16799l;
        this.Y = this.S.k();
        this.Z = this.S.l();
        this.f3505a0 = new p(this);
        this.f3506b0 = (Button) findViewById(R.id.rebootBtn);
        this.f3507c0 = (Button) findViewById(R.id.resetBtn);
        if (!this.S.B) {
            findViewById(R.id.reset_container).setVisibility(8);
        }
    }

    public void reboot(View view) {
        d.a aVar = new d.a(this);
        aVar.f502a.f476d = getString(R.string.confirm);
        aVar.f502a.f478f = getString(R.string.rebootMsg);
        aVar.c(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: f8.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Advanced advanced = Advanced.this;
                advanced.f3506b0.setEnabled(false);
                advanced.f3507c0.setEnabled(false);
                advanced.f3505a0.d();
                m mVar = new m(advanced, advanced.Y);
                advanced.P = mVar;
                mVar.c(advanced.X);
                dialogInterface.dismiss();
            }
        });
        aVar.b(getString(R.string.no), q.f4674s);
        aVar.d();
    }

    public void reset(View view) {
        d.a aVar = new d.a(this);
        aVar.f502a.f476d = getString(R.string.confirm);
        aVar.f502a.f478f = getString(R.string.resetMsg);
        aVar.c(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: f8.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Advanced advanced = Advanced.this;
                advanced.f3506b0.setEnabled(false);
                advanced.f3507c0.setEnabled(false);
                advanced.f3505a0.d();
                m mVar = new m(advanced, advanced.Z);
                advanced.P = mVar;
                mVar.c(advanced.X);
                dialogInterface.dismiss();
            }
        });
        aVar.b(getString(R.string.no), r.f4678s);
        aVar.d();
    }
}
