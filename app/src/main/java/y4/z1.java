package y4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class z1 extends BroadcastReceiver {

    /* renamed from: a */
    public final a6 f20831a;

    /* renamed from: b */
    public boolean f20832b;

    /* renamed from: c */
    public boolean f20833c;

    public z1(a6 a6Var) {
        this.f20831a = a6Var;
    }

    public final void a() {
        this.f20831a.e();
        this.f20831a.B().g();
        this.f20831a.B().g();
        if (this.f20832b) {
            this.f20831a.C().F.a("Unregistering connectivity change receiver");
            this.f20832b = false;
            this.f20833c = false;
            try {
                this.f20831a.D.f20786s.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f20831a.C().f20710x.b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f20831a.e();
        String action = intent.getAction();
        this.f20831a.C().F.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            x1 x1Var = this.f20831a.f20293t;
            a6.I(x1Var);
            boolean l10 = x1Var.l();
            if (this.f20833c == l10) {
                return;
            }
            this.f20833c = l10;
            this.f20831a.B().q(new y1(this, l10));
            return;
        }
        this.f20831a.C().A.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
