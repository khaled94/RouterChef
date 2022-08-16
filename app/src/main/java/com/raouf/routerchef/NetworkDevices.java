package com.raouf.routerchef;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.NetworkDevices;
import com.raouf.routerchef.R;
import e.e;
import f3.d;
import f8.g0;
import f8.h;
import f8.h0;
import f8.i0;
import f8.i1;
import f8.p1;
import g1.m;
import g1.o;
import i8.f;
import j8.c;
import j8.d;
import java.util.ArrayList;
import java.util.Objects;
import l8.b;
import z3.n;

/* loaded from: classes.dex */
public class NetworkDevices extends e implements d {
    public static final /* synthetic */ int V = 0;
    public RecyclerView L;
    public a M;
    public Button N;
    public TextView O;
    public AdView P;
    public ProgressBar Q;
    public NetworkDevices R;
    public n S;
    public final Handler T = new Handler(Looper.getMainLooper());
    public h8.e U;

    /* loaded from: classes.dex */
    public class a extends g8.e {

        /* renamed from: com.raouf.routerchef.NetworkDevices$a$a */
        /* loaded from: classes.dex */
        public class C0053a extends f {

            /* renamed from: d */
            public final /* synthetic */ c f3573d;

            /* renamed from: e */
            public final /* synthetic */ int f3574e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0053a(Context context, c cVar, c cVar2, int i10) {
                super(context, cVar);
                a.this = r1;
                this.f3573d = cVar2;
                this.f3574e = i10;
            }

            @Override // i8.f
            public final void a(l8.a aVar) {
                ((b) NetworkDevices.this.S.f20958b).c(aVar);
                c cVar = this.f3573d;
                cVar.f5504e = null;
                NetworkDevices.this.M.j(cVar, this.f3574e);
            }

            @Override // i8.f
            public final void b(l8.a aVar) {
                n nVar = NetworkDevices.this.S;
                Objects.requireNonNull(nVar);
                aVar.f5820a = nVar.a(aVar.f5820a);
                ((b) nVar.f20958b).a(aVar);
                c cVar = this.f3573d;
                cVar.f5504e = aVar.f5821b;
                NetworkDevices.this.M.j(cVar, this.f3574e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList) {
            super(context, arrayList);
            NetworkDevices.this = r1;
        }

        @Override // g8.e
        public final void h(c cVar, int i10) {
            new C0053a(NetworkDevices.this.R, cVar, cVar, i10).f5280a.show();
        }
    }

    @Override // j8.d
    public final void A(final String str) {
        this.T.post(new Runnable() { // from class: f8.l1
            @Override // java.lang.Runnable
            public final void run() {
                NetworkDevices networkDevices = NetworkDevices.this;
                r8.b.q(networkDevices.R, str);
            }
        });
    }

    @Override // j8.d
    public final void C() {
    }

    public final void O() {
        this.O.setText(R.string.wifiDisconnectedError);
        this.O.setVisibility(0);
        r8.b.q(this, getString(R.string.wifiDisconnectedError));
        P();
    }

    public final void P() {
        this.T.post(new i1(this, 0));
    }

    public final void Q() {
        if (((ConnectivityManager) getSystemService("connectivity")).getNetworkInfo(1).isConnected()) {
            this.O.setVisibility(8);
            this.Q.setVisibility(0);
            this.N.setEnabled(false);
            this.N.setText(getString(R.string.scanning));
            a aVar = new a(this, new ArrayList());
            this.M = aVar;
            this.L.setAdapter(aVar);
            this.L.setLayoutManager(new LinearLayoutManager(1));
            j8.b bVar = new j8.b(this, this);
            if (j8.b.c(this) != null) {
                String c10 = j8.b.c(this);
                AsyncTask.execute(new p1(bVar, c10.substring(0, c10.lastIndexOf(".") + 1), 1));
                return;
            }
        }
        O();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void R(ArrayList<c> arrayList) {
        this.T.post(new h(this, arrayList, 1));
    }

    @Override // j8.d
    public final void d(final c cVar, final int i10) {
        this.T.post(new Runnable() { // from class: f8.k1
            @Override // java.lang.Runnable
            public final void run() {
                NetworkDevices networkDevices = NetworkDevices.this;
                networkDevices.M.j(cVar, i10);
            }
        });
    }

    @Override // j8.d
    public final void f(ArrayList<c> arrayList) {
        P();
        R(arrayList);
        this.T.post(new m(this, 2));
        if (this.U != null) {
            this.T.postDelayed(new o(this, 2), 2000L);
        }
    }

    @Override // j8.d
    public final void i(ArrayList<c> arrayList) {
        R(arrayList);
    }

    @Override // j8.d
    public final void k(ArrayList<c> arrayList) {
        P();
        R(arrayList);
        this.T.post(new Runnable() { // from class: f8.j1
            @Override // java.lang.Runnable
            public final void run() {
                NetworkDevices networkDevices = NetworkDevices.this;
                r8.b.q(networkDevices.R, networkDevices.getString(R.string.scanDone));
            }
        });
        if (this.U != null) {
            this.T.postDelayed(new g0(this, 1), 2000L);
        }
    }

    @Override // j8.d
    public final void l(String str) {
        this.T.post(new h0(this, str, 1));
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_network_devices);
        AdView adView = (AdView) findViewById(R.id.networkDevicesAdView);
        this.P = adView;
        if (!r8.b.l(this, adView, this.T)) {
            this.P.a(new f3.d(new d.a()));
            AdView adView2 = this.P;
            adView2.setAdListener(new h8.c(this, adView2));
        }
        f3.d dVar = new f3.d(new d.a());
        if (!r8.b.l(this, this.P, this.T)) {
            this.P.a(dVar);
            this.U = new h8.e(this, "ca-app-pub-6362221127909922/5527694663", dVar, false, b3.o.f2533t);
        }
        this.R = this;
        this.N = (Button) findViewById(R.id.scanAgainBtn);
        this.O = (TextView) findViewById(R.id.errorMsg);
        this.L = (RecyclerView) findViewById(R.id.devicesRV);
        this.Q = (ProgressBar) findViewById(R.id.loadingBar);
        this.S = new n(this);
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
        this.T.post(new i0(this, str, 1));
    }
}
