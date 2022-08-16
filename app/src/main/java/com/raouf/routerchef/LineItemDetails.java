package com.raouf.routerchef;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.resModels.LineInfo;
import d4.p;
import e.e;
import f3.d;
import f8.u0;
import g8.c;
import h6.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.h;
import s8.b;

/* loaded from: classes.dex */
public class LineItemDetails extends e {
    @SuppressLint({"StaticFieldLeak"})
    public static h8.e R;
    public AdView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public RecyclerView P;
    public final Handler Q = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a extends c {
        public a(Context context, ArrayList arrayList) {
            super(context, arrayList);
        }

        @Override // g8.c
        public final void h(Context context, b bVar) {
        }
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_line_item_details);
        AdView adView = (AdView) findViewById(R.id.lineItemDetailsAdView);
        this.L = adView;
        if (!r8.b.l(this, adView, this.Q)) {
            this.L.a(new d(new d.a()));
        }
        d dVar = new d(new d.a());
        if (!r8.b.l(this, this.L, this.Q)) {
            this.L.a(dVar);
            AdView adView2 = this.L;
            adView2.setAdListener(new h8.c(this, adView2));
            if (R == null) {
                R = new h8.e(this, "ca-app-pub-6362221127909922/5531450120", dVar, false, f.f5127t);
            }
        }
        b bVar = (b) getIntent().getSerializableExtra("itemInfo");
        this.M = (TextView) findViewById(R.id.lineItemTitle);
        this.N = (TextView) findViewById(R.id.lineItemValue);
        this.O = (TextView) findViewById(R.id.LineItemDesc);
        this.P = (RecyclerView) findViewById(R.id.valueHistoryRV);
        this.M.setText(bVar.f18372t);
        this.N.setText(bVar.f18373u);
        this.O.setText(bVar.f18374v);
        if (Build.VERSION.SDK_INT >= 29) {
            this.O.setJustificationMode(1);
        }
        String str = ((o8.a) ((App) getApplication()).f3511t.f16191s).f16791d;
        int i10 = bVar.f18371s;
        ArrayList arrayList = new ArrayList();
        List<p9.d> a10 = new p9.c(this).f17000a.a(str);
        ArrayList arrayList2 = new ArrayList();
        for (p9.d dVar2 : a10) {
            LineInfo lineInfo = new LineInfo();
            switch (h.b(i10)) {
                case 2:
                    lineInfo.modType = dVar2.f17004d;
                    break;
                case 3:
                    lineInfo.lineRate = dVar2.f17005e;
                    break;
                case 4:
                    lineInfo.maxRate = dVar2.f17006f;
                    break;
                case 5:
                    lineInfo.noise = dVar2.f17007g;
                    break;
                case 6:
                    lineInfo.chanType = dVar2.f17008h;
                    break;
                case 7:
                    lineInfo.depth = dVar2.f17009i;
                    break;
                case 8:
                    lineInfo.delay = dVar2.f17010j;
                    break;
                case 9:
                    lineInfo.crc = dVar2.f17011k;
                    break;
                case 10:
                    lineInfo.fec = dVar2.f17012l;
                    break;
                case 11:
                    lineInfo.upTime = dVar2.f17013m;
                    break;
                default:
                    lineInfo = null;
                    break;
            }
            if (lineInfo != null) {
                arrayList2.add(new s8.a(lineInfo, dVar2.f17003c));
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            s8.a aVar = (s8.a) it.next();
            arrayList.add((b) ((ArrayList) new p(this, aVar.f18369a, aVar.f18370b).f3903a).get(0));
        }
        this.P.setAdapter(new a(this, arrayList));
        this.P.setLayoutManager(new LinearLayoutManager(1));
        this.Q.postDelayed(u0.f4695s, 2000L);
    }
}
