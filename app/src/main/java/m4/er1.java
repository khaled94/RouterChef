package m4;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import d.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class er1 {

    /* renamed from: a */
    public static WindowManager f8045a;

    /* renamed from: b */
    public static final String[] f8046b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f8047c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f8047c);
            jSONObject.put("y", i11 / f8047c);
            jSONObject.put("width", i12 / f8047c);
            jSONObject.put("height", i13 / f8047c);
        } catch (JSONException e10) {
            c.g("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            c.g(sb.toString(), e10);
        }
    }

    public static void d(JSONObject jSONObject) {
        float f10;
        Point point;
        float f11 = 0.0f;
        if (f8045a != null) {
            f8045a.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f12 = f8047c;
            f11 = point.x / f12;
            f10 = point.y / f12;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f11);
            jSONObject.put("height", f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f8046b;
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    String str = strArr[i10];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i10++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (f(optJSONArray, optJSONArray2)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                if (!optJSONArray.optString(i11, "").equals(optJSONArray2.optString(i11, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (f(optJSONArray3, optJSONArray4)) {
                            for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                                if (e(optJSONArray3.optJSONObject(i12), optJSONArray4.optJSONObject(i12))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
