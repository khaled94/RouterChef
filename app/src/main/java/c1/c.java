package c1;

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import s4.x4;
import s4.z4;

/* loaded from: classes.dex */
public final class c implements z4 {

    /* renamed from: s */
    public final Object f2607s;

    public static boolean f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final boolean a(String str) {
        String e10 = e(str);
        return "1".equals(e10) || Boolean.parseBoolean(e10);
    }

    public final Integer b(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return Integer.valueOf(Integer.parseInt(e10));
            } catch (NumberFormatException unused) {
                StringBuilder c10 = a.c("Couldn't parse value of ");
                c10.append(h(str));
                c10.append("(");
                c10.append(e10);
                c10.append(") into an int");
                Log.w("NotificationParams", c10.toString());
                return null;
            }
        }
        return null;
    }

    public final JSONArray c(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return new JSONArray(e10);
            } catch (JSONException unused) {
                StringBuilder c10 = a.c("Malformed JSON for key ");
                c10.append(h(str));
                c10.append(": ");
                c10.append(e10);
                c10.append(", falling back to default");
                Log.w("NotificationParams", c10.toString());
                return null;
            }
        }
        return null;
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e10 = e(str2);
        if (!TextUtils.isEmpty(e10)) {
            return e10;
        }
        String e11 = e(str2 + "_loc_key");
        if (TextUtils.isEmpty(e11)) {
            return null;
        }
        int identifier = resources.getIdentifier(e11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", h(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c10 = c(str2 + "_loc_args");
        if (c10 == null) {
            strArr = null;
        } else {
            int length = c10.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = c10.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e12) {
            StringBuilder c11 = a.c("Missing format argument for ");
            c11.append(h(str2));
            c11.append(": ");
            c11.append(Arrays.toString(strArr));
            c11.append(" Default value will be used.");
            Log.w("NotificationParams", c11.toString(), e12);
            return null;
        }
    }

    public final String e(String str) {
        Object obj = this.f2607s;
        Bundle bundle = (Bundle) obj;
        if (!((Bundle) obj).containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (((Bundle) this.f2607s).containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle((Bundle) this.f2607s);
        for (String str : ((Bundle) this.f2607s).keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* JADX WARN: Finally extract failed */
    @Override // s4.z4
    public final Object zza() {
        x4 x4Var = (x4) this.f2607s;
        Cursor query = x4Var.f18179a.query(x4Var.f18180b, x4.f18178h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            Map aVar = count <= 256 ? new r.a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
