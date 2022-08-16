package m4;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eb0 {

    /* renamed from: a */
    public final boolean f7757a;

    /* renamed from: b */
    public final int f7758b;

    /* renamed from: c */
    public final int f7759c;

    /* renamed from: d */
    public final int f7760d;

    /* renamed from: e */
    public final int f7761e;

    /* renamed from: f */
    public final int f7762f;

    /* renamed from: g */
    public final int f7763g;

    /* renamed from: h */
    public final int f7764h;

    /* renamed from: i */
    public final boolean f7765i;

    /* renamed from: j */
    public final int f7766j;

    /* renamed from: k */
    public final boolean f7767k;

    /* renamed from: l */
    public final boolean f7768l;

    /* renamed from: m */
    public final boolean f7769m;

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eb0(java.lang.String r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto Lb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb
            r0.<init>(r3)     // Catch: org.json.JSONException -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            m4.yr<java.lang.Boolean> r3 = m4.es.A
            java.lang.String r1 = "aggressive_media_codec_release"
            boolean r3 = a(r0, r1, r3)
            r2.f7757a = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8094g
            java.lang.String r1 = "byte_buffer_precache_limit"
            int r3 = b(r0, r1, r3)
            r2.f7758b = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8157o
            java.lang.String r1 = "exo_cache_buffer_size"
            int r3 = b(r0, r1, r3)
            r2.f7759c = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8064c
            java.lang.String r1 = "exo_connect_timeout_millis"
            int r3 = b(r0, r1, r3)
            r2.f7760d = r3
            m4.yr<java.lang.String> r3 = m4.es.f8057b
            java.lang.String r1 = "exo_player_version"
            if (r0 == 0) goto L3e
            r0.getString(r1)     // Catch: org.json.JSONException -> L3e
            goto L48
        L3e:
            m4.jo r1 = m4.jo.f10145d
            m4.ds r1 = r1.f10148c
            java.lang.Object r3 = r1.a(r3)
            java.lang.String r3 = (java.lang.String) r3
        L48:
            m4.yr<java.lang.Integer> r3 = m4.es.f8072d
            java.lang.String r1 = "exo_read_timeout_millis"
            int r3 = b(r0, r1, r3)
            r2.f7761e = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8079e
            java.lang.String r1 = "load_check_interval_bytes"
            int r3 = b(r0, r1, r3)
            r2.f7762f = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8087f
            java.lang.String r1 = "player_precache_limit"
            int r3 = b(r0, r1, r3)
            r2.f7763g = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8102h
            java.lang.String r1 = "socket_receive_buffer_size"
            int r3 = b(r0, r1, r3)
            r2.f7764h = r3
            m4.yr<java.lang.Boolean> r3 = m4.es.f8223w2
            java.lang.String r1 = "use_cache_data_source"
            boolean r3 = a(r0, r1, r3)
            r2.f7765i = r3
            m4.yr<java.lang.Integer> r3 = m4.es.f8110i
            java.lang.String r1 = "min_retry_count"
            int r3 = b(r0, r1, r3)
            r2.f7766j = r3
            m4.yr<java.lang.Boolean> r3 = m4.es.f8133l
            java.lang.String r1 = "treat_load_exception_as_non_fatal"
            boolean r3 = a(r0, r1, r3)
            r2.f7767k = r3
            m4.yr<java.lang.Boolean> r3 = m4.es.f8127k1
            java.lang.String r1 = "using_official_simple_exo_player"
            boolean r3 = a(r0, r1, r3)
            r2.f7768l = r3
            m4.yr<java.lang.Boolean> r3 = m4.es.f8135l1
            java.lang.String r1 = "enable_multiple_video_playback"
            boolean r3 = a(r0, r1, r3)
            r2.f7769m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.eb0.<init>(java.lang.String):void");
    }

    public static final boolean a(JSONObject jSONObject, String str, yr<Boolean> yrVar) {
        boolean booleanValue = ((Boolean) jo.f10145d.f10148c.a(yrVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, yr<Integer> yrVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) jo.f10145d.f10148c.a(yrVar)).intValue();
    }
}
