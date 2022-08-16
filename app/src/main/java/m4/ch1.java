package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.Callable;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ch1 implements eh1<dh1<Bundle>> {

    /* renamed from: a */
    public final uz1 f6985a;

    /* renamed from: b */
    public final Context f6986b;

    public ch1(uz1 uz1Var, Context context) {
        this.f6985a = uz1Var;
        this.f6986b = context;
    }

    public static Bundle b(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i11 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i11 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = i11 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // m4.eh1
    public final tz1<dh1<Bundle>> a() {
        return this.f6985a.Z(new Callable() { // from class: m4.bh1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ch1 ch1Var = ch1.this;
                Objects.requireNonNull(ch1Var);
                String str = (String) jo.f10145d.f10148c.a(es.V3);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        final Bundle b10 = ch1.b(ch1Var.f6986b, new JSONArray(str));
                        return new dh1() { // from class: m4.ah1
                            @Override // m4.dh1
                            public final void h(Object obj) {
                                ((Bundle) obj).putBundle("shared_pref", b10);
                            }
                        };
                    } catch (JSONException e10) {
                        g1.f("JSON parsing error", e10);
                    }
                }
                return null;
            }
        });
    }
}
