package m4;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import f3.k;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class v11 extends ba {

    /* renamed from: s */
    public final x11 f14561s;

    /* renamed from: t */
    public final fk0 f14562t;

    /* renamed from: u */
    public final Map<Long, s11> f14563u = new HashMap();

    public v11(x11 x11Var, fk0 fk0Var) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        this.f14561s = x11Var;
        this.f14562t = fk0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static jn N3(Map<String, String> map) {
        char c10;
        kn knVar = new kn();
        String str = map.get("ad_request");
        if (str == null) {
            return knVar.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        knVar.f10495a = bundle;
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        knVar.f10496b = arrayList;
                        break;
                    case 2:
                        knVar.f10497c = jsonReader.nextBoolean();
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            knVar.f10498d = 0;
                            break;
                        } else {
                            knVar.f10498d = 1;
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            knVar.f10502h = 0;
                            break;
                        } else {
                            knVar.f10502h = 1;
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!k.f4512b.contains(nextString)) {
                            break;
                        } else {
                            knVar.f10503i = nextString;
                            break;
                        }
                    case 6:
                        knVar.f10505k = jsonReader.nextInt();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            g1.e("Ad Request json was malformed, parsing ended early.");
        }
        jn a10 = knVar.a();
        Bundle bundle2 = a10.E.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = a10.f10130u;
            a10.E.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new jn(a10.f10128s, a10.f10129t, bundle2, a10.f10131v, a10.f10132w, a10.f10133x, a10.y, a10.f10134z, a10.A, a10.B, a10.C, a10.D, a10.E, a10.F, a10.G, a10.H, a10.I, a10.J, a10.K, a10.L, a10.M, a10.N, a10.O, a10.P);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r5.equals("create_interstitial_ad") != false) goto L44;
     */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap, java.util.Map<java.lang.Long, m4.s11>] */
    @Override // m4.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M3(int r18, android.os.Parcel r19, android.os.Parcel r20) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.v11.M3(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
