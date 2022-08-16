package com.raouf.routerchef;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.PingTest;
import com.raouf.routerchef.R;
import e.e;
import f3.d;
import g8.g;
import h8.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r8.b;
import s8.d;

/* loaded from: classes.dex */
public class PingTest extends e {
    public Button L;
    public RecyclerView M;
    public a N;
    public TextView O;
    public Dialog P;
    public Dialog Q;
    public AdView R;
    public ArrayList<d> S = new ArrayList<>();
    public ArrayList<ScheduledFuture<?>> T = new ArrayList<>();
    public ArrayList<String> U = new ArrayList<>(Arrays.asList("www.pubg.com", "www.google.com", "8.8.8.8"));
    public final Handler V = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList) {
            super(context, arrayList);
            PingTest.this = r1;
        }
    }

    public final void O() {
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            this.T.get(i10).cancel(true);
        }
        this.T.clear();
    }

    public final void P(ArrayList<String> arrayList) {
        this.U = arrayList;
        this.S.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.S.add(new d(arrayList.get(i10)));
        }
    }

    public final void Q(ArrayList<String> arrayList) {
        SharedPreferences.Editor edit = getSharedPreferences("PING_TEST_SERVERS", 0).edit();
        edit.putString("PING_TEST_SERVERS", b.d(arrayList));
        edit.apply();
    }

    public final void R() {
        O();
        P(this.U);
        if (this.U.isEmpty()) {
            this.O.setVisibility(0);
            return;
        }
        this.O.setVisibility(8);
        for (final int i10 = 0; i10 < this.S.size(); i10++) {
            this.T.add(Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: f8.z1
                @Override // java.lang.Runnable
                public final void run() {
                    final PingTest pingTest = PingTest.this;
                    final int i11 = i10;
                    String e10 = b.e(pingTest.S.get(i11).f18386a);
                    int parseInt = e10.equals("--") ? -1 : Integer.parseInt(e10);
                    if (parseInt > -1) {
                        d dVar = pingTest.S.get(i11);
                        dVar.f18387b = parseInt;
                        int i12 = dVar.f18390e;
                        if (i12 == 0) {
                            dVar.f18388c = parseInt;
                            dVar.f18390e = i12 + 1;
                        } else {
                            dVar.f18390e = i12 + 1;
                            dVar.f18388c = (dVar.f18388c + parseInt) / 2;
                        }
                    } else {
                        pingTest.S.get(i11).f18389d++;
                    }
                    if (pingTest.T.size() > 0) {
                        pingTest.V.post(new Runnable() { // from class: f8.y1
                            @Override // java.lang.Runnable
                            public final void run() {
                                PingTest pingTest2 = PingTest.this;
                                pingTest2.N.f1943a.c(i11, 1, null);
                            }
                        });
                    }
                }
            }, 0L, 1L, TimeUnit.SECONDS));
        }
    }

    public void addServer(View view) {
        this.P.setContentView(R.layout.add_server_dialog);
        this.P.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.P.findViewById(R.id.closeImgView).setOnClickListener(new View.OnClickListener() { // from class: f8.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PingTest.this.P.dismiss();
            }
        });
        this.P.findViewById(R.id.addServerDialogBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i10;
                boolean z10;
                PingTest pingTest = PingTest.this;
                String obj = ((EditText) pingTest.P.findViewById(R.id.serverUrlInput)).getText().toString();
                if (obj.length() > 0) {
                    if (pingTest.U.contains(obj)) {
                        z10 = false;
                    } else {
                        pingTest.U.add(obj);
                        pingTest.Q(pingTest.U);
                        pingTest.N.f1943a.d(pingTest.U.size() - 1, 1);
                        pingTest.R();
                        z10 = true;
                    }
                    if (z10) {
                        pingTest.P.dismiss();
                        return;
                    }
                    i10 = R.string.duplicatePingServer;
                } else {
                    i10 = R.string.emptyPingServers;
                }
                b.q(pingTest, pingTest.getString(i10));
            }
        });
        this.P.show();
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ping_test);
        AdView adView = (AdView) findViewById(R.id.pingTestAdView);
        this.R = adView;
        if (!b.l(this, adView, this.V)) {
            this.R.a(new f3.d(new d.a()));
            AdView adView2 = this.R;
            adView2.setAdListener(new c(this, adView2));
        }
        this.L = (Button) findViewById(R.id.togglePingTestBtn);
        this.O = (TextView) findViewById(R.id.emptyTextView);
        String string = getSharedPreferences("PING_TEST_SERVERS", 0).getString("PING_TEST_SERVERS", b.d(this.U));
        P(string.equals("") ? new ArrayList<>() : new ArrayList<>(Arrays.asList(string.split(","))));
        this.P = new Dialog(this);
        this.Q = new Dialog(this);
        this.M = (RecyclerView) findViewById(R.id.serversRV);
        a aVar = new a(this, this.S);
        this.N = aVar;
        this.M.setAdapter(aVar);
        this.M.setLayoutManager(new LinearLayoutManager(1));
        R();
    }

    public void togglePingTest(View view) {
        Button button;
        int i10;
        if (this.T.size() > 0) {
            O();
            P(this.U);
            this.N.d();
            button = this.L;
            i10 = R.string.startPingTest;
        } else {
            R();
            button = this.L;
            i10 = R.string.stopPingTest;
        }
        button.setText(getString(i10));
    }
}
