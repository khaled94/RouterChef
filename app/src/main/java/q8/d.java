package q8;

import android.os.Bundle;
import android.text.TextUtils;
import b3.n;
import com.android.billingclient.api.SkuDetails;
import com.raouf.routerchef.StorePurchase;
import h2.c;
import h2.f;
import h2.t;
import h2.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import t4.i;

/* loaded from: classes.dex */
public final class d implements h2.d {

    /* renamed from: a */
    public final /* synthetic */ e f17157a;

    public d(e eVar) {
        this.f17157a = eVar;
    }

    @Override // h2.d
    public final void a(f fVar) {
        f fVar2;
        if (fVar.f4994a == 0) {
            e eVar = this.f17157a;
            Objects.requireNonNull(eVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add("sub_one_month");
            arrayList.add("per_3month");
            arrayList.add("per_6month");
            arrayList.add("per_year");
            ArrayList arrayList2 = new ArrayList(arrayList);
            final c cVar = eVar.f17159b;
            final n nVar = new n(eVar);
            if (!cVar.b()) {
                fVar2 = t.f5036k;
            } else if (!TextUtils.isEmpty("subs")) {
                final ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        arrayList3.add(new w(str));
                    } else {
                        throw new IllegalArgumentException("SKU must be set.");
                    }
                }
                if (cVar.h(new Callable() { // from class: h2.b0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str2;
                        int i10;
                        String str3;
                        c cVar2 = c.this;
                        String str4 = r2;
                        List list = arrayList3;
                        n nVar2 = nVar;
                        Objects.requireNonNull(cVar2);
                        ArrayList arrayList4 = new ArrayList();
                        int size = list.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                str2 = "";
                                i10 = 0;
                                break;
                            }
                            int i12 = i11 + 20;
                            ArrayList arrayList5 = new ArrayList(list.subList(i11, i12 > size ? size : i12));
                            ArrayList<String> arrayList6 = new ArrayList<>();
                            int size2 = arrayList5.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                arrayList6.add(((w) arrayList5.get(i13)).f5045a);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("ITEM_ID_LIST", arrayList6);
                            bundle.putString("playBillingLibraryVersion", cVar2.f4963b);
                            try {
                                Bundle O0 = cVar2.f4973l ? cVar2.f4967f.O0(cVar2.f4966e.getPackageName(), str4, bundle, i.b(cVar2.f4970i, cVar2.f4977q, cVar2.f4963b, arrayList5)) : cVar2.f4967f.q1(cVar2.f4966e.getPackageName(), str4, bundle);
                                if (O0 == null) {
                                    str3 = "querySkuDetailsAsync got null sku details list";
                                    break;
                                } else if (!O0.containsKey("DETAILS_LIST")) {
                                    int a10 = i.a(O0, "BillingClient");
                                    str2 = i.d(O0, "BillingClient");
                                    if (a10 != 0) {
                                        i.f("BillingClient", "getSkuDetails() failed. Response code: " + a10);
                                        i10 = a10;
                                    } else {
                                        i.f("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                        i10 = 6;
                                    }
                                } else {
                                    ArrayList<String> stringArrayList = O0.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        str3 = "querySkuDetailsAsync got null response list";
                                        break;
                                    }
                                    for (int i14 = 0; i14 < stringArrayList.size(); i14++) {
                                        try {
                                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i14));
                                            i.e("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                            arrayList4.add(skuDetails);
                                        } catch (JSONException e10) {
                                            i.g("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e10);
                                            str2 = "Error trying to decode SkuDetails.";
                                            i10 = 6;
                                        }
                                    }
                                    i11 = i12;
                                }
                            } catch (Exception e11) {
                                i.g("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e11);
                                str2 = "Service connection is disconnected.";
                                i10 = -1;
                            }
                        }
                        i.f("BillingClient", str3);
                        str2 = "Item is unavailable for purchase.";
                        i10 = 4;
                        arrayList4 = null;
                        f fVar3 = new f();
                        fVar3.f4994a = i10;
                        fVar3.f4995b = str2;
                        nVar2.b(fVar3, arrayList4);
                        return null;
                    }
                }, 30000L, new h2.i(nVar, 0), cVar.d()) != null) {
                    return;
                }
                fVar2 = cVar.f();
            } else {
                i.f("BillingClient", "Please fix the input params. SKU type can't be empty.");
                fVar2 = t.f5030e;
            }
            nVar.b(fVar2, null);
            return;
        }
        StorePurchase storePurchase = (StorePurchase) this.f17157a.f17160c;
        storePurchase.O.setVisibility(8);
        storePurchase.P.setVisibility(0);
    }

    @Override // h2.d
    public final void b() {
        e eVar = this.f17157a;
        eVar.f17159b.c(new d(eVar));
    }
}
