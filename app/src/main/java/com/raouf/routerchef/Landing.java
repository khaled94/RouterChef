package com.raouf.routerchef;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.g;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.Landing;
import f3.d;
import f8.j0;
import f8.k0;
import f8.o0;
import f8.p0;
import f8.q0;
import g1.q;
import h8.c;
import i8.a;
import java.util.ArrayList;
import java.util.Objects;
import r8.b;
import t8.t;
import t8.x;

/* loaded from: classes.dex */
public class Landing extends a {
    public static final /* synthetic */ int S = 0;
    public CardView M;
    public TextView N;
    public ConstraintLayout O;
    public AdView P;
    public Landing Q;
    public final Handler R = new Handler(Looper.getMainLooper());

    public static void O(Landing landing, boolean z10, String str, String str2, String str3, final String str4, final String str5, String str6) {
        Objects.requireNonNull(landing);
        try {
            if (!landing.f387v.f1702b.b(g.c.STARTED)) {
                return;
            }
            final Dialog dialog = new Dialog(landing);
            dialog.setContentView(R.layout.update_dialog);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            TextView textView = (TextView) dialog.findViewById(R.id.dialogTitle);
            TextView textView2 = (TextView) dialog.findViewById(R.id.contentMsg);
            Button button = (Button) dialog.findViewById(R.id.dialogBtn);
            ImageView imageView = (ImageView) dialog.findViewById(R.id.imageView);
            if (str6 != null) {
                t d5 = t.d();
                Objects.requireNonNull(d5);
                if (str6.trim().length() != 0) {
                    new x(d5, Uri.parse(str6)).a(imageView, null);
                    imageView.setVisibility(0);
                } else {
                    throw new IllegalArgumentException("Path must not be empty.");
                }
            }
            if (str2 != null && !z10) {
                textView.setText(str2);
            }
            if (str3 != null && !z10) {
                button.setText(str3);
            }
            if (str != null) {
                textView2.setText(str);
            }
            button.setOnClickListener(!z10 ? new View.OnClickListener() { // from class: f8.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Landing landing2 = Landing.this;
                    String str7 = str4;
                    String str8 = str5;
                    Dialog dialog2 = dialog;
                    int i10 = Landing.S;
                    Objects.requireNonNull(landing2);
                    if (str7 != null) {
                        landing2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str7)));
                    }
                    landing2.P(str8);
                    dialog2.dismiss();
                }
            } : new View.OnClickListener() { // from class: f8.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Landing landing2 = Landing.this;
                    String str7 = str5;
                    Dialog dialog2 = dialog;
                    int i10 = Landing.S;
                    String packageName = landing2.getPackageName();
                    try {
                        landing2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                    } catch (ActivityNotFoundException unused) {
                        landing2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                    }
                    landing2.P(str7);
                    dialog2.dismiss();
                }
            });
            dialog.findViewById(R.id.closeImgView).setOnClickListener(new View.OnClickListener() { // from class: f8.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Dialog dialog2 = dialog;
                    int i10 = Landing.S;
                    dialog2.dismiss();
                }
            });
            dialog.show();
        } catch (Exception unused) {
        }
    }

    public final void P(String str) {
        getSharedPreferences("prefs", 0).edit().putString("landing_msg_id", str).apply();
    }

    public void bandwidthUsage(View view) {
        startActivity(new Intent(this, BandwidthUsage.class));
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

    public void networkDevices(View view) {
        startActivity(new Intent(this, NetworkDevices.class));
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_landing);
        this.Q = this;
        AdView adView = (AdView) findViewById(R.id.landingAdView);
        this.P = adView;
        if (!b.l(this, adView, this.R)) {
            this.P.a(new d(new d.a()));
            AdView adView2 = this.P;
            adView2.setAdListener(new c(this, adView2));
        } else {
            findViewById(R.id.whatsAppLayout).setVisibility(0);
        }
        new p0(this, this);
        new q0(this);
        ArrayList i10 = b.i((ViewGroup) findViewById(R.id.landingCardsLayout), ImageView.class);
        for (int i11 = 0; i11 < i10.size(); i11++) {
            b.r((View) i10.get(i11), 1.05f, 1200);
        }
        StringBuilder c10 = androidx.activity.result.a.c("v");
        c10.append(b.h(this));
        ((TextView) findViewById(R.id.versionLabel)).setText(c10.toString());
        this.M = (CardView) findViewById(R.id.subCardView);
        TextView textView = (TextView) findViewById(R.id.welcomeMsg);
        this.N = textView;
        boolean z10 = true;
        textView.setSelected(true);
        this.O = (ConstraintLayout) findViewById(R.id.premiumFlag);
        if (!b.o(this, "com.dimonvideo.luckypatcher") && !b.o(this, "com.chelpus.lackypatch") && !b.o(this, "com.android.vending.billing.InAppBillingService.COIN") && !b.o(this, "com.android.vending.billing.InAppBillingService.CRAC") && !b.o(this, "com.android.vending.billing.InAppBillingService.LOCK")) {
            z10 = b.o(this, "com.android.vending.billing.InAppBillingService.LACK");
        }
        if (!z10 || !this.f387v.f1702b.b(g.c.STARTED)) {
            return;
        }
        d.a aVar = new d.a(this);
        aVar.f502a.f478f = getString(R.string.luckyPatcherNote);
        aVar.c(getString(R.string.okTamam), j0.f4624s);
        aVar.f502a.f483k = k0.f4628s;
        aVar.d();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
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

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            if (((App) getApplication()).f3512u) {
                this.R.post(new q(this, 3));
            } else {
                this.R.post(new o0(this, 0));
            }
        } catch (Exception unused) {
            q8.a.d(this, null);
            ((App) getApplication()).a(false);
        }
    }

    @Override // e.e, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
    }

    public void pingTest(View view) {
        startActivity(new Intent(this, PingTest.class));
    }

    public void routerPage(View view) {
        startActivity(new Intent(this, RouterPage.class));
    }

    public void routerSettings(View view) {
        String charSequence = this.N.getText().toString();
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("welcomeMsg", charSequence);
        startActivity(intent);
    }

    public void speedTest(View view) {
        startActivity(new Intent(this, SpeedTest.class));
    }

    public void startSubscription(View view) {
        startActivity(new Intent(this, StorePurchase.class));
    }

    public void whatsApp(View view) {
        b.s(this);
    }

    public void youtube(View view) {
        b.t(this);
    }
}
