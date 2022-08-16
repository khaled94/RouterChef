package com.raouf.routerchef;

import android.app.Application;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.AdView;
import f3.e;
import h8.h;
import java.util.Objects;
import k4.b;
import m4.c10;
import m4.es;
import m4.jo;
import m4.wq;
import m4.y00;
import m4.yq;
import m4.zf2;
import n3.g1;

/* loaded from: classes.dex */
public class App extends Application {

    /* renamed from: s */
    public h f3510s;

    /* renamed from: t */
    public zf2 f3511t;

    /* renamed from: u */
    public boolean f3512u;

    /* loaded from: classes.dex */
    public class a extends q8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            App.this = r1;
        }

        @Override // q8.a
        public final void c(boolean z10) {
            App.this.a(z10);
        }
    }

    public final void a(boolean z10) {
        this.f3512u = z10;
        Log.i("From APP Is Subscribed ::: ", String.valueOf(z10));
    }

    @Override // android.app.Application
    public final void onCreate() {
        new a(this).a();
        yq a10 = yq.a();
        synchronized (a10.f15882b) {
            if (!a10.f15884d && !a10.f15885e) {
                a10.f15884d = true;
                try {
                    if (y00.f15548b == null) {
                        y00.f15548b = new y00();
                    }
                    y00.f15548b.a(this, null);
                    a10.c(this);
                    a10.f15883c.o3(new c10());
                    a10.f15883c.i();
                    a10.f15883c.y0(null, new b(null));
                    Objects.requireNonNull(a10.f15886f);
                    Objects.requireNonNull(a10.f15886f);
                    es.c(this);
                    if (!((Boolean) jo.f10145d.f10148c.a(es.f8153n3)).booleanValue() && !a10.b().endsWith("0")) {
                        g1.g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                        a10.f15887g = new wq(a10, 0);
                    }
                } catch (RemoteException e10) {
                    g1.k("MobileAdsSettingManager initialization failed", e10);
                }
            }
        }
        this.f3510s = new h(new AdView(this), e.f4496l);
        this.f3511t = new zf2(this);
        super.onCreate();
    }
}
