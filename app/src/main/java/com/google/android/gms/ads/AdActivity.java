package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import k4.b;
import m4.e40;
import m4.go;
import m4.io;
import m4.xn;
import n3.g1;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: s */
    public e40 f2904s;

    public final void a() {
        e40 e40Var = this.f2904s;
        if (e40Var != null) {
            try {
                e40Var.q();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @RecentlyNonNull Intent intent) {
        try {
            e40 e40Var = this.f2904s;
            if (e40Var != null) {
                e40Var.Y2(i10, i11, intent);
            }
        } catch (Exception e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            e40 e40Var = this.f2904s;
            if (e40Var != null) {
                if (!e40Var.B()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            e40 e40Var2 = this.f2904s;
            if (e40Var2 == null) {
                return;
            }
            e40Var2.f();
        } catch (RemoteException e11) {
            g1.l("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            e40 e40Var = this.f2904s;
            if (e40Var == null) {
                return;
            }
            e40Var.m0(new b(configuration));
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        go goVar = io.f9708f.f9710b;
        Objects.requireNonNull(goVar);
        xn xnVar = new xn(goVar, this);
        Intent intent = getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            g1.g("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        e40 d5 = xnVar.d(this, z10);
        this.f2904s = d5;
        if (d5 != null) {
            try {
                d5.C1(bundle);
                return;
            } catch (RemoteException e10) {
                e = e10;
            }
        } else {
            e = null;
        }
        g1.l("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            e40 e40Var = this.f2904s;
            if (e40Var != null) {
                e40Var.l();
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            e40 e40Var = this.f2904s;
            if (e40Var != null) {
                e40Var.j();
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            e40 e40Var = this.f2904s;
            if (e40Var == null) {
                return;
            }
            e40Var.k();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            e40 e40Var = this.f2904s;
            if (e40Var == null) {
                return;
            }
            e40Var.m();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            e40 e40Var = this.f2904s;
            if (e40Var != null) {
                e40Var.Z2(bundle);
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            e40 e40Var = this.f2904s;
            if (e40Var == null) {
                return;
            }
            e40Var.x();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            e40 e40Var = this.f2904s;
            if (e40Var != null) {
                e40Var.p();
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            e40 e40Var = this.f2904s;
            if (e40Var == null) {
                return;
            }
            e40Var.r();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
