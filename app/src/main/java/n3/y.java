package n3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Context f16597s;

    /* renamed from: t */
    public final /* synthetic */ String f16598t;

    /* renamed from: u */
    public final /* synthetic */ boolean f16599u;

    /* renamed from: v */
    public final /* synthetic */ boolean f16600v;

    public y(Context context, String str, boolean z10, boolean z11) {
        this.f16597s = context;
        this.f16598t = str;
        this.f16599u = z10;
        this.f16600v = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f16597s);
        builder.setMessage(this.f16598t);
        builder.setTitle(this.f16599u ? "Error" : "Info");
        if (this.f16600v) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new x(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
