package com.raouf.routerchef;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.k;
import androidx.lifecycle.g;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.MainFeatures;
import com.raouf.routerchef.Onboarding;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.LoginInfo;
import f8.b1;
import f8.c1;
import f8.d1;
import f8.e1;
import f8.s;
import f8.z0;
import g8.i;
import h8.c;
import h8.e;
import h8.f;
import i8.g;
import i8.l;
import i8.m;
import i8.p;
import java.util.Objects;
import r8.b;
import x7.h;

/* loaded from: classes.dex */
public class Login extends g {

    /* renamed from: m0 */
    public static String f3556m0;
    public Button X;
    public EditText Y;
    public EditText Z;

    /* renamed from: a0 */
    public EditText f3557a0;

    /* renamed from: b0 */
    public TextView f3558b0;

    /* renamed from: c0 */
    public TextView f3559c0;

    /* renamed from: d0 */
    public TextView f3560d0;

    /* renamed from: e0 */
    public Spinner f3561e0;

    /* renamed from: f0 */
    public ConstraintLayout f3562f0;

    /* renamed from: g0 */
    public p f3563g0;

    /* renamed from: h0 */
    public SharedPreferences f3564h0;

    /* renamed from: i0 */
    public boolean f3565i0 = false;

    /* renamed from: j0 */
    public a f3566j0;

    /* renamed from: k0 */
    public e f3567k0;

    /* renamed from: l0 */
    public PowerManager.WakeLock f3568l0;

    /* loaded from: classes.dex */
    public class a extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Spinner spinner) {
            super(context, "login_presets", spinner);
            Login.this = r1;
        }

        @Override // g8.i
        public final void b(String str) {
            Login.this.Y.setText(str.split(",")[0]);
            Login.this.Z.setText(str.split(",")[1]);
            Login.this.f3557a0.setText(str.split(",")[2]);
        }
    }

    @Override // i8.g
    public final void O(String str) {
        this.O.post(new c1(this, str, 0));
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new d1(this, 0));
    }

    public final boolean Q() {
        if (this.Y.getText().toString().trim().length() <= 0 || this.f3557a0.getText().toString().length() <= 0) {
            b.q(this, getString(R.string.errorEmpty));
            return false;
        }
        return true;
    }

    public final void R() {
        Runnable runnable;
        Handler handler;
        if (!b.k(this).booleanValue()) {
            b.q(this, getString(R.string.noConnection));
        } else if (!Q()) {
        } else {
            this.T.f16193u = this.Y.getText().toString().trim();
            f3556m0 = (String) this.T.f16193u;
            String trim = this.Z.getText().toString().trim();
            String obj = this.f3557a0.getText().toString();
            this.X.setEnabled(false);
            this.f3563g0.d();
            this.f3564h0.edit().putString("routerIP", f3556m0).apply();
            this.f3564h0.edit().putString("username", trim).apply();
            this.f3564h0.edit().putString("password", obj).apply();
            if (!this.f3565i0) {
                m.e(this.P);
                if (!this.S.f16791d.equals("VMG3625")) {
                    WebView.clearClientCertPreferences(null);
                    WebStorage.getInstance().deleteAllData();
                    CookieManager.getInstance().removeAllCookies(null);
                    CookieManager.getInstance().removeSessionCookies(null);
                    CookieManager.getInstance().flush();
                }
                this.P = new m(this, "let modelCheckTimeout = setTimeout(() => {\n  clearInterval(modelCheckTimer);\n  clearTimeout(modelCheckTimeout);\n  Android.callbackHandle(JSON.stringify({ result: 'model_not_found' }));\n}, 10000);\n\nlet modelCheckTimer = setInterval(() => {\n  try {\n    Android.callbackHandle(JSON.stringify({ result: 'checking_model' }));\n    let source = document.getElementsByTagName('html')[0].innerHTML;\n    let detectedModel;\n    /* VMG3625 Model */\n    if (source.includes('VMG3625')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'VMG3625' }));\n    }\n    /* VN020 Model */\n    else if (source.includes('VN020-F3')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'VN020F3' }));\n    }\n    /* ZTEH168N Model */\n    else if (source.includes('H168N')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'ZTEH168N' }));\n    }\n    /* ZTEH108N Model */\n    else if (source.includes('H108N')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'ZTEH108N' }));\n    }\n    /* ZTEH188A Model */\n    else if (source.includes('H188A')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'ZTEH188A' }));\n    }\n    /* HG8145V5 Model */\n    else if (source.includes('HG8145V5')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'HG8145V5' }));\n    }\n    /* HG8141A5 Model */\n    else if (source.includes('HG8141A5')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'HG8141A5' }));\n    }\n    /* DN8245V Model */\n    else if (source.includes('DN8245V-56')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'DN8245V' }));\n    }\n    /* HG630V2 Model */\n    else if (source.includes('HG630')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'HG630V2' }));\n    }\n    /* HG633 Model */\n    else if (source.includes('HG633')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'HG633' }));\n    }\n    /* DG8045 Model */\n    else if (source.includes('DG8045')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'DG8045' }));\n    }\n    /* HG531 */\n    else if (source.includes('Copyright © Huawei Technologies Co., Ltd. ')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'HG531V1' }));\n    }\n    /* TDW9960 */\n    else if (source.includes('TD-W9960')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'TDW9960' }));\n    }\n    /* TDW8968 */\n    else if (source.includes('Model No. TD-W89')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'TDW8968' }));\n    }\n    /* VR300 */\n    else if (source.includes('VR300')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'VR300' }));\n    }\n    /* VR300 */\n    else if (source.includes('VR400')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'VR400' }));\n    }\n    /* VR300 */\n    else if (source.includes('VR600')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'VR600' }));\n    }\n    /* TotoLink_ND300 */\n    else if (source.includes('<h2><font color=\"#FFFFFF\">USER LOGIN</font></h2>')) {\n      clearInterval(modelCheckTimer);\n      clearTimeout(modelCheckTimeout);\n      Android.callbackHandle(JSON.stringify({ result: 'model_detected', routerModel: 'TotoLink_ND300' }));\n    }\n    } catch (err){ }\n}, 500);");
                if (!this.S.f16791d.equals("VMG3625")) {
                    this.P.d();
                }
                this.P.c(f3556m0);
                this.O.removeCallbacksAndMessages(null);
                handler = this.O;
                runnable = new b1(this, 0);
            } else {
                m mVar = this.P;
                if (mVar == null) {
                    return;
                }
                String j3 = this.S.j(trim, obj);
                WebView webView = mVar.f5293a;
                if (webView != null) {
                    webView.setWebViewClient(null);
                    mVar.f5293a.setWebViewClient(new l(mVar, j3));
                }
                m mVar2 = this.P;
                String j10 = this.S.j(trim, obj);
                if (mVar2.f5293a == null) {
                    mVar2.b();
                }
                mVar2.f5293a.evaluateJavascript(j10, null);
                handler = this.O;
                runnable = new Runnable() { // from class: f8.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Login login = Login.this;
                        if (login.f3563g0.f5300a.getVisibility() != 8) {
                            login.P();
                            b.q(login, login.getString(R.string.timeoutMsg));
                        }
                    }
                };
            }
            handler.postDelayed(runnable, 50000L);
        }
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        Handler handler;
        Runnable kVar;
        d.a aVar;
        DialogInterface.OnClickListener onClickListener;
        String str2;
        p pVar;
        String str3;
        int i10;
        Resources resources;
        g.c cVar = g.c.STARTED;
        Log.i("ASYNC MSG ::::::: ", str);
        LoginInfo loginInfo = (LoginInfo) new h().b(str, LoginInfo.class);
        String str4 = loginInfo.result;
        Objects.requireNonNull(str4);
        char c10 = 65535;
        switch (str4.hashCode()) {
            case -1464218920:
                if (str4.equals("model_detected")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1313911455:
                if (str4.equals("timeout")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1201643326:
                if (str4.equals("already_login")) {
                    c10 = 2;
                    break;
                }
                break;
            case -930157179:
                if (str4.equals("retry_after")) {
                    c10 = 3;
                    break;
                }
                break;
            case -843272415:
                if (str4.equals("invalid_login")) {
                    c10 = 4;
                    break;
                }
                break;
            case -501392083:
                if (str4.equals("login_success")) {
                    c10 = 5;
                    break;
                }
                break;
            case 642643461:
                if (str4.equals("logging_in")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1038274944:
                if (str4.equals("model_not_found")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1509836932:
                if (str4.equals("checking_model")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1621319884:
                if (str4.equals("enforce_login")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f3565i0 = true;
                if (!loginInfo.routerModel.equals(this.S.f16791d)) {
                    this.O.post(new e1(this, loginInfo, 0));
                    return;
                }
                handler = this.O;
                kVar = new k(this, 1);
                handler.post(kVar);
                return;
            case 1:
                handler = this.O;
                kVar = new Runnable() { // from class: f8.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Login login = Login.this;
                        String str5 = Login.f3556m0;
                        login.O(login.getString(R.string.timeout));
                    }
                };
                handler.post(kVar);
                return;
            case 2:
                b.q(this, getString(R.string.alreadyLoggedIn));
                P();
                return;
            case 3:
                b.q(this, getString(R.string.manyTries, Integer.valueOf(loginInfo.time)));
                P();
                if (!this.f387v.f1702b.b(cVar)) {
                    return;
                }
                aVar = new d.a(this);
                aVar.f502a.f478f = getString(R.string.loginHelpNote);
                str2 = getString(R.string.loginHelp);
                onClickListener = new DialogInterface.OnClickListener() { // from class: f8.x0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        Login login = Login.this;
                        String str5 = Login.f3556m0;
                        Objects.requireNonNull(login);
                        login.startActivity(new Intent(login, Onboarding.class));
                        dialogInterface.dismiss();
                    }
                };
                aVar.c(str2, onClickListener);
                aVar.d();
                return;
            case 4:
                b.q(this, getString(R.string.invalidCred));
                return;
            case 5:
                this.O.post(new s(this, 1));
                P();
                return;
            case 6:
                pVar = this.f3563g0;
                resources = getResources();
                i10 = R.string.logging;
                str3 = resources.getString(i10);
                pVar.c(str3);
                return;
            case 7:
                P();
                if (!this.f387v.f1702b.b(cVar)) {
                    return;
                }
                aVar = new d.a(this);
                aVar.f502a.f476d = getString(R.string.notSupported);
                aVar.f502a.f478f = getString(R.string.modelFailed);
                str2 = getString(R.string.okTamam);
                onClickListener = z0.f4718s;
                aVar.c(str2, onClickListener);
                aVar.d();
                return;
            case '\b':
                pVar = this.f3563g0;
                str3 = getString(R.string.checkModel);
                pVar.c(str3);
                return;
            case '\t':
                pVar = this.f3563g0;
                resources = getResources();
                i10 = R.string.firstLogin;
                str3 = resources.getString(i10);
                pVar.c(str3);
                return;
            default:
                this.f3563g0.c(loginInfo.result);
                return;
        }
    }

    public void facebook(View view) {
        b.a(this);
    }

    public void fbGroup(View view) {
        b.b(this);
    }

    public void linkedIn(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.linkedin.com/profile/view?id=mohraouf")));
    }

    public void login(View view) {
        b.j(this);
        this.M = 0;
        this.f3565i0 = false;
        R();
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.routerChef);
        setContentView(R.layout.activity_login);
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(26, "MyApp::MyWakelockTag");
        this.f3568l0 = newWakeLock;
        newWakeLock.acquire(600000L);
        AdView adView = (AdView) findViewById(R.id.mainAdView);
        this.R = adView;
        if (!b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
            this.f3567k0 = new e(this, "ca-app-pub-6362221127909922/1894699938", this.Q, false, new f() { // from class: f8.a1
                @Override // h8.f
                public final void q() {
                    Login login = Login.this;
                    String str = Login.f3556m0;
                    Objects.requireNonNull(login);
                    login.startActivity(new Intent(login, MainFeatures.class));
                }
            });
        }
        SharedPreferences sharedPreferences = getSharedPreferences("prefs", 0);
        this.f3564h0 = sharedPreferences;
        if (sharedPreferences.getBoolean("onboarding", true)) {
            startActivity(new Intent(this, Onboarding.class));
        }
        this.f3563g0 = new p(this);
        this.X = (Button) findViewById(R.id.connectBtn);
        this.Y = (EditText) findViewById(R.id.routerIP);
        this.Z = (EditText) findViewById(R.id.username);
        this.f3557a0 = (EditText) findViewById(R.id.password);
        this.f3558b0 = (TextView) findViewById(R.id.hiddenIcon);
        this.f3559c0 = (TextView) findViewById(R.id.visibleIcon);
        this.f3561e0 = (Spinner) findViewById(R.id.presetSpinner);
        SharedPreferences sharedPreferences2 = getSharedPreferences("login_cred", 0);
        this.f3564h0 = sharedPreferences2;
        this.Y.setText(sharedPreferences2.getString("routerIP", "192.168.1.1"));
        this.Z.setText(this.f3564h0.getString("username", "admin"));
        this.f3557a0.setText(this.f3564h0.getString("password", ""));
        ((TextView) findViewById(R.id.versionLabel)).setText("v" + b.h(this));
        this.f3566j0 = new a(this, this.f3561e0);
        TextView textView = (TextView) findViewById(R.id.welcomeMsg);
        this.f3560d0 = textView;
        textView.setText(getIntent().getStringExtra("welcomeMsg"));
        this.f3560d0.setSelected(true);
        this.f3562f0 = (ConstraintLayout) findViewById(R.id.premiumFlag);
        if (b.l(this, this.R, this.O)) {
            this.f3562f0.setVisibility(0);
            ((ImageView) findViewById(R.id.logoRounded)).setImageResource(R.drawable.ic_pro_logo_rounded);
            findViewById(R.id.whatsAppLayout).setVisibility(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // e.e, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        if (this.f3568l0.isHeld()) {
            try {
                this.f3568l0.release();
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"NonConstantResourceId"})
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        if (menuItem.getItemId() != R.id.settings) {
            if (menuItem.getItemId() == R.id.help) {
                intent = new Intent(this, Onboarding.class);
            }
            return super.onOptionsItemSelected(menuItem);
        }
        intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(menuItem);
    }

    public void save(View view) {
        if (Q()) {
            StringBuilder c10 = androidx.fragment.app.a.c(this.Y.getText().toString().trim(), ",");
            c10.append(this.Z.getText().toString().trim());
            StringBuilder c11 = androidx.fragment.app.a.c(c10.toString(), ",");
            c11.append(this.f3557a0.getText().toString().trim());
            this.f3566j0.c(c11.toString());
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void triggerPW(View view) {
        if (this.f3558b0.getVisibility() == 0) {
            this.f3558b0.setVisibility(4);
            this.f3559c0.setVisibility(0);
            this.f3557a0.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this.f3558b0.setVisibility(0);
            this.f3559c0.setVisibility(4);
            this.f3557a0.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        EditText editText = this.f3557a0;
        editText.setSelection(editText.getText().length());
    }

    public void whatsApp(View view) {
        b.s(this);
    }

    public void youtube(View view) {
        b.t(this);
    }
}
