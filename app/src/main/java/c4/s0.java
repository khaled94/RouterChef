package c4;

import a4.b;
import a4.e;
import a4.i;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import d4.u;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: s */
    public final q0 f2732s;

    /* renamed from: t */
    public final /* synthetic */ t0 f2733t;

    public s0(t0 t0Var, q0 q0Var) {
        this.f2733t = t0Var;
        this.f2732s = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f2733t.f2736t) {
            return;
        }
        b bVar = this.f2732s.f2726b;
        if (bVar.s()) {
            t0 t0Var = this.f2733t;
            g gVar = t0Var.f2943s;
            Activity a10 = t0Var.a();
            PendingIntent pendingIntent = bVar.f117u;
            Objects.requireNonNull(pendingIntent, "null reference");
            gVar.d(GoogleApiActivity.a(a10, pendingIntent, this.f2732s.f2725a, false), 1);
            return;
        }
        t0 t0Var2 = this.f2733t;
        if (t0Var2.f2739w.b(t0Var2.a(), bVar.f116t, null) != null) {
            t0 t0Var3 = this.f2733t;
            e eVar = t0Var3.f2739w;
            Activity a11 = t0Var3.a();
            t0 t0Var4 = this.f2733t;
            eVar.i(a11, t0Var4.f2943s, bVar.f116t, t0Var4);
        } else if (bVar.f116t == 18) {
            t0 t0Var5 = this.f2733t;
            e eVar2 = t0Var5.f2739w;
            Activity a12 = t0Var5.a();
            t0 t0Var6 = this.f2733t;
            Objects.requireNonNull(eVar2);
            ProgressBar progressBar = new ProgressBar(a12, null, 16842874);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(a12);
            builder.setView(progressBar);
            builder.setMessage(u.b(a12, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            eVar2.g(a12, create, "GooglePlayServicesUpdatingDialog", t0Var6);
            t0 t0Var7 = this.f2733t;
            e eVar3 = t0Var7.f2739w;
            Context applicationContext = t0Var7.a().getApplicationContext();
            r0 r0Var = new r0(this, create);
            Objects.requireNonNull(eVar3);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            b0 b0Var = new b0(r0Var);
            applicationContext.registerReceiver(b0Var, intentFilter);
            b0Var.f2673a = applicationContext;
            if (i.c(applicationContext)) {
                return;
            }
            r0Var.a();
            synchronized (b0Var) {
                Context context = b0Var.f2673a;
                if (context != null) {
                    context.unregisterReceiver(b0Var);
                }
                b0Var.f2673a = null;
            }
        } else {
            this.f2733t.h(bVar, this.f2732s.f2725a);
        }
    }
}
