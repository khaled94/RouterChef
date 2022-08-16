package m4;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
import m3.n;

/* loaded from: classes.dex */
public final class b71 extends TimerTask {

    /* renamed from: s */
    public final /* synthetic */ AlertDialog f6409s;

    /* renamed from: t */
    public final /* synthetic */ Timer f6410t;

    /* renamed from: u */
    public final /* synthetic */ n f6411u;

    public b71(AlertDialog alertDialog, Timer timer, n nVar) {
        this.f6409s = alertDialog;
        this.f6410t = timer;
        this.f6411u = nVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f6409s.dismiss();
        this.f6410t.cancel();
        n nVar = this.f6411u;
        if (nVar != null) {
            nVar.a();
        }
    }
}
