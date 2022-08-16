package com.raouf.routerchef;

import android.app.AppOpsManager;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.usage.NetworkStatsManager;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.BandwidthUsage;
import e.e;
import f3.d;
import f8.v;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import r8.b;
import s8.c;

/* loaded from: classes.dex */
public class BandwidthUsage extends e {

    /* renamed from: h0 */
    public static final /* synthetic */ int f3514h0 = 0;
    public NetworkStatsManager L;
    public ToggleButton M;
    public ToggleButton N;
    public Button O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView U;
    public TextView V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public TextView Z;

    /* renamed from: a0 */
    public TextView f3515a0;

    /* renamed from: b0 */
    public TextView f3516b0;

    /* renamed from: c0 */
    public ConstraintLayout f3517c0;

    /* renamed from: d0 */
    public Dialog f3518d0;

    /* renamed from: e0 */
    public DatePickerDialog f3519e0;

    /* renamed from: f0 */
    public AdView f3520f0;

    /* renamed from: g0 */
    public final Handler f3521g0 = new Handler(Looper.getMainLooper());

    public final void O(c cVar) {
        this.Q.setVisibility(0);
        this.S.setVisibility(0);
        this.U.setVisibility(0);
        this.P.setText(String.valueOf(cVar.f18378a));
        this.Q.setText(String.valueOf(cVar.f18381d));
        this.R.setText(String.valueOf(cVar.f18379b));
        this.S.setText(String.valueOf(cVar.f18382e));
        this.T.setText(String.valueOf(cVar.f18380c));
        this.U.setText(String.valueOf(cVar.f18383f));
    }

    public final void P() {
        if (((AppOpsManager) getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), getPackageName()) == 0) {
            if (this.M.isChecked()) {
                this.f3517c0.setVisibility(0);
                this.f3516b0.setText(getString(R.string.todayUsage));
                O(b.g(this, this.L, 1, 0L));
                int dayOfMonth = this.f3519e0.getDatePicker().getDayOfMonth();
                int month = this.f3519e0.getDatePicker().getMonth();
                int year = this.f3519e0.getDatePicker().getYear();
                NetworkStatsManager networkStatsManager = this.L;
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                calendar.set(year, month, dayOfMonth);
                c g10 = b.g(this, networkStatsManager, 1, calendar.getTimeInMillis());
                this.W.setVisibility(0);
                this.Y.setVisibility(0);
                this.f3515a0.setVisibility(0);
                this.V.setText(String.valueOf(g10.f18378a));
                this.W.setText(String.valueOf(g10.f18381d));
                this.X.setText(String.valueOf(g10.f18379b));
                this.Y.setText(String.valueOf(g10.f18382e));
                this.Z.setText(String.valueOf(g10.f18380c));
                this.f3515a0.setText(String.valueOf(g10.f18383f));
                return;
            }
            this.f3517c0.setVisibility(8);
            this.f3516b0.setText(getString(R.string.usageFromLastBootUp, new SimpleDateFormat("dd/MM/yyyy | hh:mm").format(new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime()))));
            O(b.g(this, this.L, 0, 0L));
            return;
        }
        this.f3518d0.setContentView(R.layout.bandwidth_permission_dialog);
        this.f3518d0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f3518d0.findViewById(R.id.bwContinueBtn).setOnClickListener(new v(this, 0));
        this.f3518d0.findViewById(R.id.bwBackBtn).setOnClickListener(new View.OnClickListener() { // from class: f8.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandwidthUsage bandwidthUsage = BandwidthUsage.this;
                bandwidthUsage.f3518d0.dismiss();
                bandwidthUsage.finish();
            }
        });
        this.f3518d0.show();
    }

    public final void Q(ToggleButton toggleButton, ToggleButton toggleButton2) {
        if (toggleButton.isChecked()) {
            toggleButton2.setChecked(false);
        } else if (toggleButton2.isChecked()) {
        } else {
            toggleButton.setChecked(true);
        }
    }

    public void dataBtnToggled(View view) {
        Q(this.N, this.M);
        P();
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bandwidth_usage);
        AdView adView = (AdView) findViewById(R.id.bandwidthAdView);
        this.f3520f0 = adView;
        if (!b.l(this, adView, this.f3521g0)) {
            this.f3520f0.a(new d(new d.a()));
            AdView adView2 = this.f3520f0;
            adView2.setAdListener(new h8.c(this, adView2));
        }
        this.M = (ToggleButton) findViewById(R.id.wifiToggleBtn);
        this.N = (ToggleButton) findViewById(R.id.dataToggleBtn);
        this.O = (Button) findViewById(R.id.datePickerBtn);
        this.f3517c0 = (ConstraintLayout) findViewById(R.id.dateUsageLayout);
        this.f3516b0 = (TextView) findViewById(R.id.todayUsageLabel);
        this.R = (TextView) findViewById(R.id.todayDownloadUsageValue);
        this.S = (TextView) findViewById(R.id.todayDownloadUsageUnit);
        this.P = (TextView) findViewById(R.id.todayUploadUsageValue);
        this.Q = (TextView) findViewById(R.id.todayUploadUsageUnit);
        this.T = (TextView) findViewById(R.id.todayTotalUsageValue);
        this.U = (TextView) findViewById(R.id.todayTotalUsageUnit);
        this.V = (TextView) findViewById(R.id.dateUploadUsageValue);
        this.W = (TextView) findViewById(R.id.dateUploadUsageUnit);
        this.X = (TextView) findViewById(R.id.dateDownloadUsageValue);
        this.Y = (TextView) findViewById(R.id.dateDownloadUsageUnit);
        this.Z = (TextView) findViewById(R.id.dateTotalUsageValue);
        this.f3515a0 = (TextView) findViewById(R.id.dateTotalUsageUnit);
        this.L = (NetworkStatsManager) getApplicationContext().getSystemService("netstats");
        this.f3518d0 = new Dialog(this);
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: f8.u
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                BandwidthUsage bandwidthUsage = BandwidthUsage.this;
                int i13 = BandwidthUsage.f3514h0;
                SharedPreferences.Editor edit = bandwidthUsage.getSharedPreferences("RENEWAL_DATE", 0).edit();
                edit.putString("RENEWAL_DATE", i12 + "/" + i11 + "/" + i10);
                edit.apply();
                bandwidthUsage.O.setText(b.f(i12, i11, i10));
                bandwidthUsage.P();
            }
        };
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(3, -1);
        int i10 = calendar.get(1);
        int i11 = calendar.get(2);
        int i12 = calendar.get(5);
        SharedPreferences sharedPreferences = getSharedPreferences("RENEWAL_DATE", 0);
        String[] split = sharedPreferences.getString("RENEWAL_DATE", i12 + "/" + i11 + "/" + i10).split("/");
        int[] iArr = new int[3];
        for (int i13 = 0; i13 < 3; i13++) {
            iArr[i13] = Integer.parseInt(split[i13]);
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, 2131951892, onDateSetListener, iArr[2], iArr[1], iArr[0]);
        this.f3519e0 = datePickerDialog;
        datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
        this.O.setText(b.f(iArr[0], iArr[1], iArr[2]));
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        P();
    }

    public void openDatePicker(View view) {
        this.f3519e0.show();
    }

    public void wifiToggled(View view) {
        Q(this.M, this.N);
        P();
    }
}
