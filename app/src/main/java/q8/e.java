package q8;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import f8.i2;
import h2.a;
import h2.c;
import h2.d0;
import h2.f;
import h2.t;
import java.util.Objects;
import java.util.concurrent.Callable;
import t4.i;
import t4.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public Activity f17158a;

    /* renamed from: b */
    public c f17159b;

    /* renamed from: c */
    public b f17160c;

    public e(Activity activity, b bVar) {
        this.f17158a = activity;
        this.f17160c = bVar;
        i2 i2Var = new i2(this);
        if (activity != null) {
            c cVar = new c(true, activity, i2Var);
            this.f17159b = cVar;
            cVar.c(new d(this));
            return;
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public final void a(Purchase purchase) {
        f fVar;
        String a10 = purchase.a();
        if (a10 != null) {
            final a aVar = new a();
            aVar.f4955s = a10;
            final c cVar = this.f17159b;
            final c cVar2 = new c(this, purchase);
            if (!cVar.b()) {
                fVar = t.f5036k;
            } else if (TextUtils.isEmpty(aVar.f4955s)) {
                i.f("BillingClient", "Please provide a valid purchase token.");
                fVar = t.f5033h;
            } else if (cVar.f4972k) {
                if (cVar.h(new Callable() { // from class: h2.c0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f fVar2;
                        c cVar3 = c.this;
                        a aVar2 = aVar;
                        q8.c cVar4 = cVar2;
                        Objects.requireNonNull(cVar3);
                        try {
                            l lVar = cVar3.f4967f;
                            String packageName = cVar3.f4966e.getPackageName();
                            String str = aVar2.f4955s;
                            String str2 = cVar3.f4963b;
                            int i10 = i.f18651a;
                            Bundle bundle = new Bundle();
                            bundle.putString("playBillingLibraryVersion", str2);
                            Bundle b1 = lVar.b1(packageName, str, bundle);
                            int a11 = i.a(b1, "BillingClient");
                            String d5 = i.d(b1, "BillingClient");
                            fVar2 = new f();
                            fVar2.f4994a = a11;
                            fVar2.f4995b = d5;
                        } catch (Exception e10) {
                            i.g("BillingClient", "Error acknowledge purchase!", e10);
                            fVar2 = t.f5036k;
                        }
                        cVar4.a(fVar2);
                        return null;
                    }
                }, 30000L, new d0(cVar2, 0), cVar.d()) == null) {
                    fVar = cVar.f();
                }
                StringBuilder c10 = androidx.activity.result.a.c("Purchase Token: ");
                c10.append(purchase.a());
                Log.d("SubTest1", c10.toString());
                Log.d("SubTest1", "Purchase Time: " + purchase.f2897c.optLong("purchaseTime"));
                Log.d("SubTest1", "Purchase OrderID: " + purchase.f2897c.optString("orderId"));
                return;
            } else {
                fVar = t.f5027b;
            }
            cVar2.a(fVar);
            StringBuilder c102 = androidx.activity.result.a.c("Purchase Token: ");
            c102.append(purchase.a());
            Log.d("SubTest1", c102.toString());
            Log.d("SubTest1", "Purchase Time: " + purchase.f2897c.optLong("purchaseTime"));
            Log.d("SubTest1", "Purchase OrderID: " + purchase.f2897c.optString("orderId"));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }
}
