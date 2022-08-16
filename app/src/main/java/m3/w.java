package m3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import k4.a;
import l3.s;
import m4.d40;
import m4.es;
import m4.jo;
import m4.js0;
import m4.ym;

/* loaded from: classes.dex */
public final class w extends d40 {

    /* renamed from: s */
    public final AdOverlayInfoParcel f5985s;

    /* renamed from: t */
    public final Activity f5986t;

    /* renamed from: u */
    public boolean f5987u = false;

    /* renamed from: v */
    public boolean f5988v = false;

    public w(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5985s = adOverlayInfoParcel;
        this.f5986t = activity;
    }

    @Override // m4.e40
    public final boolean B() {
        return false;
    }

    @Override // m4.e40
    public final void C1(Bundle bundle) {
        p pVar;
        if (((Boolean) jo.f10145d.f10148c.a(es.Q5)).booleanValue()) {
            this.f5986t.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5985s;
        if (adOverlayInfoParcel != null && !z10) {
            if (bundle == null) {
                ym ymVar = adOverlayInfoParcel.f2907t;
                if (ymVar != null) {
                    ymVar.N();
                }
                js0 js0Var = this.f5985s.Q;
                if (js0Var != null) {
                    js0Var.B0();
                }
                if (this.f5986t.getIntent() != null && this.f5986t.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (pVar = this.f5985s.f2908u) != null) {
                    pVar.a();
                }
            }
            a aVar = s.B.f5787a;
            Activity activity = this.f5986t;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5985s;
            f fVar = adOverlayInfoParcel2.f2906s;
            if (a.f(activity, fVar, adOverlayInfoParcel2.A, fVar.A)) {
                return;
            }
        }
        this.f5986t.finish();
    }

    @Override // m4.e40
    public final void Y2(int i10, int i11, Intent intent) {
    }

    @Override // m4.e40
    public final void Z2(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5987u);
    }

    public final synchronized void a() {
        if (!this.f5988v) {
            p pVar = this.f5985s.f2908u;
            if (pVar != null) {
                pVar.w(4);
            }
            this.f5988v = true;
        }
    }

    @Override // m4.e40
    public final void f() {
    }

    @Override // m4.e40
    public final void j() {
        p pVar = this.f5985s.f2908u;
        if (pVar != null) {
            pVar.J3();
        }
        if (this.f5986t.isFinishing()) {
            a();
        }
    }

    @Override // m4.e40
    public final void k() {
    }

    @Override // m4.e40
    public final void l() {
        if (this.f5986t.isFinishing()) {
            a();
        }
    }

    @Override // m4.e40
    public final void m() {
        if (this.f5987u) {
            this.f5986t.finish();
            return;
        }
        this.f5987u = true;
        p pVar = this.f5985s.f2908u;
        if (pVar == null) {
            return;
        }
        pVar.v2();
    }

    @Override // m4.e40
    public final void m0(a aVar) {
    }

    @Override // m4.e40
    public final void p() {
        if (this.f5986t.isFinishing()) {
            a();
        }
    }

    @Override // m4.e40
    public final void q() {
    }

    @Override // m4.e40
    public final void r() {
        p pVar = this.f5985s.f2908u;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // m4.e40
    public final void x() {
    }
}
