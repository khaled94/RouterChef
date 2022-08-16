package q8;

import com.android.billingclient.api.Purchase;
import com.raouf.routerchef.App;
import h2.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class c {

    /* renamed from: a */
    public final /* synthetic */ e f17155a;

    /* renamed from: b */
    public final /* synthetic */ Purchase f17156b;

    public /* synthetic */ c(e eVar, Purchase purchase) {
        this.f17155a = eVar;
        this.f17156b = purchase;
    }

    public final void a(f fVar) {
        e eVar = this.f17155a;
        Purchase purchase = this.f17156b;
        Objects.requireNonNull(eVar);
        if (fVar.f4994a == 0) {
            ((App) eVar.f17158a.getApplication()).a(true);
            a.d(eVar.f17158a, purchase);
        }
    }
}
