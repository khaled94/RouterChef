package com.raouf.routerchef;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import e.e;
import g8.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Onboarding extends e {
    public ViewPager L;
    public Button M;
    public TextView[] N;
    public LinearLayout O;
    public int P = 4;
    public a Q = new a();

    /* loaded from: classes.dex */
    public class a implements ViewPager.h {
        public a() {
            Onboarding.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void c(int i10) {
            Button button;
            int i11;
            Onboarding.this.Q(i10);
            if (i10 > 0) {
                button = Onboarding.this.M;
                i11 = 0;
            } else {
                button = Onboarding.this.M;
                i11 = 4;
            }
            button.setVisibility(i11);
        }
    }

    public final void O() {
        SharedPreferences.Editor edit = getSharedPreferences("prefs", 0).edit();
        edit.putBoolean("onboarding", false);
        edit.apply();
        startActivity(getSharedPreferences("prefs", 0).getBoolean("firstTime", true) ? new Intent(this, SettingsActivity.class) : new Intent(this, Login.class));
        finish();
    }

    public final int P(int i10) {
        return this.L.getCurrentItem() + i10;
    }

    public final void Q(int i10) {
        this.N = new TextView[this.P];
        this.O.removeAllViews();
        int i11 = 0;
        while (true) {
            TextView[] textViewArr = this.N;
            if (i11 >= textViewArr.length) {
                textViewArr[i10].setTextColor(getResources().getColor(R.color.primary_color, getApplicationContext().getTheme()));
                return;
            }
            textViewArr[i11] = new TextView(this);
            this.N[i11].setText(Html.fromHtml("&#8226"));
            this.N[i11].setTextSize(35.0f);
            this.N[i11].setTextColor(getResources().getColor(R.color.secondary_color_variant, getApplicationContext().getTheme()));
            this.O.addView(this.N[i11]);
            i11++;
        }
    }

    public void back(View view) {
        if (P(0) > 0) {
            this.L.w(P(-1));
        }
    }

    public void next(View view) {
        if (P(0) < this.P - 1) {
            this.L.w(P(1));
        } else {
            O();
        }
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_onboarding);
        Button button = (Button) findViewById(R.id.nextBtn);
        this.M = (Button) findViewById(R.id.backBtn);
        Button button2 = (Button) findViewById(R.id.skipBtn);
        this.L = (ViewPager) findViewById(R.id.viewPager);
        this.O = (LinearLayout) findViewById(R.id.indicator_layout);
        this.L.setAdapter(new l(this));
        Q(0);
        ViewPager viewPager = this.L;
        a aVar = this.Q;
        if (viewPager.f2246l0 == null) {
            viewPager.f2246l0 = new ArrayList();
        }
        viewPager.f2246l0.add(aVar);
    }

    public void skip(View view) {
        O();
    }
}
