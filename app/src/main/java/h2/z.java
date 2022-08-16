package h2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.b;
import t4.i;
import t4.r;
import t4.t;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a */
    public final h f5048a;

    /* renamed from: b */
    public final x f5049b = null;

    /* renamed from: c */
    public boolean f5050c;

    /* renamed from: d */
    public final /* synthetic */ a0 f5051d;

    public /* synthetic */ z(a0 a0Var, h hVar) {
        this.f5051d = a0Var;
        this.f5048a = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        f c10 = i.c(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                arrayList = new ArrayList();
                if (stringArrayList == null || stringArrayList2 == null) {
                    Purchase h10 = i.h(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                    if (h10 == null) {
                        i.e("BillingHelper", "Couldn't find single purchase data as well.");
                    } else {
                        arrayList.add(h10);
                    }
                } else {
                    i.e("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                    for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                        Purchase h11 = i.h(stringArrayList.get(i10), stringArrayList2.get(i10));
                        if (h11 != null) {
                            arrayList.add(h11);
                        }
                    }
                }
                this.f5048a.b(c10, arrayList);
            }
            arrayList = null;
            this.f5048a.b(c10, arrayList);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            Bundle extras2 = intent.getExtras();
            if (c10.f4994a != 0) {
                h hVar = this.f5048a;
                r rVar = t.f18662t;
                hVar.b(c10, b.f18636w);
            } else if (this.f5049b == null) {
                i.f("BillingBroadcastManager", "AlternativeBillingListener is null.");
                h hVar2 = this.f5048a;
                f fVar = t.f5034i;
                r rVar2 = t.f18662t;
                hVar2.b(fVar, b.f18636w);
            } else if (extras2 == null) {
                i.f("BillingBroadcastManager", "Bundle is null.");
                h hVar3 = this.f5048a;
                f fVar2 = t.f5034i;
                r rVar3 = t.f18662t;
                hVar3.b(fVar2, b.f18636w);
            } else {
                String string = extras2.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                                if (optJSONObject != null) {
                                    arrayList2.add(new y(optJSONObject));
                                }
                            }
                        }
                        this.f5049b.zza();
                        return;
                    } catch (JSONException unused) {
                        i.f("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string));
                        h hVar4 = this.f5048a;
                        f fVar3 = t.f5034i;
                        r rVar4 = t.f18662t;
                        hVar4.b(fVar3, b.f18636w);
                        return;
                    }
                }
                i.f("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                h hVar5 = this.f5048a;
                f fVar4 = t.f5034i;
                r rVar5 = t.f18662t;
                hVar5.b(fVar4, b.f18636w);
            }
        }
    }
}
