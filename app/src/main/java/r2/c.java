package r2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import g1.y;
import j7.d;
import j7.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s2.f;
import s2.g;
import s2.i;
import s2.j;
import s2.k;
import s2.o;
import s2.p;
import t2.m;
import u2.f;
import u2.h;
import u2.n;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a */
    public final d f17235a;

    /* renamed from: b */
    public final ConnectivityManager f17236b;

    /* renamed from: c */
    public final Context f17237c;

    /* renamed from: e */
    public final d3.a f17239e;

    /* renamed from: f */
    public final d3.a f17240f;

    /* renamed from: d */
    public final URL f17238d = c(r2.a.f17227c);

    /* renamed from: g */
    public final int f17241g = 40000;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final URL f17242a;

        /* renamed from: b */
        public final j f17243b;

        /* renamed from: c */
        public final String f17244c;

        public a(URL url, j jVar, String str) {
            this.f17242a = url;
            this.f17243b = jVar;
            this.f17244c = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f17245a;

        /* renamed from: b */
        public final URL f17246b;

        /* renamed from: c */
        public final long f17247c;

        public b(int i10, URL url, long j3) {
            this.f17245a = i10;
            this.f17246b = url;
            this.f17247c = j3;
        }
    }

    public c(Context context, d3.a aVar, d3.a aVar2) {
        e eVar = new e();
        s2.b.f17595a.a(eVar);
        eVar.f5484d = true;
        this.f17235a = new d(eVar);
        this.f17237c = context;
        this.f17236b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f17239e = aVar2;
        this.f17240f = aVar;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(d7.a.c("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(1:4)(1:5)|6|(1:8)(7:9|(1:11)(1:12)|15|21|16|19|20)|14|15|21|16|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008e, code lost:
        if (s2.o.a.f17676v.get(r0) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
        y2.a.c("CctTransportBackend", "Unable to find version code for package", r0);
     */
    @Override // u2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t2.n a(t2.n r5) {
        /*
            r4 = this;
            android.net.ConnectivityManager r0 = r4.f17236b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            t2.n$a r5 = r5.j()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "sdk-version"
            r5.a(r2, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "model"
            r5.b(r2, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r2 = "hardware"
            r5.b(r2, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r2 = "device"
            r5.b(r2, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r2 = "product"
            r5.b(r2, r1)
            java.lang.String r1 = android.os.Build.ID
            java.lang.String r2 = "os-uild"
            r5.b(r2, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "manufacturer"
            r5.b(r2, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r2 = "fingerprint"
            r5.b(r2, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r2)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map r3 = r5.d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r3.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L6c
            s2.o$b r2 = s2.o.b.NONE
            r2 = r1
            goto L70
        L6c:
            int r2 = r0.getType()
        L70:
            java.lang.String r3 = "net-type"
            r5.a(r3, r2)
            r2 = 0
            if (r0 != 0) goto L7b
            s2.o$a r0 = s2.o.a.UNKNOWN_MOBILE_SUBTYPE
            goto L91
        L7b:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L86
            s2.o$a r0 = s2.o.a.COMBINED
            r0 = 100
            goto L92
        L86:
            android.util.SparseArray<s2.o$a> r3 = s2.o.a.f17676v
            java.lang.Object r3 = r3.get(r0)
            s2.o$a r3 = (s2.o.a) r3
            if (r3 == 0) goto L91
            goto L92
        L91:
            r0 = r2
        L92:
            java.lang.String r3 = "mobile-subtype"
            r5.a(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r5.b(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r5.b(r3, r0)
            android.content.Context r0 = r4.f17237c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.lang.String r3 = "mcc_mnc"
            r5.b(r3, r0)
            android.content.Context r0 = r4.f17237c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            int r1 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld5
            goto Ldd
        Ld5:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            y2.a.c(r2, r3, r0)
        Ldd:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r5.b(r1, r0)
            t2.n r5 = r5.c()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.c.a(t2.n):t2.n");
    }

    @Override // u2.n
    public final h b(f fVar) {
        String str;
        Object a10;
        String str2;
        Integer num;
        f.a aVar;
        HashMap hashMap = new HashMap();
        u2.a aVar2 = (u2.a) fVar;
        for (t2.n nVar : aVar2.f19053a) {
            String h10 = nVar.h();
            if (!hashMap.containsKey(h10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar);
                hashMap.put(h10, arrayList);
            } else {
                ((List) hashMap.get(h10)).add(nVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            t2.n nVar2 = (t2.n) ((List) entry.getValue()).get(0);
            p pVar = p.DEFAULT;
            Long valueOf = Long.valueOf(this.f17240f.a());
            Long valueOf2 = Long.valueOf(this.f17239e.a());
            s2.e eVar = new s2.e(k.a.ANDROID_FIREBASE, new s2.c(Integer.valueOf(nVar2.g("sdk-version")), nVar2.b("model"), nVar2.b("hardware"), nVar2.b("device"), nVar2.b("product"), nVar2.b("os-uild"), nVar2.b("manufacturer"), nVar2.b("fingerprint"), nVar2.b("locale"), nVar2.b("country"), nVar2.b("mcc_mnc"), nVar2.b("application_build")));
            try {
                str2 = null;
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                num = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                t2.n nVar3 = (t2.n) it2.next();
                m e10 = nVar3.e();
                Iterator it3 = it;
                q2.b bVar = e10.f18540a;
                Iterator it4 = it2;
                if (bVar.equals(new q2.b("proto"))) {
                    byte[] bArr = e10.f18541b;
                    aVar = new f.a();
                    aVar.f17658d = bArr;
                } else if (bVar.equals(new q2.b("json"))) {
                    String str3 = new String(e10.f18541b, Charset.forName("UTF-8"));
                    aVar = new f.a();
                    aVar.f17659e = str3;
                } else {
                    String d5 = y2.a.d("CctTransportBackend");
                    if (Log.isLoggable(d5, 5)) {
                        Log.w(d5, String.format("Received event of unsupported encoding %s. Skipping...", bVar));
                    }
                    it2 = it4;
                    it = it3;
                }
                aVar.f17655a = Long.valueOf(nVar3.f());
                aVar.f17657c = Long.valueOf(nVar3.i());
                String str4 = nVar3.c().get("tz-offset");
                aVar.f17660f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar.f17661g = new i(o.b.f17680t.get(nVar3.g("net-type")), o.a.f17676v.get(nVar3.g("mobile-subtype")));
                if (nVar3.d() != null) {
                    aVar.f17656b = nVar3.d();
                }
                String str5 = aVar.f17655a == null ? " eventTimeMs" : "";
                if (aVar.f17657c == null) {
                    str5 = d7.a.c(str5, " eventUptimeMs");
                }
                if (aVar.f17660f == null) {
                    str5 = d7.a.c(str5, " timezoneOffsetSeconds");
                }
                if (str5.isEmpty()) {
                    arrayList3.add(new s2.f(aVar.f17655a.longValue(), aVar.f17656b, aVar.f17657c.longValue(), aVar.f17658d, aVar.f17659e, aVar.f17660f.longValue(), aVar.f17661g));
                    it2 = it4;
                    it = it3;
                } else {
                    throw new IllegalStateException(d7.a.c("Missing required properties:", str5));
                }
            }
            Iterator it5 = it;
            String str6 = valueOf == null ? " requestTimeMs" : "";
            if (valueOf2 == null) {
                str6 = d7.a.c(str6, " requestUptimeMs");
            }
            if (str6.isEmpty()) {
                arrayList2.add(new g(valueOf.longValue(), valueOf2.longValue(), eVar, num, str2, arrayList3, pVar, null));
                it = it5;
            } else {
                throw new IllegalStateException(d7.a.c("Missing required properties:", str6));
            }
        }
        int i10 = 5;
        s2.d dVar = new s2.d(arrayList2);
        URL url = this.f17238d;
        if (aVar2.f19054b != null) {
            try {
                r2.a a11 = r2.a.a(((u2.a) fVar).f19054b);
                str = a11.f17231b;
                if (str == null) {
                    str = null;
                }
                String str7 = a11.f17230a;
                if (str7 != null) {
                    url = c(str7);
                }
            } catch (IllegalArgumentException unused2) {
                return h.a();
            }
        } else {
            str = null;
        }
        try {
            a aVar3 = new a(url, dVar, str);
            y yVar = new y(this);
            do {
                a10 = yVar.a(aVar3);
                b bVar2 = (b) a10;
                URL url2 = bVar2.f17246b;
                if (url2 != null) {
                    y2.a.a("CctTransportBackend", "Following redirect to: %s", url2);
                    aVar3 = new a(bVar2.f17246b, aVar3.f17243b, aVar3.f17244c);
                } else {
                    aVar3 = null;
                }
                if (aVar3 == null) {
                    break;
                }
                i10--;
            } while (i10 >= 1);
            b bVar3 = (b) a10;
            int i11 = bVar3.f17245a;
            if (i11 == 200) {
                return new u2.b(1, bVar3.f17247c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return new u2.b(4, -1L);
                }
                return h.a();
            }
            return new u2.b(2, -1L);
        } catch (IOException e11) {
            y2.a.c("CctTransportBackend", "Could not make request to the backend", e11);
            return new u2.b(2, -1L);
        }
    }
}
