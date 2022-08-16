package f8;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.raouf.routerchef.StorePurchase;
import j8.b;
import j8.c;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4651s;

    /* renamed from: t */
    public final /* synthetic */ Object f4652t;

    /* renamed from: u */
    public final /* synthetic */ Object f4653u;

    public /* synthetic */ m2(Object obj, Object obj2, int i10) {
        this.f4651s = i10;
        this.f4652t = obj;
        this.f4653u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4651s) {
            case 0:
                StorePurchase storePurchase = (StorePurchase) this.f4652t;
                List list = (List) this.f4653u;
                int i10 = StorePurchase.R;
                Objects.requireNonNull(storePurchase);
                Collections.sort(list, n2.f4661s);
                o2 o2Var = new o2(storePurchase, storePurchase, list);
                storePurchase.N = o2Var;
                storePurchase.M.setAdapter(o2Var);
                storePurchase.M.setLayoutManager(new LinearLayoutManager(1));
                storePurchase.O.setVisibility(8);
                storePurchase.P.setVisibility(8);
                return;
            default:
                b bVar = (b) this.f4652t;
                InetAddress inetAddress = (InetAddress) this.f4653u;
                Objects.requireNonNull(bVar);
                try {
                    if (!inetAddress.isReachable(3000)) {
                        return;
                    }
                    bVar.f5497d++;
                    bVar.f5496c.add(new c(inetAddress.getHostAddress()));
                    bVar.f5495b.y(inetAddress.getHostAddress());
                    return;
                } catch (IOException e10) {
                    bVar.f5495b.l(e10.getMessage());
                    return;
                }
        }
    }
}
