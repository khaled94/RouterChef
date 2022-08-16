package n3;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.gm1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s0 {
    public static Bundle a(JSONObject jSONObject) {
        String valueOf;
        String str;
        String str2;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i10 = 0;
                        Object obj = null;
                        for (int i11 = 0; obj == null && i11 < length; i11++) {
                            obj = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                        }
                        if (obj == null) {
                            valueOf = String.valueOf(next);
                            str = "Expected JSONArray with at least 1 non-null element for key:";
                            if (valueOf.length() == 0) {
                                str2 = new String(str);
                            }
                            str2 = str.concat(valueOf);
                        } else if (obj instanceof JSONObject) {
                            Parcelable[] parcelableArr = new Bundle[length];
                            while (i10 < length) {
                                parcelableArr[i10] = !jSONArray.isNull(i10) ? a(jSONArray.optJSONObject(i10)) : null;
                                i10++;
                            }
                            bundle.putParcelableArray(next, parcelableArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i10 < length) {
                                dArr[i10] = jSONArray.optDouble(i10);
                                i10++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i10 < length) {
                                strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                i10++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i10 < length) {
                                zArr[i10] = jSONArray.optBoolean(i10);
                                i10++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            str2 = String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                        }
                        g1.j(str2);
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) opt));
                } else {
                    valueOf = String.valueOf(next);
                    str = "Unsupported type for key:";
                    if (valueOf.length() == 0) {
                        str2 = new String(str);
                        g1.j(str2);
                    }
                    str2 = str.concat(valueOf);
                    g1.j(str2);
                }
            }
        }
        return bundle;
    }

    public static List<String> b(JSONArray jSONArray, List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                list.add(jSONArray.getString(i10));
            }
        }
        return list;
    }

    public static List<String> c(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray d(JsonReader jsonReader) {
        Object d5;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                d5 = d(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                d5 = f(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (!JsonToken.STRING.equals(peek)) {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            } else {
                d5 = jsonReader.nextString();
            }
            jSONArray.put(d5);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject e(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject f(JsonReader jsonReader) {
        Object d5;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                d5 = d(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                d5 = f(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (!JsonToken.STRING.equals(peek)) {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            } else {
                d5 = jsonReader.nextString();
            }
            jSONObject.put(nextName, d5);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void g(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h(jsonWriter, (JSONObject) obj);
                } else if (!(obj instanceof JSONArray)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                } else {
                    g(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static void h(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h(jsonWriter.name(next), (JSONObject) obj);
                } else if (!(obj instanceof JSONArray)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                } else {
                    g(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static boolean i(JSONObject jSONObject, String... strArr) {
        JSONObject k10 = k(jSONObject, strArr);
        if (k10 == null) {
            return false;
        }
        return k10.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String j(gm1 gm1Var) {
        if (gm1Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            l(jsonWriter, gm1Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            g1.h("Error when writing JSON.", e10);
            return null;
        }
    }

    public static JSONObject k(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
        }
        return jSONObject;
    }

    public static void l(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof gm1) {
            h(jsonWriter, ((gm1) obj).f8969d);
        } else if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (Object obj2 : (List) obj) {
                l(jsonWriter, obj2);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    l(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        }
    }
}
