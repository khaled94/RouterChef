package com.raouf.routerchef;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.LineDetails;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.LineInfo;
import e9.f;
import f8.s0;
import g8.c;
import i8.g;
import i8.m;
import i8.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o8.a;
import p9.d;
import s8.b;
import x7.h;

/* loaded from: classes.dex */
public class LineDetails extends g {
    public ArrayList<b> X;
    public p Y;
    public Button Z;

    /* renamed from: a0 */
    public RatingBar f3550a0;

    /* renamed from: b0 */
    public a f3551b0;

    /* renamed from: c0 */
    public RecyclerView f3552c0;

    /* renamed from: d0 */
    public String f3553d0;

    /* renamed from: e0 */
    public String f3554e0;

    /* renamed from: f0 */
    public TextView f3555f0;

    /* loaded from: classes.dex */
    public class a extends c {
        public a(Context context, ArrayList arrayList) {
            super(context, arrayList, R.layout.line_info_row);
        }

        @Override // g8.c
        public final void h(Context context, b bVar) {
            Intent intent = new Intent(context, LineItemDetails.class);
            intent.putExtra("itemInfo", bVar);
            context.startActivity(intent);
        }
    }

    @Override // i8.g
    public final void P() {
        this.O.post(new Runnable() { // from class: g1.u
            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        w wVar = (w) this;
                        f.e(wVar, "this$0");
                        wVar.f4860s.a();
                        return;
                    default:
                        LineDetails lineDetails = (LineDetails) this;
                        lineDetails.Z.setEnabled(true);
                        lineDetails.Y.c(lineDetails.getString(R.string.loading));
                        lineDetails.Y.b();
                        m.e(lineDetails.P);
                        return;
                }
            }
        });
    }

    public final void Q() {
        this.Z.setEnabled(false);
        this.Y.d();
        m.e(this.P);
        m mVar = new m(this, this.f3554e0);
        this.P = mVar;
        mVar.c(this.f3553d0);
    }

    public void calculateLineDetails(View view) {
        Q();
    }

    @JavascriptInterface
    public void callbackHandle(String str) {
        int i10;
        Log.i("ASYNC MSG ::::::: ", str);
        final LineInfo lineInfo = (LineInfo) new h().b(str, LineInfo.class);
        String str2 = lineInfo.result;
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
            case -724193048:
                if (str2.equals("showing_info")) {
                    c10 = 2;
                    break;
                }
                break;
            case -93103704:
                if (str2.equals("null_dsl_info")) {
                    c10 = 3;
                    break;
                }
                break;
            case 354002416:
                if (str2.equals("dsl_info")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = R.string.mayLogin;
                O(getString(i10));
                return;
            case 1:
                i10 = R.string.needLogin;
                O(getString(i10));
                return;
            case 2:
                this.Y.c(getString(R.string.loadingInfo));
                return;
            case 3:
                this.O.post(new s0(this, 0));
                P();
                return;
            case 4:
                this.O.post(new Runnable() { // from class: f8.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LineDetails lineDetails = LineDetails.this;
                        LineInfo lineInfo2 = lineInfo;
                        int i11 = 0;
                        lineDetails.f3552c0.setVisibility(0);
                        lineDetails.f3555f0.setVisibility(8);
                        lineDetails.X.clear();
                        d4.p pVar = new d4.p(lineDetails, lineInfo2, r8.b.n(System.currentTimeMillis()));
                        ArrayList<b> arrayList = (ArrayList) pVar.f3903a;
                        lineDetails.X = arrayList;
                        LineDetails.a aVar = lineDetails.f3551b0;
                        aVar.f4900c = arrayList;
                        aVar.d();
                        RatingBar ratingBar = lineDetails.f3550a0;
                        Iterator it = ((ArrayList) pVar.f3903a).iterator();
                        float f10 = 0.0f;
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            if (bVar.f18377z) {
                                f10 += bVar.f18376x;
                                i11++;
                            }
                        }
                        ratingBar.setRating(f10 / i11);
                        p9.c cVar = new p9.c(lineDetails);
                        cVar.f17000a.b(new d(((a) lineDetails.T.f16191s).f16791d, System.currentTimeMillis(), lineInfo2));
                    }
                });
                P();
                return;
            default:
                this.Y.c(lineInfo.result);
                return;
        }
    }

    @Override // i8.g, androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_line_details);
        AdView adView = (AdView) findViewById(R.id.lineDetailsAdView);
        this.R = adView;
        if (!r8.b.l(this, adView, this.O)) {
            this.R.a(this.Q);
            AdView adView2 = this.R;
            adView2.setAdListener(new h8.c(this, adView2));
        }
        this.f3553d0 = this.U + this.S.f16795h;
        this.f3554e0 = this.S.r();
        this.f3552c0 = (RecyclerView) findViewById(R.id.lineInfoRV);
        this.f3555f0 = (TextView) findViewById(R.id.noDslSignalTextView);
        this.f3550a0 = (RatingBar) findViewById(R.id.overallRatingBar);
        ArrayList<b> arrayList = new ArrayList<>();
        this.X = arrayList;
        a aVar = new a(this, arrayList);
        this.f3551b0 = aVar;
        this.f3552c0.setAdapter(aVar);
        this.f3552c0.setLayoutManager(new LinearLayoutManager(1));
        this.Y = new p(this);
        this.Z = (Button) findViewById(R.id.calcBtn);
        Q();
        getString(R.string.modulationType);
        getString(R.string.lineSpeed);
        getString(R.string.maxSpeed);
        getString(R.string.noise);
        getString(R.string.dataPath);
        getString(R.string.interleavedDepth);
        getString(R.string.interleaveDelay);
        getString(R.string.crcErrors);
        getString(R.string.fecErrors);
        getString(R.string.upTime);
    }
}
