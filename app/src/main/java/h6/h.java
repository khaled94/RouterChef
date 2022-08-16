package h6;

import android.content.Context;
import android.text.TextUtils;
import d4.l;
import d4.m;
import d4.p;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final String f5128a;

    /* renamed from: b */
    public final String f5129b;

    /* renamed from: c */
    public final String f5130c;

    /* renamed from: d */
    public final String f5131d;

    /* renamed from: e */
    public final String f5132e;

    /* renamed from: f */
    public final String f5133f;

    /* renamed from: g */
    public final String f5134g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        m.k(!h4.h.a(str), "ApplicationId must be set.");
        this.f5129b = str;
        this.f5128a = str2;
        this.f5130c = str3;
        this.f5131d = str4;
        this.f5132e = str5;
        this.f5133f = str6;
        this.f5134g = str7;
    }

    public static h a(Context context) {
        p pVar = new p(context);
        String f10 = pVar.f("google_app_id");
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        return new h(f10, pVar.f("google_api_key"), pVar.f("firebase_database_url"), pVar.f("ga_trackingId"), pVar.f("gcm_defaultSenderId"), pVar.f("google_storage_bucket"), pVar.f("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f5129b, hVar.f5129b) && l.a(this.f5128a, hVar.f5128a) && l.a(this.f5130c, hVar.f5130c) && l.a(this.f5131d, hVar.f5131d) && l.a(this.f5132e, hVar.f5132e) && l.a(this.f5133f, hVar.f5133f) && l.a(this.f5134g, hVar.f5134g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5129b, this.f5128a, this.f5130c, this.f5131d, this.f5132e, this.f5133f, this.f5134g});
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a("applicationId", this.f5129b);
        aVar.a("apiKey", this.f5128a);
        aVar.a("databaseUrl", this.f5130c);
        aVar.a("gcmSenderId", this.f5132e);
        aVar.a("storageBucket", this.f5133f);
        aVar.a("projectId", this.f5134g);
        return aVar.toString();
    }
}
