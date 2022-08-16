package com.raouf.routerchef;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import e.e;

@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes.dex */
public class SplashScreen extends e {

    /* loaded from: classes.dex */
    public class a extends q8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            SplashScreen.this = r1;
        }

        @Override // q8.a
        public final void c(boolean z10) {
            SplashScreen splashScreen = SplashScreen.this;
            ((App) splashScreen.getApplication()).a(z10);
            splashScreen.startActivity(new Intent(splashScreen, Landing.class));
            splashScreen.finish();
        }
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash_screen);
        new a(this).a();
    }
}
