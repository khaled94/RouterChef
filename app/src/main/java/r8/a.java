package r8;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.widget.Toast;
import androidx.lifecycle.g;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.R;
import i8.g;

/* loaded from: classes.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public c f17281a;

    public a(c cVar) {
        this.f17281a = cVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        g gVar = (g) this.f17281a;
        if (gVar.getClass().getSimpleName().equals("Login") || !gVar.f387v.f1702b.b(g.c.RESUMED)) {
            gVar.N = true;
            return;
        }
        Toast.makeText(gVar, gVar.getString(R.string.disconnectMsg), 1).show();
        Intent intent = new Intent(gVar, Login.class);
        intent.addFlags(67108864);
        gVar.startActivity(intent);
        gVar.N = false;
    }
}
