package i8;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.App;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.R;
import f3.d;
import f8.e2;
import h8.f;
import m4.zf2;
import o8.a;
import r8.c;

/* loaded from: classes.dex */
public abstract class g extends a implements f, c {
    public int M = 0;
    public boolean N = false;
    public final Handler O = new Handler(Looper.getMainLooper());
    public m P;
    public d Q;
    public AdView R;
    public a S;
    public zf2 T;
    public String U;
    public ConnectivityManager V;
    public NetworkRequest W;

    public void O(String str) {
        P();
        this.O.post(new e2(this, str, 1));
    }

    public void P() {
    }

    @Override // androidx.fragment.app.t, androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Q = new d(new d.a());
        zf2 zf2Var = ((App) getApplication()).f3511t;
        this.T = zf2Var;
        this.S = (a) zf2Var.f16191s;
        this.U = (String) zf2Var.f16193u;
        this.V = (ConnectivityManager) getSystemService("connectivity");
        this.W = new NetworkRequest.Builder().build();
        this.V.registerNetworkCallback(this.W, new r8.a(this));
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // e.e, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        m.e(this.P);
        super.onStop();
    }

    @Override // h8.f
    public final void q() {
        if (getClass().getSimpleName().equals("Login") || !this.N) {
            return;
        }
        Toast.makeText(this, getString(R.string.disconnectMsg), 1).show();
        Intent intent = new Intent(this, Login.class);
        intent.addFlags(67108864);
        startActivity(intent);
    }
}
