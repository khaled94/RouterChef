package m4;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import n3.g1;

/* loaded from: classes.dex */
public final class k90 {

    /* renamed from: c */
    public static boolean f10301c = false;

    /* renamed from: d */
    public static boolean f10302d = false;

    /* renamed from: a */
    public final List<String> f10304a;

    /* renamed from: b */
    public static final Object f10300b = new Object();

    /* renamed from: e */
    public static final Set<String> f10303e = new HashSet(Arrays.asList(new String[0]));

    public k90() {
        List<String> list;
        if (!d()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f10304a = list;
    }

    public static boolean d() {
        boolean z10;
        synchronized (f10300b) {
            z10 = false;
            if (f10301c && f10302d) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public static void f(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f10303e.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        g1.g("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (!d()) {
            return;
        }
        e("onNetworkRequest", new h90(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
    }

    public final void b(HttpURLConnection httpURLConnection, int i10) {
        if (!d()) {
            return;
        }
        String str = null;
        e("onNetworkResponse", new af(i10, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
        if (i10 >= 200 && i10 < 300) {
            return;
        }
        try {
            str = httpURLConnection.getResponseMessage();
        } catch (IOException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            g1.j(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
        }
        e("onNetworkRequestError", new ul0(str, 1));
    }

    public final void c(String str) {
        if (d() && str != null) {
            e("onNetworkResponseBody", new i90(str.getBytes()));
        }
    }

    public final void e(String str, j90 j90Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.f10304a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            j90Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            g1.h("unable to log", e10);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (k90.class) {
            g1.i("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < stringWriter2.length()) {
                int i11 = i10 + 4000;
                String valueOf = String.valueOf(stringWriter2.substring(i10, Math.min(i11, stringWriter2.length())));
                g1.i(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i10 = i11;
            }
            g1.i("GMA Debug FINISH");
        }
    }
}
