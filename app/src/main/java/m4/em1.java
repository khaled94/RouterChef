package m4;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.Collections;
import java.util.List;
import n3.s0;

/* loaded from: classes.dex */
public final class em1 {

    /* renamed from: a */
    public final List<String> f8003a;

    /* renamed from: b */
    public final String f8004b;

    /* renamed from: c */
    public final int f8005c;

    /* renamed from: d */
    public final String f8006d;

    /* renamed from: e */
    public final int f8007e;

    /* renamed from: f */
    public final long f8008f;

    /* renamed from: g */
    public final boolean f8009g;

    /* renamed from: h */
    public final String f8010h;

    /* renamed from: i */
    public final rb1 f8011i;

    public em1(JsonReader jsonReader) {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i10 = 0;
        String str = "";
        long j3 = 0;
        rb1 rb1Var = null;
        int i11 = 0;
        boolean z10 = false;
        String str2 = str;
        String str3 = str2;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = s0.c(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j3 = jsonReader.nextLong();
            } else {
                if (((Boolean) jo.f10145d.f10148c.a(es.f8210u5)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    rb1Var = new rb1(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f8003a = emptyList;
        this.f8005c = i10;
        this.f8004b = str2;
        this.f8006d = str3;
        this.f8007e = i11;
        this.f8008f = j3;
        this.f8011i = rb1Var;
        this.f8009g = z10;
        this.f8010h = str;
    }
}
