package com.raouf.routerchef;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import e.e;
import f8.h2;
import f8.o2;
import q8.b;

/* loaded from: classes.dex */
public class StorePurchase extends e implements b {
    public static final /* synthetic */ int R = 0;
    public q8.e L;
    public RecyclerView M;
    public o2 N;
    public ProgressBar O;
    public TextView P;
    public final Handler Q = new Handler(Looper.getMainLooper());

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_store_purchase);
        this.M = (RecyclerView) findViewById(R.id.subPlansRV);
        this.O = (ProgressBar) findViewById(R.id.purchaseProgress);
        this.P = (TextView) findViewById(R.id.faildMsg);
        this.O.setVisibility(0);
        this.P.setVisibility(8);
        this.L = new q8.e(this, this);
    }

    @Override // e.e, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        q8.e eVar = this.L;
        eVar.f17159b.a(new h2(eVar));
    }
}
