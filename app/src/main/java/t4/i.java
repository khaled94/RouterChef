package t4;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import h2.f;
import h2.w;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final int f18651a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            str2 = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                e(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                str2 = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
            }
        }
        f(str, str2);
        return 6;
    }

    public static Bundle b(int i10, boolean z10, String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i10 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i10 >= 9 && z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i10 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z11 = false;
            boolean z12 = false;
            for (int i11 = 0; i11 < size; i11++) {
                w wVar = (w) arrayList.get(i11);
                arrayList2.add(null);
                z11 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z12 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z11) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z12) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static f c(Intent intent, String str) {
        if (intent == null) {
            f("BillingHelper", "Got null intent!");
            f fVar = new f();
            fVar.f4994a = 6;
            fVar.f4995b = "An internal error occurred.";
            return fVar;
        }
        int a10 = a(intent.getExtras(), str);
        String d5 = d(intent.getExtras(), str);
        f fVar2 = new f();
        fVar2.f4994a = a10;
        fVar2.f4995b = d5;
        return fVar2;
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            e(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            f(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i10 -= min;
            }
        }
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static Purchase h(String str, String str2) {
        if (str == null || str2 == null) {
            e("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            f("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
